package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class X extends Z {
    public X(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        if (lVar == lVar2) {
            return false;
        }
        do {
            lVar2 = lVar2.i0();
            if (lVar2 == null) {
                return false;
            }
        } while (!this.a.a(lVar, lVar2));
        return true;
    }

    public final String toString() {
        return String.format(cYh.d("4223612F77"), this.a);
    }
}
