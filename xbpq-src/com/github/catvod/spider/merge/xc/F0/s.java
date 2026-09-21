/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.h;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.n;
import com.github.catvod.spider.merge.xc.F0.p;
import com.github.catvod.spider.merge.xc.F0.q;

public class s
extends p {
    public s(String string) {
        this.d = string;
    }

    public static boolean B(StringBuilder stringBuilder) {
        boolean bl;
        block3: {
            block2: {
                if (stringBuilder.length() == 0) break block2;
                int n2 = stringBuilder.length();
                bl = true;
                if (stringBuilder.charAt(n2 - 1) == ' ') break block3;
            }
            bl = false;
        }
        return bl;
    }

    public s A() {
        return (s)super.g();
    }

    @Override
    public String o() {
        return "#text";
    }

    @Override
    public void q(Appendable appendable, int n2, g g2) {
        boolean bl = g2.e;
        q q2 = this.a;
        l l2 = q2 instanceof l ? (l)q2 : null;
        boolean bl2 = true;
        boolean bl3 = bl && !l.J(q2);
        if (bl3) {
            bl = this.b == 0 && l2 != null && l2.d.c || this.a instanceof h;
            if (this.n() != null || l2 == null || !l2.d.c) {
                bl2 = false;
            }
            q2 = this.n();
            if ((q2 instanceof l && ((l)q2).N(g2) || q2 instanceof s && com.github.catvod.spider.merge.xc.E0.b.d(((s)q2).y())) && com.github.catvod.spider.merge.xc.E0.b.d(this.y())) {
                return;
            }
            if (this.b == 0 && l2 != null && l2.d.d && !com.github.catvod.spider.merge.xc.E0.b.d(this.y())) {
                q.m(appendable, n2, g2);
            }
        } else {
            bl = false;
            bl2 = false;
        }
        n.b(appendable, this.y(), g2, false, bl3, bl, bl2);
    }

    @Override
    public void r(Appendable appendable, int n2, g g2) {
    }

    @Override
    public final String toString() {
        return this.p();
    }
}

