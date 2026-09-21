package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0107y extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0107y() {
        super(cYh.d("2E3E1530353602"), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        A a;
        if (o.a()) {
            c0062b.R();
            c0062b.P();
            c0062b.j0(A.l);
            return c0062b.c(o);
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
        String d = cYh.d("1331233D32");
        if (!f) {
            if (!o.e()) {
                if (!o.d()) {
                    return e(o, c0062b);
                }
                if (c0062b.a().d0().equals(cYh.d("0F242C3D"))) {
                    c0062b.n(this);
                }
                return true;
            }
            String str = ((L) o).c;
            if (!str.equals(d)) {
                if (!com.github.catvod.spider.merge.b0.b.b(str, C0109z.B)) {
                    return e(o, c0062b);
                }
                c0062b.n(this);
                return false;
            }
            if (!c0062b.B(str)) {
                c0062b.n(this);
                return false;
            }
            c0062b.V(d);
            c0062b.e0();
            return true;
        }
        M m = (M) o;
        String str2 = m.c;
        if (str2.equals(cYh.d("043131253E3509"))) {
            c0062b.l();
            c0062b.J();
            c0062b.D(m);
            a = A.m;
        } else {
            String d2 = cYh.d("043F2D3625351220");
            if (str2.equals(d2)) {
                c0062b.l();
                c0062b.D(m);
                a = A.n;
            } else {
                if (str2.equals(cYh.d("043F2D"))) {
                    c0062b.f(d2);
                    return c0062b.c(o);
                }
                if (!com.github.catvod.spider.merge.b0.b.b(str2, C0109z.u)) {
                    if (com.github.catvod.spider.merge.b0.b.b(str2, C0109z.v)) {
                        c0062b.f(cYh.d("13322E352E"));
                        return c0062b.c(o);
                    }
                    if (str2.equals(d)) {
                        c0062b.n(this);
                        if (c0062b.d(d)) {
                            return c0062b.c(o);
                        }
                    } else {
                        if (com.github.catvod.spider.merge.b0.b.b(str2, C0109z.w)) {
                            return c0062b.X(o, A.f);
                        }
                        if (str2.equals(cYh.d("0E3E312423"))) {
                            if (!m.r() || !m.j.j(cYh.d("13293134")).equalsIgnoreCase(cYh.d("0F3925353234"))) {
                                return e(o, c0062b);
                            }
                            c0062b.G(m);
                        } else {
                            if (!str2.equals(cYh.d("013F333C"))) {
                                return e(o, c0062b);
                            }
                            c0062b.n(this);
                            if (c0062b.s() != null) {
                                return false;
                            }
                            c0062b.H(m, false);
                        }
                    }
                    return true;
                }
                c0062b.l();
                c0062b.D(m);
                a = A.o;
            }
        }
        c0062b.j0(a);
        return true;
    }

    final boolean e(O o, C0062b c0062b) {
        C0103w c0103w = A.i;
        c0062b.n(this);
        if (!com.github.catvod.spider.merge.b0.b.b(c0062b.a().d0(), C0109z.C)) {
            return c0062b.X(o, c0103w);
        }
        c0062b.g0(true);
        boolean X = c0062b.X(o, c0103w);
        c0062b.g0(false);
        return X;
    }
}
