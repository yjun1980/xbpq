/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.xc.d0.a;
import com.github.catvod.spider.merge.xc.d0.b;
import com.github.catvod.spider.merge.xc.d0.c;
import com.github.catvod.spider.merge.xc.d0.d;
import com.github.catvod.spider.merge.xc.d0.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class e
implements List,
Collection,
com.github.catvod.spider.merge.xc.n0.a {
    public abstract int a();

    public final void add(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object) {
        boolean bl;
        block3: {
            bl = this.isEmpty();
            boolean bl2 = false;
            if (bl) {
                bl = bl2;
            } else {
                Iterator iterator = this.iterator();
                do {
                    bl = bl2;
                    if (!iterator.hasNext()) break block3;
                } while (!com.github.catvod.spider.merge.mI.i.a(iterator.next(), object));
                bl = true;
            }
        }
        return bl;
    }

    public final boolean containsAll(Collection object) {
        boolean bl;
        block3: {
            com.github.catvod.spider.merge.mI.i.e(object, "elements");
            bl = object.isEmpty();
            boolean bl2 = true;
            if (bl) {
                bl = bl2;
            } else {
                object = object.iterator();
                do {
                    bl = bl2;
                    if (!object.hasNext()) break block3;
                } while (this.contains(object.next()));
                bl = false;
            }
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object iterator) {
        boolean bl = true;
        if (iterator == this) {
            return true;
        }
        if (!(iterator instanceof List)) {
            return false;
        }
        iterator = (Collection)((Object)iterator);
        com.github.catvod.spider.merge.mI.i.e(iterator, "other");
        if (this.size() != iterator.size()) {
            return false;
        }
        iterator = iterator.iterator();
        Iterator iterator2 = this.iterator();
        do {
            boolean bl2 = bl;
            if (!iterator2.hasNext()) return bl2;
        } while (com.github.catvod.spider.merge.mI.i.a(iterator2.next(), iterator.next()));
        return false;
    }

    @Override
    public final int hashCode() {
        Iterator iterator = this.iterator();
        int n2 = 1;
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            int n3 = e2 != null ? e2.hashCode() : 0;
            n2 = n2 * 31 + n3;
        }
        return n2;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        block2: {
            Iterator iterator = this.iterator();
            n2 = 0;
            while (iterator.hasNext()) {
                if (!com.github.catvod.spider.merge.mI.i.a(iterator.next(), object)) {
                    ++n2;
                    continue;
                }
                break block2;
            }
            n2 = -1;
        }
        return n2;
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.a() == 0;
        return bl;
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        block1: {
            ListIterator listIterator = this.listIterator(this.size());
            while (listIterator.hasPrevious()) {
                if (!com.github.catvod.spider.merge.mI.i.a(listIterator.previous(), object)) continue;
                n2 = listIterator.nextIndex();
                break block1;
            }
            n2 = -1;
        }
        return n2;
    }

    public final ListIterator listIterator() {
        return new c(this, 0);
    }

    public final ListIterator listIterator(int n2) {
        return new c(this, n2);
    }

    public final Object remove(int n2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int n2, int n3) {
        return new d(this, n2, n3);
    }

    @Override
    public final Object[] toArray() {
        return com.github.catvod.spider.merge.mI.i.h(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        com.github.catvod.spider.merge.mI.i.e(objectArray, "array");
        return com.github.catvod.spider.merge.mI.i.i(this, objectArray);
    }

    public final String toString() {
        return i.K(this, ", ", "[", "]", new a(0, this), 24);
    }
}

