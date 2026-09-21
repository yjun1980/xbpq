package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.cYh;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements com.github.catvod.spider.merge.h0.b {
    @Override // com.github.catvod.spider.merge.h0.b
    public final String a() {
        return cYh.d("1424202323294A2728253F");
    }

    @Override // com.github.catvod.spider.merge.h0.b
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar, List<com.github.catvod.spider.merge.h0.e> list) {
        LinkedList linkedList = (LinkedList) list;
        return new com.github.catvod.spider.merge.h0.e(Boolean.valueOf(((com.github.catvod.spider.merge.h0.e) linkedList.get(0)).g().startsWith(((com.github.catvod.spider.merge.h0.e) linkedList.get(1)).g())));
    }
}
