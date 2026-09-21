package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0167a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0068e extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0068e() {
        super(cYh.d("2E3E023E3B2F0A3E0623382F17"), 11, null);
    }

    private boolean e(O o, i1 i1Var) {
        if (i1Var.d(cYh.d("043F2D3625351220"))) {
            return i1Var.c(o);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        if (A.a(o)) {
            c0062b.E((H) o);
            return true;
        }
        int a = C0167a.a(o.a);
        if (a != 0) {
            String d = cYh.d("0F242C3D");
            if (a == 1) {
                M m = (M) o;
                String str = m.c;
                str.getClass();
                if (!str.equals(cYh.d("043F2D"))) {
                    return !str.equals(d) ? e(o, c0062b) : c0062b.X(o, A.i);
                }
                c0062b.G(m);
            } else if (a != 2) {
                if (a != 3) {
                    if (a == 5 && c0062b.a().d0().equals(d)) {
                        return true;
                    }
                    return e(o, c0062b);
                }
                c0062b.F((I) o);
            } else {
                if (!((L) o).c.equals(cYh.d("043F2D3625351220"))) {
                    return e(o, c0062b);
                }
                if (c0062b.a().d0().equals(d)) {
                    c0062b.n(this);
                    return false;
                }
                c0062b.U();
                c0062b.j0(A.k);
            }
        } else {
            c0062b.n(this);
        }
        return true;
    }
}
