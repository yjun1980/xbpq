/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class O0
extends i1 {
    @Override
    final void l(S object, a object2) {
        block6: {
            char c2;
            block5: {
                block1: {
                    block2: {
                        d0 d02;
                        block3: {
                            block4: {
                                d02 = i1.a;
                                if (((a)object2).J()) {
                                    object2 = ((a)object2).k();
                                    ((S)object).m.d.append((String)object2);
                                    return;
                                }
                                c2 = ((a)object2).f();
                                if (c2 == '\u0000') break block1;
                                if (c2 == ' ') break block2;
                                if (c2 == '>') break block3;
                                if (c2 == '\uffff') break block4;
                                if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13) break block2;
                                object = ((S)object).m.d;
                                break block5;
                            }
                            ((S)object).q(this);
                            ((S)object).m.h = true;
                        }
                        ((S)object).o();
                        ((S)object).v(d02);
                        break block6;
                    }
                    ((S)object).v(i1.b0);
                    break block6;
                }
                ((S)object).r(this);
                object = ((S)object).m.d;
                c2 = '\ufffd';
            }
            ((StringBuilder)object).append(c2);
        }
    }
}

