/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.x;
import java.util.Calendar;

final class F
implements x {
    private final x a;

    F(x x2) {
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
        int n2;
        int n3 = n2 = calendar.get(10);
        if (n2 == 0) {
            n3 = calendar.getLeastMaximum(10) + 1;
        }
        this.a.a(appendable, n3);
    }
}

