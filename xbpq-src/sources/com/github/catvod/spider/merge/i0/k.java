package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class k implements com.github.catvod.spider.merge.h0.a {
    @Override // com.github.catvod.spider.merge.h0.a
    public final String a() {
        return cYh.d("17222432323E0E3E26");
    }

    @Override // com.github.catvod.spider.merge.h0.a
    public final com.github.catvod.spider.merge.h0.e b(C0123g c0123g) {
        C0123g c0123g2 = new C0123g();
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.c0.l> it = c0123g.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            Iterator<com.github.catvod.spider.merge.c0.l> it2 = next.g0().iterator();
            while (it2.hasNext()) {
                C0123g d = com.github.catvod.spider.merge.j.l.d(it2.next());
                if (d != null) {
                    linkedList.addAll(d);
                }
            }
            C0123g d2 = com.github.catvod.spider.merge.j.l.d(next);
            if (d2 != null) {
                linkedList.addAll(d2);
            }
        }
        c0123g2.addAll(linkedList);
        return new com.github.catvod.spider.merge.h0.e(c0123g2);
    }
}
