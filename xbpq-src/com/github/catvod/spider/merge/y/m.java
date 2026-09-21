/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.E.c;
import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.p.a;
import com.github.catvod.spider.merge.y.l;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class m
implements List,
Serializable,
RandomAccess {
    public static final m c = new m();

    private m() {
    }

    public final boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Void)) {
            return false;
        }
        f.e((Void)object, cYh.d("023C243C323413"));
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        f.e(collection, cYh.d("023C243C32341323"));
        return collection.isEmpty();
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl = object instanceof List && ((List)object).isEmpty();
        return bl;
    }

    public final Object get(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("223D31252E7A0B393225773E0835323F702E47332E3F233B0E3E61343B3F0A352F25773B1370283F333F1F70"));
        stringBuilder.append(n2);
        stringBuilder.append('.');
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public final int hashCode() {
        return 1;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Void)) {
            return -1;
        }
        f.e((Void)object, cYh.d("023C243C323413"));
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final Iterator iterator() {
        return l.a;
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Void)) {
            return -1;
        }
        f.e((Void)object, cYh.d("023C243C323413"));
        return -1;
    }

    public final ListIterator listIterator() {
        return l.a;
    }

    public final ListIterator listIterator(int n2) {
        if (n2 == 0) {
            return l.a;
        }
        throw new IndexOutOfBoundsException(a.a(cYh.d("2E3E25342F6047"), n2));
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    public final List subList(int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("01222E3C1E340335396B77"));
        stringBuilder.append(n2);
        stringBuilder.append(cYh.d("4B70353E1E340335396B77"));
        stringBuilder.append(n3);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public final Object[] toArray() {
        return com.github.catvod.spider.merge.E.c.a(this);
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        f.e(TArray, cYh.d("062233302E"));
        return com.github.catvod.spider.merge.E.c.b(this, TArray);
    }

    public final String toString() {
        return cYh.d("3C0D");
    }
}

