/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L1;

import com.github.catvod.spider.merge.n1.i;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ScriptRuntime;

final class a {
    private boolean a;
    private char[] b = new char[128];
    private int c;
    private final int[] d = new int[3];
    private int e;
    private int f = -1;
    int g;
    private final String h;
    private int i;
    private int j;
    int k;
    int l;

    a(String string) {
        this.h = string;
        this.i = 0;
        this.j = 0;
        this.g = 0;
    }

    private void a(int n2) {
        int n3 = this.c;
        char[] cArray = this.b;
        if (n3 == cArray.length) {
            char[] cArray2 = new char[cArray.length * 2];
            System.arraycopy(cArray, 0, cArray2, 0, n3);
            this.b = cArray2;
        }
        this.b[n3] = (char)n2;
        this.c = n3 + 1;
    }

    private int b() {
        return this.c(true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int c(boolean bl, boolean bl2) {
        char c2;
        block8: {
            int n2 = this.e;
            if (n2 != 0) {
                ++this.j;
                int[] nArray = this.d;
                this.e = --n2;
                return nArray[n2];
            }
            while (true) {
                if (this.i == this.h.length()) {
                    return -1;
                }
                ++this.j;
                String string = this.h;
                n2 = this.i;
                this.i = n2 + 1;
                c2 = string.charAt(n2);
                if (!bl2 && (n2 = this.f) >= 0) {
                    if (n2 == 13 && c2 == '\n') {
                        this.f = 10;
                        continue;
                    }
                    this.f = -1;
                    ++this.g;
                }
                if (c2 <= '\u007f') {
                    if (c2 != '\n') {
                        n2 = c2;
                        if (c2 != '\r') return n2;
                    }
                    break block8;
                }
                if (c2 == '\ufeff') {
                    return c2;
                }
                if (!bl || (n2 = c2 > '\u007f' && Character.getType(c2) == 16 ? 1 : 0) == 0) break;
            }
            n2 = c2;
            if (!ScriptRuntime.isJSLineTerminator(c2)) return n2;
        }
        this.f = c2;
        return 10;
    }

    private static boolean e(int n2) {
        boolean bl = 48 <= n2 && n2 <= 57;
        return bl;
    }

    private static boolean f(int n2, int n3) {
        boolean bl;
        block4: {
            block3: {
                boolean bl2;
                boolean bl3 = false;
                if (n2 == 10 && com.github.catvod.spider.merge.L1.a.e(n3) || n2 == 16 && (bl2 = 48 <= n3 && n3 <= 57 || 97 <= n3 && n3 <= 102 || 65 <= n3 && n3 <= 70) || n2 == 8 && (bl2 = 48 <= n3 && n3 <= 55)) break block3;
                bl = bl3;
                if (n2 != 2) break block4;
                n2 = 48 != n3 && n3 != 49 ? 0 : 1;
                bl = bl3;
                if (n2 == 0) break block4;
            }
            bl = true;
        }
        return bl;
    }

    private boolean g(int n2) {
        int n3 = this.c(true, true);
        if (n3 == n2) {
            this.l = this.j;
            return true;
        }
        this.l(n3);
        return false;
    }

    private int h(int n2, int n3) {
        int n4;
        block6: {
            n4 = n3;
            if (com.github.catvod.spider.merge.L1.a.f(n2, n3)) {
                this.a(n3);
                n3 = n4 = this.b();
                if (n4 == -1) {
                    return -1;
                }
                while (true) {
                    if (n3 == 95) {
                        n3 = this.b();
                        if (n3 != 10 && n3 != -1) {
                            if (!com.github.catvod.spider.merge.L1.a.f(n2, n3)) {
                                this.k(n3);
                                return 95;
                            }
                            this.a(95);
                            continue;
                        }
                        return -2;
                    }
                    n4 = n3;
                    if (!com.github.catvod.spider.merge.L1.a.f(n2, n3)) break block6;
                    this.a(n3);
                    n3 = n4 = this.b();
                    if (n4 == -1) break;
                }
                return -1;
            }
        }
        return n4;
    }

    private void j() {
        int n2;
        while ((n2 = this.b()) != -1 && n2 != 10) {
        }
        this.k(n2);
        this.l = this.j;
    }

    private void k(int n2) {
        int n3 = this.e;
        if (n3 != 0 && this.d[n3 - 1] == 10) {
            Kit.codeBug();
        }
        int[] nArray = this.d;
        n3 = this.e;
        this.e = n3 + 1;
        nArray[n3] = n2;
        --this.j;
    }

    private void l(int n2) {
        int[] nArray = this.d;
        int n3 = this.e;
        this.e = n3 + 1;
        nArray[n3] = n2;
        --this.j;
    }

    /*
     * Exception decompiling
     */
    final int d() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [79[CASE], 89[CASE]], but top level block is 96[SWITCH]
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

    final void i(int n2) {
        block16: {
            int n3;
            int n4;
            block15: {
                block14: {
                    n4 = this.k;
                    n3 = 0;
                    this.c = 0;
                    if (n2 != 62) break block14;
                    this.a(61);
                    break block15;
                }
                if (n2 != 20) {
                    Kit.codeBug();
                }
                n2 = this.b();
                this.k(n2);
                if (n2 == 42) break block16;
            }
            n2 = 0;
            while (true) {
                int n5;
                int n6;
                block17: {
                    block19: {
                        block20: {
                            block18: {
                                if ((n6 = this.b()) != 47 || n2 != 0) break block17;
                                while ("gimysu".indexOf(n5 = this.c(true, true)) != -1) {
                                    this.a(n5);
                                }
                                if (n5 > 90) break block18;
                                n2 = n3;
                                if (65 > n5) break block19;
                                break block20;
                            }
                            n2 = n3;
                            if (97 > n5) break block19;
                            n2 = n3;
                            if (n5 > 122) break block19;
                        }
                        n2 = 1;
                    }
                    if (n2 == 0) {
                        this.l(n5);
                        this.l = n4 + this.c + 2;
                        return;
                    }
                    throw new i("msg.invalid.re.flag");
                }
                if (n6 == 10 || n6 == -1) break;
                if (n6 == 92) {
                    this.a(n6);
                    n5 = this.b();
                    if (n5 == 10 || n5 == -1) {
                        throw new i("msg.unterminated.re.lit");
                    }
                } else if (n6 == 91) {
                    n2 = 1;
                    n5 = n6;
                } else {
                    n5 = n6;
                    if (n6 == 93) {
                        n2 = 0;
                        n5 = n6;
                    }
                }
                this.a(n5);
            }
            throw new i("msg.unterminated.re.lit");
        }
        this.l = this.j - 1;
        throw new i("msg.unterminated.re.lit");
    }
}

