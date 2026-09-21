/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.m.c;
import com.github.catvod.spider.merge.m.d;
import com.github.catvod.spider.merge.m.e;
import com.github.catvod.spider.merge.m.i;
import com.github.catvod.spider.merge.m.j;
import com.github.catvod.spider.merge.m.m;
import com.github.catvod.spider.merge.m.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class f<E>
extends c<E>
implements List<E>,
RandomAccess {
    private static final n<Object> d = new d<Object>(j.h, 0);
    public static final int e = 0;

    f() {
    }

    public static <E> f<E> f(E[] object) {
        if (((E[])object).length == 0) {
            object = j.h;
        } else {
            int n2;
            object = (Object[])object.clone();
            int n3 = ((E[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                i.a(object[n2], n2);
            }
            n2 = ((E[])object).length;
            object = n2 == 0 ? j.h : new j((Object[])object, n2);
        }
        return object;
    }

    @Override
    int a(Object[] objectArray) {
        int n2 = this.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray[0 + i2] = this.get(i2);
        }
        return 0 + n2;
    }

    @Override
    @Deprecated
    public final void add(int n2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int n2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.indexOf(object) >= 0;
        return bl;
    }

    @Override
    public final m<E> e() {
        return this.g(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object iterator) {
        boolean bl = false;
        if (iterator == this) {
            return true;
        }
        if (!(iterator instanceof List)) return bl;
        Object object = (List)((Object)iterator);
        int n2 = this.size();
        if (n2 != object.size()) return bl;
        if (object instanceof RandomAccess) {
            int n3 = 0;
            while (n3 < n2) {
                if (!h.a(this.get(n3), object.get(n3))) return bl;
                ++n3;
            }
            return true;
        }
        iterator = this.iterator();
        object = object.iterator();
        do {
            if (!iterator.hasNext()) return object.hasNext() ^ true;
        } while (object.hasNext() && h.a(iterator.next(), object.next()));
        return bl;
    }

    public final n<E> g(int n2) {
        com.github.catvod.spider.merge.l.m.d(n2, this.size());
        if (this.isEmpty()) {
            return d;
        }
        return new d(this, n2);
    }

    public f<E> h(int n2, int n3) {
        com.github.catvod.spider.merge.l.m.e(n2, n3, this.size());
        if ((n3 -= n2) == this.size()) {
            return this;
        }
        if (n3 == 0) {
            return j.h;
        }
        return new e(this, n2, n3);
    }

    @Override
    public final int hashCode() {
        int n2 = this.size();
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = ~(~(this.get(i2).hashCode() + n3 * 31));
        }
        return n3;
    }

    @Override
    public final int indexOf(Object object) {
        int n2;
        int n3 = -1;
        if (object == null) {
            n2 = n3;
        } else {
            int n4 = this.size();
            int n5 = 0;
            while (true) {
                n2 = n3;
                if (n5 >= n4) break;
                if (object.equals(this.get(n5))) {
                    n2 = n5;
                    break;
                }
                ++n5;
            }
        }
        return n2;
    }

    @Override
    public Iterator iterator() {
        return this.g(0);
    }

    @Override
    public final int lastIndexOf(Object object) {
        int n2;
        int n3 = -1;
        if (object == null) {
            n2 = n3;
        } else {
            int n4 = this.size() - 1;
            while (true) {
                n2 = n3;
                if (n4 < 0) break;
                if (object.equals(this.get(n4))) {
                    n2 = n4;
                    break;
                }
                --n4;
            }
        }
        return n2;
    }

    @Override
    public ListIterator listIterator() {
        return this.g(0);
    }

    @Override
    @Deprecated
    public final E remove(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final E set(int n2, E e2) {
        throw new UnsupportedOperationException();
    }
}

