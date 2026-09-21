package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class b implements com.github.catvod.spider.merge.h0.a {
    @Override // com.github.catvod.spider.merge.h0.a
    public final String a() {
        return cYh.d("063E2234242E0822");
    }

    @Override // com.github.catvod.spider.merge.h0.a
    public final com.github.catvod.spider.merge.h0.e b(C0123g c0123g) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.c0.l> it = c0123g.iterator();
        while (it.hasNext()) {
            linkedList.addAll(it.next().g0());
        }
        return new com.github.catvod.spider.merge.h0.e(new C0123g(linkedList));
    }
}
