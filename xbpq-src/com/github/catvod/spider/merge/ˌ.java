/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collection;

public abstract class \u02cc<E>
extends ArrayList<E> {
    public \u02cc(int n2) {
        super(n2);
    }

    @Override
    public void add(int n2, E e2) {
        this.\u037f();
        super.add(n2, e2);
    }

    @Override
    public boolean add(E e2) {
        this.\u037f();
        return super.add(e2);
    }

    @Override
    public boolean addAll(int n2, Collection<? extends E> collection) {
        this.\u037f();
        return super.addAll(n2, collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        this.\u037f();
        return super.addAll(collection);
    }

    @Override
    public void clear() {
        this.\u037f();
        super.clear();
    }

    @Override
    public E remove(int n2) {
        this.\u037f();
        return super.remove(n2);
    }

    @Override
    public boolean remove(Object object) {
        this.\u037f();
        return super.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        this.\u037f();
        return super.removeAll(collection);
    }

    @Override
    protected void removeRange(int n2, int n3) {
        this.\u037f();
        super.removeRange(n2, n3);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        this.\u037f();
        return super.retainAll(collection);
    }

    @Override
    public E set(int n2, E e2) {
        this.\u037f();
        return super.set(n2, e2);
    }

    public abstract void \u037f();
}

