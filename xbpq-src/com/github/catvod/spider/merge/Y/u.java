/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.z;
import java.util.Calendar;

final class u
implements z {
    private final char a;

    u(char c2) {
        this.a = c2;
    }

    @Override
    public final int b() {
        return 1;
    }

    @Override
    public final void c(Appendable appendable, Calendar calendar) {
        char c2 = this.a;
        ((StringBuilder)appendable).append(c2);
    }
}

