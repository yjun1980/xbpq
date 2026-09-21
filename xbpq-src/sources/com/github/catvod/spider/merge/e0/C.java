package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class C extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.c0.l f0 = lVar2.f0();
                return (f0 == null || (f0 instanceof com.github.catvod.spider.merge.c0.h) || lVar2.U() != f0.R().size() - 1) ? false : true;
            default:
                if (lVar instanceof com.github.catvod.spider.merge.c0.h) {
                    lVar = lVar.P();
                }
                return lVar2 == lVar;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return cYh.d("5D3C202223770438283D33");
            default:
                return cYh.d("5D222E3E23");
        }
    }
}
