package com.github.catvod.spider.merge.n;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class U extends L<Object> {
    private final Callable<Object> e;
    final /* synthetic */ V f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(V v, Callable<Object> callable) {
        this.f = v;
        callable.getClass();
        this.e = callable;
    }

    @Override // com.github.catvod.spider.merge.n.L
    final void a(Throwable th) {
        this.f.u(th);
    }

    @Override // com.github.catvod.spider.merge.n.L
    final void b(Object obj) {
        this.f.t(obj);
    }

    @Override // com.github.catvod.spider.merge.n.L
    final boolean d() {
        return this.f.isDone();
    }

    @Override // com.github.catvod.spider.merge.n.L
    final Object e() {
        return this.e.call();
    }

    @Override // com.github.catvod.spider.merge.n.L
    final String f() {
        return this.e.toString();
    }
}
