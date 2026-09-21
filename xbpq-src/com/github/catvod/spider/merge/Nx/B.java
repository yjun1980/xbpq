/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.Nx.A
 *  com.github.catvod.spider.merge.Nx.Q
 *  com.github.catvod.spider.merge.Nx.W
 *  com.github.catvod.spider.merge.Nx.X
 *  com.github.catvod.spider.merge.Nx.b
 *  com.github.catvod.spider.merge.Nx.e0
 *  com.github.catvod.spider.merge.Nx.f0
 *  com.github.catvod.spider.merge.Nx.m
 *  com.github.catvod.spider.merge.Nx.n0
 *  com.github.catvod.spider.merge.Nx.o
 *  com.github.catvod.spider.merge.Nx.w
 *  com.github.catvod.spider.merge.Nx.z
 */
package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Dw.k;
import com.github.catvod.spider.merge.Nx.A;
import com.github.catvod.spider.merge.Nx.D;
import com.github.catvod.spider.merge.Nx.Q;
import com.github.catvod.spider.merge.Nx.W;
import com.github.catvod.spider.merge.Nx.X;
import com.github.catvod.spider.merge.Nx.Y;
import com.github.catvod.spider.merge.Nx.a;
import com.github.catvod.spider.merge.Nx.b;
import com.github.catvod.spider.merge.Nx.e0;
import com.github.catvod.spider.merge.Nx.f;
import com.github.catvod.spider.merge.Nx.f0;
import com.github.catvod.spider.merge.Nx.l;
import com.github.catvod.spider.merge.Nx.m;
import com.github.catvod.spider.merge.Nx.n0;
import com.github.catvod.spider.merge.Nx.o;
import com.github.catvod.spider.merge.Nx.w;
import com.github.catvod.spider.merge.Nx.z;
import com.github.catvod.spider.merge.gu.d;
import com.github.catvod.spider.merge.gu.s;
import com.github.catvod.spider.merge.gu.t;
import java.util.ArrayList;
import java.util.HashMap;

