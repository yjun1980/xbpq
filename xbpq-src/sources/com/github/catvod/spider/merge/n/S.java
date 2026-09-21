package com.github.catvod.spider.merge.n;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class S extends O implements ScheduledExecutorService {
    final ScheduledExecutorService d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.d = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        V v = new V(Executors.callable(runnable, null));
        return new P(v, this.d.schedule(v, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Q q = new Q(runnable);
        return new P(q, this.d.scheduleAtFixedRate(q, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Q q = new Q(runnable);
        return new P(q, this.d.scheduleWithFixedDelay(q, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        V v = new V(callable);
        return new P(v, this.d.schedule(v, j, timeUnit));
    }
}
