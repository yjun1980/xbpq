package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class S extends Z {
    public S(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        Iterator<com.github.catvod.spider.merge.c0.l> it = lVar2.V().iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            if (next != lVar2 && this.a.a(lVar2, next)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(cYh.d("5D3820227F7F1479"), this.a);
    }
}
