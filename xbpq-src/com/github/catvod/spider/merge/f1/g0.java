/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class g0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block4: {
            block1: {
                block5: {
                    block2: {
                        block3: {
                            if (object.w()) {
                                s2.q(this);
                                s2.v(i1.a);
                                return;
                            }
                            char c2 = object.u();
                            if (c2 == '\u0000') break block1;
                            if (c2 == '-') break block2;
                            if (c2 == '<') break block3;
                            s2.l(object.q('-', '<', '\u0000'));
                            break block4;
                        }
                        object = i1.y;
                        break block5;
                    }
                    s2.j('-');
                    object = i1.w;
                }
                s2.a((i1)((Object)object));
                break block4;
            }
            s2.r(this);
            object.a();
            s2.j('\ufffd');
        }
    }
}

