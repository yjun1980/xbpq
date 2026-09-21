/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.m.g;
import com.github.catvod.spider.merge.m.h;
import com.github.catvod.spider.merge.m.m;

final class l<E>
extends g<E> {
    final transient E e;

    l(E e2) {
        this.e = e2;
    }

    @Override
    final int a(Object[] objectArray) {
        objectArray[0] = this.e;
        return 1;
    }

    @Override
    public final boolean contains(Object object) {
        return this.e.equals(object);
    }

    @Override
    public final m<E> e() {
        return new h(this.e);
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        String string = this.e.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(string).length() + 2);
        stringBuilder.append('[');
        stringBuilder.append(string);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

