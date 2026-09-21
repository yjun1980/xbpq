package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class T extends Z {
    public T(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        com.github.catvod.spider.merge.c0.l f0;
        return (lVar == lVar2 || (f0 = lVar2.f0()) == null || !this.a.a(lVar, f0)) ? false : true;
    }

    public final String toString() {
        return String.format(cYh.d("4223616F77"), this.a);
    }
}
