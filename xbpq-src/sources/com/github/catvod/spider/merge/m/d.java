package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.l.C0179m;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class d<E> extends n<Object> {
    private final int a;
    private int b;
    private final f<E> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(f<E> fVar, int i) {
        int size = fVar.size();
        C0179m.d(i, size);
        this.a = size;
        this.b = i;
        this.c = fVar;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return this.c.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return this.c.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
