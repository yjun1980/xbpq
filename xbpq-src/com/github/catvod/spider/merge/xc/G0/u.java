/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.g1;
import com.github.catvod.spider.merge.xc.G0.y;
import com.github.catvod.spider.merge.xc.y0.a;

public final class u
extends B {
    @Override
    public final boolean c(N object, b object2) {
        block13: {
            block25: {
                block16: {
                    String string;
                    L l2;
                    block24: {
                        y y2;
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        block19: {
                                            block14: {
                                                block18: {
                                                    String string2;
                                                    block17: {
                                                        block15: {
                                                            if (B.a((N)object)) {
                                                                ((b)object2).s((G)object);
                                                                return true;
                                                            }
                                                            int n2 = com.github.catvod.spider.merge.xc.y0.a.a(((N)object).a);
                                                            if (n2 == 0) break block13;
                                                            if (n2 == 1) break block14;
                                                            if (n2 == 2) break block15;
                                                            if (n2 != 3) {
                                                                ((b)object2).F("head");
                                                                return ((b)object2).D((N)object);
                                                            }
                                                            ((b)object2).t((H)object);
                                                            break block16;
                                                        }
                                                        string2 = ((K)object).c;
                                                        if (!string2.equals("head")) break block17;
                                                        ((b)object2).A();
                                                        ((b)object2).l = B.f;
                                                        break block16;
                                                    }
                                                    if (com.github.catvod.spider.merge.xc.E0.b.c(string2, A.c)) {
                                                        ((b)object2).F("head");
                                                        return ((b)object2).D((N)object);
                                                    }
                                                    if (!string2.equals("template")) break block18;
                                                    if (!((b)object2).y(string2)) {
                                                        ((b)object2).h(this);
                                                    } else {
                                                        ((b)object2).j(true);
                                                        if (!string2.equals(((b)object2).f().d.b)) {
                                                            ((b)object2).h(this);
                                                        }
                                                        ((b)object2).B(string2);
                                                        ((b)object2).c();
                                                        ((b)object2).C();
                                                        ((b)object2).M();
                                                    }
                                                    break block16;
                                                }
                                                ((b)object2).h(this);
                                                return false;
                                            }
                                            l2 = (L)object;
                                            string = l2.c;
                                            if (string.equals("html")) {
                                                return B.g.c((N)object, (b)object2);
                                            }
                                            if (!com.github.catvod.spider.merge.xc.E0.b.c(string, A.a)) break block19;
                                            object = ((b)object2).u(l2);
                                            if (string.equals("base") && ((q)object).k("href") && !((b)object2).n && ((String)(object = ((q)object).a("href"))).length() != 0) {
                                                ((b)object2).f = object;
                                                ((b)object2).n = true;
                                                object2 = ((b)object2).d;
                                                object2.getClass();
                                                ((l)object2).D((String)object);
                                            }
                                            break block16;
                                        }
                                        if (!string.equals("meta")) break block20;
                                        ((b)object2).u(l2);
                                        break block16;
                                    }
                                    boolean bl = string.equals("title");
                                    y2 = B.h;
                                    if (!bl) break block21;
                                    ((b)object2).c.o(g1.c);
                                    ((b)object2).m = ((b)object2).l;
                                    ((b)object2).l = y2;
                                    ((b)object2).r(l2);
                                    break block16;
                                }
                                if (!com.github.catvod.spider.merge.xc.E0.b.c(string, A.b)) break block22;
                                B.b(l2, (b)object2);
                                break block16;
                            }
                            if (!string.equals("noscript")) break block23;
                            ((b)object2).r(l2);
                            ((b)object2).l = B.e;
                            break block16;
                        }
                        if (!string.equals("script")) break block24;
                        ((b)object2).c.o(g1.f);
                        ((b)object2).m = ((b)object2).l;
                        ((b)object2).l = y2;
                        ((b)object2).r(l2);
                        break block16;
                    }
                    if (string.equals("head")) {
                        ((b)object2).h(this);
                        return false;
                    }
                    if (!string.equals("template")) break block25;
                    ((b)object2).r(l2);
                    ((b)object2).q.add(null);
                    ((b)object2).u = false;
                    object = B.r;
                    ((b)object2).l = object;
                    ((b)object2).H((B)((Object)object));
                }
                return true;
            }
            ((b)object2).F("head");
            return ((b)object2).D((N)object);
        }
        ((b)object2).h(this);
        return false;
    }
}

