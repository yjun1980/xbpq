/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.A0.b;
import com.github.catvod.spider.merge.xc.B0.C;
import com.github.catvod.spider.merge.xc.B0.u;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class y
implements u {
    public final Locale a;
    public final int b;
    public final String c;
    public final String d;

    public y(TimeZone timeZone, Locale locale, int n2) {
        this.a = com.github.catvod.spider.merge.xc.A0.b.a(locale);
        this.b = n2;
        this.c = C.c(timeZone, false, n2, locale);
        this.d = C.c(timeZone, true, n2, locale);
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar cloneable) {
        TimeZone timeZone = cloneable.getTimeZone();
        int n2 = cloneable.get(16);
        cloneable = this.a;
        int n3 = this.b;
        if (n2 == 0) {
            stringBuilder.append((CharSequence)C.c(timeZone, false, n3, (Locale)cloneable));
        } else {
            stringBuilder.append((CharSequence)C.c(timeZone, true, n3, (Locale)cloneable));
        }
    }

    @Override
    public final int c() {
        return Math.max(this.c.length(), this.d.length());
    }
}

