package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0185s;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.github.catvod.spider.merge.n.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198H {
    public static void a(M m, InterfaceC0195E interfaceC0195E, Executor executor) {
        m.a(new RunnableC0196F(m, interfaceC0195E), executor);
    }

    public static Executor b() {
        return EnumC0191A.c;
    }

    public static Object c(Future future) {
        if (future.isDone()) {
            return W.a(future);
        }
        throw new IllegalStateException(C0185s.b(cYh.d("21253524253F47272022773F1F202432233F0370353E77380270253E393F5D706422"), future));
    }

    public static M d(Throwable th) {
        return new C0199I(th);
    }

    public static N e(ExecutorService executorService) {
        if (executorService instanceof N) {
            return (N) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new S((ScheduledExecutorService) executorService) : new O(executorService);
    }

    @SafeVarargs
    public static C0197G f(M... mArr) {
        return new C0197G(com.github.catvod.spider.merge.m.f.f(mArr));
    }
}
