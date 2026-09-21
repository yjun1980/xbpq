package com.github.catvod.spider.merge.Y;

import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.github.catvod.spider.merge.Y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0036b {
    private final ConcurrentMap<P, C0037c> a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.Y.P, com.github.catvod.spider.merge.Y.c>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.Y.P, com.github.catvod.spider.merge.Y.c>, java.util.concurrent.ConcurrentHashMap] */
    public final Format a(String str, Locale locale) {
        com.github.catvod.spider.merge.U.j.a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale a = com.github.catvod.spider.merge.U.c.a(locale);
        P p = new P(str, timeZone, a);
        Format format = (Format) this.a.get(p);
        if (format != null) {
            return format;
        }
        C0037c c0037c = new C0037c(str, timeZone, a);
        Format format2 = (Format) this.a.putIfAbsent(p, c0037c);
        return format2 != null ? format2 : c0037c;
    }
}
