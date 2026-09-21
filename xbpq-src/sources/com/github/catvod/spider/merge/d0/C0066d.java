package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0066d extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0066d() {
        super(cYh.d("2E3E0230272E0E3F2F"), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        boolean e = o.e();
        String d = cYh.d("043131253E3509");
        if (e) {
            L l = (L) o;
            if (l.c.equals(d)) {
                if (!c0062b.B(l.c)) {
                    c0062b.n(this);
                    return false;
                }
                if (!c0062b.a().d0().equals(d)) {
                    c0062b.n(this);
                }
                c0062b.V(d);
                c0062b.i();
                c0062b.j0(A.k);
                return true;
            }
        }
        if ((o.f() && com.github.catvod.spider.merge.b0.b.b(((M) o).c, C0109z.A)) || (o.e() && ((L) o).c.equals(cYh.d("1331233D32")))) {
            c0062b.n(this);
            if (c0062b.d(d)) {
                return c0062b.c(o);
            }
            return true;
        }
        if (!o.e() || !com.github.catvod.spider.merge.b0.b.b(((L) o).c, C0109z.L)) {
            return c0062b.X(o, A.i);
        }
        c0062b.n(this);
        return false;
    }
}
