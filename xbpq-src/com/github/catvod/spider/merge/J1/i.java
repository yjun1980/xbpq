/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class i
extends c {
    private static final String[] j = new String[]{"segon", "segons"};
    private static final String[] k = new String[]{"minut", "minuts"};
    private static final String[] l = new String[]{"hora", "hores"};
    private static final String[] m = new String[]{"dia", "dies"};
    private static final String[] n = new String[]{"setmana", "setmanes"};
    private static final String[] o = new String[]{"mes", "mesos"};
    private static final String[] p = new String[]{"any", "anys"};
    private static final i q = new i();

    private i() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static i e() {
        return q;
    }
}

