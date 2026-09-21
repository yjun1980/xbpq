/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.q;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.e1.t;
import com.github.catvod.spider.merge.e1.w;
import com.github.catvod.spider.merge.f1.E;
import com.github.catvod.spider.merge.f1.F;
import com.github.catvod.spider.merge.f1.G;
import com.github.catvod.spider.merge.g1.L;
import java.nio.charset.Charset;
import java.util.AbstractCollection;

public final class h
extends m {
    private static final L n = new L("title");
    private g j = new g();
    private F k = F.b();
    private int l = 1;
    private boolean m = false;

    public h(String string) {
        super(G.m("#root", E.c), string, null);
    }

    private m A0() {
        for (m m2 : this.S()) {
            if (!m2.g0().equals("html")) continue;
            return m2;
        }
        return this.M("html");
    }

    public final g B0() {
        return this.j;
    }

    public final h C0(F f2) {
        this.k = f2;
        return this;
    }

    public final F D0() {
        return this.k;
    }

    public final h E0() {
        this.l = 2;
        return this;
    }

    public final int F0() {
        return this.l;
    }

    public final h G0() {
        h h2 = new h(this.e());
        c c2 = this.g;
        if (c2 != null) {
            h2.g = c2.m();
        }
        h2.j = this.j.c();
        return h2;
    }

    public final String H0() {
        Object object = this.z0();
        object = (object = com.github.catvod.spider.merge.g1.c.b(n, (m)object)) != null ? com.github.catvod.spider.merge.d1.c.g(((m)object).s0()).trim() : "";
        return object;
    }

    @Override
    public final String s() {
        return "#document";
    }

    @Override
    public final String t() {
        return this.b0();
    }

    public final m v0() {
        m m2 = this.A0();
        for (m m3 : m2.S()) {
            if (!"body".equals(m3.g0()) && !"frameset".equals(m3.g0())) continue;
            return m3;
        }
        return m2.M("body");
    }

    public final Charset w0() {
        return this.j.b();
    }

    public final void x0(Charset object) {
        block3: {
            block7: {
                block5: {
                    block6: {
                        int n2;
                        block4: {
                            this.m = true;
                            this.j.a((Charset)object);
                            if (!this.m) break block3;
                            n2 = this.j.j();
                            if (n2 != 1) break block4;
                            object = this.n0("meta[charset]");
                            if (object == null) {
                                object = this.z0().M("meta");
                            }
                            ((m)object).P("charset", this.w0().displayName());
                            object = ((AbstractCollection)this.m0("meta[name=charset]")).iterator();
                            while (object.hasNext()) {
                                ((m)object.next()).B();
                            }
                            break block3;
                        }
                        if (n2 != 2) break block3;
                        object = this.m().get(0);
                        if (!(object instanceof w)) break block5;
                        if (!((q)(object = (w)object)).I().equals("xml")) break block6;
                        ((q)object).H("encoding", this.w0().displayName());
                        if (((q)object).n("version")) {
                            ((q)object).H("version", "1.0");
                        }
                        break block3;
                    }
                    object = new w("xml", false);
                    break block7;
                }
                object = new w("xml", false);
            }
            ((q)object).H("version", "1.0");
            ((q)object).H("encoding", this.w0().displayName());
            this.j0((s)object);
        }
    }

    public final h y0() {
        h h2 = (h)super.U();
        h2.j = this.j.c();
        return h2;
    }

    public final m z0() {
        m m22;
        m m3 = this.A0();
        for (m m22 : m3.S()) {
            if (!m22.g0().equals("head")) continue;
            return m22;
        }
        m22 = new m(G.m("head", t.a(m3).g()), m3.e(), null);
        m3.j0(m22);
        return m22;
    }
}

