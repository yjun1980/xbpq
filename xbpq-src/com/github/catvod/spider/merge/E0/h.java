/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.n;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class h
implements Iterator {
    private int a;
    private final int b;
    final n c;

    h(n n2) {
        this.c = n2;
        this.a = 0;
        this.b = n2.size();
    }

    public final byte b() {
        int n2 = this.a;
        if (n2 < this.b) {
            this.a = n2 + 1;
            return this.c.f(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.a < this.b;
        return bl;
    }

    public final Object next() {
        return this.b();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

