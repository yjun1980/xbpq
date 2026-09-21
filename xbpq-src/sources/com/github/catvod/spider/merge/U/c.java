package com.github.catvod.spider.merge.U;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static Locale a(Locale locale) {
        return locale != null ? locale : Locale.getDefault();
    }
}
