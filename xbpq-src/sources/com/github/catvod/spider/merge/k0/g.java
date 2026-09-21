package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.u;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements com.github.catvod.spider.merge.h0.c {
    @Override // com.github.catvod.spider.merge.h0.c
    public final String a() {
        return cYh.d("13353925");
    }

    @Override // com.github.catvod.spider.merge.h0.c
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar) {
        C0123g a = dVar.a();
        C0123g c0123g = new C0123g();
        if (a != null && a.size() > 0) {
            if (dVar.f()) {
                Iterator<l> it = a.iterator();
                while (it.hasNext()) {
                    com.github.catvod.spider.merge.W.a.c(new f(new HashMap(), c0123g), it.next());
                }
            } else {
                Iterator<l> it2 = a.iterator();
                while (it2.hasNext()) {
                    l next = it2.next();
                    boolean equals = cYh.d("14333338272E").equals(next.t());
                    String d = cYh.d("2D081E05120233");
                    if (equals) {
                        l lVar = new l(d);
                        lVar.o0(next.T());
                        com.github.catvod.spider.merge.j.l.f(lVar, 1);
                        c0123g.add(lVar);
                    } else {
                        List<u> q0 = next.q0();
                        int i = 0;
                        while (i < q0.size()) {
                            u uVar = q0.get(i);
                            l lVar2 = new l(d);
                            lVar2.o0(uVar.L());
                            i++;
                            com.github.catvod.spider.merge.j.l.f(lVar2, i);
                            c0123g.add(lVar2);
                        }
                    }
                }
            }
        }
        return new com.github.catvod.spider.merge.h0.e(c0123g);
    }
}
