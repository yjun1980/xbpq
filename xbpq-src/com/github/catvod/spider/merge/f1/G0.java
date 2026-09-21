/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.H0;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class G0
extends i1 {
    @Override
    final void l(S s2, a a2) {
        block6: {
            H0 h02;
            block4: {
                block0: {
                    block1: {
                        d0 d02;
                        block5: {
                            block2: {
                                block3: {
                                    d02 = i1.a;
                                    h02 = i1.U;
                                    char c2 = a2.f();
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '-') break block1;
                                    if (c2 == '>') break block2;
                                    if (c2 == '\uffff') break block3;
                                    s2.n.k(c2);
                                    break block4;
                                }
                                s2.q(this);
                                break block5;
                            }
                            s2.r(this);
                        }
                        s2.n();
                        s2.v(d02);
                        break block6;
                    }
                    s2.v(i1.W);
                    break block6;
                }
                s2.r(this);
                s2.n.k('\ufffd');
            }
            s2.v(h02);
        }
    }
}

