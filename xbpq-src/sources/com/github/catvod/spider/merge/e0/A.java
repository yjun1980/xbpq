package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class A extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ A(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.c0.l f0 = lVar2.f0();
                return (f0 == null || (f0 instanceof com.github.catvod.spider.merge.c0.h) || lVar2.U() != 0) ? false : true;
            default:
                com.github.catvod.spider.merge.c0.l f02 = lVar2.f0();
                return (f02 == null || (f02 instanceof com.github.catvod.spider.merge.c0.h) || !lVar2.l0().isEmpty()) ? false : true;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return cYh.d("5D362823242E4A3329383B3E");
            default:
                return cYh.d("5D3F2F3D2E770438283D33");
        }
    }
}
