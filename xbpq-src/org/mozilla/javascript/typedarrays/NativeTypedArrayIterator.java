/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.typedarrays;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

public class NativeTypedArrayIterator<T>
implements ListIterator<T> {
    private int lastPosition = -1;
    private int position;
    private final NativeTypedArrayView<T> view;

    NativeTypedArrayIterator(NativeTypedArrayView<T> nativeTypedArrayView, int n2) {
        this.view = nativeTypedArrayView;
        this.position = n2;
    }

    @Override
    public void add(T t2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.position < this.view.length;
        return bl;
    }

    @Override
    public boolean hasPrevious() {
        boolean bl = this.position > 0;
        return bl;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            int n2;
            Object e2 = this.view.get(this.position);
            this.lastPosition = n2 = this.position;
            this.position = n2 + 1;
            return (T)e2;
        }
        throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
        return this.position;
    }

    @Override
    public T previous() {
        if (this.hasPrevious()) {
            int n2;
            this.position = n2 = this.position - 1;
            this.lastPosition = n2;
            return (T)this.view.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public int previousIndex() {
        return this.position - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void set(T t2) {
        int n2 = this.lastPosition;
        if (n2 >= 0) {
            this.view.js_set(n2, t2);
            return;
        }
        throw new IllegalStateException();
    }
}

