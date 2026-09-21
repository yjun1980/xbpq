/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.e;
import com.github.catvod.spider.merge.e1.f;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.p;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.e1.v;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.C;
import com.github.catvod.spider.merge.f1.D;
import com.github.catvod.spider.merge.f1.E;
import com.github.catvod.spider.merge.f1.F;
import com.github.catvod.spider.merge.f1.G;
import com.github.catvod.spider.merge.f1.H;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.O;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.i1;
import com.github.catvod.spider.merge.f1.j1;
import java.io.Reader;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b
extends j1 {
    static final String[] A;
    static final String[] B;
    static final String[] C;
    static final String[] D;
    static final String[] E;
    static final String[] x;
    static final String[] y;
    static final String[] z;
    private B l;
    private B m;
    private boolean n;
    private m o;
    private p p;
    private ArrayList<m> q;
    private ArrayList<B> r;
    private List<String> s;
    private M t;
    private boolean u;
    private boolean v;
    private String[] w = new String[]{null};

    static {
        x = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
        y = new String[]{"ol", "ul"};
        z = new String[]{"button"};
        A = new String[]{"html", "table"};
        B = new String[]{"optgroup", "option"};
        C = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
        D = new String[]{"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        E = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    }

    private boolean F(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        int n2 = this.e.size() - 1;
        int n3 = n2 > 100 ? n2 - 100 : 0;
        while (n2 >= n3) {
            String string = this.e.get(n2).g0();
            if (com.github.catvod.spider.merge.d1.c.c(string, stringArray)) {
                return true;
            }
            if (com.github.catvod.spider.merge.d1.c.c(string, stringArray2)) {
                return false;
            }
            if (stringArray3 != null && com.github.catvod.spider.merge.d1.c.c(string, stringArray3)) {
                return false;
            }
            --n2;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void O(s var1_1) {
        block3: {
            if (!this.e.isEmpty()) break block3;
            var2_2 = this.d;
            ** GOTO lbl9
        }
        if (this.v && com.github.catvod.spider.merge.d1.c.c(this.a().g0(), com.github.catvod.spider.merge.f1.A.A)) {
            this.M(var1_1);
        } else {
            var2_2 = this.a();
lbl9:
            // 2 sources

            var2_2.K(var1_1);
        }
        if (var1_1 instanceof m && (var1_1 = (m)var1_1).q0().e() && (var2_2 = this.p) != null) {
            var2_2.v0((m)var1_1);
        }
    }

    private static boolean X(ArrayList<m> arrayList, m m2) {
        int n2 = arrayList.size() - 1;
        int n3 = n2 >= 256 ? n2 - 256 : 0;
        while (n2 >= n3) {
            if (arrayList.get(n2) == m2) {
                return true;
            }
            --n2;
        }
        return false;
    }

    private void m(String ... stringArray) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            boolean bl;
            m m2 = this.e.get(i2);
            String string = m2.g0();
            int n2 = com.github.catvod.spider.merge.d1.c.f;
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
            if (bl || m2.g0().equals("html")) break;
            this.e.remove(i2);
        }
    }

    final List<String> A() {
        return this.s;
    }

    final boolean B(String string) {
        return this.C(string, z);
    }

    final boolean C(String string, String[] stringArray) {
        String[] stringArray2 = x;
        String[] stringArray3 = this.w;
        stringArray3[0] = string;
        return this.F(stringArray3, stringArray2, stringArray);
    }

    final boolean D(String[] stringArray) {
        return this.F(stringArray, x, null);
    }

    final boolean E(String string) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            String string2 = this.e.get(i2).g0();
            if (string2.equals(string)) {
                return true;
            }
            if (com.github.catvod.spider.merge.d1.c.c(string2, B)) continue;
            return false;
        }
        com.github.catvod.spider.merge.c1.d.c("Should not be reachable");
        throw null;
    }

    final boolean G(String string) {
        String[] stringArray = A;
        String[] stringArray2 = this.w;
        stringArray2[0] = string;
        return this.F(stringArray2, stringArray, null);
    }

    final m H(N object) {
        Object object2;
        Object object3;
        if (((O)object).u() && !((O)object).n.isEmpty() && ((O)object).n.n(this.h) > 0) {
            object3 = ((O)object).e;
            object2 = this.a.a();
            if (((D)object2).a()) {
                ((AbstractCollection)object2).add(new C(this.b, "Dropped duplicate attribute(s) in tag [%s]", object3));
            }
        }
        if (((O)object).m) {
            object = this.K((N)object);
            this.e.add((m)object);
            this.c.v(i1.a);
            object3 = this.c;
            object2 = this.t;
            ((O)object2).y();
            ((O)object2).v(((m)object).r0());
            ((S)object3).k((P)object2);
            return object;
        }
        object2 = this.i(((O)object).w(), this.h);
        object3 = this.h;
        object = ((O)object).n;
        ((E)object3).c((c)object);
        object = new m((G)object2, null, (c)object);
        this.O((s)object);
        this.e.add((m)object);
        return object;
    }

    final void I(I object) {
        m m2 = this.a();
        String string = m2.g0();
        String string2 = ((I)object).l();
        if (object instanceof H) {
            object = new com.github.catvod.spider.merge.e1.d(string2);
        } else {
            boolean bl = string.equals("script") || string.equals("style");
            object = bl ? new f(string2) : new v(string2);
        }
        m2.K((s)object);
    }

    final void J(J j2) {
        this.O(new e(j2.m()));
    }

    final m K(N n2) {
        G g2 = this.i(n2.w(), this.h);
        Object object = this.h;
        c c2 = n2.n;
        ((E)object).c(c2);
        object = new m(g2, null, c2);
        this.O((s)object);
        if (n2.m) {
            if (g2.g()) {
                if (!g2.d()) {
                    this.c.s("Tag [%s] cannot be self closing; not a void tag", g2.j());
                }
            } else {
                g2.l();
            }
        }
        return object;
    }

    final p L(N object, boolean bl, boolean bl2) {
        G g2 = this.i(((O)object).w(), this.h);
        E e2 = this.h;
        object = ((O)object).n;
        e2.c((c)object);
        object = new p(g2, (c)object);
        if (!bl2 || !this.W("template")) {
            this.p = object;
        }
        this.O((s)object);
        if (bl) {
            this.e.add((m)object);
        }
        return object;
    }

    final void M(s s2) {
        m m2;
        m m3 = this.y("table");
        boolean bl = false;
        if (m3 != null) {
            if (m3.i0() != null) {
                m2 = m3.i0();
                bl = true;
            } else {
                m2 = this.j(m3);
            }
        } else {
            m2 = this.e.get(0);
        }
        if (bl) {
            com.github.catvod.spider.merge.c1.d.j(m3);
            m3.Q(s2);
        } else {
            m2.K(s2);
        }
    }

    final void N() {
        this.q.add(null);
    }

    final m P() {
        m m2 = new m(this.i("html", this.h), null, null);
        this.O(m2);
        this.e.add(m2);
        return m2;
    }

    final boolean Q(m m2) {
        return com.github.catvod.spider.merge.f1.b.X(this.q, m2);
    }

    final boolean R(m m2) {
        return com.github.catvod.spider.merge.d1.c.c(m2.g0(), E);
    }

    final void S() {
        this.m = this.l;
    }

    final void T(m object) {
        if (this.n) {
            return;
        }
        if (((String)(object = ((s)object).a("href"))).length() != 0) {
            this.f = object;
            this.n = true;
            this.d.F((String)object);
        }
    }

    final void U() {
        this.s = new ArrayList<String>();
    }

    final boolean V(m m2) {
        return com.github.catvod.spider.merge.f1.b.X(this.e, m2);
    }

    final boolean W(String string) {
        boolean bl = this.y(string) != null;
        return bl;
    }

    final B Y() {
        return this.m;
    }

    final m Z() {
        int n2 = this.e.size();
        return this.e.remove(n2 - 1);
    }

    final m a0(String string) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            m m2 = this.e.get(i2);
            this.e.remove(i2);
            if (!m2.g0().equals(string)) continue;
            boolean bl = this.g instanceof M;
            return m2;
        }
        return null;
    }

    final B b0() {
        if (this.r.size() > 0) {
            ArrayList<B> arrayList = this.r;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    @Override
    protected final void c(Reader reader, String string, F f2) {
        super.c(reader, string, f2);
        this.l = com.github.catvod.spider.merge.f1.B.a;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList<String>();
        this.t = new M();
        this.u = true;
        this.v = false;
    }

    final int c0(m m2) {
        for (int i2 = 0; i2 < this.q.size(); ++i2) {
            if (m2 != this.q.get(i2)) continue;
            return i2;
        }
        return -1;
    }

    final boolean d0(P p2, B b2) {
        this.g = p2;
        return b2.i(p2, this);
    }

    @Override
    protected final boolean e(P p2) {
        this.g = p2;
        return this.l.i(p2, this);
    }

    final void e0(m m2) {
        this.k(m2);
        this.q.add(m2);
    }

    final void f0(B b2) {
        this.r.add(b2);
    }

    final void g0(m m2, int n2) {
        this.k(m2);
        try {
            this.q.add(n2, m2);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.q.add(m2);
        }
    }

    /*
     * Unable to fully structure code
     */
    final void h0() {
        block7: {
            if (this.e.size() > 256) {
                return;
            }
            if (this.q.size() > 0) {
                var6_1 = this.q;
                var6_1 = var6_1.get(var6_1.size() - 1);
            } else {
                var6_1 = null;
            }
            if (var6_1 == null || this.V((m)var6_1)) break block7;
            var3_2 = this.q.size();
            var2_4 = var1_3 = var3_2 - 12;
            if (var1_3 < 0) {
                var2_4 = 0;
            }
            var5_5 = 1;
            var1_3 = var4_6 = var3_2 - 1;
            do {
                block8: {
                    if (var1_3 != var2_4) break block8;
                    var7_7 = this;
                    var3_2 = var5_5;
                    var2_4 = var1_3;
                    ** GOTO lbl35
                }
                var6_1 = this.q;
                var3_2 = var1_3 - 1;
                var7_7 = (m)var6_1.get(var3_2);
                if (var7_7 == null) break;
                var6_1 = var7_7;
                var1_3 = var3_2;
            } while (!this.V((m)var7_7));
            var8_8 = this;
            var2_4 = var3_2;
            var6_1 = var7_7;
            do {
                var3_2 = 0;
                var7_7 = var8_8;
lbl35:
                // 2 sources

                var1_3 = var2_4;
                if (var3_2 == 0) {
                    var6_1 = var7_7.q;
                    var1_3 = var2_4 + 1;
                    var6_1 = (m)var6_1.get(var1_3);
                }
                com.github.catvod.spider.merge.c1.d.j(var6_1);
                var8_8 = new m(var7_7.i(var6_1.g0(), var7_7.h), null, var6_1.d().m());
                super.O((s)var8_8);
                var7_7.e.add((m)var8_8);
                var7_7.q.set(var1_3, (m)var8_8);
                var8_8 = var7_7;
                var2_4 = var1_3;
            } while (var1_3 != var4_6);
        }
    }

    final void i0(m m2) {
        int n2;
        int n3 = this.q.size();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (this.q.get(n2) != m2) continue;
            this.q.remove(n2);
            break;
        }
    }

    final m j(m m2) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            if (this.e.get(i2) != m2) continue;
            return this.e.get(i2 - 1);
        }
        return null;
    }

    final boolean j0(m m2) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            if (this.e.get(i2) != m2) continue;
            this.e.remove(i2);
            return true;
        }
        return false;
    }

    final void k(m m2) {
        m m3;
        int n2;
        int n3 = this.q.size() - 1;
        int n4 = n2 = n3 - 12;
        if (n2 < 0) {
            n4 = 0;
        }
        n2 = 0;
        while (n3 >= n4 && (m3 = this.q.get(n3)) != null) {
            boolean bl = m2.g0().equals(m3.g0()) && m2.d().equals(m3.d());
            int n5 = n2;
            if (bl) {
                n5 = n2 + 1;
            }
            if (n5 == 3) {
                this.q.remove(n3);
                break;
            }
            --n3;
            n2 = n5;
        }
    }

    final void k0(m m2, m m3) {
        ArrayList<m> arrayList = this.q;
        int n2 = arrayList.lastIndexOf(m2);
        boolean bl = n2 != -1;
        com.github.catvod.spider.merge.c1.d.f(bl);
        arrayList.set(n2, m3);
    }

    final void l() {
        int n2;
        m m2;
        while (!this.q.isEmpty() && (m2 = (n2 = this.q.size()) > 0 ? this.q.remove(n2 - 1) : null) != null) {
        }
    }

    final void l0() {
        if (!this.W("body")) {
            this.e.add(this.d.v0());
        }
        this.l = com.github.catvod.spider.merge.f1.B.g;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    final boolean m0() {
        var1_1 = this.e.size();
        var5_2 = true;
        var3_3 = var1_1 - 1;
        var2_4 = var3_3 >= 256 ? var3_3 - 256 : 0;
        var7_5 = this.l;
        if (this.e.size() == 0) {
            this.l = com.github.catvod.spider.merge.f1.B.g;
        }
        var4_6 = false;
        while (var3_3 >= var2_4) {
            block54: {
                block53: {
                    var6_7 /* !! */  = this.e.get(var3_3);
                    if (var3_3 == var2_4) {
                        var4_6 = true;
                    }
                    var6_7 /* !! */  = var6_7 /* !! */  != null ? var6_7 /* !! */ .g0() : "";
                    Objects.requireNonNull(var6_7 /* !! */ );
                    tmp = -1;
                    switch (var6_7 /* !! */ .hashCode()) {
                        case 552573414: {
                            if (!var6_7 /* !! */ .equals("caption")) break;
                            tmp = 1;
                            break;
                        }
                        case 110326868: {
                            if (!var6_7 /* !! */ .equals("thead")) break;
                            tmp = 2;
                            break;
                        }
                        case 110277346: {
                            if (!var6_7 /* !! */ .equals("tfoot")) break;
                            tmp = 3;
                            break;
                        }
                        case 110157846: {
                            if (!var6_7 /* !! */ .equals("tbody")) break;
                            tmp = 4;
                            break;
                        }
                        case 110115790: {
                            if (!var6_7 /* !! */ .equals("table")) break;
                            tmp = 5;
                            break;
                        }
                        case 3213227: {
                            if (!var6_7 /* !! */ .equals("html")) break;
                            tmp = 6;
                            break;
                        }
                        case 3198432: {
                            if (!var6_7 /* !! */ .equals("head")) break;
                            tmp = 7;
                            break;
                        }
                        case 3029410: {
                            if (!var6_7 /* !! */ .equals("body")) break;
                            tmp = 8;
                            break;
                        }
                        case 3710: {
                            if (!var6_7 /* !! */ .equals("tr")) break;
                            tmp = 9;
                            break;
                        }
                        case 3700: {
                            if (!var6_7 /* !! */ .equals("th")) break;
                            tmp = 10;
                            break;
                        }
                        case 3696: {
                            if (!var6_7 /* !! */ .equals("td")) break;
                            tmp = 11;
                            break;
                        }
                        case -636197633: {
                            if (!var6_7 /* !! */ .equals("colgroup")) break;
                            tmp = 12;
                            break;
                        }
                        case -906021636: {
                            if (!var6_7 /* !! */ .equals("select")) break;
                            tmp = 13;
                            break;
                        }
                        case -1321546630: {
                            if (!var6_7 /* !! */ .equals("template")) break;
                            tmp = 14;
                            break;
                        }
                        case -1644953643: {
                            if (!var6_7 /* !! */ .equals("frameset")) break;
                            tmp = 15;
                            break;
                        }
                    }
                    switch (tmp) {
                        default: {
                            break;
                        }
                        case 1: {
                            var1_1 = 14;
                            break block53;
                        }
                        case 2: {
                            var1_1 = 13;
                            break block53;
                        }
                        case 3: {
                            var1_1 = 12;
                            break block53;
                        }
                        case 4: {
                            var1_1 = 11;
                            break block53;
                        }
                        case 5: {
                            var1_1 = 10;
                            break block53;
                        }
                        case 6: {
                            var1_1 = 9;
                            break block53;
                        }
                        case 7: {
                            var1_1 = 8;
                            break block53;
                        }
                        case 8: {
                            var1_1 = 7;
                            break block53;
                        }
                        case 9: {
                            var1_1 = 6;
                            break block53;
                        }
                        case 10: {
                            var1_1 = 5;
                            break block53;
                        }
                        case 11: {
                            var1_1 = 4;
                            break block53;
                        }
                        case 12: {
                            var1_1 = 3;
                            break block53;
                        }
                        case 13: {
                            var1_1 = 2;
                            break block53;
                        }
                        case 14: {
                            var1_1 = 1;
                            break block53;
                        }
                        case 15: {
                            var1_1 = 0;
                            break block53;
                        }
                    }
                    var1_1 = -1;
                }
                switch (var1_1) {
                    default: {
                        ** break;
                    }
                    case 14: {
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.k;
                        break block54;
                    }
                    case 11: 
                    case 12: 
                    case 13: {
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.m;
                        break block54;
                    }
                    case 10: {
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.i;
                        break block54;
                    }
                    case 9: {
                        var6_7 /* !! */  = this.o == null ? com.github.catvod.spider.merge.f1.B.c : com.github.catvod.spider.merge.f1.B.f;
                        break block54;
                    }
                    case 8: {
                        if (var4_6) ** GOTO lbl171
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.d;
                        break block54;
                    }
                    case 6: {
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.n;
                        break block54;
                    }
                    case 4: 
                    case 5: {
                        if (var4_6) ** GOTO lbl171
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.o;
                        break block54;
                    }
                    case 3: {
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.l;
                        break block54;
                    }
                    case 2: {
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.p;
                        break block54;
                    }
                    case 1: {
                        if (this.r.size() > 0) {
                            var6_7 /* !! */  = this.r;
                            var6_7 /* !! */  = var6_7 /* !! */ .get(var6_7 /* !! */ .size() - 1);
                        } else {
                            var6_7 /* !! */  = null;
                        }
                        if (var6_7 /* !! */  == null) throw new com.github.catvod.spider.merge.c1.e("Bug: no template insertion mode on stack!");
                        break block54;
                    }
                    case 0: {
                        var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.t;
                        break block54;
                    }
lbl171:
                    // 3 sources

                    if (!var4_6) ** break;
                    break;
                    case 7: 
                }
                var6_7 /* !! */  = com.github.catvod.spider.merge.f1.B.g;
            }
            this.l = var6_7 /* !! */ ;
            break;
            --var3_3;
        }
        if (this.l == var7_5) return false;
        return var5_2;
    }

    final void n() {
        this.m("tbody", "tfoot", "thead", "template");
    }

    final void n0() {
        this.p = null;
    }

    final void o() {
        this.m("table", "template");
    }

    final void o0(boolean bl) {
        this.v = bl;
    }

    final void p() {
        this.m("tr", "template");
    }

    final void p0(m m2) {
        this.o = m2;
    }

    final void q() {
        this.u("p");
        if (!"p".equals(this.a().g0())) {
            this.r(this.l);
        }
        this.a0("p");
    }

    final B q0() {
        return this.l;
    }

    final void r(B b2) {
        if (this.a.a().a()) {
            ((AbstractCollection)this.a.a()).add(new C(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, b2}));
        }
    }

    final int r0() {
        return this.r.size();
    }

    final void s(boolean bl) {
        this.u = bl;
    }

    final void s0(B b2) {
        this.l = b2;
    }

    final boolean t() {
        return this.u;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("TreeBuilder{currentToken=");
        stringBuilder.append(this.g);
        stringBuilder.append(", state=");
        stringBuilder.append((Object)this.l);
        stringBuilder.append(", currentElement=");
        stringBuilder.append(this.a());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    final void u(String string) {
        while (com.github.catvod.spider.merge.d1.c.c(this.a().g0(), C) && (string == null || !this.b(string))) {
            this.Z();
        }
    }

    final void v(boolean bl) {
        String[] stringArray = bl ? D : C;
        while (com.github.catvod.spider.merge.d1.c.c(this.a().g0(), stringArray)) {
            this.Z();
        }
    }

    final m w(String string) {
        m m2;
        for (int i2 = this.q.size() - 1; i2 >= 0 && (m2 = this.q.get(i2)) != null; --i2) {
            if (!m2.g0().equals(string)) continue;
            return m2;
        }
        return null;
    }

    final p x() {
        return this.p;
    }

    final m y(String string) {
        int n2 = this.e.size() - 1;
        int n3 = n2 >= 256 ? n2 - 256 : 0;
        while (n2 >= n3) {
            m m2 = this.e.get(n2);
            if (m2.g0().equals(string)) {
                return m2;
            }
            --n2;
        }
        return null;
    }

    final m z() {
        return this.o;
    }
}

