/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.M1.a;
import com.github.catvod.spider.merge.O1.b;
import java.math.BigInteger;

public final class j
implements a {
    public static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2) {
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

    public static com.github.catvod.spider.merge.H0.b c(com.github.catvod.spider.merge.H0.b object, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = ((com.github.catvod.spider.merge.H0.b)object).b;
        if (bigInteger3 != null && !bigInteger3.equals(BigInteger.ZERO)) {
            bigInteger3 = ((com.github.catvod.spider.merge.H0.b)object).b.pow(2).mod(bigInteger2);
            BigInteger bigInteger4 = BigInteger.valueOf(4L).multiply(((com.github.catvod.spider.merge.H0.b)object).a).multiply(bigInteger3).mod(bigInteger2);
            bigInteger = BigInteger.valueOf(3L).multiply(((com.github.catvod.spider.merge.H0.b)object).a.pow(2)).add(bigInteger.multiply(((com.github.catvod.spider.merge.H0.b)object).c.pow(4))).mod(bigInteger2);
            BigInteger bigInteger5 = bigInteger.pow(2).subtract(BigInteger.valueOf(2L).multiply(bigInteger4)).mod(bigInteger2);
            return new com.github.catvod.spider.merge.H0.b(bigInteger5, bigInteger.multiply(bigInteger4.subtract(bigInteger5)).subtract(BigInteger.valueOf(8L).multiply(bigInteger3.pow(2))).mod(bigInteger2), BigInteger.valueOf(2L).multiply(((com.github.catvod.spider.merge.H0.b)object).b).multiply(((com.github.catvod.spider.merge.H0.b)object).c).mod(bigInteger2));
        }
        object = BigInteger.ZERO;
        return new com.github.catvod.spider.merge.H0.b((BigInteger)object, (BigInteger)object, (BigInteger)object);
    }

    public static com.github.catvod.spider.merge.H0.b d(com.github.catvod.spider.merge.H0.b b2, BigInteger object, BigInteger object2, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigInteger3.compareTo(b2.b) != 0 && bigInteger3.compareTo((BigInteger)object) != 0) {
            BigInteger bigInteger4 = BigInteger.ONE;
            if (bigInteger4.compareTo((BigInteger)object) == 0) {
                return b2;
            }
            if (((BigInteger)object).compareTo(bigInteger3) >= 0 && ((BigInteger)object).compareTo((BigInteger)object2) < 0) {
                if (((BigInteger)object).mod(BigInteger.valueOf(2L)).compareTo(bigInteger3) == 0) {
                    return j.c(j.d(b2, ((BigInteger)object).divide(BigInteger.valueOf(2L)), (BigInteger)object2, bigInteger, bigInteger2), bigInteger, bigInteger2);
                }
                if (((BigInteger)object).mod(BigInteger.valueOf(2L)).compareTo(bigInteger4) == 0) {
                    object2 = j.c(j.d(b2, ((BigInteger)object).divide(BigInteger.valueOf(2L)), (BigInteger)object2, bigInteger, bigInteger2), bigInteger, bigInteger2);
                    BigInteger bigInteger5 = ((com.github.catvod.spider.merge.H0.b)object2).b;
                    object = b2;
                    if (bigInteger5 != null) {
                        if (bigInteger5.equals(bigInteger3)) {
                            object = b2;
                        } else {
                            bigInteger5 = b2.b;
                            object = object2;
                            if (bigInteger5 != null) {
                                if (bigInteger5.equals(bigInteger3)) {
                                    object = object2;
                                } else {
                                    bigInteger5 = ((com.github.catvod.spider.merge.H0.b)object2).a.multiply(b2.c.pow(2)).mod(bigInteger2);
                                    BigInteger bigInteger6 = b2.a.multiply(((com.github.catvod.spider.merge.H0.b)object2).c.pow(2)).mod(bigInteger2);
                                    object = ((com.github.catvod.spider.merge.H0.b)object2).b.multiply(b2.c.pow(3)).mod(bigInteger2);
                                    BigInteger bigInteger7 = b2.b.multiply(((com.github.catvod.spider.merge.H0.b)object2).c.pow(3)).mod(bigInteger2);
                                    if (bigInteger5.compareTo(bigInteger6) == 0) {
                                        object = ((BigInteger)object).compareTo(bigInteger7) != 0 ? new com.github.catvod.spider.merge.H0.b(bigInteger3, bigInteger3, bigInteger4) : j.c((com.github.catvod.spider.merge.H0.b)object2, bigInteger, bigInteger2);
                                    } else {
                                        bigInteger = bigInteger6.subtract(bigInteger5);
                                        bigInteger4 = bigInteger7.subtract((BigInteger)object);
                                        bigInteger7 = bigInteger.multiply(bigInteger).mod(bigInteger2);
                                        bigInteger3 = bigInteger.multiply(bigInteger7).mod(bigInteger2);
                                        bigInteger7 = bigInteger5.multiply(bigInteger7).mod(bigInteger2);
                                        bigInteger5 = bigInteger4.pow(2).subtract(bigInteger3).subtract(BigInteger.valueOf(2L).multiply(bigInteger7)).mod(bigInteger2);
                                        object = new com.github.catvod.spider.merge.H0.b(bigInteger5, bigInteger4.multiply(bigInteger7.subtract(bigInteger5)).subtract(((BigInteger)object).multiply(bigInteger3)).mod(bigInteger2), bigInteger.multiply(((com.github.catvod.spider.merge.H0.b)object2).c).multiply(b2.c).mod(bigInteger2));
                                    }
                                }
                            }
                        }
                    }
                    return object;
                }
                return null;
            }
            return j.d(b2, ((BigInteger)object).mod((BigInteger)object2), (BigInteger)object2, bigInteger, bigInteger2);
        }
        return new com.github.catvod.spider.merge.H0.b(bigInteger3, bigInteger3, BigInteger.ONE);
    }

    public static com.github.catvod.spider.merge.H0.b e(com.github.catvod.spider.merge.H0.b object, BigInteger object2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        object2 = j.d(new com.github.catvod.spider.merge.H0.b(((com.github.catvod.spider.merge.H0.b)object).a, ((com.github.catvod.spider.merge.H0.b)object).b, BigInteger.ONE), (BigInteger)object2, bigInteger, bigInteger2, bigInteger3);
        object = j.b(((com.github.catvod.spider.merge.H0.b)object2).c, bigInteger3);
        return new com.github.catvod.spider.merge.H0.b(((com.github.catvod.spider.merge.H0.b)object2).a.multiply(((BigInteger)object).pow(2)).mod(bigInteger3), ((com.github.catvod.spider.merge.H0.b)object2).b.multiply(((BigInteger)object).pow(3)).mod(bigInteger3), BigInteger.ZERO);
    }

    public static String f(int n2) {
        switch (n2) {
            default: {
                return "Unknown";
            }
            case 26: {
                return "hex";
            }
            case 25: {
                return ".";
            }
            case 24: {
                return ";";
            }
            case 23: {
                return "undefined";
            }
            case 22: {
                return "TreeSet";
            }
            case 21: {
                return "Set";
            }
            case 20: {
                return "EOF";
            }
            case 19: {
                return "fieldName";
            }
            case 18: {
                return "ident";
            }
            case 17: {
                return ":";
            }
            case 16: {
                return ",";
            }
            case 15: {
                return "]";
            }
            case 14: {
                return "[";
            }
            case 13: {
                return "}";
            }
            case 12: {
                return "{";
            }
            case 11: {
                return ")";
            }
            case 10: {
                return "(";
            }
            case 9: {
                return "new";
            }
            case 8: {
                return "null";
            }
            case 7: {
                return "false";
            }
            case 6: {
                return "true";
            }
            case 5: {
                return "iso8601";
            }
            case 4: {
                return "string";
            }
            case 3: {
                return "float";
            }
            case 2: {
                return "int";
            }
            case 1: 
        }
        return "error";
    }

    @Override
    public com.github.catvod.spider.merge.M1.b a(String string) {
        return b.a;
    }
}

