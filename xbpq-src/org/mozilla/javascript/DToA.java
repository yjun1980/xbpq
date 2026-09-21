/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.I.r;
import java.math.BigInteger;

class DToA {
    private static final int Bias = 1023;
    private static final int Bletch = 16;
    private static final int Bndry_mask = 1048575;
    static final int DTOSTR_EXPONENTIAL = 3;
    static final int DTOSTR_FIXED = 2;
    static final int DTOSTR_PRECISION = 4;
    static final int DTOSTR_STANDARD = 0;
    static final int DTOSTR_STANDARD_EXPONENTIAL = 1;
    private static final int Exp_11 = 0x3FF00000;
    private static final int Exp_mask = 0x7FF00000;
    private static final int Exp_mask_shifted = 2047;
    private static final int Exp_msk1 = 0x100000;
    private static final long Exp_msk1L = 0x10000000000000L;
    private static final int Exp_shift = 20;
    private static final int Exp_shift1 = 20;
    private static final int Exp_shiftL = 52;
    private static final int Frac_mask = 1048575;
    private static final int Frac_mask1 = 1048575;
    private static final long Frac_maskL = 0xFFFFFFFFFFFFFL;
    private static final int Int_max = 14;
    private static final int Log2P = 1;
    private static final int P = 53;
    private static final int Quick_max = 14;
    private static final int Sign_bit = Integer.MIN_VALUE;
    private static final int Ten_pmax = 22;
    private static final double[] bigtens;
    private static final int[] dtoaModes;
    private static final int n_bigtens = 5;
    private static final double[] tens;

    static {
        tens = new double[]{1.0, 10.0, 100.0, 1000.0, 10000.0, 100000.0, 1000000.0, 1.0E7, 1.0E8, 1.0E9, 1.0E10, 1.0E11, 1.0E12, 1.0E13, 1.0E14, 1.0E15, 1.0E16, 1.0E17, 1.0E18, 1.0E19, 1.0E20, 1.0E21, 1.0E22};
        bigtens = new double[]{1.0E16, 1.0E32, 1.0E64, 1.0E128, 1.0E256};
        dtoaModes = new int[]{0, 0, 3, 2, 2};
    }

    DToA() {
    }

    private static char BASEDIGIT(int n2) {
        n2 = n2 >= 10 ? (n2 += 87) : (n2 += 48);
        return (char)n2;
    }

