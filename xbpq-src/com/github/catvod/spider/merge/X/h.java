/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X;

public final class h
extends Enum<h> {
    public static final /* enum */ h c;
    public static final /* enum */ h d;
    private static final h[] e;

    static {
        h h2;
        h h3;
        c = h3 = new h();
        h h4 = new h();
        d = h2 = new h();
        e = new h[]{h3, h4, h2};
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static h[] values() {
        return (h[])e.clone();
    }
}

