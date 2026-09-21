package com.github.catvod.spider.merge.n;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.github.catvod.spider.merge.n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0211j<V> extends AbstractC0216o<V> implements InterfaceC0210i<V> {
    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, com.github.catvod.spider.merge.n.M
    public final void a(Runnable runnable, Executor executor) {
        super.a(runnable, executor);
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final V get() {
        return (V) super.get();
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return (V) super.get(j, timeUnit);
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }
}
