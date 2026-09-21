/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.d0.p;
import com.github.catvod.spider.merge.xc.n0.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class q
implements List,
Serializable,
RandomAccess,
a {
    public static final q a = new q();

    public final boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Void)) {
            return false;
        }
        i.e((Void)object, "element");
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        i.e(collection, "elements");
        return collection.isEmpty();
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl = object instanceof List && ((List)object).isEmpty();
        return bl;
    }

    public final Object get(int n2) {
        StringBuilder stringBuilder = new StringBuilder("Empty list doesn't contain element at index ");
        stringBuilder.append(n2);
        stringBuilder.append('.');
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public final int hashCode() {
        return 1;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Void)) {
            return -1;
        }
        i.e((Void)object, "element");
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final Iterator iterator() {
        return p.a;
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Void)) {
            return -1;
        }
        i.e((Void)object, "element");
        return -1;
    }

    public final ListIterator listIterator() {
        return p.a;
    }

    public final ListIterator listIterator(int n2) {
        if (n2 == 0) {
            return p.a;
        }
        throw new IndexOutOfBoundsException(m.c(n2, "Index: "));
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("fromIndex: ");
        stringBuilder.append(n2);
        stringBuilder.append(", toIndex: ");
        stringBuilder.append(n3);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public final Object[] toArray() {
        return i.h(this);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        i.e(objectArray, "array");
        return i.i(this, objectArray);
    }

    public final String toString() {
        return "[]";
    }
}

