/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.H0.b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public final class a {
    public static final a f;
    public static final ArrayList g;
    public static final HashMap h;
    public BigInteger a;
    public BigInteger b;
    public BigInteger c;
    public b d;
    public long[] e;

    static {
        Iterator iterator = BigInteger.ZERO;
        BigInteger.valueOf(7L);
        iterator = new a(new BigInteger("fffffffffffffffffffffffffffffffffffffffffffffffffffffffefffffc2f", 16), new BigInteger("fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364141", 16), new BigInteger("79be667ef9dcbbac55a06295ce870b07029bfcdb2dce28d959f2815b16f81798", 16), new BigInteger("483ada7726a3c4655da4fbfc0e1108a8fd17b448a68554199c47d08ffb10d4b8", 16), new long[]{1L, 3L, 132L, 0L, 10L});
        f = iterator;
        Object object = new ArrayList();
        g = object;
        h = new HashMap();
        ((ArrayList)object).add(iterator);
        iterator = ((ArrayList)object).iterator();
        while (iterator.hasNext()) {
            object = (a)iterator.next();
            h.put(Arrays.hashCode(((a)object).e), object);
        }
    }

    public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, long[] lArray) {
        BigInteger bigInteger5 = BigInteger.ZERO;
        this.a = bigInteger5;
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = new b(bigInteger3, bigInteger4);
        this.e = lArray;
    }
}

