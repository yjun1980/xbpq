/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

public final class b0
implements X,
v {
    public static final b0 a = new b0();

    @Override
    public final <T> T c(b b2, Type type, Object object) {
        type = (ParameterizedType)type;
        b2 = b2.t(type.getActualTypeArguments()[0], null);
        if ((type = type.getRawType()) == AtomicReference.class) {
            return (T)new AtomicReference<b>(b2);
        }
        if (type == WeakReference.class) {
            return (T)new WeakReference<b>(b2);
        }
        if (type == SoftReference.class) {
            return (T)new SoftReference<b>(b2);
        }
        throw new UnsupportedOperationException(type.toString());
    }

    @Override
    public final void d(L l2, Object object, Object object2, Type type, int n2) {
        object = object instanceof AtomicReference ? ((AtomicReference)object).get() : ((Reference)object).get();
        l2.u(object);
    }

    @Override
    public final int e() {
        return 12;
    }
}

