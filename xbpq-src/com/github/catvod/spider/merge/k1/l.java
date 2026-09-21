/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.K1.b;
import com.github.catvod.spider.merge.m1.a;
import com.github.catvod.spider.merge.p1.e;

public final class l {
    private static a a;
    private static e b;
    private static com.github.catvod.spider.merge.p1.a c;
    public static final int d = 0;

    public static a a() {
        return a;
    }

    public static com.github.catvod.spider.merge.p1.a b() {
        com.github.catvod.spider.merge.p1.a a2;
        com.github.catvod.spider.merge.p1.a a3 = a2 = c;
        if (a2 == null) {
            a3 = com.github.catvod.spider.merge.p1.a.b;
        }
        return a3;
    }

    public static e c() {
        e e2;
        e e3 = e2 = b;
        if (e2 == null) {
            e3 = e.c;
        }
        return e3;
    }

    public static void d(a a2, e e2) {
        com.github.catvod.spider.merge.p1.a a3 = e2.a().isEmpty() ? com.github.catvod.spider.merge.p1.a.b : new com.github.catvod.spider.merge.p1.a(e2.a());
        com.github.catvod.spider.merge.K1.b.a("Initializing with downloader={}, localization={}, country={}", a2, e2, a3);
        a = a2;
        b = e2;
        c = a3;
    }
}

