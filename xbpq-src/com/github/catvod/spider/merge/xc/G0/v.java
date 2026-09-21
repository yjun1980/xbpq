/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.x;

public final class v
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        Object object;
        block9: {
            block8: {
                block7: {
                    if (!n2.b()) break block7;
                    b2.h(this);
                    break block8;
                }
                if (n2.e() && ((L)n2).c.equals("html")) {
                    x x2 = B.g;
                    b2.g = n2;
                    return x2.c(n2, b2);
                }
                boolean bl = n2.d();
                object = B.d;
                if (!bl || !((K)n2).c.equals("noscript")) break block9;
                b2.A();
                b2.l = object;
            }
            return true;
        }
        if (!(B.a(n2) || n2.a() || n2.e() && com.github.catvod.spider.merge.xc.E0.b.c(((L)n2).c, A.f))) {
            if (n2.d() && ((K)n2).c.equals("br")) {
                b2.h(this);
                object = new G();
                ((G)object).b = n2.toString();
                b2.s((G)object);
                return true;
            }
            if (n2.e() && com.github.catvod.spider.merge.xc.E0.b.c(((L)n2).c, A.I) || n2.d()) {
                b2.h(this);
                return false;
            }
            b2.h(this);
            object = new G();
            ((G)object).b = n2.toString();
            b2.s((G)object);
            return true;
        }
        b2.g = n2;
        return object.c(n2, b2);
    }
}

