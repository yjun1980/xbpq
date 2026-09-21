package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.github.catvod.spider.merge.Y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037c extends Format {
    private static final C0036b e = new C0036b();
    private final N c;
    private final t d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0037c(String str, TimeZone timeZone, Locale locale) {
        this.c = new N(str, timeZone, locale);
        this.d = new t(str, timeZone, locale);
    }

    public static C0037c a() {
        return (C0037c) e.a(cYh.d("2215047D773E03700C1C1A7A1E29382877122F6A2C3C6D2914701B"), Locale.US);
    }

    public static C0037c b(String str) {
        return (C0037c) e.a(str, null);
    }

    public final Date c(String str) {
        return this.d.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0037c) {
            return this.c.equals(((C0037c) obj).c);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.c.d(obj));
        return stringBuffer;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.d.i(str, parsePosition);
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("21313225133B1335073E253706241A"));
        b.append(this.c.f());
        String d = cYh.d("4B");
        b.append(d);
        b.append(this.c.e());
        b.append(d);
        b.append(this.c.g().getID());
        b.append(cYh.d("3A"));
        return b.toString();
    }
}
