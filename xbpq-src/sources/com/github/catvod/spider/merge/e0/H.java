package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;

/* loaded from: classes.dex */
public class H extends AbstractC0135t {
    public H(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.e0.AbstractC0135t
    protected final int b(com.github.catvod.spider.merge.c0.l lVar) {
        int i = 0;
        if (lVar.f0() == null) {
            return 0;
        }
        Iterator<com.github.catvod.spider.merge.c0.l> it = lVar.f0().R().iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            if (next.m0().equals(lVar.m0())) {
                i++;
            }
            if (next == lVar) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.e0.AbstractC0135t
    protected final String c() {
        return cYh.d("0924297C383C4A24382132");
    }
}