    /*
     * Unable to fully structure code
     */
    static int JS_dtoa(double var0, int var2_1, boolean var3_2, int var4_3, boolean[] var5_4, StringBuilder var6_5) {
        block144: {
            block141: {
                block143: {
                    block142: {
                        block137: {
                            block136: {
                                block135: {
                                    block124: {
                                        block134: {
                                            block113: {
                                                block129: {
                                                    block130: {
                                                        block128: {
                                                            block127: {
                                                                block125: {
                                                                    block126: {
                                                                        block122: {
                                                                            block117: {
                                                                                block120: {
                                                                                    block118: {
                                                                                        block123: {
                                                                                            block119: {
                                                                                                block121: {
                                                                                                    block116: {
                                                                                                        block115: {
                                                                                                            var17_6 = var2_1;
                                                                                                            var34_7 = new int[1];
                                                                                                            var33_8 = new int[1];
                                                                                                            if ((DToA.word0(var0) & -2147483648) != 0) {
                                                                                                                var5_4[0] = true;
                                                                                                                var0 = DToA.setWord0(var0, DToA.word0(var0) & 0x7FFFFFFF);
                                                                                                            } else {
                                                                                                                var5_4[0] = false;
                                                                                                            }
                                                                                                            if ((DToA.word0(var0) & 0x7FF00000) == 0x7FF00000) {
                                                                                                                var5_4 = DToA.word1(var0) == 0 && (DToA.word0(var0) & 1048575) == 0 ? (Object)"Infinity" : (Object)"NaN";
                                                                                                                var6_5.append((String)var5_4);
                                                                                                                return 9999;
                                                                                                            }
                                                                                                            if (var0 == 0.0) {
                                                                                                                var6_5.setLength(0);
                                                                                                                var6_5.append('0');
                                                                                                                return 1;
                                                                                                            }
                                                                                                            var32_9 = DToA.d2b(var0, (int[])var34_7, (int[])var33_8);
                                                                                                            var2_1 = DToA.word0(var0) >>> 20 & 2047;
                                                                                                            if (var2_1 != 0) {
                                                                                                                var9_10 = DToA.setWord0(var0, DToA.word0(var0) & 1048575 | 0x3FF00000);
                                                                                                                var15_11 = var2_1 - 1023;
                                                                                                                var28_12 = 0;
                                                                                                            } else {
                                                                                                                var2_1 = var33_8[0] + var34_7[0] + 1074;
                                                                                                                if (var2_1 > 32) {
                                                                                                                    var30_13 = DToA.word0(var0);
                                                                                                                    var30_13 = (long)(DToA.word1(var0) >>> var2_1 - 32) | var30_13 << 64 - var2_1;
                                                                                                                } else {
                                                                                                                    var30_13 = (long)DToA.word1(var0) << 32 - var2_1;
                                                                                                                }
                                                                                                                var9_10 = var30_13;
                                                                                                                var9_10 = DToA.setWord0(var9_10, DToA.word0(var9_10) - 0x1F00000);
                                                                                                                var15_11 = var2_1 - 1075;
                                                                                                                var28_12 = 1;
                                                                                                            }
                                                                                                            var9_10 = (double)var15_11 * 0.301029995663981 + ((var9_10 - 1.5) * 0.289529654602168 + 0.1760912590558);
                                                                                                            var19_14 = var2_1 = (int)var9_10;
                                                                                                            if (var9_10 < 0.0) {
                                                                                                                var19_14 = var2_1;
                                                                                                                if (var9_10 != (double)var2_1) {
                                                                                                                    var19_14 = var2_1 - 1;
                                                                                                                }
                                                                                                            }
                                                                                                            if (var19_14 >= 0 && var19_14 <= 22) {
                                                                                                                var2_1 = var19_14;
                                                                                                                if (var0 < DToA.tens[var19_14]) {
                                                                                                                    var2_1 = var19_14 - 1;
                                                                                                                }
                                                                                                                var26_15 = false;
                                                                                                                var19_14 = var2_1;
                                                                                                            } else {
                                                                                                                var26_15 = true;
                                                                                                            }
                                                                                                            var23_16 = var33_8[0] - var15_11 - 1;
                                                                                                            if (var23_16 >= 0) {
                                                                                                                var18_17 = 0;
                                                                                                            } else {
                                                                                                                var18_17 = -var23_16;
                                                                                                                var23_16 = 0;
                                                                                                            }
                                                                                                            if (var19_14 >= 0) {
                                                                                                                var23_16 += var19_14;
                                                                                                                var15_11 = var19_14;
                                                                                                                var16_18 = 0;
                                                                                                            } else {
                                                                                                                var18_17 -= var19_14;
                                                                                                                var16_18 = -var19_14;
                                                                                                                var15_11 = 0;
                                                                                                            }
                                                                                                            if (var17_6 < 0) break block115;
                                                                                                            var2_1 = var17_6;
                                                                                                            if (var17_6 <= 9) break block116;
                                                                                                        }
                                                                                                        var2_1 = 0;
                                                                                                    }
                                                                                                    if (var2_1 > 5) {
                                                                                                        var27_19 = var2_1 - 4;
                                                                                                        var17_6 = 0;
                                                                                                    } else {
                                                                                                        var17_6 = 1;
                                                                                                        var27_19 = var2_1;
                                                                                                    }
                                                                                                    var2_1 = -1;
                                                                                                    if (var27_19 == 0) break block117;
                                                                                                    var22_20 = 1;
                                                                                                    var20_21 = 1;
                                                                                                    if (var27_19 == 1) break block117;
                                                                                                    if (var27_19 == 2) break block118;
                                                                                                    if (var27_19 == 3) break block119;
                                                                                                    if (var27_19 == 4) break block120;
                                                                                                    if (var27_19 == 5) break block121;
                                                                                                    var2_1 = 0;
                                                                                                    var24_22 = 0;
                                                                                                    var21_23 = var4_3;
                                                                                                    var20_21 = var22_20;
                                                                                                    var4_3 = var24_22;
                                                                                                    break block122;
                                                                                                }
                                                                                                var2_1 = 1;
                                                                                                break block123;
                                                                                            }
                                                                                            var2_1 = 0;
                                                                                        }
                                                                                        var20_21 = var21_23 = var4_3 + var19_14 + 1;
                                                                                        var24_22 = var21_23 - 1;
                                                                                        var22_20 = var2_1;
                                                                                        var21_23 = var4_3;
                                                                                        var2_1 = var20_21;
                                                                                        var20_21 = var22_20;
                                                                                        var4_3 = var24_22;
                                                                                        break block122;
                                                                                    }
                                                                                    var20_21 = 0;
                                                                                }
                                                                                var21_23 = var4_3 <= 0 ? 1 : var4_3;
                                                                                var4_3 = var2_1 = var21_23;
                                                                                break block122;
                                                                            }
                                                                            var21_23 = 0;
                                                                            var22_20 = -1;
                                                                            var20_21 = 1;
                                                                            var4_3 = var2_1;
                                                                            var2_1 = var22_20;
                                                                        }
                                                                        if (var2_1 < 0 || var2_1 > 14 || var17_6 == 0) break block124;
                                                                        if (var19_14 > 0) {
                                                                            var11_24 = DToA.tens[var19_14 & 15];
                                                                            var24_22 = var19_14 >> 4;
                                                                            if ((var24_22 & 16) != 0) {
                                                                                var24_22 &= 15;
                                                                                var9_10 = var0 / DToA.bigtens[4];
                                                                                var22_20 = 0;
                                                                                var17_6 = 3;
                                                                            } else {
                                                                                var9_10 = var0;
                                                                                var22_20 = 0;
                                                                                var17_6 = 2;
                                                                            }
                                                                            while (var24_22 != 0) {
                                                                                var25_26 = var17_6;
                                                                                var13_25 = var11_24;
                                                                                if ((var24_22 & 1) != 0) {
                                                                                    var25_26 = var17_6 + 1;
                                                                                    var13_25 = var11_24 * DToA.bigtens[var22_20];
                                                                                }
                                                                                var24_22 >>= 1;
                                                                                ++var22_20;
                                                                                var17_6 = var25_26;
                                                                                var11_24 = var13_25;
                                                                            }
                                                                            var9_10 /= var11_24;
                                                                            var22_20 = var17_6;
                                                                        } else {
                                                                            var17_6 = -var19_14;
                                                                            if (var17_6 != 0) {
                                                                                var9_10 = DToA.tens[var17_6 & 15];
                                                                                var25_26 = var17_6 >> 4;
                                                                                var11_24 = var9_10 * var0;
                                                                                var17_6 = 2;
                                                                                var24_22 = 0;
                                                                                while (true) {
                                                                                    var22_20 = var17_6;
                                                                                    var9_10 = var11_24;
                                                                                    if (var25_26 != 0) {
                                                                                        var22_20 = var17_6;
                                                                                        var9_10 = var11_24;
                                                                                        if ((var25_26 & 1) != 0) {
                                                                                            var22_20 = var17_6 + 1;
                                                                                            var9_10 = var11_24 * DToA.bigtens[var24_22];
                                                                                        }
                                                                                        var25_26 >>= 1;
                                                                                        ++var24_22;
                                                                                        var17_6 = var22_20;
                                                                                        var11_24 = var9_10;
                                                                                        continue;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                var9_10 = var0;
                                                                                var22_20 = 2;
                                                                            }
                                                                        }
                                                                        if (!var26_15 || !(var9_10 < 1.0) || var2_1 <= 0) break block125;
                                                                        if (var4_3 > 0) break block126;
                                                                        var24_22 = 1;
                                                                        break block127;
                                                                    }
                                                                    var9_10 *= 10.0;
                                                                    var29_27 = var22_20 + 1;
                                                                    var17_6 = var19_14 - 1;
                                                                    var22_20 = var4_3;
                                                                    var24_22 = 0;
                                                                    var25_26 = var2_1;
                                                                    break block128;
                                                                }
                                                                var24_22 = 0;
                                                            }
                                                            var17_6 = var19_14;
                                                            var29_27 = var25_26 = var2_1;
                                                            var29_27 = var22_20;
                                                            var22_20 = var25_26;
                                                        }
                                                        var25_26 = var2_1;
                                                        var11_24 = (double)var29_27 * var9_10 + 7.0;
                                                        var11_24 = DToA.setWord0(var11_24, DToA.word0(var11_24) - 0x3400000);
                                                        if (var22_20 == 0) {
                                                            if ((var9_10 -= 5.0) > var11_24) {
                                                                var6_5.append('1');
                                                                ++var17_6;
lbl197:
                                                                // 4 sources

                                                                return var17_6 + 1;
                                                            }
                                                            if (var9_10 < -var11_24) {
                                                                var6_5.setLength(0);
                                                                var6_5.append('0');
                                                                return 1;
                                                            }
                                                            var24_22 = 1;
                                                        }
                                                        if (var24_22 != 0) break block129;
                                                        if (var20_21 == 0) break block130;
                                                        var13_25 = 0.5 / DToA.tens[var22_20 - 1] - var11_24;
                                                        var11_24 = var9_10;
                                                        var24_22 = 0;
                                                        var2_1 = var15_11;
                                                        var9_10 = var13_25;
                                                        while (true) {
                                                            block132: {
                                                                block131: {
                                                                    block111: {
                                                                        var30_13 = (long)var11_24;
                                                                        var15_11 = var16_18;
                                                                        var6_5.append((char)(var30_13 + 48L));
                                                                        if ((var11_24 -= (double)var30_13) < var9_10) ** GOTO lbl197
                                                                        if (!(1.0 - var11_24 < var9_10)) break block131;
                                                                        do {
                                                                            var2_1 = var6_5.charAt(var6_5.length() - 1);
                                                                            var6_5.setLength(var6_5.length() - 1);
                                                                            if (var2_1 != 57) break block111;
                                                                        } while (var6_5.length() != 0);
                                                                        ++var17_6;
                                                                        var2_1 = 48;
                                                                    }
                                                                    ++var2_1;
lbl228:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var6_5.append((char)var2_1);
                                                                        ** GOTO lbl197
                                                                        break;
                                                                    }
                                                                }
                                                                if (++var24_22 < var22_20) break block132;
                                                                var9_10 = var11_24;
                                                                var16_18 = var2_1;
                                                                ** GOTO lbl270
                                                            }
                                                            var9_10 *= 10.0;
                                                            var11_24 *= 10.0;
                                                            var16_18 = var15_11;
                                                        }
                                                    }
                                                    var2_1 = var16_18;
                                                    var16_18 = var15_11;
                                                    var13_25 = var11_24 * DToA.tens[var22_20 - 1];
                                                    var15_11 = 1;
                                                    while (true) {
                                                        block133: {
                                                            var30_13 = (long)var9_10;
                                                            var11_24 = var9_10 - (double)var30_13;
                                                            var6_5.append((char)(var30_13 + 48L));
                                                            if (var15_11 == var22_20) {
                                                                if (var11_24 > var13_25 + 0.5) {
                                                                    block112: {
                                                                        do {
                                                                            var2_1 = var6_5.charAt(var6_5.length() - 1);
                                                                            var6_5.setLength(var6_5.length() - 1);
                                                                            if (var2_1 != 57) break block112;
                                                                        } while (var6_5.length() != 0);
                                                                        ++var17_6;
                                                                        var2_1 = 48;
                                                                    }
                                                                    ++var2_1;
                                                                    ** continue;
                                                                }
                                                                var9_10 = var11_24;
                                                                var15_11 = var2_1;
                                                                if (var11_24 < 0.5 - var13_25) {
                                                                    DToA.stripTrailingZeroes(var6_5);
                                                                    ** continue;
                                                                } else {
                                                                    ** GOTO lbl270
                                                                }
                                                            }
                                                            break block133;
lbl270:
                                                            // 3 sources

                                                            var24_22 = 1;
                                                            var2_1 = var15_11;
                                                            break block113;
                                                        }
                                                        ++var15_11;
                                                        var9_10 = var11_24 * 10.0;
                                                    }
                                                }
                                                var2_1 = var16_18;
                                                var16_18 = var15_11;
                                            }
                                            var15_11 = var25_26;
                                            if (var24_22 == 0) break block134;
                                            var6_5.setLength(0);
                                            break block135;
                                        }
                                        var15_11 = var17_6;
                                        var0 = var9_10;
                                        var17_6 = var22_20;
                                        break block136;
                                    }
                                    var17_6 = var2_1;
                                    var2_1 = var16_18;
                                    var16_18 = var15_11;
                                    var15_11 = var17_6;
                                }
                                var17_6 = var15_11;
                                var15_11 = var19_14;
                            }
                            if (var34_7[0] < 0 || var15_11 > 14) break block137;
                            var9_10 = DToA.tens[var15_11];
                            if (var21_23 < 0 && var17_6 <= 0) {
                                if (var17_6 >= 0 && !(var0 < (var9_10 *= 5.0)) && (var3_2 || var0 != var9_10)) {
                                    var6_5.append('1');
                                    return var15_11 + 1 + 1;
                                }
                                var6_5.setLength(0);
                                var6_5.append('0');
                                return 1;
                            }
                            var2_1 = 1;
                            while (true) {
                                block140: {
                                    block139: {
                                        block138: {
                                            var30_13 = (long)(var0 / var9_10);
                                            var0 -= (double)var30_13 * var9_10;
                                            var6_5.append((char)(var30_13 + 48L));
                                            if (var2_1 != var17_6) break block138;
                                            cfr_temp_0 = var0 + var0 - var9_10;
                                            var2_1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                            if (var2_1 > 0 || var2_1 == 0 && ((var30_13 & 1L) != 0L || var3_2)) {
                                                block114: {
                                                    do {
                                                        var2_1 = var6_5.charAt(var6_5.length() - 1);
                                                        var6_5.setLength(var6_5.length() - 1);
                                                        if (var2_1 != 57) break block114;
                                                    } while (var6_5.length() != 0);
                                                    ++var15_11;
                                                    var2_1 = 48;
                                                }
                                                var6_5.append((char)(var2_1 + 1));
                                            }
                                            break block139;
                                        }
                                        if ((var0 *= 10.0) != 0.0) break block140;
                                    }
                                    return var15_11 + 1;
                                }
                                ++var2_1;
                            }
                        }
                        var5_4 = null;
                        if (var20_21 != 0) {
                            if (var27_19 < 2) {
                                var22_20 = var28_12 != 0 ? var34_7[0] + 1075 : 54 - var33_8[0];
                                var19_14 = var18_17;
                                var24_22 = var2_1;
                                var21_23 = var16_18;
                                var16_18 = var24_22;
                            } else {
                                var19_14 = var2_1;
                                var21_23 = var17_6 - 1;
                                if (var19_14 >= var21_23) {
                                    var2_1 = var19_14 - var21_23;
                                    var21_23 = var16_18;
                                    var16_18 = var19_14;
                                } else {
                                    var2_1 = var21_23 - var19_14;
                                    var21_23 = var16_18 + var2_1;
                                    var16_18 = var19_14 + var2_1;
                                    var2_1 = 0;
                                }
                                if (var17_6 < 0) {
                                    var19_14 = var18_17 - var17_6;
                                    var24_22 = var16_18;
                                    var22_20 = 0;
                                    var16_18 = var2_1;
                                    var2_1 = var24_22;
                                } else {
                                    var24_22 = var16_18;
                                    var19_14 = var18_17;
                                    var16_18 = var2_1;
                                    var22_20 = var17_6;
                                    var2_1 = var24_22;
                                }
                            }
                            var25_26 = var18_17 + var22_20;
                            var5_4 = BigInteger.valueOf(1L);
                            var24_22 = var21_23;
                            var28_12 = var2_1;
                            var2_1 = var23_16 + var22_20;
                            var18_17 = var19_14;
                            var21_23 = var25_26;
                            var25_26 = var16_18;
                            var19_14 = var28_12;
                        } else {
                            var19_14 = var2_1;
                            var21_23 = var18_17;
                            var24_22 = var16_18;
                            var25_26 = var2_1;
                            var2_1 = var23_16;
                        }
                        var16_18 = var18_17;
                        var23_16 = var21_23;
                        var22_20 = var2_1;
                        if (var18_17 > 0) {
                            var16_18 = var18_17;
                            var23_16 = var21_23;
                            var22_20 = var2_1;
                            if (var2_1 > 0) {
                                var16_18 = var18_17 < var2_1 ? var18_17 : var2_1;
                                var23_16 = var21_23 - var16_18;
                                var18_17 -= var16_18;
                                var22_20 = var2_1 - var16_18;
                                var16_18 = var18_17;
                            }
                        }
                        if (var19_14 <= 0) break block141;
                        if (var20_21 == 0) break block142;
                        if (var25_26 > 0) {
                            var34_7 = DToA.pow5mult((BigInteger)var5_4, var25_26);
                            var33_8 = var34_7.multiply((BigInteger)var32_9);
                        } else {
                            var33_8 = var32_9;
                            var34_7 = var5_4;
                        }
                        var5_4 = var34_7;
                        var32_9 = var33_8;
                        if ((var19_14 -= var25_26) == 0) break block141;
                        var5_4 = var34_7;
                        break block143;
                    }
                    var33_8 = var32_9;
                }
                var32_9 = DToA.pow5mult((BigInteger)var33_8, var19_14);
            }
            var33_8 = var34_7 = (Object)BigInteger.valueOf(1L);
            if (var24_22 > 0) {
                var33_8 = DToA.pow5mult((BigInteger)var34_7, var24_22);
            }
            if (var27_19 < 2 && DToA.word1(var0) == 0 && (DToA.word0(var0) & 1048575) == 0 && (DToA.word0(var0) & 2145386496) != 0) {
                var18_17 = var23_16 + 1;
                var2_1 = var22_20 + 1;
                var21_23 = 1;
            } else {
                var21_23 = 0;
                var2_1 = var22_20;
                var18_17 = var23_16;
            }
            var34_7 = var33_8.toByteArray();
            var19_14 = 0;
            for (var22_20 = 0; var22_20 < 4; ++var22_20) {
                var19_14 = var23_16 = var19_14 << 8;
                if (var22_20 >= ((int[])var34_7).length) continue;
                var19_14 = var23_16 | var34_7[var22_20] & 255;
            }
            var19_14 = var24_22 != 0 ? 32 - DToA.hi0bits(var19_14) : 1;
            var22_20 = var19_14 = var19_14 + var2_1 & 31;
            if (var19_14 != 0) {
                var22_20 = 32 - var19_14;
            }
            if (var22_20 > 4) {
                var19_14 = var22_20 - 4;
lbl442:
                // 2 sources

                while (true) {
                    var23_16 = var18_17 + var19_14;
                    var16_18 += var19_14;
                    var24_22 = var2_1 + var19_14;
                    var19_14 = var16_18;
                    break;
                }
            } else {
                var19_14 = var16_18;
                var23_16 = var18_17;
                var24_22 = var2_1;
                if (var22_20 < 4) {
                    var19_14 = var22_20 + 28;
                    ** continue;
                }
            }
            var34_7 = var32_9;
            if (var23_16 > 0) {
                var34_7 = var32_9.shiftLeft(var23_16);
            }
            var35_28 = var33_8;
            if (var24_22 > 0) {
                var35_28 = var33_8.shiftLeft(var24_22);
            }
            if (var26_15 && var34_7.compareTo((BigInteger)var35_28) < 0) {
                --var15_11;
                var32_9 = var34_7.multiply(BigInteger.valueOf(10L));
                var33_8 = var5_4;
                if (var20_21 != 0) {
                    var33_8 = var5_4.multiply(BigInteger.valueOf(10L));
                }
                var2_1 = var4_3;
            } else {
                var2_1 = var17_6;
                var32_9 = var34_7;
                var33_8 = var5_4;
            }
            if (var2_1 <= 0 && var27_19 > 2) {
                if (var2_1 >= 0 && (var2_1 = var32_9.compareTo(var35_28.multiply(BigInteger.valueOf(5L)))) >= 0 && (var2_1 != 0 || var3_2)) {
                    var6_5.append('1');
                    return var15_11 + 1 + 1;
                }
                var6_5.setLength(0);
                var6_5.append('0');
                return 1;
            }
            if (var20_21 == 0) break block144;
            var5_4 = var33_8;
            if (var19_14 > 0) {
                var5_4 = var33_8.shiftLeft(var19_14);
            }
            var33_8 = var21_23 != 0 ? var5_4.shiftLeft(1) : var5_4;
            var4_3 = 1;
            var34_7 = var32_9;
            var32_9 = var33_8;
            while (true) {
                block145: {
                    var34_7 = var34_7.divideAndRemainder((BigInteger)var35_28);
                    var33_8 = var34_7[1];
                    var7_29 = (char)(var34_7[0].intValue() + 48);
                    var17_6 = var33_8.compareTo((BigInteger)var5_4);
                    var34_7 = var35_28.subtract((BigInteger)var32_9);
                    var16_18 = var34_7.signum() <= 0 ? 1 : var33_8.compareTo((BigInteger)var34_7);
                    if (var16_18 == 0 && var27_19 == 0 && (DToA.word1(var0) & 1) == 0) {
                        if (var7_29 == '9') {
                            var6_5.append('9');
                            var2_1 = var15_11;
                            if (DToA.roundOff(var6_5)) {
                                var2_1 = var15_11 + 1;
                                var6_5.append('1');
                            }
                            return var2_1 + 1;
                        }
                        var8_31 = var7_29;
                        if (var17_6 > 0) {
                            var8_31 = (char)(var7_29 + '\u0001');
                        }
                        var6_5.append(var8_31);
                        return var15_11 + 1;
                    }
                    if (var17_6 < 0 || var17_6 == 0 && var27_19 == 0 && (DToA.word1(var0) & 1) == 0) break;
                    if (var16_18 > 0) {
                        if (var7_29 == '9') {
                            var6_5.append('9');
                            var2_1 = var15_11;
                            if (DToA.roundOff(var6_5)) {
                                var2_1 = var15_11 + 1;
                                var6_5.append('1');
                            }
                            return var2_1 + 1;
                        }
                        var6_5.append((char)(var7_29 + '\u0001'));
                        return var15_11 + 1;
                    }
                    var6_5.append(var7_29);
                    if (var4_3 != var2_1) break block145;
                    var2_1 = var7_29;
                    var5_4 = var33_8;
                    ** GOTO lbl565
                }
                var34_7 = var33_8.multiply(BigInteger.valueOf(10L));
                if (var5_4 == var32_9) {
                    var5_4 = var32_9 = var32_9.multiply(BigInteger.valueOf(10L));
                } else {
                    var5_4 = var5_4.multiply(BigInteger.valueOf(10L));
                    var32_9 = var32_9.multiply(BigInteger.valueOf(10L));
                }
                ++var4_3;
            }
            if (var16_18 > 0 && ((var2_1 = var33_8.shiftLeft(1).compareTo((BigInteger)var35_28)) > 0 || var2_1 == 0 && ((var7_29 & '\u0001') == 1 || var3_2))) {
                var8_32 = (char)(var7_29 + '\u0001');
                if (var7_29 == '9') {
                    var6_5.append('9');
                    var2_1 = var15_11;
                    if (DToA.roundOff(var6_5)) {
                        var2_1 = var15_11 + 1;
                        var6_5.append('1');
                    }
                    return var2_1 + 1;
                }
                var7_29 = var8_32;
            }
            var6_5.append(var7_29);
            return var15_11 + 1;
        }
        var4_3 = 1;
        while (true) {
            block146: {
                var32_9 = var32_9.divideAndRemainder((BigInteger)var35_28);
                var5_4 = var32_9[1];
                var7_30 = (char)(var32_9[0].intValue() + 48);
                var6_5.append(var7_30);
                if (var4_3 < var2_1) break block146;
                var2_1 = var7_30;
lbl565:
                // 2 sources

                var4_3 = var5_4.shiftLeft(1).compareTo((BigInteger)var35_28);
                if (var4_3 <= 0 && (var4_3 != 0 || (var2_1 & 1) != 1 && !var3_2)) {
                    DToA.stripTrailingZeroes(var6_5);
                } else if (DToA.roundOff(var6_5)) {
                    var6_5.append('1');
                    return var15_11 + 1 + 1;
                }
                return var15_11 + 1;
            }
            var32_9 = var5_4.multiply(BigInteger.valueOf(10L));
            ++var4_3;
        }
    }

    static String JS_dtobasestr(int n2, double d2) {
        block23: {
            Object object;
            int n3;
            Object object2;
            long l2;
            if (2 > n2 || n2 > 36) break block23;
            if (Double.isNaN(d2)) {
                return "NaN";
            }
            if (Double.isInfinite(d2)) {
                String string = d2 > 0.0 ? "Infinity" : "-Infinity";
                return string;
            }
            double d3 = d2 - 0.0;
            double d4 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
            if (d4 == false) {
                return "0";
            }
            if (d4 >= 0) {
                d4 = 0.0;
            } else {
                d2 = -d2;
                d4 = 1.0;
            }
            double d5 = Math.floor(d2);
            long l3 = (long)d5;
            if ((double)l3 == d5) {
                l2 = l3;
                if (d4 != false) {
                    l2 = -l3;
                }
                object2 = Long.toString(l2, n2);
            } else {
                l2 = Double.doubleToLongBits(d5);
                n3 = (int)(l2 >> 52) & 0x7FF;
                l2 &= 0xFFFFFFFFFFFFFL;
                l2 = n3 == 0 ? (l2 <<= 1) : (l2 |= 0x10000000000000L);
                l3 = l2;
                if (d4 != false) {
                    l3 = -l2;
                }
                d4 = n3 - 1075;
                object = BigInteger.valueOf(l3);
                if (d4 > 0) {
                    object2 = ((BigInteger)object).shiftLeft((int)d4);
                } else {
                    object2 = object;
                    if (d4 < 0) {
                        object2 = ((BigInteger)object).shiftRight((int)(-d4));
                    }
                }
                object2 = object2.toString(n2);
            }
            if (d2 == d5) {
                return object2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object2);
            stringBuilder.append('.');
            l2 = Double.doubleToLongBits(d2);
            int n4 = (int)(l2 >> 32);
            int n5 = (int)l2;
            Object object3 = new int[1];
            Object object4 = DToA.d2b(d2 - d5, (int[])object3, new int[1]);
            n3 = -(n4 >>> 20 & 0x7FF);
            d4 = n3;
            if (n3 == 0) {
                d4 = -1;
            }
            d4 += 1076;
            object = BigInteger.valueOf(1L);
            if (n5 == 0 && (0xFFFFF & n4) == 0 && (n4 & 0x7FE00000) != 0) {
                ++d4;
                object2 = BigInteger.valueOf(2L);
            } else {
                object2 = object;
            }
            object4 = object4.shiftLeft(object3[0] + d4);
            BigInteger bigInteger = BigInteger.valueOf(1L).shiftLeft((int)d4);
            BigInteger bigInteger2 = BigInteger.valueOf(n2);
            n2 = 0;
            object3 = object;
            while (true) {
                block28: {
                    block25: {
                        block26: {
                            block27: {
                                block24: {
                                    object4 = object4.multiply(bigInteger2).divideAndRemainder(bigInteger);
                                    object = object4[1];
                                    d4 = (char)object4[0].intValue();
                                    if (object3 == object2) {
                                        object4 = ((BigInteger)object3).multiply(bigInteger2);
                                        object3 = object4;
                                    } else {
                                        object3 = ((BigInteger)object3).multiply(bigInteger2);
                                        object4 = object2.multiply(bigInteger2);
                                    }
                                    n4 = ((BigInteger)object).compareTo((BigInteger)object3);
                                    object2 = bigInteger.subtract((BigInteger)object4);
                                    n3 = object2.signum() <= 0 ? 1 : ((BigInteger)object).compareTo((BigInteger)object2);
                                    if (n3 != 0 || (n5 & 1) != 0) break block24;
                                    object2 = object;
                                    n2 = (int)d4;
                                    if (n4 <= 0) break block25;
                                    object2 = object;
                                    break block26;
                                }
                                if (n4 < 0 || n4 == 0 && (n5 & 1) == 0) break block27;
                                object2 = object;
                                n4 = n2;
                                n2 = (int)d4;
                                if (n3 <= 0) break block28;
                                object2 = object;
                                break block26;
                            }
                            object2 = object;
                            n2 = (int)d4;
                            if (n3 <= 0) break block25;
                            object = ((BigInteger)object).shiftLeft(1);
                            object2 = object;
                            n2 = (int)d4;
                            if (((BigInteger)object).compareTo(bigInteger) <= 0) break block25;
                            object2 = object;
                        }
                        n2 = (int)(d4 + true);
                    }
                    n4 = 1;
                }
                stringBuilder.append(DToA.BASEDIGIT(n2));
                if (n4 != 0) {
                    return stringBuilder.toString();
                }
                object = object2;
                object2 = object4;
                n2 = n4;
                object4 = object;
            }
        }
        throw new IllegalArgumentException(r.a("Bad base: ", n2));
    }

    /*
     * Unable to fully structure code
     */
    static void JS_dtostr(StringBuilder var0, int var1_1, int var2_2, double var3_3) {
        block22: {
            block19: {
                block23: {
                    block26: {
                        block24: {
                            block25: {
                                block20: {
                                    block21: {
                                        var9_4 = new boolean[1];
                                        var5_5 = var1_1;
                                        if (var1_1 != 2) break block20;
                                        if (var3_3 >= 1.0E21) break block21;
                                        var5_5 = var1_1;
                                        if (!(var3_3 <= -1.0E21)) break block20;
                                    }
                                    var5_5 = 0;
                                }
                                var1_1 = DToA.dtoaModes[var5_5];
                                var8_6 = var5_5 >= 2;
                                var6_7 = DToA.JS_dtoa(var3_3, var1_1, var8_6, var2_2, var9_4, var0);
                                var7_8 = var0.length();
                                if (var6_7 == 9999) break block22;
                                if (var5_5 == 0) break block23;
                                if (var5_5 == 1) break block24;
                                if (var5_5 == 2) break block25;
                                var1_1 = var2_2;
                                if (var5_5 == 3) break block26;
                                if (var5_5 != 4) {
                                    var2_2 = 0;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        var1_1 = 0;
                                        break block19;
                                        break;
                                    }
                                }
                                var1_1 = var2_2;
                                if (var6_7 < -5) break block26;
                                var1_1 = var2_2;
                                if (var6_7 <= var2_2) ** GOTO lbl43
                                var1_1 = var2_2;
                                break block26;
                            }
                            if (var2_2 < 0) ** GOTO lbl-1000
                            var1_1 = var2_2 + var6_7;
                            ** GOTO lbl43
                        }
                        var1_1 = 0;
                    }
                    var2_2 = 1;
                    break block19;
                }
                if (var6_7 >= -5 && var6_7 <= 21) lbl-1000:
                // 2 sources

                {
                    var1_1 = var6_7;
lbl43:
                    // 3 sources

                    var2_2 = 0;
                } else {
                    var2_2 = 1;
                    ** continue;
                }
            }
            var5_5 = var7_8;
            if (var7_8 < var1_1) {
                do {
                    var0.append('0');
                } while (var0.length() != var1_1);
                var5_5 = var1_1;
            }
            if (var2_2 != 0) {
                if (var5_5 != 1) {
                    var0.insert(1, '.');
                }
                var0.append('e');
                var1_1 = var6_7 - 1;
                if (var1_1 >= 0) {
                    var0.append('+');
                }
                var0.append(var1_1);
            } else if (var6_7 != var5_5) {
                if (var6_7 > 0) {
                    var0.insert(var6_7, '.');
                } else {
                    for (var1_1 = 0; var1_1 < 1 - var6_7; ++var1_1) {
                        var0.insert(0, '0');
                    }
                    var0.insert(1, '.');
                }
            }
        }
        if (var9_4[0] && (DToA.word0(var3_3) != -2147483648 || DToA.word1(var3_3) != 0) && ((DToA.word0(var3_3) & 0x7FF00000) != 0x7FF00000 || DToA.word1(var3_3) == 0 && (DToA.word0(var3_3) & 1048575) == 0)) {
            var0.insert(0, '-');
        }
    }

