package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum S extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public S() {
        super(cYh.d("3331261F363702"), 9, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        String str;
        h1 h1Var;
        C0065c0 c0065c0 = h1.c;
        q.i.o(c0060a.m());
        char e = c0060a.e();
        if (e == 0) {
            N n = q.i;
            str = h1.t0;
            n.o(str);
            return;
        }
        if (e != ' ') {
            if (e == '/') {
                h1Var = h1.R;
                q.u(h1Var);
            }
            if (e == '<') {
                c0060a.G();
                q.q(this);
            } else if (e != '>') {
                if (e == 65535) {
                    q.p(this);
                    q.u(c0065c0);
                    return;
                } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                    q.i.n(e);
                    return;
                }
            }
            q.o();
            q.u(c0065c0);
            return;
        }
        h1Var = h1.J;
        q.u(h1Var);
    }
}
