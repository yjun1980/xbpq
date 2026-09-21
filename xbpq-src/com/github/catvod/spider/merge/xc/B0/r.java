/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.C;
import com.github.catvod.spider.merge.xc.B0.u;
import java.util.Calendar;

public final class r
implements u {
    public static final r b = new r(3);
    public static final r c = new r(5);
    public static final r d = new r(6);
    public final int a;

    public r(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar calendar) {
        int n2 = calendar.get(15);
        n2 = calendar.get(16) + n2;
        if (n2 == 0) {
            stringBuilder.append((CharSequence)"Z");
            return;
        }
        if (n2 < 0) {
            stringBuilder.append('-');
            n2 = -n2;
        } else {
            stringBuilder.append('+');
        }
        int n3 = n2 / 3600000;
        C.a(stringBuilder, n3);
        int n4 = this.a;
        if (n4 < 5) {
            return;
        }
        if (n4 == 6) {
            stringBuilder.append(':');
        }
        C.a(stringBuilder, n2 / 60000 - n3 * 60);
    }

    @Override
    public final int c() {
        return this.a;
    }
}

