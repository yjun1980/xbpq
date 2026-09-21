/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.O.m;
import com.github.catvod.spider.merge.S.d;
import com.github.catvod.spider.merge.cYh;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class e<K, V>
implements Map<K, V> {
    protected final m c;
    protected LinkedList<d<K, V>>[] d;
    protected int e = 0;
    protected int f = 12;

    public e(m m2) {
        this.c = m2;
        this.d = new LinkedList[8];
    }

    @Override
    public final void clear() {
        this.d = new LinkedList[16];
        this.e = 0;
    }

    @Override
    public final boolean containsKey(Object object) {
        boolean bl = this.get(object) != null;
        return bl;
    }

    @Override
    public final boolean containsValue(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean equals(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final V get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.c.F(object);
        Object object2 = this.d;
        if ((object2 = object2[n2 & ((LinkedList<d<K, V>>[])object2).length - 1]) == null) {
            return null;
        }
        Iterator iterator = ((AbstractCollection)object2).iterator();
        while (iterator.hasNext()) {
            object2 = (d)iterator.next();
            if (!this.c.E(((d)object2).a, object)) continue;
            return ((d)object2).b;
        }
        return null;
    }

    @Override
    public final int hashCode() {
        LinkedList<d<K, V>>[] linkedListArray = this.d;
        int n2 = linkedListArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            LinkedList<d<K, V>> linkedList = linkedListArray[i2];
            if (linkedList == null) {
                n4 = n3;
            } else {
                linkedList = ((AbstractCollection)linkedList).iterator();
                while (true) {
                    n4 = n3;
                    if (!linkedList.hasNext()) break;
                    d d2 = (d)linkedList.next();
                    if (d2 == null) {
                        n4 = n3;
                        break;
                    }
                    n3 = a.o(n3, this.c.F(d2.a));
                }
            }
            n3 = n4;
        }
        return a.b(n3, this.e);
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.e == 0;
        return bl;
    }

    @Override
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final V put(K object, V v2) {
        Object object2;
        Object object32;
        int n2;
        Object object4;
        if (object == null) {
            return null;
        }
        if (this.e > this.f) {
            object4 = this.d;
            n2 = ((LinkedList<d<K, V>>[])object4).length * 2;
            this.d = new LinkedList[n2];
            double d2 = n2;
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d2);
            this.f = (int)(d2 * 0.75);
            int n3 = this.e;
            for (Object object32 : object4) {
                if (object32 == null) continue;
                object32 = ((AbstractCollection)object32).iterator();
                while (object32.hasNext() && (object2 = (d)object32.next()) != null) {
                    this.put(((d)object2).a, ((d)object2).b);
                }
            }
            this.e = n3;
        }
        n2 = this.c.F(object);
        object2 = this.d;
        object32 = object2[n2 &= ((LinkedList<d<K, V>>[])object2).length - 1];
        object4 = object32;
        if (object32 == null) {
            object2[n2] = object4 = new LinkedList();
        }
        object2 = ((AbstractCollection)object4).iterator();
        while (object2.hasNext()) {
            object32 = (d)object2.next();
            if (!this.c.E(((d)object32).a, object)) continue;
            object = ((d)object32).b;
            ((d)object32).b = v2;
            ++this.e;
            return (V)object;
        }
        ((LinkedList)object4).add(new d<K, V>(object, v2));
        ++this.e;
        return null;
    }

    @Override
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final V remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.e;
    }

    public final String toString() {
        if (this.e == 0) {
            return cYh.d("1C2D");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        LinkedList<d<K, V>>[] linkedListArray = this.d;
        int n2 = linkedListArray.length;
        boolean bl = true;
        for (int i2 = 0; i2 < n2; ++i2) {
            boolean bl2;
            Object object = linkedListArray[i2];
            if (object == null) {
                bl2 = bl;
            } else {
                Iterator iterator = ((AbstractCollection)object).iterator();
                while (true) {
                    bl2 = bl;
                    if (!iterator.hasNext()) break;
                    object = (d)iterator.next();
                    if (object == null) {
                        bl2 = bl;
                        break;
                    }
                    if (bl) {
                        bl = false;
                    } else {
                        stringBuilder.append(cYh.d("4B70"));
                    }
                    stringBuilder.append(((d)object).toString());
                }
            }
            bl = bl2;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Override
    public final Collection<V> values() {
        ArrayList arrayList = new ArrayList(this.e);
        for (LinkedList<d<K, V>> linkedList : this.d) {
            if (linkedList == null) continue;
            linkedList = ((AbstractCollection)linkedList).iterator();
            while (linkedList.hasNext()) {
                arrayList.add(((d)linkedList.next()).b);
            }
        }
        return arrayList;
    }
}

