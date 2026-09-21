package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0088o extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0088o() {
        super(cYh.d("26363534251B0124242315350329"), 20, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        C0103w c0103w = A.i;
        if (o.b()) {
            c0062b.F((I) o);
            return true;
        }
        if (!o.c()) {
            boolean f = o.f();
            String d = cYh.d("0F242C3D");
            if (!f || !((M) o).c.equals(d)) {
                if (A.a(o)) {
                    com.github.catvod.spider.merge.c0.l V = c0062b.V(d);
                    c0062b.E((H) o);
                    c0062b.e.add(V);
                    c0062b.e.add(V.k0(cYh.d("053F2528")));
                    return true;
                }
                if (o.d()) {
                    return true;
                }
                c0062b.n(this);
                c0062b.j0(c0103w);
                return c0062b.c(o);
            }
        }
        return c0062b.X(o, c0103w);
    }
}
