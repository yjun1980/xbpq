/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class l0
extends c {
    private static final String[] j = new String[]{"sekundama", "sekundami", "sekundo"};
    private static final String[] k = new String[]{"minutama", "minutami", "minuto"};
    private static final String[] l = new String[]{"urama", "urami", "uro"};
    private static final String[] m = new String[]{"dnem", "dnevi", "dnevoma"};
    private static final String[] n = new String[]{"tedni", "tednom", "tednoma"};
    private static final String[] o = new String[]{"mesecem", "mesecema", "meseci"};
    private static final String[] p = new String[]{"leti", "letom", "letoma"};
    private static final l0 q = new l0();

    private l0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static l0 e() {
        return q;
    }
}

