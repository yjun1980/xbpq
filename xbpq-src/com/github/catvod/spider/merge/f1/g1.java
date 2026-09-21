/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class g1
extends i1 {
    @Override
    final void l(S s2, a object) {
        block6: {
            block7: {
                block4: {
                    block5: {
                        char c2 = object.u();
                        if (c2 == '!') break block4;
                        if (c2 == '/') break block5;
                        if (c2 != '?') {
                            if (object.H()) {
                                s2.h(true);
                                object = i1.j;
                            } else {
                                s2.r(this);
                                s2.j('<');
                                object = i1.a;
                            }
                        } else {
                            s2.f();
                            object = i1.Q;
                        }
                        s2.v((i1)((Object)object));
                        break block6;
                    }
                    object = i1.i;
                    break block7;
                }
                object = i1.R;
            }
            s2.a((i1)((Object)object));
        }
    }
}

