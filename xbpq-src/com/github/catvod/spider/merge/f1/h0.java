/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.g0;
import com.github.catvod.spider.merge.f1.i1;

final class h0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block5: {
            char c2;
            g0 g02;
            block3: {
                block1: {
                    block4: {
                        block2: {
                            g02 = i1.v;
                            if (object.w()) {
                                s2.q(this);
                                s2.v(i1.a);
                                return;
                            }
                            c2 = object.f();
                            if (c2 == '\u0000') break block1;
                            if (c2 == '-') break block2;
                            if (c2 != '<') break block3;
                            object = i1.y;
                            break block4;
                        }
                        s2.j(c2);
                        object = i1.x;
                    }
                    s2.v((i1)((Object)object));
                    break block5;
                }
                s2.r(this);
                c2 = '\ufffd';
            }
            s2.j(c2);
            s2.v(g02);
        }
    }
}

