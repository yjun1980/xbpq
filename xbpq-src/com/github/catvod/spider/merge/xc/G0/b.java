/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.D0.c;
import com.github.catvod.spider.merge.xc.F0.d;
import com.github.catvod.spider.merge.xc.F0.e;
import com.github.catvod.spider.merge.xc.F0.f;
import com.github.catvod.spider.merge.xc.F0.h;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.o;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.F0.s;
import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.C;
import com.github.catvod.spider.merge.xc.G0.D;
import com.github.catvod.spider.merge.xc.G0.E;
import com.github.catvod.spider.merge.xc.G0.F;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.M;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class b {
    public static final String[] A;
    public static final String[] B;
    public static final String[] C;
    public static final String[] D;
    public static final String[] E;
    public static final String[] x;
    public static final String[] y;
    public static final String[] z;
    public com.github.catvod.spider.merge.UY.A a;
    public a b;
    public P c;
    public h d;
    public ArrayList e;
    public String f;
    public N g;
    public D h;
    public HashMap i;
    public final L j = new L();
    public final K k = new K();
    public B l;
    public B m;
    public boolean n;
    public l o;
    public o p;
    public ArrayList q;
    public ArrayList r;
    public ArrayList s;
    public K t;
    public boolean u;
    public boolean v;
    public final String[] w = new String[]{null};

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

    public static boolean z(ArrayList arrayList, l l2) {
        int n2 = arrayList.size();
        int n3 = n2 - 1;
        n2 = n3 >= 256 ? (n2 -= 257) : 0;
        while (n3 >= n2) {
            if ((l)arrayList.get(n3) == l2) {
                return true;
            }
            --n3;
        }
        return false;
    }

    public final void A() {
        int n2 = this.e.size();
        l l2 = (l)this.e.remove(n2 - 1);
    }

    public final void B(String string) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            l l2 = (l)this.e.get(i2);
            this.e.remove(i2);
            if (!l2.d.b.equals(string)) continue;
            boolean bl = this.g instanceof K;
            return;
        }
    }

    public final void C() {
        if (this.r.size() > 0) {
            Object object = this.r;
            object = (B)((Object)object.remove(object.size() - 1));
        }
    }

    public final boolean D(N n2) {
        this.g = n2;
        return this.l.c(n2, this);
    }

    public final boolean E(N n2, B b2) {
        this.g = n2;
        return b2.c(n2, this);
    }

    public final boolean F(String string) {
        N n2 = this.g;
        K k2 = this.k;
        if (n2 == k2) {
            n2 = new K();
            ((M)n2).n(string);
            return this.D(n2);
        }
        k2.p();
        k2.n(string);
        return this.D(k2);
    }

    public final void G(String string) {
        N n2 = this.g;
        L l2 = this.j;
        if (n2 == l2) {
            n2 = new L();
            ((M)n2).n(string);
            this.D(n2);
            return;
        }
        l2.p();
        l2.n(string);
        this.D(l2);
    }

    public final void H(B b2) {
        this.r.add(b2);
    }

    /*
     * Unable to fully structure code
     */
    public final void I() {
        block8: {
            block7: {
                if (this.e.size() > 256) {
                    return;
                }
                var1_1 = this.q.size();
                var5_2 = 1;
                if (var1_1 > 0) {
                    var6_3 = this.q;
                    var6_3 = (l)var6_3.get(var6_3.size() - 1);
                } else {
                    var6_3 = null;
                }
                if (var6_3 == null || com.github.catvod.spider.merge.xc.G0.b.z(this.e, (l)var6_3)) break block8;
                var3_4 = this.q.size();
                var2_5 = var1_1 = var3_4 - 12;
                if (var1_1 < 0) {
                    var2_5 = 0;
                }
                var1_1 = var4_6 = var3_4 - 1;
                do {
                    block9: {
                        if (var1_1 != var2_5) break block9;
                        var3_4 = var5_2;
                        ** GOTO lbl35
                    }
                    var6_3 = this.q;
                    var3_4 = var1_1 - 1;
                    var7_7 = (l)var6_3.get(var3_4);
                    var6_3 = var7_7;
                    var1_1 = var3_4;
                    if (var7_7 == null) break block7;
                    var6_3 = var7_7;
                    var1_1 = var3_4;
                } while (!com.github.catvod.spider.merge.xc.G0.b.z(this.e, var7_7));
                var1_1 = var3_4;
                var6_3 = var7_7;
            }
            do {
                var3_4 = 0;
lbl35:
                // 2 sources

                var2_5 = var1_1;
                if (var3_4 == 0) {
                    var6_3 = this.q;
                    var2_5 = var1_1 + 1;
                    var6_3 = (l)var6_3.get(var2_5);
                }
                com.github.catvod.spider.merge.xc.D0.b.A(var6_3);
                var7_7 = new l(this.N(var6_3.d.b, this.h), null, var6_3.d().c());
                this.x(var7_7);
                this.e.add(var7_7);
                this.q.set(var2_5, var7_7);
                var1_1 = var2_5;
            } while (var2_5 != var4_6);
        }
    }

    public final void J(l l2) {
        for (int i2 = this.q.size() - 1; i2 >= 0; --i2) {
            if ((l)this.q.get(i2) != l2) continue;
            this.q.remove(i2);
            break;
        }
    }

    public final void K(l l2) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            if ((l)this.e.get(i2) != l2) continue;
            this.e.remove(i2);
            return;
        }
    }

    public final void L() {
        if (!this.y("body")) {
            l l2;
            ArrayList arrayList;
            block3: {
                arrayList = this.e;
                l l3 = this.d.Q();
                Iterator iterator = l3.A().iterator();
                while (iterator.hasNext()) {
                    l l4;
                    l2 = l4 = (l)iterator.next();
                    if (!"body".equals(l4.d.b)) {
                        if (!"frameset".equals(l4.d.b)) continue;
                        l2 = l4;
                    }
                    break block3;
                }
                com.github.catvod.spider.merge.xc.a.a.r(l3);
                l2 = new l(com.github.catvod.spider.merge.xc.G0.E.a("body", com.github.catvod.spider.merge.xc.G0.D.c), l3.e(), null);
                l3.y(l2);
            }
            arrayList.add(l2);
        }
        this.l = com.github.catvod.spider.merge.xc.G0.B.g;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final boolean M() {
        var1_1 = this.e.size();
        var5_2 = true;
        var3_3 = var1_1 - 1;
        var2_4 = var3_3 >= 256 ? var1_1 - 257 : 0;
        var7_5 = this.l;
        if (this.e.size() == 0) {
            this.l = com.github.catvod.spider.merge.xc.G0.B.g;
        }
        var4_6 = false;
        block48: while (var3_3 >= var2_4) {
            var6_7 /* !! */  = (l)this.e.get(var3_3);
            if (var3_3 == var2_4) {
                var4_6 = true;
            }
            var6_7 /* !! */  = var6_7 /* !! */  != null ? var6_7 /* !! */ .d.b : "";
            var6_7 /* !! */ .getClass();
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
                    var1_1 = -1;
                    break;
                }
                case 1: {
                    var1_1 = 14;
                    break;
                }
                case 2: {
                    var1_1 = 13;
                    break;
                }
                case 3: {
                    var1_1 = 12;
                    break;
                }
                case 4: {
                    var1_1 = 11;
                    break;
                }
                case 5: {
                    var1_1 = 10;
                    break;
                }
                case 6: {
                    var1_1 = 9;
                    break;
                }
                case 7: {
                    var1_1 = 8;
                    break;
                }
                case 8: {
                    var1_1 = 7;
                    break;
                }
                case 9: {
                    var1_1 = 6;
                    break;
                }
                case 10: {
                    var1_1 = 5;
                    break;
                }
                case 11: {
                    var1_1 = 4;
                    break;
                }
                case 12: {
                    var1_1 = 3;
                    break;
                }
                case 13: {
                    var1_1 = 2;
                    break;
                }
                case 14: {
                    var1_1 = 1;
                    break;
                }
                case 15: {
                    var1_1 = 0;
                }
            }
            switch (var1_1) {
                default: {
                    ** GOTO lbl157
                }
                case 14: {
                    this.l = com.github.catvod.spider.merge.xc.G0.B.k;
                    break block48;
                }
                case 11: 
                case 12: 
                case 13: {
                    this.l = com.github.catvod.spider.merge.xc.G0.B.m;
                    break block48;
                }
                case 10: {
                    this.l = com.github.catvod.spider.merge.xc.G0.B.i;
                    break block48;
                }
                case 9: {
                    var6_7 /* !! */  = this.o == null ? com.github.catvod.spider.merge.xc.G0.B.c : com.github.catvod.spider.merge.xc.G0.B.f;
                    this.l = var6_7 /* !! */ ;
                    break block48;
                }
                case 8: {
                    if (!var4_6) {
                        this.l = com.github.catvod.spider.merge.xc.G0.B.d;
                        break block48;
                    }
                    ** GOTO lbl157
                }
                case 7: {
                    this.l = com.github.catvod.spider.merge.xc.G0.B.g;
                    break block48;
                }
                case 6: {
                    this.l = com.github.catvod.spider.merge.xc.G0.B.n;
                    break block48;
                }
                case 4: 
                case 5: {
                    if (!var4_6) {
                        this.l = com.github.catvod.spider.merge.xc.G0.B.o;
                        break block48;
                    }
lbl157:
                    // 4 sources

                    if (var4_6) {
                        this.l = com.github.catvod.spider.merge.xc.G0.B.g;
                        break block48;
                    }
                    --var3_3;
                    continue block48;
                }
                case 3: {
                    this.l = com.github.catvod.spider.merge.xc.G0.B.l;
                    break block48;
                }
                case 2: {
                    this.l = com.github.catvod.spider.merge.xc.G0.B.p;
                    break block48;
                }
                case 1: {
                    if (this.r.size() > 0) {
                        var6_7 /* !! */  = this.r;
                        var6_7 /* !! */  = (B)var6_7 /* !! */ .get(var6_7 /* !! */ .size() - 1);
                    } else {
                        var6_7 /* !! */  = null;
                    }
                    if (var6_7 /* !! */  == null) throw new c("Bug: no template insertion mode on stack!");
                    this.l = var6_7 /* !! */ ;
                    break block48;
                }
                case 0: 
            }
            this.l = com.github.catvod.spider.merge.xc.G0.B.t;
            break;
        }
        if (this.l == var7_5) return false;
        return var5_2;
    }

    public final E N(String string, D d2) {
        E e2;
        E e3 = e2 = (E)this.i.get(string);
        if (e2 == null) {
            e3 = com.github.catvod.spider.merge.xc.G0.E.a(string, d2);
            this.i.put(string, e3);
        }
        return e3;
    }

    public final l a(l l2) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            if ((l)this.e.get(i2) != l2) continue;
            return (l)this.e.get(i2 - 1);
        }
        return null;
    }

    public final void b(l l2) {
        l l3;
        int n2 = this.q.size();
        int n3 = n2 - 1;
        int n4 = n2 - 13;
        int n5 = 0;
        n2 = n4;
        int n6 = n3;
        int n7 = n5;
        if (n4 < 0) {
            n2 = 0;
            n7 = n5;
            n6 = n3;
        }
        while (n6 >= n2 && (l3 = (l)this.q.get(n6)) != null) {
            n3 = n7;
            if (l2.d.b.equals(l3.d.b)) {
                n3 = n7;
                if (l2.d().equals(l3.d())) {
                    n3 = n7 + 1;
                }
            }
            if (n3 == 3) {
                this.q.remove(n6);
                break;
            }
            --n6;
            n7 = n3;
        }
    }

    public final void c() {
        int n2;
        l l2;
        while (!this.q.isEmpty() && (l2 = (n2 = this.q.size()) > 0 ? (l)this.q.remove(n2 - 1) : null) != null) {
        }
    }

    public final void d(String ... stringArray) {
        block0: for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            l l2 = (l)this.e.get(i2);
            String string = l2.d.b;
            String[] stringArray2 = com.github.catvod.spider.merge.xc.E0.b.a;
            int n2 = stringArray.length;
            for (int i4 = 0; i4 < n2; ++i4) {
                if (stringArray[i4].equals(string)) break block0;
            }
            if (l2.d.b.equals("html")) break;
            this.e.remove(i2);
        }
    }

    public final void e() {
        this.d("table", "template");
    }

    public final l f() {
        int n2 = this.e.size();
        l l2 = n2 > 0 ? (l)this.e.get(n2 - 1) : this.d;
        return l2;
    }

    public final boolean g(String string) {
        int n2 = this.e.size();
        boolean bl = false;
        if (n2 == 0) {
            return false;
        }
        l l2 = this.f();
        boolean bl2 = bl;
        if (l2 != null) {
            bl2 = bl;
            if (l2.d.b.equals(string)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void h(B b2) {
        if (((C)this.a.b).a()) {
            ((AbstractCollection)((C)this.a.b)).add(new com.github.catvod.spider.merge.UY.B(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, b2}));
        }
    }

    public final void i(String string) {
        while (com.github.catvod.spider.merge.xc.E0.b.c(this.f().d.b, C) && (string == null || !this.g(string))) {
            this.A();
        }
    }

    public final void j(boolean bl) {
        String[] stringArray = bl ? D : C;
        while (com.github.catvod.spider.merge.xc.E0.b.c(this.f().d.b, stringArray)) {
            this.A();
        }
    }

    public final l k(String string) {
        l l2;
        for (int i2 = this.q.size() - 1; i2 >= 0 && (l2 = (l)this.q.get(i2)) != null; --i2) {
            if (!l2.d.b.equals(string)) continue;
            return l2;
        }
        return null;
    }

    public final l l(String string) {
        int n2 = this.e.size();
        int n3 = n2 - 1;
        n2 = n3 >= 256 ? (n2 -= 257) : 0;
        while (n3 >= n2) {
            l l2 = (l)this.e.get(n3);
            if (l2.d.b.equals(string)) {
                return l2;
            }
            --n3;
        }
        return null;
    }

    public final boolean m(String string) {
        String[] stringArray = z;
        String[] stringArray2 = x;
        String[] stringArray3 = this.w;
        stringArray3[0] = string;
        return this.p(stringArray3, stringArray2, stringArray);
    }

    public final boolean n(String string) {
        String[] stringArray = x;
        String[] stringArray2 = this.w;
        stringArray2[0] = string;
        return this.p(stringArray2, stringArray, null);
    }

    public final boolean o(String object) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            String string = ((l)this.e.get((int)i2)).d.b;
            if (string.equals(object)) {
                return true;
            }
            if (com.github.catvod.spider.merge.xc.E0.b.c(string, B)) continue;
            return false;
        }
        object = new c("Should not be reachable");
        throw object;
    }

    public final boolean p(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        int n2 = this.e.size();
        int n3 = n2 - 1;
        n2 = n3 > 100 ? (n2 -= 101) : 0;
        while (n3 >= n2) {
            String string = ((l)this.e.get((int)n3)).d.b;
            if (com.github.catvod.spider.merge.xc.E0.b.c(string, stringArray)) {
                return true;
            }
            if (com.github.catvod.spider.merge.xc.E0.b.c(string, stringArray2)) {
                return false;
            }
            if (stringArray3 != null && com.github.catvod.spider.merge.xc.E0.b.c(string, stringArray3)) {
                return false;
            }
            --n3;
        }
        return false;
    }

    public final boolean q(String string) {
        String[] stringArray = A;
        String[] stringArray2 = this.w;
        stringArray2[0] = string;
        return this.p(stringArray2, stringArray, null);
    }

    public final l r(L object) {
        Object object2;
        Object object3;
        block8: {
            int n2;
            block10: {
                block9: {
                    if (!((M)object).l()) break block8;
                    object3 = ((M)object).l;
                    n2 = ((com.github.catvod.spider.merge.xc.F0.c)object3).a;
                    if (n2 == 0) break block8;
                    object2 = this.h;
                    if ((n2 = n2 == 0 ? 1 : 0) == 0) break block9;
                    n2 = 0;
                    break block10;
                }
                boolean bl = object2.b;
                int n3 = 0;
                int n4 = 0;
                while (true) {
                    String[] stringArray;
                    int n5;
                    n2 = n4;
                    if (n3 >= ((com.github.catvod.spider.merge.xc.F0.c)object3).b.length) break;
                    n2 = n5 = n3 + 1;
                    while (n2 < (stringArray = ((com.github.catvod.spider.merge.xc.F0.c)object3).b).length && (object2 = stringArray[n2]) != null) {
                        int n6;
                        int n7;
                        block12: {
                            block11: {
                                if (bl && stringArray[n3].equals(object2)) break block11;
                                n7 = n4;
                                n6 = n2;
                                if (bl) break block12;
                                object2 = ((com.github.catvod.spider.merge.xc.F0.c)object3).b;
                                n7 = n4;
                                n6 = n2;
                                if (!object2[n3].equalsIgnoreCase(object2[n2])) break block12;
                            }
                            n7 = n4 + 1;
                            ((com.github.catvod.spider.merge.xc.F0.c)object3).l(n2);
                            n6 = n2 - 1;
                        }
                        n2 = n6 + 1;
                        n4 = n7;
                    }
                    n3 = n5;
                }
            }
            if (n2 > 0) {
                object3 = ((M)object).c;
                object2 = (C)this.a.b;
                if (object2.a()) {
                    object2.add(new com.github.catvod.spider.merge.UY.B(this.b, "Dropped duplicate attribute(s) in tag [%s]", new Object[]{object3}));
                }
            }
        }
        if (((M)object).k) {
            object2 = this.u((L)object);
            this.e.add(object2);
            this.c.o(g1.a);
            object3 = this.c;
            object = this.t;
            ((M)object).p();
            ((M)object).n(object2.d.a);
            ((P)object3).f((N)object);
            return object2;
        }
        object2 = this.N(((M)object).m(), this.h);
        object3 = this.h;
        object = ((M)object).l;
        ((D)object3).a((com.github.catvod.spider.merge.xc.F0.c)object);
        object = new l((E)object2, null, (com.github.catvod.spider.merge.xc.F0.c)object);
        this.x((q)object);
        this.e.add(object);
        return object;
    }

    public final void s(G object) {
        l l2 = this.f();
        String string = l2.d.b;
        String string2 = ((G)object).b;
        object = object instanceof F ? new d(string2) : (!string.equals("script") && !string.equals("style") ? new s(string2) : new f(string2));
        l2.y((q)object);
    }

    public final void t(H object) {
        String string = ((H)object).c;
        object = string != null ? string : ((H)object).b.toString();
        this.x(new e((String)object));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TreeBuilder{currentToken=");
        stringBuilder.append(this.g);
        stringBuilder.append(", state=");
        stringBuilder.append((Object)this.l);
        stringBuilder.append(", currentElement=");
        stringBuilder.append(this.f());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final l u(L object) {
        Object object2 = this.N(((M)object).m(), this.h);
        Object object3 = this.h;
        Cloneable cloneable = ((M)object).l;
        ((D)object3).a((com.github.catvod.spider.merge.xc.F0.c)cloneable);
        object3 = new l((E)object2, null, (com.github.catvod.spider.merge.xc.F0.c)cloneable);
        this.x((q)object3);
        if (((M)object).k) {
            if (com.github.catvod.spider.merge.xc.G0.E.j.containsKey(((E)object2).a)) {
                if (!((E)object2).e) {
                    object = this.c;
                    object2 = ((E)object2).b;
                    cloneable = ((P)object).b;
                    if (((C)cloneable).a()) {
                        ((AbstractCollection)((Object)cloneable)).add(new com.github.catvod.spider.merge.UY.B(((P)object).a, "Tag [%s] cannot be self closing; not a void tag", new Object[]{object2}));
                    }
                }
            } else {
                ((E)object2).f = true;
            }
        }
        return object3;
    }

    public final void v(L object, boolean bl, boolean bl2) {
        E e2 = this.N(((M)object).m(), this.h);
        D d2 = this.h;
        object = ((M)object).l;
        d2.a((com.github.catvod.spider.merge.xc.F0.c)object);
        object = new o(e2, (com.github.catvod.spider.merge.xc.F0.c)object);
        if (bl2) {
            if (!this.y("template")) {
                this.p = object;
            }
        } else {
            this.p = object;
        }
        this.x((q)object);
        if (bl) {
            this.e.add(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w(q q2) {
        boolean bl;
        l l2;
        l l3;
        block3: {
            block4: {
                block1: {
                    block2: {
                        l3 = this.l("table");
                        if (l3 == null) break block1;
                        l2 = (l)l3.a;
                        if (l2 == null) break block2;
                        bl = true;
                        break block3;
                    }
                    l2 = this.a(l3);
                    break block4;
                }
                l2 = (l)this.e.get(0);
            }
            bl = false;
        }
        if (bl) {
            com.github.catvod.spider.merge.xc.D0.b.A(l3);
            com.github.catvod.spider.merge.xc.D0.b.A(l3.a);
            l3.a.b(l3.b, q2);
            return;
        }
        l2.y(q2);
    }

    public final void x(q q2) {
        if (this.e.isEmpty()) {
            this.d.y(q2);
        } else if (this.v && com.github.catvod.spider.merge.xc.E0.b.c(this.f().d.b, com.github.catvod.spider.merge.xc.G0.A.A)) {
            this.w(q2);
        } else {
            this.f().y(q2);
        }
        if (q2 instanceof l) {
            o o2;
            q2 = (l)q2;
            if (((l)q2).d.h && (o2 = this.p) != null) {
                ((AbstractCollection)o2.j).add(q2);
            }
        }
    }

    public final boolean y(String string) {
        boolean bl = this.l(string) != null;
        return bl;
    }
}

