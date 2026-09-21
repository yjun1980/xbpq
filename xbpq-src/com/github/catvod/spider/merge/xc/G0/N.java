/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

public abstract class N {
    public int a;

    public static void g(StringBuilder stringBuilder) {
        if (stringBuilder != null) {
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    public final boolean a() {
        boolean bl = this.a == 4;
        return bl;
    }

    public final boolean b() {
        int n2 = this.a;
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }

    public final boolean c() {
        boolean bl = this.a == 6;
        return bl;
    }

    public final boolean d() {
        boolean bl = this.a == 3;
        return bl;
    }

    public final boolean e() {
        boolean bl = this.a == 2;
        return bl;
    }

    public abstract void f();
}

