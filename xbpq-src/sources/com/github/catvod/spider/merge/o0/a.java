package com.github.catvod.spider.merge.o0;

import java.util.Queue;

/* loaded from: classes.dex */
public final class a implements com.github.catvod.spider.merge.n0.b {
    String c;
    com.github.catvod.spider.merge.p0.c d;
    Queue<c> e;

    public a(com.github.catvod.spider.merge.p0.c cVar, Queue<c> queue) {
        this.d = cVar;
        this.c = cVar.b();
        this.e = queue;
    }

    @Override // com.github.catvod.spider.merge.n0.b
    public final void a(String str, Throwable th) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.a = this.d;
        Thread.currentThread().getName();
        this.e.add(cVar);
    }

    @Override // com.github.catvod.spider.merge.n0.b
    public final String b() {
        return this.c;
    }
}
