package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0078j extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0078j() {
        super(cYh.d("2E3E12343B3F0424083F033B053C24"), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        boolean f = o.f();
        String d = cYh.d("14352D34342E");
        if (f && com.github.catvod.spider.merge.b0.b.b(((M) o).c, C0109z.I)) {
            c0062b.n(this);
            c0062b.d(d);
            return c0062b.c(o);
        }
        if (o.e()) {
            L l = (L) o;
            if (com.github.catvod.spider.merge.b0.b.b(l.c, C0109z.I)) {
                c0062b.n(this);
                if (!c0062b.B(l.c)) {
                    return false;
                }
                c0062b.d(d);
                return c0062b.c(o);
            }
        }
        return c0062b.X(o, A.r);
    }
}
