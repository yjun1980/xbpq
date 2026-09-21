package com.github.catvod.spider.merge.n;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class P<V> extends AbstractC0193C<V> implements ScheduledFuture {
    private final ScheduledFuture<?> d;

    public P(M<V> m, ScheduledFuture<?> scheduledFuture) {
        super(m);
        this.d = scheduledFuture;
    }

    @Override // com.github.catvod.spider.merge.n.AbstractFutureC0194D, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.d.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.d.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.d.getDelay(timeUnit);
    }
}
