/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.p.b;
import com.github.catvod.spider.merge.p.c;
import com.github.catvod.spider.merge.p.d;
import com.github.catvod.spider.merge.p.e;
import com.github.catvod.spider.merge.p.f;
import com.github.catvod.spider.merge.p.g;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class h<K, V>
implements Iterable<Map.Entry<K, V>> {
    d<K, V> a;
    private d<K, V> b;
    private WeakHashMap<g<K, V>, Boolean> c = new WeakHashMap();
    private int d = 0;

    public final Map.Entry<K, V> a() {
        return this.a;
    }

    protected d<K, V> c(K k2) {
        d<K, V> d2 = this.a;
        while (d2 != null && !d2.a.equals(k2)) {
            d2 = d2.c;
        }
        return d2;
    }

    public final e d() {
        e e2 = new e(this);
        this.c.put(e2, Boolean.FALSE);
        return e2;
    }

    public final Iterator<Map.Entry<K, V>> descendingIterator() {
        c<K, V> c2 = new c<K, V>(this.b, this.a);
        this.c.put(c2, Boolean.FALSE);
        return c2;
    }

    public final boolean equals(Object iterator) {
        Object object;
        Object object2;
        boolean bl = true;
        if (iterator == this) {
            return true;
        }
        if (!(iterator instanceof h)) {
            return false;
        }
        Object object3 = (h)((Object)iterator);
        if (this.d != ((h)object3).d) {
            return false;
        }
        iterator = this.iterator();
        object3 = ((h)object3).iterator();
        while (((f)(object2 = (f)iterator)).hasNext() && ((f)(object = (f)object3)).hasNext()) {
            object2 = (Map.Entry)((f)object2).next();
            object = ((f)object).next();
            if ((object2 != null || object == null) && (object2 == null || object2.equals(object))) continue;
            return false;
        }
        if (((f)object2).hasNext() || ((f)object3).hasNext()) {
            bl = false;
        }
        return bl;
    }

    public final Map.Entry<K, V> f() {
        return this.b;
    }

    public V g(K object) {
        Object object2;
        if ((object = this.c(object)) == null) {
            return null;
        }
        --this.d;
        if (!this.c.isEmpty()) {
            object2 = this.c.keySet().iterator();
            while (object2.hasNext()) {
                ((g)object2.next()).b(object);
            }
        }
        object2 = ((d)object).d;
        d d2 = ((d)object).c;
        if (object2 != null) {
            ((d)object2).c = d2;
        } else {
            this.a = d2;
        }
        d2 = ((d)object).c;
        if (d2 != null) {
            d2.d = object2;
        } else {
            this.b = object2;
        }
        ((d)object).c = null;
        ((d)object).d = null;
        return ((d)object).b;
    }

    public final int hashCode() {
        f f2;
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        int n2 = 0;
        while ((f2 = (f)iterator).hasNext()) {
            n2 += ((Map.Entry)f2.next()).hashCode();
        }
        return n2;
    }

    @Override
    public final Iterator<Map.Entry<K, V>> iterator() {
        b<K, V> b2 = new b<K, V>(this.a, this.b);
        this.c.put(b2, Boolean.FALSE);
        return b2;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        f f2;
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("[");
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        while ((f2 = (f)iterator).hasNext()) {
            stringBuilder.append(((Map.Entry)f2.next()).toString());
            if (!f2.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

