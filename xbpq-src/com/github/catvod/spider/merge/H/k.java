/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.j;

public final class k<K, V> {
    private final j<K, V>[] a;
    private final int b;

    public k() {
        this(8192);
    }

    public k(int n2) {
        this.b = n2 - 1;
        this.a = new j[n2];
    }

    public final Class a(String string) {
        Object object;
        for (int i2 = 0; i2 < ((j<K, V>[])(object = this.a)).length; ++i2) {
            j<K, V> j2 = object[i2];
            if (j2 == null) continue;
            object = j2;
            while (object != null) {
                Object object2 = j2.a;
                if (object2 instanceof Class && ((Class)(object2 = (Class)object2)).getName().equals(string)) {
                    return object2;
                }
                object = object.c;
            }
        }
        return null;
    }

    public final V b(K k2) {
        int n2 = System.identityHashCode(k2);
        int n3 = this.b;
        j<K, V> j2 = this.a[n2 & n3];
        while (j2 != null) {
            if (k2 == j2.a) {
                return j2.b;
            }
            j2 = j2.c;
        }
        return null;
    }

    public final boolean c(K k2, V v2) {
        int n2 = System.identityHashCode(k2) & this.b;
        Object object = this.a[n2];
        while (object != null) {
            if (k2 == object.a) {
                object.b = v2;
                return true;
            }
            object = object.c;
        }
        object = this.a;
        object[n2] = new j(k2, v2, object[n2]);
        return false;
    }
}

