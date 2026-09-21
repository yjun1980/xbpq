/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.U.c;
import com.github.catvod.spider.merge.Y.n;
import com.github.catvod.spider.merge.Y.t;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

final class j
extends n {
    private final int b;
    final Locale c;
    private final Map<String, Integer> d;

    j(int n2, Calendar calendar, Locale locale) {
        this.b = n2;
        this.c = com.github.catvod.spider.merge.U.c.a(locale);
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("4F787E382273"));
        this.d = (HashMap)t.c(calendar, locale, n2, stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append(cYh.d("4E"));
        this.a = Pattern.compile(stringBuilder.toString());
    }

    @Override
    final void c(Calendar calendar, String object) {
        String string = ((String)object).toLowerCase(this.c);
        Comparable<Integer> comparable = (Integer)((HashMap)this.d).get(string);
        object = comparable;
        if (comparable == null) {
            object = this.d;
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(string);
            ((StringBuilder)comparable).append('.');
            object = (Integer)((HashMap)object).get(((StringBuilder)comparable).toString());
        }
        calendar.set(this.b, (Integer)object);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("243132341E3414352F223E2E0E262405322213033523362E023738710C3C0E352D356A"));
        stringBuilder.append(this.b);
        stringBuilder.append(cYh.d("4B702D3E343B0B357C"));
        stringBuilder.append(this.c);
        stringBuilder.append(cYh.d("4B702D1A322331312D2432295A"));
        stringBuilder.append(this.d);
        stringBuilder.append(cYh.d("4B703130232E02222F6C"));
        stringBuilder.append(this.a);
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

