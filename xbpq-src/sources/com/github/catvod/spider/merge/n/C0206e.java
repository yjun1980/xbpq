package com.github.catvod.spider.merge.n;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206e {
    static final C0206e d = new C0206e();
    final Runnable a;
    final Executor b;
    C0206e c;

    C0206e() {
        this.a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0206e(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
