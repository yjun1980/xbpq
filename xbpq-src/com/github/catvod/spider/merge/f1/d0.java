/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.L;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class d0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block5: {
            block2: {
                block6: {
                    block3: {
                        block4: {
                            char c2 = ((a)object).u();
                            if (c2 == '\u0000') break block2;
                            if (c2 == '&') break block3;
                            if (c2 == '<') break block4;
                            if (c2 != '\uffff') {
                                s2.l(((a)object).h());
                            } else {
                                s2.k(new L());
                            }
                            break block5;
                        }
                        object = i1.h;
                        break block6;
                    }
                    object = i1.b;
                }
                s2.a((i1)((Object)object));
                break block5;
            }
            s2.r(this);
            s2.j(((a)object).f());
        }
    }
}

