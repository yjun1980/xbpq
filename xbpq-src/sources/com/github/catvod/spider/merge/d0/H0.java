package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum H0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public H0() {
        super(cYh.d("243F2C3C323413152F35133B1438"), 47, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        G0 g0 = h1.W;
        char e = c0060a.e();
        if (e != 0) {
            if (e == '-') {
                h1Var = h1.Y;
            } else if (e != 65535) {
                I i = q.n;
                i.i('-');
                i.i(e);
            } else {
                q.p(this);
                q.m();
                h1Var = h1.c;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        I i2 = q.n;
        i2.i('-');
        i2.i((char) 65533);
        q.u(g0);
    }
}
