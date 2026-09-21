package com.github.catvod.spider.merge.m0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.b;
import com.github.catvod.spider.merge.h0.c;
import com.github.catvod.spider.merge.i0.d;
import com.github.catvod.spider.merge.i0.e;
import com.github.catvod.spider.merge.i0.f;
import com.github.catvod.spider.merge.i0.g;
import com.github.catvod.spider.merge.i0.h;
import com.github.catvod.spider.merge.i0.i;
import com.github.catvod.spider.merge.i0.j;
import com.github.catvod.spider.merge.i0.k;
import com.github.catvod.spider.merge.i0.l;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.i0.n;
import com.github.catvod.spider.merge.j0.o;
import com.github.catvod.spider.merge.j0.p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    private static Map<String, com.github.catvod.spider.merge.h0.a> a = new HashMap();
    private static Map<String, c> b = new HashMap();
    private static Map<String, b> c = new HashMap();
    private static com.github.catvod.spider.merge.n0.b d = com.github.catvod.spider.merge.n0.c.d(a.class);

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.h0.b>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.h0.a>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.h0.c>, java.util.HashMap] */
    static {
        Class[] clsArr = {com.github.catvod.spider.merge.i0.a.class, com.github.catvod.spider.merge.i0.b.class, com.github.catvod.spider.merge.i0.c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, l.class, m.class, n.class};
        int i = 0;
        for (int i2 = 14; i < i2; i2 = 14) {
            try {
                com.github.catvod.spider.merge.h0.a aVar = (com.github.catvod.spider.merge.h0.a) clsArr[i].newInstance();
                a.put(aVar.a(), aVar);
            } catch (Exception e) {
                d.a(com.github.catvod.spider.merge.W.a.b(e), e);
            }
            i++;
        }
        Class[] clsArr2 = {com.github.catvod.spider.merge.j0.a.class, com.github.catvod.spider.merge.j0.b.class, com.github.catvod.spider.merge.j0.c.class, com.github.catvod.spider.merge.j0.d.class, com.github.catvod.spider.merge.j0.f.class, com.github.catvod.spider.merge.j0.g.class, com.github.catvod.spider.merge.j0.h.class, com.github.catvod.spider.merge.j0.i.class, com.github.catvod.spider.merge.j0.j.class, com.github.catvod.spider.merge.j0.k.class, com.github.catvod.spider.merge.j0.l.class, com.github.catvod.spider.merge.j0.n.class, p.class, com.github.catvod.spider.merge.j0.e.class, com.github.catvod.spider.merge.j0.m.class, o.class};
        for (int i3 = 0; i3 < 16; i3++) {
            try {
                b bVar = (b) clsArr2[i3].newInstance();
                c.put(bVar.a(), bVar);
            } catch (Exception e2) {
                d.a(com.github.catvod.spider.merge.W.a.b(e2), e2);
            }
        }
        Class[] clsArr3 = {com.github.catvod.spider.merge.k0.a.class, com.github.catvod.spider.merge.k0.b.class, com.github.catvod.spider.merge.k0.c.class, com.github.catvod.spider.merge.k0.d.class, com.github.catvod.spider.merge.k0.e.class, com.github.catvod.spider.merge.k0.g.class};
        for (int i4 = 0; i4 < 6; i4++) {
            try {
                c cVar = (c) clsArr3[i4].newInstance();
                b.put(cVar.a(), cVar);
            } catch (Exception e3) {
                d.a(com.github.catvod.spider.merge.W.a.b(e3), e3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.h0.b>, java.util.HashMap] */
    public static b a(String str) {
        b bVar = (b) c.get(str);
        if (bVar != null) {
            return bVar;
        }
        throw new com.github.catvod.spider.merge.l0.b(com.github.catvod.spider.merge.b.n.a(cYh.d("093F3571242F17202E23237A01252F322333083E7B71"), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.h0.c>, java.util.HashMap] */
    public static c b(String str) {
        c cVar = (c) b.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new com.github.catvod.spider.merge.l0.b(com.github.catvod.spider.merge.b.n.a(cYh.d("093F3571242F17202E23237A093F2534033F14247B71"), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.h0.a>, java.util.HashMap] */
    public static com.github.catvod.spider.merge.h0.a c(String str) {
        com.github.catvod.spider.merge.h0.a aVar = (com.github.catvod.spider.merge.h0.a) a.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new com.github.catvod.spider.merge.Z.b(com.github.catvod.spider.merge.b.n.a(cYh.d("093F3571242F17202E23237A062828226D7A"), str));
    }
}
