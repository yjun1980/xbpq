/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class x
extends c {
    private static final String[] j = new String[]{"seconde", "secondes"};
    private static final String[] k = new String[]{"minute", "minutes"};
    private static final String[] l = new String[]{"heure", "heures"};
    private static final String[] m = new String[]{"jour", "jours"};
    private static final String[] n = new String[]{"semaine", "semaines"};
    private static final String[] o = new String[]{"mois"};
    private static final String[] p = new String[]{"an", "ans"};
    private static final x q = new x();

    private x() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static x e() {
        return q;
    }
}

