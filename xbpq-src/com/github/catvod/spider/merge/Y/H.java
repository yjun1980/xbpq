/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.N;
import com.github.catvod.spider.merge.Y.x;
import java.util.Calendar;

final class H
implements x {
    static final H a = new H();

    H() {
    }

    @Override
    public final void a(Appendable appendable, int n2) {
        N.a(appendable, n2);
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final void c(Appendable appendable, Calendar calendar) {
        N.a(appendable, calendar.get(2) + 1);
    }
}

