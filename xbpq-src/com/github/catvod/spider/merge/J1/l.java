/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class l
extends c {
    private static final String[] j = new String[]{"Sekunde", "Sekunden"};
    private static final String[] k = new String[]{"Minute", "Minuten"};
    private static final String[] l = new String[]{"Stunde", "Stunden"};
    private static final String[] m = new String[]{"Tag", "Tagen"};
    private static final String[] n = new String[]{"Woche", "Wochen"};
    private static final String[] o = new String[]{"Monat", "Monaten"};
    private static final String[] p = new String[]{"Jahr", "Jahren"};
    private static final l q = new l();

    private l() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static l e() {
        return q;
    }
}

