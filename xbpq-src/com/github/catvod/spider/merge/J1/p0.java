/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class p0
extends c {
    private static final String[] j = new String[]{"sekund", "sekunder"};
    private static final String[] k = new String[]{"minut", "minuter"};
    private static final String[] l = new String[]{"timmar", "timme"};
    private static final String[] m = new String[]{"dag", "dagar"};
    private static final String[] n = new String[]{"vecka", "veckor"};
    private static final String[] o = new String[]{"m\u00e5nad", "m\u00e5nader"};
    private static final String[] p = new String[]{"\u00e5r"};
    private static final p0 q = new p0();

    private p0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static p0 e() {
        return q;
    }
}

