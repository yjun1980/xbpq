package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class b implements com.github.catvod.spider.merge.h0.c {
    @Override // com.github.catvod.spider.merge.h0.c
    public final String a() {
        return cYh.d("0F242C3D");
    }

    @Override // com.github.catvod.spider.merge.h0.c
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<l> it = dVar.a().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().X());
        }
        return new com.github.catvod.spider.merge.h0.e(linkedList);
    }
}
