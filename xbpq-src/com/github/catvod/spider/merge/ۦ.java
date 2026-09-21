/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.Locale;

public final class \u06e6 {
    public static String \u037f(String string) {
        string = string != null ? string.toLowerCase(Locale.ENGLISH) : "";
        return string;
    }

    public static String \u0528(String string) {
        return \u06e6.\u037f(string).trim();
    }

    public static String \u0529(String string, boolean bl) {
        string = bl ? \u06e6.\u037f(string) : \u06e6.\u0528(string);
        return string;
    }
}

