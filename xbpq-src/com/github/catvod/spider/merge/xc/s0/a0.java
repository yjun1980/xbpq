/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.Z;
import com.github.catvod.spider.merge.xc.s0.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class a0
extends e0 {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final Z e;

    public a0(Z z2) {
        this.e = z2;
    }

    @Override
    public final void d(Throwable throwable) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.d(throwable);
        }
    }
}

