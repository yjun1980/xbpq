/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;
import java.math.BigDecimal;

public final class u
implements v {
    public static final u a = new u();

    @Override
    public final <T> T c(b object, Type type, Object object2) {
        com.github.catvod.spider.merge.B.d d2 = ((b)object).f;
        if (d2.p() == 2) {
            if (type != Double.TYPE && type != Double.class) {
                long l2 = d2.h();
                d2.o(16);
                if (type != Short.TYPE && type != Short.class) {
                    if (type != Byte.TYPE && type != Byte.class) {
                        if (l2 >= Integer.MIN_VALUE && l2 <= Integer.MAX_VALUE) {
                            return (T)Integer.valueOf((int)l2);
                        }
                        return (T)Long.valueOf(l2);
                    }
                    if (l2 <= 127L && l2 >= -128L) {
                        return (T)Byte.valueOf((byte)l2);
                    }
                    throw new d(e.b("short overflow : ", l2));
                }
                if (l2 <= 32767L && l2 >= -32768L) {
                    return (T)Short.valueOf((short)l2);
                }
                throw new d(e.b("short overflow : ", l2));
            }
            object = d2.J();
            d2.o(16);
            return (T)Double.valueOf(Double.parseDouble((String)object));
        }
        if (d2.p() == 3) {
            if (type != Double.TYPE && type != Double.class) {
                if (type != Short.TYPE && type != Short.class) {
                    if (type != Byte.TYPE && type != Byte.class) {
                        object = d2.s();
                        d2.o(16);
                        if (d2.l(c.h)) {
                            return (T)object;
                        }
                        return (T)Double.valueOf(((BigDecimal)object).doubleValue());
                    }
                    object = d2.s();
                    d2.o(16);
                    return (T)Byte.valueOf(A.c((BigDecimal)object));
                }
                object = d2.s();
                d2.o(16);
                return (T)Short.valueOf(A.t0((BigDecimal)object));
            }
            object = d2.J();
            d2.o(16);
            return (T)Double.valueOf(Double.parseDouble((String)object));
        }
        int n2 = d2.p();
        Object var7_10 = null;
        if (n2 == 18 && "NaN".equals(d2.K())) {
            d2.nextToken();
            if (type == Double.class) {
                object = Double.NaN;
            } else {
                object = var7_10;
                if (type == Float.class) {
                    object = Float.valueOf(Float.NaN);
                }
            }
            return (T)object;
        }
        if ((object = ((b)object).o(null)) == null) {
            return null;
        }
        if (type != Double.TYPE && type != Double.class) {
            if (type != Short.TYPE && type != Short.class) {
                if (type != Byte.TYPE && type != Byte.class) {
                    return (T)A.g(object);
                }
                try {
                    object = A.j(object);
                }
                catch (Exception exception) {
                    throw new d(com.github.catvod.spider.merge.A.c.a("parseByte error, field : ", object2), exception);
                }
                return (T)object;
            }
            try {
                object = A.r(object);
            }
            catch (Exception exception) {
                throw new d(com.github.catvod.spider.merge.A.c.a("parseShort error, field : ", object2), exception);
            }
            return (T)object;
        }
        try {
            object = A.m(object);
        }
        catch (Exception exception) {
            throw new d(com.github.catvod.spider.merge.A.c.a("parseDouble error, field : ", object2), exception);
        }
        return (T)object;
    }

    @Override
    public final int e() {
        return 2;
    }
}

