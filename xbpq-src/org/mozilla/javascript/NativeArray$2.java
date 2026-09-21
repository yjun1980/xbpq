/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.NativeArray;

class NativeArray$2
implements ListIterator {
    int cursor;
    int modCount;
    final NativeArray this$0;
    final int val$len;
    final int val$start;

    NativeArray$2(NativeArray nativeArray, int n2, int n3) {
        this.this$0 = nativeArray;
        this.val$start = n2;
        this.val$len = n3;
        this.cursor = n2;
        this.modCount = NativeArray.access$000(nativeArray);
    }

    public void add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.cursor < this.val$len;
        return bl;
    }

    @Override
    public boolean hasPrevious() {
        boolean bl = this.cursor > 0;
        return bl;
    }

    @Override
    public Object next() {
        NativeArray.access$100(this.this$0, this.modCount);
        int n2 = this.cursor;
        if (n2 != this.val$len) {
            NativeArray nativeArray = this.this$0;
            this.cursor = n2 + 1;
            return nativeArray.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
        return this.cursor;
    }

    public Object previous() {
        NativeArray.access$100(this.this$0, this.modCount);
        int n2 = this.cursor;
        if (n2 != 0) {
            NativeArray nativeArray = this.this$0;
            this.cursor = --n2;
            return nativeArray.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public int previousIndex() {
        return this.cursor - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void set(Object object) {
        throw new UnsupportedOperationException();
    }
}

