/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T0;

public final class h
extends Enum<h> {
    public static final /* enum */ h a;
    public static final /* enum */ h b;
    private static final h[] c;

    static {
        h h2;
        h h3;
        a = h3 = new h();
        h h4 = new h();
        b = h2 = new h();
        c = new h[]{h3, h4, h2};
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static h[] values() {
        return (h[])c.clone();
    }
}

