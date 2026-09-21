package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum V extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public V() {
        super(cYh.d("35130510031B223E2505363D29312C34"), 12, null);
    }

    private void h(Q q, C0060a c0060a) {
        q.k(cYh.d("5B7F"));
        q.l(q.h);
        c0060a.G();
        q.u(h1.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        if (c0060a.C()) {
            String j = c0060a.j();
            q.i.o(j);
            q.h.append(j);
            return;
        }
        char e = c0060a.e();
        if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
            if (q.s()) {
                h1Var = h1.J;
                q.u(h1Var);
                return;
            }
            h(q, c0060a);
        }
        if (e == '/') {
            if (q.s()) {
                h1Var = h1.R;
                q.u(h1Var);
                return;
            }
            h(q, c0060a);
        }
        if (e == '>' && q.s()) {
            q.o();
            h1Var = h1.c;
            q.u(h1Var);
            return;
        }
        h(q, c0060a);
    }
}
