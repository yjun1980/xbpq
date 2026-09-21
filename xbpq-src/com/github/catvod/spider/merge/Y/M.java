/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.x;
import java.util.Calendar;

final class M
implements x {
    private final x a;

    M(x x2) {
        this.a = x2;
    }

    @Override
    public final void a(Appendable appendable, int n2) {
        this.a.a(appendable, n2);
    }

    @Override
    public final int b() {
        return this.a.b();
    }

    @Override
    public final void c(Appendable appendable, Calendar calendar) {
        this.a.a(appendable, calendar.getWeekYear());
    }
}

