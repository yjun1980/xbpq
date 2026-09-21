/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.I.r;
import java.math.BigInteger;

public final class o {
    private static final int[][] a = new int[326][4];
    private static final int[][] b = new int[291][4];

    static {
        BigInteger bigInteger = BigInteger.ONE;
        Comparable<BigInteger> comparable = bigInteger.shiftLeft(31).subtract(bigInteger);
        bigInteger = bigInteger.shiftLeft(31).subtract(bigInteger);
        for (int i2 = 0; i2 < 326; ++i2) {
            Object object;
            int n2;
            int n3 = i2 == 0 ? 1 : (int)(((long)i2 * 23219280L + 10000000L - 1L) / 10000000L);
            if (n3 == (n2 = ((BigInteger)(object = BigInteger.valueOf(5L).pow(i2))).bitLength())) {
                if (i2 < a.length) {
                    for (n3 = 0; n3 < 4; ++n3) {
                        o.a[i2][n3] = ((BigInteger)object).shiftRight((3 - n3) * 31 + (n2 - 121)).and((BigInteger)comparable).intValue();
                    }
                }
                if (i2 >= b.length) continue;
                BigInteger bigInteger2 = BigInteger.ONE;
                bigInteger2 = bigInteger2.shiftLeft(n2 + 121).divide((BigInteger)object).add(bigInteger2);
                for (n3 = 0; n3 < 4; ++n3) {
                    object = b;
                    object[i2][n3] = n3 == 0 ? (Object)bigInteger2.shiftRight((3 - n3) * 31).intValue() : (Object)bigInteger2.shiftRight((3 - n3) * 31).and(bigInteger).intValue();
                }
                continue;
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(n2);
            ((StringBuilder)comparable).append(" != ");
            ((StringBuilder)comparable).append(n3);
            throw new IllegalStateException(((StringBuilder)comparable).toString());
        }
    }

    public static int a(double d2, char[] cArray, int n2) {
        int n3;
        block92: {
            int n4;
            int n5;
            int n6;
            long l2;
            long l3;
            int n7;
            block93: {
                block80: {
                    long l4;
                    long l5;
                    long l6;
                    long l7;
                    boolean bl;
                    boolean bl2;
                    block91: {
                        long l8;
                        long l9;
                        long l10;
                        long l11;
                        long l12;
                        long l13;
                        long l14;
                        long l15;
                        long l16;
                        long l17;
                        long l18;
                        long l19;
                        long l20;
                        long l21;
                        int[] nArray;
                        long l22;
                        block84: {
                            block85: {
                                block88: {
                                    block90: {
                                        block86: {
                                            block89: {
                                                block87: {
                                                    block83: {
                                                        block82: {
                                                            int n8;
                                                            block78: {
                                                                block81: {
                                                                    block79: {
                                                                        block77: {
                                                                            if (!Double.isNaN(d2)) break block77;
                                                                            n8 = n2 + 1;
                                                                            cArray[n2] = 78;
                                                                            int n9 = n8 + 1;
                                                                            cArray[n8] = 97;
                                                                            n8 = n9 + 1;
                                                                            cArray[n9] = 78;
                                                                            break block78;
                                                                        }
                                                                        if (d2 != Double.POSITIVE_INFINITY) break block79;
                                                                        int n10 = n2 + 1;
                                                                        cArray[n2] = 73;
                                                                        n7 = n10 + 1;
                                                                        cArray[n10] = 110;
                                                                        n10 = n7 + 1;
                                                                        cArray[n7] = 102;
                                                                        n7 = n10 + 1;
                                                                        cArray[n10] = 105;
                                                                        n10 = n7 + 1;
                                                                        cArray[n7] = 110;
                                                                        n7 = n10 + 1;
                                                                        cArray[n10] = 105;
                                                                        n10 = n7 + 1;
                                                                        cArray[n7] = 116;
                                                                        n7 = n10 + 1;
                                                                        cArray[n10] = 121;
                                                                        break block80;
                                                                    }
                                                                    if (d2 != Double.NEGATIVE_INFINITY) break block81;
                                                                    int n11 = n2 + 1;
                                                                    cArray[n2] = 45;
                                                                    n8 = n11 + 1;
                                                                    cArray[n11] = 73;
                                                                    n11 = n8 + 1;
                                                                    cArray[n8] = 110;
                                                                    n8 = n11 + 1;
                                                                    cArray[n11] = 102;
                                                                    int n12 = n8 + 1;
                                                                    cArray[n8] = 105;
                                                                    n11 = n12 + 1;
                                                                    cArray[n12] = 110;
                                                                    n8 = n11 + 1;
                                                                    cArray[n11] = 105;
                                                                    n11 = n8 + 1;
                                                                    cArray[n8] = 116;
                                                                    n8 = n11 + 1;
                                                                    cArray[n11] = 121;
                                                                    break block78;
                                                                }
                                                                l3 = Double.doubleToLongBits(d2);
                                                                long l23 = l3 - 0L;
                                                                l2 = l23 == 0L ? 0 : (l23 < 0L ? -1 : 1);
                                                                if (l2 != false) break block82;
                                                                n8 = n2 + 1;
                                                                cArray[n2] = 48;
                                                                int n13 = n8 + 1;
                                                                cArray[n8] = 46;
                                                                n8 = n13 + 1;
                                                                cArray[n13] = 48;
                                                            }
                                                            return n8 - n2;
                                                        }
                                                        if (l3 != Long.MIN_VALUE) break block83;
                                                        int n14 = n2 + 1;
                                                        cArray[n2] = 45;
                                                        n7 = n14 + 1;
                                                        cArray[n14] = 48;
                                                        n14 = n7 + 1;
                                                        cArray[n7] = 46;
                                                        n7 = n14 + 1;
                                                        cArray[n14] = 48;
                                                        break block80;
                                                    }
                                                    n7 = (int)(l3 >>> 52 & 0x7FFL);
                                                    l3 &= 0xFFFFFFFFFFFFFL;
                                                    if (n7 == 0) {
                                                        n3 = -1074;
                                                    } else {
                                                        n3 = n7 - 1023 - 52;
                                                        l3 |= 0x10000000000000L;
                                                    }
                                                    bl2 = l2 < 0;
                                                    bl = (l3 & 1L) == 0L;
                                                    l7 = 4L * l3;
                                                    l22 = 2L + l7;
                                                    n7 = l3 == 0x10000000000000L && n7 > 1 ? 0 : 1;
                                                    l6 = l7 - 1L - (long)n7;
                                                    l2 = n3 - 2;
                                                    if (l2 < 0) break block84;
                                                    n7 = (n6 = Math.max(0, (int)((long)l2 * 3010299L / 10000000L) - 1)) == 0 ? 1 : (int)(((long)n6 * 23219280L + 10000000L - 1L) / 10000000L);
                                                    n5 = (int)(-l2 + n6 + (n7 + 122 - 1) - 93 - 21);
                                                    if (n5 < 0) break block85;
                                                    nArray = b[n6];
                                                    l21 = l7 >>> 31;
                                                    l20 = l7 & Integer.MAX_VALUE;
                                                    l19 = nArray[0];
                                                    l18 = nArray[0];
                                                    l17 = nArray[1];
                                                    l16 = nArray[1];
                                                    l15 = nArray[2];
                                                    l14 = nArray[2];
                                                    l13 = nArray[3];
                                                    l12 = nArray[3];
                                                    l3 = l22 >>> 31;
                                                    l11 = Integer.MAX_VALUE & l22;
                                                    long l24 = nArray[0];
                                                    long l25 = nArray[0];
                                                    long l26 = nArray[1];
                                                    long l27 = nArray[1];
                                                    long l28 = nArray[2];
                                                    long l29 = nArray[2];
                                                    long l30 = nArray[3];
                                                    long l31 = nArray[3];
                                                    l5 = l6 >>> 31;
                                                    l10 = Integer.MAX_VALUE & l6;
                                                    l4 = nArray[0];
                                                    l9 = nArray[0];
                                                    l8 = nArray[1];
                                                    n7 = nArray[1];
                                                    l3 = ((((l31 * l11 >>> 31) + l29 * l11 + l3 * l30 >>> 31) + l27 * l11 + l28 * l3 >>> 31) + l25 * l11 + l26 * l3 >>> 21) + (l24 * l3 << 10) >>> n5;
                                                    l11 = n7;
                                                    l28 = nArray[2];
                                                    l26 = nArray[2];
                                                    l25 = nArray[3];
                                                    l4 = ((((l10 * (long)nArray[3] >>> 31) + l26 * l10 + l5 * l25 >>> 31) + l11 * l10 + l28 * l5 >>> 31) + l9 * l10 + l8 * l5 >>> 21) + (l4 * l5 << 10) >>> n5;
                                                    l5 = l3;
                                                    if (n6 > 21) break block86;
                                                    long l32 = l7 % 5L - 0L;
                                                    n7 = l32 == 0L ? 0 : (l32 < 0L ? -1 : 1);
                                                    if (n7 != 0) break block87;
                                                    if (n7 != 0) {
                                                        n7 = 0;
                                                    } else if (l7 % 25L != 0L) {
                                                        n7 = 1;
                                                    } else if (l7 % 125L != 0L) {
                                                        n7 = 2;
                                                    } else if (l7 % 625L != 0L) {
                                                        n7 = 3;
                                                    } else {
                                                        l5 = l7 / 625L;
                                                        n3 = 4;
                                                        while (true) {
                                                            n7 = n3++;
                                                            if (l5 <= 0L) break;
                                                            if (l5 % 5L != 0L) {
                                                                n7 = n3;
                                                                break;
                                                            }
                                                            l5 /= 5L;
                                                        }
                                                    }
                                                    n3 = n7 >= n6 ? 1 : 0;
                                                    l2 = 0;
                                                    l5 = l3;
                                                    break block88;
                                                }
                                                if (!bl) break block89;
                                                if (l6 % 5L != 0L) {
                                                    n7 = 0;
                                                } else if (l6 % 25L != 0L) {
                                                    n7 = 1;
                                                } else if (l6 % 125L != 0L) {
                                                    n7 = 2;
                                                } else if (l6 % 625L != 0L) {
                                                    n7 = 3;
                                                } else {
                                                    l5 = l6 / 625L;
                                                    n3 = 4;
                                                    while (true) {
                                                        n7 = n3++;
                                                        if (l5 <= 0L) break;
                                                        if (l5 % 5L != 0L) {
                                                            n7 = n3;
                                                            break;
                                                        }
                                                        l5 /= 5L;
                                                    }
                                                }
                                                l5 = l3;
                                                if (n7 < n6) break block86;
                                                l2 = 1;
                                                break block90;
                                            }
                                            if (l22 % 5L != 0L) {
                                                n7 = 0;
                                            } else if (l22 % 25L != 0L) {
                                                n7 = 1;
                                            } else if (l22 % 125L != 0L) {
                                                n7 = 2;
                                            } else if (l22 % 625L != 0L) {
                                                n7 = 3;
                                            } else {
                                                l5 = l22 / 625L;
                                                n3 = 4;
                                                while (true) {
                                                    n7 = n3++;
                                                    if (l5 <= 0L) break;
                                                    if (l5 % 5L != 0L) {
                                                        n7 = n3;
                                                        break;
                                                    }
                                                    l5 /= 5L;
                                                }
                                            }
                                            l5 = l3;
                                            if (n7 >= n6) {
                                                l5 = l3 - 1L;
                                            }
                                        }
                                        l2 = 0;
                                        l3 = l5;
                                    }
                                    n3 = 0;
                                    l5 = l3;
                                }
                                l7 = ((((l20 * l12 >>> 31) + l14 * l20 + l21 * l13 >>> 31) + l16 * l20 + l15 * l21 >>> 31) + l18 * l20 + l17 * l21 >>> 21) + (l19 * l21 << 10) >>> n5;
                                l3 = l4;
                                l4 = l7;
                                break block91;
                            }
                            throw new IllegalArgumentException(r.a("", n5));
                        }
                        n3 = (int)(-l2);
                        n5 = Math.max(0, (int)((long)n3 * 6989700L / 10000000L) - 1);
                        n6 = n3 - n5;
                        n3 = n6 == 0 ? 1 : (int)(((long)n6 * 23219280L + 10000000L - 1L) / 10000000L);
                        if ((n3 = n5 - (n3 - 121) - 93 - 21) < 0) break block92;
                        nArray = a[n6];
                        l20 = l7 >>> 31;
                        l9 = l7 & Integer.MAX_VALUE;
                        l11 = nArray[0];
                        l4 = nArray[0];
                        l8 = nArray[1];
                        l12 = nArray[1];
                        l19 = nArray[2];
                        l14 = nArray[2];
                        l15 = nArray[3];
                        l10 = nArray[3];
                        l3 = l22 >>> 31;
                        l13 = l22 & Integer.MAX_VALUE;
                        l22 = nArray[0];
                        l21 = nArray[0];
                        l5 = nArray[1];
                        l16 = nArray[1];
                        l18 = nArray[2];
                        l17 = nArray[2];
                        n6 = nArray[3];
                        l4 = ((((l9 * l10 >>> 31) + l14 * l9 + l20 * l15 >>> 31) + l12 * l9 + l19 * l20 >>> 31) + l4 * l9 + l8 * l20 >>> 21) + (l11 * l20 << 10) >>> n3;
                        l14 = n6;
                        l3 = ((((l13 * (long)nArray[3] >>> 31) + l17 * l13 + l3 * l14 >>> 31) + l16 * l13 + l18 * l3 >>> 31) + l21 * l13 + l5 * l3 >>> 21) + (l22 * l3 << 10) >>> n3;
                        l5 = l6 >>> 31;
                        l22 = Integer.MAX_VALUE & l6;
                        l21 = nArray[0];
                        l18 = nArray[0];
                        l17 = nArray[1];
                        l13 = nArray[1];
                        l14 = nArray[2];
                        l16 = nArray[2];
                        l6 = nArray[3];
                        l5 = ((((l22 * (long)nArray[3] >>> 31) + l16 * l22 + l5 * l6 >>> 31) + l13 * l22 + l14 * l5 >>> 31) + l18 * l22 + l17 * l5 >>> 21) + (l21 * l5 << 10) >>> n3;
                        n6 = n5 + l2;
                        if (n5 <= 1) {
                            if (bl) {
                                n7 = n7 == 1 ? 1 : 0;
                                l2 = n7;
                                l7 = l3;
                            } else {
                                l7 = l3 - 1L;
                                l2 = 0;
                            }
                            l3 = l5;
                            n3 = 1;
                            l5 = l7;
                        } else if (n5 < 63) {
                            n7 = (l7 & (1L << n5 - 1) - 1L) == 0L ? 1 : 0;
                            l2 = 0;
                            l7 = l3;
                            l3 = l5;
                            n3 = n7;
                            l5 = l7;
                        } else {
                            l2 = 0;
                            l7 = l5;
                            n3 = 0;
                            l5 = l3;
                            l3 = l7;
                        }
                    }
                    n7 = l5 >= 1000000000000000000L ? 19 : (l5 >= 100000000000000000L ? 18 : (l5 >= 10000000000000000L ? 17 : (l5 >= 1000000000000000L ? 16 : (l5 >= 100000000000000L ? 15 : (l5 >= 10000000000000L ? 14 : (l5 >= 1000000000000L ? 13 : (l5 >= 100000000000L ? 12 : (l5 >= 10000000000L ? 11 : (l5 >= 1000000000L ? 10 : (l5 >= 100000000L ? 9 : (l5 >= 10000000L ? 8 : (l5 >= 1000000L ? 7 : (l5 >= 100000L ? 6 : (l5 >= 10000L ? 5 : (l5 >= 1000L ? 4 : (l5 >= 100L ? 3 : (l5 >= 10L ? 2 : 1)))))))))))))))));
                    n4 = n6 + n7 - 1;
                    boolean bl3 = n4 < -3 || n4 >= 7;
                    if (l2 == false && n3 == 0) {
                        n3 = 0;
                        l2 = 0;
                        while (!((l6 = l5 / 10L) <= (l7 = l3 / 10L) || l5 < 100L && bl3)) {
                            l2 = (int)(l4 % 10L);
                            l4 /= 10L;
                            ++n3;
                            l5 = l6;
                            l3 = l7;
                        }
                        l2 = l4 != l3 && l2 < 5 ? (long)0 : (long)1;
                        l3 = l4 + (long)l2;
                    } else {
                        n5 = 0;
                        n6 = 0;
                        l7 = l5;
                        l5 = l4;
                        long l33 = l2;
                        while (!((l6 = l7 / 10L) <= (l4 = l3 / 10L) || l7 < 100L && bl3)) {
                            l2 = l3 % 10L == 0L ? (long)1 : (long)0;
                            l33 = l33 & l2;
                            l2 = n5 == 0 ? (long)1 : (long)0;
                            n3 &= l2;
                            n5 = (int)(l5 % 10L);
                            l5 /= 10L;
                            ++n6;
                            l7 = l6;
                            l3 = l4;
                        }
                        l6 = l3;
                        int n15 = n3;
                        int n16 = n5;
                        l2 = n6;
                        l4 = l5;
                        if (l33 != false) {
                            l6 = l3;
                            n15 = n3;
                            n16 = n5;
                            l2 = n6;
                            l4 = l5;
                            if (bl) {
                                while (true) {
                                    l6 = l3;
                                    n15 = n3;
                                    n16 = n5;
                                    l2 = n6;
                                    l4 = l5;
                                    if (l3 % 10L != 0L) break;
                                    if (l7 < 100L && bl3) {
                                        l6 = l3;
                                        n15 = n3;
                                        n16 = n5;
                                        l2 = n6;
                                        l4 = l5;
                                        break;
                                    }
                                    l2 = n5 == 0 ? (long)1 : (long)0;
                                    n3 &= l2;
                                    n5 = (int)(l5 % 10L);
                                    l7 /= 10L;
                                    l5 /= 10L;
                                    l3 /= 10L;
                                    ++n6;
                                }
                            }
                        }
                        n3 = n16;
                        if (n15 != 0) {
                            n3 = n16;
                            if (n16 == 5) {
                                n3 = n16;
                                if (l4 % 2L == 0L) {
                                    n3 = 4;
                                }
                            }
                        }
                        n3 = l4 == l6 && (l33 == false || !bl) || n3 >= 5 ? 1 : 0;
                        l3 = l4 + (long)n3;
                        n3 = (int)l2;
                    }
                    n5 = n7 - n3;
                    if (bl2) {
                        n7 = n2 + 1;
                        cArray[n2] = 45;
                    } else {
                        n7 = n2;
                    }
                    if (!bl3) break block93;
                    for (n3 = 0; n3 < n5 - 1; ++n3) {
                        l2 = (int)(l3 % 10L);
                        l3 /= 10L;
                        cArray[n7 + n5 - n3] = (char)(l2 + 48);
                    }
                    cArray[n7] = (char)(l3 % 10L + 48L);
                    cArray[n7 + 1] = 46;
                    n7 = n3 = n5 + 1 + n7;
                    if (n5 == 1) {
                        cArray[n3] = 48;
                        n7 = n3 + 1;
                    }
                    l2 = n7 + 1;
                    cArray[n7] = 69;
                    n3 = (int)l2;
                    n7 = n4;
                    if (n4 < 0) {
                        cArray[l2] = 45;
                        n7 = -n4;
                        n3 = (int)(l2 + true);
                    }
                    if (n7 >= 100) {
                        n5 = n3 + 1;
                        cArray[n3] = (char)(n7 / 100 + 48);
                        n6 = n7 % 100;
                        l2 = n5 + 1;
                        cArray[n5] = (char)(n6 / 10 + 48);
                    } else {
                        l2 = n3;
                        n6 = n7;
                        if (n7 >= 10) {
                            cArray[n3] = (char)(n7 / 10 + 48);
                            l2 = n3 + 1;
                            n6 = n7;
                        }
                    }
                    n7 = (int)(l2 + true);
                    cArray[l2] = (char)(n6 % 10 + 48);
                }
                return n7 - n2;
            }
            if (n4 < 0) {
                n3 = n7 + 1;
                cArray[n7] = 48;
                n7 = n3 + 1;
                cArray[n3] = 46;
                n3 = -1;
                while (n3 > n4) {
                    cArray[n7] = 48;
                    --n3;
                    ++n7;
                }
                n6 = 0;
                n3 = n7;
                while (true) {
                    l2 = n3;
                    if (n6 < n5) {
                        cArray[n7 + n5 - n6 - 1] = (char)(l3 % 10L + 48L);
                        l3 /= 10L;
                        ++n3;
                        ++n6;
                        continue;
                    }
                    break;
                }
            } else {
                l2 = n4 + 1;
                if (l2 >= n5) {
                    for (n3 = 0; n3 < n5; ++n3) {
                        cArray[n7 + n5 - n3 - 1] = (char)(l3 % 10L + 48L);
                        l3 /= 10L;
                    }
                    n7 += n5;
                    n3 = n5;
                    while (n3 < l2) {
                        cArray[n7] = 48;
                        ++n3;
                        ++n7;
                    }
                    n3 = n7 + 1;
                    cArray[n7] = 46;
                    cArray[n3] = 48;
                    l2 = n3 + 1;
                } else {
                    l2 = n7 + 1;
                    for (n3 = 0; n3 < n5; ++n3) {
                        n6 = (int)l2;
                        if (n5 - n3 - 1 == n4) {
                            cArray[l2 + n5 - n3 - true] = 46;
                            n6 = (int)(l2 - true);
                        }
                        cArray[n6 + n5 - n3 - 1] = (char)(l3 % 10L + 48L);
                        l3 /= 10L;
                        l2 = n6;
                    }
                    l2 = n5 + 1 + n7;
                }
            }
            return (int)(l2 - n2);
        }
        throw new IllegalArgumentException(r.a("", n3));
    }
}

