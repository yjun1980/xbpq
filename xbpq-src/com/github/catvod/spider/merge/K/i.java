/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.H.a;
import com.github.catvod.spider.merge.H.c;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.cYh;

class i
extends h {
    public static boolean a(CharSequence charSequence) {
        String string = cYh.d("0035352238390C3E203C327A0131283D323E");
        boolean bl = false;
        if (i.e(charSequence, string, false, 2) >= 0) {
            bl = true;
        }
        return bl;
    }

    public static final int b(CharSequence charSequence) {
        f.e(charSequence, cYh.d("5B2429382464"));
        return charSequence.length() - 1;
    }

    public static final int c(CharSequence charSequence, String string, int n2, boolean bl) {
        n2 = !bl && charSequence instanceof String ? ((String)charSequence).indexOf(string, n2) : i.d(charSequence, string, n2, charSequence.length(), bl, false);
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    private static final int d(CharSequence var0, CharSequence var1_1, int var2_2, int var3_3, boolean var4_4, boolean var5_5) {
        block19: {
            block25: {
                block24: {
                    block21: {
                        block23: {
                            block22: {
                                if (!var5_5) {
                                    var6_6 = var2_2;
                                    if (var2_2 < 0) {
                                        var6_6 = 0;
                                    }
                                    var7_7 = var0.length();
                                    var2_2 = var3_3;
                                    if (var3_3 > var7_7) {
                                        var2_2 = var7_7;
                                    }
                                    var9_8 = new c(var6_6, var2_2);
                                } else {
                                    var7_7 = i.b(var0);
                                    var6_6 = var2_2;
                                    if (var2_2 > var7_7) {
                                        var6_6 = var7_7;
                                    }
                                    var2_2 = var3_3;
                                    if (var3_3 < 0) {
                                        var2_2 = 0;
                                    }
                                    var9_8 = new a(var6_6, var2_2, -1);
                                }
                                if (!(var0 instanceof String) || !(var1_1 instanceof String)) break block21;
                                var3_3 = var9_8.a();
                                var6_6 = var9_8.b();
                                var7_7 = var9_8.c();
                                if (var7_7 <= 0) break block22;
                                var2_2 = var3_3;
                                if (var3_3 <= var6_6) break block23;
                            }
                            if (var7_7 >= 0 || var6_6 > var3_3) break block19;
                            var2_2 = var3_3;
                        }
                        while (true) {
                            if (i.f((String)var1_1, (String)var0, var2_2, var1_1.length(), var4_4)) {
                                return var2_2;
                            }
                            if (var2_2 != var6_6) {
                                var2_2 += var7_7;
                                continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var3_3 = var9_8.a();
                    var6_6 = var9_8.b();
                    var7_7 = var9_8.c();
                    if (var7_7 <= 0) break block24;
                    var2_2 = var3_3;
                    if (var3_3 <= var6_6) break block25;
                }
                if (var7_7 >= 0 || var6_6 > var3_3) break block19;
                var2_2 = var3_3;
            }
            while (true) {
                var8_9 = var1_1.length();
                f.e(var0, cYh.d("0824293425"));
                if (var2_2 >= 0 && var1_1.length() - var8_9 >= 0 && var2_2 <= var0.length() - var8_9) {
                    for (var3_3 = 0; var3_3 < var8_9; ++var3_3) {
                        if (b.a(var1_1.charAt(0 + var3_3), var0.charAt(var2_2 + var3_3), var4_4)) {
                            continue;
                        }
                        ** break block20
                    }
                    var3_3 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = 0;
                }
                if (var3_3 != 0) {
                    return var2_2;
                }
                if (var2_2 == var6_6) break;
                var2_2 += var7_7;
            }
        }
        return -1;
    }

    public static /* synthetic */ int e(CharSequence charSequence, String string, boolean bl, int n2) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return i.c(charSequence, string, 0, bl);
    }

    public static final boolean f(String string, String string2, int n2, int n3, boolean bl) {
        f.e(string, cYh.d("5B2429382464"));
        f.e(string2, cYh.d("0824293425"));
        bl = !bl ? string.regionMatches(0, string2, n2, n3) : string.regionMatches(bl, 0, string2, n2, n3);
        return bl;
    }
}

