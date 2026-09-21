/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.commonjs.module.ModuleScope;
import org.mozilla.javascript.commonjs.module.Require;
import org.mozilla.javascript.tools.SourceReader;
import org.mozilla.javascript.tools.ToolErrorReporter;
import org.mozilla.javascript.tools.shell.Global;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity;
import org.mozilla.javascript.tools.shell.Main$IProxy;
import org.mozilla.javascript.tools.shell.Main$ScriptCache;
import org.mozilla.javascript.tools.shell.SecurityProxy;
import org.mozilla.javascript.tools.shell.ShellContextFactory;

public class Main {
    private static final int EXITCODE_FILE_NOT_FOUND = 4;
    private static final int EXITCODE_RUNTIME_ERROR = 3;
    protected static ToolErrorReporter errorReporter;
    protected static int exitCode;
    static List<String> fileList;
    public static Global global;
    static String mainModule;
    static List<String> modulePath;
    static boolean processStdin;
    static Require require;
    static boolean sandboxed;
    private static final Main$ScriptCache scriptCache;
    private static SecurityProxy securityImpl;
    public static ShellContextFactory shellContextFactory;
    static boolean useRequire;

    static {
        shellContextFactory = new ShellContextFactory();
        global = new Global();
        exitCode = 0;
        processStdin = true;
        fileList = new ArrayList<String>();
        sandboxed = false;
        useRequire = false;
        scriptCache = new Main$ScriptCache(32);
        global.initQuitAction(new Main$IProxy(3));
    }

    static /* synthetic */ void access$000(Context context) {
        Main.printPromiseWarnings(context);
    }

    static void evalInlineScript(Context context, String object) {
        block4: {
            object = context.compileString((String)object, "<command>", 1, null);
            if (object == null) break block4;
            try {
                object.exec(context, Main.getShellScope());
                break block4;
            }
            catch (VirtualMachineError virtualMachineError) {
                virtualMachineError.printStackTrace();
                Context.reportError(ToolErrorReporter.getMessage("msg.uncaughtJSException", ((Object)virtualMachineError).toString()));
            }
            catch (RhinoException rhinoException) {
                ToolErrorReporter.reportException(context.getErrorReporter(), rhinoException);
            }
            exitCode = 3;
        }
    }

    public static int exec(String[] stringArray) {
        Object object = new ToolErrorReporter(false, global.getErr());
        errorReporter = object;
        shellContextFactory.setErrorReporter((ErrorReporter)object);
        stringArray = Main.processOptions(stringArray);
        int n2 = exitCode;
        if (n2 > 0) {
            return n2;
        }
        if (processStdin) {
            fileList.add(null);
        }
        object = global;
        if (!((Global)object).initialized) {
            ((Global)object).init(shellContextFactory);
        }
        object = new Main$IProxy(1);
        ((Main$IProxy)object).args = stringArray;
        shellContextFactory.call(object);
        return exitCode;
    }

    private static byte[] getDigest(Object object) {
        if (object != null) {
            object = object instanceof String ? (Object)((String)object).getBytes(StandardCharsets.UTF_8) : (Object)((byte[])object);
            try {
                object = MessageDigest.getInstance("MD5").digest((byte[])object);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new RuntimeException(noSuchAlgorithmException);
            }
        } else {
            object = null;
        }
        return object;
    }

    public static PrintStream getErr() {
        return Main.getGlobal().getErr();
    }

    public static Global getGlobal() {
        return global;
    }

    public static InputStream getIn() {
        return Main.getGlobal().getIn();
    }

    public static PrintStream getOut() {
        return Main.getGlobal().getOut();
    }

    static Scriptable getScope(String object) {
        if (useRequire) {
            block6: {
                if (object == null) {
                    object = new File(System.getProperty("user.dir")).toURI();
                } else {
                    block7: {
                        if (SourceReader.toUrl((String)object) != null) {
                            try {
                                URI uRI = new URI((String)object);
                                object = uRI;
                                break block6;
                            }
                            catch (URISyntaxException uRISyntaxException) {
                                object = new File((String)object);
                                break block7;
                            }
                        }
                        object = new File((String)object);
                    }
                    object = ((File)object).toURI();
                }
            }
            return new ModuleScope(global, (URI)object, null);
        }
        return global;
    }

