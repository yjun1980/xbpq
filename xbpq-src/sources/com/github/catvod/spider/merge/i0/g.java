package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class g implements com.github.catvod.spider.merge.h0.a {
    @Override // com.github.catvod.spider.merge.h0.a
    public final String a() {
        return cYh.d("013F2D3D382D0E3E26");
    }

    @Override // com.github.catvod.spider.merge.h0.a
    public final com.github.catvod.spider.merge.h0.e b(C0123g c0123g) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.c0.l> it = c0123g.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            Iterator<com.github.catvod.spider.merge.c0.l> it2 = next.g0().iterator();
            while (it2.hasNext()) {
                C0123g b = com.github.catvod.spider.merge.j.l.b(it2.next());
                if (b != null) {
                    Iterator<com.github.catvod.spider.merge.c0.l> it3 = b.iterator();
                    while (it3.hasNext()) {
                        linkedList.addAll(it3.next().V());
                    }
                }
            }
            C0123g b2 = com.github.catvod.spider.merge.j.l.b(next);
            if (b2 != null) {
                Iterator<com.github.catvod.spider.merge.c0.l> it4 = b2.iterator();
                while (it4.hasNext()) {
                    linkedList.addAll(it4.next().V());
                }
            }
        }
        return new com.github.catvod.spider.merge.h0.e(new C0123g(linkedList));
    }
}
