/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u06e6;
import com.github.catvod.spider.merge.\u0f8b;

public class \u097d {
    public static final \u097d \u037f = new \u097d(false, false);
    public static final \u097d \u0528 = new \u097d(true, true);
    private final boolean \u0529;
    private final boolean \u052a;

    public \u097d(boolean bl, boolean bl2) {
        this.\u0529 = bl;
        this.\u052a = bl2;
    }

    public String \u037f(String string) {
        String string2;
        string = string2 = string.trim();
        if (!this.\u052a) {
            string = \u06e6.\u037f(string2);
        }
        return string;
    }

    \u0f8b \u0528(\u0f8b \u0f8b2) {
        if (\u0f8b2 != null && !this.\u052a) {
            \u0f8b2.\u0789();
        }
        return \u0f8b2;
    }

    public String \u0529(String string) {
        String string2;
        string = string2 = string.trim();
        if (!this.\u0529) {
            string = \u06e6.\u037f(string2);
        }
        return string;
    }

    public boolean \u052a() {
        return this.\u052a;
    }

    public boolean \u052b() {
        return this.\u0529;
    }
}

