/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.jsc;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.y.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.optimizer.ClassCompiler;
import org.mozilla.javascript.tools.SourceReader;
import org.mozilla.javascript.tools.ToolErrorReporter;

public class Main {
    private String characterEncoding;
    private ClassCompiler compiler;
    private CompilerEnvirons compilerEnv;
    private String destinationDir;
    private boolean printHelp;
    private ToolErrorReporter reporter = new ToolErrorReporter(true);
    private String targetName;
    private String targetPackage;

    public Main() {
        CompilerEnvirons compilerEnvirons;
        this.compilerEnv = compilerEnvirons = new CompilerEnvirons();
        compilerEnvirons.setErrorReporter(this.reporter);
        this.compiler = new ClassCompiler(this.compilerEnv);
    }

    private void addError(String string, String string2) {
        string = string2 == null ? ToolErrorReporter.getMessage(string) : ToolErrorReporter.getMessage(string, string2);
        this.addFormatedError(string);
    }

    private void addFormatedError(String string) {
        this.reporter.error(string, null, -1, null, -1);
    }

    private static void badUsage(String string) {
        System.err.println(ToolErrorReporter.getMessage("msg.jsc.bad.usage", Main.class.getName(), string));
    }

    private File getOutputFile(File file, String string) {
        File file2;
        if ((string = (file = new File(file, string.replace('.', File.separatorChar).concat(".class"))).getParent()) != null && !(file2 = new File(string)).exists() && !file2.mkdirs()) {
            throw new IOException(e.c("Error making output directory ", string));
        }
        return file;
    }

    public static void main(String[] stringArray) {
        Main main = new Main();
        if ((stringArray = main.processOptions(stringArray)) == null) {
            if (main.printHelp) {
                System.out.println(ToolErrorReporter.getMessage("msg.jsc.usage", Main.class.getName()));
                System.exit(0);
            }
            System.exit(1);
        }
        if (!main.reporter.hasReportedError()) {
            main.processSource(stringArray);
        }
    }

    private static void p(String string) {
        System.out.println(string);
    }

    private String readSource(File object) {
        String string = ((File)object).getAbsolutePath();
        if (!((File)object).isFile()) {
            this.addError("msg.jsfile.not.found", string);
            return null;
        }
        try {
            object = (String)SourceReader.readFileOrUrl(string, true, this.characterEncoding);
            return object;
        }
        catch (IOException iOException) {
            this.addFormatedError(((Object)iOException).toString());
        }
        catch (FileNotFoundException fileNotFoundException) {
            this.addError("msg.couldnt.open", string);
        }
        return null;
    }

    String getClassName(String string) {
        int n2 = string.length();
        int n3 = 1;
        char[] cArray = new char[n2 + 1];
        n2 = 0;
        if (!Character.isJavaIdentifierStart(string.charAt(0))) {
            cArray[0] = 95;
        } else {
            n3 = 0;
        }
        while (n2 < string.length()) {
            int n4 = string.charAt(n2);
            cArray[n3] = Character.isJavaIdentifierPart((char)n4) ? n4 : 95;
            ++n2;
            ++n3;
        }
        return new String(cArray).trim();
    }

