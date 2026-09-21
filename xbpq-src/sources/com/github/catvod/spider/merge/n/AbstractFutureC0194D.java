package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.m.AbstractC0188a;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.github.catvod.spider.merge.n.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0194D<V> extends AbstractC0188a implements M<V>, Future<Object> {
    @Override // com.github.catvod.spider.merge.n.M
    public final void a(Runnable runnable, Executor executor) {
        c().a(runnable, executor);
    }

    protected abstract M<? extends V> c();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return d().cancel(z);
    }

    protected abstract Future<Object> d();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return d().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return d().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return d().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return d().get(j, timeUnit);
    }
}
