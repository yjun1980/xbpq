package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum K0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public K0() {
        super(cYh.d("243F2C3C323413152F35153B0937"), 49, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        C0065c0 c0065c0 = h1.c;
        G0 g0 = h1.W;
        char e = c0060a.e();
        String d = cYh.d("4A7D60");
        if (e != 0) {
            if (e == '-') {
                q.n.j(d);
                q.u(h1.X);
                return;
            }
            if (e != '>') {
                if (e != 65535) {
                    I i = q.n;
                    i.j(d);
                    i.i(e);
                } else {
                    q.p(this);
                }
            }
            q.m();
            q.u(c0065c0);
            return;
        }
        q.q(this);
        I i2 = q.n;
        i2.j(d);
        i2.i((char) 65533);
        q.u(g0);
    }
}
