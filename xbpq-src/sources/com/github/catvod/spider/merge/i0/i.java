package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class i implements com.github.catvod.spider.merge.h0.a {
    @Override // com.github.catvod.spider.merge.h0.a
    public final String a() {
        return cYh.d("013F2D3D382D0E3E267C2433053C283F30");
    }

    @Override // com.github.catvod.spider.merge.h0.a
    public final com.github.catvod.spider.merge.h0.e b(C0123g c0123g) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.c0.l> it = c0123g.iterator();
        while (it.hasNext()) {
            C0123g b = com.github.catvod.spider.merge.j.l.b(it.next());
            if (b != null) {
                linkedList.addAll(b);
            }
        }
        C0123g c0123g2 = new C0123g();
        c0123g2.addAll(linkedList);
        return new com.github.catvod.spider.merge.h0.e(c0123g2);
    }
}
