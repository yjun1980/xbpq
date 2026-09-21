/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

public final class m
extends Enum<m> {
    public static final /* enum */ m a;
    public static final /* enum */ m b;
    public static final /* enum */ m c;
    public static final /* enum */ m d;
    public static final /* enum */ m e;
    private static final m[] f;

    static {
        m m2;
        m m3;
        m m4;
        m m5;
        m m6;
        a = m6 = new m();
        b = m5 = new m();
        c = m4 = new m();
        d = m3 = new m();
        m m7 = new m();
        e = m2 = new m();
        f = new m[]{m6, m5, m4, m3, m7, m2, new m()};
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])f.clone();
    }
}

