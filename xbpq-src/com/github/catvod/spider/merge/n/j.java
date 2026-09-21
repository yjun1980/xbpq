/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.i;
import com.github.catvod.spider.merge.n.o;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

abstract class j<V>
extends o<V>
implements i<V> {
    j() {
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        super.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean bl) {
        return super.cancel(bl);
    }

    @Override
    public final V get() {
        return super.get();
    }

    @Override
    public final V get(long l2, TimeUnit timeUnit) {
        return super.get(l2, timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return super.isDone();
    }
}

