/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

public final class H
extends Enum<H> {
    public static final /* enum */ H a;
    public static final /* enum */ H b;
    public static final /* enum */ H c;
    public static final /* enum */ H d;
    public static final /* enum */ H e;
    public static final /* enum */ H f;
    public static final /* enum */ H g;
    private static final H[] h;

    static {
        H h2;
        H h3;
        H h4;
        H h5;
        H h6;
        H h7;
        H h8;
        a = h8 = new H();
        b = h7 = new H();
        c = h6 = new H();
        d = h5 = new H();
        e = h4 = new H();
        f = h3 = new H();
        g = h2 = new H();
        h = new H[]{h8, h7, h6, h5, h4, h3, h2};
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    public static H[] values() {
        return (H[])h.clone();
    }
}

