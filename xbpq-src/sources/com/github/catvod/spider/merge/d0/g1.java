package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum g1 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g1() {
        super(cYh.d("223E2505363D2820243F"), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        C0065c0 c0065c0 = h1.c;
        if (c0060a.t()) {
            q.p(this);
            q.k(cYh.d("5B7F"));
            q.u(c0065c0);
        } else {
            if (c0060a.C()) {
                q.g(false);
                q.u(h1.l);
                return;
            }
            boolean y = c0060a.y('>');
            q.q(this);
            if (y) {
                q.a(c0065c0);
            } else {
                q.e();
                q.a(h1.S);
            }
        }
    }
}
