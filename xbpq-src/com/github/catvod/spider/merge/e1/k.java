/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.e1.v;
import com.github.catvod.spider.merge.g1.O;

final class k
implements O {
    final StringBuilder a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    k(StringBuilder stringBuilder) {
        this.a = stringBuilder;
    }

    @Override
    public final void a(s s2, int n2) {
        if (s2 instanceof v) {
            s2 = (v)s2;
            m.I(this.a, (v)s2);
        } else if (s2 instanceof m) {
            s2 = (m)s2;
            if (this.a.length() > 0 && (((m)s2).e0() || m.J((m)s2).j().equals("br")) && !v.M(this.a)) {
                this.a.append(' ');
            }
        }
    }

    @Override
    public final void b(s s2, int n2) {
        if (s2 instanceof m && ((m)s2).e0() && s2.r() instanceof v && !v.M(this.a)) {
            this.a.append(' ');
        }
    }
}

