/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.O;
import com.github.catvod.spider.merge.n.P;
import com.github.catvod.spider.merge.n.Q;
import com.github.catvod.spider.merge.n.V;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class S
extends O
implements ScheduledExecutorService {
    final ScheduledExecutorService d;

    S(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.d = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Runnable v2, long l2, TimeUnit timeUnit) {
        v2 = new V<Object>(Executors.callable(v2, null));
        return new P<Object>(v2, this.d.schedule(v2, l2, timeUnit));
    }

    public final ScheduledFuture schedule(Callable object, long l2, TimeUnit timeUnit) {
        object = new V(object);
        return new P(object, this.d.schedule((Runnable)object, l2, timeUnit));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        runnable = new Q(runnable);
        return new P(runnable, this.d.scheduleAtFixedRate(runnable, l2, l3, timeUnit));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        runnable = new Q(runnable);
        return new P(runnable, this.d.scheduleWithFixedDelay(runnable, l2, l3, timeUnit));
    }
}

