/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.xc.d0.e;
import com.github.catvod.spider.merge.xc.n0.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class b
implements Iterator,
a {
    public int a;
    public final e b;

    public b(e e2) {
        this.b = e2;
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.a < this.b.a();
        return bl;
    }

    public final Object next() {
        if (this.hasNext()) {
            int n2 = this.a;
            this.a = n2 + 1;
            return this.b.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

