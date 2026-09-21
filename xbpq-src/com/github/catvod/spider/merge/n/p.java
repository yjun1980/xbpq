/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.M;
import com.github.catvod.spider.merge.n.N;
import com.github.catvod.spider.merge.n.V;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class p
extends AbstractExecutorService
implements N {
    @Override
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t2) {
        return new V<T>(Executors.callable(runnable, t2));
    }

    @Override
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new V<T>(callable);
    }

    @Override
    public final <T> M<T> submit(Callable<T> callable) {
        return (M)super.submit(callable);
    }

    public final Future submit(Runnable runnable) {
        return (M)super.submit(runnable);
    }

    public final Future submit(Runnable runnable, Object object) {
        return (M)super.submit(runnable, object);
    }

    public final Future submit(Callable callable) {
        return (M)super.submit(callable);
    }
}

