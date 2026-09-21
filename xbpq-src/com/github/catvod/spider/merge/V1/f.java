/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V1;

import com.github.catvod.spider.merge.V1.b;
import com.github.catvod.spider.merge.V1.c;
import com.github.catvod.spider.merge.V1.e;
import com.github.catvod.spider.merge.W1.a;

public final class f
extends b {
    private final com.github.catvod.spider.merge.U1.a m;
    private final a n;
    private final e o;
    private final c p = new c(this);
    private final c q = new c(this);

    public f(com.github.catvod.spider.merge.U1.a a2, a a3, int n2, int n3, int n4) {
        super(n4);
        this.m = a2;
        this.n = a3;
        this.o = new e(this, n2, n3);
        this.d();
    }

    static /* synthetic */ com.github.catvod.spider.merge.U1.a a(f f2) {
        return f2.m;
    }

    static /* synthetic */ a b(f f2) {
        return f2.n;
    }

    public final void c() {
        this.m.i();
        while (this.m.f()) {
            int n2;
            block12: {
                int n3;
                block14: {
                    Object object;
                    block13: {
                        int n4;
                        block11: {
                            n3 = this.m.d() & this.a;
                            if (this.n.a(this.d[this.c.a()], n3) == 0) {
                                this.o.b();
                                continue;
                            }
                            int n5 = this.n.a(this.e, this.c.a());
                            n2 = 3;
                            n4 = 1;
                            if (n5 != 0) break block11;
                            this.c.f();
                            object = this.b;
                            object[3] = object[2];
                            object[2] = object[1];
                            object[1] = object[0];
                            n4 = this.p.a(n3);
                            object = this.n;
                            short[][] sArray = this.j;
                            if (n4 < 6) {
                                n2 = n4 - 2;
                            }
                            if ((n2 = object.b(sArray[n2])) < 4) {
                                this.b[0] = n2;
                                n2 = n4;
                            } else {
                                n3 = (n2 >> 1) - 1;
                                object = this.b;
                                object[0] = (2 | n2 & 1) << n3;
                                if (n2 < 14) {
                                    n3 = object[0];
                                    object[0] = this.n.d(this.k[n2 - 4]) | n3;
                                    n2 = n4;
                                } else {
                                    object[0] = object[0] | this.n.c(n3 - 4) << 4;
                                    object = this.b;
                                    object[0] = object[0] | this.n.d(this.l);
                                    n2 = n4;
                                }
                            }
                            break block12;
                        }
                        if (this.n.a(this.f, this.c.a()) != 0) break block13;
                        if (this.n.a(this.i[this.c.a()], n3) != 0) break block14;
                        this.c.g();
                        n2 = n4;
                        break block12;
                    }
                    if (this.n.a(this.g, this.c.a()) == 0) {
                        n2 = this.b[1];
                    } else {
                        if (this.n.a(this.h, this.c.a()) == 0) {
                            n2 = this.b[2];
                        } else {
                            object = this.b;
                            n2 = object[3];
                            object[3] = object[2];
                        }
                        object = this.b;
                        object[2] = object[1];
                    }
                    object = this.b;
                    object[1] = object[0];
                    object[0] = n2;
                }
                this.c.e();
                n2 = this.q.a(n3);
            }
            this.m.h(this.b[0], n2);
        }
        this.n.f();
    }

    public final void d() {
        int n2;
        Object object = this.b;
        int n3 = 0;
        object[0] = 0;
        object[1] = 0;
        object[2] = 0;
        object[3] = 0;
        this.c.c();
        for (n2 = 0; n2 < ((int[])(object = (Object)this.d)).length; ++n2) {
            com.github.catvod.spider.merge.W1.a.e((short[])object[n2]);
        }
        com.github.catvod.spider.merge.W1.a.e(this.e);
        com.github.catvod.spider.merge.W1.a.e(this.f);
        com.github.catvod.spider.merge.W1.a.e(this.g);
        com.github.catvod.spider.merge.W1.a.e(this.h);
        for (n2 = 0; n2 < ((int[])(object = (Object)this.i)).length; ++n2) {
            com.github.catvod.spider.merge.W1.a.e((short[])object[n2]);
        }
        n2 = 0;
        while (true) {
            object = this.j;
            if (n2 >= ((int[])object).length) break;
            com.github.catvod.spider.merge.W1.a.e((short[])object[n2]);
            ++n2;
        }
        for (int i2 = n3; i2 < ((int[])(object = (Object)this.k)).length; ++i2) {
            com.github.catvod.spider.merge.W1.a.e((short[])object[i2]);
        }
        com.github.catvod.spider.merge.W1.a.e(this.l);
        this.o.c();
        this.p.b();
        this.q.b();
    }
}

