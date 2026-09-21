package com.github.catvod.spider.merge.e0;

/* renamed from: com.github.catvod.spider.merge.e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119c {
    public static C0123g a(N n, com.github.catvod.spider.merge.c0.l lVar) {
        C0123g c0123g = new C0123g();
        com.github.catvod.spider.merge.W.a.c(new C0117a(lVar, c0123g, n), lVar);
        return c0123g;
    }

    public static com.github.catvod.spider.merge.c0.l b(N n, com.github.catvod.spider.merge.c0.l lVar) {
        C0118b c0118b = new C0118b(lVar, n);
        com.github.catvod.spider.merge.c0.r rVar = lVar;
        int i = 0;
        while (rVar != null) {
            int b = c0118b.b(rVar);
            if (b == 5) {
                break;
            }
            int i2 = 1;
            if (b != 1 || rVar.h() <= 0) {
                while (rVar.s() == null && i > 0) {
                    if (b == 1 || b == 2) {
                        b = 1;
                    }
                    com.github.catvod.spider.merge.c0.r A = rVar.A();
                    i--;
                    if (b == 4) {
                        rVar.C();
                    }
                    rVar = A;
                    b = 1;
                }
                if (b != 1 && b != 2) {
                    i2 = b;
                }
                if (rVar == lVar) {
                    break;
                }
                com.github.catvod.spider.merge.c0.r s = rVar.s();
                if (i2 == 4) {
                    rVar.C();
                }
                rVar = s;
            } else {
                rVar = rVar.g(0);
                i++;
            }
        }
        return C0118b.a(c0118b);
    }
}
