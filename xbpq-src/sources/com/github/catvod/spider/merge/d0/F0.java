package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum F0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public F0() {
        super(cYh.d("243F2C3C323413033530252E23313239"), 45, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        C0065c0 c0065c0 = h1.c;
        G0 g0 = h1.W;
        char e = c0060a.e();
        if (e != 0) {
            if (e == '-') {
                q.u(h1.V);
                return;
            }
            if (e == '>') {
                q.q(this);
            } else if (e != 65535) {
                q.n.i(e);
            } else {
                q.p(this);
            }
            q.m();
            q.u(c0065c0);
            return;
        }
        q.q(this);
        q.n.i((char) 65533);
        q.u(g0);
    }
}
