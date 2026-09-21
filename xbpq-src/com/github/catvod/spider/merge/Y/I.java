/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.N;
import com.github.catvod.spider.merge.Y.x;
import java.util.Calendar;

final class I
implements x {
    private final int a;

    I(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(Appendable appendable, int n2) {
        if (n2 < 100) {
            N.a(appendable, n2);
        } else {
            N.b(appendable, n2, 2);
        }
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final void c(Appendable appendable, Calendar calendar) {
        this.a(appendable, calendar.get(this.a));
    }
}

