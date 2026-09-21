/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.F0.l;
import java.util.ArrayList;
import java.util.Collection;

public final class k
extends ArrayList {
    public final l a;

    public k(l l2, int n2) {
        super(n2);
        this.a = l2;
    }

    public final void a() {
        this.a.e = null;
    }

    @Override
    public final void add(int n2, Object object) {
        this.a();
        super.add(n2, object);
    }

    @Override
    public final boolean add(Object object) {
        this.a();
        return super.add(object);
    }

    @Override
    public final boolean addAll(int n2, Collection collection) {
        this.a();
        return super.addAll(n2, collection);
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.a();
        return super.addAll(collection);
    }

    @Override
    public final void clear() {
        this.a();
        super.clear();
    }

    @Override
    public final Object remove(int n2) {
        this.a();
        return super.remove(n2);
    }

    @Override
    public final boolean remove(Object object) {
        this.a();
        return super.remove(object);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        this.a();
        return super.removeAll(collection);
    }

    @Override
    public final void removeRange(int n2, int n3) {
        this.a();
        super.removeRange(n2, n3);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        this.a();
        return super.retainAll(collection);
    }

    @Override
    public final Object set(int n2, Object object) {
        this.a();
        return super.set(n2, object);
    }
}

