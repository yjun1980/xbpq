/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.q;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.e1.t;
import com.github.catvod.spider.merge.e1.w;
import com.github.catvod.spider.merge.f1.F;
import java.util.AbstractCollection;

public final class e
extends q {
    public e(String string) {
        this.d = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean M(String string) {
        int n2 = string.length();
        boolean bl = true;
        if (n2 <= 1) return false;
        boolean bl2 = bl;
        if (string.startsWith("!")) return bl2;
        if (!string.startsWith("?")) return false;
        return bl;
    }

    public final w K() {
        String string = this.I();
        Object object = string.substring(1, string.length() - 1);
        boolean bl = e.M((String)object);
        w w2 = null;
        if (bl) {
            return null;
        }
        Object object2 = com.github.catvod.spider.merge.I.s.a("<", (String)object, ">");
        object = F.b();
        ((F)object).h();
        object = ((F)object).f((String)object2, super.e());
        if (((AbstractCollection)((h)object).v0().T()).size() > 0) {
            object2 = ((h)object).v0().S().get(0);
            w2 = new w(t.a((s)object).g().d(((m)object2).r0()), string.startsWith("!"));
            w2.d().g(((m)object2).d());
        }
        return w2;
    }

    public final boolean L() {
        return e.M(this.I());
    }

    @Override
    public final Object clone() {
        return (e)super.i();
    }

    @Override
    public final s i() {
        return (e)super.i();
    }

    @Override
    public final s l() {
        return this;
    }

    @Override
    public final String s() {
        return "#comment";
    }

    @Override
    public final String toString() {
        return this.t();
    }

    @Override
    final void v(Appendable appendable, int n2, g g2) {
        s s2;
        if (g2.i() && this.b == 0 && (s2 = this.a) instanceof m && ((m)s2).q0().a()) {
            this.q(appendable, n2, g2);
        }
        appendable.append("<!--").append(this.I()).append("-->");
    }

    @Override
    final void w(Appendable appendable, int n2, g g2) {
    }
}

