package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0075h0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0075h0() {
        super(cYh.d("34333338272E23313530122904313134331E0623291536290F"), 23, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        C0071f0 c0071f0 = h1.x;
        if (c0060a.t()) {
            q.p(this);
            q.u(h1.c);
            return;
        }
        char e = c0060a.e();
        if (e != 0) {
            if (e == '-') {
                q.i(e);
                return;
            }
            if (e != '<') {
                q.i(e);
                if (e == '>') {
                    h1Var = h1.h;
                }
            } else {
                h1Var = h1.A;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        q.i((char) 65533);
        q.u(c0071f0);
    }
}
