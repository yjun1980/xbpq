/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.i1;
import com.github.catvod.spider.merge.d0.w;
import com.github.catvod.spider.merge.d0.z;
import java.util.ArrayList;

final class c
extends A {
    @Override
    final boolean d(O object, b object2) {
        w w2 = A.i;
        if (((O)object).a == 5) {
            if (((H)(object = (H)object)).j().equals(A.c())) {
                ((b)object2).n(this);
                return false;
            }
            object2 = ((b)object2).v();
            object = ((H)object).j();
            ((ArrayList)object2).add(object);
            return true;
        }
        if (((ArrayList)((b)object2).v()).size() > 0) {
            for (String string : (ArrayList)((b)object2).v()) {
                H h2;
                if (!com.github.catvod.spider.merge.b0.b.c(string)) {
                    ((b)object2).n(this);
                    if (com.github.catvod.spider.merge.b0.b.b(((i1)object2).a().d0(), z.C)) {
                        ((b)object2).g0(true);
                        h2 = new H();
                        h2.i(string);
                        ((b)object2).X(h2, w2);
                        ((b)object2).g0(false);
                        continue;
                    }
                    h2 = new H();
                    h2.i(string);
                    ((b)object2).X(h2, w2);
                    continue;
                }
                h2 = new H();
                h2.i(string);
                ((b)object2).E(h2);
            }
            ((b)object2).R();
        }
        ((b)object2).j0(((b)object2).T());
        return ((b)object2).c((O)object);
    }
}

