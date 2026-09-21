/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.Nx.X
 *  com.github.catvod.spider.merge.Nx.b
 *  com.github.catvod.spider.merge.Nx.e
 */
package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Mm.c;
import com.github.catvod.spider.merge.Nx.X;
import com.github.catvod.spider.merge.Nx.Y;
import com.github.catvod.spider.merge.Nx.b;
import com.github.catvod.spider.merge.Nx.e;
import com.github.catvod.spider.merge.Nx.l;
import com.github.catvod.spider.merge.Nx.l0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

public class f
implements Set<b> {
    protected boolean c = false;
    public e d;
    public final ArrayList<b> e = new ArrayList(7);
    public int f;
    protected BitSet g;
    public boolean h;
    public boolean i;
    public final boolean j;
    private int k = -1;

    public f() {
        this(true);
    }

    public f(boolean bl) {
        this.d = new e(0);
        this.j = bl;
    }

    public final boolean a(b b2, c<X, X, X> x2) {
        if (!this.c) {
            b b3;
            if (b2.e != l0.c) {
                this.h = true;
            }
            if (b2.b() > 0) {
                this.i = true;
            }
            if ((b3 = (b)this.d.f((Object)b2)) == b2) {
                this.k = -1;
                this.e.add(b2);
                return;
            }
            boolean bl = this.j;
            x2 = X.g((X)b3.c, (X)b2.c, (boolean)(bl ^ true), x2);
            b3.d = Math.max(b3.d, b2.d);
            if (b2.c()) {
                b3.d |= 0x40000000;
            }
            b3.c = x2;
            return;
        }
        throw new IllegalStateException("This set is readonly");
    }

    @Override
    public final boolean add(Object object) {
        this.a((b)object, null);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends b> object) {
        object = object.iterator();
        while (object.hasNext()) {
            this.a((b)object.next(), null);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(l object) {
        if (this.c) {
            object = new IllegalStateException("This set is readonly");
            throw object;
        }
        if (this.d.isEmpty()) {
            return;
        }
        Iterator<b> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            b b2 = iterator.next();
            X x2 = b2.c;
            Y y2 = ((l)object).b;
            if (y2 != null) {
                synchronized (y2) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    x2 = X.b((X)x2, (Y)((l)object).b, identityHashMap);
                }
            }
            b2.c = x2;
        }
    }

    @Override
    public final void clear() {
        if (!this.c) {
            this.e.clear();
            this.k = -1;
            this.d.clear();
            return;
        }
        throw new IllegalStateException("This set is readonly");
    }

    @Override
    public final boolean contains(Object object) {
        e e2 = this.d;
        if (e2 != null) {
            return e2.contains(object);
        }
        throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
    }

    @Override
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean equals(Object arrayList) {
        boolean bl = true;
        if (arrayList == this) {
            return true;
        }
        if (!(arrayList instanceof f)) {
            return false;
        }
        f f2 = (f)((Object)arrayList);
        arrayList = this.e;
        if (arrayList == null || !((Object)arrayList).equals(f2.e) || this.j != f2.j || this.f != f2.f || this.g != f2.g || this.h != f2.h || this.i != f2.i) {
            bl = false;
        }
        return bl;
    }

    @Override
    public final int hashCode() {
        if (this.c) {
            if (this.k == -1) {
                this.k = ((Object)this.e).hashCode();
            }
            return this.k;
        }
        return ((Object)this.e).hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override
    public final Iterator<b> iterator() {
        return this.e.iterator();
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.e.size();
    }

    @Override
    public final Object[] toArray() {
        return (b[])this.d.toArray();
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        return this.d.toArray((Object[])TArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Object)this.e).toString());
        if (this.h) {
            stringBuilder.append(",hasSemanticContext=");
            stringBuilder.append(this.h);
        }
        if (this.f != 0) {
            stringBuilder.append(",uniqueAlt=");
            stringBuilder.append(this.f);
        }
        if (this.g != null) {
            stringBuilder.append(",conflictingAlts=");
            stringBuilder.append(this.g);
        }
        if (this.i) {
            stringBuilder.append(",dipsIntoOuterContext");
        }
        return stringBuilder.toString();
    }
}

