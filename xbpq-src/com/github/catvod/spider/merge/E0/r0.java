/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.a0;
import com.github.catvod.spider.merge.E0.u0;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class r0 {
    private static final r0 c = new r0();
    public static final int d = 0;
    private final a0 a;
    private final ConcurrentMap<Class<?>, u0<?>> b = new ConcurrentHashMap();

    private r0() {
        this.a = new a0();
    }

    public static r0 a() {
        return c;
    }

    public final <T> u0<T> b(Class<T> object) {
        Object object2 = N.b;
        Objects.requireNonNull(object, "messageType");
        u0 u02 = (u0)((ConcurrentHashMap)this.b).get(object);
        object2 = u02;
        if (u02 == null && (object = (u0)((ConcurrentHashMap)this.b).putIfAbsent((Class<?>)object, (u0<?>)(object2 = (Object)this.a.a(object)))) != null) {
            object2 = object;
        }
        return object2;
    }

    public final <T> u0<T> c(T t2) {
        return this.b(t2.getClass());
    }
}

