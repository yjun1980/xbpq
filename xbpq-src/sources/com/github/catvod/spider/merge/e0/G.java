package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public class G extends AbstractC0135t {
    public G(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.e0.AbstractC0135t
    protected final int b(com.github.catvod.spider.merge.c0.l lVar) {
        int i = 0;
        if (lVar.f0() == null) {
            return 0;
        }
        C0123g R = lVar.f0().R();
        for (int U = lVar.U(); U < R.size(); U++) {
            if (R.get(U).m0().equals(lVar.m0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.e0.AbstractC0135t
    protected final String c() {
        return cYh.d("0924297C3B3B14246C3E317713293134");
    }
}
