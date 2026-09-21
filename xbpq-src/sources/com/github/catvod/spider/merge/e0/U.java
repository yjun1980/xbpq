package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class U extends Z {
    public U(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        com.github.catvod.spider.merge.c0.l i0;
        return (lVar == lVar2 || (i0 = lVar2.i0()) == null || !this.a.a(lVar, i0)) ? false : true;
    }

    public final String toString() {
        return String.format(cYh.d("4223617A77"), this.a);
    }
}
