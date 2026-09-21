package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0102v0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0102v0() {
        super(cYh.d("2535273E253F262435233E381224240736361235"), 36, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        C0065c0 c0065c0 = h1.c;
        C0110z0 c0110z0 = h1.P;
        char e = c0060a.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '\"') {
                    if (e != '`') {
                        if (e == 65535) {
                            q.p(this);
                        } else {
                            if (e == '\t' || e == '\n' || e == '\f' || e == '\r') {
                                return;
                            }
                            if (e != '&') {
                                if (e != '\'') {
                                    switch (e) {
                                        case '>':
                                            q.q(this);
                                            break;
                                    }
                                } else {
                                    h1Var = h1.O;
                                }
                            }
                            c0060a.G();
                        }
                        q.o();
                        q.u(c0065c0);
                        return;
                    }
                    q.q(this);
                    q.i.k(e);
                } else {
                    h1Var = h1.N;
                }
                q.u(h1Var);
                return;
            }
            return;
        }
        q.q(this);
        q.i.k((char) 65533);
        q.u(c0110z0);
    }
}
