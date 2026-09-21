package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements com.github.catvod.spider.merge.h0.c {
    @Override // com.github.catvod.spider.merge.h0.c
    public final String a() {
        return cYh.d("093F2534");
    }

    @Override // com.github.catvod.spider.merge.h0.c
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar) {
        C0123g c0123g = new C0123g();
        Iterator<l> it = dVar.a().iterator();
        while (it.hasNext()) {
            l next = it.next();
            c0123g.addAll(next.R());
            String e0 = next.e0();
            if (h.d(e0)) {
                l lVar = new l("");
                lVar.O(e0);
                c0123g.add(lVar);
            }
        }
        return new com.github.catvod.spider.merge.h0.e(c0123g);
    }
}
