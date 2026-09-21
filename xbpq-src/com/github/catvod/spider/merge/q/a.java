/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.b;
import com.github.catvod.spider.merge.q.m;
import java.util.Map;

final class a
extends m<Object, Object> {
    final b d;

    a(b b2) {
        this.d = b2;
    }

    @Override
    protected final void a() {
        this.d.clear();
    }

    @Override
    protected final Object b(int n2, int n3) {
        return this.d.b[(n2 << 1) + n3];
    }

    @Override
    protected final Map<Object, Object> c() {
        return this.d;
    }

    @Override
    protected final int d() {
        return this.d.c;
    }

    @Override
    protected final int e(Object object) {
        return this.d.e(object);
    }

    @Override
    protected final int f(Object object) {
        return this.d.g(object);
    }

    @Override
    protected final void g(Object object, Object object2) {
        this.d.put(object, object2);
    }

    @Override
    protected final void h(int n2) {
        this.d.i(n2);
    }

    @Override
    protected final Object i(int n2, Object object) {
        return this.d.j(n2, object);
    }
}

