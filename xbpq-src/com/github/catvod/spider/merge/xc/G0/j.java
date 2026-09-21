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
import com.github.catvod.spider.merge.xc.G0.i;

public final class j
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        Object object;
        boolean bl = n2.e();
        String[] stringArray = A.G;
        if (bl && com.github.catvod.spider.merge.xc.E0.b.c(((L)n2).c, stringArray)) {
            b2.h(this);
            b2.B("select");
            b2.M();
            return b2.D(n2);
        }
        if (n2.d()) {
            object = (K)n2;
            if (com.github.catvod.spider.merge.xc.E0.b.c(((M)object).c, stringArray)) {
                b2.h(this);
                if (b2.q(((M)object).c)) {
                    b2.B("select");
                    b2.M();
                    return b2.D(n2);
                }
                return false;
            }
        }
        object = B.p;
        b2.g = n2;
        return ((i)((Object)object)).c(n2, b2);
    }
}

