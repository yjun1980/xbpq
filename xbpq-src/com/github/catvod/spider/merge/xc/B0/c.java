/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.C;
import com.github.catvod.spider.merge.xc.B0.b;
import com.github.catvod.spider.merge.xc.B0.o;
import com.github.catvod.spider.merge.xc.B0.u;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class c
extends Format {
    public static final b c = new b();
    public final C a;
    public final o b;

    public c(String string, TimeZone timeZone, Locale locale) {
        this.a = new C(string, timeZone, locale);
        this.b = new o(string, timeZone, locale);
    }

    public static c a(String string) {
        return (c)c.a(string, null);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.a.equals(((c)object).a);
    }

    @Override
    public final StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition object2) {
        block10: {
            block8: {
                TimeZone timeZone;
                int n2;
                int n3;
                u[] uArray;
                block9: {
                    int n4;
                    block7: {
                        uArray = this.a;
                        uArray.getClass();
                        boolean bl = object instanceof Date;
                        n3 = 0;
                        n4 = 0;
                        n2 = 0;
                        object2 = uArray.c;
                        timeZone = uArray.b;
                        if (!bl) break block7;
                        object = (Date)object;
                        object2 = Calendar.getInstance(timeZone, (Locale)object2);
                        ((Calendar)object2).setTime((Date)object);
                        object = new StringBuilder(uArray.e);
                        uArray = uArray.d;
                        n4 = uArray.length;
                        for (n3 = n2; n3 < n4; ++n3) {
                            uArray[n3].a((StringBuilder)object, (Calendar)object2);
                        }
                        object = ((StringBuilder)object).toString();
                        break block8;
                    }
                    if (!(object instanceof Calendar)) break block9;
                    object2 = (Calendar)object;
                    StringBuilder stringBuilder = new StringBuilder(uArray.e);
                    object = object2;
                    if (!((Calendar)object2).getTimeZone().equals(timeZone)) {
                        object = (Calendar)((Calendar)object2).clone();
                        ((Calendar)object).setTimeZone(timeZone);
                    }
                    object2 = uArray.d;
                    n4 = ((u[])object2).length;
                    while (n3 < n4) {
                        object2[n3].a(stringBuilder, (Calendar)object);
                        ++n3;
                    }
                    object = stringBuilder.toString();
                    break block8;
                }
                if (!(object instanceof Long)) break block10;
                long l2 = (Long)object;
                object = Calendar.getInstance(timeZone, (Locale)object2);
                ((Calendar)object).setTimeInMillis(l2);
                object2 = new StringBuilder(uArray.e);
                uArray = uArray.d;
                n2 = uArray.length;
                for (n3 = n4; n3 < n2; ++n3) {
                    uArray[n3].a((StringBuilder)object2, (Calendar)object);
                }
                object = ((StringBuilder)object2).toString();
            }
            stringBuffer.append((String)object);
            return stringBuffer;
        }
        object = object == null ? "<null>" : object.getClass().getName();
        object = new IllegalArgumentException("Unknown class: ".concat((String)object));
        throw object;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final Object parseObject(String object, ParsePosition parsePosition) {
        o o2 = this.b;
        Calendar calendar = Calendar.getInstance(o2.b, o2.c);
        calendar.clear();
        object = o2.b((String)object, parsePosition, calendar) ? calendar.getTime() : null;
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FastDateFormat[");
        C c2 = this.a;
        stringBuilder.append(c2.a);
        stringBuilder.append(",");
        stringBuilder.append(c2.c);
        stringBuilder.append(",");
        stringBuilder.append(c2.b.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

