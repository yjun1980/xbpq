/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C0;

public final class a
extends Enum<a> {
    public static final /* enum */ a a;
    public static final /* enum */ a b;
    public static final /* enum */ a c;
    public static final /* enum */ a d;
    public static final /* enum */ a e;
    private static final a[] f;

    static {
        a a2;
        a a3;
        a a4;
        a a5;
        a a6;
        a = a6 = new a("unknown", 0);
        b = a5 = new a("noAudio", 1);
        c = a4 = new a("low", 2);
        d = a3 = new a("medium", 3);
        e = a2 = new a("high", 4);
        f = new a[]{a6, a5, a4, a3, a2};
    }

    private a(int n3) {
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])f.clone();
    }
}

