package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0084m extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0084m() {
        super(cYh.d("2E3E28253E3B0B"), 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        r rVar = A.d;
        if (A.a(o)) {
            return true;
        }
        if (o.b()) {
            c0062b.F((I) o);
        } else {
            if (!o.c()) {
                c0062b.j0(rVar);
                return c0062b.c(o);
            }
            J j = (J) o;
            com.github.catvod.spider.merge.c0.i iVar = new com.github.catvod.spider.merge.c0.i(c0062b.h.c(j.b.toString()), j.d.toString(), j.e.toString());
            iVar.L(j.c);
            c0062b.d.L(iVar);
            if (j.f) {
                c0062b.d.v0();
            }
            c0062b.j0(rVar);
        }
        return true;
    }
}
