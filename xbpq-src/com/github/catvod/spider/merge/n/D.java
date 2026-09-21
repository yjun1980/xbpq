/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.m.a;
import com.github.catvod.spider.merge.n.M;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class D<V>
extends a
implements M<V>,
Future<Object> {
    protected D() {
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.c().a(runnable, executor);
    }

    protected abstract M<? extends V> c();

    @Override
    public boolean cancel(boolean bl) {
        return this.d().cancel(bl);
    }

    protected abstract Future<Object> d();

    @Override
    public final Object get() {
        return this.d().get();
    }

    @Override
    public final Object get(long l2, TimeUnit timeUnit) {
        return this.d().get(l2, timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.d().isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.d().isDone();
    }
}

