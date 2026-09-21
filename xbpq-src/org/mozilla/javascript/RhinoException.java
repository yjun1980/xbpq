/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.CharArrayWriter;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.RhinoException$1;
import org.mozilla.javascript.ScriptStackElement;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.StackStyle;

public abstract class RhinoException
extends RuntimeException {
    private static final Pattern JAVA_STACK_PATTERN;
    private static final long serialVersionUID = 1883500631321581169L;
    private static StackStyle stackStyle;
    private int columnNumber;
    int[] interpreterLineData;
    Object interpreterStackInfo;
    private int lineNumber;
    private String lineSource;
    private String sourceName;

    /*
     * Enabled aggressive block sorting
     */
    static {
        StackStyle stackStyle;
        JAVA_STACK_PATTERN = Pattern.compile("_c_(.*)_\\d+");
        RhinoException.stackStyle = stackStyle = StackStyle.RHINO;
        String string = System.getProperty("rhino.stack.style");
        if (string == null) return;
        if (!"Rhino".equalsIgnoreCase(string)) {
            if ("Mozilla".equalsIgnoreCase(string)) {
                stackStyle = StackStyle.MOZILLA;
            } else {
                if (!"V8".equalsIgnoreCase(string)) return;
                stackStyle = StackStyle.V8;
            }
        }
        RhinoException.stackStyle = stackStyle;
    }

    RhinoException() {
        Evaluator evaluator = Context.createInterpreter();
        if (evaluator != null) {
            evaluator.captureStackInfo(this);
        }
    }

    RhinoException(String object) {
        super((String)object);
        object = Context.createInterpreter();
        if (object != null) {
            object.captureStackInfo(this);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static String formatStackTrace(ScriptStackElement[] scriptStackElementArray, String object) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = SecurityUtilities.getSystemProperty("line.separator");
        if (stackStyle == StackStyle.V8 && !"null".equals(object)) {
            stringBuilder.append((String)object);
            stringBuilder.append(string);
        }
        int n2 = scriptStackElementArray.length;
        int n3 = 0;
        while (true) {
            block6: {
                block7: {
                    ScriptStackElement scriptStackElement;
                    block3: {
                        block4: {
                            block5: {
                                if (n3 >= n2) {
                                    return stringBuilder.toString();
                                }
                                scriptStackElement = scriptStackElementArray[n3];
                                int n4 = RhinoException$1.$SwitchMap$org$mozilla$javascript$StackStyle[stackStyle.ordinal()];
                                if (n4 == 1) break block3;
                                if (n4 == 2) break block4;
                                if (n4 == 3) break block5;
                                if (n4 != 4) break block6;
                                scriptStackElement.renderJavaStyle(stringBuilder);
                                break block7;
                            }
                            scriptStackElement.renderV8Style(stringBuilder);
                            break block7;
                        }
                        scriptStackElement.renderMozillaStyle(stringBuilder);
                        stringBuilder.append('\n');
                        break block6;
                    }
                    scriptStackElement.renderMozillaStyle(stringBuilder);
                }
                stringBuilder.append(string);
            }
            ++n3;
        }
    }

    private String generateStackTrace() {
        Object object = new CharArrayWriter();
        super.printStackTrace(new PrintWriter((Writer)object));
        String string = ((CharArrayWriter)object).toString();
        object = Context.createInterpreter();
        if (object != null) {
            return object.getPatchedStack(this, string);
        }
        return null;
    }

    public static StackStyle getStackStyle() {
        return stackStyle;
    }

    public static void setStackStyle(StackStyle stackStyle) {
        RhinoException.stackStyle = stackStyle;
    }

    public static void useMozillaStackStyle(boolean bl) {
        StackStyle stackStyle = bl ? StackStyle.MOZILLA : StackStyle.RHINO;
        RhinoException.stackStyle = stackStyle;
    }

    public static boolean usesMozillaStackStyle() {
        boolean bl = stackStyle == StackStyle.MOZILLA;
        return bl;
    }

    public final int columnNumber() {
        return this.columnNumber;
    }

    public String details() {
        return super.getMessage();
    }

    @Override
    public final String getMessage() {
        String string = this.details();
        CharSequence charSequence = string;
        if (this.sourceName != null) {
            if (this.lineNumber <= 0) {
                charSequence = string;
            } else {
                charSequence = new StringBuilder(string);
                ((StringBuilder)charSequence).append(" (");
                ((StringBuilder)charSequence).append(this.sourceName);
                if (this.lineNumber > 0) {
                    ((StringBuilder)charSequence).append('#');
                    ((StringBuilder)charSequence).append(this.lineNumber);
                }
                ((StringBuilder)charSequence).append(')');
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return charSequence;
    }

    public ScriptStackElement[] getScriptStack() {
        return this.getScriptStack(-1, null);
    }

    /*
     * WARNING - void declaration
     */
    public ScriptStackElement[] getScriptStack(int n2, String string) {
        Object object;
        ArrayList<ScriptStackElement> arrayList = new ArrayList<ScriptStackElement>();
        object = this.interpreterStackInfo != null && (object = Context.createInterpreter()) instanceof Interpreter ? ((Interpreter)object).getScriptStackElements(this) : null;
        StackTraceElement[] stackTraceElementArray = this.getStackTrace();
        boolean bl = string == null;
        int n3 = stackTraceElementArray.length;
        int n4 = 0;
        int n5 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n6;
            int n7;
            boolean bl2;
            block13: {
                StackTraceElement stackTraceElement;
                block11: {
                    void var14_25;
                    void var13_19;
                    String string2;
                    block14: {
                        block12: {
                            stackTraceElement = stackTraceElementArray[i2];
                            string2 = stackTraceElement.getFileName();
                            if (!stackTraceElement.getMethodName().startsWith("_c_") || stackTraceElement.getLineNumber() <= -1 || string2 != null && string2.endsWith(".java")) break block11;
                            String string3 = stackTraceElement.getMethodName();
                            Matcher matcher = JAVA_STACK_PATTERN.matcher(string3);
                            if (!"_c_script_0".equals(string3) && matcher.find()) {
                                String string4 = matcher.group(1);
                            } else {
                                Object var13_18 = null;
                            }
                            if (bl || !string.equals(var13_19)) break block12;
                            bl2 = true;
                            n7 = n4;
                            n6 = n5;
                            break block13;
                        }
                        bl2 = bl;
                        n7 = n4;
                        n6 = n5;
                        if (!bl) break block13;
                        if (n2 < 0) break block14;
                        bl2 = bl;
                        n7 = n4;
                        n6 = n5;
                        if (n5 >= n2) break block13;
                    }
                    String string5 = string2;
                    if (string2 == null) {
                        String string6 = "(unknown)";
                    }
                    arrayList.add(new ScriptStackElement((String)var14_25, (String)var13_19, stackTraceElement.getLineNumber()));
                    n6 = n5 + 1;
                    bl2 = bl;
                    n7 = n4;
                    break block13;
                }
                bl2 = bl;
                n7 = n4;
                n6 = n5;
                if (!"org.mozilla.javascript.Interpreter".equals(stackTraceElement.getClassName())) break block13;
                bl2 = bl;
                n7 = n4;
                n6 = n5;
                if (!"interpretLoop".equals(stackTraceElement.getMethodName())) break block13;
                bl2 = bl;
                n7 = n4;
                n6 = n5;
                if (object == null) break block13;
                bl2 = bl;
                n7 = n4;
                n6 = n5;
                if (((ScriptStackElement[][])object).length <= n4) break block13;
                for (ScriptStackElement scriptStackElement : object[n4]) {
                    block16: {
                        block17: {
                            block15: {
                                if (bl || !string.equals(scriptStackElement.functionName)) break block15;
                                bl2 = true;
                                n7 = n5;
                                break block16;
                            }
                            bl2 = bl;
                            n7 = n5;
                            if (!bl) break block16;
                            if (n2 < 0) break block17;
                            bl2 = bl;
                            n7 = n5;
                            if (n5 >= n2) break block16;
                        }
                        arrayList.add(scriptStackElement);
                        n7 = n5 + 1;
                        bl2 = bl;
                    }
                    bl = bl2;
                    n5 = n7;
                }
                n7 = n4 + 1;
                n6 = n5;
                bl2 = bl;
            }
            bl = bl2;
            n4 = n7;
            n5 = n6;
        }
        return arrayList.toArray(new ScriptStackElement[0]);
    }

    public String getScriptStackTrace() {
        return this.getScriptStackTrace(-1, null);
    }

    public String getScriptStackTrace(int n2, String string) {
        return RhinoException.formatStackTrace(this.getScriptStack(n2, string), this.details());
    }

    @Deprecated
    public String getScriptStackTrace(FilenameFilter filenameFilter) {
        return this.getScriptStackTrace();
    }

    public final void initColumnNumber(int n2) {
        if (n2 > 0) {
            if (this.columnNumber <= 0) {
                this.columnNumber = n2;
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException(String.valueOf(n2));
    }

    public final void initLineNumber(int n2) {
        if (n2 > 0) {
            if (this.lineNumber <= 0) {
                this.lineNumber = n2;
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException(String.valueOf(n2));
    }

    public final void initLineSource(String string) {
        if (string != null) {
            if (this.lineSource == null) {
                this.lineSource = string;
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }

    public final void initSourceName(String string) {
        if (string != null) {
            if (this.sourceName == null) {
                this.sourceName = string;
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }

    public final int lineNumber() {
        return this.lineNumber;
    }

    public final String lineSource() {
        return this.lineSource;
    }

    @Override
    public void printStackTrace(PrintStream printStream) {
        if (this.interpreterStackInfo == null) {
            super.printStackTrace(printStream);
        } else {
            printStream.print(this.generateStackTrace());
        }
    }

    @Override
    public void printStackTrace(PrintWriter printWriter) {
        if (this.interpreterStackInfo == null) {
            super.printStackTrace(printWriter);
        } else {
            printWriter.print(this.generateStackTrace());
        }
    }

    final void recordErrorOrigin(String string, int n2, String string2, int n3) {
        int n4 = n2;
        if (n2 == -1) {
            n4 = 0;
        }
        if (string != null) {
            this.initSourceName(string);
        }
        if (n4 != 0) {
            this.initLineNumber(n4);
        }
        if (string2 != null) {
            this.initLineSource(string2);
        }
        if (n3 != 0) {
            this.initColumnNumber(n3);
        }
    }

    public final String sourceName() {
        return this.sourceName;
    }
}

