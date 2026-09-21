/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.v8dtoa;

import org.mozilla.javascript.v8dtoa.CachedPowers;
import org.mozilla.javascript.v8dtoa.DiyFp;
import org.mozilla.javascript.v8dtoa.DoubleHelper;
import org.mozilla.javascript.v8dtoa.FastDtoaBuilder;

public class FastDtoa {
    static final boolean $assertionsDisabled = false;
    static final int kFastDtoaMaximalLength = 17;
    static final int kTen4 = 10000;
    static final int kTen5 = 100000;
    static final int kTen6 = 1000000;
    static final int kTen7 = 10000000;
    static final int kTen8 = 100000000;
    static final int kTen9 = 1000000000;
    static final int maximal_target_exponent = -32;
    static final int minimal_target_exponent = -60;

    /*
     * Unable to fully structure code
     */
    static long biggestPowerTen(int var0, int var1_1) {
        var3_2 = 1000000000;
        var2_3 = 1;
        block0 : switch (var1_1) {
            default: {
                var0 = 0;
lbl6:
                // 2 sources

                while (true) {
                    var1_1 = 0;
                    break block0;
                    break;
                }
            }
            case 30: 
            case 31: 
            case 32: {
                if (1000000000 <= var0) {
                    var1_1 = 9;
                    var0 = var3_2;
                    break;
                }
            }
            case 27: 
            case 28: 
            case 29: {
                if (100000000 <= var0) {
                    var1_1 = 8;
                    var0 = 100000000;
                    break;
                }
            }
            case 24: 
            case 25: 
            case 26: {
                if (10000000 <= var0) {
                    var1_1 = 7;
                    var0 = 10000000;
                    break;
                }
            }
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                if (1000000 <= var0) {
                    var1_1 = 6;
                    var0 = 1000000;
                    break;
                }
            }
            case 17: 
            case 18: 
            case 19: {
                if (100000 <= var0) {
                    var1_1 = 5;
                    var0 = 100000;
                    break;
                }
            }
            case 14: 
            case 15: 
            case 16: {
                if (10000 <= var0) {
                    var1_1 = 4;
                    var0 = 10000;
                    break;
                }
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                if (1000 <= var0) {
                    var1_1 = 3;
                    var0 = 1000;
                    break;
                }
            }
            case 7: 
            case 8: 
            case 9: {
                if (100 <= var0) {
                    var1_1 = 2;
                    var0 = 100;
                    break;
                }
            }
            case 4: 
            case 5: 
            case 6: {
                if (10 <= var0) {
                    var0 = 10;
                    var1_1 = var2_3;
                    break;
                }
            }
            case 1: 
            case 2: 
            case 3: {
                if (1 <= var0) {
                    var0 = 1;
                    ** continue;
                }
            }
            case 0: {
                var1_1 = -1;
                var0 = 0;
            }
        }
        return (long)var0 << 32 | 0xFFFFFFFFL & (long)var1_1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean digitGen(DiyFp diyFp, DiyFp diyFp2, DiyFp diyFp3, FastDtoaBuilder fastDtoaBuilder, int n2) {
        long l2;
        long l3;
        long l4;
        DiyFp diyFp4 = new DiyFp(diyFp.f() - 1L, diyFp.e());
        diyFp = new DiyFp(diyFp3.f() + 1L, diyFp3.e());
        diyFp3 = DiyFp.minus(diyFp, diyFp4);
        diyFp4 = new DiyFp(1L << -diyFp2.e(), diyFp2.e());
        int n3 = (int)(diyFp.f() >>> -diyFp4.e() & 0xFFFFFFFFL);
        long l5 = diyFp.f() & diyFp4.f() - 1L;
        long l6 = FastDtoa.biggestPowerTen(n3, 64 - -diyFp4.e());
        int n4 = (int)(l6 >>> 32 & 0xFFFFFFFFL);
        int n5 = (int)(l6 & 0xFFFFFFFFL) + 1;
        while (n5 > 0) {
            fastDtoaBuilder.append((char)(n3 / n4 + 48));
            --n5;
            l4 = ((long)(n3 %= n4) << -diyFp4.e()) + l5;
            if (l4 < diyFp3.f()) {
                fastDtoaBuilder.point = fastDtoaBuilder.end - n2 + n5;
                l6 = DiyFp.minus(diyFp, diyFp2).f();
                l5 = diyFp3.f();
                l3 = n4;
                n2 = -diyFp4.e();
                l2 = l3 << n2;
                l3 = 1L;
                return FastDtoa.roundWeed(fastDtoaBuilder, l6, l5, l4, l2, l3);
            }
            n4 /= 10;
        }
        l6 = 1L;
        l4 = l5;
        do {
            l5 = l4 * 5L;
            l6 *= 5L;
            diyFp3.setF(diyFp3.f() * 5L);
            diyFp3.setE(diyFp3.e() + 1);
            diyFp4.setF(diyFp4.f() >>> 1);
            diyFp4.setE(diyFp4.e() + 1);
            fastDtoaBuilder.append((char)((int)(l5 >>> -diyFp4.e() & 0xFFFFFFFFL) + 48));
            l4 = l5 & diyFp4.f() - 1L;
            --n5;
        } while (l4 >= diyFp3.f());
        fastDtoaBuilder.point = fastDtoaBuilder.end - n2 + n5;
        l3 = DiyFp.minus(diyFp, diyFp2).f();
        l5 = diyFp3.f();
        l2 = diyFp4.f();
        long l7 = l3 * l6;
        l3 = l6;
        l6 = l7;
        return FastDtoa.roundWeed(fastDtoaBuilder, l6, l5, l4, l2, l3);
    }

