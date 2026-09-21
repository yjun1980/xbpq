/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.A0;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public abstract class b {
    public static final int a = 0;

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

