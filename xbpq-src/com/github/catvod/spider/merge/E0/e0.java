/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.b0;
import com.github.catvod.spider.merge.E0.c0;
import com.github.catvod.spider.merge.E0.d0;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

final class e0
implements d0 {
    e0() {
    }

    @Override
    public final Object a(Object c02, Object object) {
        c0 c03 = c02;
        object = (c0)object;
        c02 = c03;
        if (!((AbstractMap)object).isEmpty()) {
            c02 = c03;
            if (!c03.d()) {
                c02 = c03.g();
            }
            c02.f(object);
        }
        return c02;
    }

    @Override
    public final Object b() {
        return c0.b().g();
    }

    @Override
    public final Map<?, ?> c(Object object) {
        return (c0)object;
    }

    @Override
    public final Map<?, ?> d(Object object) {
        return (c0)object;
    }

    @Override
    public final boolean e(Object object) {
        return ((c0)object).d() ^ true;
    }

    @Override
    public final Object f(Object object) {
        ((c0)object).e();
        return object;
    }

    @Override
    public final void g(Object object) {
        Objects.requireNonNull((b0)object);
    }
}

