package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.cYh;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements com.github.catvod.spider.merge.h0.b {
    @Override // com.github.catvod.spider.merge.h0.b
    public final String a() {
        return cYh.d("14243338393D4A3C243F302E0F");
    }

    @Override // com.github.catvod.spider.merge.h0.b
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar, List<com.github.catvod.spider.merge.h0.e> list) {
        LinkedList linkedList = (LinkedList) list;
        if (linkedList.size() == 0) {
            return new com.github.catvod.spider.merge.h0.e(0);
        }
        return new com.github.catvod.spider.merge.h0.e(Integer.valueOf(((com.github.catvod.spider.merge.h0.e) linkedList.get(0)).g().length()));
    }
}
