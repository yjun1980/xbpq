/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.d0.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeConsole;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.commonjs.module.Require;
import org.mozilla.javascript.commonjs.module.RequireBuilder;
import org.mozilla.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;
import org.mozilla.javascript.serialize.ScriptableOutputStream;
import org.mozilla.javascript.tools.ToolErrorReporter;
import org.mozilla.javascript.tools.shell.Environment;
import org.mozilla.javascript.tools.shell.Main;
import org.mozilla.javascript.tools.shell.PipeThread;
import org.mozilla.javascript.tools.shell.QuitAction;
import org.mozilla.javascript.tools.shell.Runner;
import org.mozilla.javascript.tools.shell.ShellConsole;
import org.mozilla.javascript.tools.shell.ShellConsolePrinter;

public class Global
extends ImporterTopLevel {
    static final long serialVersionUID = 4029130780977538005L;
    boolean attemptedJLineLoad;
    private ShellConsole console;
    private HashMap<String, String> doctestCanonicalizations;
    private PrintStream errStream;
    NativeArray history;
    private InputStream inStream;
    boolean initialized;
    private PrintStream outStream;
    private String[] prompts = new String[]{"js> ", "  > "};
    private QuitAction quitAction;
    private boolean sealedStdLib = false;

    public Global() {
    }

    public Global(Context context) {
        this.init(context);
    }

    public static /* synthetic */ Object a(Global global, Context context) {
        return global.lambda$init$0(context);
    }

    public static void defineClass(Context clazz, Scriptable scriptable, Object[] objectArray, Function function) {
        clazz = Global.getClass(objectArray);
        if (Scriptable.class.isAssignableFrom(clazz)) {
            ScriptableObject.defineClass(scriptable, clazz);
            return;
        }
        throw Global.reportRuntimeError("msg.must.implement.Scriptable");
    }

    /*
     * Exception decompiling
     */
    public static Object deserialize(Context var0, Scriptable var1_2, Object[] var2_5, Function var3_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Object doPrint(Object[] objectArray, Function object, boolean bl) {
        object = Global.getInstance((Function)object).getOut();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            if (i2 > 0) {
                ((PrintStream)object).print(" ");
            }
            ((PrintStream)object).print(Context.toString(objectArray[i2]));
        }
        if (bl) {
            ((PrintStream)object).println();
        }
        return Context.getUndefinedValue();
    }

    public static Object doctest(Context context, Scriptable object, Object[] object2, Function function) {
        if (((Object[])object2).length == 0) {
            return Boolean.FALSE;
        }
        object = Context.toString(object2[0]);
        object2 = Global.getInstance(function);
        return ((Global)object2).runDoctest(context, (Scriptable)object2, (String)object, null, 0);
    }

    private boolean doctestOutputMatches(String object, String object2) {
        String string;
        if (((String)(object = ((String)object).trim())).equals(string = ((String)object2).trim().replace("\r\n", "\n"))) {
            return true;
        }
        for (Map.Entry<String, String> object32 : this.doctestCanonicalizations.entrySet()) {
            object = ((String)object).replace(object32.getKey(), object32.getValue());
        }
        if (((String)object).equals(string)) {
            return true;
        }
        object2 = Pattern.compile("@[0-9a-fA-F]+");
        Matcher matcher = ((Pattern)object2).matcher((CharSequence)object);
        Matcher matcher2 = ((Pattern)object2).matcher(string);
        do {
            if (!matcher.find()) {
                return false;
            }
            if (!matcher2.find()) {
                return false;
            }
            if (matcher2.start() != matcher.start()) {
                return false;
            }
            int n2 = matcher.start();
            if (!((String)object).substring(0, n2).equals(string.substring(0, n2))) {
                return false;
            }
            object2 = matcher.group();
            String string2 = matcher2.group();
            String string3 = this.doctestCanonicalizations.get(object2);
            if (string3 == null) {
                this.doctestCanonicalizations.put((String)object2, string2);
                object2 = ((String)object).replace((CharSequence)object2, string2);
            } else {
                object2 = object;
                if (!string2.equals(string3)) {
                    return false;
                }
            }
            object = object2;
        } while (!((String)object2).equals(string));
        return true;
    }

    public static void gc(Context context, Scriptable scriptable, Object[] objectArray, Function function) {
        System.gc();
    }

    private static String getCharCodingFromType(String string) {
        int n2 = string.indexOf(59);
        if (n2 >= 0) {
            int n3 = string.length();
            while (++n2 != n3 && string.charAt(n2) <= ' ') {
            }
            if ("charset".regionMatches(true, 0, string, n2, 7)) {
                n2 += 7;
                while (n2 != n3 && string.charAt(n2) <= ' ') {
                    ++n2;
                }
                if (n2 != n3 && string.charAt(n2) == '=') {
                    int n4;
                    while ((n4 = n2 + 1) != n3 && string.charAt(n4) <= ' ') {
                        n2 = n4;
                    }
                    if (n4 != n3) {
                        n2 = n3;
                        while (string.charAt(n2 - 1) <= ' ') {
                            --n2;
                        }
                        return string.substring(n4, n2);
                    }
                }
            }
        }
        return null;
    }

    private static Class<?> getClass(Object[] object) {
        if (((Object[])object).length != 0) {
            Class<?> clazz = object[0];
            if (clazz instanceof Wrapper && (clazz = ((Wrapper)((Object)clazz)).unwrap()) instanceof Class) {
                return clazz;
            }
            object = Context.toString(object[0]);
            try {
                clazz = Class.forName((String)object);
                return clazz;
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw Global.reportRuntimeError("msg.class.not.found", (String)object);
            }
        }
        throw Global.reportRuntimeError("msg.expected.string.arg");
    }

    private static Global getInstance(Function scriptable) {
        if ((scriptable = scriptable.getParentScope()) instanceof Global) {
            return (Global)scriptable;
        }
        throw Global.reportRuntimeError("msg.bad.shell.function.scope", String.valueOf(scriptable));
    }

    public static void help(Context context, Scriptable scriptable, Object[] objectArray, Function function) {
        Global.getInstance(function).getOut().println(ToolErrorReporter.getMessage("msg.help"));
    }

    private /* synthetic */ Object lambda$init$0(Context context) {
        this.init(context);
        return null;
    }

    public static void load(Context context, Scriptable scriptable, Object[] objectArray, Function object) {
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = Context.toString(objectArray[i2]);
            try {
                Main.processFile(context, scriptable, (String)object);
                continue;
            }
            catch (VirtualMachineError virtualMachineError) {
                virtualMachineError.printStackTrace();
                throw Context.reportRuntimeError(ToolErrorReporter.getMessage("msg.uncaughtJSException", ((Object)virtualMachineError).toString()));
            }
            catch (IOException iOException) {
                throw Context.reportRuntimeError(ToolErrorReporter.getMessage("msg.couldnt.read.source", object, iOException.getMessage()));
            }
        }
    }

    public static void loadClass(Context context, Scriptable scriptable, Object[] object, Function function) {
        if (Script.class.isAssignableFrom((Class<?>)(object = Global.getClass((Object[])object)))) {
            ((Script)((Class)object).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).exec(context, scriptable);
            return;
        }
        throw Global.reportRuntimeError("msg.must.implement.Script");
    }

    private boolean loadJLine(Charset charset) {
        boolean bl = this.attemptedJLineLoad;
        boolean bl2 = true;
        if (!bl) {
            this.attemptedJLineLoad = true;
            this.console = ShellConsole.getConsole(this, charset);
        }
        if (this.console == null) {
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    static void pipe(boolean var0, InputStream var1_1, OutputStream var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[UNCONDITIONALDOLOOP]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static Object print(Context context, Scriptable scriptable, Object[] objectArray, Function function) {
        return Global.doPrint(objectArray, function, true);
    }

    public static void quit(Context context, Scriptable scriptable, Object[] objectArray, Function function) {
        scriptable = Global.getInstance(function);
        if (((Global)scriptable).quitAction != null) {
            int n2 = objectArray.length;
            int n3 = 0;
            if (n2 != 0) {
                n3 = ScriptRuntime.toInt32(objectArray[0]);
            }
            ((Global)scriptable).quitAction.quit(context, n3);
        }
    }

    public static Object readFile(Context object, Scriptable object2, Object[] objectArray, Function function) {
        if (objectArray.length != 0) {
            object2 = ScriptRuntime.toString(objectArray[0]);
            object = null;
            if (objectArray.length >= 2) {
                object = ScriptRuntime.toString(objectArray[1]);
            }
            return Global.readUrl((String)object2, (String)object, true);
        }
        throw Global.reportRuntimeError("msg.shell.readFile.bad.args");
    }

    private static String readReader(Reader reader) {
        return Global.readReader(reader, 4096);
    }

    private static String readReader(Reader reader, int n2) {
        char[] cArray = new char[n2];
        n2 = 0;
        int n3;
        while ((n3 = reader.read(cArray, n2, cArray.length - n2)) >= 0) {
            n2 = n3 = n2 + n3;
            if (n3 != cArray.length) continue;
            char[] cArray2 = new char[cArray.length * 2];
            System.arraycopy(cArray, 0, cArray2, 0, n3);
            cArray = cArray2;
            n2 = n3;
        }
        return new String(cArray, 0, n2);
    }

    public static Object readUrl(Context object, Scriptable object2, Object[] objectArray, Function function) {
        if (objectArray.length != 0) {
            object2 = ScriptRuntime.toString(objectArray[0]);
            object = null;
            if (objectArray.length >= 2) {
                object = ScriptRuntime.toString(objectArray[1]);
            }
            return Global.readUrl((String)object2, (String)object, false);
        }
        throw Global.reportRuntimeError("msg.shell.readUrl.bad.args");
    }

    /*
     * Exception decompiling
     */
    private static String readUrl(String var0, String var1_2, boolean var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static Object readline(Context object, Scriptable scriptable, Object[] objectArray, Function function) {
        object = Global.getInstance(function);
        int n2 = objectArray.length;
        object = ((Global)object).console;
        if (n2 > 0) {
            return ((ShellConsole)object).readLine(Context.toString(objectArray[0]));
        }
        return ((ShellConsole)object).readLine();
    }

    static RuntimeException reportRuntimeError(String string) {
        return Context.reportRuntimeError(ToolErrorReporter.getMessage(string));
    }

    static RuntimeException reportRuntimeError(String string, String string2) {
        return Context.reportRuntimeError(ToolErrorReporter.getMessage(string, string2));
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object runCommand(Context object, Scriptable objectArray, Object[] objectArray2, Function object2) {
        void var13_28;
        void var12_21;
        void var3_6;
        void var16_61;
        void var10_56;
        void var9_46;
        Object object3;
        Object object4;
        Object object5;
        Object[] objectArray3;
        Object object6;
        int n2;
        int n3;
        block28: {
            Object object7;
            Object object8;
            Object object9;
            Object object10;
            Object object11;
            block19: {
                void var12_17;
                void var13_25;
                Object object12;
                block27: {
                    void var9_43;
                    block26: {
                        block24: {
                            block25: {
                                block23: {
                                    void var9_38;
                                    block22: {
                                        block20: {
                                            block21: {
                                                n3 = objectArray2.length;
                                                if (n3 == 0 || n3 == 1 && objectArray2[0] instanceof Scriptable) throw Global.reportRuntimeError("msg.runCommand.bad.args");
                                                n2 = n3 - 1;
                                                boolean bl = objectArray2[n2] instanceof Scriptable;
                                                object11 = null;
                                                object6 = null;
                                                if (!bl) break block19;
                                                objectArray3 = (Object[])objectArray2[n2];
                                                n2 = n3 - 1;
                                                object5 = ScriptableObject.getProperty((Scriptable)objectArray3, "env");
                                                if (object5 != Scriptable.NOT_FOUND) {
                                                    if (object5 == null) {
                                                        object5 = new String[]{};
                                                    } else {
                                                        if (!(object5 instanceof Scriptable)) throw Global.reportRuntimeError("msg.runCommand.bad.env");
                                                        Scriptable scriptable = (Scriptable)object5;
                                                        Object[] objectArray4 = ScriptableObject.getPropertyIds(scriptable);
                                                        object4 = new String[objectArray4.length];
                                                        for (n3 = 0; n3 != objectArray4.length; ++n3) {
                                                            void var10_48;
                                                            void var9_31;
                                                            object5 = objectArray4[n3];
                                                            if (object5 instanceof String) {
                                                                String string = (String)object5;
                                                                object5 = ScriptableObject.getProperty(scriptable, string);
                                                            } else {
                                                                int n4 = ((Number)object5).intValue();
                                                                String string = Integer.toString(n4);
                                                                object5 = ScriptableObject.getProperty(scriptable, n4);
                                                            }
                                                            Object object13 = object5;
                                                            if (object5 == Scriptable.NOT_FOUND) {
                                                                Object object14 = Undefined.instance;
                                                            }
                                                            object5 = new StringBuilder();
                                                            ((StringBuilder)object5).append((String)var9_31);
                                                            ((StringBuilder)object5).append('=');
                                                            ((StringBuilder)object5).append(ScriptRuntime.toString(var10_48));
                                                            object4[n3] = ((StringBuilder)object5).toString();
                                                        }
                                                        object5 = object4;
                                                    }
                                                } else {
                                                    object5 = null;
                                                }
                                                Object object15 = ScriptableObject.getProperty((Scriptable)objectArray3, "dir");
                                                object12 = Scriptable.NOT_FOUND;
                                                if (object15 != object12) {
                                                    File file = new File(ScriptRuntime.toString(object15));
                                                } else {
                                                    Object var10_52 = null;
                                                }
                                                Object object16 = ScriptableObject.getProperty((Scriptable)objectArray3, "input");
                                                if (object16 != object12) {
                                                    InputStream inputStream = Global.toInputStream(object16);
                                                } else {
                                                    Object var12_16 = null;
                                                }
                                                object11 = ScriptableObject.getProperty((Scriptable)objectArray3, "output");
                                                if (object11 == object12) break block20;
                                                object3 = Global.toOutputStream(object11);
                                                if (object3 != null) break block21;
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                break block22;
                                            }
                                            Object var13_23 = null;
                                            break block23;
                                        }
                                        Object var9_37 = null;
                                    }
                                    void var13_24 = var9_38;
                                    object3 = var9_38;
                                }
                                object10 = ScriptableObject.getProperty((Scriptable)objectArray3, "err");
                                if (object10 == object12) break block24;
                                OutputStream outputStream = Global.toOutputStream(object10);
                                if (outputStream != null) break block25;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                break block26;
                            }
                            object4 = null;
                            break block27;
                        }
                        Object var9_42 = null;
                    }
                    object4 = var9_43;
                }
                Object object17 = ScriptableObject.getProperty((Scriptable)objectArray3, "args");
                if (object17 != object12) {
                    object6 = ((Context)object).getElements(Context.toObject(object17, ScriptableObject.getTopLevelScope((Scriptable)objectArray)));
                }
                Object object18 = object5;
                object5 = object11;
                object = object3;
                object3 = objectArray3;
                objectArray = var13_25;
                n3 = n2;
                objectArray3 = object6;
                object6 = object18;
                void var16_59 = var12_17;
                Object object19 = object3;
                Object object20 = object10;
                object3 = object4;
                break block28;
            }
            object10 = null;
            objectArray3 = null;
            objectArray = objectArray3;
            object3 = object9 = (object8 = (object4 = (object7 = (object5 = (object = objectArray)))));
            Object object21 = object8;
            Object object22 = object4;
            Object object23 = object7;
            String[] stringArray = object5;
            object6 = object;
            object = object11;
            object5 = objectArray;
            objectArray = objectArray3;
            objectArray3 = object10;
        }
        object4 = Global.getInstance((Function)object2);
        Object object24 = object;
        if (object == null) {
            PrintStream printStream = ((Global)object4).getOut();
        }
        object = var9_46;
        if (var9_46 == null) {
            object = ((Global)object4).getErr();
        }
        n2 = objectArray3 == null ? n3 : objectArray3.length + n3;
        String[] stringArray = new String[n2];
        for (n2 = 0; n2 != n3; ++n2) {
            stringArray[n2] = ScriptRuntime.toString(objectArray2[n2]);
        }
        if (objectArray3 != null) {
            for (n2 = 0; n2 != objectArray3.length; ++n2) {
                stringArray[n3 + n2] = ScriptRuntime.toString(objectArray3[n2]);
            }
        }
        n3 = Global.runProcess(stringArray, (String[])object6, (File)var10_56, (InputStream)var16_61, (OutputStream)var3_6, (OutputStream)object);
        if (objectArray != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(ScriptRuntime.toString(object5));
            ((StringBuilder)object).append(objectArray.toString());
            ScriptableObject.putProperty((Scriptable)var12_21, "output", (Object)((StringBuilder)object).toString());
        }
        if (object3 == null) return n3;
        object = new StringBuilder();
        ((StringBuilder)object).append(ScriptRuntime.toString(var13_28));
        ((StringBuilder)object).append(((ByteArrayOutputStream)object3).toString());
        ScriptableObject.putProperty((Scriptable)var12_21, "err", (Object)((StringBuilder)object).toString());
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    private static int runProcess(String[] var0, String[] var1_1, File var2_3, InputStream var3_4, OutputStream var4_5, OutputStream var5_7) {
        block12: {
            block15: {
                block14: {
                    var7_8 = null;
                    var0 = var1_1 == null ? Runtime.getRuntime().exec((String[])var0, null, (File)var2_3) : Runtime.getRuntime().exec((String[])var0, (String[])var1_1, (File)var2_3);
                    if (var3_4 == null) ** GOTO lbl8
                    var1_1 = new PipeThread(false, (InputStream)var3_4, var0.getOutputStream());
                    var1_1.start();
                    break block14;
lbl8:
                    // 1 sources

                    var0.getOutputStream().close();
                    var1_1 = null;
                }
                if (var4_5 == null) ** GOTO lbl16
                var2_3 = new PipeThread(true, var0.getInputStream(), var4_5);
                var2_3.start();
                break block15;
lbl16:
                // 1 sources

                var0.getInputStream().close();
                var2_3 = null;
            }
            if (var5_7 == null) ** GOTO lbl24
            var3_4 = new PipeThread(true, var0.getErrorStream(), var5_7);
            var3_4.start();
            break block12;
lbl24:
            // 1 sources

            var0.getErrorStream().close();
            var3_4 = var7_8;
        }
        while (true) {
            block13: {
                var0.waitFor();
                if (var2_3 == null) break block13;
                var2_3.join();
            }
            if (var1_1 != null) {
                var1_1.join();
            }
            if (var3_4 == null) ** GOTO lbl42
            try {
                var3_4.join();
lbl42:
                // 2 sources

                var6_9 = var0.exitValue();
                var0.destroy();
                return var6_9;
            }
            catch (Throwable var1_2) {
                var0.destroy();
                throw var1_2;
            }
            {
                catch (InterruptedException var4_6) {
                    continue;
                }
            }
            break;
        }
    }

    public static void seal(Context object, Scriptable scriptable, Object[] objectArray, Function function) {
        block3: {
            int n2 = 0;
            int n3 = 0;
            while (true) {
                if (n3 == objectArray.length) break block3;
                object = objectArray[n3];
                if (!(object instanceof ScriptableObject) || object == Undefined.instance) break;
                ++n3;
            }
            if (object instanceof Scriptable && object != Undefined.instance) {
                throw Global.reportRuntimeError("msg.shell.seal.not.scriptable");
            }
            throw Global.reportRuntimeError("msg.shell.seal.not.object");
        }
        for (int i2 = n2; i2 != objectArray.length; ++i2) {
            ((ScriptableObject)objectArray[i2]).sealObject();
        }
    }

    public static void serialize(Context closeable, Scriptable scriptable, Object[] objectArray, Function object) {
        if (objectArray.length >= 2) {
            object = objectArray[0];
            closeable = new ScriptableOutputStream(new FileOutputStream(Context.toString(objectArray[1])), ScriptableObject.getTopLevelScope(scriptable));
            try {
                ((ObjectOutputStream)closeable).writeObject(object);
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    try {
                        ((OutputStream)closeable).close();
                    }
                    catch (Throwable throwable3) {
                        throwable.addSuppressed(throwable3);
                    }
                    throw throwable2;
                }
            }
            ((OutputStream)closeable).close();
            return;
        }
        throw Context.reportRuntimeError("Expected an object to serialize and a filename to write the serialization to");
    }

    public static Object spawn(Context object, Scriptable object2, Object[] objectArray, Function objectArray2) {
        block8: {
            block7: {
                Scriptable scriptable;
                block6: {
                    scriptable = objectArray2.getParentScope();
                    if (objectArray.length == 0 || !(objectArray[0] instanceof Function)) break block6;
                    objectArray2 = null;
                    object2 = objectArray2;
                    if (objectArray.length > 1) {
                        object2 = objectArray2;
                        if (objectArray[1] instanceof Scriptable) {
                            object2 = ((Context)object).getElements((Scriptable)objectArray[1]);
                        }
                    }
                    objectArray2 = object2;
                    if (object2 == null) {
                        objectArray2 = ScriptRuntime.emptyArgs;
                    }
                    object2 = new Runner(scriptable, (Function)objectArray[0], objectArray2);
                    break block7;
                }
                if (objectArray.length == 0 || !(objectArray[0] instanceof Script)) break block8;
                object2 = new Runner(scriptable, (Script)objectArray[0]);
            }
            object2.factory = ((Context)object).getFactory();
            object = new Thread((Runnable)object2);
            ((Thread)object).start();
            return object;
        }
        throw Global.reportRuntimeError("msg.spawn.args");
    }

    public static Object sync(Context object, Scriptable scriptable, Object[] objectArray, Function function) {
        if (objectArray.length >= 1 && objectArray.length <= 2 && objectArray[0] instanceof Function) {
            scriptable = null;
            object = scriptable;
            if (objectArray.length == 2) {
                object = scriptable;
                if (objectArray[1] != Undefined.instance) {
                    object = objectArray[1];
                }
            }
            return new Synchronizer((Function)objectArray[0], object);
        }
        throw Global.reportRuntimeError("msg.sync.args");
    }

    /*
     * Unable to fully structure code
     */
    private static InputStream toInputStream(Object var0) {
        var1_1 = var0 instanceof Wrapper;
        var3_2 = null;
        if (!var1_1) ** GOTO lbl-1000
        var2_3 = ((Wrapper)var0).unwrap();
        if (var2_3 instanceof InputStream) {
            var3_2 = (InputStream)var2_3;
            var2_3 = null;
        } else if (var2_3 instanceof byte[]) {
            var3_2 = new ByteArrayInputStream((byte[])var2_3);
            var2_3 = null;
        } else if (var2_3 instanceof Reader) {
            var2_3 = Global.readReader((Reader)var2_3);
        } else if (var2_3 instanceof char[]) {
            var2_3 = new String((char[])var2_3);
        } else lbl-1000:
        // 2 sources

        {
            var2_3 = null;
        }
        var4_4 = var3_2;
        if (var3_2 == null) {
            var3_2 = var2_3;
            if (var2_3 == null) {
                var3_2 = ScriptRuntime.toString(var0);
            }
            var4_4 = new ByteArrayInputStream(var3_2.getBytes());
        }
        return var4_4;
    }

    private static OutputStream toOutputStream(Object object) {
        object = object instanceof Wrapper && (object = ((Wrapper)object).unwrap()) instanceof OutputStream ? (OutputStream)object : null;
        return object;
    }

    public static Object toint32(Context object, Scriptable scriptable, Object[] objectArray, Function function) {
        object = objectArray.length != 0 ? objectArray[0] : Undefined.instance;
        if (object instanceof Integer) {
            return object;
        }
        return ScriptRuntime.wrapInt(ScriptRuntime.toInt32(object));
    }

    public static double version(Context context, Scriptable scriptable, Object[] objectArray, Function function) {
        if (objectArray.length > 0) {
            context.setLanguageVersion((int)Context.toNumber(objectArray[0]));
        }
        return context.getLanguageVersion();
    }

    public static Object write(Context context, Scriptable scriptable, Object[] objectArray, Function function) {
        return Global.doPrint(objectArray, function, false);
    }

    public ShellConsole getConsole(Charset charset) {
        if (!this.loadJLine(charset)) {
            this.console = ShellConsole.getConsole(this.getIn(), this.getErr(), charset);
        }
        return this.console;
    }

    public PrintStream getErr() {
        PrintStream printStream;
        PrintStream printStream2 = printStream = this.errStream;
        if (printStream == null) {
            printStream2 = System.err;
        }
        return printStream2;
    }

    public InputStream getIn() {
        InputStream inputStream;
        if (this.inStream == null && !this.attemptedJLineLoad && this.loadJLine(Charset.defaultCharset())) {
            this.inStream = this.console.getIn();
        }
        InputStream inputStream2 = inputStream = this.inStream;
        if (inputStream == null) {
            inputStream2 = System.in;
        }
        return inputStream2;
    }

    public PrintStream getOut() {
        PrintStream printStream;
        PrintStream printStream2 = printStream = this.outStream;
        if (printStream == null) {
            printStream2 = System.out;
        }
        return printStream2;
    }

    public String[] getPrompts(Context context) {
        Scriptable scriptable;
        Object object;
        if (ScriptableObject.hasProperty((Scriptable)this, "prompts") && (object = ScriptableObject.getProperty((Scriptable)this, "prompts")) instanceof Scriptable && ScriptableObject.hasProperty(scriptable = (Scriptable)object, 0) && ScriptableObject.hasProperty(scriptable, 1)) {
            Object object2;
            object = object2 = ScriptableObject.getProperty(scriptable, 0);
            if (object2 instanceof Function) {
                object = ((Function)object2).call(context, this, scriptable, new Object[0]);
            }
            this.prompts[0] = Context.toString(object);
            object = object2 = ScriptableObject.getProperty(scriptable, 1);
            if (object2 instanceof Function) {
                object = ((Function)object2).call(context, this, scriptable, new Object[0]);
            }
            this.prompts[1] = Context.toString(object);
        }
        return this.prompts;
    }

    public void init(Context object) {
        this.initStandardObjects((Context)object, this.sealedStdLib);
        NativeConsole.init(this, this.sealedStdLib, new ShellConsolePrinter());
        this.defineFunctionProperties(new String[]{"defineClass", "deserialize", "doctest", "gc", "help", "load", "loadClass", "print", "quit", "readline", "readFile", "readUrl", "runCommand", "seal", "serialize", "spawn", "sync", "toint32", "version", "write"}, Global.class, 2);
        Environment.defineClass(this);
        this.defineProperty("environment", (Object)new Environment(this), 2);
        this.history = object = (NativeArray)((Context)object).newArray((Scriptable)this, 0);
        this.defineProperty("history", object, 2);
        this.initialized = true;
    }

    public void init(ContextFactory contextFactory) {
        contextFactory.call(new g(this));
    }

    public void initQuitAction(QuitAction quitAction) {
        if (quitAction != null) {
            if (this.quitAction == null) {
                this.quitAction = quitAction;
                return;
            }
            throw new IllegalArgumentException("The method is once-call.");
        }
        throw new IllegalArgumentException("quitAction is null");
    }

    public Require installRequire(Context object, List<String> object2, boolean bl) {
        RequireBuilder requireBuilder = new RequireBuilder();
        requireBuilder.setSandboxed(bl);
        ArrayList<URI> arrayList = new ArrayList<URI>();
        if (object2 != null) {
            Iterator<String> iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object object3;
                CharSequence charSequence = iterator.next();
                try {
                    object2 = object3 = new URI((String)charSequence);
                }
                catch (URISyntaxException uRISyntaxException) {
                    throw new RuntimeException(uRISyntaxException);
                }
                if (!((URI)object3).isAbsolute()) {
                    object2 = new File((String)charSequence);
                    object2 = ((File)object2).toURI().resolve("");
                }
                object3 = object2;
                if (!((URI)object2).toString().endsWith("/")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(object2);
                    ((StringBuilder)charSequence).append("/");
                    object3 = new URI(((StringBuilder)charSequence).toString());
                }
                arrayList.add((URI)object3);
            }
        }
        requireBuilder.setModuleScriptProvider(new SoftCachingModuleScriptProvider(new UrlModuleSourceProvider(arrayList, null)));
        object = requireBuilder.createRequire((Context)object, this);
        ((Require)object).install(this);
        return object;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int runDoctest(Context object, Scriptable scriptable, String string, String string2, int n2) {
        void var2_5;
        ErrorReporter errorReporter;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        PrintStream printStream;
        Appendable appendable;
        int n3;
        this.doctestCanonicalizations = new HashMap();
        String[] stringArray = string.split("\r\n?|\n");
        string = this.prompts[0].trim();
        String string3 = this.prompts[1].trim();
        for (n3 = 0; n3 < stringArray.length && !stringArray[n3].trim().startsWith(string); ++n3) {
        }
        int n4 = 0;
        while (true) {
            Object object2;
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            block14: {
                if (n3 >= stringArray.length) {
                    return n4;
                }
                stringBuilder2 = new StringBuilder(stringArray[n3].trim().substring(string.length()));
                while (true) {
                    stringBuilder2.append('\n');
                    if (++n3 >= stringArray.length || !stringArray[n3].trim().startsWith(string3)) break;
                    stringBuilder2.append(stringArray[n3].trim().substring(string3.length()));
                }
                stringBuilder = new StringBuilder();
                while (n3 < stringArray.length && !stringArray[n3].trim().startsWith(string)) {
                    stringBuilder.append(stringArray[n3]);
                    stringBuilder.append('\n');
                    ++n3;
                }
                appendable = this.getOut();
                printStream = this.getErr();
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                byteArrayOutputStream = new ByteArrayOutputStream();
                this.setOut(new PrintStream(byteArrayOutputStream2));
                this.setErr(new PrintStream(byteArrayOutputStream));
                errorReporter = ((Context)object).getErrorReporter();
                ((Context)object).setErrorReporter(new ToolErrorReporter(false, this.getErr()));
                String string4 = stringBuilder2.toString();
                try {
                    object2 = ((Context)object).evaluateString(scriptable, string4, "doctest input", 1, null);
                    object2 = object2 != Context.getUndefinedValue() && (!(object2 instanceof Function) || !string4.trim().startsWith("function")) ? Context.toString(object2) : "";
                }
                catch (Throwable throwable) {
                    break;
                }
                catch (RhinoException rhinoException) {}
                this.setOut((PrintStream)appendable);
                this.setErr(printStream);
                ((Context)object).setErrorReporter(errorReporter);
                appendable = new StringBuilder();
                ((StringBuilder)appendable).append((String)object2);
                object2 = appendable;
                break block14;
                catch (Throwable throwable) {
                    break;
                }
                catch (RhinoException rhinoException) {
                    // empty catch block
                }
                {
                    ToolErrorReporter.reportException(((Context)object).getErrorReporter(), (RhinoException)object2);
                    this.setOut((PrintStream)appendable);
                    this.setErr(printStream);
                    ((Context)object).setErrorReporter(errorReporter);
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("");
            }
            ((StringBuilder)object2).append(byteArrayOutputStream.toString());
            ((StringBuilder)object2).append(byteArrayOutputStream2.toString());
            object2 = ((StringBuilder)object2).toString();
            if (!this.doctestOutputMatches(stringBuilder.toString(), (String)object2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("doctest failure running:\n");
                ((StringBuilder)object).append((Object)stringBuilder2);
                ((StringBuilder)object).append("expected: ");
                ((StringBuilder)object).append((Object)stringBuilder);
                ((StringBuilder)object).append("actual: ");
                object = r.c((StringBuilder)object, (String)object2, "\n");
                if (string2 != null) {
                    throw Context.reportRuntimeError((String)object, string2, n2 + n3 - 1, null, 0);
                }
                throw Context.reportRuntimeError((String)object);
            }
            ++n4;
        }
        this.setOut((PrintStream)appendable);
        this.setErr(printStream);
        ((Context)object).setErrorReporter(errorReporter);
        byteArrayOutputStream.toString();
        byteArrayOutputStream2.toString();
        throw var2_5;
    }

    public void setErr(PrintStream printStream) {
        this.errStream = printStream;
    }

    public void setIn(InputStream inputStream) {
        this.inStream = inputStream;
    }

    public void setOut(PrintStream printStream) {
        this.outStream = printStream;
    }

    public void setSealedStdLib(boolean bl) {
        this.sealedStdLib = bl;
    }
}

