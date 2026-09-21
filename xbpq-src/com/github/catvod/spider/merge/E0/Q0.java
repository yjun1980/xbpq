/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.n;

public final class Q0
extends Enum<Q0> {
    public static final /* enum */ Q0 b;
    public static final /* enum */ Q0 c;
    public static final /* enum */ Q0 d;
    public static final /* enum */ Q0 e;
    public static final /* enum */ Q0 f;
    public static final /* enum */ Q0 g;
    public static final /* enum */ Q0 h;
    public static final /* enum */ Q0 i;
    public static final /* enum */ Q0 j;
    private static final Q0[] k;
    private final Object a;

    static {
        Q0 q02;
        Q0 q03;
        Q0 q04;
        Q0 q05;
        Q0 q06;
        Q0 q07;
        Q0 q08;
        Q0 q09;
        Q0 q010;
        b = q010 = new Q0(0);
        c = q09 = new Q0(0L);
        d = q08 = new Q0(Float.valueOf(0.0f));
        e = q07 = new Q0(0.0);
        f = q06 = new Q0(Boolean.FALSE);
        g = q05 = new Q0("");
        h = q04 = new Q0(n.b);
        i = q03 = new Q0(null);
        j = q02 = new Q0(null);
        k = new Q0[]{q010, q09, q08, q07, q06, q05, q04, q03, q02};
    }

    private Q0(Object object) {
        this.a = object;
    }

    public static Q0 valueOf(String string) {
        return Enum.valueOf(Q0.class, string);
    }

    public static Q0[] values() {
        return (Q0[])k.clone();
    }
}

