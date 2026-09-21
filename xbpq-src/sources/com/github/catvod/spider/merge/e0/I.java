package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class I extends N {
    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        com.github.catvod.spider.merge.c0.l f0 = lVar2.f0();
        if (f0 == null || (f0 instanceof com.github.catvod.spider.merge.c0.h)) {
            return false;
        }
        Iterator<com.github.catvod.spider.merge.c0.l> it = f0.R().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m0().equals(lVar2.m0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return cYh.d("5D3F2F3D2E7708366C252E2A02");
    }
}
