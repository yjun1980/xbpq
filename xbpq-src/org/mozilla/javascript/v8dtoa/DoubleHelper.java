/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.v8dtoa;

import org.mozilla.javascript.v8dtoa.DiyFp;

public class DoubleHelper {
    static final boolean $assertionsDisabled = false;
    private static final int kDenormalExponent = -1074;
    private static final int kExponentBias = 1075;
    static final long kExponentMask = 0x7FF0000000000000L;
    static final long kHiddenBit = 0x10000000000000L;
    static final long kSignMask = Long.MIN_VALUE;
    static final long kSignificandMask = 0xFFFFFFFFFFFFFL;
    private static final int kSignificandSize = 52;

    static DiyFp asDiyFp(long l2) {
        return new DiyFp(DoubleHelper.significand(l2), DoubleHelper.exponent(l2));
    }

    static DiyFp asNormalizedDiyFp(long l2) {
        long l3 = DoubleHelper.significand(l2);
        int n2 = DoubleHelper.exponent(l2);
        l2 = l3;
        while ((0x10000000000000L & l2) == 0L) {
            l2 <<= 1;
            --n2;
        }
        return new DiyFp(l2 << 11, n2 - 11);
    }

    static int exponent(long l2) {
        if (DoubleHelper.isDenormal(l2)) {
            return -1074;
        }
        return (int)((l2 & 0x7FF0000000000000L) >>> 52 & 0xFFFFFFFFL) - 1075;
    }

    static boolean isDenormal(long l2) {
        boolean bl = (l2 & 0x7FF0000000000000L) == 0L;
        return bl;
    }

    static boolean isInfinite(long l2) {
        boolean bl = (l2 & 0x7FF0000000000000L) == 0x7FF0000000000000L && (l2 & 0xFFFFFFFFFFFFFL) == 0L;
        return bl;
    }

    static boolean isNan(long l2) {
        boolean bl = (l2 & 0x7FF0000000000000L) == 0x7FF0000000000000L && (l2 & 0xFFFFFFFFFFFFFL) != 0L;
        return bl;
    }

    static boolean isSpecial(long l2) {
        boolean bl = (l2 & 0x7FF0000000000000L) == 0x7FF0000000000000L;
        return bl;
    }

    static void normalizedBoundaries(long l2, DiyFp diyFp, DiyFp diyFp2) {
        DiyFp diyFp3 = DoubleHelper.asDiyFp(l2);
        l2 = diyFp3.f();
        int n2 = 1;
        int n3 = l2 == 0x10000000000000L ? 1 : 0;
        diyFp2.setF((diyFp3.f() << 1) + 1L);
        diyFp2.setE(diyFp3.e() - 1);
        diyFp2.normalize();
        if (n3 != 0 && diyFp3.e() != -1074) {
            l2 = diyFp3.f();
            n3 = 2;
        } else {
            l2 = diyFp3.f();
            n3 = n2;
        }
        diyFp.setF((l2 << n3) - 1L);
        diyFp.setE(diyFp3.e() - n3);
        diyFp.setF(diyFp.f() << diyFp.e() - diyFp2.e());
        diyFp.setE(diyFp2.e());
    }

    static int sign(long l2) {
        int n2 = (l2 & Long.MIN_VALUE) == 0L ? 1 : -1;
        return n2;
    }

    static long significand(long l2) {
        long l3;
        long l4 = l3 = 0xFFFFFFFFFFFFFL & l2;
        if (!DoubleHelper.isDenormal(l2)) {
            l4 = l3 + 0x10000000000000L;
        }
        return l4;
    }
}

