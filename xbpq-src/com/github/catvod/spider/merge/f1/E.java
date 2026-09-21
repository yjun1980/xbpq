/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.e1.c;

public final class E {
    public static final E c = new E(false, false);
    public static final E d = new E(true, true);
    private final boolean a;
    private final boolean b;

    public E(boolean bl, boolean bl2) {
        this.a = bl;
        this.b = bl2;
    }

    static String a(String string) {
        return com.github.catvod.spider.merge.K1.d.e(string.trim());
    }

    public final String b(String string) {
        String string2;
        string = string2 = string.trim();
        if (!this.b) {
            string = com.github.catvod.spider.merge.K1.d.e(string2);
        }
        return string;
    }

    final c c(c c2) {
        if (c2 != null && !this.b) {
            c2.x();
        }
        return c2;
    }

    public final String d(String string) {
        String string2;
        string = string2 = string.trim();
        if (!this.a) {
            string = com.github.catvod.spider.merge.K1.d.e(string2);
        }
        return string;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.a;
    }
}

