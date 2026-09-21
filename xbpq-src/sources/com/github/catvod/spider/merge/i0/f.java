package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements com.github.catvod.spider.merge.h0.a {
    @Override // com.github.catvod.spider.merge.h0.a
    public final String a() {
        return cYh.d("03353232323403312F25");
    }

    @Override // com.github.catvod.spider.merge.h0.a
    public final com.github.catvod.spider.merge.h0.e b(C0123g c0123g) {
        HashSet hashSet = new HashSet();
        C0123g c0123g2 = new C0123g();
        Iterator<com.github.catvod.spider.merge.c0.l> it = c0123g.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            C0123g V = next.V();
            V.remove(next);
            hashSet.addAll(V);
        }
        c0123g2.addAll(hashSet);
        return new com.github.catvod.spider.merge.h0.e(c0123g2);
    }
}
