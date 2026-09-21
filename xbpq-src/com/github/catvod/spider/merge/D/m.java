/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;
import java.math.BigDecimal;

public final class m
implements X,
v {
    static final BigDecimal a = BigDecimal.valueOf(-9007199254740991L);
    static final BigDecimal b = BigDecimal.valueOf(0x1FFFFFFFFFFFFFL);
    public static final m c = new m();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final <T> T c(b object, Type type, Object object2) {
        try {
            com.github.catvod.spider.merge.B.d d2 = ((b)object).f;
            int n2 = d2.p();
            type = null;
            if (n2 == 2 || d2.p() == 3) {
                object = d2.s();
                d2.o(16);
                return (T)object;
            }
            if ((object = ((b)object).o(null)) == null) {
                object = type;
                return (T)object;
            }
            object = A.g(object);
            return (T)object;
        }
        catch (Exception exception) {
            throw new d(com.github.catvod.spider.merge.A.c.a("parseDecimal error, field : ", object2), exception);
        }
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object3 = ((L)object).j;
        if (object2 == null) {
            ((h0)object3).u(i0.j);
        } else {
            object2 = (BigDecimal)object2;
            int n3 = ((BigDecimal)object2).scale();
            object = i0.b(n2, ((h0)object3).c, i0.B) && n3 >= -100 && n3 < 100 ? ((BigDecimal)object2).toPlainString() : ((BigDecimal)object2).toString();
            if (n3 == 0 && ((String)object).length() >= 16 && i0.b(n2, ((h0)object3).c, i0.r) && (((BigDecimal)object2).compareTo(a) < 0 || ((BigDecimal)object2).compareTo(b) > 0)) {
                ((h0)object3).v((String)object);
                return;
            }
            ((h0)object3).write((String)object);
            if (((h0)object3).g(i0.o) && type != BigDecimal.class && ((BigDecimal)object2).scale() == 0) {
                ((h0)object3).write(46);
            }
        }
    }

    @Override
    public final int e() {
        return 2;
    }
}

