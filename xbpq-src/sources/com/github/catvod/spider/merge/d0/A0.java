package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum A0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public A0() {
        super(cYh.d("26363534251B13243338352F133517303B2F020F3024382E0234"), 40, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        C0065c0 c0065c0 = h1.c;
        C0096s0 c0096s0 = h1.J;
        char e = c0060a.e();
        if (e != '\t' && e != '\n' && e != '\f' && e != '\r' && e != ' ') {
            if (e == '/') {
                q.u(h1.R);
                return;
            }
            if (e == '>') {
                q.o();
            } else if (e != 65535) {
                c0060a.G();
                q.q(this);
            } else {
                q.p(this);
            }
            q.u(c0065c0);
            return;
        }
        q.u(c0096s0);
    }
}
