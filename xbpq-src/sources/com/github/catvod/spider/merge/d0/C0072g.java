package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0072g extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0072g() {
        super(cYh.d("2E3E133E20"), 13, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        A a = A.o;
        A a2 = A.k;
        boolean f = o.f();
        String d = cYh.d("1322");
        if (f) {
            M m = (M) o;
            String str = m.c;
            if (str.equals(cYh.d("13352C213B3B1335"))) {
                c0062b.D(m);
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(str, C0109z.x)) {
                c0062b.m();
                c0062b.D(m);
                c0062b.j0(A.q);
                c0062b.J();
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(str, C0109z.F)) {
                if (c0062b.d(d)) {
                    return c0062b.c(o);
                }
                return false;
            }
            return c0062b.X(o, a2);
        }
        if (!o.e()) {
            return c0062b.X(o, a2);
        }
        String str2 = ((L) o).c;
        if (str2.equals(d)) {
            if (!c0062b.B(str2)) {
                c0062b.n(this);
                return false;
            }
        } else {
            if (str2.equals(cYh.d("1331233D32"))) {
                if (c0062b.d(d)) {
                    return c0062b.c(o);
                }
                return false;
            }
            if (!com.github.catvod.spider.merge.b0.b.b(str2, C0109z.u)) {
                if (!com.github.catvod.spider.merge.b0.b.b(str2, C0109z.G)) {
                    return c0062b.X(o, a2);
                }
                c0062b.n(this);
                return false;
            }
            if (!c0062b.B(str2) || !c0062b.B(d)) {
                c0062b.n(this);
                return false;
            }
        }
        c0062b.m();
        c0062b.U();
        c0062b.j0(a);
        return true;
    }
}