    private static BigInteger d2b(double d2, int[] nArray, int[] nArray2) {
        byte[] byArray;
        int n2;
        int n3;
        int n4;
        int n5;
        block7: {
            int n6;
            block6: {
                block5: {
                    long l2 = Double.doubleToLongBits(d2);
                    n5 = (int)(l2 >>> 32);
                    n4 = (int)l2;
                    n6 = 0xFFFFF & n5;
                    n3 = (Integer.MAX_VALUE & n5) >>> 20;
                    n5 = n6;
                    if (n3 != 0) {
                        n5 = n6 | 0x100000;
                    }
                    if (n4 == 0) break block5;
                    byte[] byArray2 = new byte[8];
                    n2 = DToA.lo0bits(n4);
                    n6 = n4 >>> n2;
                    if (n2 != 0) {
                        DToA.stuffBits(byArray2, 4, n6 | n5 << 32 - n2);
                        n5 >>= n2;
                    } else {
                        DToA.stuffBits(byArray2, 4, n6);
                    }
                    DToA.stuffBits(byArray2, 0, n5);
                    byArray = byArray2;
                    n4 = n2;
                    n6 = n5;
                    if (n5 == 0) break block6;
                    n6 = 2;
                    byArray = byArray2;
                    n4 = n2;
                    n2 = n6;
                    break block7;
                }
                byArray = new byte[4];
                n4 = DToA.lo0bits(n5);
                n6 = n5 >>> n4;
                DToA.stuffBits(byArray, 0, n6);
                n4 += 32;
            }
            n2 = 1;
            n5 = n6;
        }
        if (n3 != 0) {
            nArray[0] = n3 - 1023 - 52 + n4;
            nArray2[0] = 53 - n4;
        } else {
            nArray[0] = n3 - 1023 - 52 + 1 + n4;
            nArray2[0] = n2 * 32 - DToA.hi0bits(n5);
        }
        return new BigInteger(byArray);
    }

