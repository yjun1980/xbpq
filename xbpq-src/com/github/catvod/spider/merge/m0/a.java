/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m0;

import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.i0.f;
import com.github.catvod.spider.merge.i0.h;
import com.github.catvod.spider.merge.i0.i;
import com.github.catvod.spider.merge.i0.j;
import com.github.catvod.spider.merge.i0.k;
import com.github.catvod.spider.merge.i0.l;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.j0.c;
import com.github.catvod.spider.merge.j0.d;
import com.github.catvod.spider.merge.j0.o;
import com.github.catvod.spider.merge.j0.p;
import com.github.catvod.spider.merge.k0.e;
import com.github.catvod.spider.merge.k0.g;
import com.github.catvod.spider.merge.n0.b;
import java.util.HashMap;
import java.util.Map;

public final class a {
    private static Map<String, com.github.catvod.spider.merge.h0.a> a;
    private static Map<String, com.github.catvod.spider.merge.h0.c> b;
    private static Map<String, com.github.catvod.spider.merge.h0.b> c;
    private static b d;

    static {
        Object object;
        int n2;
        a = new HashMap<String, com.github.catvod.spider.merge.h0.a>();
        b = new HashMap<String, com.github.catvod.spider.merge.h0.c>();
        c = new HashMap<String, com.github.catvod.spider.merge.h0.b>();
        d = com.github.catvod.spider.merge.n0.c.d(a.class);
        int n3 = 0;
        for (n2 = 0; n2 < 14; ++n2) {
            object = (new Class[]{com.github.catvod.spider.merge.i0.a.class, com.github.catvod.spider.merge.i0.b.class, com.github.catvod.spider.merge.i0.c.class, com.github.catvod.spider.merge.i0.d.class, com.github.catvod.spider.merge.i0.e.class, f.class, com.github.catvod.spider.merge.i0.g.class, h.class, i.class, j.class, k.class, l.class, m.class, com.github.catvod.spider.merge.i0.n.class})[n2];
            try {
                object = (com.github.catvod.spider.merge.h0.a)((Class)object).newInstance();
                ((HashMap)a).put(object.a(), (com.github.catvod.spider.merge.h0.a)object);
                continue;
            }
            catch (Exception exception) {
                d.a(com.github.catvod.spider.merge.W.a.b(exception), exception);
            }
        }
        for (n2 = 0; n2 < 16; ++n2) {
            object = (new Class[]{com.github.catvod.spider.merge.j0.a.class, com.github.catvod.spider.merge.j0.b.class, c.class, d.class, com.github.catvod.spider.merge.j0.f.class, com.github.catvod.spider.merge.j0.g.class, com.github.catvod.spider.merge.j0.h.class, com.github.catvod.spider.merge.j0.i.class, com.github.catvod.spider.merge.j0.j.class, com.github.catvod.spider.merge.j0.k.class, com.github.catvod.spider.merge.j0.l.class, com.github.catvod.spider.merge.j0.n.class, p.class, com.github.catvod.spider.merge.j0.e.class, com.github.catvod.spider.merge.j0.m.class, o.class})[n2];
            try {
                object = (com.github.catvod.spider.merge.h0.b)((Class)object).newInstance();
                ((HashMap)c).put(object.a(), (com.github.catvod.spider.merge.h0.b)object);
                continue;
            }
            catch (Exception exception) {
                d.a(com.github.catvod.spider.merge.W.a.b(exception), exception);
            }
        }
        for (n2 = n3; n2 < 6; ++n2) {
            object = (new Class[]{com.github.catvod.spider.merge.k0.a.class, com.github.catvod.spider.merge.k0.b.class, com.github.catvod.spider.merge.k0.c.class, com.github.catvod.spider.merge.k0.d.class, e.class, g.class})[n2];
            try {
                object = (com.github.catvod.spider.merge.h0.c)((Class)object).newInstance();
                ((HashMap)b).put(object.a(), (com.github.catvod.spider.merge.h0.c)object);
                continue;
            }
            catch (Exception exception) {
                d.a(com.github.catvod.spider.merge.W.a.b(exception), exception);
            }
        }
    }

    public static com.github.catvod.spider.merge.h0.b a(String string) {
        com.github.catvod.spider.merge.h0.b b2 = (com.github.catvod.spider.merge.h0.b)((HashMap)c).get(string);
        if (b2 != null) {
            return b2;
        }
        throw new com.github.catvod.spider.merge.l0.b(n.a(cYh.d("093F3571242F17202E23237A01252F322333083E7B71"), string));
    }

    public static com.github.catvod.spider.merge.h0.c b(String string) {
        com.github.catvod.spider.merge.h0.c c2 = (com.github.catvod.spider.merge.h0.c)((HashMap)b).get(string);
        if (c2 != null) {
            return c2;
        }
        throw new com.github.catvod.spider.merge.l0.b(n.a(cYh.d("093F3571242F17202E23237A093F2534033F14247B71"), string));
    }

    public static com.github.catvod.spider.merge.h0.a c(String string) {
        com.github.catvod.spider.merge.h0.a a2 = (com.github.catvod.spider.merge.h0.a)((HashMap)a).get(string);
        if (a2 != null) {
            return a2;
        }
        throw new com.github.catvod.spider.merge.Z.b(n.a(cYh.d("093F3571242F17202E23237A062828226D7A"), string));
    }
}

