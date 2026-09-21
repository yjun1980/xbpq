package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.util.Locale;

/* loaded from: classes.dex */
enum T extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public T() {
        super(cYh.d("35332530233B2B3532222332063E12383034"), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        if (c0060a.y('/')) {
            q.h();
            q.a(h1.n);
            return;
        }
        if (c0060a.C() && q.b() != null) {
            StringBuilder b = C0059d.b(cYh.d("5B7F"));
            b.append(q.b());
            String sb = b.toString();
            Locale locale = Locale.ENGLISH;
            if (!(c0060a.D(sb.toLowerCase(locale)) > -1 || c0060a.D(sb.toUpperCase(locale)) > -1)) {
                N g = q.g(false);
                g.s(q.b());
                q.i = g;
                q.o();
                h1Var = h1.j;
                q.u(h1Var);
            }
        }
        q.k(cYh.d("5B"));
        h1Var = h1.e;
        q.u(h1Var);
    }
}
