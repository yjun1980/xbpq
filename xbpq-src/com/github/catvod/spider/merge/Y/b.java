/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.U.j;
import com.github.catvod.spider.merge.Y.P;
import com.github.catvod.spider.merge.Y.c;
import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class b {
    private final ConcurrentMap<P, c> a = new ConcurrentHashMap<P, c>(7);

    static {
        new ConcurrentHashMap(7);
    }

    b() {
    }

    public final Format a(String object, Locale object2) {
        j.a(object, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = com.github.catvod.spider.merge.U.c.a((Locale)object2);
        P p2 = new P(object, timeZone, locale);
        Format format = (Format)((ConcurrentHashMap)this.a).get(p2);
        object2 = format;
        if (format == null && (object = (Format)((ConcurrentHashMap)this.a).putIfAbsent(p2, (c)((Object)((Locale)(object2 = new c((String)object, timeZone, locale)))))) != null) {
            object2 = object;
        }
        return object2;
    }
}

