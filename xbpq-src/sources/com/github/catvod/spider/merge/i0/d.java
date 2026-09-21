package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements com.github.catvod.spider.merge.h0.a {
    @Override // com.github.catvod.spider.merge.h0.a
    public final String a() {
        return cYh.d("0438283D33");
    }

    @Override // com.github.catvod.spider.merge.h0.a
    public final com.github.catvod.spider.merge.h0.e b(C0123g c0123g) {
        C0123g c0123g2 = new C0123g();
        Iterator<com.github.catvod.spider.merge.c0.l> it = c0123g.iterator();
        while (it.hasNext()) {
            c0123g2.addAll(it.next().R());
        }
        return new com.github.catvod.spider.merge.h0.e(c0123g2);
    }
}
