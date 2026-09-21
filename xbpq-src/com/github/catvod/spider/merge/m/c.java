/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.m.m;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class c<E>
extends AbstractCollection<E>
implements Serializable {
    private static final Object[] c = new Object[0];

    c() {
    }

    int a(Object[] objectArray) {
        m<E> m2 = this.e();
        int n2 = 0;
        while (m2.hasNext()) {
            objectArray[n2] = m2.next();
            ++n2;
        }
        return n2;
    }

    @Override
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    Object[] b() {
        return null;
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    int d() {
        throw new UnsupportedOperationException();
    }

    public abstract m<E> e();

    @Override
    @Deprecated
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(c);
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        Object[] objectArray;
        TArray.getClass();
        int n2 = this.size();
        if (TArray.length < n2) {
            objectArray = this.b();
            if (objectArray != null) {
                return Arrays.copyOfRange(objectArray, this.d(), this.c(), TArray.getClass());
            }
            objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), n2);
        } else {
            objectArray = TArray;
            if (TArray.length > n2) {
                TArray[n2] = null;
                objectArray = TArray;
            }
        }
        this.a(objectArray);
        return objectArray;
    }
}

