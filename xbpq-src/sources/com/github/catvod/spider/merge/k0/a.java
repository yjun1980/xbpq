package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class a implements com.github.catvod.spider.merge.h0.c {
    @Override // com.github.catvod.spider.merge.h0.c
    public final String a() {
        return cYh.d("063C2D05322213");
    }

    @Override // com.github.catvod.spider.merge.h0.c
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<l> it = dVar.a().iterator();
        while (it.hasNext()) {
            l next = it.next();
            linkedList.add(cYh.d("14333338272E").equals(next.t()) ? next.T() : next.p0());
        }
        return new com.github.catvod.spider.merge.h0.e(linkedList);
    }
}
