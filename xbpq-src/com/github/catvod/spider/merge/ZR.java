/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.tv;

public class ZR {
    private int S = 0;
    private String l8;

    public ZR(String string) {
        Rc.HM(string);
        this.l8 = string;
    }

    public static String c(String object) {
        StringBuilder stringBuilder = tv.S();
        object = ((String)object).toCharArray();
        int n2 = ((Object)object).length;
        Object object2 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object3 = object[i2];
            if (object3 == 92) {
                if (object2 == 92) {
                    stringBuilder.append((char)object3);
                }
            } else {
                stringBuilder.append((char)object3);
            }
            object2 = object3;
        }
        return tv.cD(stringBuilder);
    }

    private int uS() {
        return this.l8.length() - this.S;
    }

    public boolean A(String string) {
        return this.l8.regionMatches(true, this.S, string, 0, string.length());
    }

    public String E9() {
        String string = this.l8.substring(this.S);
        this.S = this.l8.length();
        return string;
    }

    public boolean HM() {
        boolean bl = false;
        while (this.hR()) {
            ++this.S;
            bl = true;
        }
        return bl;
    }

    public boolean Kf() {
        boolean bl = !this.n() && Character.isLetterOrDigit(this.l8.charAt(this.S));
        return bl;
    }

    public String N(String ... stringArray) {
        int n2 = this.S;
        while (!this.n() && !this.s(stringArray)) {
            ++this.S;
        }
        return this.l8.substring(n2, this.S);
    }

    public String OL() {
        int n2 = this.S;
        while (!this.n() && (this.Kf() || this.cD('-', '_'))) {
            ++this.S;
        }
        return this.l8.substring(n2, this.S);
    }

    public String S(String string) {
        String string2 = this.tT(string);
        this.v(string);
        return string2;
    }

    public char T4() {
        String string = this.l8;
        int n2 = this.S;
        this.S = n2 + 1;
        return string.charAt(n2);
    }

    public void b(String string) {
        if (this.A(string)) {
            int n2 = string.length();
            if (n2 <= this.uS()) {
                this.S += n2;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public boolean cD(char ... cArray) {
        if (this.n()) {
            return false;
        }
        for (char c2 : cArray) {
            if (this.l8.charAt(this.S) != c2) continue;
            return true;
        }
        return false;
    }

    public boolean hR() {
        boolean bl = !this.n() && tv.HM(this.l8.charAt(this.S));
        return bl;
    }

    public String l() {
        int n2 = this.S;
        while (!this.n() && (this.Kf() || this.s("*|", "|", "_", "-"))) {
            ++this.S;
        }
        return this.l8.substring(n2, this.S);
    }

    /*
     * Unable to fully structure code
     */
    public String l8(char var1_1, char var2_2) {
        var15_3 = 0;
        var10_4 = 0;
        var7_5 = 0;
        var9_6 = false;
        var4_7 = -1;
        var3_8 = -1;
        while (!this.n()) {
            block18: {
                var16_16 = this.T4();
                var11_12 = var10_4;
                var8_11 = var7_5;
                var12_13 = var9_6;
                var13_14 = var4_7;
                if (var15_3 == 92) ** GOTO lbl64
                if (var16_16 == '\'' && var16_16 != var1_1 && var10_4 == 0) {
                    var6_10 = var9_6 ^ true;
                    var5_9 = var10_4;
                } else {
                    var5_9 = var10_4;
                    var6_10 = var9_6;
                    if (var16_16 == '\"') {
                        var5_9 = var10_4;
                        var6_10 = var9_6;
                        if (var16_16 != var1_1) {
                            var5_9 = var10_4;
                            var6_10 = var9_6;
                            if (!var9_6) {
                                var5_9 = var10_4 ^ 1;
                                var6_10 = var9_6;
                            }
                        }
                    }
                }
                var11_12 = var15_3;
                var10_4 = var5_9;
                var8_11 = var7_5++;
                var9_6 = var6_10;
                var13_14 = var4_7;
                var14_15 = var3_8;
                if (var6_10) break block18;
                if (var5_9 != 0) {
                    var11_12 = var15_3;
                    var10_4 = var5_9;
                    var8_11 = var7_5;
                    var9_6 = var6_10;
                    var13_14 = var4_7;
                    var14_15 = var3_8;
                } else {
                    if (var16_16 == var1_1) {
                        var11_12 = var5_9;
                        var8_11 = var7_5;
                        var12_13 = var6_10;
                        var13_14 = var4_7;
                        if (var4_7 == -1) {
                            var13_14 = this.S;
                            var11_12 = var5_9;
                            var8_11 = var7_5;
                            var12_13 = var6_10;
                        }
                    } else {
                        var11_12 = var5_9;
                        var8_11 = var7_5;
                        var12_13 = var6_10;
                        var13_14 = var4_7;
                        if (var16_16 == var2_2) {
                            var8_11 = var7_5 - 1;
                            var13_14 = var4_7;
                            var12_13 = var6_10;
                            var11_12 = var5_9;
                        }
                    }
lbl64:
                    // 5 sources

                    var14_15 = var3_8;
                    if (var8_11 > 0) {
                        var14_15 = var3_8;
                        if (var15_3 != 0) {
                            var14_15 = this.S;
                        }
                    }
                    var3_8 = var16_16;
                    var9_6 = var12_13;
                    var10_4 = var11_12;
                    var11_12 = var3_8;
                }
            }
            var15_3 = var11_12;
            var7_5 = var8_11;
            var4_7 = var13_14;
            var3_8 = var14_15;
            if (var8_11 > 0) continue;
            var3_8 = var14_15;
            var4_7 = var13_14;
            var7_5 = var8_11;
            break;
        }
        var17_17 = var3_8 >= 0 ? this.l8.substring(var4_7, var3_8) : "";
        if (var7_5 > 0) {
            var18_18 = new StringBuilder();
            var18_18.append("Did not find balanced marker at '");
            var18_18.append(var17_17);
            var18_18.append("'");
            Rc.l8(var18_18.toString());
        }
        return var17_17;
    }

    public boolean n() {
        boolean bl = this.uS() == 0;
        return bl;
    }

    public boolean s(String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.A(stringArray[i2])) continue;
            return true;
        }
        return false;
    }

    public String tT(String string) {
        int n2 = this.l8.indexOf(string, this.S);
        if (n2 != -1) {
            string = this.l8.substring(this.S, n2);
            this.S += string.length();
            return string;
        }
        return this.E9();
    }

    public String toString() {
        return this.l8.substring(this.S);
    }

    public boolean v(String string) {
        if (this.A(string)) {
            this.S += string.length();
            return true;
        }
        return false;
    }
}

