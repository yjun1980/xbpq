/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u01c3;

public class \u0f44 {
    private String \u037f;
    private int \u0528 = 0;

    public \u0f44(String string) {
        \u01c3.\u052f(string);
        this.\u037f = string;
    }

    private int \u0786() {
        return this.\u037f.length() - this.\u0528;
    }

    public static String \u0787(String object) {
        StringBuilder stringBuilder = \u0131.\u0528();
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
        return \u0131.\u0781(stringBuilder);
    }

    public String toString() {
        return this.\u037f.substring(this.\u0528);
    }

    /*
     * Unable to fully structure code
     */
    public String \u037f(char var1_1, char var2_2) {
        var15_3 = 0;
        var10_4 = 0;
        var5_5 = 0;
        var9_6 = false;
        var4_7 = -1;
        var3_8 = -1;
        while (!this.\u058f()) {
            block18: {
                var16_16 = this.\u0529();
                var11_12 = var10_4;
                var8_11 = var5_5;
                var12_13 = var9_6;
                var13_14 = var4_7;
                if (var15_3 == 92) ** GOTO lbl64
                if (var16_16 == '\'' && var16_16 != var1_1 && var10_4 == 0) {
                    var7_10 = var9_6 ^ true;
                    var6_9 = var10_4;
                } else {
                    var6_9 = var10_4;
                    var7_10 = var9_6;
                    if (var16_16 == '\"') {
                        var6_9 = var10_4;
                        var7_10 = var9_6;
                        if (var16_16 != var1_1) {
                            var6_9 = var10_4;
                            var7_10 = var9_6;
                            if (!var9_6) {
                                var6_9 = var10_4 ^ 1;
                                var7_10 = var9_6;
                            }
                        }
                    }
                }
                var11_12 = var15_3;
                var10_4 = var6_9;
                var8_11 = var5_5++;
                var9_6 = var7_10;
                var13_14 = var4_7;
                var14_15 = var3_8;
                if (var7_10) break block18;
                if (var6_9 != 0) {
                    var11_12 = var15_3;
                    var10_4 = var6_9;
                    var8_11 = var5_5;
                    var9_6 = var7_10;
                    var13_14 = var4_7;
                    var14_15 = var3_8;
                } else {
                    if (var16_16 == var1_1) {
                        var11_12 = var6_9;
                        var8_11 = var5_5;
                        var12_13 = var7_10;
                        var13_14 = var4_7;
                        if (var4_7 == -1) {
                            var13_14 = this.\u0528;
                            var11_12 = var6_9;
                            var8_11 = var5_5;
                            var12_13 = var7_10;
                        }
                    } else {
                        var11_12 = var6_9;
                        var8_11 = var5_5;
                        var12_13 = var7_10;
                        var13_14 = var4_7;
                        if (var16_16 == var2_2) {
                            var8_11 = var5_5 - 1;
                            var13_14 = var4_7;
                            var12_13 = var7_10;
                            var11_12 = var6_9;
                        }
                    }
lbl64:
                    // 5 sources

                    var14_15 = var3_8;
                    if (var8_11 > 0) {
                        var14_15 = var3_8;
                        if (var15_3 != 0) {
                            var14_15 = this.\u0528;
                        }
                    }
                    var3_8 = var16_16;
                    var9_6 = var12_13;
                    var10_4 = var11_12;
                    var11_12 = var3_8;
                }
            }
            var15_3 = var11_12;
            var5_5 = var8_11;
            var4_7 = var13_14;
            var3_8 = var14_15;
            if (var8_11 > 0) continue;
            var3_8 = var14_15;
            var4_7 = var13_14;
            var5_5 = var8_11;
            break;
        }
        var17_17 = var3_8 >= 0 ? this.\u037f.substring(var4_7, var3_8) : "";
        if (var5_5 > 0) {
            var18_18 = new StringBuilder();
            var18_18.append(SOY.d("3E3B35561A180E72371F1A135A30301A15191937355619160839340454160E7276"));
            var18_18.append(var17_17);
            var18_18.append(SOY.d("5D"));
            \u01c3.\u037f(var18_18.toString());
        }
        return var17_17;
    }

    public String \u0528(String string) {
        String string2 = this.\u052d(string);
        this.\u0620(string);
        return string2;
    }

    public char \u0529() {
        String string = this.\u037f;
        int n2 = this.\u0528;
        this.\u0528 = n2 + 1;
        return string.charAt(n2);
    }

    public void \u052a(String string) {
        if (this.\u0780(string)) {
            int n2 = string.length();
            if (n2 <= this.\u0786()) {
                this.\u0528 += n2;
                return;
            }
            throw new IllegalStateException(SOY.d("2B2734031157143D25561818143571131A180F35395600185A313E1807021737710511060F373F1511"));
        }
        throw new IllegalStateException(SOY.d("2B27340311571E3B35561A180E723C1700141272340E04121926341254041F2324131A141F"));
    }

    public String \u052b() {
        int n2 = this.\u0528;
        while (!this.\u058f() && (this.\u0784() || this.\u0781('-', '_'))) {
            ++this.\u0528;
        }
        return this.\u037f.substring(n2, this.\u0528);
    }

    public String \u052c() {
        int n2 = this.\u0528;
        while (!this.\u058f() && (this.\u0784() || this.\u0782(SOY.d("502E"), SOY.d("06"), SOY.d("25"), SOY.d("57")))) {
            ++this.\u0528;
        }
        return this.\u037f.substring(n2, this.\u0528);
    }

    public String \u052d(String string) {
        int n2 = this.\u037f.indexOf(string, this.\u0528);
        if (n2 != -1) {
            string = this.\u037f.substring(this.\u0528, n2);
            this.\u0528 += string.length();
            return string;
        }
        return this.\u0785();
    }

    public String \u052e(String ... stringArray) {
        int n2 = this.\u0528;
        while (!this.\u058f() && !this.\u0782(stringArray)) {
            ++this.\u0528;
        }
        return this.\u037f.substring(n2, this.\u0528);
    }

    public boolean \u052f() {
        boolean bl = false;
        while (this.\u0783()) {
            ++this.\u0528;
            bl = true;
        }
        return bl;
    }

    public boolean \u058f() {
        boolean bl = this.\u0786() == 0;
        return bl;
    }

    public boolean \u0620(String string) {
        if (this.\u0780(string)) {
            this.\u0528 += string.length();
            return true;
        }
        return false;
    }

    public boolean \u0780(String string) {
        return this.\u037f.regionMatches(true, this.\u0528, string, 0, string.length());
    }

    public boolean \u0781(char ... cArray) {
        if (this.\u058f()) {
            return false;
        }
        for (char c2 : cArray) {
            if (this.\u037f.charAt(this.\u0528) != c2) continue;
            return true;
        }
        return false;
    }

    public boolean \u0782(String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.\u0780(stringArray[i2])) continue;
            return true;
        }
        return false;
    }

    public boolean \u0783() {
        boolean bl = !this.\u058f() && \u0131.\u052f(this.\u037f.charAt(this.\u0528));
        return bl;
    }

    public boolean \u0784() {
        boolean bl = !this.\u058f() && Character.isLetterOrDigit(this.\u037f.charAt(this.\u0528));
        return bl;
    }

    public String \u0785() {
        String string = this.\u037f.substring(this.\u0528);
        this.\u0528 = this.\u037f.length();
        return string;
    }
}

