/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

public final class i0
extends Enum<i0> {
    public static final /* enum */ i0 A;
    public static final /* enum */ i0 B;
    public static final /* enum */ i0 C;
    public static final i0[] D;
    public static final int E;
    private static final i0[] F;
    public static final /* enum */ i0 b;
    public static final /* enum */ i0 c;
    public static final /* enum */ i0 d;
    public static final /* enum */ i0 e;
    public static final /* enum */ i0 f;
    public static final /* enum */ i0 g;
    public static final /* enum */ i0 h;
    public static final /* enum */ i0 i;
    public static final /* enum */ i0 j;
    public static final /* enum */ i0 k;
    public static final /* enum */ i0 l;
    public static final /* enum */ i0 m;
    public static final /* enum */ i0 n;
    public static final /* enum */ i0 o;
    public static final /* enum */ i0 p;
    public static final /* enum */ i0 q;
    public static final /* enum */ i0 r;
    public static final /* enum */ i0 s;
    public static final /* enum */ i0 t;
    public static final /* enum */ i0 u;
    public static final /* enum */ i0 v;
    public static final /* enum */ i0 w;
    public static final /* enum */ i0 x;
    public static final /* enum */ i0 y;
    public static final /* enum */ i0 z;
    public final int a = 1 << this.ordinal();

    static {
        i0 i02;
        i0 i03;
        i0 i04;
        i0 i05;
        i0 i06;
        i0 i07;
        i0 i08;
        i0 i09;
        i0 i010;
        i0 i011;
        i0 i012;
        i0 i013;
        i0 i014;
        i0 i015;
        i0 i016;
        i0 i017;
        i0 i018;
        i0 i019;
        i0 i020;
        i0 i021;
        i0 i022;
        i0 i023;
        i0 i024;
        i0 i025;
        i0 i026;
        i0 i027;
        i0 i028;
        i0 i029;
        b = i029 = new i0();
        c = i028 = new i0();
        d = i027 = new i0();
        e = i026 = new i0();
        f = i025 = new i0();
        g = i024 = new i0();
        h = i023 = new i0();
        i = i022 = new i0();
        j = i021 = new i0();
        k = i020 = new i0();
        l = i019 = new i0();
        m = i018 = new i0();
        i0 i030 = new i0();
        n = i017 = new i0();
        o = i016 = new i0();
        p = i015 = new i0();
        q = i014 = new i0();
        r = i013 = new i0();
        s = i012 = new i0();
        t = i011 = new i0();
        i0 i031 = new i0();
        u = i010 = new i0();
        v = i09 = new i0();
        w = i08 = new i0();
        x = i07 = new i0();
        y = i06 = new i0();
        z = i05 = new i0();
        A = i04 = new i0();
        B = i03 = new i0();
        C = i02 = new i0();
        F = new i0[]{i029, i028, i027, i026, i025, i024, i023, i022, i021, i020, i019, i018, i030, i017, i016, i015, i014, i013, i012, i011, i031, i010, i09, i08, i07, i06, i05, i04, i03, i02};
        D = new i0[0];
        E = i027.a | i020.a | i023.a | i021.a | i022.a;
    }

    public static boolean b(int n2, int n3, i0 i02) {
        int n4 = i02.a;
        boolean bl = (n2 & n4) != 0 || (n3 & n4) != 0;
        return bl;
    }

    public static boolean e(int n2, i0 i02) {
        boolean bl = (n2 & i02.a) != 0;
        return bl;
    }

    public static int h(i0[] i0Array) {
        if (i0Array == null) {
            return 0;
        }
        int n2 = i0Array.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 |= i0Array[i2].a;
        }
        return n3;
    }

    public static i0 valueOf(String string) {
        return Enum.valueOf(i0.class, string);
    }

    public static i0[] values() {
        return (i0[])F.clone();
    }
}

