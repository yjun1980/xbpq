package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0098t0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0098t0() {
        super(cYh.d("262435233E381224241F363702"), 34, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0038. Please report as an issue. */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        N n;
        h1 h1Var;
        C0065c0 c0065c0 = h1.c;
        q.i.j(c0060a.q(h1.r0));
        char e = c0060a.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '\"' && e != '\'') {
                    if (e != '/') {
                        if (e == 65535) {
                            q.p(this);
                        } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                            switch (e) {
                                case '<':
                                    break;
                                case '=':
                                    h1Var = h1.M;
                                    break;
                                case '>':
                                    q.o();
                                    break;
                                default:
                                    n = q.i;
                                    break;
                            }
                        }
                        q.u(c0065c0);
                        return;
                    }
                    h1Var = h1.R;
                    q.u(h1Var);
                    return;
                }
                q.q(this);
                n = q.i;
            }
            h1Var = h1.L;
            q.u(h1Var);
            return;
        }
        q.q(this);
        n = q.i;
        e = 65533;
        n.i(e);
    }
}
