package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum R0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public R0() {
        super(cYh.d("233F22252E2A020034333B3304192534392E0E3628342505033F34333B3F36252E25323E"), 56, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        StringBuilder sb;
        C0065c0 c0065c0 = h1.c;
        char e = c0060a.e();
        if (e != 0) {
            if (e == '\"') {
                q.u(h1.i0);
                return;
            }
            if (e == '>') {
                q.q(this);
            } else if (e != 65535) {
                sb = q.m.d;
            } else {
                q.p(this);
            }
            q.m.f = true;
            q.n();
            q.u(c0065c0);
            return;
        }
        q.q(this);
        sb = q.m.d;
        e = 65533;
        sb.append(e);
    }
}
