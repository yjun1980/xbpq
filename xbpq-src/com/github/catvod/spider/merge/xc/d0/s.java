/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.d0.p;
import com.github.catvod.spider.merge.xc.n0.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class s
implements Set,
Serializable,
a {
    public static final s a = new s();

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
        boolean bl = object instanceof Set && ((Set)object).isEmpty();
        return bl;
    }

    @Override
    public final int hashCode() {
        return 0;
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

