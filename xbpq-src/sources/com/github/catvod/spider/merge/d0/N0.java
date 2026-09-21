package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum N0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public N0() {
        super(cYh.d("233F22252E2A021E203C32"), 52, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        StringBuilder sb;
        C0065c0 c0065c0 = h1.c;
        if (c0060a.C()) {
            q.m.b.append(c0060a.j());
            return;
        }
        char e = c0060a.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '>') {
                    if (e == 65535) {
                        q.p(this);
                        q.m.f = true;
                    } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                        sb = q.m.b;
                    }
                }
                q.n();
                q.u(c0065c0);
                return;
            }
            q.u(h1.d0);
            return;
        }
        q.q(this);
        sb = q.m.b;
        e = 65533;
        sb.append(e);
    }
}
