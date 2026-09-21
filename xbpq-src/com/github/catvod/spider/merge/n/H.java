/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.s;
import com.github.catvod.spider.merge.m.f;
import com.github.catvod.spider.merge.n.A;
import com.github.catvod.spider.merge.n.E;
import com.github.catvod.spider.merge.n.F;
import com.github.catvod.spider.merge.n.G;
import com.github.catvod.spider.merge.n.I;
import com.github.catvod.spider.merge.n.M;
import com.github.catvod.spider.merge.n.N;
import com.github.catvod.spider.merge.n.O;
import com.github.catvod.spider.merge.n.S;
import com.github.catvod.spider.merge.n.W;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public final class H {
    public static void a(M m2, E e2, Executor executor) {
        m2.a(new F(m2, e2), executor);
    }

    public static Executor b() {
        return A.c;
    }

    public static Object c(Future future) {
        if (future.isDone()) {
            return W.a(future);
        }
        throw new IllegalStateException(s.b(cYh.d("21253524253F47272022773F1F202432233F0370353E77380270253E393F5D706422"), future));
    }

    public static M d(Throwable throwable) {
        return new I(throwable);
    }

    public static N e(ExecutorService executorService) {
        executorService = executorService instanceof N ? (N)executorService : (executorService instanceof ScheduledExecutorService ? new S((ScheduledExecutorService)executorService) : new O(executorService));
        return executorService;
    }

    @SafeVarargs
    public static G f(M ... mArray) {
        return new G(f.f(mArray));
    }
}

