/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.U.c;
import java.util.Locale;
import java.util.TimeZone;

final class C {
    private final TimeZone a;
    private final int b;
    private final Locale c;

    C(TimeZone timeZone, boolean bl, int n2, Locale locale) {
        this.a = timeZone;
        this.b = bl ? Integer.MIN_VALUE | n2 : n2;
        this.c = com.github.catvod.spider.merge.U.c.a(locale);
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object instanceof C) {
            object = (C)object;
            if (!this.a.equals(((C)object).a) || this.b != ((C)object).b || !this.c.equals(((C)object).c)) {
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

