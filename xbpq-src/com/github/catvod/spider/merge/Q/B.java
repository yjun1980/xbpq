/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.P.d;
import com.github.catvod.spider.merge.P.s;
import com.github.catvod.spider.merge.P.t;
import com.github.catvod.spider.merge.Q.A;
import com.github.catvod.spider.merge.Q.D;
import com.github.catvod.spider.merge.Q.Q;
import com.github.catvod.spider.merge.Q.W;
import com.github.catvod.spider.merge.Q.X;
import com.github.catvod.spider.merge.Q.Y;
import com.github.catvod.spider.merge.Q.a;
import com.github.catvod.spider.merge.Q.b;
import com.github.catvod.spider.merge.Q.e0;
import com.github.catvod.spider.merge.Q.f;
import com.github.catvod.spider.merge.Q.f0;
import com.github.catvod.spider.merge.Q.l;
import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.n0;
import com.github.catvod.spider.merge.Q.o;
import com.github.catvod.spider.merge.Q.t0;
import com.github.catvod.spider.merge.Q.z;
import com.github.catvod.spider.merge.R.e;
import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class B
extends l {
    protected final s d;
    protected int e = -1;
    protected int f = 1;
    protected int g = 0;
    public final com.github.catvod.spider.merge.R.b[] h;
    protected int i = 0;
    protected final A j = new A();

    public B(s s2, a a2, com.github.catvod.spider.merge.R.b[] bArray, Y y2) {
        super(a2, y2);
        this.h = bArray;
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
    protected final void b(e e2, int n2, e e3) {
        if (n2 < 0) return;
        if (n2 > 127) {
            return;
        }
        synchronized (e2) {
            if (e2.c == null) {
                e2.c = new e[128];
            }
            e2.c[n2 + 0] = e3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final e c(f f2) {
        Object object2;
        e e2;
        block6: {
            e2 = new e(f2);
            for (Object object2 : f2) {
                if (!(((b)object2).a instanceof e0)) continue;
                break block6;
            }
            object2 = null;
        }
        if (object2 != null) {
            e2.d = true;
            e2.f = ((z)object2).e();
            e2.e = this.a.g[((b)object2).a.c];
        }
        com.github.catvod.spider.merge.R.b b2 = this.h[this.i];
        object2 = b2.a;
        synchronized (object2) {
            e e3 = (e)((HashMap)b2.a).get(e2);
            if (e3 != null) {
                return e3;
            }
            e2.a = ((HashMap)b2.a).size();
            f2.c = true;
            f2.d = null;
            e2.b = f2;
            ((HashMap)b2.a).put(e2, e2);
            return e2;
        }
    }

    protected final boolean d(d d2, z z2, f f2, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4;
        Object object;
        block23: {
            block25: {
                block24: {
                    object = z2.a;
                    boolean bl5 = object instanceof e0;
                    bl4 = true;
                    if (!bl5) break block23;
                    object = z2.c;
                    if (object != null && !((X)object).e()) break block24;
                    object = z2.c;
                    if (object == null || ((X)object).f()) break block25;
                    f2.a(new z(z2, z2.a, (X)X.b), null);
                    bl = bl4;
                }
                object = z2.c;
                bl4 = bl;
                if (object != null) {
                    bl4 = bl;
                    if (!((X)object).f()) {
                        for (int i2 = 0; i2 < z2.c.h(); ++i2) {
                            bl4 = bl;
                            if (z2.c.d(i2) != Integer.MAX_VALUE) {
                                object = z2.c.c(i2);
                                bl4 = this.d(d2, new z(z2, (m)((ArrayList)this.a.a).get(z2.c.d(i2)), (X)object), f2, bl, bl2, bl3);
                            }
                            bl = bl4;
                        }
                        bl4 = bl;
                    }
                }
                return bl4;
            }
            f2.a(z2, null);
            return true;
        }
        if (!(((m)object).d || bl && z2.f())) {
            f2.a(z2, null);
        }
        m m2 = z2.a;
        bl4 = bl;
        for (int i3 = 0; i3 < m2.b(); ++i3) {
            block26: {
                block27: {
                    object = m2.d(i3);
                    int n2 = ((t0)object).a();
                    if (n2 == 10) break block26;
                    switch (n2) {
                        default: {
                            break;
                        }
                        case 6: {
                            Object object2 = z2.c;
                            if (object2 != null && !((X)object2).e()) {
                                object = new z(z2, ((t0)object).a);
                            } else {
                                object2 = D.a(z2.e(), this.a.h[((o)object).c]);
                                object = new z(z2, ((t0)object).a, (D)object2);
                            }
                            break block27;
                        }
                        case 4: {
                            int n3;
                            int n4;
                            Object object2 = (W)object;
                            f2.h = true;
                            if (this.d != null && bl2) {
                                n4 = this.g;
                                n3 = this.f;
                                n2 = d2.i();
                                d2.g();
                                this.e(d2);
                                this.d.getClass();
                            }
                            object = new z(z2, ((t0)object).a);
                            break block27;
                            finally {
                                this.g = n4;
                                this.f = n3;
                                d2.d(n2);
                                d2.a();
                            }
                        }
                        case 3: {
                            Object object2 = (f0)object;
                            object2 = n0.i(z2.c, ((f0)object2).c.b);
                            object = new z(z2, ((t0)object).a, (X)object2);
                            break block27;
                        }
                        case 2: 
                        case 5: 
                        case 7: {
                            if (!bl3 || !((t0)object).d(-1, 0x10FFFF)) break;
                            object = new z(z2, ((t0)object).a);
                            break block27;
                        }
                        case 1: {
                            object = new z(z2, ((t0)object).a);
                            break block27;
                        }
                    }
                    object = null;
                }
                bl = bl4;
                if (object != null) {
                    bl = this.d(d2, (z)object, f2, bl4, bl2, bl3);
                }
                bl4 = bl;
                continue;
            }
            throw new UnsupportedOperationException(cYh.d("37222432323E023E2234772A15352538343B13353271362802702F3E237A142531213828133525713E34473C24293228147E"));
        }
        return bl4;
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

    protected final int f(d d2, e object) {
        Object object2;
        if (object.d) {
            object2 = this.j;
            ((A)object2).a = d2.i();
            ((A)object2).b = this.f;
            ((A)object2).c = this.g;
            ((A)object2).d = object;
        }
        int n2 = d2.f(1);
        Object object3 = object;
        while (true) {
            block20: {
                block23: {
                    int n3;
                    block22: {
                        block21: {
                            int n4;
                            int n5;
                            block19: {
                                object2 = (object = ((e)object3).c) != null && n2 >= 0 && n2 <= 127 ? object[n2 + 0] : null;
                                object = object2;
                                if (object2 == null) {
                                    boolean bl;
                                    Q q2 = new Q();
                                    Iterator<b> iterator = ((e)object3).b.iterator();
                                    n3 = 0;
                                    block1: while (iterator.hasNext()) {
                                        object = iterator.next();
                                        bl = object.b == n3;
                                        if (bl && ((z)object).f()) {
                                            n5 = n3;
                                        } else {
                                            n4 = object.a.b();
                                            int n6 = 0;
                                            while (true) {
                                                n5 = n3;
                                                if (n6 >= n4) break;
                                                object2 = object.a.d(n6);
                                                object2 = ((t0)object2).d(n2, 0x10FFFF) ? ((t0)object2).a : null;
                                                if (object2 != null) {
                                                    boolean bl2;
                                                    D d3;
                                                    z z2 = (z)object;
                                                    D d4 = d3 = z2.e();
                                                    if (d3 != null) {
                                                        d4 = d3.c(d2.i() - this.e);
                                                    }
                                                    if (this.d(d2, new z(z2, (m)object2, d4), q2, bl, true, bl2 = n2 == -1)) {
                                                        n3 = object.b;
                                                        continue block1;
                                                    }
                                                }
                                                ++n6;
                                            }
                                        }
                                        n3 = n5;
                                    }
                                    if (q2.isEmpty()) {
                                        if (!q2.h) {
                                            this.b((e)object3, n2, l.c);
                                        }
                                        object = l.c;
                                    } else {
                                        bl = q2.h;
                                        q2.h = false;
                                        object = this.c(q2);
                                        if (!bl) {
                                            this.b((e)object3, n2, (e)object);
                                        }
                                    }
                                }
                                if (object == l.c) break block19;
                                if (n2 != -1) {
                                    this.e(d2);
                                }
                                if (!object.d) break block20;
                                object2 = this.j;
                                ((A)object2).a = d2.i();
                                ((A)object2).b = this.f;
                                ((A)object2).c = this.g;
                                ((A)object2).d = object;
                                if (n2 != -1) break block20;
                            }
                            object = this.j;
                            object2 = object.d;
                            if (object2 == null) break block21;
                            object3 = ((e)object2).f;
                            n3 = this.e;
                            n4 = object.a;
                            n5 = object.b;
                            n2 = object.c;
                            d2.d(n4);
                            this.f = n5;
                            this.g = n2;
                            if (object3 != null && (object2 = this.d) != null) {
                                ((D)object3).b((s)object2, d2, n3);
                            }
                            n3 = object.d.e;
                            break block22;
                        }
                        if (n2 != -1 || d2.i() != this.e) break block23;
                        n3 = -1;
                    }
                    return n3;
                }
                throw new t(this.d, d2, this.e);
            }
            n2 = d2.f(1);
            object3 = object;
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
            ((A)object).a = -1;
            ((A)object).b = 0;
            ((A)object).c = -1;
            ((A)object).d = null;
            object = this.h[n2];
            if (((com.github.catvod.spider.merge.R.b)object).b == null) {
                n2 = this.j(d2);
                return n2;
            }
            n2 = this.f(d2, ((com.github.catvod.spider.merge.R.b)object).b);
            return n2;
        }
        finally {
            d2.a();
        }
    }

    protected final int j(d d2) {
        m m2 = (m)((ArrayList)this.a.i).get(this.i);
        Object object = X.b;
        Q q2 = new Q();
        int n2 = 0;
        while (n2 < m2.b()) {
            m m3 = m2.d((int)n2).a;
            this.d(d2, new z(m3, ++n2, (X)object), q2, false, false, false);
        }
        boolean bl = q2.h;
        q2.h = false;
        object = this.c(q2);
        if (!bl) {
            this.h[this.i].b = object;
        }
        return this.f(d2, (e)object);
    }
}

