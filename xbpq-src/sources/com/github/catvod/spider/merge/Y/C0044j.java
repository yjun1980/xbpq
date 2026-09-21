package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.Y.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044j extends AbstractC0048n {
    private final int b;
    final Locale c;
    private final Map<String, Integer> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0044j(int i, Calendar calendar, Locale locale) {
        this.b = i;
        this.c = com.github.catvod.spider.merge.U.c.a(locale);
        StringBuilder b = C0059d.b(cYh.d("4F787E382273"));
        this.d = (HashMap) t.c(calendar, locale, i, b);
        b.setLength(b.length() - 1);
        b.append(cYh.d("4E"));
        this.a = Pattern.compile(b.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Override // com.github.catvod.spider.merge.Y.AbstractC0048n
    final void c(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.c);
        Integer num = (Integer) this.d.get(lowerCase);
        if (num == null) {
            num = (Integer) this.d.get(lowerCase + '.');
        }
        calendar.set(this.b, num.intValue());
    }

    @Override // com.github.catvod.spider.merge.Y.AbstractC0048n
    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("243132341E3414352F223E2E0E262405322213033523362E023738710C3C0E352D356A"));
        b.append(this.b);
        b.append(cYh.d("4B702D3E343B0B357C"));
        b.append(this.c);
        b.append(cYh.d("4B702D1A322331312D2432295A"));
        b.append(this.d);
        b.append(cYh.d("4B703130232E02222F6C"));
        b.append(this.a);
        b.append(cYh.d("3A"));
        return b.toString();
    }
}
