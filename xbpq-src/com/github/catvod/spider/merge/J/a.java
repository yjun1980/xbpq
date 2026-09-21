/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.J.b;
import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T>
implements b<T> {
    private final AtomicReference<b<T>> a;

    public a(b<? extends T> b2) {
        this.a = new AtomicReference<b<? extends T>>(b2);
    }

    @Override
    public final Iterator<T> iterator() {
        b b2 = this.a.getAndSet(null);
        if (b2 != null) {
            return b2.iterator();
        }
        throw new IllegalStateException(cYh.d("33382822772902213434393902702230397A05356132383414252C34337A083E2D2877350933247F"));
    }
}

