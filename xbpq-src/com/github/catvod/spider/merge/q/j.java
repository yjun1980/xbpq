/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.h;
import com.github.catvod.spider.merge.q.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class j
implements Set<Object> {
    final m a;

    j(m m2) {
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
        boolean bl = this.a.e(object) >= 0;
        return bl;
    }

    @Override
    public final boolean containsAll(Collection<?> object) {
        boolean bl;
        block1: {
            Map map = this.a.c();
            object = object.iterator();
            while (object.hasNext()) {
                if (map.containsKey(object.next())) continue;
                bl = false;
                break block1;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public final boolean equals(Object object) {
        return m.j(this, object);
    }

    @Override
    public final int hashCode() {
        int n2 = 0;
        for (int i2 = this.a.d() - 1; i2 >= 0; --i2) {
            Object object = this.a.b(i2, 0);
            int n3 = object == null ? 0 : object.hashCode();
            n2 += n3;
        }
        return n2;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.a.d() == 0;
        return bl;
    }

    @Override
    public final Iterator<Object> iterator() {
        return new h<Object>(this.a, 0);
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.a.e(object);
        if (n2 >= 0) {
            this.a.h(n2);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection<?> object) {
        Map map = this.a.c();
        int n2 = map.size();
        object = object.iterator();
        while (object.hasNext()) {
            map.remove(object.next());
        }
        boolean bl = n2 != map.size();
        return bl;
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        Map map = this.a.c();
        int n2 = map.size();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) continue;
            iterator.remove();
        }
        boolean bl = n2 != map.size();
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
            objectArray[i2] = m2.b(i2, 0);
        }
        return objectArray;
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        return this.a.k(TArray, 0);
    }
}

