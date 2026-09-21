package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0071f0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0071f0() {
        super(cYh.d("34333338272E2331353012290431313433"), 21, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        if (c0060a.t()) {
            q.p(this);
            q.u(h1.c);
            return;
        }
        char s = c0060a.s();
        if (s == 0) {
            q.q(this);
            c0060a.a();
            q.i((char) 65533);
            return;
        }
        if (s == '-') {
            q.i('-');
            h1Var = h1.y;
        } else {
            if (s != '<') {
                q.k(c0060a.p('-', '<', 0));
                return;
            }
            h1Var = h1.A;
        }
        q.a(h1Var);
    }
}
