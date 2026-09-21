/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Em.i;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.J;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.r;

final class m
extends A {
    @Override
    final boolean d(O object, b b2) {
        r r2;
        block7: {
            block6: {
                block5: {
                    r2 = A.d;
                    if (A.a((O)object)) {
                        return true;
                    }
                    if (!((O)object).b()) break block5;
                    b2.F((I)object);
                    break block6;
                }
                if (!((O)object).c()) break block7;
                J j2 = (J)object;
                object = new i(b2.h.c(j2.b.toString()), j2.d.toString(), j2.e.toString());
                ((i)object).L(j2.c);
                b2.d.L((com.github.catvod.spider.merge.Em.r)object);
                if (j2.f) {
                    b2.d.v0();
                }
                b2.j0(r2);
            }
            return true;
        }
        b2.j0(r2);
        return b2.c((O)object);
    }
}

