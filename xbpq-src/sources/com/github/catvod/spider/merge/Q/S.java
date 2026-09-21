package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class S extends AbstractC0021l {
    public static final boolean k;
    protected final com.github.catvod.spider.merge.P.w d;
    public final com.github.catvod.spider.merge.R.b[] e;
    protected com.github.catvod.spider.merge.S.c<X, X, X> f;
    protected com.github.catvod.spider.merge.P.G g;
    protected int h;
    protected com.github.catvod.spider.merge.P.x i;
    protected com.github.catvod.spider.merge.R.b j;

    static {
        String str;
        try {
            str = System.getenv(cYh.d("3305131F081521161E1D05052B1F0E01081F29041308081835110F121F05280015"));
        } catch (SecurityException unused) {
            str = null;
        }
        k = Boolean.parseBoolean(str);
    }

    public S(com.github.catvod.spider.merge.P.w wVar, C0010a c0010a, com.github.catvod.spider.merge.R.b[] bVarArr, Y y) {
        super(c0010a, y);
        this.d = wVar;
        this.e = bVarArr;
    }

    protected static int o(C0015f c0015f) {
        Iterator<C0011b> it = c0015f.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0011b next = it.next();
            if (i == 0) {
                i = next.b;
            } else if (next.b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.Q.AbstractC0021l
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(com.github.catvod.spider.merge.P.G g, int i, com.github.catvod.spider.merge.P.x xVar) {
        this.g = g;
        this.h = g.i();
        this.i = xVar;
        com.github.catvod.spider.merge.R.b bVar = this.e[i];
        this.j = bVar;
        g.g();
        int i2 = this.h;
        try {
            com.github.catvod.spider.merge.R.e a = bVar.b() ? bVar.a(this.d.r()) : bVar.b;
            if (a == null) {
                if (xVar == null) {
                    xVar = com.github.catvod.spider.merge.P.C.c;
                }
                C0015f i3 = i(bVar.d, com.github.catvod.spider.merge.P.C.c, false);
                if (bVar.b()) {
                    bVar.b.b = i3;
                    a = d(bVar, new com.github.catvod.spider.merge.R.e(e(i3)));
                    bVar.c(this.d.r(), a);
                } else {
                    a = d(bVar, new com.github.catvod.spider.merge.R.e(i3));
                    bVar.b = a;
                }
            }
            return l(bVar, a, g, i2, xVar);
        } finally {
            this.f = null;
            this.j = null;
            g.d(i2);
            g.a();
        }
    }

    protected final com.github.catvod.spider.merge.R.e c(com.github.catvod.spider.merge.R.b bVar, com.github.catvod.spider.merge.R.e eVar, int i, com.github.catvod.spider.merge.R.e eVar2) {
        if (eVar2 == null) {
            return null;
        }
        com.github.catvod.spider.merge.R.e d = d(bVar, eVar2);
        if (i < -1 || i > this.a.f) {
            return d;
        }
        synchronized (eVar) {
            if (eVar.c == null) {
                eVar.c = new com.github.catvod.spider.merge.R.e[this.a.f + 1 + 1];
            }
            eVar.c[i + 1] = d;
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.R.e, com.github.catvod.spider.merge.R.e>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.R.e, com.github.catvod.spider.merge.R.e>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.R.e, com.github.catvod.spider.merge.R.e>] */
    protected final com.github.catvod.spider.merge.R.e d(com.github.catvod.spider.merge.R.b bVar, com.github.catvod.spider.merge.R.e eVar) {
        if (eVar == AbstractC0021l.c) {
            return eVar;
        }
        synchronized (bVar.a) {
            com.github.catvod.spider.merge.R.e eVar2 = (com.github.catvod.spider.merge.R.e) bVar.a.get(eVar);
            if (eVar2 != null) {
                return eVar2;
            }
            eVar.a = bVar.a.size();
            C0015f c0015f = eVar.b;
            if (!c0015f.c) {
                c0015f.b(this);
                C0015f c0015f2 = eVar.b;
                c0015f2.c = true;
                c0015f2.d = null;
            }
            bVar.a.put(eVar, eVar);
            return eVar;
        }
    }

    protected final C0015f e(C0015f c0015f) {
        X x;
        l0 d;
        HashMap hashMap = new HashMap();
        C0015f c0015f2 = new C0015f(c0015f.j);
        Iterator<C0011b> it = c0015f.iterator();
        while (it.hasNext()) {
            C0011b next = it.next();
            if (next.b == 1 && (d = next.e.d(this.d, this.i)) != null) {
                hashMap.put(Integer.valueOf(next.a.b), next.c);
                if (d != next.e) {
                    c0015f2.a(new C0011b(next, next.a, next.c, d), this.f);
                } else {
                    c0015f2.a(next, this.f);
                }
            }
        }
        Iterator<C0011b> it2 = c0015f.iterator();
        while (it2.hasNext()) {
            C0011b next2 = it2.next();
            if (next2.b != 1 && (next2.c() || (x = (X) hashMap.get(Integer.valueOf(next2.a.b))) == null || !x.equals(next2.c))) {
                c0015f2.a(next2, this.f);
            }
        }
        return c0015f2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    protected final void f(C0011b c0011b, C0015f c0015f, Set<C0011b> set, boolean z, boolean z2, int i, boolean z3) {
        if (c0011b.a instanceof e0) {
            if (!c0011b.c.f()) {
                for (int i2 = 0; i2 < c0011b.c.h(); i2++) {
                    if (c0011b.c.d(i2) != Integer.MAX_VALUE) {
                        C0011b c0011b2 = new C0011b((AbstractC0022m) this.a.a.get(c0011b.c.d(i2)), c0011b.b, c0011b.c.c(i2), c0011b.e);
                        c0011b2.d = c0011b.d;
                        f(c0011b2, c0015f, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0015f.a(new C0011b(c0011b, c0011b.a, X.b, c0011b.e), this.f);
                    } else {
                        g(c0011b, c0015f, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c0015f.a(c0011b, this.f);
                return;
            }
        }
        g(c0011b, c0015f, set, z, z2, i, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void g(com.github.catvod.spider.merge.Q.C0011b r17, com.github.catvod.spider.merge.Q.C0015f r18, java.util.Set<com.github.catvod.spider.merge.Q.C0011b> r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.S.g(com.github.catvod.spider.merge.Q.b, com.github.catvod.spider.merge.Q.f, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
    
        if (r15 == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.github.catvod.spider.merge.Q.C0015f h(com.github.catvod.spider.merge.Q.C0015f r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.S.h(com.github.catvod.spider.merge.Q.f, int, boolean):com.github.catvod.spider.merge.Q.f");
    }

    protected final C0015f i(AbstractC0022m abstractC0022m, com.github.catvod.spider.merge.P.C c, boolean z) {
        X a = X.a(this.a, c);
        C0015f c0015f = new C0015f(z);
        int i = 0;
        while (i < abstractC0022m.b()) {
            int i2 = i + 1;
            f(new C0011b(abstractC0022m.d(i).a, i2, a, l0.c), c0015f, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0015f;
    }

    protected final BitSet j(com.github.catvod.spider.merge.R.d[] dVarArr, com.github.catvod.spider.merge.P.x xVar) {
        BitSet bitSet = new BitSet();
        for (com.github.catvod.spider.merge.R.d dVar : dVarArr) {
            l0 l0Var = dVar.a;
            if (l0Var == l0.c || k(l0Var, xVar)) {
                bitSet.set(dVar.b);
            }
        }
        return bitSet;
    }

    protected final boolean k(l0 l0Var, com.github.catvod.spider.merge.P.x xVar) {
        return l0Var.c(this.d, xVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00be, code lost:
    
        if (r9 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c5  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int l(com.github.catvod.spider.merge.R.b r17, com.github.catvod.spider.merge.R.e r18, com.github.catvod.spider.merge.P.G r19, int r20, com.github.catvod.spider.merge.P.x r21) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.S.l(com.github.catvod.spider.merge.R.b, com.github.catvod.spider.merge.R.e, com.github.catvod.spider.merge.P.G, int, com.github.catvod.spider.merge.P.x):int");
    }

    protected final int m(C0015f c0015f) {
        com.github.catvod.spider.merge.S.j jVar = new com.github.catvod.spider.merge.S.j(new int[0]);
        Iterator<C0011b> it = c0015f.iterator();
        while (it.hasNext()) {
            C0011b next = it.next();
            if (next.b() > 0 || ((next.a instanceof e0) && next.c.e())) {
                jVar.a(next.b);
            }
        }
        if (jVar.j() == 0) {
            return 0;
        }
        return jVar.e();
    }

    protected final int n(C0015f c0015f, com.github.catvod.spider.merge.P.x xVar) {
        int m;
        C0015f c0015f2 = new C0015f(c0015f.j);
        C0015f c0015f3 = new C0015f(c0015f.j);
        Iterator<C0011b> it = c0015f.iterator();
        while (it.hasNext()) {
            C0011b next = it.next();
            l0 l0Var = next.e;
            if (l0Var == l0.c || k(l0Var, xVar)) {
                c0015f2.a(next, null);
            } else {
                c0015f3.a(next, null);
            }
        }
        int m2 = m(c0015f2);
        if (m2 != 0) {
            return m2;
        }
        if (c0015f3.size() <= 0 || (m = m(c0015f3)) == 0) {
            return 0;
        }
        return m;
    }

    protected final com.github.catvod.spider.merge.P.u p(com.github.catvod.spider.merge.P.G g, com.github.catvod.spider.merge.P.x xVar, C0015f c0015f, int i) {
        return new com.github.catvod.spider.merge.P.u(this.d, g, g.get(i), g.e(1), xVar);
    }

    protected final void q(com.github.catvod.spider.merge.R.b bVar, int i, int i2, BitSet bitSet, C0015f c0015f) {
        com.github.catvod.spider.merge.P.w wVar = this.d;
        if (wVar != null) {
            ((com.github.catvod.spider.merge.P.y) wVar.g()).c(this.d, bVar, i, i2, bitSet, c0015f);
        }
    }
}
