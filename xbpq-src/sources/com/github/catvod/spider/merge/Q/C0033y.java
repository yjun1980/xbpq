package com.github.catvod.spider.merge.Q;

import java.util.BitSet;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.Q.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033y {
    public final C0010a a;

    public C0033y(C0010a c0010a) {
        this.a = c0010a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    public final void a(AbstractC0022m abstractC0022m, X x, com.github.catvod.spider.merge.S.j jVar, Set set, BitSet bitSet) {
        if (set.add(new C0011b(abstractC0022m, 0, x, l0.c))) {
            if (abstractC0022m == null) {
                if (x == null) {
                    jVar.a(-2);
                    return;
                } else if (x.f()) {
                    jVar.a(-1);
                    return;
                }
            }
            if (abstractC0022m instanceof e0) {
                if (x == null) {
                    jVar.a(-2);
                    return;
                }
                if (x.f()) {
                    jVar.a(-1);
                    return;
                }
                if (x != X.b) {
                    boolean z = bitSet.get(abstractC0022m.c);
                    try {
                        bitSet.clear(abstractC0022m.c);
                        for (int i = 0; i < x.h(); i++) {
                            a((AbstractC0022m) this.a.a.get(x.d(i)), x.c(i), jVar, set, bitSet);
                        }
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (z) {
                            bitSet.set(abstractC0022m.c);
                        }
                    }
                }
            }
            int b = abstractC0022m.b();
            for (int i2 = 0; i2 < b; i2++) {
                t0 d = abstractC0022m.d(i2);
                if (d.getClass() == f0.class) {
                    f0 f0Var = (f0) d;
                    if (bitSet.get(f0Var.a.c)) {
                        continue;
                    } else {
                        n0 i3 = n0.i(x, f0Var.c.b);
                        try {
                            bitSet.set(((f0) d).a.c);
                            a(d.a, i3, jVar, set, bitSet);
                        } finally {
                            bitSet.clear(f0Var.a.c);
                        }
                    }
                } else if ((d instanceof AbstractC0023n) || d.b()) {
                    a(d.a, x, jVar, set, bitSet);
                } else if (d.getClass() == u0.class) {
                    jVar.c(com.github.catvod.spider.merge.S.j.g(1, this.a.f));
                } else {
                    com.github.catvod.spider.merge.S.j c = d.c();
                    if (c != null) {
                        if (d instanceof P) {
                            com.github.catvod.spider.merge.S.j g = com.github.catvod.spider.merge.S.j.g(1, this.a.f);
                            if (g.f()) {
                                c = null;
                            } else if (c.f()) {
                                c = new com.github.catvod.spider.merge.S.j(new int[0]);
                                c.c(g);
                            } else {
                                c = com.github.catvod.spider.merge.S.j.k(g, c);
                            }
                        }
                        jVar.c(c);
                    }
                }
            }
        }
    }
}
