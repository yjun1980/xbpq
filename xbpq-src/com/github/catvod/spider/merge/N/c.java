/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.R0.e;

public final class c
extends Enum<c> {
    private static final c[] d;
    private String a;
    private Integer b;
    private Integer c;

    static {
        Integer n2 = 400;
        c c2 = new c("NORMAL", n2, 8);
        Integer n3 = 6;
        d = new c[]{c2, new c("SUPER_VIP", n2, n3), new c("VIP", n2, n3), new c("Z_VIP", n2, n3), new c("MINI_VIP", n2, n3)};
    }

    private c(String string2, Integer n3, Integer n4) {
        this.a = string2;
        this.b = n3;
        this.c = n4;
    }

    public static Integer b() {
        for (c c2 : com.github.catvod.spider.merge.N.c.values()) {
            if (!e.a("", c2.a)) continue;
            return c2.b;
        }
        return 400;
    }

    public static Integer e(String string) {
        for (c c2 : com.github.catvod.spider.merge.N.c.values()) {
            if (!e.a(string, c2.a)) continue;
            return c2.c;
        }
        return 6;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])d.clone();
    }
}

