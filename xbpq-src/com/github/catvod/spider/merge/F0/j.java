/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.I.r;
import java.io.IOException;
import java.io.Reader;

final class j {
    static final char[] n = new char[]{'r', 'u', 'e'};
    static final char[] o = new char[]{'a', 'l', 's', 'e'};
    static final char[] p = new char[]{'u', 'l', 'l'};
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    protected int h;
    private final Reader i;
    private final char[] j;
    private int k;
    protected StringBuilder l;
    protected boolean m;

    j(Reader reader) {
        block4: {
            int n2;
            this.a = 1;
            this.j = new char[32768];
            this.l = new StringBuilder();
            this.i = reader;
            this.g = this.j();
            do {
                n2 = this.g(256);
                for (int i2 = 0; i2 < n2; ++i2) {
                    char c2 = this.j[this.h];
                    if (!this.i(c2)) {
                        this.h();
                        break block4;
                    }
                    if (c2 == '\n') {
                        ++this.a;
                        this.b = this.h + 1 + this.c;
                        this.d = 0;
                    }
                    ++this.h;
                }
            } while (n2 > 0);
            this.g = true;
        }
    }

    private int a() {
        if (this.g) {
            return -1;
        }
        char[] cArray = this.j;
        int n2 = this.h;
        char c2 = cArray[n2];
        if (c2 == '\n') {
            ++this.a;
            this.b = n2 + 1 + this.c;
            this.d = 0;
        }
        this.h = ++n2;
        if (n2 >= this.k) {
            this.g = this.j();
        }
        return c2;
    }

    private boolean j() {
        int n2;
        block3: {
            try {
                Reader reader = this.i;
                char[] cArray = this.j;
                n2 = reader.read(cArray, 0, cArray.length);
                if (n2 > 0) break block3;
                return true;
            }
            catch (IOException iOException) {
                throw this.f(iOException, "IOException", true);
            }
        }
        this.c += this.k;
        this.h = 0;
        this.k = n2;
        return false;
    }

    private char k() {
        int n2;
        Object object = this.j;
        int n3 = this.h;
        this.h = n2 = n3 + 1;
        char c2 = object[n3];
        if (c2 < ' ') {
            if (c2 == '\n') {
                ++this.a;
                this.b = n2 + 1 + this.c;
                this.d = 0;
            }
            object = com.github.catvod.spider.merge.C.a.c("Strings may not contain control characters: 0x");
            ((StringBuilder)object).append(Integer.toString(c2, 16));
            throw this.f(null, ((StringBuilder)object).toString(), false);
        }
        return c2;
    }

    /*
     * Exception decompiling
     */
    final int b(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[CASE]], but top level block is 8[SWITCH]
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

