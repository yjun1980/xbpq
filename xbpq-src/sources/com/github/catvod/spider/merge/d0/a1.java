package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum a1 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a1() {
        super(cYh.d("26363534251E08333528273F3429322532372E34243F233301392423"), 64, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        C0065c0 c0065c0 = h1.c;
        char e = c0060a.e();
        if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
            return;
        }
        if (e != '>') {
            if (e != 65535) {
                q.q(this);
                q.u(h1.p0);
                return;
            } else {
                q.p(this);
                q.m.f = true;
            }
        }
        q.n();
        q.u(c0065c0);
    }
}
