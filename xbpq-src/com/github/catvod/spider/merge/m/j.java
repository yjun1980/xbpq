/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.l.m;
import com.github.catvod.spider.merge.m.f;

final class j<E>
extends f<E> {
    static final f<Object> h = new j<Object>(new Object[0], 0);
    final transient Object[] f;
    private final transient int g;

    j(Object[] objectArray, int n2) {
        this.f = objectArray;
        this.g = n2;
    }

    @Override
    final int a(Object[] objectArray) {
        System.arraycopy(this.f, 0, objectArray, 0, this.g);
        return this.g + 0;
    }

    @Override
    final Object[] b() {
        return this.f;
    }

    @Override
    final int c() {
        return this.g;
    }

    @Override
    final int d() {
        return 0;
    }

    @Override
    public final E get(int n2) {
        m.c(n2, this.g);
        Object object = this.f[n2];
        object.getClass();
        return (E)object;
    }

    @Override
    public final int size() {
        return this.g;
    }
}

