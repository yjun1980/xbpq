/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class j
extends c {
    private static final String[] j = new String[]{"sekundami", "sekundou"};
    private static final String[] k = new String[]{"minutami", "minutou"};
    private static final String[] l = new String[]{"hodinami", "hodinou"};
    private static final String[] m = new String[]{"dny", "v\u010dera"};
    private static final String[] n = new String[]{"t\u00fddnem", "t\u00fddny"};
    private static final String[] o = new String[]{"m\u011bs\u00edcem", "m\u011bs\u00edci"};
    private static final String[] p = new String[]{"rokem", "roky", "lety"};
    private static final j q = new j();

    private j() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static j e() {
        return q;
    }
}

