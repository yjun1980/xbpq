/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class H
extends c {
    private static final String[] j = new String[]{"secondi", "secondo"};
    private static final String[] k = new String[]{"minuti", "minuto"};
    private static final String[] l = new String[]{"ora", "ore"};
    private static final String[] m = new String[]{"giorni", "giorno"};
    private static final String[] n = new String[]{"settimana", "settimane"};
    private static final String[] o = new String[]{"mese", "mesi"};
    private static final String[] p = new String[]{"anni", "anno"};
    private static final H q = new H();

    private H() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static H e() {
        return q;
    }
}