    private static int hi0bits(int n2) {
        int n3;
        if ((0xFFFF0000 & n2) == 0) {
            n2 <<= 16;
            n3 = 16;
        } else {
            n3 = 0;
        }
        int n4 = n3;
        int n5 = n2;
        if ((0xFF000000 & n2) == 0) {
            n4 = n3 + 8;
            n5 = n2 << 8;
        }
        n3 = n4;
        n2 = n5;
        if ((0xF0000000 & n5) == 0) {
            n3 = n4 + 4;
            n2 = n5 << 4;
        }
        n5 = n3;
        n4 = n2;
        if ((0xC0000000 & n2) == 0) {
            n5 = n3 + 2;
            n4 = n2 << 2;
        }
        n2 = n5;
        if ((Integer.MIN_VALUE & n4) == 0) {
            n2 = n5 + 1;
            if ((n4 & 0x40000000) == 0) {
                return 32;
            }
        }
        return n2;
    }

    private static int lo0bits(int n2) {
        int n3 = 0;
        if ((n2 & 7) != 0) {
            if ((n2 & 1) != 0) {
                return 0;
            }
            if ((n2 & 2) != 0) {
                return 1;
            }
            return 2;
        }
        int n4 = n2;
        if ((0xFFFF & n2) == 0) {
            n4 = n2 >>> 16;
            n3 = 16;
        }
        int n5 = n3;
        int n6 = n4;
        if ((n4 & 0xFF) == 0) {
            n5 = n3 + 8;
            n6 = n4 >>> 8;
        }
        n4 = n5;
        n2 = n6;
        if ((n6 & 0xF) == 0) {
            n4 = n5 + 4;
            n2 = n6 >>> 4;
        }
        n6 = n4;
        n5 = n2;
        if ((n2 & 3) == 0) {
            n6 = n4 + 2;
            n5 = n2 >>> 2;
        }
        n2 = n6;
        if ((n5 & 1) == 0) {
            n2 = n6 + 1;
            if ((n5 >>> 1 & 1) == 0) {
                return 32;
            }
        }
        return n2;
    }

