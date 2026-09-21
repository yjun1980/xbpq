/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Dw;

import java.util.ArrayList;
import java.util.Collection;

public abstract class a<E>
extends ArrayList<E> {
    public a(int n2) {
        super(n2);
    }

    public abstract void a();

    @Override
    public final void add(int n2, E e2) {
        this.a();
        super.add(n2, e2);
    }

    @Override
    public final boolean add(E e2) {
        this.a();
        return super.add(e2);
    }

    @Override
    public final boolean addAll(int n2, Collection<? extends E> collection) {
        this.a();
        return super.addAll(n2, collection);
    }

    @Override
    public final boolean addAll(Collection<? extends E> collection) {
        this.a();
        return super.addAll(collection);
    }

    @Override
    public final void clear() {
        this.a();
        super.clear();
    }

    @Override
    public final E remove(int n2) {
        this.a();
        return super.remove(n2);
    }

    @Override
    public final boolean remove(Object object) {
        this.a();
        return super.remove(object);
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        this.a();
        return super.removeAll(collection);
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.a();
        super.removeRange(n2, n3);
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        this.a();
        return super.retainAll(collection);
    }

    @Override
    public final E set(int n2, E e2) {
        this.a();
        return super.set(n2, e2);
    }
}

