/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.H;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class e {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final H[] a;
    private volatile int notCompletedCount$volatile;

    public e(H[] hArray) {
        this.a = hArray;
        this.notCompletedCount$volatile = hArray.length;
    }
}

