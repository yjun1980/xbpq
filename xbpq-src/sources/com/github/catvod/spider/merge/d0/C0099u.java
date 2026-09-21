package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0099u extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0099u() {
        super(cYh.d("2E3E0934363E293F323225331724"), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        H h;
        C0097t c0097t = A.f;
        if (o.c()) {
            c0062b.n(this);
        } else {
            if (o.f() && ((M) o).c.equals(cYh.d("0F242C3D"))) {
                return c0062b.X(o, A.i);
            }
            if (!o.e() || !((L) o).c.equals(cYh.d("093F323225331724"))) {
                if (!A.a(o) && !o.b() && (!o.f() || !com.github.catvod.spider.merge.b0.b.b(((M) o).c, C0109z.f))) {
                    if (o.e() && ((L) o).c.equals(cYh.d("0522"))) {
                        c0062b.n(this);
                        h = new H();
                    } else {
                        if ((o.f() && com.github.catvod.spider.merge.b0.b.b(((M) o).c, C0109z.K)) || o.e()) {
                            c0062b.n(this);
                            return false;
                        }
                        c0062b.n(this);
                        h = new H();
                    }
                    h.i(o.toString());
                    c0062b.E(h);
                    return true;
                }
                return c0062b.X(o, c0097t);
            }
            c0062b.U();
            c0062b.j0(c0097t);
        }
        return true;
    }
}
