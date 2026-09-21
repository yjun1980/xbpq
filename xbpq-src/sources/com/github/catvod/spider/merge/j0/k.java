package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.cYh;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements com.github.catvod.spider.merge.h0.b {
    @Override // com.github.catvod.spider.merge.h0.b
    public final String a() {
        return cYh.d("1425232223280E3E26");
    }

    @Override // com.github.catvod.spider.merge.h0.b
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar, List<com.github.catvod.spider.merge.h0.e> list) {
        LinkedList linkedList = (LinkedList) list;
        String g = ((com.github.catvod.spider.merge.h0.e) linkedList.get(0)).g();
        int max = Math.max(((com.github.catvod.spider.merge.h0.e) linkedList.get(1)).f().intValue() - 1, 0);
        if (linkedList.get(2) != null) {
            return new com.github.catvod.spider.merge.h0.e(com.github.catvod.spider.merge.U.h.j(g, max, Math.max(Math.min(((com.github.catvod.spider.merge.h0.e) linkedList.get(2)).f().intValue() + max, g.length()), 0)));
        }
        return new com.github.catvod.spider.merge.h0.e(com.github.catvod.spider.merge.U.h.i(g, max));
    }
}
