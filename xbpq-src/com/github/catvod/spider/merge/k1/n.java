/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

public final class n
extends Enum<n> {
    public static final /* enum */ n a;
    public static final /* enum */ n b;
    public static final /* enum */ n c;
    public static final /* enum */ n d;
    private static final n[] e;

    static {
        n n2;
        n n3;
        n n4;
        n n5;
        a = n5 = new n();
        b = n4 = new n();
        c = n3 = new n();
        d = n2 = new n();
        e = new n[]{n5, n4, n3, n2};
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public static n[] values() {
        return (n[])e.clone();
    }
}

