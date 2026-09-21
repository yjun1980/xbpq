/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.z;

final class j
extends A {
    @Override
    final boolean d(O o2, b b2) {
        if (o2.f() && com.github.catvod.spider.merge.Dw.e.b(((M)o2).c, z.I)) {
            b2.n(this);
            b2.d("select");
            return b2.c(o2);
        }
        if (o2.e()) {
            L l2 = (L)o2;
            if (com.github.catvod.spider.merge.Dw.e.b(l2.c, z.I)) {
                b2.n(this);
                if (b2.B(l2.c)) {
                    b2.d("select");
                    return b2.c(o2);
                }
                return false;
            }
        }
        return b2.X(o2, A.r);
    }
}

