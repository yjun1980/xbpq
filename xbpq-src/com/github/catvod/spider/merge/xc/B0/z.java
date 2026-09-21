/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.C;
import com.github.catvod.spider.merge.xc.B0.u;
import java.util.Calendar;

public final class z
implements u {
    public static final z b = new z(true);
    public static final z c = new z(false);
    public final boolean a;

    public z(boolean bl) {
        this.a = bl;
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar calendar) {
        int n2 = calendar.get(15);
        n2 = calendar.get(16) + n2;
        if (n2 < 0) {
            stringBuilder.append('-');
            n2 = -n2;
        } else {
            stringBuilder.append('+');
        }
        int n3 = n2 / 3600000;
        C.a(stringBuilder, n3);
        if (this.a) {
            stringBuilder.append(':');
        }
        C.a(stringBuilder, n2 / 60000 - n3 * 60);
    }

    @Override
    public final int c() {
        return 5;
    }
}

