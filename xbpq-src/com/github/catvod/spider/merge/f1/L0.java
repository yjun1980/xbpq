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

final class L0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block5: {
            H0 h02;
            block4: {
                block0: {
                    block1: {
                        d0 d02;
                        block2: {
                            block3: {
                                d02 = i1.a;
                                h02 = i1.U;
                                char c2 = ((a)object).f();
                                if (c2 == '\u0000') break block0;
                                if (c2 == '-') break block1;
                                if (c2 == '>') break block2;
                                if (c2 == '\uffff') break block3;
                                object = s2.n;
                                ((J)object).l("--!");
                                ((J)object).k(c2);
                                break block4;
                            }
                            s2.q(this);
                        }
                        s2.n();
                        s2.v(d02);
                        break block5;
                    }
                    s2.n.l("--!");
                    s2.v(i1.V);
                    break block5;
                }
                s2.r(this);
                object = s2.n;
                ((J)object).l("--!");
                ((J)object).k('\ufffd');
            }
            s2.v(h02);
        }
    }
}

