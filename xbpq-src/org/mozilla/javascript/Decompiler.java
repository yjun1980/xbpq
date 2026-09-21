/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.math.BigInteger;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.UintMap;

public class Decompiler {
    public static final int CASE_GAP_PROP = 3;
    private static final int FUNCTION_END = 175;
    public static final int INDENT_GAP_PROP = 2;
    public static final int INITIAL_INDENT_PROP = 1;
    public static final int ONLY_BODY_FLAG = 1;
    public static final int TO_SOURCE_FLAG = 2;
    private static final boolean printSource = false;
    private char[] sourceBuffer = new char[128];
    private int sourceTop;

    private void append(char c2) {
        int n2 = this.sourceTop;
        if (n2 == this.sourceBuffer.length) {
            this.increaseSourceCapacity(n2 + 1);
        }
        char[] cArray = this.sourceBuffer;
        n2 = this.sourceTop;
        cArray[n2] = c2;
        this.sourceTop = n2 + 1;
    }

    private void appendString(String string) {
        int n2;
        char[] cArray;
        int n3 = string.length();
        int n4 = n3 >= 32768 ? 2 : 1;
        if ((n4 = this.sourceTop + n4 + n3) > this.sourceBuffer.length) {
            this.increaseSourceCapacity(n4);
        }
        if (n3 >= 32768) {
            cArray = this.sourceBuffer;
            n2 = this.sourceTop;
            cArray[n2] = (char)(0x8000 | n3 >>> 16);
            this.sourceTop = n2 + 1;
        }
        cArray = this.sourceBuffer;
        n2 = this.sourceTop;
        cArray[n2] = (char)n3;
        this.sourceTop = ++n2;
        string.getChars(0, n3, cArray, n2);
        this.sourceTop = n4;
    }

    /*
     * Exception decompiling
     */
    public static String decompile(String var0, int var1_1, UintMap var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IllegalStateException: Backjump on non jumping statement @NONE, blocks:[0, 34, 101] lbl402 : CaseStatement: case 39:\u000acase 48:
         * 
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
         *     at org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:550)
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

    private static int getNext(String string, int n2, int n3) {
        n2 = ++n3 < n2 ? (int)string.charAt(n3) : 0;
        return n2;
    }

    private static int getSourceStringEnd(String string, int n2) {
        return Decompiler.printSourceString(string, n2, false, null);
    }

    private void increaseSourceCapacity(int n2) {
        char[] cArray;
        int n3;
        if (n2 <= this.sourceBuffer.length) {
            Kit.codeBug();
        }
        if ((n3 = (cArray = this.sourceBuffer).length * 2) >= n2) {
            n2 = n3;
        }
        char[] cArray2 = new char[n2];
        System.arraycopy(cArray, 0, cArray2, 0, this.sourceTop);
        this.sourceBuffer = cArray2;
    }

    private static int printSourceBigInt(String string, int n2, StringBuilder stringBuilder) {
        int n3 = string.charAt(n2);
        int n4 = n2 + 1;
        int n5 = n3;
        n2 = n4;
        if ((0x8000 & n3) != 0) {
            n5 = (n3 & Short.MAX_VALUE) << 16 | string.charAt(n4);
            n2 = n4 + 1;
        }
        if (stringBuilder != null) {
            stringBuilder.append(string.substring(n2, n2 + n5));
            stringBuilder.append('n');
        }
        return n2 + n5;
    }

    private static int printSourceNumber(String string, int n2, StringBuilder stringBuilder) {
        char c2 = string.charAt(n2);
        ++n2;
        double d2 = 0.0;
        if (c2 == 'S') {
            if (stringBuilder != null) {
                d2 = string.charAt(n2);
            }
            ++n2;
        } else {
            if (c2 != 'J' && c2 != 'D') {
                throw new RuntimeException();
            }
            if (stringBuilder != null) {
                long l2 = (long)string.charAt(n2) << 48 | (long)string.charAt(n2 + 1) << 32 | (long)string.charAt(n2 + 2) << 16 | (long)string.charAt(n2 + 3);
                d2 = c2 == 'J' ? (double)l2 : Double.longBitsToDouble(l2);
            }
            n2 += 4;
        }
        if (stringBuilder != null) {
            stringBuilder.append(ScriptRuntime.numberToString(d2, 10));
        }
        return n2;
    }

    private static int printSourceString(String string, int n2, boolean bl, StringBuilder stringBuilder) {
        int n3 = string.charAt(n2);
        int n4 = n2 + 1;
        int n5 = n3;
        n2 = n4;
        if ((0x8000 & n3) != 0) {
            n5 = (n3 & Short.MAX_VALUE) << 16 | string.charAt(n4);
            n2 = n4 + 1;
        }
        if (stringBuilder != null) {
            string = string.substring(n2, n2 + n5);
            if (!bl) {
                stringBuilder.append(string);
            } else {
                stringBuilder.append('\"');
                stringBuilder.append(ScriptRuntime.escapeString(string));
                stringBuilder.append('\"');
            }
        }
        return n2 + n5;
    }

    private String sourceToString(int n2) {
        if (n2 < 0 || this.sourceTop < n2) {
            Kit.codeBug();
        }
        return new String(this.sourceBuffer, n2, this.sourceTop - n2);
    }

    void addBigInt(BigInteger bigInteger) {
        this.addToken(83);
        this.appendString(bigInteger.toString());
    }

    void addEOL(int n2) {
        if (n2 >= 0 && n2 <= 174) {
            this.append((char)n2);
            this.append('\u0001');
            return;
        }
        throw new IllegalArgumentException();
    }

    void addName(String string) {
        this.addToken(39);
        this.appendString(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    void addNumber(double d2) {
        char c2;
        this.addToken(40);
        long l2 = (long)d2;
        if ((double)l2 != d2) {
            l2 = Double.doubleToLongBits(d2);
            this.append('D');
            this.append((char)(l2 >> 48));
            this.append((char)(l2 >> 32));
            this.append((char)(l2 >> 16));
            c2 = (char)l2;
        } else {
            if (l2 < 0L) {
                Kit.codeBug();
            }
            if (l2 <= 65535L) {
                c2 = 'S';
            } else {
                this.append('J');
                this.append((char)(l2 >> 48));
                this.append((char)(l2 >> 32));
                c2 = (char)(l2 >> 16);
            }
            this.append(c2);
            c2 = (char)l2;
        }
        this.append(c2);
    }

    void addRegexp(String string, String string2) {
        this.addToken(48);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('/');
        stringBuilder.append(string);
        stringBuilder.append('/');
        stringBuilder.append(string2);
        this.appendString(stringBuilder.toString());
    }

    void addString(String string) {
        this.addToken(41);
        this.appendString(string);
    }

    void addTemplateLiteral(String string) {
        this.addToken(171);
        this.appendString(string);
    }

    void addToken(int n2) {
        if (n2 >= 0 && n2 <= 174) {
            this.append((char)n2);
            return;
        }
        throw new IllegalArgumentException();
    }

    int getCurrentOffset() {
        return this.sourceTop;
    }

    String getEncodedSource() {
        return this.sourceToString(0);
    }

    int markFunctionEnd(int n2) {
        n2 = this.getCurrentOffset();
        this.append('\u00af');
        return n2;
    }

    @Deprecated
    int markFunctionStart(int n2) {
        return this.markFunctionStart(n2, false);
    }

    int markFunctionStart(int n2, boolean bl) {
        int n3 = this.getCurrentOffset();
        if (n2 != 4) {
            this.addToken(113);
            if (bl) {
                this.addToken(23);
            }
            this.append((char)n2);
        }
        return n3;
    }
}

