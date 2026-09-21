/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.b;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

final class l
implements G {
    public static final l a = new l();

    l() {
    }

    private static Object b(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Float) {
            return Math.floor(((Float)object).floatValue());
        }
        if (object instanceof Double) {
            return Math.floor((Double)object);
        }
        if (object instanceof BigDecimal) {
            return ((BigDecimal)object).setScale(0, RoundingMode.FLOOR);
        }
        if (!(object instanceof Byte || object instanceof Short || object instanceof Integer || object instanceof Long || object instanceof BigInteger)) {
            throw new UnsupportedOperationException();
        }
        return object;
    }

    @Override
    public final Object a(N c2, Object object, Object object2) {
        if (object2 instanceof b) {
            c2 = (b)((b)object2).clone();
            for (int i2 = 0; i2 < ((b)c2).size(); ++i2) {
                object2 = ((b)c2).get(i2);
                object = l.b(object2);
                if (object == object2) continue;
                ((b)c2).set(i2, object);
            }
            return c2;
        }
        return l.b(object2);
    }
}

