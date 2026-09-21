/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.C;
import com.github.catvod.spider.merge.n.M;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class P<V>
extends C<V>
implements ScheduledFuture {
    private final ScheduledFuture<?> d;

    public P(M<V> m2, ScheduledFuture<?> scheduledFuture) {
        super(m2);
        this.d = scheduledFuture;
    }

    @Override
    public final boolean cancel(boolean bl) {
        boolean bl2 = super.cancel(bl);
        if (bl2) {
            this.d.cancel(bl);
        }
        return bl2;
    }

    @Override
    public final int compareTo(Object object) {
        object = (Delayed)object;
        return this.d.compareTo(object);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.d.getDelay(timeUnit);
    }
}

