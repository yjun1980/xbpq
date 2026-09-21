/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class s
extends c {
    private static final String[] j = new String[]{"sekund", "sekundit"};
    private static final String[] k = new String[]{"minut", "minutit"};
    private static final String[] l = new String[]{"tund", "tundi"};
    private static final String[] m = new String[]{"p\u00e4ev", "p\u00e4eva"};
    private static final String[] n = new String[]{"n\u00e4dal", "n\u00e4dalat"};
    private static final String[] o = new String[]{"kuu", "kuud"};
    private static final String[] p = new String[]{"aasta", "aastat"};
    private static final s q = new s();

    private s() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static s e() {
        return q;
    }
}

