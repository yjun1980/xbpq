package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum O0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public O0() {
        super(cYh.d("26363534251E08333528273F29312C34"), 53, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        C0065c0 c0065c0 = h1.c;
        if (c0060a.t()) {
            q.p(this);
            q.m.f = true;
            q.n();
            q.u(c0065c0);
            return;
        }
        if (c0060a.z('\t', '\n', '\r', '\f', ' ')) {
            c0060a.a();
            return;
        }
        if (c0060a.y('>')) {
            q.n();
            q.a(c0065c0);
            return;
        }
        String d = cYh.d("3705031D1E19");
        if (c0060a.x(d)) {
            q.m.c = d;
            h1Var = h1.e0;
        } else {
            String d2 = cYh.d("340912051217");
            if (!c0060a.x(d2)) {
                q.q(this);
                q.m.f = true;
                q.a(h1.p0);
                return;
            }
            q.m.c = d2;
            h1Var = h1.k0;
        }
        q.u(h1Var);
    }
}
