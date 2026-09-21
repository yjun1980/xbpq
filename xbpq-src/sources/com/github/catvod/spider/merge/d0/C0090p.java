package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.d0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0090p extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0090p() {
        super(cYh.d("26363534251B012424231128063D2422322E"), 21, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        if (o.b()) {
            c0062b.F((I) o);
            return true;
        }
        if (o.c() || A.a(o) || (o.f() && ((M) o).c.equals(cYh.d("0F242C3D")))) {
            return c0062b.X(o, A.i);
        }
        if (o.d()) {
            return true;
        }
        if (o.f() && ((M) o).c.equals(cYh.d("093F272336370223"))) {
            return c0062b.X(o, A.f);
        }
        c0062b.n(this);
        return false;
    }
}
