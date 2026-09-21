package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class e<K, V> implements Map<K, V> {
    protected final com.github.catvod.spider.merge.O.m c;
    protected int e = 0;
    protected int f = 12;
    protected LinkedList<d<K, V>>[] d = new LinkedList[8];

    public e(com.github.catvod.spider.merge.O.m mVar) {
        this.c = mVar;
    }

    @Override // java.util.Map
    public final void clear() {
        this.d = new LinkedList[16];
        this.e = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int F = this.c.F(obj);
        LinkedList<d<K, V>> linkedList = this.d[F & (r2.length - 1)];
        if (linkedList == null) {
            return null;
        }
        Iterator<d<K, V>> it = linkedList.iterator();
        while (it.hasNext()) {
            d<K, V> next = it.next();
            if (this.c.E(next.a, obj)) {
                return next.b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        d<K, V> next;
        int i = 0;
        for (LinkedList<d<K, V>> linkedList : this.d) {
            if (linkedList != null) {
                Iterator<d<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    i = com.github.catvod.spider.merge.N.a.o(i, this.c.F(next.a));
                }
            }
        }
        return com.github.catvod.spider.merge.N.a.b(i, this.e);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        d<K, V> next;
        if (k == null) {
            return null;
        }
        if (this.e > this.f) {
            LinkedList<d<K, V>>[] linkedListArr = this.d;
            int length = linkedListArr.length * 2;
            this.d = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f = (int) (d * 0.75d);
            int i = this.e;
            for (LinkedList<d<K, V>> linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator<d<K, V>> it = linkedList.iterator();
                    while (it.hasNext() && (next = it.next()) != null) {
                        put(next.a, next.b);
                    }
                }
            }
            this.e = i;
        }
        int F = this.c.F(k);
        LinkedList<d<K, V>>[] linkedListArr2 = this.d;
        int length2 = F & (linkedListArr2.length - 1);
        LinkedList<d<K, V>> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
            linkedListArr2[length2] = linkedList2;
        }
        Iterator<d<K, V>> it2 = linkedList2.iterator();
        while (it2.hasNext()) {
            d<K, V> next2 = it2.next();
            if (this.c.E(next2.a, k)) {
                V v2 = next2.b;
                next2.b = v;
                this.e++;
                return v2;
            }
        }
        linkedList2.add(new d<>(k, v));
        this.e++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.e;
    }

    public final String toString() {
        d<K, V> next;
        if (this.e == 0) {
            return cYh.d("1C2D");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<d<K, V>> linkedList : this.d) {
            if (linkedList != null) {
                Iterator<d<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(cYh.d("4B70"));
                    }
                    sb.append(next.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        ArrayList arrayList = new ArrayList(this.e);
        for (LinkedList<d<K, V>> linkedList : this.d) {
            if (linkedList != null) {
                Iterator<d<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b);
                }
            }
        }
        return arrayList;
    }
}
