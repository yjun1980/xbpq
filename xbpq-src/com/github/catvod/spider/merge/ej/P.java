/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.ej.A;
import com.github.catvod.spider.merge.ej.B;
import com.github.catvod.spider.merge.ej.C;
import com.github.catvod.spider.merge.ej.D;
import com.github.catvod.spider.merge.ej.E;
import com.github.catvod.spider.merge.ej.F;
import com.github.catvod.spider.merge.ej.G;
import com.github.catvod.spider.merge.ej.H;
import com.github.catvod.spider.merge.ej.I;
import com.github.catvod.spider.merge.ej.J;
import com.github.catvod.spider.merge.ej.K;
import com.github.catvod.spider.merge.ej.L;
import com.github.catvod.spider.merge.ej.M;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.Q;
import com.github.catvod.spider.merge.ej.S;
import com.github.catvod.spider.merge.ej.T;
import com.github.catvod.spider.merge.ej.U;
import com.github.catvod.spider.merge.ej.V;
import com.github.catvod.spider.merge.ej.W;
import com.github.catvod.spider.merge.ej.X;
import com.github.catvod.spider.merge.ej.Y;
import com.github.catvod.spider.merge.ej.d;
import com.github.catvod.spider.merge.ej.e;
import com.github.catvod.spider.merge.ej.f;
import com.github.catvod.spider.merge.ej.h;
import com.github.catvod.spider.merge.ej.i;
import com.github.catvod.spider.merge.ej.k;
import com.github.catvod.spider.merge.ej.l;
import com.github.catvod.spider.merge.ej.m;
import com.github.catvod.spider.merge.ej.n;
import com.github.catvod.spider.merge.ej.o;
import com.github.catvod.spider.merge.ej.p;
import com.github.catvod.spider.merge.ej.q;
import com.github.catvod.spider.merge.ej.r;
import com.github.catvod.spider.merge.ej.s;
import com.github.catvod.spider.merge.ej.u;
import com.github.catvod.spider.merge.ej.v;
import com.github.catvod.spider.merge.ej.x;
import com.github.catvod.spider.merge.ej.y;
import com.github.catvod.spider.merge.ej.z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class P {
    private static final String[] d = new String[]{",", ">", "+", "~", " "};
    private static final String[] e = new String[]{"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final com.github.catvod.spider.merge.Fs.P a;
    private final String b;
    private final List<N> c = new ArrayList<N>();

    private P(String string) {
        com.github.catvod.spider.merge.Dw.i.i(string);
        this.b = string = string.trim();
        this.a = new com.github.catvod.spider.merge.Fs.P(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(char c2) {
        Object object;
        int n2;
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
                                object3 = com.github.catvod.spider.merge.Dw.e.a();
                                while (!this.a.i()) {
                                    block17: {
                                        block16: {
                                            block15: {
                                                if (!this.a.k("(")) break block15;
                                                ((StringBuilder)object3).append("(");
                                                ((StringBuilder)object3).append(this.a.a('(', ')'));
                                                object2 = ")";
                                                break block16;
                                            }
                                            if (!this.a.k("[")) break block17;
                                            ((StringBuilder)object3).append("[");
                                            ((StringBuilder)object3).append(this.a.a('[', ']'));
                                            object2 = "]";
                                        }
                                        ((StringBuilder)object3).append((String)object2);
                                        continue;
                                    }
                                    if (this.a.l(d)) break;
                                    ((StringBuilder)object3).append(this.a.c());
                                }
                                n3 = P.h(com.github.catvod.spider.merge.Dw.e.g((StringBuilder)object3));
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
                                ((StringBuilder)object2).append("Unknown combinator: ");
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
            n2 = com.github.catvod.spider.merge.Dw.e.d;
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
        object = new IllegalArgumentException("Index must be numeric");
        throw object;
    }

    private void c(boolean bl) {
        List<N> list = this.a;
        Object object = bl ? ":containsOwn" : ":contains";
        ((com.github.catvod.spider.merge.Fs.P)((Object)list)).d((String)object);
        object = com.github.catvod.spider.merge.Fs.P.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.Dw.i.j((String)object, ":contains(text) query must not be empty");
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
                    var7_3 = com.github.catvod.spider.merge.Dw.s.d(this.a.b());
                    var8_4 = P.f.matcher((CharSequence)var7_3);
                    var9_5 = P.g.matcher((CharSequence)var7_3);
                    var6_6 = "odd".equals(var7_3);
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
                    if ("even".equals(var7_3)) {
                        var3_7 = 0;
                        ** continue;
                    }
                    if (!var8_4.matches()) break block16;
                    var3_7 = var5_9;
                    if (var8_4.group(3) != null) {
                        var3_7 = Integer.parseInt(var8_4.group(1).replaceFirst("^\\+", ""));
                    }
                    if (var8_4.group(4) != null) {
                        var4_8 = Integer.parseInt(var8_4.group(4).replaceFirst("^\\+", ""));
                    }
                    var5_9 = var4_8;
                    var4_8 = var3_7;
                    var3_7 = var5_9;
                    break block15;
                }
                if (!var9_5.matches()) break block17;
                var5_9 = Integer.parseInt(var9_5.group().replaceFirst("^\\+", ""));
                var4_8 = var3_7;
                var3_7 = var5_9;
            }
            if (var2_2) {
                if (var1_1) {
                    var7_3 = this.c;
                    var8_4 = new G(var4_8, var3_7);
                } else {
                    var7_3 = this.c;
                    var8_4 = new H(var4_8, var3_7);
                }
            } else if (var1_1) {
                var7_3 = this.c;
                var8_4 = new F(var4_8, var3_7);
            } else {
                var7_3 = this.c;
                var8_4 = new E(var4_8, var3_7);
            }
            var7_3.add((Object)var8_4);
            return;
        }
        var7_3 = new Q("Could not parse nth-index '%s': unexpected format", new Object[]{var7_3});
        throw var7_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void e() {
        block38: {
            void var2_33;
            List<N> list;
            block40: {
                block48: {
                    void var2_31;
                    List<N> list2;
                    block45: {
                        block47: {
                            block46: {
                                block44: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                block39: {
                                                    if (this.a.j("#")) {
                                                        String string = this.a.e();
                                                        com.github.catvod.spider.merge.Dw.i.i(string);
                                                        ((ArrayList)this.c).add(new u(string));
                                                        return;
                                                    }
                                                    if (this.a.j(".")) {
                                                        String string = this.a.e();
                                                        com.github.catvod.spider.merge.Dw.i.i(string);
                                                        ((ArrayList)this.c).add(new i(string.trim(), 1));
                                                        return;
                                                    }
                                                    if (this.a.m() || this.a.k("*|")) break block38;
                                                    if (this.a.k("[")) {
                                                        void var2_22;
                                                        List<N> list3;
                                                        com.github.catvod.spider.merge.Fs.P p2 = new com.github.catvod.spider.merge.Fs.P(this.a.a('[', ']'));
                                                        String string = p2.g(e);
                                                        com.github.catvod.spider.merge.Dw.i.i(string);
                                                        p2.h();
                                                        if (p2.i()) {
                                                            void var2_15;
                                                            List<N> list4;
                                                            if (string.startsWith("^")) {
                                                                list4 = this.c;
                                                                k k2 = new k(string.substring(1), 0);
                                                            } else {
                                                                list4 = this.c;
                                                                i i2 = new i(string, 0);
                                                            }
                                                            ((ArrayList)list4).add((N)var2_15);
                                                            return;
                                                        }
                                                        if (p2.j("=")) {
                                                            list3 = this.c;
                                                            l l2 = new l(string, p2.n());
                                                        } else if (p2.j("!=")) {
                                                            list3 = this.c;
                                                            p p3 = new p(string, p2.n());
                                                        } else if (p2.j("^=")) {
                                                            list3 = this.c;
                                                            q q2 = new q(string, p2.n());
                                                        } else if (p2.j("$=")) {
                                                            list3 = this.c;
                                                            n n2 = new n(string, p2.n());
                                                        } else if (p2.j("*=")) {
                                                            list3 = this.c;
                                                            m m2 = new m(string, p2.n());
                                                        } else {
                                                            if (!p2.j("~=")) {
                                                                throw new Q("Could not parse attribute query '%s': unexpected token at '%s'", this.b, p2.n());
                                                            }
                                                            list3 = this.c;
                                                            o o2 = new o(string, Pattern.compile(p2.n()));
                                                        }
                                                        ((ArrayList)list3).add((N)var2_22);
                                                        return;
                                                    }
                                                    if (this.a.j("*")) {
                                                        ((ArrayList)this.c).add(new h());
                                                        return;
                                                    }
                                                    if (this.a.j(":lt(")) {
                                                        ((ArrayList)this.c).add(new y(this.b()));
                                                        return;
                                                    }
                                                    if (this.a.j(":gt(")) {
                                                        ((ArrayList)this.c).add(new x(this.b()));
                                                        return;
                                                    }
                                                    if (this.a.j(":eq(")) {
                                                        ((ArrayList)this.c).add(new v(this.b()));
                                                        return;
                                                    }
                                                    if (this.a.k(":has(")) {
                                                        this.a.d(":has");
                                                        String string = this.a.a('(', ')');
                                                        com.github.catvod.spider.merge.Dw.i.j(string, ":has(el) subselect must not be empty");
                                                        ((ArrayList)this.c).add(new S(P.h(string)));
                                                        return;
                                                    }
                                                    if (this.a.k(":contains(")) {
                                                        this.c(false);
                                                        return;
                                                    }
                                                    if (this.a.k(":containsOwn(")) {
                                                        this.c(true);
                                                        return;
                                                    }
                                                    if (this.a.k(":containsData(")) {
                                                        this.a.d(":containsData");
                                                        String string = com.github.catvod.spider.merge.Fs.P.o(this.a.a('(', ')'));
                                                        com.github.catvod.spider.merge.Dw.i.j(string, ":containsData(text) query must not be empty");
                                                        ((ArrayList)this.c).add(new k(string, 1));
                                                        return;
                                                    }
                                                    if (this.a.k(":matches(")) {
                                                        this.f(false);
                                                        return;
                                                    }
                                                    if (this.a.k(":matchesOwn(")) {
                                                        this.f(true);
                                                        return;
                                                    }
                                                    if (this.a.k(":not(")) {
                                                        this.a.d(":not");
                                                        String string = this.a.a('(', ')');
                                                        com.github.catvod.spider.merge.Dw.i.j(string, ":not(selector) subselect must not be empty");
                                                        ((ArrayList)this.c).add(new V(P.h(string)));
                                                        return;
                                                    }
                                                    if (this.a.j(":nth-child(")) {
                                                        this.d(false, false);
                                                        return;
                                                    }
                                                    if (this.a.j(":nth-last-child(")) {
                                                        this.d(true, false);
                                                        return;
                                                    }
                                                    if (this.a.j(":nth-of-type(")) {
                                                        this.d(false, true);
                                                        return;
                                                    }
                                                    if (this.a.j(":nth-last-of-type(")) {
                                                        this.d(true, true);
                                                        return;
                                                    }
                                                    if (!this.a.j(":first-child")) break block39;
                                                    list = this.c;
                                                    A a2 = new A(0);
                                                    break block40;
                                                }
                                                if (!this.a.j(":last-child")) break block41;
                                                list = this.c;
                                                C c2 = new C(0);
                                                break block40;
                                            }
                                            if (!this.a.j(":first-of-type")) break block42;
                                            list = this.c;
                                            B b2 = new B();
                                            break block40;
                                        }
                                        if (!this.a.j(":last-of-type")) break block43;
                                        list = this.c;
                                        D d2 = new D();
                                        break block40;
                                    }
                                    if (!this.a.j(":only-child")) break block44;
                                    list2 = this.c;
                                    A a3 = new A(1);
                                    break block45;
                                }
                                if (!this.a.j(":only-of-type")) break block46;
                                list = this.c;
                                I i4 = new I();
                                break block40;
                            }
                            if (!this.a.j(":empty")) break block47;
                            list = this.c;
                            z z2 = new z();
                            break block40;
                        }
                        if (!this.a.j(":root")) break block48;
                        list2 = this.c;
                        C c3 = new C(1);
                    }
                    ((ArrayList)list2).add((N)var2_31);
                    return;
                }
                if (!this.a.j(":matchText")) {
                    throw new Q("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.n());
                }
                list = this.c;
                J j2 = new J();
            }
            ((ArrayList)list).add((N)var2_33);
            return;
        }
        String string = com.github.catvod.spider.merge.Dw.s.d(this.a.f());
        com.github.catvod.spider.merge.Dw.i.i(string);
        if (string.startsWith("*|")) {
            ((ArrayList)this.c).add(new e(new M(string), new i(string.replace("*|", ":"), 2)));
            return;
        }
        String string2 = string;
        if (string.contains("|")) {
            string2 = string.replace("|", ":");
        }
        ((ArrayList)this.c).add(new M(string2));
    }

    private void f(boolean bl) {
        Object object = this.a;
        Object object2 = bl ? ":matchesOwn" : ":matches";
        ((com.github.catvod.spider.merge.Fs.P)object).d((String)object2);
        object = this.a.a('(', ')');
        com.github.catvod.spider.merge.Dw.i.j((String)object, ":matches(regex) query must not be empty");
        if (bl) {
            object2 = this.c;
            object = new L(Pattern.compile((String)object));
        } else {
            object2 = this.c;
            object = new K(Pattern.compile((String)object));
        }
        ((ArrayList)object2).add((Object)object);
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

