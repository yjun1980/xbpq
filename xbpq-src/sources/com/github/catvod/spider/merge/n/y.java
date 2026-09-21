package com.github.catvod.spider.merge.n;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y extends L<Object> {
    private final Executor e;
    final /* synthetic */ z f;
    private final Callable<Object> g;
    final /* synthetic */ z h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Callable<Ljava/lang/Object;>;Ljava/util/concurrent/Executor;)V */
    public y(z zVar, Callable callable) {
        EnumC0191A enumC0191A = EnumC0191A.c;
        this.h = zVar;
        this.f = zVar;
        this.e = enumC0191A;
        this.g = callable;
    }

    @Override // com.github.catvod.spider.merge.n.L
    final void a(Throwable th) {
        z zVar;
        this.f.r = null;
        if (th instanceof ExecutionException) {
            zVar = this.f;
            th = ((ExecutionException) th).getCause();
        } else {
            if (th instanceof CancellationException) {
                this.f.cancel(false);
                return;
            }
            zVar = this.f;
        }
        zVar.u(th);
    }

    @Override // com.github.catvod.spider.merge.n.L
    final void b(Object obj) {
        this.f.r = null;
        this.h.t(obj);
    }

    @Override // com.github.catvod.spider.merge.n.L
    final boolean d() {
        return this.f.isDone();
    }

    @Override // com.github.catvod.spider.merge.n.L
    final Object e() {
        return this.g.call();
    }

    @Override // com.github.catvod.spider.merge.n.L
    final String f() {
        return this.g.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        try {
            this.e.execute(this);
        } catch (RejectedExecutionException e) {
            this.f.u(e);
        }
    }
}
