/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class C
extends c {
    private static final String[] j = new String[]{"sekunde", "sekundi", "sekundu"};
    private static final String[] k = new String[]{"minuta", "minute", "minutu"};
    private static final String[] l = new String[]{"sat", "sata", "sati"};
    private static final String[] m = new String[]{"dan", "dana"};
    private static final String[] n = new String[]{"tjedan", "tjedna"};
    private static final String[] o = new String[]{"mjesec", "mjeseca", "mjeseci"};
    private static final String[] p = new String[]{"godina", "godine", "godinu"};
    private static final C q = new C();

    private C() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C e() {
        return q;
    }
}

