/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.l.m;
import com.github.catvod.spider.merge.m.f;
import com.github.catvod.spider.merge.m.n;
import java.util.NoSuchElementException;

final class d<E>
extends n<Object> {
    private final int a;
    private int b;
    private final f<E> c;

    d(f<E> f2, int n2) {
        int n3 = f2.size();
        m.d(n2, n3);
        this.a = n3;
        this.b = n2;
        this.c = f2;
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.b < this.a;
        return bl;
    }

    @Override
    public final boolean hasPrevious() {
        boolean bl = this.b > 0;
        return bl;
    }

    @Override
    public final Object next() {
        if (this.hasNext()) {
            int n2 = this.b;
            this.b = n2 + 1;
            return this.c.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    @Override
    public final Object previous() {
        if (this.hasPrevious()) {
            int n2;
            this.b = n2 = this.b - 1;
            return this.c.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }
}

