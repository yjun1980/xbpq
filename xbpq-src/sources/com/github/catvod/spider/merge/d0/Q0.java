package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum Q0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Q0() {
        super(cYh.d("2535273E253F233F22252E2A020034333B3304192534392E0E36283425"), 55, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        C0065c0 c0065c0 = h1.c;
        char e = c0060a.e();
        if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
            return;
        }
        if (e == '\"') {
            h1Var = h1.g0;
        } else {
            if (e != '\'') {
                if (e == '>') {
                    q.q(this);
                } else if (e != 65535) {
                    q.q(this);
                    q.m.f = true;
                    h1Var = h1.p0;
                } else {
                    q.p(this);
                }
                q.m.f = true;
                q.n();
                q.u(c0065c0);
                return;
            }
            h1Var = h1.h0;
        }
        q.u(h1Var);
    }
}
