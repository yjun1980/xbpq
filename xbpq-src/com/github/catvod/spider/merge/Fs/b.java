/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Em.c;
import com.github.catvod.spider.merge.Em.o;
import com.github.catvod.spider.merge.Em.r;
import com.github.catvod.spider.merge.Em.u;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.B;
import com.github.catvod.spider.merge.Fs.C;
import com.github.catvod.spider.merge.Fs.D;
import com.github.catvod.spider.merge.Fs.E;
import com.github.catvod.spider.merge.Fs.F;
import com.github.catvod.spider.merge.Fs.G;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.N;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.d;
import com.github.catvod.spider.merge.Fs.e;
import com.github.catvod.spider.merge.Fs.f;
import com.github.catvod.spider.merge.Fs.g;
import com.github.catvod.spider.merge.Fs.h;
import com.github.catvod.spider.merge.Fs.h1;
import com.github.catvod.spider.merge.Fs.i;
import com.github.catvod.spider.merge.Fs.i1;
import com.github.catvod.spider.merge.Fs.l;
import com.github.catvod.spider.merge.Fs.s;
import com.github.catvod.spider.merge.Fs.w;
import com.github.catvod.spider.merge.Fs.y;
import java.io.Reader;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public final class b
extends i1 {
    static final String[] A;
    static final String[] B;
    static final String[] v;
    static final String[] w;
    static final String[] x;
    static final String[] y;
    static final String[] z;
    private A k;
    private A l;
    private boolean m;
    private com.github.catvod.spider.merge.Em.l n;
    private o o;
    private ArrayList<com.github.catvod.spider.merge.Em.l> p;
    private List<String> q;
    private L r;
    private boolean s;
    private boolean t;
    private String[] u = new String[]{null};

    static {
        v = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
        w = new String[]{"ol", "ul"};
        x = new String[]{"button"};
        y = new String[]{"html", "table"};
        z = new String[]{"optgroup", "option"};
        A = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
        B = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    }

    private boolean A(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        int n2 = this.e.size() - 1;
        int n3 = n2 > 100 ? n2 - 100 : 0;
        while (n2 >= n3) {
            String string = this.e.get(n2).d0();
            if (com.github.catvod.spider.merge.Dw.e.b(string, stringArray)) {
                return true;
            }
            if (com.github.catvod.spider.merge.Dw.e.b(string, stringArray2)) {
                return false;
            }
            if (stringArray3 != null && com.github.catvod.spider.merge.Dw.e.b(string, stringArray3)) {
                return false;
            }
            --n2;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void K(r var1_1) {
        block3: {
            if (!this.e.isEmpty()) break block3;
            var2_2 = this.d;
            ** GOTO lbl9
        }
        if (this.t) {
            this.I(var1_1);
        } else {
            var2_2 = this.a();
lbl9:
            // 2 sources

            var2_2.L(var1_1);
        }
        if (var1_1 instanceof com.github.catvod.spider.merge.Em.l && (var1_1 = (com.github.catvod.spider.merge.Em.l)var1_1).m0().e() && (var2_2 = this.o) != null) {
            var2_2.r0((com.github.catvod.spider.merge.Em.l)var1_1);
        }
    }

    private boolean M(ArrayList<com.github.catvod.spider.merge.Em.l> arrayList, com.github.catvod.spider.merge.Em.l l2) {
        int n2 = arrayList.size() - 1;
        int n3 = n2 >= 256 ? n2 - 256 : 0;
        while (n2 >= n3) {
            if (arrayList.get(n2) == l2) {
                return true;
            }
            --n2;
        }
        return false;
    }

    private void j(String ... stringArray) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            boolean bl;
            com.github.catvod.spider.merge.Em.l l2 = this.e.get(i2);
            String string = l2.d0();
            int n2 = com.github.catvod.spider.merge.Dw.e.d;
            int n3 = stringArray.length;
            boolean bl2 = false;
            n2 = 0;
            while (true) {
                bl = bl2;
                if (n2 >= n3) break;
                if (stringArray[n2].equals(string)) {
                    bl = true;
                    break;
                }
                ++n2;
            }
            if (bl || l2.d0().equals("html")) break;
            this.e.remove(i2);
        }
    }

    final boolean B(String string) {
        String[] stringArray = y;
        String[] stringArray2 = this.u;
        stringArray2[0] = string;
        return this.A(stringArray2, stringArray, null);
    }

    protected final void C(Reader reader, E e2) {
        com.github.catvod.spider.merge.Em.h h2;
        this.d = h2 = new com.github.catvod.spider.merge.Em.h();
        h2.t0(e2);
        this.a = e2;
        this.h = D.c;
        this.b = new a(reader, 32768);
        this.g = null;
        this.c = new Q(this.b, e2.a());
        this.e = new ArrayList(32);
        this.f = "";
        this.k = com.github.catvod.spider.merge.Fs.A.c;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = new ArrayList();
        this.q = new ArrayList<String>();
        this.r = new L();
        this.s = true;
        this.t = false;
    }

    final com.github.catvod.spider.merge.Em.l D(M object) {
        Cloneable cloneable;
        if (((N)object).r() && !((N)object).j.isEmpty() && ((N)object).j.i(this.h) > 0 && ((C)(cloneable = this.a.a())).a()) {
            ((AbstractCollection)((Object)cloneable)).add(new B(this.b.E(), "Duplicate attribute"));
        }
        if (((N)object).i) {
            cloneable = this.G((M)object);
            this.e.add((com.github.catvod.spider.merge.Em.l)cloneable);
            this.c.u(h1.c);
            Q q2 = this.c;
            object = this.r;
            ((N)object).v();
            ((N)object).s(((com.github.catvod.spider.merge.Em.l)cloneable).n0());
            q2.j((O)object);
            return cloneable;
        }
        cloneable = F.l(((N)object).t(), this.h);
        D d2 = this.h;
        object = ((N)object).j;
        d2.b((c)object);
        object = new com.github.catvod.spider.merge.Em.l((F)cloneable, null, (c)object);
        this.K((r)object);
        this.e.add((com.github.catvod.spider.merge.Em.l)object);
        return object;
    }

    final void E(H object) {
        Object object2 = this.a();
        com.github.catvod.spider.merge.Em.l l2 = object2;
        if (object2 == null) {
            l2 = this.d;
        }
        String string = l2.d0();
        object2 = ((H)object).j();
        object = object instanceof G ? new com.github.catvod.spider.merge.Em.d((String)object2) : (this.b(string) ? new com.github.catvod.spider.merge.Em.f((String)object2) : new u((String)object2));
        l2.L((r)object);
    }

    final void F(I i2) {
        this.K(new com.github.catvod.spider.merge.Em.e(i2.k()));
    }

    final com.github.catvod.spider.merge.Em.l G(M m2) {
        F f2 = F.l(m2.t(), this.h);
        Object object = this.h;
        c c2 = m2.j;
        ((D)object).b(c2);
        object = new com.github.catvod.spider.merge.Em.l(f2, null, c2);
        this.K((r)object);
        if (m2.i) {
            if (f2.g()) {
                if (!f2.d()) {
                    this.c.r("Tag cannot be self closing; not a void tag");
                }
            } else {
                f2.k();
            }
        }
        return object;
    }

    final o H(M object, boolean bl) {
        F f2 = F.l(((N)object).t(), this.h);
        D d2 = this.h;
        object = ((N)object).j;
        d2.b((c)object);
        this.o = object = new o(f2, (c)object);
        this.K((r)object);
        if (bl) {
            this.e.add((com.github.catvod.spider.merge.Em.l)object);
        }
        return object;
    }

    final void I(r r2) {
        com.github.catvod.spider.merge.Em.l l2;
        com.github.catvod.spider.merge.Em.l l3 = this.t("table");
        boolean bl = false;
        if (l3 != null) {
            if (l3.f0() != null) {
                l2 = l3.f0();
                bl = true;
            } else {
                l2 = this.g(l3);
            }
        } else {
            l2 = this.e.get(0);
        }
        if (bl) {
            com.github.catvod.spider.merge.Dw.i.k(l3);
            l3.f(r2);
        } else {
            l2.L(r2);
        }
    }

    final void J() {
        this.p.add(null);
    }

    final com.github.catvod.spider.merge.Em.l L(String object) {
        object = new com.github.catvod.spider.merge.Em.l(F.l((String)object, this.h), null, null);
        this.K((r)object);
        this.e.add((com.github.catvod.spider.merge.Em.l)object);
        return object;
    }

    final boolean N(com.github.catvod.spider.merge.Em.l l2) {
        return this.M(this.p, l2);
    }

    final boolean O(com.github.catvod.spider.merge.Em.l l2) {
        return com.github.catvod.spider.merge.Dw.e.b(l2.d0(), B);
    }

    final void P() {
        this.l = this.k;
    }

    final void Q(com.github.catvod.spider.merge.Em.l object) {
        if (this.m) {
            return;
        }
        if (((String)(object = ((r)object).a("href"))).length() != 0) {
            this.f = object;
            this.m = true;
            this.d.G((String)object);
        }
    }

    final void R() {
        this.q = new ArrayList<String>();
    }

    final boolean S(com.github.catvod.spider.merge.Em.l l2) {
        return this.M(this.e, l2);
    }

    final A T() {
        return this.l;
    }

    final com.github.catvod.spider.merge.Em.l U() {
        int n2 = this.e.size();
        return this.e.remove(n2 - 1);
    }

    final com.github.catvod.spider.merge.Em.l V(String string) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            com.github.catvod.spider.merge.Em.l l2 = this.e.get(i2);
            this.e.remove(i2);
            if (!l2.d0().equals(string)) continue;
            return l2;
        }
        return null;
    }

    final int W(com.github.catvod.spider.merge.Em.l l2) {
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            if (l2 != this.p.get(i2)) continue;
            return i2;
        }
        return -1;
    }

    final boolean X(O o2, A a2) {
        this.g = o2;
        return a2.d(o2, this);
    }

    final void Y(com.github.catvod.spider.merge.Em.l l2) {
        this.h(l2);
        this.p.add(l2);
    }

    final void Z(com.github.catvod.spider.merge.Em.l l2, int n2) {
        this.h(l2);
        this.p.add(n2, l2);
    }

    /*
     * Unable to fully structure code
     */
    final void a0() {
        if (this.p.size() > 0) {
            var5_1 = this.p;
            var5_1 = var5_1.get(var5_1.size() - 1);
        } else {
            var5_1 = null;
        }
        if (var5_1 != null && !this.S((com.github.catvod.spider.merge.Em.l)var5_1)) {
            var1_2 = this.p.size();
            var3_3 = true;
            var1_2 = var4_4 = var1_2 - 1;
            while (var1_2 != 0) {
                var5_1 = this.p;
                var2_5 = var1_2 - 1;
                var6_6 = (com.github.catvod.spider.merge.Em.l)var5_1.get(var2_5);
                var5_1 = var6_6;
                var1_2 = var2_5;
                if (var6_6 != null) {
                    var5_1 = var6_6;
                    var1_2 = var2_5;
                    if (!this.S(var6_6)) continue;
                    var1_2 = var2_5;
                    var5_1 = var6_6;
                }
                while (true) {
                    var3_3 = false;
                    break;
                }
                break;
            }
            var2_5 = var1_2;
            if (!var3_3) {
                var5_1 = this.p;
                var2_5 = var1_2 + 1;
                var5_1 = (com.github.catvod.spider.merge.Em.l)var5_1.get(var2_5);
            }
            com.github.catvod.spider.merge.Dw.i.k(var5_1);
            var6_6 = this.L(var5_1.d0());
            var6_6.d().e(var5_1.d());
            this.p.set(var2_5, var6_6);
            var1_2 = var2_5;
            if (var2_5 != var4_4) ** continue;
        }
    }

    @Override
    protected final boolean b(String string) {
        boolean bl = string.equals("script") || string.equals("style");
        return bl;
    }

    final void b0(com.github.catvod.spider.merge.Em.l l2) {
        int n2;
        int n3 = this.p.size();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (this.p.get(n2) != l2) continue;
            this.p.remove(n2);
            break;
        }
    }

    @Override
    protected final boolean c(O o2) {
        this.g = o2;
        return this.k.d(o2, this);
    }

    final boolean c0(com.github.catvod.spider.merge.Em.l l2) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            if (this.e.get(i2) != l2) continue;
            this.e.remove(i2);
            return true;
        }
        return false;
    }

    final void d0(com.github.catvod.spider.merge.Em.l l2, com.github.catvod.spider.merge.Em.l l3) {
        ArrayList<com.github.catvod.spider.merge.Em.l> arrayList = this.p;
        int n2 = arrayList.lastIndexOf(l2);
        boolean bl = n2 != -1;
        com.github.catvod.spider.merge.Dw.i.f(bl);
        arrayList.set(n2, l3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void e0() {
        void var3_19;
        block13: {
            block14: {
                block15: {
                    int n2 = this.e.size() - 1;
                    boolean bl = false;
                    while (n2 >= 0) {
                        block17: {
                            block16: {
                                void var3_3;
                                void var3_6;
                                com.github.catvod.spider.merge.Em.l l2 = this.e.get(n2);
                                if (n2 == 0) {
                                    Object var3_5 = null;
                                    bl = true;
                                }
                                if (var3_6 != null) {
                                    String string = var3_6.d0();
                                } else {
                                    String string = "";
                                }
                                if ("select".equals(var3_3)) {
                                    i i2 = com.github.catvod.spider.merge.Fs.A.r;
                                    break block13;
                                }
                                if ("td".equals(var3_3) || "th".equals(var3_3) && !bl) break block14;
                                if ("tr".equals(var3_3)) {
                                    g g2 = com.github.catvod.spider.merge.Fs.A.p;
                                    break block13;
                                }
                                if ("tbody".equals(var3_3) || "thead".equals(var3_3) || "tfoot".equals(var3_3)) break block15;
                                if ("caption".equals(var3_3)) {
                                    d d2 = com.github.catvod.spider.merge.Fs.A.m;
                                    break block13;
                                }
                                if ("colgroup".equals(var3_3)) {
                                    e e2 = com.github.catvod.spider.merge.Fs.A.n;
                                    break block13;
                                }
                                if ("table".equals(var3_3)) {
                                    y y2 = com.github.catvod.spider.merge.Fs.A.k;
                                    break block13;
                                }
                                if ("head".equals(var3_3) || "body".equals(var3_3)) break block16;
                                if ("frameset".equals(var3_3)) {
                                    l l3 = com.github.catvod.spider.merge.Fs.A.u;
                                    break block13;
                                }
                                if ("html".equals(var3_3)) {
                                    s s2 = com.github.catvod.spider.merge.Fs.A.e;
                                    break block13;
                                }
                                if (!bl) break block17;
                            }
                            w w2 = com.github.catvod.spider.merge.Fs.A.i;
                            break block13;
                        }
                        --n2;
                    }
                    return;
                }
                f f2 = com.github.catvod.spider.merge.Fs.A.o;
                break block13;
            }
            h h2 = com.github.catvod.spider.merge.Fs.A.q;
        }
        this.k = var3_19;
    }

    final void f0() {
        this.o = null;
    }

    final com.github.catvod.spider.merge.Em.l g(com.github.catvod.spider.merge.Em.l l2) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            if (this.e.get(i2) != l2) continue;
            return this.e.get(i2 - 1);
        }
        return null;
    }

    final void g0(boolean bl) {
        this.t = bl;
    }

    final void h(com.github.catvod.spider.merge.Em.l l2) {
        com.github.catvod.spider.merge.Em.l l3;
        int n2 = 0;
        for (int i2 = this.p.size() - 1; i2 >= 0 && (l3 = this.p.get(i2)) != null; --i2) {
            boolean bl = l2.d0().equals(l3.d0()) && l2.d().equals(l3.d());
            int n3 = n2;
            if (bl) {
                n3 = n2 + 1;
            }
            if (n3 == 3) {
                this.p.remove(i2);
                break;
            }
            n2 = n3;
        }
    }

    final void h0(com.github.catvod.spider.merge.Em.l l2) {
        this.n = l2;
    }

    final void i() {
        int n2;
        com.github.catvod.spider.merge.Em.l l2;
        while (!this.p.isEmpty() && (l2 = (n2 = this.p.size()) > 0 ? this.p.remove(n2 - 1) : null) != null) {
        }
    }

    final A i0() {
        return this.k;
    }

    final void j0(A a2) {
        this.k = a2;
    }

    final void k() {
        this.j("tbody", "tfoot", "thead", "template");
    }

    final void l() {
        this.j("table");
    }

    final void m() {
        this.j("tr", "template");
    }

    final void n(A a2) {
        if (this.a.a().a()) {
            ((AbstractCollection)this.a.a()).add(new B(this.b.E(), "Unexpected token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), a2}));
        }
    }

    final void o(boolean bl) {
        this.s = bl;
    }

    final boolean p() {
        return this.s;
    }

    final void q(String string) {
        while (string != null && !this.a().d0().equals(string) && com.github.catvod.spider.merge.Dw.e.b(this.a().d0(), A)) {
            this.U();
        }
    }

    final com.github.catvod.spider.merge.Em.l r(String string) {
        com.github.catvod.spider.merge.Em.l l2;
        for (int i2 = this.p.size() - 1; i2 >= 0 && (l2 = this.p.get(i2)) != null; --i2) {
            if (!l2.d0().equals(string)) continue;
            return l2;
        }
        return null;
    }

    final o s() {
        return this.o;
    }

    final com.github.catvod.spider.merge.Em.l t(String string) {
        int n2 = this.e.size();
        while (--n2 >= 0) {
            com.github.catvod.spider.merge.Em.l l2 = this.e.get(n2);
            if (!l2.d0().equals(string)) continue;
            return l2;
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.ka.d.b("TreeBuilder{currentToken=");
        stringBuilder.append(this.g);
        stringBuilder.append(", state=");
        stringBuilder.append((Object)this.k);
        stringBuilder.append(", currentElement=");
        stringBuilder.append(this.a());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    final com.github.catvod.spider.merge.Em.l u() {
        return this.n;
    }

    final List<String> v() {
        return this.q;
    }

    final boolean w(String string) {
        return this.x(string, x);
    }

    final boolean x(String string, String[] stringArray) {
        String[] stringArray2 = v;
        String[] stringArray3 = this.u;
        stringArray3[0] = string;
        return this.A(stringArray3, stringArray2, stringArray);
    }

    final boolean y(String[] stringArray) {
        return this.A(stringArray, v, null);
    }

    final boolean z(String string) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            String string2 = this.e.get(i2).d0();
            if (string2.equals(string)) {
                return true;
            }
            if (com.github.catvod.spider.merge.Dw.e.b(string2, z)) continue;
            return false;
        }
        com.github.catvod.spider.merge.Dw.i.a("Should not be reachable");
        throw null;
    }
}

