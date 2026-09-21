/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.h;
import com.github.catvod.spider.merge.q.m;
import java.util.Collection;
import java.util.Iterator;

final class l
implements Collection<Object> {
    final m a;

    l(m m2) {
        this.a = m2;
    }

    @Override
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.a.a();
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.a.f(object) >= 0;
        return bl;
    }

    @Override
    public final boolean containsAll(Collection<?> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.a.d() == 0;
        return bl;
    }

    @Override
    public final Iterator<Object> iterator() {
        return new h<Object>(this.a, 1);
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.a.f(object);
        if (n2 >= 0) {
            this.a.h(n2);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        int n2 = this.a.d();
        int n3 = 0;
        boolean bl = false;
        while (n3 < n2) {
            int n4 = n2;
            int n5 = n3;
            if (collection.contains(this.a.b(n3, 1))) {
                this.a.h(n3);
                n5 = n3 - 1;
                n4 = n2 - 1;
                bl = true;
            }
            n3 = n5 + 1;
            n2 = n4;
        }
        return bl;
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        int n2 = this.a.d();
        int n3 = 0;
        boolean bl = false;
        while (n3 < n2) {
            int n4 = n2;
            int n5 = n3;
            if (!collection.contains(this.a.b(n3, 1))) {
                this.a.h(n3);
                n5 = n3 - 1;
                n4 = n2 - 1;
                bl = true;
            }
            n3 = n5 + 1;
            n2 = n4;
        }
        return bl;
    }

    @Override
    public final int size() {
        return this.a.d();
    }

    @Override
    public final Object[] toArray() {
        m m2 = this.a;
        int n2 = m2.d();
        Object[] objectArray = new Object[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray[i2] = m2.b(i2, 1);
        }
        return objectArray;
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        return this.a.k(TArray, 1);
    }
}

