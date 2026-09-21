/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.S.b;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a
implements Iterator<Object> {
    final Object[] a;
    int b;
    boolean c;
    final b d;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public a(b b2, Object[] objectArray) {
        this.d = b2;
        this.b = 0;
        this.c = true;
        this.a = objectArray;
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.b < this.a.length;
        return bl;
    }

    @Override
    public final Object next() {
        if (this.hasNext()) {
            this.c = false;
            Object[] objectArray = this.a;
            int n2 = this.b;
            this.b = n2 + 1;
            return objectArray[n2];
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        if (!this.c) {
            this.d.remove(this.a[this.b - 1]);
            this.c = true;
            return;
        }
        throw new IllegalStateException();
    }
}

