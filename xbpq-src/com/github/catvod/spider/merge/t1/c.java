/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.t1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.b.a;
import com.github.catvod.spider.merge.s1.b;

public final class c
extends a {
    private static final c a = new c();

    private c() {
    }

    public static c i() {
        return a;
    }

    @Override
    public final String c(String string) {
        if (b.e(string)) {
            return string.split("bandcamp.com/\\?show=")[1];
        }
        return this.e(string);
    }

    @Override
    public final String e(String string) {
        if (string.matches("\\d+")) {
            return e.c("https://bandcamp.com/?show=", string);
        }
        return p.p(string);
    }

    @Override
    public final boolean h(String string) {
        if (b.e(string)) {
            return true;
        }
        if (!string.toLowerCase().matches("https?://.+\\..+/track/.+")) {
            return false;
        }
        return b.d(string);
    }
}

