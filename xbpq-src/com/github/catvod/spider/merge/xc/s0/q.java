/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class q {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(q.class, "_handled$volatile");
    private volatile int _handled$volatile;
    public final Throwable a;

    public q(Throwable throwable, boolean bl) {
        this.a = throwable;
        this._handled$volatile = bl ? 1 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append(this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

