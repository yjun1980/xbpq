package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0085m0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0085m0() {
        super(cYh.d("34333338272E23313530133512322D3412290431313433"), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        char s = c0060a.s();
        if (s == 0) {
            q.q(this);
            c0060a.a();
            q.i((char) 65533);
            return;
        }
        if (s == '-') {
            q.i(s);
            h1Var = h1.F;
        } else {
            if (s != '<') {
                if (s != 65535) {
                    q.k(c0060a.p('-', '<', 0));
                    return;
                } else {
                    q.p(this);
                    q.u(h1.c);
                    return;
                }
            }
            q.i(s);
            h1Var = h1.H;
        }
        q.a(h1Var);
    }
}
