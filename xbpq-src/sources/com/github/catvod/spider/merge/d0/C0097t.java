package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0167a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0097t extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0097t() {
        super(cYh.d("2E3E0934363E"), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        A a;
        C0105x c0105x = A.j;
        if (A.a(o)) {
            c0062b.E((H) o);
            return true;
        }
        int a2 = C0167a.a(o.a);
        if (a2 == 0) {
            c0062b.n(this);
            return false;
        }
        String d = cYh.d("0F352035");
        if (a2 == 1) {
            M m = (M) o;
            String str = m.c;
            if (str.equals(cYh.d("0F242C3D"))) {
                return A.i.d(o, c0062b);
            }
            if (com.github.catvod.spider.merge.b0.b.b(str, C0109z.a)) {
                com.github.catvod.spider.merge.c0.l G = c0062b.G(m);
                if (str.equals(cYh.d("05313234")) && G.o(cYh.d("0F222437"))) {
                    c0062b.Q(G);
                }
            } else if (str.equals(cYh.d("0A353530"))) {
                c0062b.G(m);
            } else if (str.equals(cYh.d("1339353D32"))) {
                c0062b.c.u(h1.e);
                c0062b.P();
                c0062b.j0(c0105x);
                c0062b.D(m);
            } else if (com.github.catvod.spider.merge.b0.b.b(str, C0109z.b)) {
                A.b(m, c0062b);
            } else if (str.equals(cYh.d("093F323225331724"))) {
                c0062b.D(m);
                a = A.g;
                c0062b.j0(a);
            } else {
                if (!str.equals(cYh.d("14333338272E"))) {
                    if (str.equals(d)) {
                        c0062b.n(this);
                        return false;
                    }
                    c0062b.d(d);
                    return c0062b.c(o);
                }
                c0062b.c.u(h1.h);
                c0062b.P();
                c0062b.j0(c0105x);
                c0062b.D(m);
            }
        } else if (a2 == 2) {
            String str2 = ((L) o).c;
            if (!str2.equals(d)) {
                if (com.github.catvod.spider.merge.b0.b.b(str2, C0109z.c)) {
                    c0062b.d(d);
                    return c0062b.c(o);
                }
                c0062b.n(this);
                return false;
            }
            c0062b.U();
            a = A.h;
            c0062b.j0(a);
        } else {
            if (a2 != 3) {
                c0062b.d(d);
                return c0062b.c(o);
            }
            c0062b.F((I) o);
        }
        return true;
    }
}
