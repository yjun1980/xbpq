/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.M;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class c<E>
extends AbstractList<E>
implements M<E> {
    private boolean a;

    c(boolean bl) {
        this.a = bl;
    }

    protected final void a() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int n2, Collection<? extends E> collection) {
        this.a();
        return super.addAll(n2, collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        this.a();
        return super.addAll(collection);
    }

    @Override
    public final void b() {
        if (this.a) {
            this.a = false;
        }
    }

    @Override
    public final void clear() {
        this.a();
        super.clear();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        if (!(object instanceof RandomAccess)) {
            return super.equals(object);
        }
        object = (List)object;
        int n2 = this.size();
        if (n2 != object.size()) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.get(i2).equals(object.get(i2))) continue;
            return false;
        }
        return true;
    }

    @Override
    public final boolean h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int n2 = this.size();
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = n3 * 31 + this.get(i2).hashCode();
        }
        return n3;
    }

    @Override
    public abstract E remove(int var1);

    @Override
    public final boolean remove(Object object) {
        this.a();
        int n2 = this.indexOf(object);
        if (n2 == -1) {
            return false;
        }
        this.remove(n2);
        return true;
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        this.a();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        this.a();
        return super.retainAll(collection);
    }
}

