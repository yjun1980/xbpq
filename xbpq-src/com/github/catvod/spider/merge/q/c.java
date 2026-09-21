/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.d;
import com.github.catvod.spider.merge.q.m;
import java.util.Map;

final class c
extends m<Object, Object> {
    final d d;

    c(d d2) {
        this.d = d2;
    }

    @Override
    protected final void a() {
        this.d.clear();
    }

    @Override
    protected final Object b(int n2, int n3) {
        return this.d.b[n2];
    }

    @Override
    protected final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override
    protected final int d() {
        return this.d.c;
    }

    @Override
    protected final int e(Object object) {
        return this.d.indexOf(object);
    }

    @Override
    protected final int f(Object object) {
        return this.d.indexOf(object);
    }

    @Override
    protected final void g(Object object, Object object2) {
        this.d.add(object);
    }

    @Override
    protected final void h(int n2) {
        this.d.g(n2);
    }

    @Override
    protected final Object i(int n2, Object object) {
        throw new UnsupportedOperationException("not a map");
    }
}

