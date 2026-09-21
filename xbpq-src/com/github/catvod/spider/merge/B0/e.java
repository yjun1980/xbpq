/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B0;

import com.github.catvod.spider.merge.B0.d;
import com.github.catvod.spider.merge.C0.a;
import com.github.catvod.spider.merge.C0.b;

public class e
extends Enum<e> {
    public static final /* enum */ e d;
    private static final e[] e;
    protected int a;
    private b b;
    private a c;

    static {
        d d2 = new d();
        d = d2;
        b b2 = com.github.catvod.spider.merge.C0.b.d;
        a a2 = com.github.catvod.spider.merge.C0.a.c;
        e e2 = new e(b2, a2);
        e e3 = new e(b2, a2);
        e e4 = new e(com.github.catvod.spider.merge.C0.b.a, a2);
        b b3 = com.github.catvod.spider.merge.C0.b.c;
        e e5 = new e(b3, a2);
        b b4 = com.github.catvod.spider.merge.C0.b.e;
        e e6 = new e(b4, a2);
        b b5 = com.github.catvod.spider.merge.C0.b.g;
        a a3 = com.github.catvod.spider.merge.C0.a.d;
        e e7 = new e(b5, a3);
        e e8 = new e(b4, a3);
        b b6 = com.github.catvod.spider.merge.C0.b.f;
        e e9 = new e(b6, a3);
        a a4 = com.github.catvod.spider.merge.C0.a.a;
        e e10 = new e(b3, a4);
        b b7 = com.github.catvod.spider.merge.C0.b.h;
        e e11 = new e(b7, a3);
        b b8 = com.github.catvod.spider.merge.C0.b.l;
        e e12 = new e(b8, a3);
        e e13 = new e(b4, a3);
        e e14 = new e(b6, a3);
        e e15 = new e(b5, a3);
        e e16 = new e(b7, a3);
        e e17 = new e(b4, a3, true);
        e e18 = new e(b6, a3, true);
        e e19 = new e(b5, a3, true);
        e e20 = new e(b7, a3, true);
        e e21 = new e(b4, a3, true);
        e e22 = new e(b6, a3, true);
        e e23 = new e(b5, a3, true);
        e e24 = new e(b3, a2);
        e e25 = new e(b2, a2);
        e e26 = new e(b4, a3);
        e e27 = new e(b6, a3);
        a a5 = com.github.catvod.spider.merge.C0.a.e;
        e e28 = new e(b5, a5);
        e e29 = new e(b7, a5);
        e e30 = new e(b2, a2);
        e e31 = new e(b3, a2);
        e e32 = new e(b2);
        e e33 = new e(b4);
        e e34 = new e(b6);
        e e35 = new e(b5);
        e e36 = new e(b7);
        b b9 = com.github.catvod.spider.merge.C0.b.j;
        e e37 = new e(b9);
        e e38 = new e(b3);
        e e39 = new e(b6);
        b b10 = com.github.catvod.spider.merge.C0.b.i;
        e = new e[]{d2, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, new e(b10), new e(b9), new e(b5), new e(b7), new e(a2), new e(a3), new e(a5), new e(a4), new e(a4), new e(a4), new e(b4), new e(b6), new e(b5), new e(b7), new e(b6), new e(b3), new e(b2), new e(b4), new e(b6), new e(b6), new e(b6), new e(b5), new e(b7), new e(b10), new e(b8), new e(b3), new e(b5), new e(b7), new e(b10), new e(b9), new e(b9), new e(a3), new e(a5), new e(a2), new e(a2), new e(a3), new e(a3), new e(b3), new e(b2), new e(b4), new e(b6), new e(b5), new e(b7), new e(b10), new e(b9), new e(a3), new e(b3), new e(b2), new e(b4), new e(b6), new e(b5), new e(b7), new e(b10), new e(b9), new e(com.github.catvod.spider.merge.C0.b.k), new e(com.github.catvod.spider.merge.C0.b.m)};
    }

    e() {
    }

    private e(a a2) {
        this(com.github.catvod.spider.merge.C0.b.b, a2, false);
    }

    private e(b b2) {
        this(b2, com.github.catvod.spider.merge.C0.a.b, false);
    }

    private e(b b2, a a2) {
        this(b2, a2, false);
    }

    private e(b b2, a a2, boolean bl) {
        this.i(Integer.parseInt(this.name().substring(1)));
        this.b = b2;
        this.c = a2;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])e.clone();
    }

    public final int b() {
        return this.a;
    }

    public final boolean e() {
        boolean bl = this != d && this.c != com.github.catvod.spider.merge.C0.a.b;
        return bl;
    }

    public final boolean h() {
        boolean bl = this != d && this.b != com.github.catvod.spider.merge.C0.b.b;
        return bl;
    }

    public void i(int n2) {
        this.a = n2;
    }

    public final b j() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}

