package com.github.catvod.spider.merge.Q;

import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public abstract class X {
    public static final C0031w b = new C0031w();
    public final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public X(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    public static X a(C0010a c0010a, com.github.catvod.spider.merge.P.C c) {
        if (c == null) {
            c = com.github.catvod.spider.merge.P.C.c;
        }
        com.github.catvod.spider.merge.P.C c2 = c.a;
        return (c2 == null || c == com.github.catvod.spider.merge.P.C.c) ? b : n0.i(a(c0010a, c2), ((f0) ((AbstractC0022m) c0010a.a.get(c.b)).d(0)).c.b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Q.X, com.github.catvod.spider.merge.Q.X>] */
    public static X b(X x, Y y, IdentityHashMap<X, X> identityHashMap) {
        if (x.f()) {
            return x;
        }
        X x2 = identityHashMap.get(x);
        if (x2 != null) {
            return x2;
        }
        X x3 = (X) y.a.get(x);
        if (x3 != null) {
            identityHashMap.put(x, x3);
            return x3;
        }
        X[] xArr = new X[x.h()];
        boolean z = false;
        for (int i = 0; i < xArr.length; i++) {
            X b2 = b(x.c(i), y, identityHashMap);
            if (z || b2 != x.c(i)) {
                if (!z) {
                    xArr = new X[x.h()];
                    for (int i2 = 0; i2 < x.h(); i2++) {
                        xArr[i2] = x.c(i2);
                    }
                    z = true;
                }
                xArr[i] = b2;
            }
        }
        if (!z) {
            y.a(x);
            identityHashMap.put(x, x);
            return x;
        }
        X i3 = xArr.length == 0 ? b : xArr.length == 1 ? n0.i(xArr[0], x.d(0)) : new C0025p(xArr, ((C0025p) x).d);
        y.a(i3);
        identityHashMap.put(i3, i3);
        identityHashMap.put(x, i3);
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r1 == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        if (r19 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
    
        r19.b(r0, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0104, code lost:
    
        if (r19 != 0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.github.catvod.spider.merge.Q.p] */
    /* JADX WARN: Type inference failed for: r10v15, types: [com.github.catvod.spider.merge.Q.p] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.github.catvod.spider.merge.S.c, com.github.catvod.spider.merge.S.c<com.github.catvod.spider.merge.Q.X, com.github.catvod.spider.merge.Q.X, com.github.catvod.spider.merge.Q.X>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.github.catvod.spider.merge.Q.X g(com.github.catvod.spider.merge.Q.X r16, com.github.catvod.spider.merge.Q.X r17, boolean r18, com.github.catvod.spider.merge.S.c<com.github.catvod.spider.merge.Q.X, com.github.catvod.spider.merge.Q.X, com.github.catvod.spider.merge.Q.X> r19) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.X.g(com.github.catvod.spider.merge.Q.X, com.github.catvod.spider.merge.Q.X, boolean, com.github.catvod.spider.merge.S.c):com.github.catvod.spider.merge.Q.X");
    }

    public abstract X c(int i);

    public abstract int d(int i);

    public final boolean e() {
        return d(h() - 1) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    public boolean f() {
        return this == b;
    }

    public abstract int h();

    public final int hashCode() {
        return this.a;
    }
}
