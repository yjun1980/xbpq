/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class n0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block5: {
            block2: {
                block6: {
                    char c2;
                    block3: {
                        block4: {
                            c2 = object.u();
                            if (c2 == '\u0000') break block2;
                            if (c2 == '-') break block3;
                            if (c2 == '<') break block4;
                            if (c2 != '\uffff') {
                                s2.l(object.q('-', '<', '\u0000'));
                            } else {
                                s2.q(this);
                                s2.v(i1.a);
                            }
                            break block5;
                        }
                        s2.j(c2);
                        object = i1.F;
                        break block6;
                    }
                    s2.j(c2);
                    object = i1.D;
                }
                s2.a((i1)((Object)object));
                break block5;
            }
            s2.r(this);
            object.a();
            s2.j('\ufffd');
        }
    }
}

