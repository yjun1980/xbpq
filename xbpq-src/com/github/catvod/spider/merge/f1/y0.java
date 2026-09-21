/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.O;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class y0
extends i1 {
    @Override
    final void l(S object, a object2) {
        block10: {
            char c2;
            block8: {
                block4: {
                    block9: {
                        block5: {
                            block6: {
                                block7: {
                                    String string = object2.g(true);
                                    if (string.length() > 0) {
                                        ((S)object).k.n(string);
                                    } else {
                                        ((S)object).k.z();
                                    }
                                    c2 = object2.f();
                                    if (c2 == '\u0000') break block4;
                                    if (c2 == '\uffff') break block5;
                                    if (c2 == '&') break block6;
                                    if (c2 == 39) break block7;
                                    object = ((S)object).k;
                                    break block8;
                                }
                                object2 = i1.O;
                                break block9;
                            }
                            object2 = ((S)object).e(Character.valueOf('\''), true);
                            object = ((S)object).k;
                            if (object2 != null) {
                                ((O)object).o((int[])object2);
                            } else {
                                ((O)object).m('&');
                            }
                            break block10;
                        }
                        ((S)object).q(this);
                        object2 = i1.a;
                    }
                    ((S)object).v((i1)((Object)object2));
                    break block10;
                }
                ((S)object).r(this);
                object = ((S)object).k;
                c2 = '\ufffd';
            }
            ((O)object).m(c2);
        }
    }
}

