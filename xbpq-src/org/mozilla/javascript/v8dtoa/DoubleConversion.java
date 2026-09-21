/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.v8dtoa;

public final class DoubleConversion {
    private static final int kDenormalExponent = -1074;
    private static final int kExponentBias = 1075;
    private static final long kExponentMask = 0x7FF0000000000000L;
    private static final long kHiddenBit = 0x10000000000000L;
    private static final int kPhysicalSignificandSize = 52;
    private static final long kSignMask = Long.MIN_VALUE;
    private static final long kSignificandMask = 0xFFFFFFFFFFFFFL;
    private static final int kSignificandSize = 53;

    private DoubleConversion() {
    }

    public static int doubleToInt32(double d2) {
        int n2 = (int)d2;
        if ((double)n2 == d2) {
            return n2;
        }
        long l2 = Double.doubleToLongBits(d2);
        n2 = DoubleConversion.exponent(l2);
        if (n2 > -53 && n2 <= 31) {
            long l3 = DoubleConversion.significand(l2);
            int n3 = DoubleConversion.sign(l2);
            l2 = n2 < 0 ? l3 >> -n2 : l3 << n2;
            return n3 * (int)l2;
        }
        return 0;
    }

    private static int exponent(long l2) {
        if (DoubleConversion.isDenormal(l2)) {
            return -1074;
        }
        return (int)((l2 & 0x7FF0000000000000L) >> 52) - 1075;
    }

    private static boolean isDenormal(long l2) {
        boolean bl = (l2 & 0x7FF0000000000000L) == 0L;
        return bl;
    }

    private static int sign(long l2) {
        int n2 = (l2 & Long.MIN_VALUE) == 0L ? 1 : -1;
        return n2;
    }

    private static long significand(long l2) {
        long l3;
        long l4 = l3 = 0xFFFFFFFFFFFFFL & l2;
        if (!DoubleConversion.isDenormal(l2)) {
            l4 = l3 + 0x10000000000000L;
        }
        return l4;
    }
}

