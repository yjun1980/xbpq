/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.Nx.V
 *  com.github.catvod.spider.merge.Nx.W
 *  com.github.catvod.spider.merge.Nx.X
 *  com.github.catvod.spider.merge.Nx.b
 *  com.github.catvod.spider.merge.Nx.b0
 *  com.github.catvod.spider.merge.Nx.e0
 *  com.github.catvod.spider.merge.Nx.f0
 *  com.github.catvod.spider.merge.Nx.j0
 *  com.github.catvod.spider.merge.Nx.k0
 *  com.github.catvod.spider.merge.Nx.m
 *  com.github.catvod.spider.merge.Nx.n0
 *  com.github.catvod.spider.merge.Nx.o
 *  com.github.catvod.spider.merge.Nx.t
 *  com.github.catvod.spider.merge.Nx.u
 *  com.github.catvod.spider.merge.Nx.x
 *  com.github.catvod.spider.merge.gu.a
 */
package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Dw.k;
import com.github.catvod.spider.merge.Mm.c;
import com.github.catvod.spider.merge.Mm.j;
import com.github.catvod.spider.merge.Nx.V;
import com.github.catvod.spider.merge.Nx.W;
import com.github.catvod.spider.merge.Nx.X;
import com.github.catvod.spider.merge.Nx.Y;
import com.github.catvod.spider.merge.Nx.a;
import com.github.catvod.spider.merge.Nx.b;
import com.github.catvod.spider.merge.Nx.b0;
import com.github.catvod.spider.merge.Nx.e0;
import com.github.catvod.spider.merge.Nx.f;
import com.github.catvod.spider.merge.Nx.f0;
import com.github.catvod.spider.merge.Nx.j0;
import com.github.catvod.spider.merge.Nx.k0;
import com.github.catvod.spider.merge.Nx.l;
import com.github.catvod.spider.merge.Nx.l0;
import com.github.catvod.spider.merge.Nx.m;
import com.github.catvod.spider.merge.Nx.n0;
import com.github.catvod.spider.merge.Nx.o;
import com.github.catvod.spider.merge.Nx.p0;
import com.github.catvod.spider.merge.Nx.t;
import com.github.catvod.spider.merge.Nx.u;
import com.github.catvod.spider.merge.Nx.x;
import com.github.catvod.spider.merge.gu.C;
import com.github.catvod.spider.merge.gu.G;
import com.github.catvod.spider.merge.gu.w;
import com.github.catvod.spider.merge.gu.y;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class S
extends l {
    public static final boolean k;
    protected final w d;
    public final k[] e;
    protected c<X, X, X> f;
    protected G g;
    protected int h;
    protected com.github.catvod.spider.merge.gu.x i;
    protected k j;

    static {
        String string;
        try {
            string = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        }
        catch (SecurityException securityException) {
            string = null;
        }
        k = Boolean.parseBoolean(string);
    }

    public S(w w2, a a2, k[] kArray, Y y2) {
        super(a2, y2);
        this.d = w2;
        this.e = kArray;
    }

    protected static int o(f object) {
        object = ((f)object).iterator();
        int n2 = 0;
        while (object.hasNext()) {
            b b2 = (b)object.next();
            if (n2 == 0) {
                n2 = b2.b;
                continue;
            }
            if (b2.b == n2) continue;
            return 0;
        }
        return n2;
    }

    @Override
    public final void a() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int b(G g2, int n2, com.github.catvod.spider.merge.gu.x object) {
        k k2;
        this.g = g2;
        this.h = g2.i();
        this.i = object;
        this.j = k2 = this.e[n2];
        g2.g();
        int n3 = this.h;
        try {
            Object object2 = k2.b() ? k2.a(this.d.r()) : k2.b;
            Object object3 = object2;
            Object object4 = object;
            if (object2 == null) {
                object2 = object;
                if (object == null) {
                    object2 = C.c;
                }
                object3 = this.i(k2.d, C.c, false);
                if (k2.b()) {
                    k2.b.b = object3;
                    object3 = this.e((f)object3);
                    object = new com.github.catvod.spider.merge.Dw.m((f)object3);
                    object3 = this.d(k2, (com.github.catvod.spider.merge.Dw.m)object);
                    k2.c(this.d.r(), (com.github.catvod.spider.merge.Dw.m)object3);
                    object4 = object2;
                } else {
                    object = new com.github.catvod.spider.merge.Dw.m((f)object3);
                    k2.b = object3 = this.d(k2, (com.github.catvod.spider.merge.Dw.m)object);
                    object4 = object2;
                }
            }
            n2 = this.l(k2, (com.github.catvod.spider.merge.Dw.m)object3, g2, n3, (com.github.catvod.spider.merge.gu.x)object4);
            return n2;
        }
        finally {
            this.f = null;
            this.j = null;
            g2.d(n3);
            g2.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final com.github.catvod.spider.merge.Dw.m c(k object, com.github.catvod.spider.merge.Dw.m m2, int n2, com.github.catvod.spider.merge.Dw.m m3) {
        if (m3 == null) {
            return null;
        }
        object = this.d((k)object, m3);
        if (n2 < -1) return object;
        if (n2 > this.a.f) {
            return object;
        }
        synchronized (m2) {
            if (m2.c == null) {
                m2.c = new com.github.catvod.spider.merge.Dw.m[this.a.f + 1 + 1];
            }
            m2.c[n2 + 1] = object;
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final com.github.catvod.spider.merge.Dw.m d(k k2, com.github.catvod.spider.merge.Dw.m m2) {
        if (m2 == l.c) {
            return m2;
        }
        Map<com.github.catvod.spider.merge.Dw.m, com.github.catvod.spider.merge.Dw.m> map = k2.a;
        synchronized (map) {
            Object object = (com.github.catvod.spider.merge.Dw.m)((HashMap)k2.a).get(m2);
            if (object != null) {
                return object;
            }
            m2.a = ((HashMap)k2.a).size();
            object = m2.b;
            if (!((f)object).c) {
                ((f)object).b(this);
                object = m2.b;
                ((f)object).c = true;
                ((f)object).d = null;
            }
            ((HashMap)k2.a).put(m2, m2);
            return m2;
        }
    }

    protected final f e(f object) {
        b b2;
        HashMap<Integer, X> hashMap = new HashMap<Integer, X>();
        f f2 = new f(((f)object).j);
        X x2 = ((f)object).iterator();
        while (x2.hasNext()) {
            l0 l02;
            b2 = x2.next();
            if (b2.b != 1 || (l02 = b2.e.d(this.d, this.i)) == null) continue;
            hashMap.put(b2.a.b, b2.c);
            if (l02 != b2.e) {
                f2.a(new b(b2, b2.a, b2.c, l02), this.f);
                continue;
            }
            f2.a(b2, this.f);
        }
        object = ((f)object).iterator();
        while (object.hasNext()) {
            b2 = (b)object.next();
            if (b2.b == 1 || !b2.c() && (x2 = (X)hashMap.get(b2.a.b)) != null && x2.equals((Object)b2.c)) continue;
            f2.a(b2, this.f);
        }
        return f2;
    }

    protected final void f(b b2, f f2, Set<b> set, boolean bl, boolean bl2, int n2, boolean bl3) {
        if (b2.a instanceof e0) {
            if (!b2.c.f()) {
                for (int i2 = 0; i2 < b2.c.h(); ++i2) {
                    if (b2.c.d(i2) == Integer.MAX_VALUE) {
                        if (bl2) {
                            f2.a(new b(b2, b2.a, (X)X.b, b2.e), this.f);
                            continue;
                        }
                        this.g(b2, f2, set, bl, bl2, n2, bl3);
                        continue;
                    }
                    m m2 = (m)((ArrayList)this.a.a).get(b2.c.d(i2));
                    X x2 = b2.c.c(i2);
                    x2 = new b(m2, b2.b, x2, b2.e);
                    x2.d = b2.d;
                    this.f((b)x2, f2, set, bl, bl2, n2 - 1, bl3);
                }
                return;
            }
            if (bl2) {
                f2.a(b2, this.f);
                return;
            }
        }
        this.g(b2, f2, set, bl, bl2, n2, bl3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final void g(b var1_1, f var2_2, Set<b> var3_3, boolean var4_4, boolean var5_5, int var6_6, boolean var7_7) {
        var16_8 = var1_1.a;
        if (!var16_8.d) {
            var2_2.a(var1_1, this.f);
        }
        for (var9_9 = 0; var9_9 < var16_8.b(); ++var9_9) {
            block29: {
                block28: {
                    if (var9_9 == 0) {
                        if (!S.k && (var17_17 = var1_1.a).c() == 10 && ((p0)var17_17).j && !var1_1.c.f() && !var1_1.c.e()) {
                            var10_11 = var1_1.c.h();
                            for (var8_10 = 0; var8_10 < var10_11; ++var8_10) {
                                if (((m)this.a.a.get((int)var1_1.c.d((int)var8_10))).c == var17_17.c) {
                                    continue;
                                }
                                ** break block27
                            }
                            var8_10 = ((u)var17_17.d((int)0).a).i.b;
                            var18_18 = (t)this.a.a.get(var8_10);
                            for (var8_10 = 0; var8_10 < var10_11; ++var8_10) {
                                var11_12 = var1_1.c.d(var8_10);
                                var15_16 = (m)this.a.a.get(var11_12);
                                if (var15_16.b() != 1 || !var15_16.d(0).b()) ** break block27
                                var14_15 /* !! */  = var15_16.d((int)0).a;
                                if (var15_16.c() == 8 && var14_15 /* !! */  == var17_17 || var15_16 == var18_18 || var14_15 /* !! */  == var18_18 || var14_15 /* !! */ .c() == 8 && var14_15 /* !! */ .b() == 1 && var14_15 /* !! */ .d(0).b() && var14_15 /* !! */ .d((int)0).a == var17_17) {
                                    continue;
                                }
                                ** break block27
                            }
                            var8_10 = 1;
                        } else lbl-1000:
                        // 4 sources

                        {
                            var8_10 = 0;
                        }
                        if (var8_10 != 0) continue;
                    }
                    var12_13 = (var17_17 = var16_8.d(var9_9)) instanceof o == false && var4_4 != false;
                    var8_10 = var6_6 == 0 ? 1 : 0;
                    var10_11 = var17_17.a();
                    var15_16 = null;
                    if (var10_11 == 10) break block28;
                    switch (var10_11) {
                        default: {
                            var14_15 /* !! */  = var15_16;
                            break block29;
                        }
                        case 6: {
                            var14_15 /* !! */  = new b(var1_1, ((o)var17_17).a, var1_1.c, var1_1.e);
                            break;
                        }
                        case 4: {
                            var15_16 = (W)var17_17;
                            if (!var12_13 || (var13_14 = var15_16.d) && (!var13_14 || var8_10 == 0)) ** GOTO lbl53
                            if (var5_5) {
                                var8_10 = this.g.i();
                                this.g.d(this.h);
                                this.d.getClass();
                                this.g.d(var8_10);
                                var14_15 /* !! */  = new b(var1_1, var15_16.a, var1_1.c, var1_1.e);
                                break;
                            }
                            var14_15 /* !! */  = l0.b(var1_1.e, (l0)new k0(var15_16.b, var15_16.c, var13_14));
                            var14_15 /* !! */  = new b(var1_1, var15_16.a, var1_1.c, (l0)var14_15 /* !! */ );
                            break block29;
lbl53:
                            // 1 sources

                            var14_15 /* !! */  = new b(var1_1, var15_16.a, var1_1.c, var1_1.e);
                            break;
                        }
                        case 3: {
                            var14_15 /* !! */  = (f0)var17_17;
                            var15_16 = var14_15 /* !! */ .c;
                            var15_16 = n0.i((X)var1_1.c, (int)var15_16.b);
                            var14_15 /* !! */  = new b(var1_1, var14_15 /* !! */ .a, (X)var15_16, var1_1.e);
                            break block29;
                        }
                        case 2: 
                        case 5: 
                        case 7: {
                            var14_15 /* !! */  = var15_16;
                            if (var7_7) {
                                var14_15 /* !! */  = var15_16;
                                if (var17_17.d(-1, 1)) {
                                    var14_15 /* !! */  = new b(var1_1, var17_17.a, var1_1.c, var1_1.e);
                                    break;
                                }
                            }
                            break block29;
                        }
                        case 1: {
                            var14_15 /* !! */  = new b(var1_1, var17_17.a, var1_1.c, var1_1.e);
                            break;
                        }
                    }
                    break block29;
                }
                var18_18 = (V)var17_17;
                if (var12_13 && var8_10 != 0) {
                    if (var5_5) {
                        var10_11 = this.g.i();
                        this.g.d(this.h);
                        var8_10 = var18_18.b;
                        var13_14 = this.d.j(var8_10);
                        this.g.d(var10_11);
                        var14_15 /* !! */  = var15_16;
                        if (var13_14) {
                            var14_15 /* !! */  = new b(var1_1, var18_18.a, var1_1.c, var1_1.e);
                        }
                    } else {
                        var14_15 /* !! */  = l0.b(var1_1.e, (l0)new j0(var18_18.b));
                        var14_15 /* !! */  = new b(var1_1, var18_18.a, var1_1.c, (l0)var14_15 /* !! */ );
                    }
                } else {
                    var14_15 /* !! */  = new b(var1_1, var18_18.a, var1_1.c, var1_1.e);
                }
            }
            if (var14_15 /* !! */  == null) continue;
            if (var1_1.a instanceof e0) {
                var15_16 = this.j;
                if (var15_16 != null && var15_16.b() && ((x)var17_17).e() == this.j.d.c) {
                    var14_15 /* !! */ .d |= 0x40000000;
                }
                ++var14_15 /* !! */ .d;
                if (!var3_3.add((b)var14_15 /* !! */ )) continue;
                var2_2.i = true;
                var8_10 = var6_6 - 1;
            } else {
                if (!var17_17.b() && !var3_3.add((b)var14_15 /* !! */ )) continue;
                var8_10 = var17_17 instanceof f0 != false && var6_6 >= 0 ? var6_6 + 1 : var6_6;
            }
            this.f((b)var14_15 /* !! */ , var2_2, var3_3, var12_13, var5_5, var8_10, var7_7);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final f h(f var1_1, int var2_2, boolean var3_3) {
        block20: {
            block21: {
                block19: {
                    if (this.f == null) {
                        this.f = new c<Key1, Key2, Value>();
                    }
                    var10_4 = new f(var3_3);
                    var9_5 = var1_1.iterator();
                    var8_6 = null;
                    block0: while (true) {
                        var7_10 = var9_5.hasNext();
                        var4_7 = 0;
                        var5_8 = 0;
                        if (!var7_10) break;
                        var11_11 /* !! */  = var9_5.next();
                        var1_1 = var11_11 /* !! */ .a;
                        if (var1_1 instanceof e0) {
                            if (!var3_3 && var2_2 != -1) continue;
                            var1_1 = var8_6;
                            if (var8_6 == null) {
                                var1_1 = new ArrayList<E>();
                            }
                            var1_1.add(var11_11 /* !! */ );
                            var8_6 = var1_1;
                            continue;
                        }
                        var6_9 = var1_1.b();
                        var4_7 = var5_8;
                        while (true) {
                            if (var4_7 < var6_9) ** break;
                            continue block0;
                            var1_1 = var11_11 /* !! */ .a.d(var4_7);
                            var1_1 = var1_1.d(var2_2, this.a.f) != false ? var1_1.a : null;
                            if (var1_1 != null) {
                                var10_4.a(new b(var11_11 /* !! */ , (m)var1_1, var11_11 /* !! */ .c, var11_11 /* !! */ .e), this.f);
                            }
                            ++var4_7;
                        }
                        break;
                    }
                    var1_1 = var8_6 == null && var2_2 != -1 && (var10_4.size() == 1 || S.o((f)var10_4) != 0) ? var10_4 : null;
                    if (var1_1 == null) {
                        var1_1 = new f(var3_3);
                        var11_11 /* !! */  = new HashSet<E>();
                        var7_10 = var2_2 == -1;
                        var9_5 = var10_4.iterator();
                        while (var9_5.hasNext()) {
                            this.f((b)var9_5.next(), (f)var1_1, (Set<b>)var11_11 /* !! */ , false, var3_3, 0, var7_10);
                        }
                    }
                    var9_5 = var1_1;
                    if (var2_2 == -1) {
                        var2_2 = var1_1 == var10_4 ? 1 : 0;
                        if (b0.a((f)var1_1)) {
                            var9_5 = var1_1;
                        } else {
                            var9_5 = new f(var1_1.j);
                            var10_4 = var1_1.iterator();
                            while (var10_4.hasNext()) {
                                var1_1 = (b)var10_4.next();
                                var11_11 /* !! */  = var1_1.a;
                                if (var11_11 /* !! */  instanceof e0) {
                                    var9_5.a((b)var1_1, this.f);
                                    continue;
                                }
                                if (var2_2 == 0 || !var11_11 /* !! */ .d || !this.a.e((m)var11_11 /* !! */ ).d(-2)) continue;
                                var9_5.a(new b((b)var1_1, (m)this.a.d[var1_1.a.c], var1_1.c, var1_1.e), this.f);
                            }
                        }
                    }
                    if (var8_6 == null) break block20;
                    if (!var3_3) break block21;
                    var1_1 = var9_5.iterator();
                    do {
                        var2_2 = var4_7;
                        if (!var1_1.hasNext()) break block19;
                    } while (!(((b)var1_1.next()).a instanceof e0));
                    var2_2 = 1;
                }
                if (var2_2 != 0) break block20;
            }
            var1_1 = var8_6.iterator();
            while (var1_1.hasNext()) {
                var9_5.a((b)var1_1.next(), this.f);
            }
        }
        if (var9_5.isEmpty()) {
            return null;
        }
        return var9_5;
    }

    protected final f i(m m2, C object, boolean bl) {
        X x2 = X.a((a)this.a, (C)object);
        object = new f(bl);
        int n2 = 0;
        while (n2 < m2.b()) {
            m m3 = m2.d((int)n2).a;
            this.f(new b(m3, ++n2, x2, (l0)l0.c), (f)object, new HashSet<b>(), true, bl, 0, false);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final BitSet j(com.github.catvod.spider.merge.Dw.l[] lArray, com.github.catvod.spider.merge.gu.x x2) {
        BitSet bitSet = new BitSet();
        int n2 = lArray.length;
        int n3 = 0;
        while (n3 < n2) {
            com.github.catvod.spider.merge.Dw.l l2 = lArray[n3];
            l0 l02 = l2.a;
            if (l02 == l0.c || this.k(l02, x2)) {
                bitSet.set(l2.b);
            }
            ++n3;
        }
        return bitSet;
    }

    protected final boolean k(l0 l02, com.github.catvod.spider.merge.gu.x x2) {
        return l02.c(this.d, x2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final int l(k var1_1, com.github.catvod.spider.merge.Dw.m var2_2, G var3_3, int var4_4, com.github.catvod.spider.merge.gu.x var5_5) {
        var6_6 = var3_3.f(1);
        var12_7 /* !! */  = var2_2;
        while (true) {
            block54: {
                block50: {
                    block53: {
                        block48: {
                            block52: {
                                block51: {
                                    var11_12 /* !! */  = (var2_2 = var12_7 /* !! */ .c) != null && (var7_8 = var6_6 + 1) >= 0 && var7_8 < ((com.github.catvod.spider.merge.Dw.m[])var2_2).length ? var2_2[var7_8] : null;
                                    var2_2 = var11_12 /* !! */ ;
                                    if (var11_12 /* !! */  != null) break block50;
                                    var14_14 = this.h(var12_7 /* !! */ .b, var6_6, false);
                                    if (var14_14 != null) break block51;
                                    var2_2 = l.c;
                                    this.c((k)var1_1, (com.github.catvod.spider.merge.Dw.m)var12_7 /* !! */ , var6_6, (com.github.catvod.spider.merge.Dw.m)var2_2);
                                    break block50;
                                }
                                var13_13 = new com.github.catvod.spider.merge.Dw.m((f)var14_14);
                                var7_8 = S.o((f)var14_14);
                                if (var7_8 == 0) break block52;
                                var13_13.d = true;
                                var13_13.b.f = var7_8;
                                var13_13.e = var7_8;
                                break block53;
                            }
                            if (b0.a((f)var14_14)) ** GOTO lbl-1000
                            var2_2 = ((ArrayList)b0.b((f)var14_14)).iterator();
                            while (var2_2.hasNext()) {
                                if (((BitSet)var2_2.next()).cardinality() <= 1) continue;
                                var7_8 = 1;
                                break block48;
                            }
                            var7_8 = 0;
                        }
                        if (var7_8 != 0) {
                            block49: {
                                var15_15 = new HashMap();
                                var17_17 = var14_14.iterator();
                                while (var17_17.hasNext()) {
                                    var16_16 = var17_17.next();
                                    var11_12 /* !! */  = (BitSet)var15_15.get(var16_16.a);
                                    var2_2 = var11_12 /* !! */ ;
                                    if (var11_12 /* !! */  == null) {
                                        var2_2 = new BitSet();
                                        var15_15.put(var16_16.a, var2_2);
                                    }
                                    var2_2.set(var16_16.b);
                                }
                                var2_2 = var15_15.values().iterator();
                                while (var2_2.hasNext()) {
                                    if (((BitSet)var2_2.next()).cardinality() != 1) continue;
                                    var7_8 = 1;
                                    break block49;
                                }
                                var7_8 = 0;
                            }
                            ** if (var7_8 != 0) goto lbl-1000
                        }
                        ** GOTO lbl-1000
lbl-1000:
                        // 2 sources

                        {
                            var7_8 = 1;
                            ** GOTO lbl55
                        }
lbl-1000:
                        // 2 sources

                        {
                            var7_8 = 0;
                        }
lbl55:
                        // 2 sources

                        if (var7_8 != 0) {
                            var2_2 = var13_13.b;
                            var14_14 = b0.b((f)var14_14);
                            var11_12 /* !! */  = new BitSet();
                            var14_14 = ((ArrayList)var14_14).iterator();
                            while (var14_14.hasNext()) {
                                var11_12 /* !! */ .or((BitSet)var14_14.next());
                            }
                            var2_2.g = var11_12 /* !! */ ;
                            var13_13.g = true;
                            var13_13.d = true;
                            var13_13.e = var13_13.b.g.nextSetBit(0);
                        }
                    }
                    if (var13_13.d && var13_13.b.h) {
                        var10_11 = this.a.b(var1_1.c).b();
                        var11_12 /* !! */  = var13_13.b;
                        if (var11_12 /* !! */ .f != 0) {
                            var2_2 = new BitSet();
                            var2_2.set(var11_12 /* !! */ .f);
                        } else {
                            var2_2 = var11_12 /* !! */ .g;
                        }
                        var14_14 = var13_13.b;
                        var11_12 /* !! */  = new l0[var10_11 + 1];
                        var14_14 = var14_14.iterator();
                        while (var14_14.hasNext()) {
                            var15_15 = var14_14.next();
                            if (!var2_2.get(var15_15.b)) continue;
                            var7_8 = var15_15.b;
                            var11_12 /* !! */ [var7_8] = l0.e(var11_12 /* !! */ [var7_8], var15_15.e);
                        }
                        var9_10 = 0;
                        for (var7_8 = 1; var7_8 <= var10_11; ++var7_8) {
                            if (var11_12 /* !! */ [var7_8] == null) {
                                var11_12 /* !! */ [var7_8] = l0.c;
                                var8_9 = var9_10;
                            } else {
                                var8_9 = var9_10;
                                if (var11_12 /* !! */ [var7_8] != l0.c) {
                                    var8_9 = var9_10 + 1;
                                }
                            }
                            var9_10 = var8_9;
                        }
                        if (var9_10 == 0) {
                            var11_12 /* !! */  = null;
                        }
                        if (var11_12 /* !! */  != null) {
                            var15_15 = new ArrayList<E>();
                            var8_9 = 0;
                            for (var7_8 = 1; var7_8 < var11_12 /* !! */ .length; ++var7_8) {
                                var14_14 = var11_12 /* !! */ [var7_8];
                                if (var2_2 != null && var2_2.get(var7_8)) {
                                    var15_15.add(new com.github.catvod.spider.merge.Dw.l((l0)var14_14, var7_8));
                                }
                                if (var14_14 == l0.c) continue;
                                var8_9 = 1;
                            }
                            var2_2 = var8_9 == 0 ? null : var15_15.toArray(new com.github.catvod.spider.merge.Dw.l[var15_15.size()]);
                            var13_13.h = var2_2;
                            var13_13.e = 0;
                        } else {
                            var13_13.e = var2_2.nextSetBit(0);
                        }
                        if (var13_13.h != null) {
                            var13_13.e = 0;
                        }
                    }
                    var2_2 = this.c((k)var1_1, (com.github.catvod.spider.merge.Dw.m)var12_7 /* !! */ , var6_6, (com.github.catvod.spider.merge.Dw.m)var13_13);
                }
                if (var2_2 == l.c) {
                    var1_1 = this.p((G)var3_3, var5_5, var12_7 /* !! */ .b, var4_4);
                    var3_3.d(var4_4);
                    var4_4 = this.n(var12_7 /* !! */ .b, var5_5);
                    if (var4_4 != 0) {
                        return var4_4;
                    }
                    throw var1_1;
                }
                if (!var2_2.g) break block54;
                var11_12 /* !! */  = var2_2.b.g;
                if (var2_2.h != null) {
                    var6_6 = var3_3.i();
                    if (var6_6 != var4_4) {
                        var3_3.d(var4_4);
                    }
                    if ((var11_12 /* !! */  = this.j(var2_2.h, var5_5)).cardinality() == 1) {
                        return var11_12 /* !! */ .nextSetBit(0);
                    }
                    if (var6_6 != var4_4) {
                        var3_3.d(var6_6);
                    }
                }
                var12_7 /* !! */  = this.i(var1_1.d, var5_5, true);
                var2_2 = var2_2.b;
                var6_6 = var3_3.i();
                var13_13 = this.d;
                if (var13_13 != null) {
                    var13_13 = var13_13.g();
                    var14_14 = this.d;
                    ((y)var13_13).b((w)var14_14, (k)var1_1, var4_4, var6_6, (BitSet)var11_12 /* !! */ , (f)var2_2);
                }
                var3_3.d(var4_4);
                var6_6 = var3_3.f(1);
                var2_2 = var12_7 /* !! */ ;
                while (true) {
                    block59: {
                        block56: {
                            block58: {
                                block57: {
                                    block55: {
                                        if ((var11_12 /* !! */  = this.h((f)var2_2, var6_6, true)) != null) break block55;
                                        var1_1 = this.p((G)var3_3, var5_5, (f)var2_2, var4_4);
                                        var3_3.d(var4_4);
                                        var4_4 = this.n((f)var2_2, var5_5);
                                        if (var4_4 == 0) {
                                            throw var1_1;
                                        }
                                        break block56;
                                    }
                                    var2_2 = b0.b((f)var11_12 /* !! */ );
                                    var11_12 /* !! */ .f = var7_8 = S.o((f)var11_12 /* !! */ );
                                    if (var7_8 == 0) break block57;
                                    var6_6 = var7_8;
                                    break block58;
                                }
                                var7_8 = b0.c((Collection)var2_2);
                                if (var7_8 == 0) break block59;
                                var6_6 = var7_8;
                            }
                            var7_8 = var11_12 /* !! */ .f;
                            var8_9 = var3_3.i();
                            if (var7_8 != 0) {
                                var2_2 = this.d;
                                if (var2_2 != null) {
                                    var2_2 = var2_2.g();
                                    var3_3 = this.d;
                                    ((y)var2_2).d((w)var3_3, (k)var1_1, var4_4, var8_9, var6_6, (f)var11_12 /* !! */ );
                                }
                            } else {
                                var2_2 = new BitSet();
                                var3_3 = var11_12 /* !! */ .e.iterator();
                                while (var3_3.hasNext()) {
                                    var2_2.set(((b)var3_3.next()).b);
                                }
                                this.q((k)var1_1, var4_4, var8_9, (BitSet)var2_2, (f)var11_12 /* !! */ );
                            }
                            var4_4 = var6_6;
                        }
                        return var4_4;
                    }
                    var7_8 = var6_6;
                    if (var6_6 != -1) {
                        var3_3.j();
                        var7_8 = var3_3.f(1);
                    }
                    var2_2 = var11_12 /* !! */ ;
                    var6_6 = var7_8;
                }
            }
            if (var2_2.d) {
                if (var2_2.h == null) {
                    return var2_2.e;
                }
                var7_8 = var3_3.i();
                var3_3.d(var4_4);
                var11_12 /* !! */  = this.j(var2_2.h, var5_5);
                var6_6 = var11_12 /* !! */ .cardinality();
                if (var6_6 != 0) {
                    if (var6_6 != 1) {
                        this.q((k)var1_1, var4_4, var7_8, (BitSet)var11_12 /* !! */ , var2_2.b);
                        return var11_12 /* !! */ .nextSetBit(0);
                    }
                    return var11_12 /* !! */ .nextSetBit(0);
                }
                throw this.p((G)var3_3, var5_5, var2_2.b, var4_4);
            }
            if (var6_6 != -1) {
                var3_3.j();
                var6_6 = var3_3.f(1);
            }
            var12_7 /* !! */  = var2_2;
        }
    }

    protected final int m(f object) {
        j j2 = new j(new int[0]);
        object = ((f)object).iterator();
        while (object.hasNext()) {
            b b2 = (b)object.next();
            if (b2.b() <= 0 && (!(b2.a instanceof e0) || !b2.c.e())) continue;
            j2.a(b2.b);
        }
        if (j2.j() == 0) {
            return 0;
        }
        return j2.e();
    }

    protected final int n(f f22, com.github.catvod.spider.merge.gu.x x2) {
        f f4 = new f(f22.j);
        f f5 = new f(f22.j);
        for (f f22 : f22) {
            l0 l02 = ((b)f22).e;
            if (l02 != l0.c && !this.k(l02, x2)) {
                f5.a((b)f22, null);
                continue;
            }
            f4.a((b)f22, null);
        }
        int n2 = this.m(f4);
        if (n2 != 0) {
            return n2;
        }
        if (f5.size() > 0 && (n2 = this.m(f5)) != 0) {
            return n2;
        }
        return 0;
    }

    protected final com.github.catvod.spider.merge.gu.u p(G g2, com.github.catvod.spider.merge.gu.x x2, f f2, int n2) {
        return new com.github.catvod.spider.merge.gu.u(this.d, g2, g2.get(n2), g2.e(1), x2);
    }

    protected final void q(k k2, int n2, int n3, BitSet bitSet, f f2) {
        w w2 = this.d;
        if (w2 != null) {
            com.github.catvod.spider.merge.gu.a a2 = w2.g();
            w2 = this.d;
            ((y)a2).c(w2, k2, n2, n3, bitSet, f2);
        }
    }
}

