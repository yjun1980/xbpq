/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;

public final class y
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        if (n2.a == 5) {
            b2.s((G)n2);
        } else {
            if (n2.c()) {
                b2.h(this);
                b2.A();
                b2.l = b2.m;
                return b2.D(n2);
            }
            if (n2.d()) {
                b2.A();
                b2.l = b2.m;
            }
        }
        return true;
    }
}

