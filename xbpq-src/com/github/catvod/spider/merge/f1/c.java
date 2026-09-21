/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.j1;
import com.github.catvod.spider.merge.f1.x;
import java.util.ArrayList;

final class c
extends B {
    @Override
    final boolean i(P object, b object2) {
        x x2 = B.g;
        if (((P)object).a == 5) {
            if (((I)(object = (I)object)).l().equals(B.h())) {
                ((b)object2).r(this);
                return false;
            }
            object2 = ((b)object2).A();
            object = ((I)object).l();
            ((ArrayList)object2).add(object);
            return true;
        }
        if (((ArrayList)((b)object2).A()).size() > 0) {
            for (String string : (ArrayList)((b)object2).A()) {
                I i2;
                if (!com.github.catvod.spider.merge.d1.c.d(string)) {
                    ((b)object2).r(this);
                    if (com.github.catvod.spider.merge.d1.c.c(((j1)object2).a().g0(), A.A)) {
                        ((b)object2).o0(true);
                        i2 = new I();
                        i2.k(string);
                        ((b)object2).d0(i2, x2);
                        ((b)object2).o0(false);
                        continue;
                    }
                    i2 = new I();
                    i2.k(string);
                    ((b)object2).d0(i2, x2);
                    continue;
                }
                i2 = new I();
                i2.k(string);
                ((b)object2).I(i2);
            }
            ((b)object2).U();
        }
        ((b)object2).s0(((b)object2).Y());
        return ((b)object2).e((P)object);
    }
}

