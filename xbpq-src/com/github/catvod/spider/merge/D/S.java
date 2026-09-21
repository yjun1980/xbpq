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
import com.github.catvod.spider.merge.y.e;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class S
implements X,
v {
    public static S a = new S();

    @Override
    public final <T> T c(b object, Type type, Object object2) {
        block13: {
            int n2;
            Object object3;
            block12: {
                object3 = ((b)object).f;
                try {
                    n2 = object3.p();
                    if (n2 != 2) break block12;
                }
                catch (Exception exception) {
                    throw new d(c.a("parseLong error, field : ", object2), exception);
                }
                long l2 = object3.h();
                object3.o(16);
                object = l2;
                break block13;
            }
            if (n2 == 3) {
                object = A.o0(object3.s());
                object3.o(16);
            } else {
                if (n2 == 12) {
                    object3 = new e(true);
                    ((b)object).u((Map)object3);
                    object2 = object = A.q(object3);
                } else {
                    object2 = object = A.q(((b)object).o(null));
                }
                object = object2;
                if (object2 == null) {
                    return null;
                }
            }
        }
        object2 = object;
        if (type == AtomicLong.class) {
            object2 = new AtomicLong((Long)object);
        }
        return (T)object2;
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object = ((L)object).j;
        if (object2 == null) {
            ((h0)object).u(i0.j);
        } else {
            long l2 = (Long)object2;
            ((h0)object).r(l2);
            if (((h0)object).g(i0.o) && l2 <= Integer.MAX_VALUE && l2 >= Integer.MIN_VALUE && type != Long.class && type != Long.TYPE) {
                ((h0)object).write(76);
            }
        }
    }

    @Override
    public final int e() {
        return 2;
    }
}

