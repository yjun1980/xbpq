package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum Z extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Z() {
        super(cYh.d("34333338272E233135301B3F1423353936343439263F"), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        char e = c0060a.e();
        if (e == '!') {
            q.k(cYh.d("5B71"));
            h1Var = h1.v;
        } else if (e != '/') {
            q.k(cYh.d("5B"));
            if (e != 65535) {
                c0060a.G();
                h1Var = h1.h;
            } else {
                q.p(this);
                h1Var = h1.c;
            }
        } else {
            q.h();
            h1Var = h1.t;
        }
        q.u(h1Var);
    }
}
