/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0792;
import java.math.BigInteger;

public final class \u0791 {
    public static \u0792 \u037f(\u0792 \u07922, BigInteger bigInteger) {
        BigInteger bigInteger2 = \u0791.\u0528(\u07922.\u0529, bigInteger);
        return new \u0792(\u07922.\u037f.multiply(bigInteger2.pow(2)).mod(bigInteger), \u07922.\u0528.multiply(bigInteger2.pow(3)).mod(bigInteger), BigInteger.ZERO);
    }

    public static BigInteger \u0528(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigInteger.compareTo(bigInteger3) == 0) {
            return bigInteger3;
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        bigInteger = bigInteger.mod(bigInteger2);
        BigInteger bigInteger5 = bigInteger2;
        while (bigInteger.compareTo(BigInteger.ONE) > 0) {
            BigInteger bigInteger6 = bigInteger5.divide(bigInteger);
            BigInteger bigInteger7 = bigInteger3.subtract(bigInteger4.multiply(bigInteger6));
            bigInteger6 = bigInteger5.subtract(bigInteger.multiply(bigInteger6));
            bigInteger3 = bigInteger4;
            bigInteger4 = bigInteger7;
            bigInteger5 = bigInteger;
            bigInteger = bigInteger6;
        }
        return bigInteger4.mod(bigInteger2);
    }

    public static \u0792 \u0529(\u0792 \u07922, \u0792 \u07923, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3;
        BigInteger bigInteger4 = \u07922.\u0528;
        if (bigInteger4 != null && !bigInteger4.equals(bigInteger3 = BigInteger.ZERO)) {
            bigInteger4 = \u07923.\u0528;
            if (bigInteger4 != null && !bigInteger4.equals(bigInteger3)) {
                BigInteger bigInteger5 = \u07922.\u037f.multiply(\u07923.\u0529.pow(2)).mod(bigInteger2);
                BigInteger bigInteger6 = \u07923.\u037f.multiply(\u07922.\u0529.pow(2)).mod(bigInteger2);
                bigInteger4 = \u07922.\u0528.multiply(\u07923.\u0529.pow(3)).mod(bigInteger2);
                BigInteger bigInteger7 = \u07923.\u0528.multiply(\u07922.\u0529.pow(3)).mod(bigInteger2);
                if (bigInteger5.compareTo(bigInteger6) == 0) {
                    if (bigInteger4.compareTo(bigInteger7) != 0) {
                        return new \u0792(bigInteger3, bigInteger3, BigInteger.ONE);
                    }
                    return \u0791.\u052a(\u07922, bigInteger, bigInteger2);
                }
                bigInteger = bigInteger6.subtract(bigInteger5);
                bigInteger3 = bigInteger7.subtract(bigInteger4);
                bigInteger6 = bigInteger.multiply(bigInteger).mod(bigInteger2);
                bigInteger7 = bigInteger.multiply(bigInteger6).mod(bigInteger2);
                bigInteger6 = bigInteger5.multiply(bigInteger6).mod(bigInteger2);
                bigInteger5 = bigInteger3.pow(2).subtract(bigInteger7).subtract(BigInteger.valueOf(2L).multiply(bigInteger6)).mod(bigInteger2);
                return new \u0792(bigInteger5, bigInteger3.multiply(bigInteger6.subtract(bigInteger5)).subtract(bigInteger4.multiply(bigInteger7)).mod(bigInteger2), bigInteger.multiply(\u07922.\u0529).multiply(\u07923.\u0529).mod(bigInteger2));
            }
            return \u07922;
        }
        return \u07923;
    }

    public static \u0792 \u052a(\u0792 object, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = ((\u0792)object).\u0528;
        if (bigInteger3 != null && !bigInteger3.equals(BigInteger.ZERO)) {
            bigInteger3 = ((\u0792)object).\u0528.pow(2).mod(bigInteger2);
            BigInteger bigInteger4 = BigInteger.valueOf(4L).multiply(((\u0792)object).\u037f).multiply(bigInteger3).mod(bigInteger2);
            BigInteger bigInteger5 = BigInteger.valueOf(3L).multiply(((\u0792)object).\u037f.pow(2)).add(bigInteger.multiply(((\u0792)object).\u0529.pow(4))).mod(bigInteger2);
            bigInteger = bigInteger5.pow(2).subtract(BigInteger.valueOf(2L).multiply(bigInteger4)).mod(bigInteger2);
            return new \u0792(bigInteger, bigInteger5.multiply(bigInteger4.subtract(bigInteger)).subtract(BigInteger.valueOf(8L).multiply(bigInteger3.pow(2))).mod(bigInteger2), BigInteger.valueOf(2L).multiply(((\u0792)object).\u0528).multiply(((\u0792)object).\u0529).mod(bigInteger2));
        }
        object = BigInteger.ZERO;
        return new \u0792((BigInteger)object, (BigInteger)object, (BigInteger)object);
    }

    public static \u0792 \u052b(\u0792 \u07922, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        BigInteger bigInteger5 = BigInteger.ZERO;
        if (bigInteger5.compareTo(\u07922.\u0528) != 0 && bigInteger5.compareTo(bigInteger) != 0) {
            BigInteger bigInteger6 = BigInteger.ONE;
            if (bigInteger6.compareTo(bigInteger) == 0) {
                return \u07922;
            }
            if (bigInteger.compareTo(bigInteger5) >= 0 && bigInteger.compareTo(bigInteger2) < 0) {
                if (bigInteger.mod(BigInteger.valueOf(2L)).compareTo(bigInteger5) == 0) {
                    return \u0791.\u052a(\u0791.\u052b(\u07922, bigInteger.divide(BigInteger.valueOf(2L)), bigInteger2, bigInteger3, bigInteger4), bigInteger3, bigInteger4);
                }
                if (bigInteger.mod(BigInteger.valueOf(2L)).compareTo(bigInteger6) == 0) {
                    return \u0791.\u0529(\u0791.\u052a(\u0791.\u052b(\u07922, bigInteger.divide(BigInteger.valueOf(2L)), bigInteger2, bigInteger3, bigInteger4), bigInteger3, bigInteger4), \u07922, bigInteger3, bigInteger4);
                }
                return null;
            }
            return \u0791.\u052b(\u07922, bigInteger.mod(bigInteger2), bigInteger2, bigInteger3, bigInteger4);
        }
        return new \u0792(bigInteger5, bigInteger5, BigInteger.ONE);
    }

    public static \u0792 \u052c(\u0792 \u07922, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return \u0791.\u037f(\u0791.\u052b(\u0791.\u052d(\u07922), bigInteger, bigInteger2, bigInteger3, bigInteger4), bigInteger4);
    }

    public static \u0792 \u052d(\u0792 \u07922) {
        return new \u0792(\u07922.\u037f, \u07922.\u0528, BigInteger.ONE);
    }
}

