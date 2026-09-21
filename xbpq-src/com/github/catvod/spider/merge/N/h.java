/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.N.i;
import com.github.catvod.spider.merge.cYh;

public final class h {
    public static final int a() {
        return i.a();
    }

    /*
     * Unable to fully structure code
     */
    public static final long b(String var0, long var1_1, long var3_2, long var5_3) {
        block6: {
            block5: {
                block9: {
                    block7: {
                        block8: {
                            var19_4 = h.c(var0);
                            if (var19_4 == null) break block6;
                            a.b(10);
                            var9_5 = var19_4.length();
                            if (var9_5 == 0) ** GOTO lbl36
                            var8_6 = false;
                            var10_7 = var19_4.charAt(0);
                            var11_8 = f.f(var10_7, 48);
                            var1_1 = -9223372036854775807L;
                            var7_9 = 1;
                            if (var11_8 >= 0) break block7;
                            if (var9_5 == 1) ** GOTO lbl36
                            if (var10_7 != 45) break block8;
                            var1_1 = -9223372036854775808L;
                            var8_6 = true;
                            break block9;
                        }
                        if (var10_7 != 43) ** GOTO lbl36
                        break block9;
                    }
                    var7_9 = 0;
                }
                var14_10 = 0L;
                var16_11 = -256204778801521550L;
                while (var7_9 < var9_5) {
                    block12: {
                        block10: {
                            block11: {
                                var10_7 = Character.digit((int)var19_4.charAt(var7_9), 10);
                                if (var10_7 < 0) break block10;
                                var12_12 = var16_11;
                                if (var14_10 >= var16_11) break block11;
                                if (var16_11 != -256204778801521550L) break block10;
                                var12_12 = var16_11 = var1_1 / (long)10;
                                if (var14_10 < var16_11) break block10;
                            }
                            if ((var14_10 *= (long)10) >= var1_1 + (var16_11 = (long)var10_7)) break block12;
                        }
                        var18_13 = null;
                        break block5;
                    }
                    var14_10 -= var16_11;
                    ++var7_9;
                    var16_11 = var12_12;
                }
                var18_13 = var8_6 != false ? Long.valueOf(var14_10) : Long.valueOf(-var14_10);
            }
            var20_14 = cYh.d("3429322532374720333E273F1524387170");
            if (var18_13 != null) {
                var1_1 = var18_13.longValue();
                if (var3_2 > var1_1 || var5_3 < var1_1) {
                    var18_13 = new StringBuilder();
                    var18_13.append(var20_14);
                    var18_13.append(var0);
                    var18_13.append(cYh.d("40703239382F0B346133327A0E3E61233634003561"));
                    var18_13.append(var3_2);
                    var18_13.append(cYh.d("497E"));
                    var18_13.append(var5_3);
                    var18_13.append(cYh.d("4B702324237A0E236176"));
                    var18_13.append(var1_1);
                    var18_13.append('\'');
                    throw new IllegalStateException(var18_13.toString().toString());
                }
            } else {
                var18_13 = new StringBuilder();
                var18_13.append(var20_14);
                var18_13.append(var0);
                var18_13.append(cYh.d("40702930247A123E33343435003E282B323E4726203D223F4777"));
                var18_13.append(var19_4);
                var18_13.append('\'');
                throw new IllegalStateException(var18_13.toString().toString());
            }
        }
        return var1_1;
    }

    public static final String c(String string) {
        int n2 = i.b;
        try {
            string = System.getProperty(string);
        }
        catch (SecurityException securityException) {
            string = null;
        }
        return string;
    }

    public static int d(String string, int n2, int n3, int n4, int n5) {
        if ((n5 & 4) != 0) {
            n3 = 1;
        }
        if ((n5 & 8) != 0) {
            n4 = Integer.MAX_VALUE;
        }
        return (int)h.b(string, n2, n3, n4);
    }

    public static /* synthetic */ long e(String string, long l2) {
        return h.b(string, l2, 1L, Long.MAX_VALUE);
    }
}

