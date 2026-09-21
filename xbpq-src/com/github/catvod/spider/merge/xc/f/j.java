/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

import com.github.catvod.spider.merge.xc.f.a;
import com.github.catvod.spider.merge.xc.f.g;
import java.util.Collection;
import java.util.Iterator;

public final class j
implements Collection {
    public final a a;

    public j(a a2) {
        this.a = a2;
    }

    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
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

    public final boolean containsAll(Collection object) {
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
    public final Iterator iterator() {
        return new g(this.a, 1);
    }

    @Override
    public final boolean remove(Object object) {
        a a2 = this.a;
        int n2 = a2.f(object);
        if (n2 >= 0) {
            a2.h(n2);
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        a a2 = this.a;
        int n2 = a2.d();
        int n3 = 0;
        boolean bl = false;
        while (n3 < n2) {
            int n4 = n2;
            int n5 = n3;
            if (collection.contains(a2.b(n3, 1))) {
                a2.h(n3);
                n5 = n3 - 1;
                n4 = n2 - 1;
                bl = true;
            }
            n3 = n5 + 1;
            n2 = n4;
        }
        return bl;
    }

    public final boolean retainAll(Collection collection) {
        a a2 = this.a;
        int n2 = a2.d();
        int n3 = 0;
        boolean bl = false;
        while (n3 < n2) {
            int n4 = n2;
            int n5 = n3;
            if (!collection.contains(a2.b(n3, 1))) {
                a2.h(n3);
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
        a a2 = this.a;
        int n2 = a2.d();
        Object[] objectArray = new Object[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray[i2] = a2.b(i2, 1);
        }
        return objectArray;
    }

    public final Object[] toArray(Object[] objectArray) {
        return this.a.k(objectArray, 1);
    }
}

