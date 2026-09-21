/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class a
extends c {
    private static final String[] j = new String[]{"sekonde", "sekondes"};
    private static final String[] k = new String[]{"minute", "minuut"};
    private static final String[] l = new String[]{"ure", "uur"};
    private static final String[] m = new String[]{"dae", "dag"};
    private static final String[] n = new String[]{"week", "weke"};
    private static final String[] o = new String[]{"maand", "maande"};
    private static final String[] p = new String[]{"jaar"};
    private static final a q = new a();

    private a() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static a e() {
        return q;
    }
}

