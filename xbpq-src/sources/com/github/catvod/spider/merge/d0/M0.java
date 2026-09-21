package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum M0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public M0() {
        super(cYh.d("2535273E253F233F22252E2A021E203C32"), 51, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        N0 n0 = h1.c0;
        if (c0060a.C()) {
            q.f();
            q.u(n0);
            return;
        }
        char e = c0060a.e();
        if (e == 0) {
            q.q(this);
            q.f();
            q.m.b.append((char) 65533);
        } else {
            if (e == ' ') {
                return;
            }
            if (e == 65535) {
                q.p(this);
                q.f();
                q.m.f = true;
                q.n();
                q.u(h1.c);
                return;
            }
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r') {
                return;
            }
            q.f();
            q.m.b.append(e);
        }
        q.u(n0);
    }
}
