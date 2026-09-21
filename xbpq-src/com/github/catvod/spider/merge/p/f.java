/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p;

import com.github.catvod.spider.merge.p.d;
import com.github.catvod.spider.merge.p.g;
import java.util.Iterator;
import java.util.Map;

abstract class f<K, V>
implements Iterator<Map.Entry<K, V>>,
g<K, V> {
    d<K, V> a;
    d<K, V> b;

    f(d<K, V> d2, d<K, V> d3) {
        this.a = d3;
        this.b = d2;
    }

    @Override
    public final void b(d<K, V> d2) {
        d<K, V> d3 = this.a;
        Object var2_3 = null;
        if (d3 == d2 && d2 == this.b) {
            this.b = null;
            this.a = null;
        }
        if ((d3 = this.a) == d2) {
            this.a = this.c(d3);
        }
        if ((d3 = this.b) == d2) {
            d<K, V> d4 = this.a;
            d2 = var2_3;
            if (d3 != d4) {
                d2 = d4 == null ? var2_3 : this.d(d3);
            }
            this.b = d2;
        }
    }

    abstract d<K, V> c(d<K, V> var1);

    abstract d<K, V> d(d<K, V> var1);

    @Override
    public final boolean hasNext() {
        boolean bl = this.b != null;
        return bl;
    }

    @Override
    public final Object next() {
        d<K, V> d2 = this.b;
        d<K, V> d3 = this.a;
        d3 = d2 != d3 && d3 != null ? this.d(d2) : null;
        this.b = d3;
        return d2;
    }
}

