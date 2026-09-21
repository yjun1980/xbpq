package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0091p0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0091p0() {
        super(cYh.d("34333338272E23313530133512322D34122904313134331E0623291536290F"), 30, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        C0085m0 c0085m0 = h1.E;
        char e = c0060a.e();
        if (e != 0) {
            if (e == '-') {
                q.i(e);
                return;
            }
            if (e == '<') {
                q.i(e);
                h1Var = h1.H;
            } else if (e == '>') {
                q.i(e);
                h1Var = h1.h;
            } else if (e == 65535) {
                q.p(this);
                h1Var = h1.c;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        e = 65533;
        q.i(e);
        q.u(c0085m0);
    }
}
