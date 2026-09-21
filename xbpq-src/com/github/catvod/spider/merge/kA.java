/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.Locale;

public final class kA {
    public static String S(String string) {
        return kA.l8(string).trim();
    }

    public static String T4(String string, boolean bl) {
        string = bl ? kA.l8(string) : kA.S(string);
        return string;
    }

    public static String l8(String string) {
        string = string != null ? string.toLowerCase(Locale.ENGLISH) : "";
        return string;
    }
}

