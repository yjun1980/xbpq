package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0110z0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0110z0() {
        super(cYh.d("262435233E3812242407363612351E24392B123F353433"), 39, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0042. Please report as an issue. */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        N n;
        C0065c0 c0065c0 = h1.c;
        String q2 = c0060a.q(h1.s0);
        if (q2.length() > 0) {
            q.i.l(q2);
        }
        char e = c0060a.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '\"' && e != '`') {
                    if (e == 65535) {
                        q.p(this);
                    } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                        if (e == '&') {
                            int[] d = q.d('>', true);
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
                            switch (e) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    q.o();
                                    break;
                                default:
                                    n = q.i;
                                    break;
                            }
                        }
                    }
                    q.u(c0065c0);
                    return;
                }
                q.q(this);
                n = q.i;
            }
            q.u(h1.J);
            return;
        }
        q.q(this);
        n = q.i;
        e = 65533;
        n.k(e);
    }
}
