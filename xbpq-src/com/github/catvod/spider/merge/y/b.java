/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.e;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

public final class b
extends a
implements List<Object>,
Cloneable,
RandomAccess,
Serializable {
    private final List<Object> i;
    protected transient Object j;
    protected transient Type k;

    public b() {
        this.i = new ArrayList<Object>();
    }

    public b(int n2) {
        this.i = new ArrayList<Object>(n2);
    }

    public b(List<Object> list) {
        if (list != null) {
            this.i = list;
            return;
        }
        throw new IllegalArgumentException("list is null.");
    }

    @Override
    public final void add(int n2, Object object) {
        this.i.add(n2, object);
    }

    @Override
    public final boolean add(Object object) {
        return this.i.add(object);
    }

    @Override
    public final boolean addAll(int n2, Collection<?> collection) {
        return this.i.addAll(n2, collection);
    }

    @Override
    public final boolean addAll(Collection<?> collection) {
        return this.i.addAll(collection);
    }

    @Override
    public final void clear() {
        this.i.clear();
    }

    public final Object clone() {
        return new b(new ArrayList<Object>(this.i));
    }

    @Override
    public final boolean contains(Object object) {
        return this.i.contains(object);
    }

    @Override
    public final boolean containsAll(Collection<?> collection) {
        return this.i.containsAll(collection);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object list) {
        List<Object> list2;
        if (this == list) {
            return true;
        }
        if (list instanceof b) {
            list2 = this.i;
            list = ((b)list).i;
            return list2.equals(list);
        }
        list2 = this.i;
        return list2.equals(list);
    }

    @Override
    public final Object get(int n2) {
        return this.i.get(n2);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final int indexOf(Object object) {
        return this.i.indexOf(object);
    }

    @Override
    public final boolean isEmpty() {
        return this.i.isEmpty();
    }

    @Override
    public final Iterator<Object> iterator() {
        return this.i.iterator();
    }

    @Override
    public final int lastIndexOf(Object object) {
        return this.i.lastIndexOf(object);
    }

    @Override
    public final ListIterator<Object> listIterator() {
        return this.i.listIterator();
    }

    @Override
    public final ListIterator<Object> listIterator(int n2) {
        return this.i.listIterator(n2);
    }

    public final Type o() {
        return this.k;
    }

    public final e p(int n2) {
        Object object = this.i.get(n2);
        if (object instanceof e) {
            return (e)object;
        }
        if (object instanceof Map) {
            return new e((Map)object);
        }
        return (e)com.github.catvod.spider.merge.y.a.k(object);
    }

    public final Object q() {
        return this.j;
    }

    public final void r(Type type) {
        this.k = type;
    }

    @Override
    public final Object remove(int n2) {
        return this.i.remove(n2);
    }

    @Override
    public final boolean remove(Object object) {
        return this.i.remove(object);
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        return this.i.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        return this.i.retainAll(collection);
    }

    public final void s(Object object) {
        this.j = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final Object set(int n2, Object object) {
        if (n2 != -1) {
            if (this.i.size() > n2) {
                return this.i.set(n2, object);
            }
            for (int i2 = this.i.size(); i2 < n2; ++i2) {
                this.i.add(null);
            }
        }
        this.i.add(object);
        return null;
    }

    @Override
    public final int size() {
        return this.i.size();
    }

    @Override
    public final List<Object> subList(int n2, int n3) {
        return this.i.subList(n2, n3);
    }

    @Override
    public final Object[] toArray() {
        return this.i.toArray();
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        return this.i.toArray(TArray);
    }
}

