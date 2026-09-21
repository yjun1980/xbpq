/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class o
extends c {
    private static final String[] j = new String[]{"second", "seconds", "sec"};
    private static final String[] k = new String[]{"minute", "minutes", "min"};
    private static final String[] l = new String[]{"hour", "hours", "hr"};
    private static final String[] m = new String[]{"day", "days"};
    private static final String[] n = new String[]{"week", "weeks", "wk"};
    private static final String[] o = new String[]{"month", "months", "mo"};
    private static final String[] p = new String[]{"year", "years", "yr"};
    private static final o q = new o();

    private o() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static o e() {
        return q;
    }
}

