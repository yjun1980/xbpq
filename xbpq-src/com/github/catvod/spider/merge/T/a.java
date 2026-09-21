/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T;

import com.github.catvod.spider.merge.R0.e;

public final class a
extends Enum<a> {
    public static final /* enum */ a d;
    private static final a[] e;
    private String a;
    private Integer b;
    private Integer c;

    static {
        a a2;
        Integer n2 = 500;
        d = a2 = new a("NORMAL", n2, 8);
        Integer n3 = 6;
        a a3 = new a("SUPER_VIP", n2, n3);
        n2 = 400;
        e = new a[]{a2, a3, new a("VIP", n2, n3), new a("Z_VIP", n2, n3), new a("MINI_VIP", n2, n3)};
    }

    private a(String string2, Integer n3, Integer n4) {
        this.a = string2;
        this.b = n3;
        this.c = n4;
    }

    public static Integer b(String string) {
        for (a a2 : com.github.catvod.spider.merge.T.a.values()) {
            if (!com.github.catvod.spider.merge.R0.e.a(string, a2.a)) continue;
            return a2.b;
        }
        return 400;
    }

    public static Integer e(String string) {
        for (a a2 : com.github.catvod.spider.merge.T.a.values()) {
            if (!com.github.catvod.spider.merge.R0.e.a(string, a2.a)) continue;
            return a2.c;
        }
        return 6;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])e.clone();
    }
}

