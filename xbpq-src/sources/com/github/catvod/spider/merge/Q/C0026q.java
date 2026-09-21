package com.github.catvod.spider.merge.Q;

/* renamed from: com.github.catvod.spider.merge.Q.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026q extends t0 {
    public final int b;

    public C0026q(AbstractC0022m abstractC0022m, int i) {
        super(abstractC0022m);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final com.github.catvod.spider.merge.S.j c() {
        int i = this.b;
        com.github.catvod.spider.merge.S.j jVar = new com.github.catvod.spider.merge.S.j(new int[0]);
        jVar.a(i);
        return jVar;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final boolean d(int i, int i2) {
        return this.b == i;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