    static BigInteger pow5mult(BigInteger bigInteger, int n2) {
        return bigInteger.multiply(BigInteger.valueOf(5L).pow(n2));
    }

    static boolean roundOff(StringBuilder stringBuilder) {
        int n2 = stringBuilder.length();
        while (n2 != 0) {
            int n3 = n2 - 1;
            char c2 = stringBuilder.charAt(n3);
            n2 = n3;
            if (c2 == '9') continue;
            stringBuilder.setCharAt(n3, (char)(c2 + '\u0001'));
            stringBuilder.setLength(n3 + 1);
            return false;
        }
        stringBuilder.setLength(0);
        return true;
    }

    static double setWord0(double d2, int n2) {
        return Double.longBitsToDouble(Double.doubleToLongBits(d2) & 0xFFFFFFFFL | (long)n2 << 32);
    }

    private static void stripTrailingZeroes(StringBuilder stringBuilder) {
        int n2;
        int n3 = stringBuilder.length();
        while (true) {
            n2 = n3 - 1;
            if (n3 <= 0 || stringBuilder.charAt(n2) != '0') break;
            n3 = n2;
        }
        stringBuilder.setLength(n2 + 1);
    }

    private static void stuffBits(byte[] byArray, int n2, int n3) {
        byArray[n2] = (byte)(n3 >> 24);
        byArray[n2 + 1] = (byte)(n3 >> 16);
        byArray[n2 + 2] = (byte)(n3 >> 8);
        byArray[n2 + 3] = (byte)n3;
    }

    static int word0(double d2) {
        return (int)(Double.doubleToLongBits(d2) >> 32);
    }

    static int word1(double d2) {
        return (int)Double.doubleToLongBits(d2);
    }
}

