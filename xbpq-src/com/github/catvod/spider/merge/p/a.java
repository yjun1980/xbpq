/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p;

import com.github.catvod.spider.merge.p.d;
import com.github.catvod.spider.merge.p.h;
import java.util.HashMap;

public final class a<K, V>
extends h<K, V> {
    private HashMap<K, d<K, V>> e = new HashMap();

    @Override
    protected final d<K, V> c(K k2) {
        return this.e.get(k2);
    }

    public final boolean contains(K k2) {
        return this.e.containsKey(k2);
    }

    @Override
    public final V g(K k2) {
        Object v2 = super.g(k2);
        this.e.remove(k2);
        return v2;
    }
}

