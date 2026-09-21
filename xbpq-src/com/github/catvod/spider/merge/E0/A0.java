/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.w0;
import com.github.catvod.spider.merge.E0.x0;
import com.github.catvod.spider.merge.E0.z0;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class A0<K extends Comparable<K>, V>
extends AbstractMap<K, V> {
    public static final int g = 0;
    private Object[] a;
    private int b;
    private Map<K, V> c = Collections.emptyMap();
    private boolean d;
    private volatile z0 e;
    private Map<K, V> f = Collections.emptyMap();

    private A0() {
    }

    /* synthetic */ A0(w0 w02) {
        this();
    }

    static /* synthetic */ void a(A0 a02) {
        a02.g();
    }

    static /* synthetic */ int b(A0 a02) {
        return a02.b;
    }

    static /* synthetic */ Map c(A0 a02) {
        return a02.c;
    }

    static /* synthetic */ Object[] d(A0 a02) {
        return a02.a;
    }

    static /* synthetic */ Object e(A0 a02, int n2) {
        return a02.o(n2);
    }

    private int f(K k2) {
        int n2;
        int n3 = this.b - 1;
        if (n3 >= 0) {
            n2 = k2.compareTo(((x0)this.a[n3]).b());
            if (n2 > 0) {
                return -(n3 + 2);
            }
            if (n2 == 0) {
                return n3;
            }
        }
        n2 = 0;
        while (n2 <= n3) {
            int n4 = (n2 + n3) / 2;
            int n5 = k2.compareTo(((x0)this.a[n4]).b());
            if (n5 < 0) {
                n3 = n4 - 1;
                continue;
            }
            if (n5 > 0) {
                n2 = n4 + 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    private void g() {
        if (!this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private SortedMap<K, V> k() {
        this.g();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap)this.c;
    }

    private V o(int n2) {
        this.g();
        Object object = ((x0)this.a[n2]).getValue();
        Object object2 = this.a;
        System.arraycopy(object2, n2 + 1, object2, n2, this.b - n2 - 1);
        --this.b;
        if (!this.c.isEmpty()) {
            object2 = this.k().entrySet().iterator();
            this.a[this.b] = new x0(this, (Map.Entry)object2.next());
            ++this.b;
            object2.remove();
        }
        return (V)object;
    }

    @Override
    public final void clear() {
        this.g();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override
    public final boolean containsKey(Object object) {
        boolean bl = this.f(object = (Comparable)object) >= 0 || this.c.containsKey(object);
        return bl;
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new z0(this);
        }
        return this.e;
    }

    @Override
    public final boolean equals(Object entry) {
        if (this == entry) {
            return true;
        }
        if (!(entry instanceof A0)) {
            return super.equals(entry);
        }
        A0 a02 = (A0)((Object)entry);
        int n2 = this.size();
        if (n2 != a02.size()) {
            return false;
        }
        int n3 = this.b;
        if (n3 != a02.b) {
            return this.entrySet().equals(a02.entrySet());
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            Map.Entry<K, V> entry2 = this.h(i2);
            if (((x0)entry2).equals(entry = a02.h(i2))) continue;
            return false;
        }
        if (n3 != n2) {
            return this.c.equals(a02.c);
        }
        return true;
    }

    @Override
    public final V get(Object object) {
        int n2 = this.f(object = (Comparable)object);
        if (n2 >= 0) {
            return (V)((x0)this.a[n2]).getValue();
        }
        return this.c.get(object);
    }

    public final Map.Entry<K, V> h(int n2) {
        if (n2 < this.b) {
            return (x0)this.a[n2];
        }
        throw new ArrayIndexOutOfBoundsException(n2);
    }

    @Override
    public final int hashCode() {
        int n2;
        int n3 = this.b;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            n4 += this.a[n2].hashCode();
        }
        n2 = n4;
        if (this.c.size() > 0) {
            n2 = n4 + this.c.hashCode();
        }
        return n2;
    }

    public final int i() {
        return this.b;
    }

    public final Iterable<Map.Entry<K, V>> j() {
        Set<Map.Entry<K, V>> set = this.c.isEmpty() ? Collections.emptySet() : this.c.entrySet();
        return set;
    }

    public final boolean l() {
        return this.d;
    }

    public void m() {
        if (!this.d) {
            Map map = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.c = map;
            map = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.f = map;
            this.d = true;
        }
    }

    public final V n(K k2, V v2) {
        Object object;
        this.g();
        int n2 = this.f(k2);
        if (n2 >= 0) {
            return (V)((x0)this.a[n2]).setValue((Object)v2);
        }
        this.g();
        if (this.a == null) {
            this.a = new Object[16];
        }
        if ((n2 = -(n2 + 1)) >= 16) {
            return this.k().put(k2, v2);
        }
        int n3 = this.b;
        if (n3 == 16) {
            object = (x0)this.a[15];
            this.b = n3 - 1;
            this.k().put(((x0)object).b(), ((x0)object).getValue());
        }
        object = this.a;
        System.arraycopy(object, n2, object, n2 + 1, ((Object[])object).length - n2 - 1);
        this.a[n2] = new x0(this, (Comparable)k2, v2);
        ++this.b;
        return null;
    }

    @Override
    public final V remove(Object object) {
        this.g();
        object = (Comparable)object;
        int n2 = this.f(object);
        if (n2 >= 0) {
            return this.o(n2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(object);
    }

    @Override
    public final int size() {
        int n2 = this.b;
        return this.c.size() + n2;
    }
}

