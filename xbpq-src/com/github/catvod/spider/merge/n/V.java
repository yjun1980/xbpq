/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.n.B;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.U;
import com.github.catvod.spider.merge.n.i;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

final class V<V>
extends B<Object>
implements RunnableFuture<V>,
i<Object> {
    private volatile L<?> j;

    V(Callable<V> callable) {
        this.j = new U(this, callable);
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
    public final Object get() {
        return super.get();
    }

    @Override
    public final Object get(long l2, TimeUnit timeUnit) {
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

    @Override
    protected final void k() {
        L<?> l2;
        if (this.v() && (l2 = this.j) != null) {
            l2.c();
        }
        this.j = null;
    }

    @Override
    protected final String r() {
        L<?> l2 = this.j;
        if (l2 != null) {
            l2 = String.valueOf(l2);
            StringBuilder stringBuilder = new StringBuilder(((String)((Object)l2)).length() + 7);
            stringBuilder.append(cYh.d("1331323A6A01"));
            stringBuilder.append((String)((Object)l2));
            stringBuilder.append(cYh.d("3A"));
            return stringBuilder.toString();
        }
        return super.r();
    }

    @Override
    public final void run() {
        L<?> l2 = this.j;
        if (l2 != null) {
            l2.run();
        }
        this.j = null;
    }
}

