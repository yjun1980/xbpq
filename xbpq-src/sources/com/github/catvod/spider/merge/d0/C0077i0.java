package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0077i0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0077i0() {
        super(cYh.d("34333338272E233135301229043131343316022332253F3B0903283639"), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        if (c0060a.C()) {
            q.h();
            q.h.append(c0060a.s());
            q.k(cYh.d("5B"));
            q.i(c0060a.s());
            h1Var = h1.D;
        } else if (!c0060a.y('/')) {
            q.i('<');
            q.u(h1.x);
            return;
        } else {
            q.h();
            h1Var = h1.B;
        }
        q.a(h1Var);
    }
}
