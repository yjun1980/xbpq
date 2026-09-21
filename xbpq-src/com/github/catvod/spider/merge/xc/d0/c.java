/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.xc.d0.b;
import com.github.catvod.spider.merge.xc.d0.e;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class c
extends b
implements ListIterator {
    public final e c;

    public c(e object, int n2) {
        this.c = object;
        super((e)object);
        int n3 = ((e)object).a();
        if (n2 >= 0 && n2 <= n3) {
            this.a = n2;
            return;
        }
        object = new StringBuilder("index: ");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", size: ");
        ((StringBuilder)object).append(n3);
        throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
    }

    public final void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        boolean bl = this.a > 0;
        return bl;
    }

    @Override
    public final int nextIndex() {
        return this.a;
    }

    public final Object previous() {
        if (this.hasPrevious()) {
            int n2;
            this.a = n2 = this.a - 1;
            return this.c.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.a - 1;
    }

    public final void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

