/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.M;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.u;
import com.github.catvod.spider.merge.xc.G0.x;

public final class n
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        block25: {
            block21: {
                block24: {
                    block23: {
                        block22: {
                            block20: {
                                if (!B.a(n2)) break block20;
                                b2.s((G)n2);
                                break block21;
                            }
                            if (!n2.a()) break block22;
                            b2.t((H)n2);
                            break block21;
                        }
                        if (n2.b()) {
                            b2.h(this);
                            return false;
                        }
                        if (!n2.e()) break block23;
                        n2 = (L)n2;
                        Object object = ((M)n2).c;
                        object.getClass();
                        int n3 = -1;
                        switch (((String)object).hashCode()) {
                            default: {
                                break;
                            }
                            case 1192721831: {
                                if (!((String)object).equals("noframes")) break;
                                n3 = 3;
                                break;
                            }
                            case 97692013: {
                                if (!((String)object).equals("frame")) break;
                                n3 = 2;
                                break;
                            }
                            case 3213227: {
                                if (!((String)object).equals("html")) break;
                                n3 = 1;
                                break;
                            }
                            case -1644953643: {
                                if (!((String)object).equals("frameset")) break;
                                n3 = 0;
                            }
                        }
                        switch (n3) {
                            default: {
                                b2.h(this);
                                return false;
                            }
                            case 3: {
                                object = B.d;
                                b2.g = n2;
                                return ((u)((Object)object)).c(n2, b2);
                            }
                            case 2: {
                                b2.u((L)n2);
                                break;
                            }
                            case 1: {
                                object = B.g;
                                b2.g = n2;
                                return ((x)((Object)object)).c(n2, b2);
                            }
                            case 0: {
                                b2.r((L)n2);
                                break;
                            }
                        }
                        break block21;
                    }
                    if (!n2.d() || !((K)n2).c.equals("frameset")) break block24;
                    if (b2.g("html")) {
                        b2.h(this);
                        return false;
                    }
                    b2.A();
                    if (!b2.g("frameset")) {
                        b2.l = B.u;
                    }
                    break block21;
                }
                if (!n2.c()) break block25;
                if (!b2.g("html")) {
                    b2.h(this);
                }
            }
            return true;
        }
        b2.h(this);
        return false;
    }
}