    /*
     * Unable to fully structure code
     */
    public String[] processOptions(String[] var1_1) {
        this.targetPackage = "";
        var9_4 = this.compilerEnv;
        var6_6 = 0;
        var9_4.setGenerateDebugInfo(false);
        var4_7 = 0;
        while (var4_7 < var1_1.length) {
            block38: {
                block40: {
                    block44: {
                        block43: {
                            block42: {
                                block41: {
                                    block39: {
                                        block37: {
                                            block36: {
                                                block35: {
                                                    var9_4 = var1_1[var4_7];
                                                    if (!var9_4.startsWith("-")) {
                                                        var5_10 = var1_1.length - var4_7;
                                                        var9_4 = this.targetName;
                                                        if (var9_4 != null && var5_10 > 1) {
                                                            this.addError("msg.multiple.js.to.file", (String)var9_4);
                                                            return null;
                                                        }
                                                        var9_4 = new String[var5_10];
                                                        for (var3_9 = var6_6; var3_9 != var5_10; ++var3_9) {
                                                            var9_4[var3_9] = var1_1[var4_7 + var3_9];
                                                        }
                                                        return var9_4;
                                                    }
                                                    if (var9_4.equals("-help") || var9_4.equals("-h") || var9_4.equals("--help")) break block38;
                                                    var5_10 = var4_7;
                                                    var3_9 = var4_7++;
                                                    if (!var9_4.equals("-version")) break block35;
                                                    var5_10 = var4_7;
                                                    var3_9 = var4_7;
                                                    if (var4_7 >= var1_1.length) break block35;
                                                    var3_9 = var4_7;
                                                    var5_10 = Integer.parseInt(var1_1[var4_7]);
                                                    var3_9 = var4_7;
                                                    this.compilerEnv.setLanguageVersion(var5_10);
                                                    var3_9 = var4_7;
                                                }
                                                var3_9 = var5_10;
                                                if (var9_4.equals("-opt")) break block36;
                                                var4_7 = var5_10;
                                                var3_9 = var5_10;
                                                if (!var9_4.equals("-O")) break block37;
                                            }
                                            var4_7 = ++var5_10;
                                            var3_9 = var5_10;
                                            if (var5_10 >= var1_1.length) break block37;
                                            var3_9 = var5_10;
                                            var4_7 = Integer.parseInt(var1_1[var5_10]);
                                            var3_9 = var5_10;
                                            try {
                                                this.compilerEnv.setOptimizationLevel(var4_7);
                                                var3_9 = var5_10;
                                            }
                                            catch (NumberFormatException var9_5) {
                                                Main.badUsage(var1_1[var3_9]);
                                                return null;
                                            }
                                        }
                                        if (!var9_4.equals("-nosource")) break block39;
                                        this.compilerEnv.setGeneratingSource(false);
                                        var3_9 = var4_7;
                                        break block40;
                                    }
                                    if (var9_4.equals("-debug") || var9_4.equals("-g")) ** GOTO lbl171
                                    var3_9 = var4_7++;
                                    if (!var9_4.equals("-main-method-class")) break block41;
                                    var3_9 = var4_7;
                                    if (var4_7 >= var1_1.length) break block41;
                                    this.compiler.setMainMethodClass(var1_1[var4_7]);
                                    var3_9 = var4_7;
                                    break block40;
                                }
                                var4_7 = var3_9++;
                                if (!var9_4.equals("-encoding")) break block42;
                                var4_7 = var3_9;
                                if (var3_9 >= var1_1.length) break block42;
                                this.characterEncoding = var1_1[var3_9];
                                break block40;
                            }
                            var3_9 = var4_7++;
                            if (!var9_4.equals("-o")) break block43;
                            var3_9 = var4_7;
                            if (var4_7 >= var1_1.length) break block43;
                            var10_13 = var1_1[var4_7];
                            var5_10 = var10_13.length();
                            if (var5_10 != 0 && Character.isJavaIdentifierStart(var10_13.charAt(0))) {
                                var3_9 = 1;
                                while (true) {
                                    var9_4 = var10_13;
                                    if (var3_9 >= var5_10) break;
                                    var2_8 = var10_13.charAt(var3_9);
                                    if (!Character.isJavaIdentifierPart(var2_8)) {
                                        if (var2_8 == '.' && var3_9 == var5_10 - 6 && var10_13.endsWith(".class")) {
                                            var9_4 = var10_13.substring(0, var3_9);
                                            break;
                                        }
                                        this.addError("msg.invalid.classfile.name", (String)var10_13);
                                        var9_4 = var10_13;
                                        break;
                                    }
                                    ++var3_9;
                                }
                                this.targetName = var9_4;
                                var3_9 = var4_7;
                            } else {
                                this.addError("msg.invalid.classfile.name", (String)var10_13);
                                var3_9 = var4_7;
                            }
                            break block40;
                        }
                        if (var9_4.equals("-observe-instruction-count")) {
                            this.compilerEnv.setGenerateObserverCount(true);
                        }
                        var4_7 = var3_9;
                        if (!var9_4.equals("-package")) break block44;
                        var4_7 = var5_10 = var3_9 + 1;
                        if (var5_10 >= var1_1.length) break block44;
                        var9_4 = var1_1[var5_10];
                        var8_12 = var9_4.length();
                        var3_9 = 0;
                        while (var3_9 != var8_12) {
                            var2_8 = var9_4.charAt(var3_9);
                            if (Character.isJavaIdentifierStart(var2_8)) {
                                var4_7 = var2_8;
                                while ((var7_11 = var3_9 + 1) != var8_12) {
                                    var2_8 = var9_4.charAt(var7_11);
                                    var3_9 = var7_11;
                                    var4_7 = var2_8;
                                    if (Character.isJavaIdentifierPart(var2_8)) continue;
                                    var4_7 = var2_8;
                                    break;
                                }
                                if (var7_11 == var8_12) break;
                                if (var4_7 == 46 && var7_11 != var8_12 - 1) {
                                    var3_9 = var7_11 + 1;
                                    continue;
                                }
                            }
                            this.addError("msg.package.name", this.targetPackage);
                            return null;
                        }
                        this.targetPackage = var9_4;
                        var3_9 = var5_10;
                        break block40;
                    }
                    var3_9 = var4_7++;
                    if (var9_4.equals("-extends")) {
                        var3_9 = var4_7;
                        if (var4_7 < var1_1.length) {
                            var9_4 = var1_1[var4_7];
                            try {
                                var9_4 = Class.forName((String)var9_4);
                                this.compiler.setTargetExtends((Class<?>)var9_4);
                                var3_9 = var4_7;
                            }
                            catch (ClassNotFoundException var1_2) {
                                throw new Error(var1_2.toString());
                            }
                        }
                    }
                    var4_7 = var3_9++;
                    if (!var9_4.equals("-implements")) ** GOTO lbl-1000
                    var4_7 = var3_9;
                    if (var3_9 < var1_1.length) {
                        var9_4 = new StringTokenizer(var1_1[var3_9], ",");
                        var10_13 = new ArrayList<E>();
                        while (var9_4.hasMoreTokens()) {
                            var11_14 = var9_4.nextToken();
                            try {
                                var10_13.add(Class.forName(var11_14));
                            }
                            catch (ClassNotFoundException var1_3) {
                                throw new Error(var1_3.toString());
                            }
                        }
                        var9_4 = var10_13.toArray(new Class[var10_13.size()]);
                        this.compiler.setTargetImplements((Class<?>[])var9_4);
                    } else if (var9_4.equals("-d") && (var3_9 = var4_7 + 1) < var1_1.length) {
                        this.destinationDir = var1_1[var3_9];
                    } else {
                        Main.badUsage((String)var9_4);
                        return null;
lbl171:
                        // 1 sources

                        this.compilerEnv.setGenerateDebugInfo(true);
                        var3_9 = var4_7;
                    }
                }
                var4_7 = var3_9 + 1;
                continue;
            }
            this.printHelp = true;
            return null;
        }
        Main.p(ToolErrorReporter.getMessage("msg.no.file"));
        return null;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void processSource(String[] stringArray) {
        for (int i2 = 0; i2 != stringArray.length; ++i2) {
            void var5_16;
            Object[] objectArray;
            void var4_8;
            String string;
            Object object = stringArray[i2];
            if (!((String)object).endsWith(".js")) {
                this.addError("msg.extension.not.js", (String)object);
                return;
            }
            Object object2 = new File((String)object);
            Object object3 = this.readSource((File)object2);
            if (object3 == null) {
                return;
            }
            String string2 = string = this.targetName;
            if (string == null) {
                String string4 = ((File)object2).getName();
                string4 = this.getClassName(string4.substring(0, string4.length() - 3));
            }
            void var5_14 = var4_8;
            if (this.targetPackage.length() != 0) {
                String string5 = z.b(new StringBuilder(), this.targetPackage, ".", (String)var4_8);
            }
            if ((objectArray = this.compiler.compileToClassFiles((String)object3, (String)object, 1, (String)var5_16)) == null || objectArray.length == 0) return;
            Object var4_9 = null;
            if (this.destinationDir != null) {
                File file = new File(this.destinationDir);
            } else if ((object2 = ((File)object2).getParent()) != null) {
                File file = new File((String)object2);
            }
            for (int i4 = 0; i4 != objectArray.length; i4 += 2) {
                void var4_4;
                object2 = (String)objectArray[i4];
                object3 = (byte[])objectArray[i4 + 1];
                object = this.getOutputFile((File)var4_4, (String)object2);
                object2 = new FileOutputStream((File)object);
                ((FileOutputStream)object2).write((byte[])object3);
                ((FileOutputStream)object2).close();
                continue;
                catch (Throwable throwable) {
                    try {
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        try {
                            ((FileOutputStream)object2).close();
                            throw throwable2;
                        }
                        catch (Throwable throwable3) {
                            try {
                                throwable.addSuppressed(throwable3);
                                throw throwable2;
                            }
                            catch (IOException iOException) {
                                this.addFormatedError(((Object)iOException).toString());
                            }
                        }
                    }
                }
            }
        }
    }
}