    public static boolean dtoa(double d2, FastDtoaBuilder fastDtoaBuilder) {
        return FastDtoa.grisu3(d2, fastDtoaBuilder);
    }

    static boolean grisu3(double d2, FastDtoaBuilder fastDtoaBuilder) {
        long l2 = Double.doubleToLongBits(d2);
        DiyFp diyFp = DoubleHelper.asNormalizedDiyFp(l2);
        DiyFp diyFp2 = new DiyFp();
        DiyFp diyFp3 = new DiyFp();
        DoubleHelper.normalizedBoundaries(l2, diyFp2, diyFp3);
        DiyFp diyFp4 = new DiyFp();
        int n2 = CachedPowers.getCachedPower(diyFp.e() + 64, -60, -32, diyFp4);
        diyFp = DiyFp.times(diyFp, diyFp4);
        return FastDtoa.digitGen(DiyFp.times(diyFp2, diyFp4), diyFp, DiyFp.times(diyFp3, diyFp4), fastDtoaBuilder, n2);
    }

    public static String numberToString(double d2) {
        Object object = new FastDtoaBuilder();
        object = FastDtoa.numberToString(d2, (FastDtoaBuilder)object) ? ((FastDtoaBuilder)object).format() : null;
        return object;
    }

    public static boolean numberToString(double d2, FastDtoaBuilder fastDtoaBuilder) {
        fastDtoaBuilder.reset();
        double d3 = d2;
        if (d2 < 0.0) {
            fastDtoaBuilder.append('-');
            d3 = -d2;
        }
        return FastDtoa.dtoa(d3, fastDtoaBuilder);
    }

    static boolean roundWeed(FastDtoaBuilder fastDtoaBuilder, long l2, long l3, long l4, long l5, long l6) {
        long l7 = l2 - l6;
        long l8 = l2 + l6;
        l2 = l4;
        while (l2 < l7 && l3 - l2 >= l5 && ((l4 = l2 + l5) < l7 || l7 - l2 >= l4 - l7)) {
            fastDtoaBuilder.decreaseLast();
            l2 = l4;
        }
        boolean bl = false;
        if (l2 < l8 && l3 - l2 >= l5 && ((l4 = l2 + l5) < l8 || l8 - l2 > l4 - l8)) {
            return false;
        }
        boolean bl2 = bl;
        if (2L * l6 <= l2) {
            bl2 = bl;
            if (l2 <= l3 - 4L * l6) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private static boolean uint64_lte(long l2, long l3) {
        int n2;
        int n3;
        boolean bl = false;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false || ((n3 = l2 < 0L ? 1 : 0) ^ (l4 = l4 < 0 ? (long)1 : (long)0) ^ (n2 = l3 < 0L ? 1 : 0)) != 0) {
            bl = true;
        }
        return bl;
    }
}

