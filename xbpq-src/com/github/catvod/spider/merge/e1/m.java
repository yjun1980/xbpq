/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.c1.a;
import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.d;
import com.github.catvod.spider.merge.e1.e;
import com.github.catvod.spider.merge.e1.f;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.k;
import com.github.catvod.spider.merge.e1.l;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.e1.t;
import com.github.catvod.spider.merge.e1.v;
import com.github.catvod.spider.merge.f1.G;
import com.github.catvod.spider.merge.g1.L;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.P;
import com.github.catvod.spider.merge.g1.r;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class m
extends s {
    private static final List<m> h = Collections.emptyList();
    private static final String i;
    private G d;
    private WeakReference<List<m>> e;
    List<s> f;
    c g;

    static {
        Pattern.compile("\\s+");
        i = com.github.catvod.spider.merge.e1.c.v("baseUri");
    }

    public m(G g2, String string, c c2) {
        com.github.catvod.spider.merge.c1.d.j(g2);
        this.f = s.c;
        this.g = c2;
        this.d = g2;
        if (string != null) {
            this.k(string);
        }
    }

    public static /* synthetic */ void H(StringBuilder stringBuilder, s s2) {
        m.O(s2, stringBuilder);
    }

    static /* synthetic */ void I(StringBuilder stringBuilder, v v2) {
        m.N(stringBuilder, v2);
    }

    static /* synthetic */ G J(m m2) {
        return m2.d;
    }

    private static void N(StringBuilder stringBuilder, v v2) {
        String string = v2.I();
        if (!m.k0(v2.a) && !(v2 instanceof d)) {
            com.github.catvod.spider.merge.d1.c.a(stringBuilder, string, v.M(stringBuilder));
        } else {
            stringBuilder.append(string);
        }
    }

    private static void O(s s2, StringBuilder stringBuilder) {
        if (s2 instanceof v) {
            stringBuilder.append(((v)s2).I());
        } else if (s2 instanceof m && ((m)s2).d.j().equals("br")) {
            stringBuilder.append("\n");
        }
    }

    static boolean k0(s s2) {
        if (s2 instanceof m) {
            m m2;
            s2 = (m)s2;
            int n2 = 0;
            do {
                if (((m)s2).d.k()) {
                    return true;
                }
                m2 = (m)s2.a;
                if (++n2 >= 6) break;
                s2 = m2;
            } while (m2 != null);
        }
        return false;
    }

    @Override
    public final s E() {
        s s2;
        s s3 = this;
        while ((s2 = s3.a) != null) {
            s3 = s2;
        }
        return s3;
    }

    public final m K(s s2) {
        s s3 = s2.a;
        if (s3 != null) {
            s3.C(s2);
        }
        s2.a = this;
        this.m();
        this.f.add(s2);
        s2.b = this.f.size() - 1;
        return this;
    }

    public final m L(Collection<? extends s> collection) {
        if (collection != null) {
            int n2 = this.g();
            int n3 = n2 + 1 - 1;
            boolean bl = n3 >= 0 && n3 <= n2;
            com.github.catvod.spider.merge.c1.d.g(bl, "Insert position out of bounds.");
            this.b(n3, new ArrayList<s>(collection).toArray(new s[0]));
            return this;
        }
        throw new com.github.catvod.spider.merge.c1.e("Children collection to be inserted must not be null.");
    }

    public final m M(String object) {
        object = new m(G.m((String)object, t.a(this).g()), this.e(), null);
        this.K((s)object);
        return object;
    }

    public final m P(String string, String string2) {
        string = t.a(this).g().b(string);
        this.d().A(string, string2);
        return this;
    }

    public final m Q(s s2) {
        com.github.catvod.spider.merge.c1.d.j(this.a);
        this.a.b(this.b, s2);
        return this;
    }

    public final m R() {
        return this.S().get(0);
    }

    final List<m> S() {
        Object object;
        block6: {
            Object object2;
            block5: {
                if (this.g() == 0) {
                    return h;
                }
                object = this.e;
                if (object == null) break block5;
                object2 = (List)((Reference)object).get();
                object = object2;
                if (object2 != null) break block6;
            }
            int n2 = this.f.size();
            object = new ArrayList<m>(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = this.f.get(i2);
                if (!(object2 instanceof m)) continue;
                ((ArrayList)object).add((m)((m)object2));
            }
            this.e = new WeakReference<ArrayList<m>>((ArrayList<m>)object);
        }
        return object;
    }

    public final com.github.catvod.spider.merge.g1.g T() {
        return new com.github.catvod.spider.merge.g1.g(this.S());
    }

    public m U() {
        return (m)super.i();
    }

    /*
     * WARNING - void declaration
     */
    public final String V() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        for (s s2 : this.f) {
            void var1_9;
            if (s2 instanceof f) {
                String string = ((f)s2).I();
            } else if (s2 instanceof e) {
                String string = ((e)s2).I();
            } else if (s2 instanceof m) {
                String string = ((m)s2).V();
            } else {
                if (!(s2 instanceof d)) continue;
                String string = ((d)s2).I();
            }
            stringBuilder.append((String)var1_9);
        }
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }

    public final int W() {
        int n2;
        s s2 = this.a;
        Object object = (m)s2;
        int n3 = 0;
        if (object == null) {
            return 0;
        }
        object = ((m)s2).S();
        int n4 = object.size();
        int n5 = 0;
        while (true) {
            n2 = n3;
            if (n5 >= n4) break;
            if (object.get(n5) == this) {
                n2 = n5;
                break;
            }
            ++n5;
        }
        return n2;
    }

    public final com.github.catvod.spider.merge.g1.g X(String string) {
        com.github.catvod.spider.merge.c1.d.h(string);
        return com.github.catvod.spider.merge.g1.c.a(new r(string), this);
    }

    public final com.github.catvod.spider.merge.g1.g Y() {
        com.github.catvod.spider.merge.c1.d.h("a");
        return com.github.catvod.spider.merge.g1.c.a(new L(com.github.catvod.spider.merge.K1.d.i("a")), this);
    }

    public final boolean Z(String string) {
        Object object = this.g;
        if (object == null) {
            return false;
        }
        object = ((c)object).p("class");
        int n2 = ((String)object).length();
        int n3 = string.length();
        if (n2 != 0 && n2 >= n3) {
            if (n2 == n3) {
                return string.equalsIgnoreCase((String)object);
            }
            boolean bl = false;
            int n4 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n5;
                boolean bl2;
                if (Character.isWhitespace(((String)object).charAt(i2))) {
                    bl2 = bl;
                    n5 = n4;
                    if (bl) {
                        if (i2 - n4 == n3 && ((String)object).regionMatches(true, n4, string, 0, n3)) {
                            return true;
                        }
                        bl2 = false;
                        n5 = n4;
                    }
                } else {
                    bl2 = bl;
                    n5 = n4;
                    if (!bl) {
                        n5 = i2;
                        bl2 = true;
                    }
                }
                bl = bl2;
                n4 = n5;
            }
            if (bl && n2 - n4 == n3) {
                return ((String)object).regionMatches(true, n4, string, 0, n3);
            }
        }
        return false;
    }

    public final boolean a0() {
        for (s s2 : this.f) {
            if (!(s2 instanceof v ? !((v)s2).L() : s2 instanceof m && ((m)s2).a0())) continue;
            return true;
        }
        return false;
    }

    public final String b0() {
        Object object = com.github.catvod.spider.merge.d1.c.b();
        int n2 = this.f.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.f.get(i2).u((Appendable)object);
        }
        String string = com.github.catvod.spider.merge.d1.c.i((StringBuilder)object);
        object = this.x();
        if (object == null) {
            object = new h("");
        }
        String string2 = string;
        if (((h)object).B0().i()) {
            string2 = string.trim();
        }
        return string2;
    }

    public final String c0() {
        Object object = this.g;
        object = object != null ? ((c)object).p("id") : "";
        return object;
    }

    @Override
    public final c d() {
        if (this.g == null) {
            this.g = new c();
        }
        return this.g;
    }

    public final boolean d0() {
        s s2;
        N n2 = P.j("a");
        s s3 = this;
        while ((s2 = s3.a) != null) {
            s3 = s2;
        }
        return n2.a((m)s3, this);
    }

    @Override
    public final String e() {
        Object object;
        block2: {
            String string = i;
            object = this;
            while (object != null) {
                boolean bl;
                c c2 = ((m)object).g;
                if (c2 != null && (bl = c2.t(string) != -1)) {
                    object = ((m)object).g.o(string);
                    break block2;
                }
                object = (m)((s)object).a;
            }
            object = "";
        }
        return object;
    }

    public final boolean e0() {
        return this.d.c();
    }

    final void f0() {
        this.e = null;
    }

    @Override
    public final int g() {
        return this.f.size();
    }

    public final String g0() {
        return this.d.j();
    }

    public final String h0() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        for (int i2 = 0; i2 < this.g(); ++i2) {
            s s2 = this.f.get(i2);
            if (s2 instanceof v) {
                m.N(stringBuilder, (v)s2);
                continue;
            }
            if (!(s2 instanceof m) || !((m)s2).d.j().equals("br") || v.M(stringBuilder)) continue;
            stringBuilder.append(" ");
        }
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder).trim();
    }

    public final m i0() {
        return (m)this.a;
    }

    @Override
    protected final s j(s cloneable) {
        m m2 = (m)super.j((s)cloneable);
        cloneable = this.g;
        cloneable = cloneable != null ? ((c)cloneable).m() : null;
        m2.g = cloneable;
        cloneable = new l(m2, this.f.size());
        m2.f = cloneable;
        ((a)cloneable).addAll(this.f);
        return m2;
    }

    public final m j0(s s2) {
        this.b(0, s2);
        return this;
    }

    @Override
    protected final void k(String string) {
        this.d().z(i, string);
    }

    @Override
    public final s l() {
        this.f.clear();
        return this;
    }

    public final m l0() {
        int n2;
        Object object = this.a;
        if (object == null) {
            return null;
        }
        object = ((m)object).S();
        int n3 = object.size();
        int n4 = 0;
        int n5 = 0;
        while (true) {
            n2 = n4;
            if (n5 >= n3) break;
            if (object.get(n5) == this) {
                n2 = n5;
                break;
            }
            ++n5;
        }
        if (n2 > 0) {
            return (m)object.get(n2 - 1);
        }
        return null;
    }

    @Override
    protected final List<s> m() {
        if (this.f == s.c) {
            this.f = new l(this, 4);
        }
        return this.f;
    }

    public final com.github.catvod.spider.merge.g1.g m0(String object) {
        com.github.catvod.spider.merge.c1.d.h((String)object);
        object = P.j((String)object);
        com.github.catvod.spider.merge.c1.d.j(object);
        return com.github.catvod.spider.merge.g1.c.a((N)object, this);
    }

    public final m n0(String string) {
        com.github.catvod.spider.merge.c1.d.h(string);
        return com.github.catvod.spider.merge.g1.c.b(P.j(string), this);
    }

    @Override
    protected final boolean o() {
        boolean bl = this.g != null;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean o0(g cloneable) {
        boolean bl = ((g)cloneable).i();
        boolean bl2 = true;
        if (!bl) return false;
        if (!this.d.a()) {
            cloneable = (m)this.a;
            if (cloneable == null) return false;
            if (!((m)cloneable).d.a()) {
                return false;
            }
        }
        boolean bl3 = true;
        if (!bl3) return false;
        if (this.d.f() && ((cloneable = (m)this.a) == null || ((m)cloneable).e0())) {
            s s2 = this.a;
            cloneable = null;
            if (s2 != null && this.b > 0) {
                cloneable = s2.m().get(this.b - 1);
            }
            if (cloneable != null) {
                return false;
            }
        }
        bl3 = false;
        if (bl3) return false;
        return bl2;
    }

    public final com.github.catvod.spider.merge.g1.g p0() {
        Cloneable cloneable = this.a;
        if (cloneable == null) {
            return new com.github.catvod.spider.merge.g1.g(0);
        }
        Object object = ((m)cloneable).S();
        cloneable = new com.github.catvod.spider.merge.g1.g(object.size() - 1);
        object = object.iterator();
        while (object.hasNext()) {
            m m2 = (m)object.next();
            if (m2 == this) continue;
            ((AbstractCollection)((Object)cloneable)).add(m2);
        }
        return cloneable;
    }

    public final G q0() {
        return this.d;
    }

    public final String r0() {
        return this.d.b();
    }

    @Override
    public String s() {
        return this.d.b();
    }

    public final String s0() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        j.f(new k(stringBuilder), this);
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder).trim();
    }

    public final List<v> t0() {
        ArrayList<v> arrayList = new ArrayList<v>();
        for (s s2 : this.f) {
            if (!(s2 instanceof v)) continue;
            arrayList.add((v)s2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String u0() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        int n2 = this.g();
        for (int i2 = 0; i2 < n2; ++i2) {
            m.O(this.f.get(i2), stringBuilder);
        }
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }

    @Override
    void v(Appendable appendable, int n2, g g2) {
        if (this.o0(g2) && (!(appendable instanceof StringBuilder) || ((StringBuilder)appendable).length() > 0)) {
            this.q(appendable, n2, g2);
        }
        appendable.append('<').append(this.r0());
        c c2 = this.g;
        if (c2 != null) {
            c2.s(appendable, g2);
        }
        if (this.f.isEmpty() && this.d.i() && (g2.j() != 1 || !this.d.d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    @Override
    void w(Appendable appendable, int n2, g g2) {
        if (!this.f.isEmpty() || !this.d.i()) {
            if (g2.i() && !this.f.isEmpty() && this.d.a()) {
                this.q(appendable, n2, g2);
            }
            appendable.append("</").append(this.r0()).append('>');
        }
    }

    @Override
    public final s y() {
        return (m)this.a;
    }
}

