/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.A0.b;
import java.util.Locale;
import java.util.TimeZone;

public final class x {
    public final TimeZone a;
    public final int b;
    public final Locale c;

    public x(TimeZone timeZone, boolean bl, int n2, Locale locale) {
        this.a = timeZone;
        this.b = bl ? Integer.MIN_VALUE | n2 : n2;
        this.c = com.github.catvod.spider.merge.xc.A0.b.a(locale);
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object instanceof x) {
            x x2 = (x)object;
            object = x2.a;
            if (!this.a.equals(object) || this.b != x2.b || !this.c.equals(x2.c)) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.b;
        int n3 = this.c.hashCode();
        return this.a.hashCode() + (n3 + n2 * 31) * 31;
    }
}

