package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public enum B0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public B0() {
        super(cYh.d("34352D3714360823283F300913313325033B00"), 41, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        C0065c0 c0065c0 = h1.c;
        char e = c0060a.e();
        if (e == '>') {
            q.i.i = true;
            q.o();
        } else {
            if (e != 65535) {
                c0060a.G();
                q.q(this);
                q.u(h1.J);
                return;
            }
            q.p(this);
        }
        q.u(c0065c0);
    }
}
