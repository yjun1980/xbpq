/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.M;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class Q
extends g1 {
    @Override
    public final void d(P object, a a2) {
        block7: {
            block1: {
                block2: {
                    block3: {
                        Object object2;
                        block5: {
                            block4: {
                                block6: {
                                    char c2;
                                    int n2;
                                    a2.b();
                                    int n3 = a2.e;
                                    int n4 = a2.c;
                                    object2 = a2.a;
                                    for (n2 = n3; n2 < n4 && (c2 = object2[n2]) != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ' && c2 != '/' && c2 != '<' && c2 != '>'; ++n2) {
                                    }
                                    a2.e = n2;
                                    object2 = n2 > n3 ? (Object)com.github.catvod.spider.merge.xc.G0.a.c(a2.a, a2.h, n3, n2 - n3) : (Object)"";
                                    ((P)object).k.k((String)object2);
                                    char c3 = a2.e();
                                    if (c3 == '\u0000') break block1;
                                    if (c3 == ' ') break block2;
                                    if (c3 == '/') break block3;
                                    object2 = (Object)g1.a;
                                    if (c3 == '<') break block4;
                                    if (c3 == '>') break block5;
                                    if (c3 == '\uffff') break block6;
                                    if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r') break block2;
                                    object = ((P)object).k;
                                    object.getClass();
                                    ((M)object).k(String.valueOf(c3));
                                    break block7;
                                }
                                ((P)object).l(this);
                                ((P)object).o((g1)((Object)object2));
                                break block7;
                            }
                            a2.z();
                            ((P)object).m(this);
                        }
                        ((P)object).k();
                        ((P)object).o((g1)((Object)object2));
                        break block7;
                    }
                    ((P)object).o(g1.P);
                    break block7;
                }
                ((P)object).o(g1.H);
                break block7;
            }
            ((P)object).k.k(g1.r0);
        }
    }
}

