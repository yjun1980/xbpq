package com.github.catvod.spider.merge.Y;

import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
final class C {
    private final TimeZone a;
    private final int b;
    private final Locale c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.a = timeZone;
        if (z) {
            this.b = Integer.MIN_VALUE | i;
        } else {
            this.b = i;
        }
        this.c = com.github.catvod.spider.merge.U.c.a(locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return this.a.equals(c.a) && this.b == c.b && this.c.equals(c.c);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.c.hashCode() + (this.b * 31)) * 31);
    }
}
