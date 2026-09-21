package com.github.catvod.spider.merge.g0;

/* loaded from: classes.dex */
public final class m extends com.github.catvod.spider.merge.P.x {
    public m(com.github.catvod.spider.merge.P.x xVar, int i) {
        super(xVar, i);
    }

    @Override // com.github.catvod.spider.merge.P.C, com.github.catvod.spider.merge.T.b
    public final <T> T e(com.github.catvod.spider.merge.T.d<? extends T> dVar) {
        return dVar instanceof E ? (T) ((E) dVar).o(this) : dVar.A(this);
    }

    @Override // com.github.catvod.spider.merge.P.C
    public final int f() {
        return 1;
    }

    @Override // com.github.catvod.spider.merge.P.x
    public final void i(com.github.catvod.spider.merge.T.c cVar) {
        if (cVar instanceof InterfaceC0144b) {
            ((InterfaceC0144b) cVar).O();
        }
    }

    @Override // com.github.catvod.spider.merge.P.x
    public final void j(com.github.catvod.spider.merge.T.c cVar) {
        if (cVar instanceof InterfaceC0144b) {
            ((InterfaceC0144b) cVar).A();
        }
    }

    public final y n() {
        return (y) k(y.class);
    }
}
