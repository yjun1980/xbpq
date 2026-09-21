/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.n.p;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class O
extends p {
    private final ExecutorService c;

    O(ExecutorService executorService) {
        executorService.getClass();
        this.c = executorService;
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.c.awaitTermination(l2, timeUnit);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override
    public final boolean isShutdown() {
        return this.c.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.c.isTerminated();
    }

    @Override
    public final void shutdown() {
        this.c.shutdown();
    }

    @Override
    public final List<Runnable> shutdownNow() {
        return this.c.shutdownNow();
    }

    public final String toString() {
        String string = super.toString();
        String string2 = String.valueOf(this.c);
        int n2 = String.valueOf(string).length();
        StringBuilder stringBuilder = new StringBuilder(string2.length() + (n2 + 2));
        stringBuilder.append(string);
        stringBuilder.append(cYh.d("3C"));
        stringBuilder.append(string2);
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

