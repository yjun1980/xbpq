package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0100u0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0100u0() {
        super(cYh.d("26363534251B13243338352F13350F303A3F"), 35, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x002f. Please report as an issue. */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        C0065c0 c0065c0 = h1.c;
        C0098t0 c0098t0 = h1.K;
        char e = c0060a.e();
        if (e == 0) {
            q.q(this);
            q.i.i((char) 65533);
        } else {
            if (e == ' ') {
                return;
            }
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
                h1Var = h1.R;
                q.u(h1Var);
                return;
            }
            q.q(this);
            q.i.u();
            q.i.i(e);
        }
        q.u(c0098t0);
    }
}
