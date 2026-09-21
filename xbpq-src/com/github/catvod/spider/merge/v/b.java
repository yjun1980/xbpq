/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.v.e;

public final class b
extends Enum<b> {
    public static final /* enum */ b e;
    public static final /* enum */ b f;
    public static final /* enum */ b g;
    public static final /* enum */ b h;
    public static final /* enum */ b i;
    private static final b[] j;
    private final int[] c;
    private final int d;

    static {
        b b2;
        b b3;
        b b4;
        b b5;
        b b6;
        b b7 = new b(new int[]{0, 0, 0}, 0);
        e = b6 = new b(new int[]{10, 12, 14}, 1);
        f = b5 = new b(new int[]{9, 11, 13}, 2);
        b b8 = new b(new int[]{0, 0, 0}, 3);
        g = b4 = new b(new int[]{8, 16, 16}, 4);
        h = b3 = new b(new int[]{0, 0, 0}, 7);
        i = b2 = new b(new int[]{8, 10, 12}, 8);
        j = new b[]{b7, b6, b5, b8, b4, b3, b2, new b(new int[]{0, 0, 0}, 5), new b(new int[]{0, 0, 0}, 9), new b(new int[]{8, 10, 12}, 13)};
    }

    private b(int[] nArray, int n3) {
        this.c = nArray;
        this.d = n3;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])j.clone();
    }

    public final int a() {
        return this.d;
    }

    public final int b(e e2) {
        int n2 = e2.f();
        n2 = n2 <= 9 ? 0 : (n2 <= 26 ? 1 : 2);
        return this.c[n2];
    }
}

