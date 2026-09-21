package com.github.catvod.spider.merge.Q;

/* loaded from: classes.dex */
public class m0 extends t0 {
    public final com.github.catvod.spider.merge.S.j b;

    public m0(AbstractC0022m abstractC0022m, com.github.catvod.spider.merge.S.j jVar) {
        super(abstractC0022m);
        if (jVar == null) {
            jVar = new com.github.catvod.spider.merge.S.j(new int[0]);
            jVar.a(0);
        }
        this.b = jVar;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final com.github.catvod.spider.merge.S.j c() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public boolean d(int i, int i2) {
        return this.b.d(i);
    }

    public String toString() {
        return this.b.toString();
    }
}
