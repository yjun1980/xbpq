package com.github.catvod.spider.merge.Y;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class D implements z {
    private final Locale a;
    private final int b;
    private final String c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(TimeZone timeZone, Locale locale, int i) {
        this.a = com.github.catvod.spider.merge.U.c.a(locale);
        this.b = i;
        this.c = N.h(timeZone, false, i, locale);
        this.d = N.h(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return Math.max(this.c.length(), this.d.length());
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) N.h(calendar.getTimeZone(), calendar.get(16) != 0, this.b, this.a));
    }
}
