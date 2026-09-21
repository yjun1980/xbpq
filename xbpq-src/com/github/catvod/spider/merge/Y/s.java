/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.U.c;
import com.github.catvod.spider.merge.Y.O;
import com.github.catvod.spider.merge.Y.n;
import com.github.catvod.spider.merge.Y.r;
import com.github.catvod.spider.merge.Y.t;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

final class s
extends n {
    private final Locale b;
    private final Map<String, r> c = new HashMap<String, r>();

    s(Locale object3) {
        this.b = com.github.catvod.spider.merge.U.c.a((Locale)object3);
        StringBuilder stringBuilder = d.b(cYh.d("4F787E3822733C7B6C0C0B3E1C643C2D1017330B6A7C0A06032B707D65275D0C252A6527"));
        TreeSet<String> treeSet = new TreeSet<String>(t.e());
        for (String[] stringArray : DateFormatSymbols.getInstance((Locale)object3).getZoneStrings()) {
            Object object = stringArray[0];
            if (((String)object).equalsIgnoreCase(cYh.d("201D15"))) continue;
            TimeZone timeZone = TimeZone.getTimeZone((String)object);
            r r2 = new r(timeZone, false);
            object = r2;
            for (int i2 = 1; i2 < stringArray.length; ++i2) {
                String string;
                if (i2 != 3) {
                    if (i2 == 5) {
                        object = r2;
                    }
                } else {
                    object = new r(timeZone, true);
                }
                if (stringArray[i2] == null || !treeSet.add(string = stringArray[i2].toLowerCase((Locale)object3))) continue;
                ((HashMap)this.c).put(string, (r)object);
            }
        }
        for (String string : treeSet) {
            stringBuilder.append('|');
            t.f(stringBuilder, string);
        }
        stringBuilder.append(cYh.d("4E"));
        this.a = Pattern.compile(stringBuilder.toString());
    }

    @Override
    final void c(Calendar calendar, String object) {
        Object object2 = O.a((String)object);
        if (object2 != null) {
            calendar.setTimeZone((TimeZone)object2);
        } else {
            String string = ((String)object).toLowerCase(this.b);
            object2 = (r)((HashMap)this.c).get(string);
            object = object2;
            if (object2 == null) {
                object2 = this.c;
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append('.');
                object = (r)((HashMap)object2).get(((StringBuilder)object).toString());
            }
            calendar.set(16, ((r)object).b);
            calendar.set(15, ((r)object).a.getRawOffset());
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = d.b(cYh.d("33392C340D3509351225253B1335262877010B3F22303B3F5A"));
        stringBuilder.append(this.b);
        stringBuilder.append(cYh.d("4B70352B193B0A35326C"));
        stringBuilder.append(this.c);
        stringBuilder.append(cYh.d("4B703130232E02222F6C"));
        stringBuilder.append(this.a);
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

