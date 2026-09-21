/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;
import java.time.temporal.ChronoUnit;

public final class I
extends c {
    private static final String[] j = new String[]{"\u05e9\u05e0\u05d9\u05d5\u05ea", "\u05e9\u05e0\u05d9\u05d9\u05d4"};
    private static final String[] k = new String[]{"\u05d3\u05e7\u05d4", "\u05d3\u05e7\u05d5\u05ea"};
    private static final String[] l = new String[]{"\u05e9\u05e2\u05d4", "\u05e9\u05e2\u05d5\u05ea"};
    private static final String[] m = new String[]{"\u05d9\u05d5\u05dd", "\u05d9\u05de\u05d9\u05dd"};
    private static final String[] n = new String[]{"\u05e9\u05d1\u05d5\u05e2", "\u05e9\u05d1\u05d5\u05e2\u05d5\u05ea"};
    private static final String[] o = new String[]{"\u05d7\u05d5\u05d3\u05e9", "\u05d7\u05d5\u05d3\u05e9\u05d9\u05dd"};
    private static final String[] p = new String[]{"\u05e9\u05e0\u05d4", "\u05e9\u05e0\u05d9\u05dd"};
    private static final I q = new I();

    private I() {
        super(" ", j, k, l, m, n, o, p);
        this.b(ChronoUnit.HOURS, "\u05e9\u05e2\u05ea\u05d9\u05d9\u05dd");
        this.b(ChronoUnit.DAYS, "\u05d9\u05d5\u05de\u05d9\u05d9\u05dd");
        this.b(ChronoUnit.WEEKS, "\u05e9\u05d1\u05d5\u05e2\u05d9\u05d9\u05dd");
        this.b(ChronoUnit.MONTHS, "\u05d7\u05d5\u05d3\u05e9\u05d9\u05d9\u05dd");
        this.b(ChronoUnit.YEARS, "\u05e9\u05e0\u05ea\u05d9\u05d9\u05dd");
    }

    public static I e() {
        return q;
    }
}

