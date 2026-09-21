/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import java.util.ArrayList;

public final class c
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        if (n2.a == 5) {
            n2 = (G)n2;
            if (((G)n2).b.equals(B.x)) {
                b2.h(this);
                return false;
            }
            b2.s.add(((G)n2).b);
            return true;
        }
        if (b2.s.size() > 0) {
            for (String string : b2.s) {
                Object object;
                if (!com.github.catvod.spider.merge.xc.E0.b.d(string)) {
                    G g2;
                    b2.h(this);
                    boolean bl = com.github.catvod.spider.merge.xc.E0.b.c(b2.f().d.b, A.A);
                    object = B.g;
                    if (bl) {
                        b2.v = true;
                        g2 = new G();
                        g2.b = string;
                        b2.E(g2, (B)((Object)object));
                        b2.v = false;
                        continue;
                    }
                    g2 = new G();
                    g2.b = string;
                    b2.E(g2, (B)((Object)object));
                    continue;
                }
                object = new G();
                object.b = string;
                b2.s((G)object);
            }
            b2.s = new ArrayList();
        }
        b2.l = b2.m;
        return b2.D(n2);
    }
}

