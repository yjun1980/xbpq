/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public final class w
implements X,
v {
    public static w a = new w();

    @Override
    public final <T> T c(b object, Type type, Object object2) {
        if (type == OptionalInt.class) {
            if ((object = A.o(((b)object).t((Type)((Object)Integer.class), null))) == null) {
                return (T)OptionalInt.empty();
            }
            return (T)OptionalInt.of((Integer)object);
        }
        if (type == OptionalLong.class) {
            if ((object = A.q(((b)object).t((Type)((Object)Long.class), null))) == null) {
                return (T)OptionalLong.empty();
            }
            return (T)OptionalLong.of((Long)object);
        }
        if (type == OptionalDouble.class) {
            if ((object = A.m(((b)object).t((Type)((Object)Double.class), null))) == null) {
                return (T)OptionalDouble.empty();
            }
            return (T)OptionalDouble.of((Double)object);
        }
        if ((object = ((b)object).t(A.v0(type), null)) == null) {
            return (T)Optional.empty();
        }
        return (T)Optional.of(object);
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        if (object2 == null) {
            ((L)object).w();
            return;
        }
        if (object2 instanceof Optional) {
            object2 = ((Optional)(object2 = (Optional)object2)).isPresent() ? ((Optional)object2).get() : null;
            ((L)object).u(object2);
            return;
        }
        if (object2 instanceof OptionalDouble) {
            if (((OptionalDouble)(object2 = (OptionalDouble)object2)).isPresent()) {
                ((L)object).u(((OptionalDouble)object2).getAsDouble());
            } else {
                ((L)object).w();
            }
            return;
        }
        if (object2 instanceof OptionalInt) {
            if (((OptionalInt)(object2 = (OptionalInt)object2)).isPresent()) {
                n2 = ((OptionalInt)object2).getAsInt();
                ((L)object).j.q(n2);
            } else {
                ((L)object).w();
            }
            return;
        }
        if (object2 instanceof OptionalLong) {
            if (((OptionalLong)(object2 = (OptionalLong)object2)).isPresent()) {
                long l2 = ((OptionalLong)object2).getAsLong();
                ((L)object).j.r(l2);
            } else {
                ((L)object).w();
            }
            return;
        }
        object = com.github.catvod.spider.merge.C.a.c("not support optional : ");
        ((StringBuilder)object).append(object2.getClass());
        throw new d(((StringBuilder)object).toString());
    }

    @Override
    public final int e() {
        return 12;
    }
}

