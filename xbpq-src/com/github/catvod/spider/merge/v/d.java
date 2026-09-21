/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v;

public final class d
extends Enum<d> {
    public static final /* enum */ d a;
    public static final /* enum */ d b;
    public static final /* enum */ d c;
    public static final /* enum */ d d;
    public static final /* enum */ d e;
    private static final d[] f;

    static {
        d d2;
        d d3;
        d d4;
        d d5;
        d d6;
        a = d6 = new d();
        b = d5 = new d();
        c = d4 = new d();
        d = d3 = new d();
        e = d2 = new d();
        f = new d[]{d6, d5, d4, d3, d2};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])f.clone();
    }
}

