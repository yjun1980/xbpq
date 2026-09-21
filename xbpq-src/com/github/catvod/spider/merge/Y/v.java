/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.x;
import java.util.Calendar;

final class v
implements x {
    private final x a;

    v(x x2) {
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
    public final void c(Appendable appendable, Calendar object) {
        int n2 = 7;
        int n3 = ((Calendar)object).get(7);
        object = this.a;
        if (n3 != 1) {
            n2 = n3 - 1;
        }
        object.a(appendable, n2);
    }
}

