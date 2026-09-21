/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collection;

public abstract class oU<E>
extends ArrayList<E> {
    public oU(int n2) {
        super(n2);
    }

    @Override
    public void add(int n2, E e2) {
        this.l8();
        super.add(n2, e2);
    }

    @Override
    public boolean add(E e2) {
        this.l8();
        return super.add(e2);
    }

    @Override
    public boolean addAll(int n2, Collection<? extends E> collection) {
        this.l8();
        return super.addAll(n2, collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        this.l8();
        return super.addAll(collection);
    }

    @Override
    public void clear() {
        this.l8();
        super.clear();
    }

    public abstract void l8();

    @Override
    public E remove(int n2) {
        this.l8();
        return super.remove(n2);
    }

    @Override
    public boolean remove(Object object) {
        this.l8();
        return super.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        this.l8();
        return super.removeAll(collection);
    }

    @Override
    protected void removeRange(int n2, int n3) {
        this.l8();
        super.removeRange(n2, n3);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        this.l8();
        return super.retainAll(collection);
    }

    @Override
    public E set(int n2, E e2) {
        this.l8();
        return super.set(n2, e2);
    }
}

