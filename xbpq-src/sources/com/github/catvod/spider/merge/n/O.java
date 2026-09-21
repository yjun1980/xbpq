package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class O extends AbstractC0217p {
    private final ExecutorService c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(ExecutorService executorService) {
        executorService.getClass();
        this.c = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.c.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.c.shutdownNow();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(obj).length() + 2);
        sb.append(obj);
        sb.append(cYh.d("3C"));
        sb.append(valueOf);
        sb.append(cYh.d("3A"));
        return sb.toString();
    }
}
