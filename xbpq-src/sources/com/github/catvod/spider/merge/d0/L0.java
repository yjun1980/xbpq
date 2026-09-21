package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum L0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public L0() {
        super(cYh.d("233F22252E2A02"), 50, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        M0 m0 = h1.b0;
        char e = c0060a.e();
        if (e != '\t' && e != '\n' && e != '\f' && e != '\r' && e != ' ') {
            if (e != '>') {
                if (e != 65535) {
                    q.q(this);
                } else {
                    q.p(this);
                }
            }
            q.q(this);
            q.f();
            q.m.f = true;
            q.n();
            q.u(h1.c);
            return;
        }
        q.u(m0);
    }
}
