/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public final class c {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static Locale a(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return locale;
    }
}

