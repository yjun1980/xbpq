/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.N;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class w0
extends h1 {
    @Override
    final void g(Q object, a object2) {
        block10: {
            char c2;
            block8: {
                block4: {
                    block9: {
                        block5: {
                            block6: {
                                block7: {
                                    String string = object2.f(false);
                                    if (string.length() > 0) {
                                        ((Q)object).i.l(string);
                                    } else {
                                        ((Q)object).i.w();
                                    }
                                    c2 = object2.e();
                                    if (c2 == '\u0000') break block4;
                                    if (c2 == '\"') break block5;
                                    if (c2 == '&') break block6;
                                    if (c2 == 65535) break block7;
                                    object = ((Q)object).i;
                                    break block8;
                                }
                                ((Q)object).p(this);
                                object2 = h1.c;
                                break block9;
                            }
                            object2 = ((Q)object).d(Character.valueOf('\"'), true);
                            object = ((Q)object).i;
                            if (object2 != null) {
                                ((N)object).m((int[])object2);
                            } else {
                                ((N)object).k('&');
                            }
                            break block10;
                        }
                        object2 = h1.Q;
                    }
                    ((Q)object).u((h1)((Object)object2));
                    break block10;
                }
                ((Q)object).q(this);
                object = ((Q)object).i;
                c2 = '\ufffd';
            }
            ((N)object).k(c2);
        }
    }
}

