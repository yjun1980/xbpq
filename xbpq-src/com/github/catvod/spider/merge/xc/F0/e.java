/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.p;
import com.github.catvod.spider.merge.xc.F0.q;

public final class e
extends p {
    public e(String string) {
        this.d = string;
    }

    @Override
    public final Object clone() {
        return (e)super.g();
    }

    @Override
    public final q g() {
        return (e)super.g();
    }

    @Override
    public final String o() {
        return "#comment";
    }

    @Override
    public final void q(Appendable appendable, int n2, g g2) {
        q q2;
        if (g2.e && this.b == 0 && (q2 = this.a) instanceof l && ((l)q2).d.d) {
            q.m(appendable, n2, g2);
        }
        appendable.append("<!--").append(this.y()).append("-->");
    }

    @Override
    public final void r(Appendable appendable, int n2, g g2) {
    }

    @Override
    public final String toString() {
        return this.p();
    }
}

