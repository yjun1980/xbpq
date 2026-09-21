/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.C;
import com.github.catvod.spider.merge.xc.B0.s;
import java.util.Calendar;

public final class t
implements s {
    public final int a;
    public final int b;

    public t(int n2, int n3) {
        if (n3 >= 3) {
            this.a = n2;
            this.b = n3;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar calendar) {
        this.b(stringBuilder, calendar.get(this.a));
    }

    @Override
    public final void b(StringBuilder stringBuilder, int n2) {
        C.b(stringBuilder, n2, this.b);
    }

    @Override
    public final int c() {
        return this.b;
    }
}

