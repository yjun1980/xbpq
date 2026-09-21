package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0074h extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0074h() {
        super(cYh.d("2E3E02343B36"), 14, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        C0072g c0072g = A.p;
        C0103w c0103w = A.i;
        boolean e = o.e();
        String d = cYh.d("1338");
        String d2 = cYh.d("1334");
        if (e) {
            String str = ((L) o).c;
            if (com.github.catvod.spider.merge.b0.b.b(str, C0109z.x)) {
                if (!c0062b.B(str)) {
                    c0062b.n(this);
                    c0062b.j0(c0072g);
                    return false;
                }
                if (!c0062b.a().d0().equals(str)) {
                    c0062b.n(this);
                }
                c0062b.V(str);
                c0062b.i();
                c0062b.j0(c0072g);
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(str, C0109z.y)) {
                c0062b.n(this);
                return false;
            }
            if (!com.github.catvod.spider.merge.b0.b.b(str, C0109z.z)) {
                return c0062b.X(o, c0103w);
            }
            if (!c0062b.B(str)) {
                c0062b.n(this);
                return false;
            }
            if (c0062b.B(d2)) {
                d = d2;
            }
            c0062b.d(d);
            return c0062b.c(o);
        }
        if (!o.f() || !com.github.catvod.spider.merge.b0.b.b(((M) o).c, C0109z.A)) {
            return c0062b.X(o, c0103w);
        }
        if (!c0062b.B(d2) && !c0062b.B(d)) {
            c0062b.n(this);
            return false;
        }
        if (c0062b.B(d2)) {
            d = d2;
        }
        c0062b.d(d);
        return c0062b.c(o);
    }
}
