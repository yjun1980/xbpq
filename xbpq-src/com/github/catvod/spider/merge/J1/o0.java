/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class o0
extends c {
    private static final String[] j = new String[]{"sekunde", "sekundi"};
    private static final String[] k = new String[]{"minuta"};
    private static final String[] l = new String[]{"sat", "sati", "sata"};
    private static final String[] m = new String[]{"Pre 1 dan", "Pre 2 dana", "Pre 3 dana", "Pre 4 dana", "Pre 5 dana", "Pre 6 dana"};
    private static final String[] n = new String[]{"nedelja", "nedelje", "nedelju"};
    private static final String[] o = new String[]{"mesec", "meseci", "meseca"};
    private static final String[] p = new String[]{"godine", "godina", "godinu"};
    private static final o0 q = new o0();

    private o0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static o0 e() {
        return q;
    }
}

