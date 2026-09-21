/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.N;
import com.github.catvod.spider.merge.Y.b;
import com.github.catvod.spider.merge.Y.t;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class c
extends Format {
    private static final b e = new b();
    private final N c;
    private final t d;

    protected c(String string, TimeZone timeZone, Locale locale) {
        this.c = new N(string, timeZone, locale);
        this.d = new t(string, timeZone, locale);
    }

    public static c a() {
        Locale locale = Locale.US;
        return (c)e.a(cYh.d("2215047D773E03700C1C1A7A1E29382877122F6A2C3C6D2914701B"), locale);
    }

    public static c b(String string) {
        return (c)e.a(string, null);
    }

    public final Date c(String string) {
        return this.d.h(string);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.c.equals(((c)object).c);
    }

    @Override
    public final StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.c.d(object));
        return stringBuffer;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public final Object parseObject(String string, ParsePosition parsePosition) {
        return this.d.i(string, parsePosition);
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("21313225133B1335073E253706241A"));
        stringBuilder.append(this.c.f());
        String string = cYh.d("4B");
        stringBuilder.append(string);
        stringBuilder.append(this.c.e());
        stringBuilder.append(string);
        stringBuilder.append(this.c.g().getID());
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

