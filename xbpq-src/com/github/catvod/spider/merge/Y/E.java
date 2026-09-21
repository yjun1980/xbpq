/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.N;
import com.github.catvod.spider.merge.Y.z;
import java.util.Calendar;

final class E
implements z {
    static final E b = new E(true);
    static final E c = new E(false);
    final boolean a;

    E(boolean bl) {
        this.a = bl;
    }

    @Override
    public final int b() {
        return 5;
    }

    @Override
    public final void c(Appendable appendable, Calendar calendar) {
        int n2 = calendar.get(15);
        n2 = calendar.get(16) + n2;
        if (n2 < 0) {
            ((StringBuilder)appendable).append('-');
            n2 = -n2;
        } else {
            ((StringBuilder)appendable).append('+');
        }
        int n3 = n2 / 3600000;
        N.a(appendable, n3);
        if (this.a) {
            ((StringBuilder)appendable).append(':');
        }
        N.a(appendable, n2 / 60000 - n3 * 60);
    }
}