public final class B
extends l {
    protected final s d;
    protected int e = -1;
    protected int f = 1;
    protected int g = 0;
    public final k[] h;
    protected int i = 0;
    protected final A j = new A();

    public B(s s2, a a2, k[] kArray, Y y2) {
        super(a2, y2);
        this.h = kArray;
        this.d = s2;
    }

    @Override
    public final void a() {
        A a2 = this.j;
        a2.a = -1;
        a2.b = 0;
        a2.c = -1;
        a2.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void b(com.github.catvod.spider.merge.Dw.m m2, int n2, com.github.catvod.spider.merge.Dw.m m3) {
        if (n2 < 0) return;
        if (n2 > 127) {
            return;
        }
        synchronized (m2) {
            if (m2.c == null) {
                m2.c = new com.github.catvod.spider.merge.Dw.m[128];
            }
            m2.c[n2 + 0] = m3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final com.github.catvod.spider.merge.Dw.m c(f f2) {
        Object object2;
        com.github.catvod.spider.merge.Dw.m m2;
        block6: {
            m2 = new com.github.catvod.spider.merge.Dw.m(f2);
            for (Object object2 : f2) {
                if (!(object2.a instanceof e0)) continue;
                break block6;
            }
            object2 = null;
        }
        if (object2 != null) {
            m2.d = true;
            m2.f = ((z)object2).e();
            m2.e = this.a.g[object2.a.c];
        }
        k k2 = this.h[this.i];
        object2 = k2.a;
        synchronized (object2) {
            com.github.catvod.spider.merge.Dw.m m3 = (com.github.catvod.spider.merge.Dw.m)((HashMap)k2.a).get(m2);
            if (m3 != null) {
                return m3;
            }
            m2.a = ((HashMap)k2.a).size();
            f2.c = true;
            f2.d = null;
            m2.b = f2;
            ((HashMap)k2.a).put(m2, m2);
            return m2;
        }
    }

    protected final boolean d(d d2, z z2, f f2, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4;
        m m2;
        block23: {
            block25: {
                block24: {
                    m2 = z2.a;
                    boolean bl5 = m2 instanceof e0;
                    bl4 = true;
                    if (!bl5) break block23;
                    m2 = z2.c;
                    if (m2 != null && !m2.e()) break block24;
                    m2 = z2.c;
                    if (m2 == null || m2.f()) break block25;
                    f2.a((b)new z(z2, z2.a, (X)X.b), null);
                    bl = bl4;
                }
                m2 = z2.c;
                bl4 = bl;
                if (m2 != null) {
                    bl4 = bl;
                    if (!m2.f()) {
                        for (int i2 = 0; i2 < z2.c.h(); ++i2) {
                            bl4 = bl;
                            if (z2.c.d(i2) != Integer.MAX_VALUE) {
                                m2 = z2.c.c(i2);
                                bl4 = this.d(d2, new z(z2, (m)((ArrayList)this.a.a).get(z2.c.d(i2)), (X)m2), f2, bl, bl2, bl3);
                            }
                            bl = bl4;
                        }
                        bl4 = bl;
                    }
                }
                return bl4;
            }
            f2.a((b)z2, null);
            return true;
        }
        if (!(m2.d || bl && z2.f())) {
            f2.a((b)z2, null);
        }
        m m3 = z2.a;
        for (int i4 = 0; i4 < m3.b(); ++i4) {
            block26: {
                block27: {
                    m2 = m3.d(i4);
                    int n2 = m2.a();
                    if (n2 == 10) break block26;
                    switch (n2) {
                        default: {
                            break;
                        }
                        case 6: {
                            Object object = z2.c;
                            if (object != null && !object.e()) {
                                m2 = new z(z2, m2.a);
                            } else {
                                object = D.a(z2.e(), this.a.h[((o)m2).c]);
                                m2 = new z(z2, m2.a, (D)object);
                            }
                            break block27;
                        }
                        case 4: {
                            int n3;
                            int n4;
                            Object object = (W)m2;
                            f2.h = true;
                            if (this.d != null && bl2) {
                                n2 = this.g;
                                n4 = this.f;
                                n3 = d2.i();
                                d2.g();
                                this.e(d2);
                                this.d.getClass();
                            }
                            m2 = new z(z2, m2.a);
                            break block27;
                            finally {
                                this.g = n2;
                                this.f = n4;
                                d2.d(n3);
                                d2.a();
                            }
                        }
                        case 3: {
                            Object object = (f0)m2;
                            object = n0.i((X)z2.c, (int)object.c.b);
                            m2 = new z(z2, m2.a, object);
                            break block27;
                        }
                        case 2: 
                        case 5: 
                        case 7: {
                            if (!bl3 || !m2.d(-1, 0x10FFFF)) break;
                            m2 = new z(z2, m2.a);
                            break block27;
                        }
                        case 1: {
                            m2 = new z(z2, m2.a);
                            break block27;
                        }
                    }
                    m2 = null;
                }
                bl4 = bl;
                if (m2 != null) {
                    bl4 = this.d(d2, (z)m2, f2, bl, bl2, bl3);
                }
                bl = bl4;
                continue;
            }
            throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
        }
        return bl;
    }

    public final void e(d d2) {
        if (d2.f(1) == 10) {
            ++this.f;
            this.g = 0;
        } else {
            ++this.g;
        }
        d2.j();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final int f(d var1_1, com.github.catvod.spider.merge.Dw.m var2_2) {
        if (var2_2 /* !! */ .d) {
            var10_3 = this.j;
            var10_3.a = var1_1.i();
            var10_3.b = this.f;
            var10_3.c = this.g;
            var10_3.d = var2_2 /* !! */ ;
        }
        var5_4 = var1_1.f(1);
        var11_5 /* !! */  = var2_2 /* !! */ ;
        while (true) {
            block20: {
                block23: {
                    block22: {
                        block21: {
                            block19: {
                                var2_2 /* !! */  = (var2_2 /* !! */  = var11_5 /* !! */ .c) != null && var5_4 >= 0 && var5_4 <= 127 ? var2_2 /* !! */ [var5_4 + 0] : null;
                                var10_3 = var2_2 /* !! */ ;
                                if (var2_2 /* !! */  != null) ** GOTO lbl51
                                var15_15 = new Q();
                                var14_14 = var11_5 /* !! */ .b.iterator();
                                var3_6 = 0;
                                block1: while (var14_14.hasNext()) {
                                    var2_2 /* !! */  = var14_14.next();
                                    var8_10 = var2_2 /* !! */ .b == var3_6;
                                    if (var8_10 && ((z)var2_2 /* !! */ ).f()) {
                                        var4_7 = var3_6;
                                    } else {
                                        var6_8 = var2_2 /* !! */ .a.b();
                                        var7_9 = 0;
                                        while (true) {
                                            var4_7 = var3_6;
                                            if (var7_9 >= var6_8) break;
                                            var10_3 = var2_2 /* !! */ .a.d(var7_9);
                                            var10_3 = var10_3.d(var5_4, 0x10FFFF) != false ? var10_3.a : null;
                                            if (var10_3 != null) {
                                                var16_16 = (z)var2_2 /* !! */ ;
                                                var12_12 = var13_13 = var16_16.e();
                                                if (var13_13 != null) {
                                                    var12_12 = var13_13.c(var1_1.i() - this.e);
                                                }
                                                if (this.d(var1_1, new z(var16_16, (m)var10_3, var12_12), (f)var15_15, var8_10, true, var9_11 = var5_4 == -1)) {
                                                    var3_6 = var2_2 /* !! */ .b;
                                                    continue block1;
                                                }
                                            }
                                            ++var7_9;
                                        }
                                    }
                                    var3_6 = var4_7;
                                }
                                if (!var15_15.isEmpty()) {
                                    var8_10 = var15_15.h;
                                    var15_15.h = false;
                                    var2_2 /* !! */  = this.c((f)var15_15);
                                    if (!var8_10) {
                                        this.b((com.github.catvod.spider.merge.Dw.m)var11_5 /* !! */ , var5_4, (com.github.catvod.spider.merge.Dw.m)var2_2 /* !! */ );
                                    }
                                } else {
                                    if (!var15_15.h) {
                                        this.b((com.github.catvod.spider.merge.Dw.m)var11_5 /* !! */ , var5_4, l.c);
                                    }
                                    var10_3 = l.c;
lbl51:
                                    // 2 sources

                                    var2_2 /* !! */  = var10_3;
                                }
                                if (var2_2 /* !! */  == l.c) break block19;
                                if (var5_4 != -1) {
                                    this.e(var1_1);
                                }
                                if (!var2_2 /* !! */ .d) break block20;
                                var10_3 = this.j;
                                var10_3.a = var1_1.i();
                                var10_3.b = this.f;
                                var10_3.c = this.g;
                                var10_3.d = var2_2 /* !! */ ;
                                if (var5_4 != -1) break block20;
                            }
                            var2_2 /* !! */  = this.j;
                            var10_3 = var2_2 /* !! */ .d;
                            if (var10_3 == null) break block21;
                            var10_3 = var10_3.f;
                            var6_8 = this.e;
                            var5_4 = var2_2 /* !! */ .a;
                            var3_6 = var2_2 /* !! */ .b;
                            var4_7 = var2_2 /* !! */ .c;
                            var1_1.d(var5_4);
                            this.f = var3_6;
                            this.g = var4_7;
                            if (var10_3 != null && (var11_5 /* !! */  = this.d) != null) {
                                var10_3.b((s)var11_5 /* !! */ , var1_1, var6_8);
                            }
                            var3_6 = var2_2 /* !! */ .d.e;
                            break block22;
                        }
                        if (var5_4 != -1 || var1_1.i() != this.e) break block23;
                        var3_6 = -1;
                    }
                    return var3_6;
                }
                throw new t(this.d, var1_1, this.e);
            }
            var5_4 = var1_1.f(1);
            var11_5 /* !! */  = var2_2 /* !! */ ;
        }
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.f;
    }

    public final int i(d d2, int n2) {
        this.i = n2;
        d2.g();
        try {
            this.e = d2.i();
            Object object = this.j;
            object.a = -1;
            object.b = 0;
            object.c = -1;
            object.d = null;
            object = this.h[n2];
            if (object.b == null) {
                n2 = this.j(d2);
                return n2;
            }
            n2 = this.f(d2, object.b);
            return n2;
        }
        finally {
            d2.a();
        }
    }

    protected final int j(d d2) {
        Object object;
        m m2 = (m)((ArrayList)this.a.i).get(this.i);
        w w2 = X.b;
        Q q2 = new Q();
        int n2 = 0;
        while (n2 < m2.b()) {
            object = m2.d((int)n2).a;
            this.d(d2, new z(object, ++n2, (X)w2), (f)q2, false, false, false);
        }
        boolean bl = q2.h;
        q2.h = false;
        object = this.c((f)q2);
        if (!bl) {
            this.h[this.i].b = object;
        }
        return this.f(d2, (com.github.catvod.spider.merge.Dw.m)object);
    }
}

