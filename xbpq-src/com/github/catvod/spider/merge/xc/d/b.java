/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);

    @Override
    public final Thread newThread(Runnable runnable) {
        runnable = new Thread(runnable);
        ((Thread)runnable).setName(String.format("arch_disk_io_%d", this.a.getAndIncrement()));
        return runnable;
    }
}