    static Scriptable getShellScope() {
        return Main.getScope(null);
    }

    /*
     * WARNING - void declaration
     */
    private static void initJavaPolicySecuritySupport() {
        void var0_7;
        try {
            SecurityProxy securityProxy;
            securityImpl = securityProxy = (SecurityProxy)JavaPolicySecurity.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            SecurityController.initGlobal(securityProxy);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (LinkageError linkageError) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not load security support: ");
        stringBuilder.append(var0_7);
        throw new IllegalStateException(stringBuilder.toString(), (Throwable)var0_7);
    }

    /*
     * WARNING - void declaration
     */
    private static Script loadCompiledScript(Context object, String object2, byte[] byArray, Object object3) {
        if (byArray != null) {
            void var0_5;
            int n2;
            int n3 = ((String)object2).lastIndexOf(47);
            n3 = n3 < 0 ? 0 : ++n3;
            int n4 = n2 = ((String)object2).lastIndexOf(46);
            if (n2 < n3) {
                n4 = ((String)object2).length();
            }
            object2 = ((String)object2).substring(n3, n4);
            try {
                object = SecurityController.createLoader(((Context)object).getApplicationClassLoader(), object3);
                object2 = object.defineClass((String)object2, byArray);
                object.linkClass((Class<?>)object2);
                if (Script.class.isAssignableFrom((Class<?>)object2)) {
                    return (Script)((Class)object2).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
                throw Context.reportRuntimeError("msg.must.implement.Script");
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (InstantiationException instantiationException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            Context.reportError(var0_5.toString());
            throw new RuntimeException((Throwable)var0_5);
        }
        throw new FileNotFoundException((String)object2);
    }

    public static void main(String[] stringArray) {
        int n2;
        try {
            if (Boolean.getBoolean("rhino.use_java_policy_security")) {
                Main.initJavaPolicySecuritySupport();
            }
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace(System.err);
        }
        if ((n2 = Main.exec(stringArray)) != 0) {
            System.exit(n2);
        }
    }

    private static void printPromiseWarnings(Context object) {
        List<Object> list = ((Context)object).getUnhandledPromiseTracker().enumerate();
        if (!list.isEmpty()) {
            Object object2 = list.get(0);
            object = a.c("Unhandled rejected promise: ");
            ((StringBuilder)object).append(Context.toString(object2));
            CharSequence charSequence = ((StringBuilder)object).toString();
            object = charSequence;
            if (object2 instanceof Scriptable) {
                object2 = ScriptableObject.getProperty((Scriptable)object2, "stack");
                object = charSequence;
                if (object2 != null) {
                    object = charSequence;
                    if (object2 != Scriptable.NOT_FOUND) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)charSequence);
                        ((StringBuilder)object).append('\n');
                        ((StringBuilder)object).append(Context.toString(object2));
                        object = ((StringBuilder)object).toString();
                    }
                }
            }
            System.out.println((String)object);
            if (list.size() > 1) {
                object = System.out;
                charSequence = a.c("  and ");
                ((StringBuilder)charSequence).append(list.size() - 1);
                ((StringBuilder)charSequence).append(" other unhandled rejected promises");
                ((PrintStream)object).println(((StringBuilder)charSequence).toString());
            }
        }
    }

    public static void processFile(Context context, Scriptable scriptable, String string) {
        SecurityProxy securityProxy = securityImpl;
        if (securityProxy == null) {
            Main.processFileSecure(context, scriptable, string, null);
        } else {
            securityProxy.callProcessFileSecure(context, scriptable, string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void processFileNoThrow(Context context, Scriptable scriptable, String string) {
        try {
            Main.processFile(context, scriptable, string);
            return;
        }
        catch (VirtualMachineError virtualMachineError) {
            virtualMachineError.printStackTrace();
            Context.reportError(ToolErrorReporter.getMessage("msg.uncaughtJSException", ((Object)virtualMachineError).toString()));
        }
        catch (RhinoException rhinoException) {
            ToolErrorReporter.reportException(context.getErrorReporter(), rhinoException);
        }
        catch (IOException iOException) {
            Context.reportError(ToolErrorReporter.getMessage("msg.couldnt.read.source", string, iOException.getMessage()));
            exitCode = 4;
            return;
        }
        exitCode = 3;
    }

    static void processFileSecure(Context context, Scriptable scriptable, String object, Object object2) {
        boolean bl = ((String)object).endsWith(".class");
        Object object3 = Main.readFileOrUrl((String)object, bl ^ true);
        byte[] byArray = Main.getDigest(object3);
        Object object4 = r.d((String)object, "_");
        ((StringBuilder)object4).append(context.getOptimizationLevel());
        String string = ((StringBuilder)object4).toString();
        object4 = scriptCache.get(string, byArray);
        object4 = object4 != null ? (Script)((Reference)object4).get() : null;
        Object object5 = object4;
        if (object4 == null) {
            if (bl) {
                object = Main.loadCompiledScript(context, (String)object, (byte[])object3, object2);
            } else {
                block7: {
                    object4 = object5 = (String)object3;
                    if (((String)object5).length() > 0) {
                        object4 = object5;
                        if (((String)object5).charAt(0) == '#') {
                            int n2 = 1;
                            while (true) {
                                object4 = object5;
                                if (n2 == ((String)object5).length()) break block7;
                                char c2 = ((String)object5).charAt(n2);
                                if (c2 == '\n' || c2 == '\r') break;
                                ++n2;
                            }
                            object4 = ((String)object5).substring(n2);
                        }
                    }
                }
                object = context.compileString((String)object4, (String)object, 1, object2);
            }
            scriptCache.put(string, byArray, (Script)object);
            object5 = object;
        }
        if (object5 != null) {
            object5.exec(context, scriptable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void processFiles(Context context, String[] object) {
        Object[] objectArray = new Object[((Object)object).length];
        System.arraycopy(object, 0, objectArray, 0, ((Object)object).length);
        object = context.newArray((Scriptable)global, objectArray);
        global.defineProperty("arguments", object, 2);
        object = fileList.iterator();
        while (object.hasNext()) {
            String string = (String)object.next();
            try {
                Main.processSource(context, string);
                continue;
            }
            catch (VirtualMachineError virtualMachineError) {
                virtualMachineError.printStackTrace();
                Context.reportError(ToolErrorReporter.getMessage("msg.uncaughtJSException", ((Object)virtualMachineError).toString()));
            }
            catch (RhinoException rhinoException) {
                ToolErrorReporter.reportException(context.getErrorReporter(), rhinoException);
            }
            catch (IOException iOException) {
                Context.reportError(ToolErrorReporter.getMessage("msg.couldnt.read.source", string, iOException.getMessage()));
                exitCode = 4;
                continue;
            }
            exitCode = 3;
        }
        return;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String[] processOptions(String[] object) {
        block24: {
            void var0_12;
            block22: {
                int n2;
                int n3 = 0;
                while (true) {
                    block23: {
                        block25: {
                            Object object2;
                            block27: {
                                block38: {
                                    block37: {
                                        block36: {
                                            block30: {
                                                block35: {
                                                    block33: {
                                                        block34: {
                                                            block32: {
                                                                block31: {
                                                                    block29: {
                                                                        block28: {
                                                                            block26: {
                                                                                if (n3 == ((String[])object).length) {
                                                                                    return new String[0];
                                                                                }
                                                                                object2 = object[n3];
                                                                                if (!((String)object2).startsWith("-")) {
                                                                                    processStdin = false;
                                                                                    fileList.add((String)object2);
                                                                                    mainModule = object2;
                                                                                    object2 = new String[((String[])object).length - n3 - 1];
                                                                                    System.arraycopy(object, n3 + 1, object2, 0, ((String[])object).length - n3 - 1);
                                                                                    return object2;
                                                                                }
                                                                                if (!((String)object2).equals("-version")) break block26;
                                                                                if (++n3 == ((String[])object).length) {
                                                                                    String[] stringArray = object2;
                                                                                    break block22;
                                                                                }
                                                                                try {
                                                                                    n2 = Integer.parseInt(object[n3]);
                                                                                }
                                                                                catch (NumberFormatException numberFormatException) {
                                                                                    String string = object[n3];
                                                                                    break block22;
                                                                                }
                                                                                if (!Context.isValidLanguageVersion(n2)) {
                                                                                    String string = object[n3];
                                                                                    break block22;
                                                                                }
                                                                                shellContextFactory.setLanguageVersion(n2);
                                                                                break block23;
                                                                            }
                                                                            if (((String)object2).equals("-opt") || ((String)object2).equals("-O")) break block27;
                                                                            if (!((String)object2).equals("-encoding")) break block28;
                                                                            if (++n3 == ((String[])object).length) {
                                                                                String[] stringArray = object2;
                                                                                break block22;
                                                                            }
                                                                            object2 = object[n3];
                                                                            shellContextFactory.setCharacterEncoding((String)object2);
                                                                            break block23;
                                                                        }
                                                                        if (!((String)object2).equals("-strict")) break block29;
                                                                        shellContextFactory.setStrictMode(true);
                                                                        shellContextFactory.setAllowReservedKeywords(false);
                                                                        break block30;
                                                                    }
                                                                    if (!((String)object2).equals("-fatal-warnings")) break block31;
                                                                    shellContextFactory.setWarningAsError(true);
                                                                    break block23;
                                                                }
                                                                if (!((String)object2).equals("-e")) break block32;
                                                                processStdin = false;
                                                                if (++n3 == ((String[])object).length) {
                                                                    Object object3 = object2;
                                                                    break block22;
                                                                }
                                                                object2 = global;
                                                                if (!((Global)object2).initialized) {
                                                                    ((Global)object2).init(shellContextFactory);
                                                                }
                                                                object2 = new Main$IProxy(2);
                                                                ((Main$IProxy)object2).scriptText = object[n3];
                                                                shellContextFactory.call(object2);
                                                                break block23;
                                                            }
                                                            if (((String)object2).equals("-require")) break block33;
                                                            if (!((String)object2).equals("-sandbox")) break block34;
                                                            sandboxed = true;
                                                            break block33;
                                                        }
                                                        if (!((String)object2).equals("-modules")) break block35;
                                                        if (++n3 == ((String[])object).length) {
                                                            Object object4 = object2;
                                                            break block22;
                                                        }
                                                        if (modulePath == null) {
                                                            modulePath = new ArrayList<String>();
                                                        }
                                                        modulePath.add(object[n3]);
                                                    }
                                                    useRequire = true;
                                                    break block23;
                                                }
                                                if (!((String)object2).equals("-w")) break block36;
                                            }
                                            errorReporter.setIsReportingWarnings(true);
                                            break block23;
                                        }
                                        if (!((String)object2).equals("-f")) break block37;
                                        processStdin = false;
                                        if (++n3 == ((String[])object).length) {
                                            Object object5 = object2;
                                            break block22;
                                        }
                                        if (object[n3].equals("-")) {
                                            fileList.add(null);
                                            break block23;
                                        } else {
                                            fileList.add(object[n3]);
                                            mainModule = object[n3];
                                        }
                                        break block23;
                                    }
                                    if (!((String)object2).equals("-sealedlib")) break block38;
                                    global.setSealedStdLib(true);
                                    break block23;
                                }
                                if (((String)object2).equals("-debug")) {
                                    shellContextFactory.setGeneratingDebug(true);
                                    break block23;
                                } else {
                                    if (((String)object2).equals("-?")) break block24;
                                    Object object6 = object2;
                                    if (!((String)object2).equals("-help")) break block22;
                                    break block24;
                                }
                            }
                            n2 = n3 + 1;
                            if (n2 == ((String[])object).length) {
                                String[] stringArray = object2;
                                break block22;
                            }
                            int n4 = Integer.parseInt(object[n2]);
                            if (n4 == -2) {
                                n3 = -1;
                                break block25;
                            }
                            n3 = n4;
                            if (!Context.isValidOptimizationLevel(n4)) {
                                String string = object[n2];
                                break block22;
                            }
                        }
                        shellContextFactory.setOptimizationLevel(n3);
                        n3 = n2;
                    }
                    ++n3;
                }
                catch (NumberFormatException numberFormatException) {
                    String string = object[n2];
                }
            }
            global.getOut().println(ToolErrorReporter.getMessage("msg.shell.invalid", (String)var0_12));
        }
        global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
        exitCode = 1;
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static void processSource(Context var0, String var1_1) {
        block19: {
            block18: {
                if (var1_1 == null || var1_1.equals("-")) break block18;
                if (Main.useRequire && var1_1.equals(Main.mainModule)) {
                    Main.require.requireMain(var0, var1_1);
                } else {
                    Main.processFile(var0, Main.getScope(var1_1), var1_1);
                }
                break block19;
            }
            var6_2 = Main.getShellScope();
            var5_3 = Main.shellContextFactory.getCharacterEncoding();
            var5_3 = var5_3 != null ? Charset.forName((String)var5_3) : Charset.defaultCharset();
            var7_8 = Main.global.getConsole((Charset)var5_3);
            if (var1_1 == null) {
                var7_8.println(var0.getImplementationVersion());
            }
            var3_9 = false;
            var2_10 = 1;
            while (!var3_9) {
                block16: {
                    var9_13 = Main.global.getPrompts(var0);
                    var5_3 = var1_1 == null ? var9_13[0] : null;
                    var7_8.flush();
                    var8_12 = new StringBuilder();
                    while (true) {
                        var5_3 = var7_8.readLine((String)var5_3);
                        if (var5_3 == null) {
                            var3_9 = true;
                            break block16;
                        }
                        var8_12.append((String)var5_3);
                        var8_12.append('\n');
                        ++var2_10;
                        if (!var0.stringIsCompilableUnit(var8_12.toString())) {
                            var5_3 = var9_13[1];
                            continue;
                        }
                        break block16;
                        break;
                    }
                    catch (IOException var5_4) {
                        var7_8.println(var5_4.toString());
                    }
                }
                var5_3 = var8_12.toString();
                var9_13 = var0.compileString((String)var5_3, "<stdin>", var2_10, null);
                if (var9_13 == null) ** GOTO lbl55
                var9_13 = var9_13.exec(var0, var6_2);
                if (var9_13 == Context.getUndefinedValue() || var9_13 instanceof Function && (var4_11 = var5_3.trim().startsWith("function"))) ** GOTO lbl53
                try {
                    var7_8.println(Context.toString(var9_13));
                    ** GOTO lbl53
                }
                catch (RhinoException var5_5) {
                    try {
                        ToolErrorReporter.reportException(var0.getErrorReporter(), var5_5);
lbl53:
                        // 3 sources

                        var5_3 = Main.global.history;
                        var5_3.put((int)var5_3.getLength(), (Scriptable)var5_3, (Object)var8_12);
lbl55:
                        // 2 sources

                        Main.printPromiseWarnings(var0);
                        continue;
                    }
                    catch (VirtualMachineError var5_6) {
                        var5_6.printStackTrace();
                        Context.reportError(ToolErrorReporter.getMessage("msg.uncaughtJSException", var5_6.toString()));
                    }
                    catch (RhinoException var5_7) {
                        ToolErrorReporter.reportException(var0.getErrorReporter(), var5_7);
                    }
                }
                Main.exitCode = 3;
            }
            var7_8.println();
            var7_8.flush();
        }
    }

    private static Object readFileOrUrl(String string, boolean bl) {
        return SourceReader.readFileOrUrl(string, bl, shellContextFactory.getCharacterEncoding());
    }

    public static void setErr(PrintStream printStream) {
        Main.getGlobal().setErr(printStream);
    }

    public static void setIn(InputStream inputStream) {
        Main.getGlobal().setIn(inputStream);
    }

    public static void setOut(PrintStream printStream) {
        Main.getGlobal().setOut(printStream);
    }
}

