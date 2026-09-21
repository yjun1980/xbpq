/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.x;
import java.util.Calendar;

final class G
implements x {
    private final x a;

    G(x x2) {
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
        int n3 = n2 = calendar.get(11);
        if (n2 == 0) {
            n3 = calendar.getMaximum(11) + 1;
        }
        this.a.a(appendable, n3);
    }
}

