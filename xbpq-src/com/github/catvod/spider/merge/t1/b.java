/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.t1;

import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.o1.c;
import java.util.List;

public final class b
extends c {
    private static final b a = new b();

    private b() {
    }

    public static b m() {
        return a;
    }

    @Override
    public final String c(String string) {
        return this.e(string);
    }

    @Override
    public final boolean h(String string) {
        if (!string.toLowerCase().matches("https?://.+\\..+/album/.+")) {
            return false;
        }
        return com.github.catvod.spider.merge.s1.b.d(string);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    public final String k(String string, List list) {
        return p.p(string);
    }
}

