/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.p0;

public final class h
extends Enum {
    public static final h[] a = new h[]{new h("PUBLIC", 0), new h("PROTECTED", 1), new h("INTERNAL", 2), new h("PRIVATE", 3)};

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
        return (h[])a.clone();
    }
}

