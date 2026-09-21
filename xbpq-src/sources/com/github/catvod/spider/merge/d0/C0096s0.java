package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0096s0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0096s0() {
        super(cYh.d("2535273E253F262435233E381224241F363702"), 33, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x002f. Please report as an issue. */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        C0065c0 c0065c0 = h1.c;
        C0098t0 c0098t0 = h1.K;
        char e = c0060a.e();
        if (e == 0) {
            c0060a.G();
            q.q(this);
            q.i.u();
        } else {
            if (e == ' ') {
                return;
            }
            if (e != '\"' && e != '\'') {
                if (e == '/') {
                    q.u(h1.R);
                    return;
                }
                if (e == 65535) {
                    q.p(this);
                } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                    switch (e) {
                        case '<':
                            c0060a.G();
                            q.q(this);
                            q.o();
                            break;
                        case '=':
                            break;
                        case '>':
                            q.o();
                            break;
                        default:
                            q.i.u();
                            c0060a.G();
                            break;
                    }
                } else {
                    return;
                }
                q.u(c0065c0);
                return;
            }
            q.q(this);
            q.i.u();
            q.i.i(e);
        }
        q.u(c0098t0);
    }
}
