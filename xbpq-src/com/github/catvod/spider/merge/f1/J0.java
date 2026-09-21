/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.H0;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class J0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block6: {
            H0 h02;
            block5: {
                block0: {
                    block1: {
                        block2: {
                            d0 d02;
                            block3: {
                                block4: {
                                    d02 = i1.a;
                                    h02 = i1.U;
                                    char c2 = ((a)object).f();
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '!') break block1;
                                    if (c2 == '-') break block2;
                                    if (c2 == '>') break block3;
                                    if (c2 == '\uffff') break block4;
                                    object = s2.n;
                                    ((J)object).l("--");
                                    ((J)object).k(c2);
                                    break block5;
                                }
                                s2.q(this);
                            }
                            s2.n();
                            s2.v(d02);
                            break block6;
                        }
                        s2.n.k('-');
                        break block6;
                    }
                    s2.v(i1.X);
                    break block6;
                }
                s2.r(this);
                object = s2.n;
                ((J)object).l("--");
                ((J)object).k('\ufffd');
            }
            s2.v(h02);
        }
    }
}

