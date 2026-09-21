/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.KW;

public final class b
extends Enum {
    public static final /* enum */ b a;
    public static final /* enum */ b b;
    public static final /* enum */ b c;
    public static final /* enum */ b d;
    public static final /* enum */ b e;
    public static final b[] f;

    static {
        b b2;
        b b3;
        b b4;
        b b5;
        b b6;
        a = b6 = new b("CPU_ACQUIRED", 0);
        b = b5 = new b("BLOCKING", 1);
        c = b4 = new b("PARKING", 2);
        d = b3 = new b("DORMANT", 3);
        e = b2 = new b("TERMINATED", 4);
        f = new b[]{b6, b5, b4, b3, b2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public b() {
        void var2_-1;
        void var1_-1;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])f.clone();
    }
}

