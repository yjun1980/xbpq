/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class v
extends c {
    private static final String[] j = new String[]{"sekunti", "sekuntia"};
    private static final String[] k = new String[]{"minuutti", "minuuttia"};
    private static final String[] l = new String[]{"tunti", "tuntia"};
    private static final String[] m = new String[]{"p\u00e4iv\u00e4", "p\u00e4iv\u00e4\u00e4"};
    private static final String[] n = new String[]{"viikko", "viikkoa"};
    private static final String[] o = new String[]{"kuukausi", "kuukautta"};
    private static final String[] p = new String[]{"vuosi", "vuotta"};
    private static final v q = new v();

    private v() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static v e() {
        return q;
    }
}

