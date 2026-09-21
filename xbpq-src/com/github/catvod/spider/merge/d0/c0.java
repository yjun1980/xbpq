/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.K;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;

final class c0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block5: {
            block2: {
                block6: {
                    block3: {
                        block4: {
                            char c2 = ((a)object).s();
                            if (c2 == '\u0000') break block2;
                            if (c2 == '&') break block3;
                            if (c2 == '<') break block4;
                            if (c2 != '\uffff') {
                                q2.k(((a)object).g());
                            } else {
                                q2.j(new K());
                            }
                            break block5;
                        }
                        object = h1.j;
                        break block6;
                    }
                    object = h1.d;
                }
                q2.a((h1)((Object)object));
                break block5;
            }
            q2.q(this);
            q2.i(((a)object).e());
        }
    }
}

