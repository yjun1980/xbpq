/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.f1.E;
import com.github.catvod.spider.merge.f1.F;
import com.github.catvod.spider.merge.f1.G;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.O;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

abstract class j1 {
    protected F a;
    a b;
    S c;
    protected h d;
    protected ArrayList<m> e;
    protected String f;
    protected P g;
    protected E h;
    protected Map<String, G> i;
    private N j = new N();
    private M k = new M();

    j1() {
    }

    protected final m a() {
        int n2 = this.e.size();
        m m2 = n2 > 0 ? this.e.get(n2 - 1) : this.d;
        return m2;
    }

    protected final boolean b(String string) {
        int n2 = this.e.size();
        boolean bl = false;
        if (n2 == 0) {
            return false;
        }
        m m2 = this.a();
        boolean bl2 = bl;
        if (m2 != null) {
            bl2 = bl;
            if (m2.g0().equals(string)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    protected void c(Reader object, String string, F f2) {
        h h2;
        com.github.catvod.spider.merge.c1.d.k(string, "baseUri");
        com.github.catvod.spider.merge.c1.d.j(f2);
        this.d = h2 = new h(string);
        h2.C0(f2);
        this.a = f2;
        this.h = f2.g();
        this.b = object = new a((Reader)object, 32768);
        boolean bl = f2.c();
        ((a)object).O(bl);
        this.g = null;
        this.c = new S(this.b, f2.a());
        this.e = new ArrayList(32);
        this.i = new HashMap<String, G>();
        this.f = string;
    }

    final h d(Reader object, String object2, F f2) {
        this.c((Reader)object, (String)object2, f2);
        object2 = this.c;
        do {
            object = ((S)object2).u();
            this.e((P)object);
            ((P)object).h();
        } while (((P)object).a != 6);
        this.b.d();
        this.b = null;
        this.c = null;
        this.e = null;
        this.i = null;
        return this.d;
    }

    protected abstract boolean e(P var1);

    protected final boolean f(String string) {
        P p2 = this.g;
        M m2 = this.k;
        if (p2 == m2) {
            p2 = new M();
            ((O)p2).v(string);
            return this.e(p2);
        }
        m2.y();
        m2.v(string);
        return this.e(m2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean g(c object) {
        N n2 = this.j;
        if (this.g == n2) {
            n2 = new N();
            n2.d = "input";
            n2.n = object;
            object = n2;
        } else {
            n2.y();
            n2.d = "input";
            n2.n = object;
            object = n2;
        }
        ((O)object).e = com.github.catvod.spider.merge.K1.d.e("input");
        return this.e((P)object);
    }

    protected final boolean h(String string) {
        N n2 = this.j;
        if (this.g == n2) {
            n2 = new N();
        } else {
            n2.y();
        }
        n2.v(string);
        return this.e(n2);
    }

    protected final G i(String string, E e2) {
        G g2;
        G g3 = g2 = (G)((HashMap)this.i).get(string);
        if (g2 == null) {
            g3 = G.m(string, e2);
            ((HashMap)this.i).put(string, g3);
        }
        return g3;
    }
}

