/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C0;

public final class b
extends Enum<b> {
    public static final /* enum */ b a;
    public static final /* enum */ b b;
    public static final /* enum */ b c;
    public static final /* enum */ b d;
    public static final /* enum */ b e;
    public static final /* enum */ b f;
    public static final /* enum */ b g;
    public static final /* enum */ b h;
    public static final /* enum */ b i;
    public static final /* enum */ b j;
    public static final /* enum */ b k;
    public static final /* enum */ b l;
    public static final /* enum */ b m;
    private static final b[] n;

    static {
        b b2;
        b b3;
        b b4;
        b b5;
        b b6;
        b b7;
        b b8;
        b b9;
        b b10;
        b b11;
        b b12;
        b b13;
        b b14;
        a = b14 = new b("unknown", 0);
        b = b13 = new b("noVideo", 1);
        c = b12 = new b("tiny", 2);
        d = b11 = new b("small", 3);
        e = b10 = new b("medium", 4);
        f = b9 = new b("large", 5);
        g = b8 = new b("hd720", 6);
        h = b7 = new b("hd1080", 7);
        i = b6 = new b("hd1440", 8);
        j = b5 = new b("hd2160", 9);
        k = b4 = new b("hd2880p", 10);
        l = b3 = new b("highres", 11);
        m = b2 = new b("ultrahighres", 12);
        n = new b[]{b14, b13, b12, b11, b10, b9, b8, b7, b6, b5, b4, b3, b2};
    }

    private b(int n3) {
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])n.clone();
    }
}

