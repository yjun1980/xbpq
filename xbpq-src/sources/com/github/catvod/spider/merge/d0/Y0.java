package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum Y0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Y0() {
        super(cYh.d("233F22252E2A02033822233F0A192534392E0E3628342505033F34333B3F36252E25323E"), 62, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        StringBuilder sb;
        C0065c0 c0065c0 = h1.c;
        char e = c0060a.e();
        if (e != 0) {
            if (e == '\"') {
                q.u(h1.o0);
                return;
            }
            if (e == '>') {
                q.q(this);
            } else if (e != 65535) {
                sb = q.m.e;
            } else {
                q.p(this);
            }
            q.m.f = true;
            q.n();
            q.u(c0065c0);
            return;
        }
        q.q(this);
        sb = q.m.e;
        e = 65533;
        sb.append(e);
    }
}
