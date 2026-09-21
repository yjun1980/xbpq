package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum f1 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f1() {
        super(cYh.d("3331261E273F09"), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        h1 h1Var2;
        char s = c0060a.s();
        if (s == '!') {
            h1Var = h1.T;
        } else if (s == '/') {
            h1Var = h1.k;
        } else {
            if (s != '?') {
                if (c0060a.C()) {
                    q.g(true);
                    h1Var2 = h1.l;
                } else {
                    q.q(this);
                    q.i('<');
                    h1Var2 = h1.c;
                }
                q.u(h1Var2);
                return;
            }
            q.e();
            h1Var = h1.S;
        }
        q.a(h1Var);
    }
}
