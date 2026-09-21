/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.T.b;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.M;
import com.github.catvod.spider.merge.g0.A;
import com.github.catvod.spider.merge.g0.B;
import com.github.catvod.spider.merge.g0.C;
import com.github.catvod.spider.merge.g0.E;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.g0.h;
import com.github.catvod.spider.merge.g0.i;
import com.github.catvod.spider.merge.g0.j;
import com.github.catvod.spider.merge.g0.k;
import com.github.catvod.spider.merge.g0.l;
import com.github.catvod.spider.merge.g0.m;
import com.github.catvod.spider.merge.g0.n;
import com.github.catvod.spider.merge.g0.o;
import com.github.catvod.spider.merge.g0.p;
import com.github.catvod.spider.merge.g0.q;
import com.github.catvod.spider.merge.g0.r;
import com.github.catvod.spider.merge.g0.s;
import com.github.catvod.spider.merge.g0.t;
import com.github.catvod.spider.merge.g0.u;
import com.github.catvod.spider.merge.g0.v;
import com.github.catvod.spider.merge.g0.w;
import com.github.catvod.spider.merge.g0.x;
import com.github.catvod.spider.merge.g0.y;
import com.github.catvod.spider.merge.g0.z;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import com.github.catvod.spider.merge.n0.c;
import com.github.catvod.spider.merge.x.a;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public final class f
extends com.github.catvod.spider.merge.O.m
implements E<e> {
    private Stack<d> a;
    private d b;

    public f(com.github.catvod.spider.merge.e0.g object) {
        c.d(f.class);
        this.a = new Stack();
        this.b = d.c((com.github.catvod.spider.merge.e0.g)object);
        Stack<d> stack = this.a;
        object = d.c((com.github.catvod.spider.merge.e0.g)object);
        ((d)object).j(this.b);
        stack.push((d)object);
    }

    private d G() {
        return this.a.peek();
    }

    private void H(com.github.catvod.spider.merge.e0.g g2) {
        this.a.peek().i(g2);
    }

    @Override
    public final Object B(com.github.catvod.spider.merge.g0.e object) {
        Object object2 = ((com.github.catvod.spider.merge.P.x)object).l(o.class);
        int n2 = object2.size();
        if (n2 == 1) {
            object = ((b)object2.get(0)).e(this);
        } else {
            object2 = ((b)object2.get(0)).e(this).c();
            String string = null;
            for (int i2 = 1; i2 < ((com.github.catvod.spider.merge.P.x)object).d(); ++i2) {
                Object object3 = ((com.github.catvod.spider.merge.P.x)object).b(i2);
                if (object3 instanceof o) {
                    object3 = object3.e(this);
                    if (cYh.d("4C").equals(string)) {
                        double d2 = (Double)object2;
                        object2 = ((e)object3).c() + d2;
                        continue;
                    }
                    if (cYh.d("4A").equals(string)) {
                        object2 = (Double)object2 - ((e)object3).c();
                        continue;
                    }
                    object2 = com.github.catvod.spider.merge.d.d.b(cYh.d("14292F2536224735332338284B70"));
                    ((StringBuilder)object2).append(((com.github.catvod.spider.merge.P.C)object).c());
                    throw new com.github.catvod.spider.merge.x.b(((StringBuilder)object2).toString());
                }
                string = object3.c();
            }
            object = new e(object2);
        }
        return object;
    }

    @Override
    public final Object C(j j2) {
        return ((v)j2.k(v.class)).e(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object D(q object) {
        String string = ((com.github.catvod.spider.merge.P.C)object).c();
        String string2 = cYh.d("4D");
        if (!string2.equals(string)) {
            if (((q)object).o() != null && !((q)object).o().g()) {
                object = ((q)object).o();
                return object.e(this);
            } else {
                if (((q)object).n() == null) return null;
                if (((q)object).n().g()) return null;
                object = ((q)object).n();
            }
            return object.e(this);
        }
        object = new e(string2);
        ((e)object).j();
        return object;
    }

    @Override
    public final Object b(l l2) {
        return ((w)l2.k(w.class)).e(this);
    }

    @Override
    public final Object c(com.github.catvod.spider.merge.g0.c object) {
        object = ((com.github.catvod.spider.merge.P.C)object).c();
        if (cYh.d("497E").equals(object)) {
            HashSet<com.github.catvod.spider.merge.c0.l> hashSet = new HashSet<com.github.catvod.spider.merge.c0.l>();
            com.github.catvod.spider.merge.e0.g g2 = new com.github.catvod.spider.merge.e0.g();
            object = ((AbstractCollection)this.G().a()).iterator();
            while (object.hasNext()) {
                hashSet.add(((com.github.catvod.spider.merge.c0.l)object.next()).f0());
            }
            ((AbstractCollection)g2).addAll(hashSet);
            object = new e(g2);
        } else {
            object = new e(this.G().a());
        }
        return object;
    }

    @Override
    public final Object d(n n2) {
        return ((i)n2.k(i.class)).e(this);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object e(z var1_1) {
        block18: {
            block22: {
                block27: {
                    block26: {
                        block24: {
                            block25: {
                                block23: {
                                    block21: {
                                        block19: {
                                            block20: {
                                                block17: {
                                                    if (var1_1.n() == null || var1_1.n().g()) break block17;
                                                    var1_1 = var1_1.n().e(this);
                                                    break block18;
                                                }
                                                var4_2 = var1_1.o();
                                                var3_3 = false;
                                                if (var4_2 == null || var1_1.o().g() || (var4_2 = var1_1.o().e(this)) == null) break block19;
                                                if (!var4_2.n()) break block20;
                                                this.H(var4_2.d());
                                                ** GOTO lbl-1000
                                            }
                                            if (var4_2.k()) {
                                                var2_4 = 1;
                                                var3_3 = true;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var2_4 = 1;
                                            }
                                            break block21;
                                        }
                                        var2_4 = 0;
                                    }
                                    if (var1_1.p() == null || var1_1.p().g()) break block22;
                                    var4_2 = var1_1.p().e(this);
                                    if (!var3_3) break block23;
                                    var7_5 = this.G().a();
                                    var1_1 = var4_2.g();
                                    if (this.G().f()) {
                                        var2_4 = var7_5.size();
                                        var4_2 = cYh.d("3A");
                                        var5_7 = cYh.d("3C");
                                        if (var2_4 == 1) {
                                            var6_10 = this.G().k();
                                            var7_5 = new StringBuilder();
                                            var7_5.append((String)var5_7);
                                            var7_5.append((String)var1_1);
                                            var7_5.append((String)var4_2);
                                            var5_7 = var6_10.j0(var7_5.toString());
                                            var4_2 = new LinkedList<E>();
                                            var5_7 = var5_7.iterator();
                                            while (var5_7.hasNext()) {
                                                var4_2.add(((com.github.catvod.spider.merge.c0.l)var5_7.next()).c((String)var1_1));
                                            }
                                            var1_1 = new e(var4_2);
                                        } else {
                                            var6_11 = new com.github.catvod.spider.merge.e0.g();
                                            var9_13 = var7_5.iterator();
                                            while (var9_13.hasNext()) {
                                                var8_15 = (com.github.catvod.spider.merge.c0.l)var9_13.next();
                                                var7_5 = new StringBuilder();
                                                var7_5.append((String)var5_7);
                                                var7_5.append((String)var1_1);
                                                var7_5.append((String)var4_2);
                                                var6_11.addAll(var8_15.j0(var7_5.toString()));
                                            }
                                            var4_2 = new LinkedList<E>();
                                            var5_7 = var6_11.iterator();
                                            while (var5_7.hasNext()) {
                                                var4_2.add(((com.github.catvod.spider.merge.c0.l)var5_7.next()).c((String)var1_1));
                                            }
                                            var1_1 = new e(var4_2);
                                        }
                                    } else if (var7_5.size() == 1) {
                                        var1_1 = new e(this.G().k().c((String)var1_1));
                                    } else {
                                        var4_2 = new LinkedList<String>();
                                        var5_8 = var7_5.iterator();
                                        while (var5_8.hasNext()) {
                                            var4_2.add(((com.github.catvod.spider.merge.c0.l)var5_8.next()).c((String)var1_1));
                                        }
                                        var1_1 = new e(var4_2);
                                    }
                                    break block18;
                                }
                                if (!var4_2.o()) break block24;
                                var4_2 = var4_2.g();
                                var5_9 = this.G().a();
                                if (!this.G().f()) break block25;
                                var4_2 = var5_9.d((String)var4_2);
                                break block26;
                            }
                            var6_12 = new com.github.catvod.spider.merge.e0.g();
                            for (Object var8_16 : this.G().a()) {
                                var7_6 = cYh.d("4D");
                                if (var2_4 != 0) {
                                    if (!var8_16.t().equals(var4_2) && !var7_6.equals(var4_2)) continue;
                                    var6_12.add(var8_16);
                                    continue;
                                }
                                var8_16 = var8_16.R().iterator();
                                while (var8_16.hasNext()) {
                                    var9_14 = (com.github.catvod.spider.merge.c0.l)var8_16.next();
                                    if (!var9_14.t().equals(var4_2) && !var7_6.equals(var4_2)) continue;
                                    var6_12.add(var9_14);
                                }
                            }
                            this.H(var6_12);
                            break block22;
                        }
                        if (!var4_2.n()) break block27;
                        var4_2 = var4_2.d();
                    }
                    this.H((com.github.catvod.spider.merge.e0.g)var4_2);
                    break block22;
                }
                var1_1 = var4_2;
                break block18;
            }
            if (var1_1.q() != null && var1_1.q().size() > 0) {
                var1_1 = var1_1.q().iterator();
                while (var1_1.hasNext()) {
                    this.H(var1_1.next().e(this).d());
                }
            }
            var1_1 = new e(this.G().a());
        }
        return var1_1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object f(B object) {
        e e2;
        e e3;
        block16: {
            CharSequence charSequence;
            block17: {
                block13: {
                    String string;
                    block14: {
                        block15: {
                            boolean bl;
                            block11: {
                                block12: {
                                    if (((B)object).n() == null && !((B)object).n().g()) {
                                        return ((B)((com.github.catvod.spider.merge.P.x)object).k(B.class)).e(this);
                                    }
                                    e3 = ((B)object).n().e(this);
                                    if (((B)object).g == null) return e3;
                                    this.a.push(d.d(this.G().e()));
                                    e2 = ((B)((com.github.catvod.spider.merge.P.x)object).k(B.class)).e(this);
                                    this.a.pop();
                                    bl = e3.n();
                                    string = cYh.d("31");
                                    if (bl) {
                                        if (e2.n()) {
                                            ((AbstractCollection)e3.d()).addAll(e2.d());
                                            return e3;
                                        } else {
                                            object = new com.github.catvod.spider.merge.c0.l(string);
                                            ((com.github.catvod.spider.merge.c0.l)object).O(e2.g());
                                            ((AbstractCollection)e3.d()).add(object);
                                        }
                                        return e3;
                                    }
                                    if (!e3.r()) break block11;
                                    if (!e2.n()) break block12;
                                    object = new com.github.catvod.spider.merge.c0.l(string);
                                    break block13;
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append(e3.g());
                                ((StringBuilder)object).append(e2.g());
                                return new e(((StringBuilder)object).toString());
                            }
                            bl = e3.l();
                            object = cYh.d("4B26203D6567");
                            charSequence = cYh.d("04312F71393513702C34253D027037303B6B5A");
                            if (!bl) break block14;
                            if (e2.l()) {
                                bl = e3.a();
                                return new e(e2.a() | bl);
                            }
                            if (!e2.n()) break block15;
                            object = new com.github.catvod.spider.merge.c0.l(string);
                            break block13;
                        }
                        if (e2.r()) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(e3.a());
                            ((StringBuilder)object).append(e2.g());
                            return new e(((StringBuilder)object).toString());
                        }
                        charSequence = com.github.catvod.spider.merge.d.d.b((String)charSequence);
                        ((StringBuilder)charSequence).append(e3.a());
                        ((StringBuilder)charSequence).append((String)object);
                        ((StringBuilder)charSequence).append(e2.g());
                        throw new com.github.catvod.spider.merge.l0.c(((StringBuilder)charSequence).toString());
                    }
                    if (!e3.q()) break block16;
                    if (e2.r()) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(e3.c());
                        ((StringBuilder)object).append(e2.g());
                        return new e(((StringBuilder)object).toString());
                    }
                    if (!e2.n()) break block17;
                    object = new com.github.catvod.spider.merge.c0.l(string);
                }
                ((com.github.catvod.spider.merge.c0.l)object).O(e3.g());
                ((AbstractCollection)e2.d()).add(object);
                return e2;
            }
            charSequence = com.github.catvod.spider.merge.d.d.b((String)charSequence);
            ((StringBuilder)charSequence).append(e3.c());
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(e2.g());
            throw new com.github.catvod.spider.merge.l0.c(((StringBuilder)charSequence).toString());
        }
        object = new LinkedList();
        if (com.github.catvod.spider.merge.U.h.d(e3.g())) {
            ((LinkedList)object).add(e3.g());
        }
        if (!com.github.catvod.spider.merge.U.h.d(e2.g())) return new e(com.github.catvod.spider.merge.U.h.e(object, cYh.d("4B")));
        ((LinkedList)object).add(e2.g());
        return new e(com.github.catvod.spider.merge.U.h.e(object, cYh.d("4B")));
    }

    @Override
    public final Object g(i i2) {
        return ((s)i2.k(s.class)).e(this);
    }

    @Override
    public final Object h(A object) {
        e e2 = ((B)((com.github.catvod.spider.merge.P.x)object).k(B.class)).e(this);
        object = ((A)object).g == null ? e2 : new e(-e2.c().doubleValue());
        return object;
    }

    @Override
    public final Object i(v object) {
        block7: {
            block5: {
                block6: {
                    block4: {
                        block3: {
                            block2: {
                                if (((v)object).n() == null || ((v)object).n().g()) break block2;
                                object = ((v)object).n();
                                break block3;
                            }
                            if (((v)object).o() == null || ((v)object).o().g()) break block4;
                            object = ((v)object).o();
                        }
                        object = object.e(this);
                        break block5;
                    }
                    if (((com.github.catvod.spider.merge.P.x)object).m(39) == null) break block6;
                    object = new e(((com.github.catvod.spider.merge.P.x)object).m(39).c());
                    ((e)object).j();
                    break block5;
                }
                if (((com.github.catvod.spider.merge.P.x)object).m(6) == null) break block7;
                object = (object = ((com.github.catvod.spider.merge.P.x)object).m(6).c()) == null ? null : Double.valueOf((String)object);
                object = new e(object);
            }
            return object;
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("093F3571242F17202E23237A1131333836380B351334313F15352F323260"));
        stringBuilder.append(((com.github.catvod.spider.merge.P.C)object).c());
        object = new com.github.catvod.spider.merge.x.b(stringBuilder.toString());
        throw object;
    }

    @Override
    public final Object j(p object) {
        object = ((com.github.catvod.spider.merge.P.x)object).m(7) != null ? new e(((com.github.catvod.spider.merge.P.x)object).m(7).c()) : new e(((com.github.catvod.spider.merge.P.x)object).m(41).c());
        ((e)object).j();
        return object;
    }

    @Override
    public final Object k(h object) {
        Object object2;
        block10: {
            block9: {
                boolean bl;
                block14: {
                    block13: {
                        e e2;
                        boolean bl2;
                        block12: {
                            block11: {
                                boolean bl3;
                                boolean bl4;
                                block8: {
                                    object2 = ((com.github.catvod.spider.merge.P.x)object).l(x.class);
                                    int n2 = object2.size();
                                    bl4 = true;
                                    bl3 = true;
                                    bl2 = false;
                                    bl = false;
                                    if (n2 != 1) break block8;
                                    object = ((b)object2.get(0)).e(this);
                                    break block9;
                                }
                                if (object2.size() != 2) break block10;
                                e2 = ((b)object2.get(0)).e(this);
                                object2 = ((b)object2.get(1)).e(this);
                                object = ((h)object).g.c();
                                if (!cYh.d("5A").equals(object)) break block11;
                                if (e2.s().equals(((e)object2).s())) {
                                    boolean bl5 = bl3;
                                    if (e2 != object2) {
                                        bl5 = e2.equals(object2) ? bl3 : false;
                                    }
                                    object = new e(bl5);
                                } else {
                                    object = e2.g();
                                    object2 = ((e)object2).g();
                                    boolean bl6 = bl4;
                                    if (object != object2) {
                                        bl6 = object != null && object.equals(object2) ? bl4 : false;
                                    }
                                    object = new e(bl6);
                                }
                                break block9;
                            }
                            if (!e2.s().equals(((e)object2).s())) break block12;
                            if (e2 == object2 || e2.equals(object2)) {
                                bl = true;
                            }
                            object = new e(bl ^ true);
                            break block9;
                        }
                        object = e2.g();
                        if (object == (object2 = ((e)object2).g())) break block13;
                        bl = bl2;
                        if (object == null) break block14;
                        bl = bl2;
                        if (!object.equals(object2)) break block14;
                    }
                    bl = true;
                }
                object = new e(bl ^ true);
            }
            return object;
        }
        object2 = com.github.catvod.spider.merge.d.d.b(cYh.d("0222333E257A022134303B33132904292728473E24302560"));
        ((StringBuilder)object2).append(((com.github.catvod.spider.merge.P.C)object).c());
        object = new com.github.catvod.spider.merge.x.b(((StringBuilder)object2).toString());
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object l(x object) {
        Object object2 = ((com.github.catvod.spider.merge.P.x)object).l(com.github.catvod.spider.merge.g0.e.class);
        int n2 = object2.size();
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        if (n2 == 1) {
            return ((b)object2.get(0)).e(this);
        }
        if (object2.size() == 2) {
            Comparable<e> comparable = ((b)object2.get(0)).e(this);
            object2 = ((b)object2.get(1)).e(this);
            switch (((x)object).g.e()) {
                default: {
                    comparable = com.github.catvod.spider.merge.d.d.b(cYh.d("123E2A3F382D09702E21322806242E23"));
                    ((StringBuilder)comparable).append(((x)object).g.c());
                    throw new com.github.catvod.spider.merge.x.b(((StringBuilder)comparable).toString());
                }
                case 34: {
                    return new e(((e)comparable).g().matches(((e)object2).g()) ^ true);
                }
                case 33: {
                    return new e(((e)comparable).g().matches(((e)object2).g()));
                }
                case 32: {
                    return new e(((e)comparable).g().contains(((e)object2).g()));
                }
                case 31: {
                    return new e(((e)comparable).g().endsWith(((e)object2).g()));
                }
                case 30: {
                    return new e(((e)comparable).g().startsWith(((e)object2).g()));
                }
                case 27: {
                    bl = ((e)comparable).i((e)object2) >= 0 ? bl4 : false;
                    return new e(bl);
                }
                case 26: {
                    if (((e)comparable).i((e)object2) <= 0) return new e(bl);
                    bl = false;
                    return new e(bl);
                }
                case 25: {
                    bl = ((e)comparable).i((e)object2) > 0 ? bl2 : false;
                    return new e(bl);
                }
                case 24: {
                    bl = ((e)comparable).i((e)object2) < 0 ? bl3 : false;
                    return new e(bl);
                }
            }
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("0222333E257A022134303B33132904292728473E24302560"));
        stringBuilder.append(((com.github.catvod.spider.merge.P.C)object).c());
        object = new com.github.catvod.spider.merge.x.b(stringBuilder.toString());
        throw object;
    }

    @Override
    public final Object m(u object) {
        com.github.catvod.spider.merge.e0.g g2 = new com.github.catvod.spider.merge.e0.g();
        for (com.github.catvod.spider.merge.c0.l l2 : this.G().a()) {
            Object object2;
            block12: {
                block8: {
                    block11: {
                        block10: {
                            block9: {
                                block7: {
                                    int n2;
                                    Object object3;
                                    object2 = this.a;
                                    Object object4 = d.b(l2);
                                    ((d)object4).j(this.G());
                                    ((Stack)object2).push((d)object4);
                                    object2 = ((i)((com.github.catvod.spider.merge.P.x)object).k(i.class)).e(this);
                                    this.a.pop();
                                    if (!((e)object2).q()) break block7;
                                    long l3 = ((e)object2).f();
                                    object2 = cYh.d("221C1E021617220F151010052E1E05140F052C1518");
                                    object4 = cYh.d("2D081E05120233");
                                    long l4 = l3;
                                    if (l3 < 0L) {
                                        object3 = l2.n0();
                                        n2 = !(object3 == object4 || object3 != null && object3.equals(object4)) ? 0 : 1;
                                        if (n2 != 0) {
                                            object3 = l2.c((String)object2);
                                            n2 = com.github.catvod.spider.merge.U.h.b((CharSequence)object3) ? -1 : Integer.parseInt((String)object3);
                                            l3 = (long)n2 + l3 + 1L;
                                        } else {
                                            object3 = this.G();
                                            com.github.catvod.spider.merge.e0.g g3 = new com.github.catvod.spider.merge.e0.g();
                                            com.github.catvod.spider.merge.c0.l l52 = l2.f0();
                                            String string = l2.n0();
                                            l52.getClass();
                                            com.github.catvod.spider.merge.N.a.i(string);
                                            for (com.github.catvod.spider.merge.c0.l l52 : com.github.catvod.spider.merge.e0.c.a(new M(com.github.catvod.spider.merge.x.a.d(string)), l52)) {
                                                if (!((AbstractCollection)((d)object3).a()).contains(l52)) continue;
                                                ((AbstractCollection)g3).add(l52);
                                            }
                                            l3 = (long)((AbstractCollection)g3).size() + l3 + 1L;
                                        }
                                        l4 = l3;
                                        if (l3 < 0L) {
                                            l4 = 1L;
                                        }
                                    }
                                    n2 = !((object3 = l2.n0()) == object4 || object3 != null && object3.equals(object4)) ? 0 : 1;
                                    if (!(n2 != 0 ? l4 == (long)(n2 = com.github.catvod.spider.merge.U.h.b((CharSequence)(object2 = l2.c((String)object2))) ? -1 : Integer.parseInt((String)object2)) : l4 == (long)com.github.catvod.spider.merge.j.l.c(l2, this.G()))) continue;
                                    break block8;
                                }
                                if (!((e)object2).l()) break block9;
                                if (!((e)object2).a().booleanValue()) continue;
                                break block8;
                            }
                            if (!((e)object2).r()) break block10;
                            if (!com.github.catvod.spider.merge.U.h.d(((e)object2).g())) continue;
                            break block8;
                        }
                        if (!((e)object2).n()) break block11;
                        if (((AbstractCollection)((e)object2).d()).size() <= 0) continue;
                        break block8;
                    }
                    if (((e)object2).p()) {
                        if (((e)object2).e().size() <= 0) continue;
                    }
                    break block12;
                }
                ((AbstractCollection)g2).add(l2);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(cYh.d("123E2A3F382D0970242927284726203D6D"));
            ((StringBuilder)object).append(object2);
            throw new com.github.catvod.spider.merge.x.b(((StringBuilder)object).toString());
        }
        return new e(g2);
    }

    @Override
    public final Object n(r object) {
        object = (q)((com.github.catvod.spider.merge.P.x)object).k(q.class) != null ? ((q)((com.github.catvod.spider.merge.P.x)object).k(q.class)).e(this) : (((com.github.catvod.spider.merge.P.x)object).m(5) != null ? com.github.catvod.spider.merge.m0.a.b(((com.github.catvod.spider.merge.P.x)object).m(5).c()).b(this.G()) : null);
        return object;
    }

    @Override
    public final Object o(m x2) {
        x2 = x2.n() != null && !x2.n().g() ? x2.n() : (com.github.catvod.spider.merge.g0.d)x2.k(com.github.catvod.spider.merge.g0.d.class);
        return x2.e(this);
    }

    @Override
    public final Object p(s object) {
        List<com.github.catvod.spider.merge.g0.f> list = ((com.github.catvod.spider.merge.P.x)object).l(com.github.catvod.spider.merge.g0.f.class);
        int n2 = list.size();
        if (n2 > 1) {
            object = ((b)list.get(0)).e(this).a();
            for (int i2 = 1; i2 < list.size(); ++i2) {
                object = (Boolean)object | ((b)list.get(i2)).e(this).a();
            }
            object = new e(object);
        } else {
            object = ((b)list.get(0)).e(this);
        }
        return object;
    }

    @Override
    public final Object r(y y2) {
        Object object = null;
        for (int i2 = 0; i2 < y2.d(); ++i2) {
            Object object2 = y2.b(i2);
            if (object2 instanceof z) {
                object = object2 = object2.e(this);
                if (!((e)object2).n()) continue;
                this.H(((e)object2).d());
                object = object2;
                continue;
            }
            object2 = object2.c();
            if (cYh.d("487F").equals(object2)) {
                this.G().h();
                continue;
            }
            this.G().g();
        }
        return object;
    }

    @Override
    public final Object s(w object) {
        List<p> list = ((com.github.catvod.spider.merge.P.x)object).l(p.class);
        if (list != null) {
            if (list.size() > 1) {
                object = new LinkedList();
                list = list.iterator();
                while (list.hasNext()) {
                    e e2 = ((p)list.next()).e(this);
                    if (e2 == null) continue;
                    ((LinkedList)object).add(e2.g());
                }
                object = new e(com.github.catvod.spider.merge.U.h.e(object, cYh.d("5D")));
            } else {
                object = ((b)list.get(0)).e(this);
            }
        } else {
            object = null;
        }
        return object;
    }

    @Override
    public final Object t(t x2) {
        if (((t)x2).n() != null && !((t)x2).n().g()) {
            x2 = ((t)x2).n();
        } else {
            Object object = ((t)x2).g;
            if (object == null) {
                x2 = (j)x2.k(j.class);
            } else {
                object = object.c();
                if (cYh.d("487F").equals(object)) {
                    this.G().h();
                }
                x2 = (y)x2.k(y.class);
            }
        }
        return x2.e(this);
    }

    @Override
    public final Object u(k object) {
        LinkedList<e> linkedList = new LinkedList<e>();
        e e2 = ((l)((com.github.catvod.spider.merge.P.x)object).k(l.class)).e(this);
        for (i i2 : ((com.github.catvod.spider.merge.P.x)object).l(i.class)) {
            this.a.push(d.d(this.G()));
            linkedList.add(i2.e(this));
            this.a.pop();
        }
        return com.github.catvod.spider.merge.m0.a.a(e2.g()).b(this.G(), linkedList);
    }

    @Override
    public final Object v(g object) {
        if (((com.github.catvod.spider.merge.P.x)object).m(7) != null) {
            object = com.github.catvod.spider.merge.m0.a.c(((com.github.catvod.spider.merge.P.x)object).m(7).c()).b(this.G().a());
        } else {
            object = ((com.github.catvod.spider.merge.P.C)object).c();
            if (cYh.d("27").equals(object)) {
                object = new e(null);
                ((e)object).h();
            } else {
                object = null;
            }
        }
        return object;
    }

    @Override
    public final Object w(o object) {
        if (((o)object).n() != null && !((o)object).n().g()) {
            Comparable<e> comparable = ((A)((com.github.catvod.spider.merge.P.x)object).k(A.class)).e(this);
            e e2 = ((o)object).n().e(this);
            switch (((o)object).g.e()) {
                default: {
                    comparable = com.github.catvod.spider.merge.d.d.b(cYh.d("14292F2536224735332338284B70"));
                    ((StringBuilder)comparable).append(((com.github.catvod.spider.merge.P.C)object).c());
                    throw new com.github.catvod.spider.merge.x.b(((StringBuilder)comparable).toString());
                }
                case 19: {
                    object = new e(((e)comparable).c() % e2.c());
                    break;
                }
                case 18: {
                    object = new e(((e)comparable).c() / e2.c());
                    break;
                }
                case 17: {
                    double d2 = ((e)comparable).c();
                    object = new e(e2.c() * d2);
                    break;
                }
            }
        } else {
            object = ((A)((com.github.catvod.spider.merge.P.x)object).k(A.class)).e(this);
        }
        return object;
    }

    @Override
    public final Object x(com.github.catvod.spider.merge.g0.d d2) {
        String string;
        String string2 = d2.g.c();
        boolean bl = string2 == (string = cYh.d("487F")) || string2 != null && string2.equals(string);
        if (bl) {
            this.G().h();
        }
        return ((y)d2.k(y.class)).e(this);
    }

    @Override
    public final Object y(C c2) {
        return this.A(c2);
    }

    @Override
    public final Object z(com.github.catvod.spider.merge.g0.f object) {
        List<h> list = ((com.github.catvod.spider.merge.P.x)object).l(h.class);
        int n2 = list.size();
        if (n2 > 1) {
            object = ((b)list.get(0)).e(this).a();
            for (int i2 = 1; i2 < list.size(); ++i2) {
                object = (Boolean)object & ((b)list.get(i2)).e(this).a();
            }
            object = new e(object);
        } else {
            object = ((b)list.get(0)).e(this);
        }
        return object;
    }
}

