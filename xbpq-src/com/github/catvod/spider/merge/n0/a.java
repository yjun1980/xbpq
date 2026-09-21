/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class a
implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    a() {
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Object object = System.getSecurityManager();
        object = object != null ? ((SecurityManager)object).getThreadGroup() : Thread.currentThread().getThreadGroup();
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("yt-downloader-");
        stringBuilder.append(this.a.getAndIncrement());
        runnable = new Thread((ThreadGroup)object, runnable, stringBuilder.toString());
        ((Thread)runnable).setDaemon(true);
        return runnable;
    }
}

