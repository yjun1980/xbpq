/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.W.a;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.c0.u;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.c;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import com.github.catvod.spider.merge.j.l;
import com.github.catvod.spider.merge.k0.f;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.List;

public final class g
implements c {
    @Override
    public final String a() {
        return cYh.d("13353925");
    }

    @Override
    public final e b(d object) {
        com.github.catvod.spider.merge.e0.g g2;
        block6: {
            Object object2 = ((d)object).a();
            g2 = new com.github.catvod.spider.merge.e0.g();
            if (object2 == null || ((AbstractCollection)object2).size() <= 0) break block6;
            if (((d)object).f()) {
                object2 = ((AbstractCollection)object2).iterator();
                while (object2.hasNext()) {
                    object = (com.github.catvod.spider.merge.c0.l)object2.next();
                    a.c(new f(new HashMap(), g2), (r)object);
                }
            } else {
                object = ((AbstractCollection)object2).iterator();
                while (object.hasNext()) {
                    r r2 = (com.github.catvod.spider.merge.c0.l)object.next();
                    object2 = ((com.github.catvod.spider.merge.c0.l)r2).t();
                    boolean bl = cYh.d("14333338272E").equals(object2);
                    object2 = cYh.d("2D081E05120233");
                    if (bl) {
                        object2 = new com.github.catvod.spider.merge.c0.l((String)object2);
                        ((com.github.catvod.spider.merge.c0.l)object2).o0(((com.github.catvod.spider.merge.c0.l)r2).T());
                        l.f((com.github.catvod.spider.merge.c0.l)object2, 1);
                        ((AbstractCollection)g2).add(object2);
                        continue;
                    }
                    List<u> list = ((com.github.catvod.spider.merge.c0.l)r2).q0();
                    int n2 = 0;
                    while (n2 < list.size()) {
                        r2 = list.get(n2);
                        com.github.catvod.spider.merge.c0.l l2 = new com.github.catvod.spider.merge.c0.l((String)object2);
                        l2.o0(((u)r2).L());
                        l.f(l2, ++n2);
                        ((AbstractCollection)g2).add(l2);
                    }
                }
            }
        }
        return new e(g2);
    }
}

