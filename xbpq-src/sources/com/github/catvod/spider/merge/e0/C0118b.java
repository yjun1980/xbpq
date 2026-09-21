package com.github.catvod.spider.merge.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118b {
    private final com.github.catvod.spider.merge.c0.l a;
    private com.github.catvod.spider.merge.c0.l b = null;
    private final N c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0118b(com.github.catvod.spider.merge.c0.l lVar, N n) {
        this.a = lVar;
        this.c = n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.github.catvod.spider.merge.c0.l a(C0118b c0118b) {
        return c0118b.b;
    }

    public final int b(com.github.catvod.spider.merge.c0.r rVar) {
        if (!(rVar instanceof com.github.catvod.spider.merge.c0.l)) {
            return 1;
        }
        com.github.catvod.spider.merge.c0.l lVar = (com.github.catvod.spider.merge.c0.l) rVar;
        if (!this.c.a(this.a, lVar)) {
            return 1;
        }
        this.b = lVar;
        return 5;
    }
}
