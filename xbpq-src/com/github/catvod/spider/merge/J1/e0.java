/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class e0
extends c {
    private static final String[] j = new String[]{"sekund", "sekundy", "sekund\u0119"};
    private static final String[] k = new String[]{"minut", "minuty", "minut\u0119"};
    private static final String[] l = new String[]{"godzin", "godziny", "godzin\u0119"};
    private static final String[] m = new String[]{"dni", "dzie\u0144"};
    private static final String[] n = new String[]{"tydzie\u0144", "tygodnie"};
    private static final String[] o = new String[]{"miesi\u0105c", "miesi\u0105ce", "miesi\u0119cy"};
    private static final String[] p = new String[]{"lat", "lata", "rok"};
    private static final e0 q = new e0();

    private e0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static e0 e() {
        return q;
    }
}

