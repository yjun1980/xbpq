/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J1;

import com.github.catvod.spider.merge.I1.c;

public final class T
extends c {
    private static final String[] j = new String[]{"sekundes", "sekund\u0113m"};
    private static final String[] k = new String[]{"min\u016btes", "min\u016bt\u0113m", "min\u016btes"};
    private static final String[] l = new String[]{"stundas", "stund\u0101m"};
    private static final String[] m = new String[]{"dienas", "dien\u0101m"};
    private static final String[] n = new String[]{"ned\u0113\u013cas", "ned\u0113\u013c\u0101m"};
    private static final String[] o = new String[]{"m\u0113ne\u0161a", "m\u0113ne\u0161iem"};
    private static final String[] p = new String[]{"gada", "gadiem"};
    private static final T q = new T();

    private T() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static T e() {
        return q;
    }
}

