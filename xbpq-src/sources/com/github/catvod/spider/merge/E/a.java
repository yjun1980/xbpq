package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class a<T> implements Iterator<T> {
    private final T[] a;
    private int b;

    public a(T[] tArr) {
        f.e(tArr, cYh.d("062233302E"));
        this.a = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }
}
