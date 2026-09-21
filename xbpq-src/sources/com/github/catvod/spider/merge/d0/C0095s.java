package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0095s extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0095s() {
        super(cYh.d("2535273E253F2F352035"), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
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
        if (o.f() && ((M) o).c.equals(cYh.d("0F242C3D"))) {
            return A.i.d(o, c0062b);
        }
        boolean f = o.f();
        String d = cYh.d("0F352035");
        if (f) {
            M m = (M) o;
            if (m.c.equals(d)) {
                c0062b.h0(c0062b.D(m));
                c0062b.j0(A.f);
                return true;
            }
        }
        if (o.e() && com.github.catvod.spider.merge.b0.b.b(((L) o).c, C0109z.e)) {
            c0062b.f(d);
            return c0062b.c(o);
        }
        if (o.e()) {
            c0062b.n(this);
            return false;
        }
        c0062b.f(d);
        return c0062b.c(o);
    }
}