    final void c(char c2, char[] cArray) {
        int n2 = this.g(cArray.length);
        int n3 = cArray.length;
        if (n2 >= n3) {
            int n4;
            for (n4 = 0; n4 < cArray.length; ++n4) {
                char[] cArray2 = this.j;
                n2 = this.h;
                this.h = n2 + 1;
                if (cArray2[n2] == cArray[n4]) {
                    continue;
                }
                throw this.e(c2, cArray, n4);
            }
            this.h();
            n4 = this.g ? -1 : this.j[this.h];
            if (n4 != 9 && n4 != 10 && n4 != 13 && n4 != 32 && n4 != 44 && n4 != 58 && n4 != 91 && n4 != 93 && n4 != 123 && n4 != 125) {
                throw this.e(c2, cArray, cArray.length);
            }
            return;
        }
        throw this.e(c2, cArray, 0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final void d() {
        this.l.setLength(0);
        while ((var4_3 = this.g(256)) != 0) {
            for (var3_2 = 0; var3_2 < var4_3; ++var3_2) {
                block16: {
                    var1_1 = this.k();
                    if (this.i(var1_1) || var1_1 == ':') break block16;
                    if (var1_1 != '\\') {
                        if (var1_1 != '[' && var1_1 != ']' && var1_1 != '{' && var1_1 != '}' && var1_1 != ',') {
                            continue;
                        }
                        var7_4 = new StringBuilder();
                        var7_4.append("Invalid character in semi-string: ");
                        var7_4.append(var1_1);
                        throw this.f(null, var7_4.toString(), false);
                    }
                    this.l.append(this.j, this.h - var3_2 - 1, var3_2);
                    --this.h;
                    while ((var3_2 = this.g(256)) != 0) {
                        var4_3 = this.h + var3_2;
                        block7: while ((var3_2 = this.h) < var4_3) {
                            block17: {
                                block18: {
                                    var1_1 = this.k();
                                    if (var1_1 == '\t' || var1_1 == '\n' || var1_1 == '\r' || var1_1 == ' ') break block17;
                                    if (var1_1 == ',') break block18;
                                    if (var1_1 == ':') break block17;
                                    if (var1_1 == '{' || var1_1 == '}') break block18;
                                    switch (var1_1) {
                                        default: {
                                            ** GOTO lbl107
                                        }
                                        case '\\': {
                                            var3_2 = var4_3;
                                            if (var4_3 - this.h < 5) {
                                                var4_3 = this.g(5);
                                                var3_2 = this.h;
                                                if (this.j[var3_2] == 'u' && var4_3 < 5) {
                                                    this.h = this.k;
                                                    throw this.f(null, "EOF encountered in the middle of a string escape", false);
                                                }
                                                var3_2 += var4_3;
                                            }
                                            var7_5 = this.j;
                                            var4_3 = this.h;
                                            this.h = var4_3 + 1;
                                            var2_6 = var7_5[var4_3];
                                            var1_1 = (char)var2_6;
                                            var4_3 = var3_2;
                                            if (var2_6 == 34) ** GOTO lbl107
                                            var1_1 = (char)var2_6;
                                            var4_3 = var3_2;
                                            if (var2_6 == 47) ** GOTO lbl107
                                            var1_1 = (char)var2_6;
                                            var4_3 = var3_2;
                                            if (var2_6 == 92) ** GOTO lbl107
                                            if (var2_6 == 98) ** GOTO lbl104
                                            if (var2_6 == 102) ** GOTO lbl101
                                            if (var2_6 == 110) ** GOTO lbl98
                                            if (var2_6 == 114) ** GOTO lbl95
                                            if (var2_6 == 116) ** GOTO lbl92
                                            if (var2_6 != 117) ** GOTO lbl86
                                            var4_3 = 0;
                                            for (var5_7 = 0; var5_7 < 4; ++var5_7) {
                                                var7_5 = this.j;
                                                var6_8 /* !! */  = this.h;
                                                this.h = var6_8 /* !! */  + 1;
                                                if ((var6_8 /* !! */  = (int)var7_5[var6_8 /* !! */ ]) < 48 || var6_8 /* !! */  > 57) ** GOTO lbl65
                                                var6_8 /* !! */  -= 48;
                                                ** GOTO lbl71
lbl65:
                                                // 1 sources

                                                if (var6_8 /* !! */  < 65 || var6_8 /* !! */  > 70) ** GOTO lbl68
                                                var6_8 /* !! */  -= 65;
                                                ** GOTO lbl70
lbl68:
                                                // 1 sources

                                                if (var6_8 /* !! */  < 97 || var6_8 /* !! */  > 102) ** GOTO lbl73
                                                var6_8 /* !! */  -= 97;
lbl70:
                                                // 2 sources

                                                var6_8 /* !! */  += 10;
lbl71:
                                                // 2 sources

                                                var4_3 = var4_3 << 4 | var6_8 /* !! */ ;
                                                continue;
lbl73:
                                                // 1 sources

                                                var7_5 = com.github.catvod.spider.merge.C.a.c("Expected unicode hex escape character: ");
                                                var7_5.append((char)var6_8 /* !! */ );
                                                var7_5.append(" (");
                                                var7_5.append(var6_8 /* !! */ );
                                                var7_5.append(")");
                                                throw this.f(null, var7_5.toString(), false);
                                            }
                                            var7_5 = this.l;
                                            var1_1 = (char)var4_3;
                                            ** GOTO lbl109
lbl86:
                                            // 1 sources

                                            var7_5 = new StringBuilder();
                                            var7_5.append("Invalid escape: \\");
                                            var7_5.append((char)var2_6);
                                            throw this.f(null, var7_5.toString(), false);
lbl92:
                                            // 1 sources

                                            this.l.append('\t');
                                            ** GOTO lbl111
lbl95:
                                            // 1 sources

                                            var7_5 = this.l;
                                            var1_1 = '\r';
                                            ** GOTO lbl109
lbl98:
                                            // 1 sources

                                            this.l.append('\n');
                                            ** GOTO lbl111
lbl101:
                                            // 1 sources

                                            var7_5 = this.l;
                                            var1_1 = '\f';
                                            ** GOTO lbl109
lbl104:
                                            // 1 sources

                                            var7_5 = this.l;
                                            var1_1 = '\b';
                                            ** GOTO lbl109
lbl107:
                                            // 4 sources

                                            var7_5 = this.l;
                                            var3_2 = var4_3;
lbl109:
                                            // 5 sources

                                            var7_5.append(var1_1);
lbl111:
                                            // 3 sources

                                            var4_3 = var3_2;
                                            continue block7;
                                        }
                                        case '[': 
                                        case ']': 
                                    }
                                }
                                var7_5 = new StringBuilder();
                                var7_5.append("Invalid character in semi-string: ");
                                var7_5.append(var1_1);
                                throw this.f(null, var7_5.toString(), false);
                            }
                            this.h();
                            return;
                        }
                        var4_3 = this.k;
                        if (var3_2 <= var4_3) continue;
                        this.h = var4_3;
                        throw this.f(null, "EOF encountered in the middle of a string escape", false);
                    }
                    throw this.f(null, "String was not terminated before end of input", true);
                }
                this.l.append(this.j, this.h - var3_2 - 1, var3_2);
                this.h();
                return;
            }
            this.l.append(this.j, this.h - var4_3, var4_3);
        }
        throw this.f(null, "String was not terminated before end of input", true);
    }

    final h e(char c2, char[] object, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2);
        CharSequence charSequence = "";
        CharSequence charSequence2 = object == null ? "" : new String((char[])object, 0, n2);
        stringBuilder.append((String)charSequence2);
        stringBuilder = new StringBuilder(stringBuilder.toString());
        while (true) {
            n2 = this.g ? -1 : this.j[this.h];
            if ((n2 = n2 >= 65 && n2 <= 90 || n2 >= 97 && n2 <= 122 ? 1 : 0) == 0 || stringBuilder.length() >= 15) break;
            stringBuilder.append((char)this.a());
        }
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append("Unexpected token '");
        ((StringBuilder)charSequence2).append((Object)stringBuilder);
        ((StringBuilder)charSequence2).append("'");
        if (object == null) {
            object = charSequence;
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(". Did you mean '");
            ((StringBuilder)charSequence).append(c2);
            ((StringBuilder)charSequence).append(new String((char[])object));
            ((StringBuilder)charSequence).append("'?");
            object = ((StringBuilder)charSequence).toString();
        }
        ((StringBuilder)charSequence2).append((String)object);
        return this.f(null, ((StringBuilder)charSequence2).toString(), true);
    }

    final h f(Exception exception, String charSequence, boolean bl) {
        if (bl) {
            charSequence = r.d((String)charSequence, " on line ");
            ((StringBuilder)charSequence).append(this.a);
            ((StringBuilder)charSequence).append(", char ");
            ((StringBuilder)charSequence).append(this.e);
            return new h(exception, ((StringBuilder)charSequence).toString());
        }
        int n2 = Math.max(1, this.h + this.c - this.b - this.d);
        charSequence = r.d((String)charSequence, " on line ");
        ((StringBuilder)charSequence).append(this.a);
        ((StringBuilder)charSequence).append(", char ");
        ((StringBuilder)charSequence).append(n2);
        return new h(exception, ((StringBuilder)charSequence).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final int g(int n2) {
        int n3 = this.k;
        int n4 = this.h;
        if (n3 - n2 >= n4) {
            return n2;
        }
        if (n4 > 0) {
            this.c += n4;
            this.k = n3 -= n4;
            char[] cArray = this.j;
            System.arraycopy(cArray, n4, cArray, 0, n3);
            this.h = 0;
        }
        try {
            do {
                char[] cArray;
                if ((n4 = (cArray = this.j).length) <= (n3 = this.k)) {
                    IOException iOException = new IOException("Unexpected internal error");
                    throw iOException;
                }
                n4 = this.i.read(cArray, n3, cArray.length - n3);
                if (n4 <= 0) {
                    return this.k - this.h;
                }
                this.k = n4 = this.k + n4;
            } while (n4 <= n2);
            return n4 - this.h;
        }
        catch (IOException iOException) {
            throw this.f(iOException, "IOException", true);
        }
    }

    final void h() {
        if (this.h >= this.k) {
            this.g = this.j();
        }
    }

    final boolean i(int n2) {
        boolean bl = n2 == 32 || n2 == 10 || n2 == 13 || n2 == 9;
        return bl;
    }
}

