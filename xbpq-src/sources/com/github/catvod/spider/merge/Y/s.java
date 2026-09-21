package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends AbstractC0048n {
    private final Locale b;
    private final Map<String, r> c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Y.r>] */
    public s(Locale locale) {
        Comparator comparator;
        this.b = com.github.catvod.spider.merge.U.c.a(locale);
        StringBuilder b = C0059d.b(cYh.d("4F787E3822733C7B6C0C0B3E1C643C2D1017330B6A7C0A06032B707D65275D0C252A6527"));
        comparator = t.j;
        TreeSet treeSet = new TreeSet(comparator);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase(cYh.d("201D15"))) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                r rVar = new r(timeZone, false);
                r rVar2 = rVar;
                for (int i = 1; i < strArr.length; i++) {
                    if (i == 3) {
                        rVar2 = new r(timeZone, true);
                    } else if (i == 5) {
                        rVar2 = rVar;
                    }
                    if (strArr[i] != null) {
                        String lowerCase = strArr[i].toLowerCase(locale);
                        if (treeSet.add(lowerCase)) {
                            this.c.put(lowerCase, rVar2);
                        }
                    }
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            b.append('|');
            t.f(b, str2);
        }
        b.append(cYh.d("4E"));
        this.a = Pattern.compile(b.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Y.r>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Y.r>] */
    @Override // com.github.catvod.spider.merge.Y.AbstractC0048n
    final void c(Calendar calendar, String str) {
        TimeZone a = O.a(str);
        if (a != null) {
            calendar.setTimeZone(a);
            return;
        }
        String lowerCase = str.toLowerCase(this.b);
        r rVar = (r) this.c.get(lowerCase);
        if (rVar == null) {
            rVar = (r) this.c.get(lowerCase + '.');
        }
        calendar.set(16, rVar.b);
        calendar.set(15, rVar.a.getRawOffset());
    }

    @Override // com.github.catvod.spider.merge.Y.AbstractC0048n
    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("33392C340D3509351225253B1335262877010B3F22303B3F5A"));
        b.append(this.b);
        b.append(cYh.d("4B70352B193B0A35326C"));
        b.append(this.c);
        b.append(cYh.d("4B703130232E02222F6C"));
        b.append(this.a);
        b.append(cYh.d("3A"));
        return b.toString();
    }
}
