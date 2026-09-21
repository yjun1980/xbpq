/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;

final class y
extends B {
    @Override
    final boolean i(P p2, b b2) {
        if (p2.b()) {
            b2.I((I)p2);
        } else {
            if (p2.e()) {
                b2.r(this);
                b2.Z();
                b2.s0(b2.Y());
                return b2.e(p2);
            }
            if (p2.f()) {
                b2.Z();
                b2.s0(b2.Y());
            }
        }
        return true;
    }
}

