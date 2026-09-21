/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class a<T>
implements Iterator<T> {
    private final T[] a;
    private int b;

    public a(T[] TArray) {
        f.e(TArray, cYh.d("062233302E"));
        this.a = TArray;
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.b < this.a.length;
        return bl;
    }

    @Override
    public final T next() {
        int n2;
        Object object;
        try {
            object = this.a;
            n2 = this.b;
            this.b = n2 + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.b;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        object = object[n2];
        return (T)object;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }
}

