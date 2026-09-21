/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class G
extends c {
    private static final String[] j = new String[]{"sek\u00fandu", "sek\u00fandum", "second", "seconds"};
    private static final String[] k = new String[]{"m\u00edn\u00fatu", "m\u00edn\u00fatum", "minute", "minutes"};
    private static final String[] l = new String[]{"klukkustund", "klukkustundum", "hour", "hours"};
    private static final String[] m = new String[]{"degi", "d\u00f6gum", "day", "days"};
    private static final String[] n = new String[]{"viku", "vikum", "week", "weeks"};
    private static final String[] o = new String[]{"m\u00e1nu\u00f0i", "m\u00e1nu\u00f0um"};
    private static final String[] p = new String[]{"\u00e1ri", "\u00e1rum"};
    private static final G q = new G();

    private G() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static G e() {
        return q;
    }
}

