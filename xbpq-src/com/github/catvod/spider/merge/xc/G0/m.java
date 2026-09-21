/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.F0.i;
import com.github.catvod.spider.merge.xc.F0.p;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.D;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.I;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.s;

public final class m
extends B {
    @Override
    public final boolean c(N object, b b2) {
        s s2;
        block9: {
            block8: {
                block7: {
                    if (B.a((N)object)) {
                        return true;
                    }
                    if (!((N)object).a()) break block7;
                    b2.t((H)object);
                    break block8;
                }
                boolean bl = ((N)object).b();
                s2 = B.b;
                if (!bl) break block9;
                I i2 = (I)object;
                D d2 = b2.h;
                object = i2.b.toString();
                d2.getClass();
                String string = ((String)object).trim();
                object = string;
                if (!d2.a) {
                    object = com.github.catvod.spider.merge.xc.D0.b.u(string);
                }
                object = new i((String)object, i2.d.toString(), i2.e.toString());
                string = i2.c;
                if (string != null) {
                    ((p)object).x("pubSysKey", string);
                }
                b2.d.y((q)object);
                if (i2.f) {
                    b2.d.l = 2;
                }
                b2.l = s2;
            }
            return true;
        }
        b2.l = s2;
        return b2.D((N)object);
    }
}

