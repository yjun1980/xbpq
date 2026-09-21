package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0080k extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0080k() {
        super(cYh.d("263635342518083438"), 17, null);
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
            return false;
        }
        boolean f = o.f();
        String d = cYh.d("0F242C3D");
        if (f && ((M) o).c.equals(d)) {
            return c0062b.X(o, c0103w);
        }
        if (o.e() && ((L) o).c.equals(d)) {
            c0062b.getClass();
            c0062b.j0(A.w);
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
