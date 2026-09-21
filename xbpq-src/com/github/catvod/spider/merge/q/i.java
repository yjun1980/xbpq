/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.e;
import com.github.catvod.spider.merge.q.k;
import com.github.catvod.spider.merge.q.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class i
implements Set<Map.Entry<Object, Object>> {
    final m a;

    i(m m2) {
        this.a = m2;
    }

    @Override
    public final boolean add(Object object) {
        object = (Map.Entry)object;
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection<? extends Map.Entry<Object, Object>> object) {
        int n2 = this.a.d();
        object = object.iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            this.a.g(entry.getKey(), entry.getValue());
        }
        boolean bl = n2 != this.a.d();
        return bl;
    }

    @Override
    public final void clear() {
        this.a.a();
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        int n2 = this.a.e((object = (Map.Entry)object).getKey());
        if (n2 < 0) {
            return false;
        }
        return e.c(this.a.b(n2, 1), object.getValue());
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
    public final boolean equals(Object object) {
        return m.j(this, object);
    }

    @Override
    public final int hashCode() {
        int n2 = 0;
        for (int i2 = this.a.d() - 1; i2 >= 0; --i2) {
            Object object = this.a.b(i2, 0);
            Object object2 = this.a.b(i2, 1);
            int n3 = object == null ? 0 : object.hashCode();
            int n4 = object2 == null ? 0 : object2.hashCode();
            n2 += n3 ^ n4;
        }
        return n2;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.a.d() == 0;
        return bl;
    }

    @Override
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new k(this.a);
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.a.d();
    }

    @Override
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        throw new UnsupportedOperationException();
    }
}

