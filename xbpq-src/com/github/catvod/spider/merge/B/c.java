/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

public final class c
extends Enum<c> {
    private static final c[] A;
    public static final /* enum */ c b;
    public static final /* enum */ c c;
    public static final /* enum */ c d;
    public static final /* enum */ c e;
    public static final /* enum */ c f;
    public static final /* enum */ c g;
    public static final /* enum */ c h;
    public static final /* enum */ c i;
    public static final /* enum */ c j;
    public static final /* enum */ c k;
    public static final /* enum */ c l;
    public static final /* enum */ c m;
    public static final /* enum */ c n;
    public static final /* enum */ c o;
    public static final /* enum */ c p;
    public static final /* enum */ c q;
    public static final /* enum */ c r;
    public static final /* enum */ c s;
    public static final /* enum */ c t;
    public static final /* enum */ c u;
    public static final /* enum */ c v;
    public static final /* enum */ c w;
    public static final /* enum */ c x;
    public static final /* enum */ c y;
    public static final /* enum */ c z;
    public final int a = 1 << this.ordinal();

    static {
        c c2;
        c c3;
        c c4;
        c c5;
        c c6;
        c c7;
        c c8;
        c c9;
        c c10;
        c c11;
        c c12;
        c c13;
        c c14;
        c c15;
        c c16;
        c c17;
        c c18;
        c c19;
        c c20;
        c c21;
        c c22;
        c c23;
        c c24;
        c c25;
        c c26;
        b = c26 = new c();
        c c27 = new c();
        c = c25 = new c();
        d = c24 = new c();
        e = c23 = new c();
        f = c22 = new c();
        g = c21 = new c();
        h = c20 = new c();
        i = c19 = new c();
        j = c18 = new c();
        c c28 = new c();
        k = c17 = new c();
        l = c16 = new c();
        m = c15 = new c();
        n = c14 = new c();
        o = c13 = new c();
        p = c12 = new c();
        q = c11 = new c();
        r = c10 = new c();
        s = c9 = new c();
        t = c8 = new c();
        u = c7 = new c();
        v = c6 = new c();
        w = c5 = new c();
        x = c4 = new c();
        y = c3 = new c();
        z = c2 = new c();
        A = new c[]{c26, c27, c25, c24, c23, c22, c21, c20, c19, c18, c28, c17, c16, c15, c14, c13, c12, c11, c10, c9, c8, c7, c6, c5, c4, c3, c2};
    }

    public static int b(c[] cArray) {
        if (cArray == null) {
            return 0;
        }
        int n2 = cArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 |= cArray[i2].a;
        }
        return n3;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])A.clone();
    }
}

