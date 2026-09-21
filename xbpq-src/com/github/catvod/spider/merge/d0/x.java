/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;

final class x
extends A {
    @Override
    final boolean d(O o2, b b2) {
        if (o2.a()) {
            b2.E((H)o2);
        } else {
            if (o2.d()) {
                b2.n(this);
                b2.U();
                b2.j0(b2.T());
                return b2.c(o2);
            }
            if (o2.e()) {
                b2.U();
                b2.j0(b2.T());
            }
        }
        return true;
    }
}

