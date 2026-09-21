/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class c0
extends c {
    private static final String[] j = new String[]{"sekund", "sekunder"};
    private static final String[] k = new String[]{"minutt", "minutter"};
    private static final String[] l = new String[]{"time", "timer"};
    private static final String[] m = new String[]{"dag", "dager"};
    private static final String[] n = new String[]{"uke", "uker"};
    private static final String[] o = new String[]{"md."};
    private static final String[] p = new String[]{"\u00e5r"};
    private static final c0 q = new c0();

    private c0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static c0 e() {
        return q;
    }
}

