/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class h<T>
implements Iterator<T> {
    final int a;
    int b;
    int c;
    boolean d;
    final m e;

    h(m m2, int n2) {
        this.e = m2;
        this.d = false;
        this.a = n2;
        this.b = m2.d();
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.c < this.b;
        return bl;
    }

    @Override
    public final T next() {
        if (this.hasNext()) {
            Object object = this.e.b(this.c, this.a);
            ++this.c;
            this.d = true;
            return (T)object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        if (this.d) {
            int n2;
            this.c = n2 = this.c - 1;
            --this.b;
            this.d = false;
            this.e.h(n2);
            return;
        }
        throw new IllegalStateException();
    }
}

