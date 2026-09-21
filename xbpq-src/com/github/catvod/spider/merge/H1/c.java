/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

public final class c
extends Enum<c> {
    public static final /* enum */ c a;
    public static final /* enum */ c b;
    public static final /* enum */ c c;
    private static final c[] d;

    static {
        c c2;
        c c3;
        c c4;
        a = c4 = new c();
        b = c3 = new c();
        c = c2 = new c();
        d = new c[]{c4, c3, c2};
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])d.clone();
    }
}

