/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class n
extends c {
    private static final String[] j = new String[]{"second", "seconds", "sec"};
    private static final String[] k = new String[]{"minute", "minutes", "min"};
    private static final String[] l = new String[]{"hour", "hours", "h"};
    private static final String[] m = new String[]{"day", "days", "d"};
    private static final String[] n = new String[]{"week", "weeks", "w"};
    private static final String[] o = new String[]{"month", "months", "mo"};
    private static final String[] p = new String[]{"year", "years", "y"};
    private static final n q = new n();

    private n() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static n e() {
        return q;
    }
}

