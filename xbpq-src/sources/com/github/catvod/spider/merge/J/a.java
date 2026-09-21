package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a<T> implements b<T> {
    private final AtomicReference<b<T>> a;

    public a(b<? extends T> bVar) {
        this.a = new AtomicReference<>(bVar);
    }

    @Override // com.github.catvod.spider.merge.J.b
    public final Iterator<T> iterator() {
        b<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException(cYh.d("33382822772902213434393902702230397A05356132383414252C34337A083E2D2877350933247F"));
    }
}
