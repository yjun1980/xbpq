/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.l.m;
import com.github.catvod.spider.merge.m.f;
import java.util.Iterator;
import java.util.ListIterator;

final class e
extends f<Object> {
    final transient int f;
    final transient int g;
    final f h;

    e(f f2, int n2, int n3) {
        this.h = f2;
        this.f = n2;
        this.g = n3;
    }

    @Override
    final Object[] b() {
        return this.h.b();
    }

    @Override
    final int c() {
        return this.h.d() + this.f + this.g;
    }

    @Override
    final int d() {
        return this.h.d() + this.f;
    }

    @Override
    public final Object get(int n2) {
        m.c(n2, this.g);
        return this.h.get(n2 + this.f);
    }

    @Override
    public final f<Object> h(int n2, int n3) {
        m.e(n2, n3, this.g);
        f f2 = this.h;
        int n4 = this.f;
        return f2.h(n2 + n4, n3 + n4);
    }

    @Override
    public final Iterator iterator() {
        return this.g(0);
    }

    @Override
    public final ListIterator listIterator() {
        return this.g(0);
    }

    @Override
    public final int size() {
        return this.g;
    }
}

