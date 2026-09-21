/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.A0.b;
import com.github.catvod.spider.merge.xc.B0.j;
import com.github.catvod.spider.merge.xc.B0.o;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;

public final class f
extends j {
    public final int b;
    public final Locale c;
    public final HashMap d;

    public f(int n2, Calendar object, Locale locale) {
        this.b = n2;
        this.c = com.github.catvod.spider.merge.xc.A0.b.a(locale);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("((?iu)");
        HashMap hashMap = new HashMap();
        locale = com.github.catvod.spider.merge.xc.A0.b.a(locale);
        Map<String, Integer> map = ((Calendar)object).getDisplayNames(n2, 0, locale);
        object = new TreeSet(o.h);
        for (Map.Entry entry : map.entrySet()) {
            String string = ((String)entry.getKey()).toLowerCase(locale);
            if (!((TreeSet)object).add(string)) continue;
            hashMap.put(string, entry.getValue());
        }
        object = ((TreeSet)object).iterator();
        while (object.hasNext()) {
            o.c(stringBuilder, (String)object.next());
            stringBuilder.append('|');
        }
        this.d = hashMap;
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append(")");
        this.a = Pattern.compile(stringBuilder.toString());
    }

    @Override
    public final void c(Calendar calendar, String object) {
        String string = ((String)object).toLowerCase(this.c);
        HashMap hashMap = this.d;
        Integer n2 = (Integer)hashMap.get(string);
        object = n2;
        if (n2 == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append('.');
            object = (Integer)hashMap.get(((StringBuilder)object).toString());
        }
        calendar.set(this.b, (Integer)object);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CaseInsensitiveTextStrategy [field=");
        stringBuilder.append(this.b);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lKeyValues=");
        stringBuilder.append(this.d);
        stringBuilder.append(", pattern=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

