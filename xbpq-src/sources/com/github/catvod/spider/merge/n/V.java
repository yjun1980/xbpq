package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class V<V> extends AbstractC0192B<Object> implements RunnableFuture<V>, InterfaceC0210i<Object> {
    private volatile L<?> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(Callable<V> callable) {
        this.j = new U(this, callable);
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, com.github.catvod.spider.merge.n.M
    public final void a(Runnable runnable, Executor executor) {
        super.a(runnable, executor);
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final Object get() {
        return super.get();
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o
    protected final void k() {
        L<?> l;
        if (v() && (l = this.j) != null) {
            l.c();
        }
        this.j = null;
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o
    protected final String r() {
        L<?> l = this.j;
        if (l == null) {
            return super.r();
        }
        String valueOf = String.valueOf(l);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append(cYh.d("1331323A6A01"));
        sb.append(valueOf);
        sb.append(cYh.d("3A"));
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        L<?> l = this.j;
        if (l != null) {
            l.run();
        }
        this.j = null;
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return super.get(j, timeUnit);
    }
}
