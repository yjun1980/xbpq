/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.c0.g;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.p;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.cYh;

public final class e
extends p {
    public e(String string) {
        this.f = string;
    }

    @Override
    public final Object clone() {
        return (e)super.j();
    }

    @Override
    public final r j() {
        return (e)super.j();
    }

    @Override
    public final r m() {
        return this;
    }

    @Override
    public final String t() {
        return cYh.d("44332E3C3A3F0924");
    }

    @Override
    public final String toString() {
        return this.u();
    }

    @Override
    final void w(Appendable appendable, int n2, g g2) {
        r r2;
        if (g2.f() && this.d == 0 && (r2 = this.c) instanceof l && ((l)r2).m0().a()) {
            this.r(appendable, n2, g2);
        }
        appendable.append(cYh.d("5B716C7C")).append(this.I()).append(cYh.d("4A7D7F"));
    }

    @Override
    final void x(Appendable appendable, int n2, g g2) {
    }
}

