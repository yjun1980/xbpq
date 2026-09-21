package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0086n extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0086n() {
        super(cYh.d("26363534251C15312C34243F13"), 19, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        A a;
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
            return false;
        }
        boolean f = o.f();
        String d = cYh.d("0F242C3D");
        if (f && ((M) o).c.equals(d)) {
            a = A.i;
        } else {
            if (o.e() && ((L) o).c.equals(d)) {
                c0062b.j0(A.x);
                return true;
            }
            if (!o.f() || !((M) o).c.equals(cYh.d("093F272336370223"))) {
                if (o.d()) {
                    return true;
                }
                c0062b.n(this);
                return false;
            }
            a = A.f;
        }
        return c0062b.X(o, a);
    }
}
