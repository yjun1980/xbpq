/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.M;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.t;

public final class s
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        Object object;
        t t2;
        block9: {
            block7: {
                block8: {
                    block6: {
                        if (n2.b()) {
                            b2.h(this);
                            return false;
                        }
                        if (!n2.a()) break block6;
                        b2.t((H)n2);
                        break block7;
                    }
                    if (!B.a(n2)) break block8;
                    b2.s((G)n2);
                    break block7;
                }
                boolean bl = n2.e();
                t2 = B.c;
                if (!bl) break block9;
                object = (L)n2;
                if (!((M)object).c.equals("html")) break block9;
                b2.r((L)object);
                b2.l = t2;
            }
            return true;
        }
        if (n2.d() && com.github.catvod.spider.merge.xc.E0.b.c(((K)n2).c, A.e)) {
            b2.getClass();
            object = new l(b2.N("html", b2.h), null, null);
            b2.x((q)object);
            b2.e.add(object);
            b2.l = t2;
            return b2.D(n2);
        }
        if (n2.d()) {
            b2.h(this);
            return false;
        }
        b2.getClass();
        object = new l(b2.N("html", b2.h), null, null);
        b2.x((q)object);
        b2.e.add(object);
        b2.l = t2;
        return b2.D(n2);
    }
}

