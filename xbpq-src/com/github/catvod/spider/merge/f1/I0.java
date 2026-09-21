/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.H0;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class I0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block5: {
            H0 h02;
            block3: {
                block0: {
                    block4: {
                        block1: {
                            block2: {
                                h02 = i1.U;
                                char c2 = ((a)object).f();
                                if (c2 == '\u0000') break block0;
                                if (c2 == '-') break block1;
                                if (c2 == '\uffff') break block2;
                                object = s2.n;
                                ((J)object).k('-');
                                ((J)object).k(c2);
                                break block3;
                            }
                            s2.q(this);
                            s2.n();
                            object = i1.a;
                            break block4;
                        }
                        object = i1.W;
                    }
                    s2.v((i1)((Object)object));
                    break block5;
                }
                s2.r(this);
                object = s2.n;
                ((J)object).k('-');
                ((J)object).k('\ufffd');
            }
            s2.v(h02);
        }
    }
}

