/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p;

import java.util.Map;

final class d<K, V>
implements Map.Entry<K, V> {
    final K a;
    final V b;
    d<K, V> c;
    d<K, V> d;

    @Override
    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (!this.a.equals(((d)object).a) || !this.b.equals(((d)object).b)) {
            bl = false;
        }
        return bl;
    }

    @Override
    public final K getKey() {
        return this.a;
    }

    @Override
    public final V getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override
    public final V setValue(V v2) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

