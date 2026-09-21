/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;

final class p
extends A {
    @Override
    final boolean d(O o2, b b2) {
        block6: {
            block7: {
                block5: {
                    block4: {
                        if (!o2.b()) break block4;
                        b2.F((I)o2);
                        break block5;
                    }
                    if (o2.c() || A.a(o2) || o2.f() && ((M)o2).c.equals("html")) break block6;
                    if (!o2.d()) break block7;
                }
                return true;
            }
            if (o2.f() && ((M)o2).c.equals("noframes")) {
                return b2.X(o2, A.f);
            }
            b2.n(this);
            return false;
        }
        return b2.X(o2, A.i);
    }
}

