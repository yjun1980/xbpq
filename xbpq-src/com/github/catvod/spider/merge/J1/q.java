/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class q
extends c {
    private static final String[] j = new String[]{"segundo", "segundos"};
    private static final String[] k = new String[]{"minuto", "minutos"};
    private static final String[] l = new String[]{"hora", "horas"};
    private static final String[] m = new String[]{"d\u00eda", "d\u00edas"};
    private static final String[] n = new String[]{"semana", "semanas"};
    private static final String[] o = new String[]{"mes", "meses"};
    private static final String[] p = new String[]{"a\u00f1o", "a\u00f1os"};
    private static final q q = new q();

    private q() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static q e() {
        return q;
    }
}

