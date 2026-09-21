/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.N;
import com.github.catvod.spider.merge.Y.x;
import java.util.Calendar;

final class y
implements x {
    private final int a;
    private final int b;

    y(int n2, int n3) {
        if (n3 >= 3) {
            this.a = n2;
            this.b = n3;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void a(Appendable appendable, int n2) {
        N.b(appendable, n2, this.b);
    }

    @Override
    public final int b() {
        return this.b;
    }

    @Override
    public final void c(Appendable appendable, Calendar calendar) {
        this.a(appendable, calendar.get(this.a));
    }
}

