/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

import com.github.catvod.spider.merge.xc.f.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g
implements Iterator {
    public final int a;
    public int b;
    public int c;
    public boolean d;
    public final a e;

    public g(a a2, int n2) {
        this.e = a2;
        this.d = false;
        this.a = n2;
        this.b = a2.d();
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.c < this.b;
        return bl;
    }

    public final Object next() {
        if (this.hasNext()) {
            int n2 = this.c++;
            int n3 = this.a;
            Object object = this.e.b(n2, n3);
            this.d = true;
            return object;
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

