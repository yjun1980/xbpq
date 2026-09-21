/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Dw.a;
import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.q;
import com.github.catvod.spider.merge.Em.c;
import com.github.catvod.spider.merge.Em.d;
import com.github.catvod.spider.merge.Em.e;
import com.github.catvod.spider.merge.Em.f;
import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Em.j;
import com.github.catvod.spider.merge.Em.k;
import com.github.catvod.spider.merge.Em.r;
import com.github.catvod.spider.merge.Em.s;
import com.github.catvod.spider.merge.Em.u;
import com.github.catvod.spider.merge.Fs.D;
import com.github.catvod.spider.merge.Fs.F;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.P;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class l
extends r {
    private static final List<l> j = Collections.emptyList();
    private static final String k;
    private F f;
    private WeakReference<List<l>> g;
    List<r> h;
    private c i;

    static {
        Pattern.compile("\\s+");
        k = "/baseUri";
    }

    public l(F f2, String string, c c2) {
        com.github.catvod.spider.merge.Dw.i.k(f2);
        this.h = r.e;
        this.i = c2;
        this.f = f2;
        if (string != null) {
            this.l(string);
        }
    }

    public l(String string) {
        this(F.l(string, D.d), "", null);
    }

    static /* synthetic */ void I(StringBuilder stringBuilder, u u2) {
        l.N(stringBuilder, u2);
    }

    static /* synthetic */ F J(l l2) {
        return l2.f;
    }

    private static void K(l l2, com.github.catvod.spider.merge.ej.g g2) {
        l2 = (l)l2.c;
        if (l2 != null && !l2.n0().equals("#root")) {
            ((AbstractCollection)g2).add(l2);
            l.K(l2, g2);
        }
    }

    private static void N(StringBuilder stringBuilder, u u2) {
        block10: {
            String string;
            block6: {
                int n2;
                string = u2.I();
                if (l.h0(u2.c) || u2 instanceof d) break block6;
                boolean bl = u.M(stringBuilder);
                int n3 = com.github.catvod.spider.merge.Dw.e.d;
                int n4 = string.length();
                boolean bl2 = false;
                int n5 = 0;
                for (int i2 = 0; i2 < n4; i2 += Character.charCount(n2)) {
                    boolean bl3;
                    block9: {
                        block7: {
                            block8: {
                                n2 = string.codePointAt(i2);
                                n3 = n2 != 32 && n2 != 9 && n2 != 10 && n2 != 12 && n2 != 13 && n2 != 160 ? 0 : 1;
                                if (n3 == 0) break block7;
                                if (!bl) break block8;
                                bl3 = bl2;
                                n3 = n5;
                                if (!bl2) break block9;
                            }
                            if (n5 != 0) {
                                bl3 = bl2;
                                n3 = n5;
                            } else {
                                stringBuilder.append(' ');
                                n3 = 1;
                                bl3 = bl2;
                            }
                            break block9;
                        }
                        boolean bl4 = n2 == 8203 || n2 == 173;
                        bl3 = bl2;
                        n3 = n5;
                        if (!bl4) {
                            stringBuilder.appendCodePoint(n2);
                            bl3 = true;
                            n3 = 0;
                        }
                    }
                    bl2 = bl3;
                    n5 = n3;
                }
                break block10;
            }
            stringBuilder.append(string);
        }
    }

    private static <E extends l> int Z(l l2, List<E> list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (list.get(i2) != l2) continue;
            return i2;
        }
        return 0;
    }

    static boolean h0(r r2) {
        if (r2 instanceof l) {
            l l2;
            r2 = (l)r2;
            int n2 = 0;
            do {
                if (((l)r2).f.j()) {
                    return true;
                }
                l2 = (l)r2.c;
                if (++n2 >= 6) break;
                r2 = l2;
            } while (l2 != null);
        }
        return false;
    }

    @Override
    public final r F() {
        r r2;
        r r3 = this;
        while ((r2 = r3.c) != null) {
            r3 = r2;
        }
        return r3;
    }

    public final l L(r r2) {
        com.github.catvod.spider.merge.Dw.i.k(r2);
        r r3 = r2.c;
        if (r3 != null) {
            r3.D(r2);
        }
        r2.c = this;
        this.n();
        this.h.add(r2);
        r2.d = this.h.size() - 1;
        return this;
    }

    public final l M(String object) {
        s.a(this).getClass();
        object = new l(F.l((String)object, D.c), this.e(), null);
        this.L((r)object);
        return object;
    }

    public final l O(String string) {
        com.github.catvod.spider.merge.Dw.i.k(string);
        this.L(new u(string));
        return this;
    }

    public final l P() {
        return this.Q().get(0);
    }

    final List<l> Q() {
        Object object;
        block6: {
            Object object2;
            block5: {
                if (this.h() == 0) {
                    return j;
                }
                object = this.g;
                if (object == null) break block5;
                object2 = (List)((Reference)object).get();
                object = object2;
                if (object2 != null) break block6;
            }
            int n2 = this.h.size();
            object = new ArrayList<l>(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = this.h.get(i2);
                if (!(object2 instanceof l)) continue;
                ((ArrayList)object).add((l)((l)object2));
            }
            this.g = new WeakReference<ArrayList<l>>((ArrayList<l>)object);
        }
        return object;
    }

    public final com.github.catvod.spider.merge.ej.g R() {
        return new com.github.catvod.spider.merge.ej.g(this.Q());
    }

    public l S() {
        return (l)super.j();
    }

    /*
     * WARNING - void declaration
     */
    public final String T() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.Dw.e.a();
        for (r r2 : this.h) {
            void var1_9;
            if (r2 instanceof f) {
                String string = ((f)r2).I();
            } else if (r2 instanceof e) {
                String string = ((e)r2).I();
            } else if (r2 instanceof l) {
                String string = ((l)r2).T();
            } else {
                if (!(r2 instanceof d)) continue;
                String string = ((d)r2).I();
            }
            stringBuilder.append((String)var1_9);
        }
        return com.github.catvod.spider.merge.Dw.e.g(stringBuilder);
    }

    public final int U() {
        r r2 = this.c;
        if ((l)r2 == null) {
            return 0;
        }
        return l.Z(this, ((l)r2).Q());
    }

    public final com.github.catvod.spider.merge.ej.g V() {
        return com.github.catvod.spider.merge.ej.c.a(new com.github.catvod.spider.merge.ej.h(), this);
    }

    public final boolean W(String string) {
        Object object = this.i;
        if (object == null) {
            return false;
        }
        object = ((c)object).k("class");
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

    public final String X() {
        Object object = com.github.catvod.spider.merge.Dw.e.a();
        int n2 = this.h.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.h.get(i2).v((Appendable)object);
        }
        String string = com.github.catvod.spider.merge.Dw.e.g((StringBuilder)object);
        object = this.y();
        if (object == null) {
            object = new h();
        }
        String string2 = string;
        if (((h)object).s0().f()) {
            string2 = string.trim();
        }
        return string2;
    }

    public final String Y() {
        Object object = this.i;
        object = object != null ? ((c)object).k("id") : "";
        return object;
    }

    public final boolean a0() {
        return this.f.c();
    }

    public final l b0() {
        Object object = this.c;
        if (object == null) {
            return null;
        }
        object = ((l)object).Q();
        int n2 = l.Z(this, object);
        int n3 = object.size();
        if (n3 > ++n2) {
            return (l)object.get(n2);
        }
        return null;
    }

    final void c0() {
        this.g = null;
    }

    @Override
    public final c d() {
        if (this.i == null) {
            this.i = new c();
        }
        return this.i;
    }

    public final String d0() {
        return this.f.i();
    }

    @Override
    public final String e() {
        Object object;
        block2: {
            String string = k;
            object = this;
            while (object != null) {
                boolean bl;
                c c2 = ((l)object).i;
                if (c2 != null && (bl = c2.o(string) != -1)) {
                    object = ((l)object).i.j(string);
                    break block2;
                }
                object = (l)((r)object).c;
            }
            object = "";
        }
        return object;
    }

    public final String e0() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.Dw.e.a();
        for (r r2 : this.h) {
            if (r2 instanceof u) {
                l.N(stringBuilder, (u)r2);
                continue;
            }
            if (!(r2 instanceof l) || !((l)r2).f.b().equals("br") || u.M(stringBuilder)) continue;
            stringBuilder.append(" ");
        }
        return com.github.catvod.spider.merge.Dw.e.g(stringBuilder).trim();
    }

    public final l f0() {
        return (l)this.c;
    }

    public final com.github.catvod.spider.merge.ej.g g0() {
        com.github.catvod.spider.merge.ej.g g2 = new com.github.catvod.spider.merge.ej.g();
        l.K(this, g2);
        return g2;
    }

    @Override
    public final int h() {
        return this.h.size();
    }

    public final l i0() {
        Object object = this.c;
        if (object == null) {
            return null;
        }
        int n2 = l.Z(this, object = ((l)object).Q());
        if (n2 > 0) {
            return (l)object.get(n2 - 1);
        }
        return null;
    }

    public final com.github.catvod.spider.merge.ej.g j0(String object) {
        com.github.catvod.spider.merge.Dw.i.i((String)object);
        object = P.h((String)object);
        com.github.catvod.spider.merge.Dw.i.k(object);
        return com.github.catvod.spider.merge.ej.c.a((N)object, this);
    }

    @Override
    protected final r k(r cloneable) {
        l l2 = (l)super.k((r)cloneable);
        cloneable = this.i;
        cloneable = cloneable != null ? ((c)cloneable).h() : null;
        l2.i = cloneable;
        cloneable = new k(l2, this.h.size());
        l2.h = cloneable;
        ((a)cloneable).addAll(this.h);
        return l2;
    }

    public final l k0(String string) {
        com.github.catvod.spider.merge.Dw.i.i(string);
        return com.github.catvod.spider.merge.ej.c.b(P.h(string), this);
    }

    @Override
    protected final void l(String string) {
        this.d().t(k, string);
    }

    public final com.github.catvod.spider.merge.ej.g l0() {
        Cloneable cloneable = this.c;
        if (cloneable == null) {
            return new com.github.catvod.spider.merge.ej.g(0);
        }
        Object object = ((l)cloneable).Q();
        cloneable = new com.github.catvod.spider.merge.ej.g(object.size() - 1);
        Iterator<l> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (object == this) continue;
            ((AbstractCollection)((Object)cloneable)).add(object);
        }
        return cloneable;
    }

    @Override
    public final r m() {
        this.h.clear();
        return this;
    }

    public final F m0() {
        return this.f;
    }

    @Override
    protected final List<r> n() {
        if (this.h == r.e) {
            this.h = new k(this, 4);
        }
        return this.h;
    }

    public final String n0() {
        return this.f.b();
    }

    public l o0(String object) {
        com.github.catvod.spider.merge.Dw.i.k(object);
        this.h.clear();
        h h2 = this.y();
        object = h2 != null && h2.u0().b(this.d0()) ? new f((String)object) : new u((String)object);
        this.L((r)object);
        return this;
    }

    @Override
    protected final boolean p() {
        boolean bl = this.i != null;
        return bl;
    }

    public final String p0() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.Dw.e.a();
        q.c(new j(stringBuilder), this);
        return com.github.catvod.spider.merge.Dw.e.g(stringBuilder).trim();
    }

    public final List<u> q0() {
        ArrayList<u> arrayList = new ArrayList<u>();
        for (r r2 : this.h) {
            if (!(r2 instanceof u)) continue;
            arrayList.add((u)r2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override
    public String t() {
        return this.f.b();
    }

    @Override
    void w(Appendable appendable, int n2, g g2) {
        Cloneable cloneable;
        block9: {
            boolean bl;
            block10: {
                boolean bl2;
                block11: {
                    if (!g2.f()) break block9;
                    boolean bl3 = this.f.a();
                    bl2 = false;
                    bl = bl3 || (cloneable = (l)this.c) != null && ((l)cloneable).f.a();
                    if (!bl) break block9;
                    bl = bl2;
                    if (!this.f.f()) break block10;
                    bl = bl2;
                    if (this.f.d()) break block10;
                    cloneable = (l)this.c;
                    if (cloneable == null) break block11;
                    bl = bl2;
                    if (!((l)cloneable).a0()) break block10;
                }
                r r2 = this.c;
                cloneable = null;
                if (r2 != null && this.d > 0) {
                    cloneable = r2.n().get(this.d - 1);
                }
                bl = bl2;
                if (cloneable != null) {
                    bl = true;
                }
            }
            if (!(bl || appendable instanceof StringBuilder && ((StringBuilder)appendable).length() <= 0)) {
                this.r(appendable, n2, g2);
            }
        }
        appendable.append('<').append(this.n0());
        cloneable = this.i;
        if (cloneable != null) {
            ((c)cloneable).n(appendable, g2);
        }
        if (this.h.isEmpty() && this.f.h() && (g2.g() != 1 || !this.f.d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    @Override
    void x(Appendable appendable, int n2, g g2) {
        if (!this.h.isEmpty() || !this.f.h()) {
            if (g2.f() && !this.h.isEmpty() && this.f.a()) {
                this.r(appendable, n2, g2);
            }
            appendable.append("</").append(this.n0()).append('>');
        }
    }

    @Override
    public final r z() {
        return (l)this.c;
    }
}

