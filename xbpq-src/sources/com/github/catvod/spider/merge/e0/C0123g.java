package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123g extends ArrayList<com.github.catvod.spider.merge.c0.l> {
    public C0123g() {
    }

    public C0123g(int i) {
        super(i);
    }

    public C0123g(List<com.github.catvod.spider.merge.c0.l> list) {
        super(list);
    }

    public C0123g(com.github.catvod.spider.merge.c0.l... lVarArr) {
        super(Arrays.asList(lVarArr));
    }

    public final String a(String str) {
        Iterator<com.github.catvod.spider.merge.c0.l> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            if (next.o(str)) {
                return next.c(str);
            }
        }
        return "";
    }

    public final C0123g b(int i) {
        return size() > i ? new C0123g(get(i)) : new C0123g();
    }

    public final com.github.catvod.spider.merge.c0.l c() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C0123g c0123g = new C0123g(size());
        Iterator<com.github.catvod.spider.merge.c0.l> it = iterator();
        while (it.hasNext()) {
            c0123g.add(it.next().j());
        }
        return c0123g;
    }

    public final C0123g d(String str) {
        com.github.catvod.spider.merge.N.a.i(str);
        N h = P.h(str);
        C0123g c0123g = new C0123g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<com.github.catvod.spider.merge.c0.l> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            com.github.catvod.spider.merge.N.a.k(h);
            com.github.catvod.spider.merge.N.a.k(next);
            Iterator<com.github.catvod.spider.merge.c0.l> it2 = C0119c.a(h, next).iterator();
            while (it2.hasNext()) {
                com.github.catvod.spider.merge.c0.l next2 = it2.next();
                if (identityHashMap.put(next2, Boolean.TRUE) == null) {
                    c0123g.add(next2);
                }
            }
        }
        return c0123g;
    }

    public final String e() {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        Iterator<com.github.catvod.spider.merge.c0.l> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            if (a.length() != 0) {
                a.append(cYh.d("47"));
            }
            a.append(next.p0());
        }
        return com.github.catvod.spider.merge.b0.b.g(a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        Iterator<com.github.catvod.spider.merge.c0.l> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            if (a.length() != 0) {
                a.append(cYh.d("6D"));
            }
            a.append(next.u());
        }
        return com.github.catvod.spider.merge.b0.b.g(a);
    }
}
