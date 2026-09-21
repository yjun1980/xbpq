package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0167a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0070f extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0070f() {
        super(cYh.d("2E3E1530353602122E352E"), 12, null);
    }

    private boolean e(O o, C0062b c0062b) {
        if (!c0062b.B(cYh.d("13322E352E")) && !c0062b.B(cYh.d("1338243033")) && !c0062b.x(cYh.d("13362E3E23"), null)) {
            c0062b.n(this);
            return false;
        }
        c0062b.k();
        c0062b.d(c0062b.a().d0());
        return c0062b.c(o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        A a = A.k;
        int a2 = C0167a.a(o.a);
        if (a2 == 1) {
            M m = (M) o;
            String str = m.c;
            if (str.equals(cYh.d("13352C213B3B1335"))) {
                c0062b.D(m);
            } else {
                String d = cYh.d("1322");
                if (!str.equals(d)) {
                    if (!com.github.catvod.spider.merge.b0.b.b(str, C0109z.x)) {
                        return com.github.catvod.spider.merge.b0.b.b(str, C0109z.D) ? e(o, c0062b) : c0062b.X(o, a);
                    }
                    c0062b.n(this);
                    c0062b.f(d);
                    return c0062b.c(m);
                }
                c0062b.k();
                c0062b.D(m);
                c0062b.j0(A.p);
            }
        } else {
            if (a2 != 2) {
                return c0062b.X(o, a);
            }
            String str2 = ((L) o).c;
            if (!com.github.catvod.spider.merge.b0.b.b(str2, C0109z.J)) {
                if (str2.equals(cYh.d("1331233D32"))) {
                    return e(o, c0062b);
                }
                if (!com.github.catvod.spider.merge.b0.b.b(str2, C0109z.E)) {
                    return c0062b.X(o, a);
                }
                c0062b.n(this);
                return false;
            }
            if (!c0062b.B(str2)) {
                c0062b.n(this);
                return false;
            }
            c0062b.k();
            c0062b.U();
            c0062b.j0(a);
        }
        return true;
    }
}
