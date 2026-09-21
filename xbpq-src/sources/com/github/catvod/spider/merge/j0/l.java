package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.cYh;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements com.github.catvod.spider.merge.h0.b {
    @Override // com.github.catvod.spider.merge.h0.b
    public final String a() {
        return cYh.d("1425232223280E3E267C363C133533");
    }

    @Override // com.github.catvod.spider.merge.h0.b
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar, List<com.github.catvod.spider.merge.h0.e> list) {
        int indexOf;
        LinkedList linkedList = (LinkedList) list;
        String g = ((com.github.catvod.spider.merge.h0.e) linkedList.get(0)).g();
        String g2 = ((com.github.catvod.spider.merge.h0.e) linkedList.get(1)).g();
        if (!com.github.catvod.spider.merge.U.h.c(g)) {
            g = (g2 == null || (indexOf = g.indexOf(g2)) == -1) ? "" : g.substring(g2.length() + indexOf);
        }
        return new com.github.catvod.spider.merge.h0.e(g);
    }
}
