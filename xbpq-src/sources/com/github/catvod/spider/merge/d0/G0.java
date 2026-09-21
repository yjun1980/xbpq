package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum G0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public G0() {
        super(cYh.d("243F2C3C323413"), 46, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        char s = c0060a.s();
        if (s == 0) {
            q.q(this);
            c0060a.a();
            q.n.i((char) 65533);
        } else if (s == '-') {
            q.a(h1.X);
        } else {
            if (s != 65535) {
                q.n.j(c0060a.p('-', 0));
                return;
            }
            q.p(this);
            q.m();
            q.u(h1.c);
        }
    }
}
