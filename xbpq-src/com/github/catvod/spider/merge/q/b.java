/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.a;
import com.github.catvod.spider.merge.q.i;
import com.github.catvod.spider.merge.q.j;
import com.github.catvod.spider.merge.q.l;
import com.github.catvod.spider.merge.q.m;
import com.github.catvod.spider.merge.q.n;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class b<K, V>
extends n<K, V>
implements Map<K, V> {
    m<K, V> h;

    private m<K, V> l() {
        if (this.h == null) {
            this.h = new a(this);
        }
        return this.h;
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        m<K, V> m2 = this.l();
        if (m2.a == null) {
            m2.a = new i(m2);
        }
        return m2.a;
    }

    @Override
    public final Set<K> keySet() {
        m<K, V> m2 = this.l();
        if (m2.b == null) {
            m2.b = new j(m2);
        }
        return m2.b;
    }

    @Override
    public final void putAll(Map<? extends K, ? extends V> object2) {
        int n2 = this.c;
        this.b(object2.size() + n2);
        for (Map.Entry entry : object2.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public final Collection<V> values() {
        m<K, V> m2 = this.l();
        if (m2.c == null) {
            m2.c = new l(m2);
        }
        return m2.c;
    }
}

