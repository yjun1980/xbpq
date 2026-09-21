/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.c0.u;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.O;

final class j
implements O {
    final StringBuilder a;

    j(StringBuilder stringBuilder) {
        this.a = stringBuilder;
    }

    @Override
    public final void a(r r2, int n2) {
        if (r2 instanceof u) {
            r2 = (u)r2;
            l.I(this.a, (u)r2);
        } else if (r2 instanceof l) {
            r2 = (l)r2;
            if (this.a.length() > 0 && (((l)r2).a0() || l.J((l)r2).b().equals(cYh.d("0522"))) && !u.M(this.a)) {
                this.a.append(' ');
            }
        }
    }

    @Override
    public final void b(r r2, int n2) {
        if (r2 instanceof l && ((l)r2).a0() && r2.s() instanceof u && !u.M(this.a)) {
            this.a.append(' ');
        }
    }
}

