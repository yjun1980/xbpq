/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.Em.c;

public final class D {
    public static final D c = new D(false, false);
    public static final D d = new D(true, true);
    private final boolean a;
    private final boolean b;

    public D(boolean bl, boolean bl2) {
        this.a = bl;
        this.b = bl2;
    }

    public final String a(String string) {
        String string2;
        string = string2 = string.trim();
        if (!this.b) {
            string = s.c(string2);
        }
        return string;
    }

    final c b(c c2) {
        if (c2 != null && !this.b) {
            c2.r();
        }
        return c2;
    }

    public final String c(String string) {
        String string2;
        string = string2 = string.trim();
        if (!this.a) {
            string = s.c(string2);
        }
        return string;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.a;
    }
}

