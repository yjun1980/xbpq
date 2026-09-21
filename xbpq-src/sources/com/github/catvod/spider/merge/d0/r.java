package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
enum r extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r() {
        super(cYh.d("2535273E253F2F242C3D"), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        C0095s c0095s = A.e;
        if (o.c()) {
            c0062b.n(this);
            return false;
        }
        if (o.b()) {
            c0062b.F((I) o);
            return true;
        }
        if (A.a(o)) {
            c0062b.E((H) o);
            return true;
        }
        boolean f = o.f();
        String d = cYh.d("0F242C3D");
        if (f) {
            M m = (M) o;
            if (m.c.equals(d)) {
                c0062b.D(m);
                c0062b.j0(c0095s);
                return true;
            }
        }
        if (!(o.e() && com.github.catvod.spider.merge.b0.b.b(((L) o).c, C0109z.e)) && o.e()) {
            c0062b.n(this);
            return false;
        }
        c0062b.L(d);
        c0062b.j0(c0095s);
        return c0062b.c(o);
    }
}
