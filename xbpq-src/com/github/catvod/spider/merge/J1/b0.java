/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class b0
extends c {
    private static final String[] j = new String[]{"seconde", "seconden"};
    private static final String[] k = new String[]{"minuten", "minuut"};
    private static final String[] l = new String[]{"uur"};
    private static final String[] m = new String[]{"dag", "dagen"};
    private static final String[] n = new String[]{"week", "weken"};
    private static final String[] o = new String[]{"maand", "maanden"};
    private static final String[] p = new String[]{"jaar"};
    private static final b0 q = new b0();

    private b0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static b0 e() {
        return q;
    }
}

