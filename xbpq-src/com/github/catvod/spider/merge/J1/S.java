/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class S
extends c {
    private static final String[] j = new String[]{"sekundes", "sekund\u0119", "sekund\u017ei\u0173"};
    private static final String[] k = new String[]{"minutes", "minut\u0119", "minu\u010di\u0173"};
    private static final String[] l = new String[]{"valandas", "valand\u0105", "valand\u0173"};
    private static final String[] m = new String[]{"dienas", "dien\u0105"};
    private static final String[] n = new String[]{"savaites", "savait\u0119"};
    private static final String[] o = new String[]{"m\u0117nesius", "m\u0117nesi\u0173", "m\u0117nes\u012f"};
    private static final String[] p = new String[]{"metus", "met\u0173"};
    private static final S q = new S();

    private S() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static S e() {
        return q;
    }
}

