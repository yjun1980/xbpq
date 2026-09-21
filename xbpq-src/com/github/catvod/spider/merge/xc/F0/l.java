/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.HR.p;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.D;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.F0.c;
import com.github.catvod.spider.merge.xc.F0.d;
import com.github.catvod.spider.merge.xc.F0.e;
import com.github.catvod.spider.merge.xc.F0.f;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.h;
import com.github.catvod.spider.merge.xc.F0.k;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.F0.s;
import com.github.catvod.spider.merge.xc.G0.E;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class l
extends q {
    public static final List h = Collections.emptyList();
    public static final String i;
    public final E d;
    public WeakReference e;
    public List f;
    public c g;

    static {
        Pattern.compile("\\s+");
        i = "/".concat("baseUri");
    }

    public l(E e2, String string, c c2) {
        com.github.catvod.spider.merge.xc.D0.b.A(e2);
        this.f = q.c;
        this.g = c2;
        this.d = e2;
        if (string != null) {
            this.D(string);
        }
    }

    public static int H(l l2, List list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (list.get(i2) != l2) continue;
            return i2;
        }
        return 0;
    }

    public static boolean J(q q2) {
        if (q2 instanceof l) {
            l l2;
            q2 = (l)q2;
            int n2 = 0;
            do {
                if (((l)q2).d.g) {
                    return true;
                }
                l2 = (l)q2.a;
                if (++n2 >= 6) break;
                q2 = l2;
            } while (l2 != null);
        }
        return false;
    }

    public static void x(l l2, com.github.catvod.spider.merge.HR.d d2) {
        l2 = (l)l2.a;
        if (l2 != null && !l2.d.a.equals("#root")) {
            ((AbstractCollection)d2).add(l2);
            l.x(l2, d2);
        }
    }

    public static void z(q q2, StringBuilder stringBuilder) {
        if (q2 instanceof s) {
            stringBuilder.append(((s)q2).y());
        } else if (q2 instanceof l && ((l)q2).d.b.equals("br")) {
            stringBuilder.append("\n");
        }
    }

    public final List A() {
        Object object;
        block6: {
            Object object2;
            block5: {
                if (this.f.size() == 0) {
                    return h;
                }
                object = this.e;
                if (object == null) break block5;
                object2 = (List)((Reference)object).get();
                object = object2;
                if (object2 != null) break block6;
            }
            int n2 = this.f.size();
            object = new ArrayList<l>(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = (q)this.f.get(i2);
                if (!(object2 instanceof l)) continue;
                ((ArrayList)object).add((l)object2);
            }
            this.e = new WeakReference(object);
        }
        return object;
    }

    public l B() {
        return (l)super.g();
    }

    public final String C() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
        for (q q2 : this.f) {
            if (q2 instanceof f) {
                stringBuilder.append(((f)q2).y());
                continue;
            }
            if (q2 instanceof e) {
                stringBuilder.append(((e)q2).y());
                continue;
            }
            if (q2 instanceof l) {
                stringBuilder.append(((l)q2).C());
                continue;
            }
            if (!(q2 instanceof d)) continue;
            stringBuilder.append(((d)q2).y());
        }
        return com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder);
    }

    public final void D(String string) {
        this.d().k(i, string);
    }

    public final int E() {
        q q2 = this.a;
        if ((l)q2 == null) {
            return 0;
        }
        return l.H(this, ((l)q2).A());
    }

    public final boolean F() {
        for (q q2 : this.f) {
            if (!(q2 instanceof s ? !com.github.catvod.spider.merge.xc.E0.b.d(((s)q2).y()) : q2 instanceof l && ((l)q2).F())) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final String G() {
        void var3_15;
        void var3_12;
        Object object;
        CharSequence charSequence = com.github.catvod.spider.merge.xc.E0.b.b();
        int n2 = this.f.size();
        int n3 = 0;
        while (true) {
            void var3_9;
            void var3_8;
            Object var3_5 = null;
            object = null;
            if (n3 >= n2) break;
            q q2 = (q)this.f.get(n3);
            q q3 = q2.w();
            q q4 = object;
            if (q3 instanceof h) {
                h h2 = (h)q3;
            }
            if (var3_8 == null) {
                h h3 = new h("");
            }
            g g2 = var3_9.j;
            com.github.catvod.spider.merge.xc.D0.b.O(new D((StringBuilder)charSequence, g2), q2);
            ++n3;
        }
        charSequence = com.github.catvod.spider.merge.xc.E0.b.g((StringBuilder)charSequence);
        object = this.w();
        if (object instanceof h) {
            h h4 = (h)object;
        }
        if (var3_12 != null) {
            g g3 = var3_12.j;
        } else {
            g g4 = new h((String)"").j;
        }
        object = charSequence;
        if (!var3_15.e) return object;
        return ((String)charSequence).trim();
    }

    public final String I() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
        for (int i2 = 0; i2 < this.f.size(); ++i2) {
            Object object = (q)this.f.get(i2);
            if (object instanceof s) {
                s s2 = (s)object;
                object = s2.y();
                if (!l.J(s2.a) && !(s2 instanceof d)) {
                    com.github.catvod.spider.merge.xc.E0.b.a(stringBuilder, (String)object, s.B(stringBuilder));
                    continue;
                }
                stringBuilder.append((String)object);
                continue;
            }
            if (!(object instanceof l) || !((l)object).d.b.equals("br") || s.B(stringBuilder)) continue;
            stringBuilder.append(" ");
        }
        return com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder).trim();
    }

    public final l K() {
        Object object = this.a;
        if (object == null) {
            return null;
        }
        int n2 = l.H(this, (List)(object = ((l)object).A()));
        if (n2 > 0) {
            return (l)object.get(n2 - 1);
        }
        return null;
    }

    public final com.github.catvod.spider.merge.HR.d L(String object) {
        com.github.catvod.spider.merge.xc.D0.b.y((String)object);
        object = p.j((String)object);
        com.github.catvod.spider.merge.xc.D0.b.A(object);
        com.github.catvod.spider.merge.HR.d d2 = new com.github.catvod.spider.merge.HR.d();
        com.github.catvod.spider.merge.xc.D0.b.O(new com.github.catvod.spider.merge.UY.h(this, d2, object), this);
        return d2;
    }

    public final l M(String string) {
        com.github.catvod.spider.merge.xc.D0.b.y(string);
        return new com.github.catvod.spider.merge.UY.h(p.j(string)).e(this, this);
    }

    public final boolean N(g cloneable) {
        boolean bl;
        block5: {
            block4: {
                boolean bl2;
                Cloneable cloneable2;
                block6: {
                    if (!cloneable.e) break block4;
                    cloneable2 = this.d;
                    if (!((E)cloneable2).d && ((cloneable = (l)this.a) == null || !((l)cloneable).d.d)) break block4;
                    boolean bl3 = ((E)cloneable2).c;
                    bl = bl2 = true;
                    if (!(bl3 ^ true)) break block5;
                    cloneable2 = this.a;
                    cloneable = (l)cloneable2;
                    if (cloneable == null) break block6;
                    bl = bl2;
                    if (!((l)cloneable).d.c) break block5;
                }
                cloneable = null;
                if (cloneable2 != null && this.b > 0) {
                    cloneable = (q)((q)cloneable2).j().get(this.b - 1);
                }
                bl = bl2;
                if (cloneable == null) break block5;
            }
            bl = false;
        }
        return bl;
    }

    public final String O() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
        com.github.catvod.spider.merge.xc.D0.b.O(new A(1, stringBuilder), this);
        return com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder).trim();
    }

    public final String P() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
        int n2 = this.f.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            l.z((q)this.f.get(i2), stringBuilder);
        }
        return com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder);
    }

    @Override
    public final c d() {
        if (this.g == null) {
            this.g = new c();
        }
        return this.g;
    }

    @Override
    public final String e() {
        Object object;
        block2: {
            object = this;
            while (object != null) {
                String string;
                c c2 = ((l)object).g;
                if (c2 != null && c2.g(string = i) != -1) {
                    object = ((l)object).g.d(string);
                    break block2;
                }
                object = (l)((q)object).a;
            }
            object = "";
        }
        return object;
    }

    @Override
    public final int f() {
        return this.f.size();
    }

    @Override
    public final q h(q cloneable) {
        l l2 = (l)super.h((q)cloneable);
        cloneable = this.g;
        cloneable = cloneable != null ? ((c)cloneable).c() : null;
        l2.g = cloneable;
        cloneable = new k(l2, this.f.size());
        l2.f = cloneable;
        ((k)cloneable).addAll((Collection)this.f);
        return l2;
    }

    @Override
    public final q i() {
        this.f.clear();
        return this;
    }

    @Override
    public final List j() {
        if (this.f == q.c) {
            this.f = new k(this, 4);
        }
        return this.f;
    }

    @Override
    public final boolean l() {
        boolean bl = this.g != null;
        return bl;
    }

    @Override
    public String o() {
        return this.d.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void q(Appendable appendable, int n2, g g2) {
        if (this.N(g2)) {
            if (appendable instanceof StringBuilder) {
                if (((StringBuilder)appendable).length() > 0) {
                    q.m(appendable, n2, g2);
                }
            } else {
                q.m(appendable, n2, g2);
            }
        }
        Object object = appendable.append('<');
        E e2 = this.d;
        object.append(e2.a);
        object = this.g;
        if (object != null) {
            ((c)object).f(appendable, g2);
        }
        if (this.f.isEmpty()) {
            boolean bl = e2.e;
            n2 = !bl && !e2.f ? 0 : 1;
            if (n2 != 0) {
                if (g2.h == 1 && bl) {
                    appendable.append('>');
                    return;
                }
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override
    public void r(Appendable appendable, int n2, g g2) {
        boolean bl = this.f.isEmpty();
        E e2 = this.d;
        if (!bl || !e2.e && !e2.f) {
            if (g2.e && !this.f.isEmpty() && e2.d) {
                q.m(appendable, n2, g2);
            }
            appendable.append("</").append(e2.a).append('>');
        }
    }

    @Override
    public final q s() {
        return (l)this.a;
    }

    @Override
    public final q w() {
        q q2;
        q q3 = this;
        while ((q2 = q3.a) != null) {
            q3 = q2;
        }
        return q3;
    }

    public final void y(q q2) {
        q q3 = q2.a;
        if (q3 != null) {
            q3.v(q2);
        }
        q2.a = this;
        this.j();
        this.f.add(q2);
        q2.b = this.f.size() - 1;
    }
}

