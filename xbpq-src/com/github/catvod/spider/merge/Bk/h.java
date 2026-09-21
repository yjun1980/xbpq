/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Bk;

public final class h
extends Enum {
    public static final /* enum */ h a;
    public static final /* enum */ h b;
    public static final /* enum */ h c;
    public static final /* enum */ h d;
    public static final /* enum */ h e;
    public static final h[] f;

    static {
        h h2;
        h h3;
        h h4;
        h h5;
        h h6;
        a = h6 = new h("DESTROYED", 0);
        b = h5 = new h("INITIALIZED", 1);
        c = h4 = new h("CREATED", 2);
        d = h3 = new h("STARTED", 3);
        e = h2 = new h("RESUMED", 4);
        f = new h[]{h6, h5, h4, h3, h2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public h() {
        void var2_-1;
        void var1_-1;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static h[] values() {
        return (h[])f.clone();
    }
}

