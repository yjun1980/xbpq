/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class \u02e1 {
    private static final ConcurrentMap<String, List<Locale>> \u037f = new ConcurrentHashMap<String, List<Locale>>();
    private static final ConcurrentMap<String, List<Locale>> \u0528 = new ConcurrentHashMap<String, List<Locale>>();

    public static Locale \u037f(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return locale;
    }
}

