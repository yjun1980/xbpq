package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum D0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public D0() {
        super(cYh.d("2A31333A222A2335223D36280624283E391517352F"), 43, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        if (c0060a.w(cYh.d("4A7D"))) {
            q.n.g();
            h1Var = h1.U;
        } else if (c0060a.x(cYh.d("231F02050E0A22"))) {
            h1Var = h1.a0;
        } else {
            if (!c0060a.w(cYh.d("3C130510031B3C"))) {
                q.q(this);
                q.e();
                q.a(h1.S);
                return;
            }
            q.h();
            h1Var = h1.q0;
        }
        q.u(h1Var);
    }
}
