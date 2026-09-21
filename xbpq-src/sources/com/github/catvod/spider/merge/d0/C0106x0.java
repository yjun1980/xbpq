package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0106x0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0106x0() {
        super(cYh.d("262435233E3812242407363612351E223E34003C24002235133525"), 38, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        N n;
        h1 h1Var;
        String f = c0060a.f(true);
        if (f.length() > 0) {
            q.i.l(f);
        } else {
            q.i.w();
        }
        char e = c0060a.e();
        if (e != 0) {
            if (e == 65535) {
                q.p(this);
                h1Var = h1.c;
            } else {
                if (e == '&') {
                    int[] d = q.d('\'', true);
                    N n2 = q.i;
                    if (d != null) {
                        n2.m(d);
                        return;
                    } else {
                        n2.k('&');
                        return;
                    }
                }
                if (e != '\'') {
                    n = q.i;
                } else {
                    h1Var = h1.Q;
                }
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        n = q.i;
        e = 65533;
        n.k(e);
    }
}
