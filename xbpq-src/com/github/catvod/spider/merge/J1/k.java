/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class k
extends c {
    private static final String[] j = new String[]{"sekund", "sekunder"};
    private static final String[] k = new String[]{"minut", "minutter"};
    private static final String[] l = new String[]{"time", "timer"};
    private static final String[] m = new String[]{"dag", "dage"};
    private static final String[] n = new String[]{"uge", "uger"};
    private static final String[] o = new String[]{"m\u00e5ned", "m\u00e5neder"};
    private static final String[] p = new String[]{"\u00e5r"};
    private static final k q = new k();

    private k() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static k e() {
        return q;
    }
}

