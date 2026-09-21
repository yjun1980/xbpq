/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.g0;
import com.github.catvod.spider.merge.f1.i1;

final class i0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block6: {
            g0 g02;
            block4: {
                block1: {
                    char c2;
                    block2: {
                        block5: {
                            block3: {
                                g02 = i1.v;
                                if (object.w()) {
                                    s2.q(this);
                                    s2.v(i1.a);
                                    return;
                                }
                                c2 = object.f();
                                if (c2 == '\u0000') break block1;
                                if (c2 == '-') break block2;
                                if (c2 == '<') break block3;
                                s2.j(c2);
                                if (c2 != '>') break block4;
                                object = i1.f;
                                break block5;
                            }
                            object = i1.y;
                        }
                        s2.v((i1)((Object)object));
                        break block6;
                    }
                    s2.j(c2);
                    break block6;
                }
                s2.r(this);
                s2.j('\ufffd');
            }
            s2.v(g02);
        }
    }
}

