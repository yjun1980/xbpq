/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.HR.t;
import com.github.catvod.spider.merge.UY.h;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;

public final class r
extends t {
    public final h b;

    public r(n n2) {
        this.a = n2;
        this.b = new h(n2);
    }

    @Override
    public final boolean a(l q2, l l2) {
        for (int i2 = 0; i2 < l2.f.size(); ++i2) {
            q2 = (q)l2.j().get(i2);
            if (!(q2 instanceof l) || this.b.e(l2, (l)q2) == null) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}

