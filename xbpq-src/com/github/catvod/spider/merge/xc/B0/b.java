/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.E;
import com.github.catvod.spider.merge.xc.B0.c;
import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public final class b {
    public final ConcurrentHashMap a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    public final Format a(String object, Locale object2) {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = com.github.catvod.spider.merge.xc.A0.b.a((Locale)object2);
        E e2 = new E(object, timeZone, locale);
        ConcurrentHashMap concurrentHashMap = this.a;
        Format format = (Format)concurrentHashMap.get(e2);
        object2 = format;
        if (format == null && (object = (Format)((Object)concurrentHashMap.putIfAbsent(e2, object2 = new c((String)object, timeZone, locale)))) != null) {
            object2 = object;
        }
        return object2;
    }
}

