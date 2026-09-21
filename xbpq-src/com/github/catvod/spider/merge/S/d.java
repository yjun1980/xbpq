/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.cYh;

public final class d<K, V> {
    public final K a;
    public V b;

    public d(K k2, V v2) {
        this.a = k2;
        this.b = v2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.toString());
        stringBuilder.append(cYh.d("5D"));
        stringBuilder.append(this.b.toString());
        return stringBuilder.toString();
    }
}

