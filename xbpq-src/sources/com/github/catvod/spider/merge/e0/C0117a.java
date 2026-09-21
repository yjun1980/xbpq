package com.github.catvod.spider.merge.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117a implements O {
    private final com.github.catvod.spider.merge.c0.l a;
    private final C0123g b;
    private final N c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0117a(com.github.catvod.spider.merge.c0.l lVar, C0123g c0123g, N n) {
        this.a = lVar;
        this.b = c0123g;
        this.c = n;
    }

    @Override // com.github.catvod.spider.merge.e0.O
    public final void a(com.github.catvod.spider.merge.c0.r rVar, int i) {
        if (rVar instanceof com.github.catvod.spider.merge.c0.l) {
            com.github.catvod.spider.merge.c0.l lVar = (com.github.catvod.spider.merge.c0.l) rVar;
            if (this.c.a(this.a, lVar)) {
                this.b.add(lVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.e0.O
    public final void b(com.github.catvod.spider.merge.c0.r rVar, int i) {
    }
}
