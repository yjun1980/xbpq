/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.A0.b;
import com.github.catvod.spider.merge.xc.B0.D;
import com.github.catvod.spider.merge.xc.B0.j;
import com.github.catvod.spider.merge.xc.B0.m;
import com.github.catvod.spider.merge.xc.B0.o;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

public final class n
extends j {
    public final Locale b;
    public final HashMap c = new HashMap();

    /*
     * WARNING - void declaration
     */
    public n(Locale object) {
        this.b = com.github.catvod.spider.merge.xc.A0.b.a((Locale)((Object)object));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet<String> treeSet = new TreeSet<String>(o.h);
        for (String[] stringArray : DateFormatSymbols.getInstance((Locale)((Object)object)).getZoneStrings()) {
            m m2;
            String string = stringArray[0];
            if (string.equalsIgnoreCase("GMT")) continue;
            TimeZone timeZone = TimeZone.getTimeZone(string);
            m m3 = m2 = new m(timeZone, false);
            for (int i2 = 1; i2 < stringArray.length; ++i2) {
                void var5_11;
                if (i2 != 3) {
                    if (i2 == 5) {
                        m m4 = m2;
                    }
                } else {
                    m m5 = new m(timeZone, true);
                }
                String string2 = stringArray[i2];
                if (string2 == null || !treeSet.add(string2 = string2.toLowerCase((Locale)((Object)object)))) continue;
                this.c.put(string2, var5_11);
            }
        }
        for (String string : treeSet) {
            stringBuilder.append('|');
            o.c(stringBuilder, string);
        }
        stringBuilder.append(")");
        this.a = Pattern.compile(stringBuilder.toString());
    }

    @Override
    public final void c(Calendar calendar, String object) {
        Object object2 = D.a((String)object);
        if (object2 != null) {
            calendar.setTimeZone((TimeZone)object2);
        } else {
            String string = ((String)object).toLowerCase(this.b);
            HashMap hashMap = this.c;
            object = object2 = (m)hashMap.get(string);
            if (object2 == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append('.');
                object = (m)hashMap.get(((StringBuilder)object).toString());
            }
            calendar.set(16, ((m)object).b);
            calendar.set(15, ((m)object).a.getRawOffset());
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TimeZoneStrategy [locale=");
        stringBuilder.append(this.b);
        stringBuilder.append(", tzNames=");
        stringBuilder.append(this.c);
        stringBuilder.append(", pattern=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

