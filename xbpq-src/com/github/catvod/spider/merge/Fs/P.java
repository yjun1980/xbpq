/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Dw.i;

public final class P {
    private String a;
    private int b = 0;

    public P(String string) {
        i.k(string);
        this.a = string;
    }

    public static String o(String object) {
        StringBuilder stringBuilder = e.a();
        object = ((String)object).toCharArray();
        int n2 = ((Object)object).length;
        Object object2 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object3 = object[i2];
            if (object3 != 92 || object2 == 92) {
                stringBuilder.append((char)object3);
            }
            object2 = object3;
        }
        return e.g(stringBuilder);
    }

    /*
     * Unable to fully structure code
     */
    public final String a(char var1_1, char var2_2) {
        var15_3 = 0;
        var10_4 = 0;
        var6_5 = 0;
        var9_6 = false;
        var4_7 = -1;
        var3_8 = -1;
        while (!this.i()) {
            block18: {
                var16_16 = this.c();
                var11_12 = var10_4;
                var8_11 = var6_5;
                var12_13 = var9_6;
                var13_14 = var4_7;
                if (var15_3 == 92) ** GOTO lbl64
                if (var16_16 == '\'' && var16_16 != var1_1 && var10_4 == 0) {
                    var5_9 = var9_6 ^ true;
                    var7_10 = var10_4;
                } else {
                    var7_10 = var10_4;
                    var5_9 = var9_6;
                    if (var16_16 == '\"') {
                        var7_10 = var10_4;
                        var5_9 = var9_6;
                        if (var16_16 != var1_1) {
                            var7_10 = var10_4;
                            var5_9 = var9_6;
                            if (!var9_6) {
                                var7_10 = var10_4 ^ 1;
                                var5_9 = var9_6;
                            }
                        }
                    }
                }
                var11_12 = var15_3;
                var10_4 = var7_10;
                var8_11 = var6_5++;
                var9_6 = var5_9;
                var13_14 = var4_7;
                var14_15 = var3_8;
                if (var5_9) break block18;
                if (var7_10 != 0) {
                    var11_12 = var15_3;
                    var10_4 = var7_10;
                    var8_11 = var6_5;
                    var9_6 = var5_9;
                    var13_14 = var4_7;
                    var14_15 = var3_8;
                } else {
                    if (var16_16 == var1_1) {
                        var11_12 = var7_10;
                        var8_11 = var6_5;
                        var12_13 = var5_9;
                        var13_14 = var4_7;
                        if (var4_7 == -1) {
                            var13_14 = this.b;
                            var11_12 = var7_10;
                            var8_11 = var6_5;
                            var12_13 = var5_9;
                        }
                    } else {
                        var11_12 = var7_10;
                        var8_11 = var6_5;
                        var12_13 = var5_9;
                        var13_14 = var4_7;
                        if (var16_16 == var2_2) {
                            var8_11 = var6_5 - 1;
                            var13_14 = var4_7;
                            var12_13 = var5_9;
                            var11_12 = var7_10;
                        }
                    }
lbl64:
                    // 5 sources

                    var14_15 = var3_8;
                    if (var8_11 > 0) {
                        var14_15 = var3_8;
                        if (var15_3 != 0) {
                            var14_15 = this.b;
                        }
                    }
                    var3_8 = var16_16;
                    var9_6 = var12_13;
                    var10_4 = var11_12;
                    var11_12 = var3_8;
                }
            }
            var15_3 = var11_12;
            var6_5 = var8_11;
            var4_7 = var13_14;
            var3_8 = var14_15;
            if (var8_11 > 0) continue;
            var3_8 = var14_15;
            var4_7 = var13_14;
            var6_5 = var8_11;
            break;
        }
        var17_17 = var3_8 >= 0 ? this.a.substring(var4_7, var3_8) : "";
        if (var6_5 <= 0) {
            return var17_17;
        }
        var18_18 = new StringBuilder();
        var18_18.append("Did not find balanced marker at '");
        var18_18.append(var17_17);
        var18_18.append("'");
        i.a(var18_18.toString());
        throw null;
    }

    public final String b() {
        String string;
        int n2 = this.a.indexOf(")", this.b);
        if (n2 != -1) {
            string = this.a.substring(this.b, n2);
            n2 = this.b;
            this.b = string.length() + n2;
        } else {
            string = this.n();
        }
        this.j(")");
        return string;
    }

    public final char c() {
        String string = this.a;
        int n2 = this.b;
        this.b = n2 + 1;
        return string.charAt(n2);
    }

    public final void d(String string) {
        if (this.k(string)) {
            int n2;
            int n3;
            int n4 = string.length();
            if (n4 <= (n3 = this.a.length()) - (n2 = this.b)) {
                this.b = n2 + n4;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public final String e() {
        int n2 = this.b;
        while (!this.i()) {
            if (!this.m()) {
                char c2;
                boolean bl = this.i();
                char c3 = '\u0000';
                if (bl) {
                    c2 = c3;
                } else {
                    int n3 = 0;
                    while (true) {
                        c2 = c3;
                        if (n3 >= 2) break;
                        c2 = (new char[]{'-', '_'})[n3];
                        if (this.a.charAt(this.b) == c2) {
                            c2 = '\u0001';
                            break;
                        }
                        ++n3;
                    }
                }
                if (c2 == '\u0000') break;
            }
            ++this.b;
        }
        return this.a.substring(n2, this.b);
    }

    public final String f() {
        int n2 = this.b;
        while (!this.i() && (this.m() || this.l("*|", "|", "_", "-"))) {
            ++this.b;
        }
        return this.a.substring(n2, this.b);
    }

    public final String g(String ... stringArray) {
        int n2 = this.b;
        while (!this.i() && !this.l(stringArray)) {
            ++this.b;
        }
        return this.a.substring(n2, this.b);
    }

    public final boolean h() {
        boolean bl;
        boolean bl2 = false;
        while (bl = !this.i() && e.d(this.a.charAt(this.b))) {
            ++this.b;
            bl2 = true;
        }
        return bl2;
    }

    public final boolean i() {
        boolean bl = this.a.length() - this.b == 0;
        return bl;
    }

    public final boolean j(String string) {
        if (this.k(string)) {
            int n2 = this.b;
            this.b = string.length() + n2;
            return true;
        }
        return false;
    }

    public final boolean k(String string) {
        return this.a.regionMatches(true, this.b, string, 0, string.length());
    }

    public final boolean l(String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.k(stringArray[i2])) continue;
            return true;
        }
        return false;
    }

    public final boolean m() {
        boolean bl = !this.i() && Character.isLetterOrDigit(this.a.charAt(this.b));
        return bl;
    }

    public final String n() {
        String string = this.a.substring(this.b);
        this.b = this.a.length();
        return string;
    }

    public final String toString() {
        return this.a.substring(this.b);
    }
}

