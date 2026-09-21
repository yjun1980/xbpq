/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class f1
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block5: {
            block6: {
                block2: {
                    block3: {
                        block4: {
                            char c2 = object.s();
                            if (c2 == '!') break block2;
                            if (c2 == '/') break block3;
                            if (c2 == '?') break block4;
                            if (object.C()) {
                                q2.g(true);
                                object = h1.l;
                            } else {
                                q2.q(this);
                                q2.i('<');
                                object = h1.c;
                            }
                            q2.u((h1)((Object)object));
                            break block5;
                        }
                        q2.e();
                        object = h1.S;
                        break block6;
                    }
                    object = h1.k;
                    break block6;
                }
                object = h1.T;
            }
            q2.a((h1)((Object)object));
        }
    }
}

