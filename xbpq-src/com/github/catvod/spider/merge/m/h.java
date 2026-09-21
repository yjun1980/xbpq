/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.m.m;
import java.util.NoSuchElementException;

final class h
extends m<Object> {
    boolean a;
    final Object b;

    h(Object object) {
        this.b = object;
    }

    @Override
    public final boolean hasNext() {
        return this.a ^ true;
    }

    @Override
    public final Object next() {
        if (!this.a) {
            this.a = true;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}

