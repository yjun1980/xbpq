/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.b0.b;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.A;
import com.github.catvod.spider.merge.e0.B;
import com.github.catvod.spider.merge.e0.C;
import com.github.catvod.spider.merge.e0.D;
import com.github.catvod.spider.merge.e0.E;
import com.github.catvod.spider.merge.e0.F;
import com.github.catvod.spider.merge.e0.G;
import com.github.catvod.spider.merge.e0.H;
import com.github.catvod.spider.merge.e0.I;
import com.github.catvod.spider.merge.e0.J;
import com.github.catvod.spider.merge.e0.K;
import com.github.catvod.spider.merge.e0.L;
import com.github.catvod.spider.merge.e0.M;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.Q;
import com.github.catvod.spider.merge.e0.S;
import com.github.catvod.spider.merge.e0.T;
import com.github.catvod.spider.merge.e0.U;
import com.github.catvod.spider.merge.e0.V;
import com.github.catvod.spider.merge.e0.W;
import com.github.catvod.spider.merge.e0.X;
import com.github.catvod.spider.merge.e0.Y;
import com.github.catvod.spider.merge.e0.d;
import com.github.catvod.spider.merge.e0.e;
import com.github.catvod.spider.merge.e0.f;
import com.github.catvod.spider.merge.e0.h;
import com.github.catvod.spider.merge.e0.i;
import com.github.catvod.spider.merge.e0.k;
import com.github.catvod.spider.merge.e0.l;
import com.github.catvod.spider.merge.e0.m;
import com.github.catvod.spider.merge.e0.n;
import com.github.catvod.spider.merge.e0.o;
import com.github.catvod.spider.merge.e0.p;
import com.github.catvod.spider.merge.e0.q;
import com.github.catvod.spider.merge.e0.r;
import com.github.catvod.spider.merge.e0.s;
import com.github.catvod.spider.merge.e0.u;
import com.github.catvod.spider.merge.e0.v;
import com.github.catvod.spider.merge.e0.x;
import com.github.catvod.spider.merge.e0.y;
import com.github.catvod.spider.merge.e0.z;
import com.github.catvod.spider.merge.x.a;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class P {
    private static final String[] d = new String[]{cYh.d("4B"), cYh.d("59"), cYh.d("4C"), cYh.d("19"), cYh.d("47")};
    private static final String[] e = new String[]{cYh.d("5A"), cYh.d("466D"), cYh.d("396D"), cYh.d("436D"), cYh.d("4D6D"), cYh.d("196D")};
    private static final Pattern f = Pattern.compile(cYh.d("4F781A7A7A074E6F690D33714E6F683F7F06147A690A7C773A797E0D24703B346A7868"), 2);
    private static final Pattern g = Pattern.compile(cYh.d("4F0B6A7C0A7358781D357C73"));
    private final com.github.catvod.spider.merge.d0.P a;
    private final String b;
    private final List<N> c = new ArrayList<N>();

    private P(String string) {
        com.github.catvod.spider.merge.N.a.i(string);
        this.b = string = string.trim();
        this.a = new com.github.catvod.spider.merge.d0.P(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(char c2) {
        int n2;
        Object object;
        Object object2;
        Object object3;
        block14: {
            N n3;
            block21: {
                block22: {
                    block20: {
                        block19: {
                            block18: {
                                this.a.h();
                                object3 = com.github.catvod.spider.merge.b0.b.a();
                                while (!this.a.i()) {
                                    block17: {
                                        block16: {
                                            block15: {
                                                object2 = this.a;
                                                object = cYh.d("4F");
                                                if (!((com.github.catvod.spider.merge.d0.P)object2).k((String)object)) break block15;
                                                ((StringBuilder)object3).append((String)object);
                                                ((StringBuilder)object3).append(this.a.a('(', ')'));
                                                object2 = cYh.d("4E");
                                                break block16;
                                            }
                                            object = this.a;
                                            object2 = cYh.d("3C");
                                            if (!((com.github.catvod.spider.merge.d0.P)object).k((String)object2)) break block17;
                                            ((StringBuilder)object3).append((String)object2);
                                            ((StringBuilder)object3).append(this.a.a('[', ']'));
                                            object2 = cYh.d("3A");
                                        }
                                        ((StringBuilder)object3).append((String)object2);
                                        continue;
                                    }
                                    if (this.a.l(d)) break;
                                    ((StringBuilder)object3).append(this.a.c());
                                }
                                n3 = P.h(com.github.catvod.spider.merge.b0.b.g((StringBuilder)object3));
                                if (((ArrayList)this.c).size() != 1) break block18;
                                object2 = object3 = (N)((ArrayList)this.c).get(0);
                                if (!(object3 instanceof e)) break block19;
                                object2 = object3;
                                if (c2 == ',') break block19;
                                object2 = (e)object3;
                                n2 = ((f)object2).b;
                                object2 = n2 > 0 ? ((f)object2).a.get(n2 - 1) : null;
                                n2 = 1;
                                object = object2;
                                break block20;
                            }
                            object2 = new d(this.c);
                        }
                        object = object2;
                        n2 = 0;
                        object3 = object2;
                    }
                    ((ArrayList)this.c).clear();
                    if (c2 == ' ') break block21;
                    if (c2 == '>') break block22;
                    if (c2 != '~') {
                        if (c2 != '+') {
                            if (c2 != ',') {
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append(cYh.d("323E2A3F382D0970223E3A380E3E202538285D70"));
                                ((StringBuilder)object2).append(c2);
                                throw new Q(((StringBuilder)object2).toString(), new Object[0]);
                            }
                            if (object instanceof e) {
                                object2 = (e)object;
                            } else {
                                object2 = new e();
                                ((f)object2).a.add((N)object);
                                ((f)object2).b();
                            }
                            ((f)object2).a.add(n3);
                            ((f)object2).b();
                            break block14;
                        } else {
                            object2 = new d(new U((N)object), n3);
                        }
                        break block14;
                    } else {
                        object2 = new d(new X((N)object), n3);
                    }
                    break block14;
                }
                object2 = new d(new T((N)object), n3);
                break block14;
            }
            object2 = new d(new W((N)object), n3);
        }
        if (n2 != 0) {
            object = (e)object3;
            ((f)object).a.set(((f)object).b - 1, (N)object2);
        } else {
            object3 = object2;
        }
        ((ArrayList)this.c).add((N)object3);
    }

    private int b() {
        int n2;
        Object object;
        block5: {
            int n3;
            object = this.a.b().trim();
            n2 = com.github.catvod.spider.merge.b0.b.d;
            n2 = n3 = 0;
            if (object != null) {
                if (((String)object).length() == 0) {
                    n2 = n3;
                } else {
                    int n4 = ((String)object).length();
                    for (n2 = 0; n2 < n4; ++n2) {
                        if (Character.isDigit(((String)object).codePointAt(n2))) continue;
                        n2 = n3;
                        break block5;
                    }
                    n2 = 1;
                }
            }
        }
        if (n2 != 0) {
            return Integer.parseInt((String)object);
        }
        object = new IllegalArgumentException(cYh.d("2E3E25342F7A0A253225773802702F243A3F153922"));
        throw object;
    }

    private void c(boolean bl) {
        List<N> list = this.a;
        Object object = bl ? cYh.d("5D332E3F233B0E3E321E2034") : cYh.d("5D332E3F233B0E3E32");
        ((com.github.catvod.spider.merge.d0.P)((Object)list)).d((String)object);
        object = com.github.catvod.spider.merge.d0.P.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.N.a.j((String)object, cYh.d("5D332E3F233B0E3E3279233F1F246871262F022238713A2F1424613F382E473224713237172438"));
        if (bl) {
            list = this.c;
            object = new r((String)object);
        } else {
            list = this.c;
            object = new s((String)object);
        }
        ((ArrayList)list).add((N)object);
    }

    /*
     * Unable to fully structure code
     */
    private void d(boolean var1_1, boolean var2_2) {
        block17: {
            block15: {
                block16: {
                    var9_3 = com.github.catvod.spider.merge.x.a.d(this.a.b());
                    var7_4 = P.f.matcher(var9_3);
                    var8_5 = P.g.matcher(var9_3);
                    var6_6 = cYh.d("083425").equals(var9_3);
                    var3_7 = 0;
                    var4_8 = 0;
                    var5_9 = 1;
                    if (var6_6) {
                        var3_7 = 1;
lbl10:
                        // 2 sources

                        while (true) {
                            var4_8 = 2;
                            break block15;
                            break;
                        }
                    }
                    if (cYh.d("0226243F").equals(var9_3)) {
                        var3_7 = 0;
                        ** continue;
                    }
                    var6_6 = var7_4.matches();
                    var10_10 = cYh.d("390C6A");
                    if (!var6_6) break block16;
                    var3_7 = var5_9;
                    if (var7_4.group(3) != null) {
                        var3_7 = Integer.parseInt(var7_4.group(1).replaceFirst(var10_10, ""));
                    }
                    if (var7_4.group(4) != null) {
                        var4_8 = Integer.parseInt(var7_4.group(4).replaceFirst(var10_10, ""));
                    }
                    var5_9 = var3_7;
                    var3_7 = var4_8;
                    var4_8 = var5_9;
                    break block15;
                }
                if (!var8_5.matches()) break block17;
                var5_9 = Integer.parseInt(var8_5.group().replaceFirst(var10_10, ""));
                var4_8 = var3_7;
                var3_7 = var5_9;
            }
            if (var2_2) {
                if (var1_1) {
                    var7_4 = this.c;
                    var8_5 = new G(var4_8, var3_7);
                } else {
                    var7_4 = this.c;
                    var8_5 = new H(var4_8, var3_7);
                }
            } else if (var1_1) {
                var7_4 = this.c;
                var8_5 = new F(var4_8, var3_7);
            } else {
                var7_4 = this.c;
                var8_5 = new E(var4_8, var3_7);
            }
            var7_4.add((Object)var8_5);
            return;
        }
        var7_4 = new Q(cYh.d("243F343D337A093F3571273B15232471392E0F7D283F333F1F706674247D5D70343F322217352225323E47362E233A3B13"), new Object[]{var9_3});
        throw var7_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void e() {
        Object object;
        boolean bl;
        block38: {
            void var3_27;
            block40: {
                block48: {
                    void var3_25;
                    block45: {
                        block47: {
                            block46: {
                                block44: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                block39: {
                                                    if (this.a.j(cYh.d("44"))) {
                                                        String string = this.a.e();
                                                        com.github.catvod.spider.merge.N.a.i(string);
                                                        ((ArrayList)this.c).add(new u(string));
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("49"))) {
                                                        String string = this.a.e();
                                                        com.github.catvod.spider.merge.N.a.i(string);
                                                        ((ArrayList)this.c).add(new i(string.trim(), 1));
                                                        return;
                                                    }
                                                    bl = this.a.m();
                                                    object = cYh.d("4D2C");
                                                    if (bl || this.a.k((String)object)) break block38;
                                                    if (this.a.k(cYh.d("3C"))) {
                                                        void var3_15;
                                                        com.github.catvod.spider.merge.d0.P p2 = new com.github.catvod.spider.merge.d0.P(this.a.a('[', ']'));
                                                        String string = p2.g(e);
                                                        com.github.catvod.spider.merge.N.a.i(string);
                                                        p2.h();
                                                        if (p2.i()) {
                                                            void var3_8;
                                                            if (string.startsWith(cYh.d("39"))) {
                                                                List<N> list = this.c;
                                                                object = new k(string.substring(1), 0);
                                                            } else {
                                                                List<N> list = this.c;
                                                                object = new i(string, 0);
                                                            }
                                                            var3_8.add(object);
                                                            return;
                                                        }
                                                        if (p2.j(cYh.d("5A"))) {
                                                            object = this.c;
                                                            l l2 = new l(string, p2.n());
                                                        } else if (p2.j(cYh.d("466D"))) {
                                                            object = this.c;
                                                            p p3 = new p(string, p2.n());
                                                        } else if (p2.j(cYh.d("396D"))) {
                                                            object = this.c;
                                                            q q2 = new q(string, p2.n());
                                                        } else if (p2.j(cYh.d("436D"))) {
                                                            object = this.c;
                                                            n n2 = new n(string, p2.n());
                                                        } else if (p2.j(cYh.d("4D6D"))) {
                                                            object = this.c;
                                                            m m2 = new m(string, p2.n());
                                                        } else {
                                                            if (!p2.j(cYh.d("196D"))) {
                                                                object = this.b;
                                                                String string2 = p2.n();
                                                                throw new Q(cYh.d("243F343D337A093F3571273B15232471362E13222833222E0270302432281E706674247D5D70343F322217352225323E47242E3A323447313571707F1477"), object, string2);
                                                            }
                                                            object = this.c;
                                                            o o2 = new o(string, Pattern.compile(p2.n()));
                                                        }
                                                        ((ArrayList)object).add(var3_15);
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("4D"))) {
                                                        ((ArrayList)this.c).add(new h());
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("5D3C3579"))) {
                                                        ((ArrayList)this.c).add(new y(this.b()));
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("5D373579"))) {
                                                        ((ArrayList)this.c).add(new x(this.b()));
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("5D353079"))) {
                                                        ((ArrayList)this.c).add(new v(this.b()));
                                                        return;
                                                    }
                                                    if (this.a.k(cYh.d("5D3820227F"))) {
                                                        this.a.d(cYh.d("5D382022"));
                                                        object = this.a.a('(', ')');
                                                        com.github.catvod.spider.merge.N.a.j(object, cYh.d("5D3820227F3F0B796122223814352D34342E473D3422237A093F3571353F47352C212323"));
                                                        ((ArrayList)this.c).add(new S(P.h(object)));
                                                        return;
                                                    }
                                                    if (this.a.k(cYh.d("5D332E3F233B0E3E3279"))) {
                                                        this.c(false);
                                                        return;
                                                    }
                                                    if (this.a.k(cYh.d("5D332E3F233B0E3E321E20344F"))) {
                                                        this.c(true);
                                                        return;
                                                    }
                                                    if (this.a.k(cYh.d("5D332E3F233B0E3E3215362E0678"))) {
                                                        this.a.d(cYh.d("5D332E3F233B0E3E3215362E06"));
                                                        object = com.github.catvod.spider.merge.d0.P.o(this.a.a('(', ')'));
                                                        com.github.catvod.spider.merge.N.a.j((String)object, cYh.d("5D332E3F233B0E3E3215362E067835342F2E4E70302432281E702C24242E473E2E2577380270243C272E1E"));
                                                        ((ArrayList)this.c).add(new k((String)object, 1));
                                                        return;
                                                    }
                                                    if (this.a.k(cYh.d("5D3D20253432022369"))) {
                                                        this.f(false);
                                                        return;
                                                    }
                                                    if (this.a.k(cYh.d("5D3D2025343202230E263972"))) {
                                                        this.f(true);
                                                        return;
                                                    }
                                                    if (this.a.k(cYh.d("5D3E2E257F"))) {
                                                        this.a.d(cYh.d("5D3E2E25"));
                                                        object = this.a.a('(', ')');
                                                        com.github.catvod.spider.merge.N.a.j((String)object, cYh.d("5D3E2E257F29023C2432233515796122223814352D34342E473D3422237A093F3571353F47352C212323"));
                                                        ((ArrayList)this.c).add(new V(P.h((String)object)));
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("5D3E35397A390F392D357F"))) {
                                                        this.d(false, false);
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("5D3E35397A360623357C34320E3C2579"))) {
                                                        this.d(true, false);
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("5D3E35397A35017D3528273F4F"))) {
                                                        this.d(false, true);
                                                        return;
                                                    }
                                                    if (this.a.j(cYh.d("5D3E35397A360623357C383C4A2438213272"))) {
                                                        this.d(true, true);
                                                        return;
                                                    }
                                                    if (!this.a.j(cYh.d("5D362823242E4A3329383B3E"))) break block39;
                                                    object = this.c;
                                                    A a2 = new A(0);
                                                    break block40;
                                                }
                                                if (!this.a.j(cYh.d("5D3C202223770438283D33"))) break block41;
                                                object = this.c;
                                                C c2 = new C(0);
                                                break block40;
                                            }
                                            if (!this.a.j(cYh.d("5D362823242E4A3F277C23231735"))) break block42;
                                            object = this.c;
                                            B b2 = new B();
                                            break block40;
                                        }
                                        if (!this.a.j(cYh.d("5D3C2022237708366C252E2A02"))) break block43;
                                        object = this.c;
                                        D d2 = new D();
                                        break block40;
                                    }
                                    if (!this.a.j(cYh.d("5D3F2F3D2E770438283D33"))) break block44;
                                    object = this.c;
                                    A a3 = new A(1);
                                    break block45;
                                }
                                if (!this.a.j(cYh.d("5D3F2F3D2E7708366C252E2A02"))) break block46;
                                object = this.c;
                                I i2 = new I();
                                break block40;
                            }
                            if (!this.a.j(cYh.d("5D352C212323"))) break block47;
                            object = this.c;
                            z z2 = new z();
                            break block40;
                        }
                        if (!this.a.j(cYh.d("5D222E3E23"))) break block48;
                        object = this.c;
                        C c3 = new C(1);
                    }
                    ((ArrayList)object).add(var3_25);
                    return;
                }
                if (!this.a.j(cYh.d("5D3D2025343233353925"))) {
                    String string = this.b;
                    object = this.a.n();
                    throw new Q(cYh.d("243F343D337A093F3571273B15232471262F02223871707F14777B71223402283134342E023461253831023E6130237A40753276"), string, object);
                }
                object = this.c;
                J j2 = new J();
            }
            ((ArrayList)object).add(var3_27);
            return;
        }
        String string = com.github.catvod.spider.merge.x.a.d(this.a.f());
        com.github.catvod.spider.merge.N.a.i(string);
        bl = string.startsWith((String)object);
        String string3 = cYh.d("5D");
        if (bl) {
            ((ArrayList)this.c).add(new e(new M(string), new i(string.replace((CharSequence)object, string3), 2)));
            return;
        }
        String string4 = cYh.d("1B");
        object = string;
        if (string.contains(string4)) {
            object = string.replace(string4, string3);
        }
        ((ArrayList)this.c).add(new M((String)object));
    }

    private void f(boolean bl) {
        List<N> list = this.a;
        Object object = bl ? cYh.d("5D3D2025343202230E2639") : cYh.d("5D3D202534320223");
        ((com.github.catvod.spider.merge.d0.P)((Object)list)).d((String)object);
        object = this.a.a('(', ')');
        com.github.catvod.spider.merge.N.a.j((String)object, cYh.d("5D3D2025343202236923323D02286871262F022238713A2F1424613F382E473224713237172438"));
        if (bl) {
            list = this.c;
            object = new L(Pattern.compile((String)object));
        } else {
            list = this.c;
            object = new K(Pattern.compile((String)object));
        }
        ((ArrayList)list).add((N)object);
    }

    public static N h(String object) {
        try {
            P p2 = new P((String)object);
            object = p2.g();
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new Q(illegalArgumentException.getMessage(), new Object[0]);
        }
    }

    /*
     * Unable to fully structure code
     */
    final N g() {
        block5: {
            this.a.h();
            if (!this.a.l(P.d)) break block5;
            this.c.add(new Y());
            var3_1 = this;
            ** GOTO lbl-1000
        }
        var4_2 = this;
        block0: while (true) {
            var4_2.e();
            var3_1 = var4_2;
            while (!var3_1.a.i()) {
                var2_4 = var3_1.a.h();
                if (var3_1.a.l(P.d)) lbl-1000:
                // 2 sources

                {
                    var1_3 = var3_1.a.c();
                } else {
                    var4_2 = var3_1;
                    if (!var2_4) continue block0;
                    var1_3 = 32;
                }
                var3_1.a((char)var1_3);
            }
            break;
        }
        if (var3_1.c.size() == 1) {
            return (N)var3_1.c.get(0);
        }
        return new d(var3_1.c);
    }

    public final String toString() {
        return this.b;
    }
}

