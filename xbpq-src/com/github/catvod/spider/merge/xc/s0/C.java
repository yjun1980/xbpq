/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

public final class C
extends Enum {
    public static final /* enum */ C a;
    public static final C[] b;

    static {
        C c2;
        a = c2 = new C("DEFAULT", 0);
        b = new C[]{c2, new C("LAZY", 1), new C("ATOMIC", 2), new C("UNDISPATCHED", 3)};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public C() {
        void var2_-1;
        void var1_-1;
    }

    public static C valueOf(String string) {
        return Enum.valueOf(C.class, string);
    }

    public static C[] values() {
        return (C[])b.clone();
    }
}

