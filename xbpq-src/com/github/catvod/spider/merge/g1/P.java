/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.g1.A;
import com.github.catvod.spider.merge.g1.B;
import com.github.catvod.spider.merge.g1.C;
import com.github.catvod.spider.merge.g1.D;
import com.github.catvod.spider.merge.g1.E;
import com.github.catvod.spider.merge.g1.F;
import com.github.catvod.spider.merge.g1.G;
import com.github.catvod.spider.merge.g1.H;
import com.github.catvod.spider.merge.g1.I;
import com.github.catvod.spider.merge.g1.J;
import com.github.catvod.spider.merge.g1.K;
import com.github.catvod.spider.merge.g1.L;
import com.github.catvod.spider.merge.g1.M;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.Q;
import com.github.catvod.spider.merge.g1.S;
import com.github.catvod.spider.merge.g1.T;
import com.github.catvod.spider.merge.g1.U;
import com.github.catvod.spider.merge.g1.V;
import com.github.catvod.spider.merge.g1.W;
import com.github.catvod.spider.merge.g1.X;
import com.github.catvod.spider.merge.g1.Y;
import com.github.catvod.spider.merge.g1.d;
import com.github.catvod.spider.merge.g1.e;
import com.github.catvod.spider.merge.g1.f;
import com.github.catvod.spider.merge.g1.h;
import com.github.catvod.spider.merge.g1.i;
import com.github.catvod.spider.merge.g1.k;
import com.github.catvod.spider.merge.g1.l;
import com.github.catvod.spider.merge.g1.m;
import com.github.catvod.spider.merge.g1.n;
import com.github.catvod.spider.merge.g1.o;
import com.github.catvod.spider.merge.g1.p;
import com.github.catvod.spider.merge.g1.q;
import com.github.catvod.spider.merge.g1.r;
import com.github.catvod.spider.merge.g1.s;
import com.github.catvod.spider.merge.g1.t;
import com.github.catvod.spider.merge.g1.u;
import com.github.catvod.spider.merge.g1.w;
import com.github.catvod.spider.merge.g1.x;
import com.github.catvod.spider.merge.g1.z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class P {
    private static final String[] d = new String[]{",", ">", "+", "~", " "};
    private static final String[] e = new String[]{"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final com.github.catvod.spider.merge.f1.Q a;
    private final String b;
    private final List<N> c = new ArrayList<N>();

    private P(String string) {
        com.github.catvod.spider.merge.c1.d.h(string);
        this.b = string = string.trim();
        this.a = new com.github.catvod.spider.merge.f1.Q(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(char c2) {
        Object object;
        int n2;
        N n3;
        Object object2;
        Object object3;
        block22: {
            block21: {
                block20: {
                    this.a.h();
                    object3 = com.github.catvod.spider.merge.d1.c.b();
                    while (!this.a.i()) {
                        block19: {
                            block18: {
                                block17: {
                                    if (!this.a.k("(")) break block17;
                                    ((StringBuilder)object3).append("(");
                                    ((StringBuilder)object3).append(this.a.a('(', ')'));
                                    object2 = ")";
                                    break block18;
                                }
                                if (!this.a.k("[")) break block19;
                                ((StringBuilder)object3).append("[");
                                ((StringBuilder)object3).append(this.a.a('[', ']'));
                                object2 = "]";
                            }
                            ((StringBuilder)object3).append((String)object2);
                            continue;
                        }
                        if (this.a.l(d)) {
                            if (((StringBuilder)object3).length() > 0) break;
                            this.a.c();
                            continue;
                        }
                        ((StringBuilder)object3).append(this.a.c());
                    }
                    n3 = P.j(com.github.catvod.spider.merge.d1.c.i((StringBuilder)object3));
                    if (((ArrayList)this.c).size() != 1) break block20;
                    object2 = object3 = (N)((ArrayList)this.c).get(0);
                    if (!(object3 instanceof e)) break block21;
                    object2 = object3;
                    if (c2 == ',') break block21;
                    object2 = (e)object3;
                    n2 = ((f)object2).b;
                    object2 = n2 > 0 ? ((f)object2).a.get(n2 - 1) : null;
                    n2 = 1;
                    object = object2;
                    break block22;
                }
                object2 = new d(this.c);
            }
            object = object2;
            n2 = 0;
            object3 = object2;
        }
        ((ArrayList)this.c).clear();
        if (c2 != ' ') {
            if (c2 != '>') {
                if (c2 != '~') {
                    if (c2 != '+') {
                        if (c2 != ',') throw new Q("Unknown combinator '%s'", Character.valueOf(c2));
                        if (object instanceof e) {
                            object2 = (e)object;
                        } else {
                            object2 = new e();
                            ((f)object2).a.add((N)object);
                            ((f)object2).b();
                        }
                        ((f)object2).a.add(n3);
                        ((f)object2).b();
                    } else {
                        object2 = new d(new U((N)object), n3);
                    }
                } else {
                    object2 = new d(new X((N)object), n3);
                }
            } else {
                object2 = new d(new T((N)object), n3);
            }
        } else {
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
        boolean bl;
        String string;
        block4: {
            boolean bl2;
            string = this.a.b().trim();
            int n2 = com.github.catvod.spider.merge.d1.c.f;
            bl = bl2 = false;
            if (string != null) {
                if (string.length() == 0) {
                    bl = bl2;
                } else {
                    int n3 = string.length();
                    for (n2 = 0; n2 < n3; ++n2) {
                        if (Character.isDigit(string.codePointAt(n2))) continue;
                        bl = bl2;
                        break block4;
                    }
                    bl = true;
                }
            }
        }
        com.github.catvod.spider.merge.c1.d.g(bl, "Index must be numeric");
        return Integer.parseInt(string);
    }

    private void c(boolean bl) {
        Object object = bl ? ":containsOwn" : ":contains";
        this.a.d((String)object);
        String string = com.github.catvod.spider.merge.f1.Q.o(this.a.a('(', ')'));
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("(text) query must not be empty");
        com.github.catvod.spider.merge.c1.d.i(string, ((StringBuilder)object2).toString());
        object2 = this.c;
        object = bl ? new i(string, 1) : new k(string, 1);
        ((ArrayList)object2).add(object);
    }

    private void d(boolean bl) {
        Object object = bl ? ":containsWholeOwnText" : ":containsWholeText";
        this.a.d((String)object);
        String string = com.github.catvod.spider.merge.f1.Q.o(this.a.a('(', ')'));
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("(text) query must not be empty");
        com.github.catvod.spider.merge.c1.d.i(string, ((StringBuilder)object2).toString());
        object2 = this.c;
        object = bl ? new t(string, 0) : new u(string, 0);
        ((ArrayList)object2).add(object);
    }

    /*
     * Unable to fully structure code
     */
    private void e(boolean var1_1, boolean var2_2) {
        block17: {
            block15: {
                block16: {
                    var7_3 = com.github.catvod.spider.merge.K1.d.i(this.a.b());
                    var9_4 = P.f.matcher((CharSequence)var7_3);
                    var8_5 = P.g.matcher((CharSequence)var7_3);
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
                    if (!var9_4.matches()) break block16;
                    var3_7 = var5_9;
                    if (var9_4.group(3) != null) {
                        var3_7 = Integer.parseInt(var9_4.group(1).replaceFirst("^\\+", ""));
                    }
                    if (var9_4.group(4) != null) {
                        var4_8 = Integer.parseInt(var9_4.group(4).replaceFirst("^\\+", ""));
                    }
                    var5_9 = var4_8;
                    var4_8 = var3_7;
                    var3_7 = var5_9;
                    break block15;
                }
                if (!var8_5.matches()) break block17;
                var5_9 = Integer.parseInt(var8_5.group().replaceFirst("^\\+", ""));
                var4_8 = var3_7;
                var3_7 = var5_9;
            }
            if (var2_2) {
                if (var1_1) {
                    var7_3 = this.c;
                    var8_5 = new H(var4_8, var3_7);
                } else {
                    var7_3 = this.c;
                    var8_5 = new I(var4_8, var3_7);
                }
            } else if (var1_1) {
                var7_3 = this.c;
                var8_5 = new G(var4_8, var3_7);
            } else {
                var7_3 = this.c;
                var8_5 = new F(var4_8, var3_7);
            }
            var7_3.add((N)var8_5);
            return;
        }
        throw new Q("Could not parse nth-index '%s': unexpected format", new Object[]{var7_3});
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void f() {
        void var1_28;
        if (this.a.j("#")) {
            String string = this.a.e();
            com.github.catvod.spider.merge.c1.d.h(string);
            ((ArrayList)this.c).add(new w(string, 0));
            return;
        }
        if (this.a.j(".")) {
            String string = this.a.e();
            com.github.catvod.spider.merge.c1.d.h(string);
            ((ArrayList)this.c).add(new r(string.trim()));
            return;
        }
        if (!this.a.m() && !this.a.k("*|")) {
            void var2_48;
            void var1_24;
            if (this.a.k("[")) {
                void var2_39;
                void var1_12;
                com.github.catvod.spider.merge.f1.Q q2 = new com.github.catvod.spider.merge.f1.Q(this.a.a('[', ']'));
                String string = q2.g(e);
                com.github.catvod.spider.merge.c1.d.h(string);
                q2.h();
                if (q2.i()) {
                    void var1_5;
                    void var2_32;
                    if (string.startsWith("^")) {
                        List<N> list = this.c;
                        k k2 = new k(string.substring(1), 0);
                    } else {
                        List<N> list = this.c;
                        i i2 = new i(string, 0);
                    }
                    var2_32.add(var1_5);
                    return;
                }
                if (q2.j("=")) {
                    List<N> list = this.c;
                    l l2 = new l(string, q2.n());
                } else if (q2.j("!=")) {
                    List<N> list = this.c;
                    p p2 = new p(string, q2.n());
                } else if (q2.j("^=")) {
                    List<N> list = this.c;
                    q q3 = new q(string, q2.n());
                } else if (q2.j("$=")) {
                    List<N> list = this.c;
                    n n2 = new n(string, q2.n());
                } else if (q2.j("*=")) {
                    List<N> list = this.c;
                    m m2 = new m(string, q2.n());
                } else {
                    if (!q2.j("~=")) {
                        throw new Q("Could not parse attribute query '%s': unexpected token at '%s'", this.b, q2.n());
                    }
                    List<N> list = this.c;
                    o o2 = new o(string, Pattern.compile(q2.n()));
                }
                var1_12.add(var2_39);
                return;
            }
            if (this.a.j("*")) {
                ((ArrayList)this.c).add(new h(0));
                return;
            }
            if (this.a.j(":lt(")) {
                ((ArrayList)this.c).add(new A(this.b()));
                return;
            }
            if (this.a.j(":gt(")) {
                ((ArrayList)this.c).add(new z(this.b()));
                return;
            }
            if (this.a.j(":eq(")) {
                ((ArrayList)this.c).add(new x(this.b()));
                return;
            }
            if (this.a.k(":has(")) {
                this.a.d(":has");
                String string = this.a.a('(', ')');
                com.github.catvod.spider.merge.c1.d.i(string, ":has(selector) sub-select must not be empty");
                ((ArrayList)this.c).add(new S(P.j(string)));
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
            if (this.a.k(":containsWholeText(")) {
                this.d(false);
                return;
            }
            if (this.a.k(":containsWholeOwnText(")) {
                this.d(true);
                return;
            }
            if (this.a.k(":containsData(")) {
                this.a.d(":containsData");
                String string = com.github.catvod.spider.merge.f1.Q.o(this.a.a('(', ')'));
                com.github.catvod.spider.merge.c1.d.i(string, ":containsData(text) query must not be empty");
                ((ArrayList)this.c).add(new s(string));
                return;
            }
            if (this.a.k(":matches(")) {
                this.g(false);
                return;
            }
            if (this.a.k(":matchesOwn(")) {
                this.g(true);
                return;
            }
            if (this.a.k(":matchesWholeText(")) {
                this.h(false);
                return;
            }
            if (this.a.k(":matchesWholeOwnText(")) {
                this.h(true);
                return;
            }
            if (this.a.k(":not(")) {
                this.a.d(":not");
                String string = this.a.a('(', ')');
                com.github.catvod.spider.merge.c1.d.i(string, ":not(selector) subselect must not be empty");
                ((ArrayList)this.c).add(new V(P.j(string)));
                return;
            }
            if (this.a.j(":nth-child(")) {
                this.e(false, false);
                return;
            }
            if (this.a.j(":nth-last-child(")) {
                this.e(true, false);
                return;
            }
            if (this.a.j(":nth-of-type(")) {
                this.e(false, true);
                return;
            }
            if (this.a.j(":nth-last-of-type(")) {
                this.e(true, true);
                return;
            }
            if (this.a.j(":first-child")) {
                List<N> list = this.c;
                h h2 = new h(1);
            } else if (this.a.j(":last-child")) {
                List<N> list = this.c;
                D d2 = new D();
            } else if (this.a.j(":first-of-type")) {
                List<N> list = this.c;
                C c2 = new C();
            } else if (this.a.j(":last-of-type")) {
                List<N> list = this.c;
                E e2 = new E();
            } else if (this.a.j(":only-child")) {
                List<N> list = this.c;
                J j2 = new J();
            } else if (this.a.j(":only-of-type")) {
                List<N> list = this.c;
                B b2 = new B(1);
            } else {
                if (this.a.j(":empty")) {
                    ((ArrayList)this.c).add(new B(0));
                    return;
                }
                if (this.a.j(":root")) {
                    List<N> list = this.c;
                    h h3 = new h(2);
                } else {
                    if (!this.a.j(":matchText")) {
                        throw new Q("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.n());
                    }
                    List<N> list = this.c;
                    K k3 = new K();
                }
            }
            var1_24.add(var2_48);
            return;
        }
        String string = com.github.catvod.spider.merge.K1.d.i(this.a.f());
        com.github.catvod.spider.merge.c1.d.h(string);
        if (string.startsWith("*|")) {
            String string2 = string.substring(2);
            ((ArrayList)this.c).add(new e(new L(string2), new M(string.replace("*|", ":"))));
            return;
        }
        String string3 = string;
        if (string.contains("|")) {
            String string4 = string.replace("|", ":");
        }
        ((ArrayList)this.c).add(new L((String)var1_28));
    }

    private void g(boolean bl) {
        Object object = bl ? ":matchesOwn" : ":matches";
        this.a.d((String)object);
        String string = this.a.a('(', ')');
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("(regex) query must not be empty");
        com.github.catvod.spider.merge.c1.d.i(string, ((StringBuilder)object2).toString());
        object2 = this.c;
        object = bl ? new t(Pattern.compile(string), 1) : new k(Pattern.compile(string));
        ((ArrayList)object2).add(object);
    }

    private void h(boolean bl) {
        Object object = bl ? ":matchesWholeOwnText" : ":matchesWholeText";
        this.a.d((String)object);
        String string = this.a.a('(', ')');
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("(regex) query must not be empty");
        com.github.catvod.spider.merge.c1.d.i(string, ((StringBuilder)object2).toString());
        object2 = this.c;
        object = bl ? new u(Pattern.compile(string), 1) : new w(Pattern.compile(string), 1);
        ((ArrayList)object2).add(object);
    }

    public static N j(String object) {
        try {
            P p2 = new P((String)object);
            object = p2.i();
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new Q(illegalArgumentException.getMessage());
        }
    }

    /*
     * Unable to fully structure code
     */
    final N i() {
        block5: {
            this.a.h();
            if (!this.a.l(P.d)) break block5;
            this.c.add(new Y());
            var3_1 = this;
            ** GOTO lbl-1000
        }
        var4_2 = this;
        block0: while (true) {
            var4_2.f();
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

