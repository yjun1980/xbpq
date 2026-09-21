/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.U.c;
import com.github.catvod.spider.merge.Y.N;
import com.github.catvod.spider.merge.Y.z;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

final class D
implements z {
    private final Locale a;
    private final int b;
    private final String c;
    private final String d;

    D(TimeZone timeZone, Locale locale, int n2) {
        this.a = com.github.catvod.spider.merge.U.c.a(locale);
        this.b = n2;
        this.c = N.h(timeZone, false, n2, locale);
        this.d = N.h(timeZone, true, n2, locale);
    }

    @Override
    public final int b() {
        return Math.max(this.c.length(), this.d.length());
    }

    @Override
    public final void c(Appendable appendable, Calendar object) {
        TimeZone timeZone = ((Calendar)object).getTimeZone();
        boolean bl = ((Calendar)object).get(16) != 0;
        object = N.h(timeZone, bl, this.b, this.a);
        ((StringBuilder)appendable).append((CharSequence)object);
    }
}

