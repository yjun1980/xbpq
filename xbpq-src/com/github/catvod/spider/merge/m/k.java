/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.m.b;
import com.github.catvod.spider.merge.m.f;
import com.github.catvod.spider.merge.m.g;
import com.github.catvod.spider.merge.m.j;
import com.github.catvod.spider.merge.m.m;

final class k<E>
extends g<E> {
    private static final Object[] j;
    static final k<Object> k;
    final transient Object[] e;
    private final transient int f;
    final transient Object[] g;
    private final transient int h;
    private final transient int i;

    static {
        Object[] objectArray = new Object[]{};
        j = objectArray;
        k = new k(objectArray, 0, objectArray, 0, 0);
    }

    k(Object[] objectArray, int n2, Object[] objectArray2, int n3, int n4) {
        this.e = objectArray;
        this.f = n2;
        this.g = objectArray2;
        this.h = n3;
        this.i = n4;
    }

    @Override
    final int a(Object[] objectArray) {
        System.arraycopy(this.e, 0, objectArray, 0, this.i);
        return this.i + 0;
    }

    @Override
    final Object[] b() {
        return this.e;
    }

    @Override
    final int c() {
        return this.i;
    }

    @Override
    public final boolean contains(Object object) {
        Object[] objectArray = this.g;
        if (object != null && objectArray.length != 0) {
            int n2 = b.a(object.hashCode());
            while (true) {
                Object object2;
                if ((object2 = objectArray[n2 &= this.h]) == null) {
                    return false;
                }
                if (object2.equals(object)) {
                    return true;
                }
                ++n2;
            }
        }
        return false;
    }

    @Override
    final int d() {
        return 0;
    }

    @Override
    public final m<E> e() {
        return this.f().g(0);
    }

    @Override
    public final int hashCode() {
        return this.f;
    }

    @Override
    final f<E> i() {
        Object object = this.e;
        int n2 = this.i;
        int n3 = com.github.catvod.spider.merge.m.f.e;
        object = n2 == 0 ? com.github.catvod.spider.merge.m.j.h : new j((Object[])object, n2);
        return object;
    }

    @Override
    public final int size() {
        return this.i;
    }
}

