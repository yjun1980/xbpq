package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0101v extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0101v() {
        super(cYh.d("263635342512023125"), 5, null);
    }

    private boolean e(O o, C0062b c0062b) {
        c0062b.f(cYh.d("053F2528"));
        c0062b.o(true);
        return c0062b.c(o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        C0103w c0103w = A.i;
        if (A.a(o)) {
            c0062b.E((H) o);
            return true;
        }
        if (o.b()) {
            c0062b.F((I) o);
            return true;
        }
        if (o.c()) {
            c0062b.n(this);
            return true;
        }
        if (o.f()) {
            M m = (M) o;
            String str = m.c;
            if (str.equals(cYh.d("0F242C3D"))) {
                return c0062b.X(o, c0103w);
            }
            if (str.equals(cYh.d("053F2528"))) {
                c0062b.D(m);
                c0062b.o(false);
                c0062b.j0(c0103w);
                return true;
            }
            if (str.equals(cYh.d("0122203C32290224"))) {
                c0062b.D(m);
                c0062b.j0(A.u);
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(str, C0109z.g)) {
                c0062b.n(this);
                com.github.catvod.spider.merge.c0.l u = c0062b.u();
                c0062b.e.add(u);
                c0062b.X(o, A.f);
                c0062b.c0(u);
                return true;
            }
            if (str.equals(cYh.d("0F352035"))) {
                c0062b.n(this);
                return false;
            }
        } else if (o.e() && !com.github.catvod.spider.merge.b0.b.b(((L) o).c, C0109z.d)) {
            c0062b.n(this);
            return false;
        }
        e(o, c0062b);
        return true;
    }
}
