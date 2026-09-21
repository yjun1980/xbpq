/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f0;

public final class a
extends Enum {
    public static final /* enum */ a a;
    public static final a[] b;

    static {
        a a2;
        a = a2 = new a("COROUTINE_SUSPENDED", 0);
        b = new a[]{a2, new a("UNDECIDED", 1), new a("RESUMED", 2)};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public a() {
        void var2_-1;
        void var1_-1;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])b.clone();
    }
}

