/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.N;
import com.github.catvod.spider.merge.Y.x;
import java.util.Calendar;

final class K
implements x {
    static final K a = new K();

    K() {
    }

    @Override
    public final void a(Appendable appendable, int n2) {
        if (n2 < 10) {
            char c2 = (char)(n2 + 48);
            ((StringBuilder)appendable).append(c2);
        } else {
            N.a(appendable, n2);
        }
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final void c(Appendable appendable, Calendar calendar) {
        this.a(appendable, calendar.get(2) + 1);
    }
}

