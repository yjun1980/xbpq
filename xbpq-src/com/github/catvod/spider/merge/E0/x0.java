/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.A0;
import java.util.Map;

final class x0
implements Map.Entry<Comparable<Object>, Object>,
Comparable<x0> {
    private final Comparable<Object> a;
    private Object b;
    final A0 c;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    x0(A0 a02, Comparable comparable, Object object) {
        this.c = a02;
        this.a = comparable;
        this.b = object;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    x0(A0 a02, Map.Entry entry) {
        Comparable comparable = (Comparable)entry.getKey();
        entry = entry.getValue();
        this.c = a02;
        this.a = comparable;
        this.b = entry;
    }

    public final Comparable<Object> b() {
        return this.a;
    }

    @Override
    public final int compareTo(Object object) {
        object = (x0)object;
        return this.a.compareTo(((x0)object).a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        boolean bl;
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        object = (Map.Entry)object;
        Object object2 = this.a;
        Object k2 = object.getKey();
        if (object2 == null) {
            if (k2 != null) return false;
            bl = true;
        } else {
            bl = object2.equals(k2);
        }
        if (!bl) return false;
        object2 = this.b;
        object = object.getValue();
        if (object2 == null) {
            if (object != null) return false;
            bl = true;
        } else {
            bl = object2.equals(object);
        }
        if (!bl) return false;
        return bl2;
    }

    @Override
    public final Object getKey() {
        return this.a;
    }

    @Override
    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n2 = object.hashCode();
        }
        return n3 ^ n2;
    }

    @Override
    public final Object setValue(Object object) {
        A0.a(this.c);
        Object object2 = this.b;
        this.b = object;
        return object2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

