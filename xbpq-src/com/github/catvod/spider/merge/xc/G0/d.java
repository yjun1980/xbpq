/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.M;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.x;

public final class d
extends B {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean c(N n2, b b2) {
        Object object;
        if (n2.d()) {
            object = (K)n2;
            if (((M)object).c.equals("caption")) {
                if (!b2.q(((M)object).c)) {
                    b2.h(this);
                    return false;
                }
                b2.j(false);
                if (!b2.g("caption")) {
                    b2.h(this);
                }
                b2.B("caption");
                b2.c();
                b2.l = B.i;
                return true;
            }
        }
        if (n2.e() && com.github.catvod.spider.merge.xc.E0.b.c(((L)n2).c, A.y) || n2.d() && ((K)n2).c.equals("table")) {
            b2.h(this);
            if (!b2.F("caption")) return true;
            return b2.D(n2);
        }
        if (n2.d() && com.github.catvod.spider.merge.xc.E0.b.c(((K)n2).c, A.J)) {
            b2.h(this);
            return false;
        }
        object = B.g;
        b2.g = n2;
        return ((x)((Object)object)).c(n2, b2);
    }
}

