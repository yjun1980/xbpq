package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements com.github.catvod.spider.merge.h0.b {
    @Override // com.github.catvod.spider.merge.h0.b
    public final String a() {
        return cYh.d("043F2F32362E");
    }

    @Override // com.github.catvod.spider.merge.h0.b
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar, List<com.github.catvod.spider.merge.h0.e> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<com.github.catvod.spider.merge.h0.e> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().g());
        }
        return new com.github.catvod.spider.merge.h0.e(sb.toString());
    }
}
