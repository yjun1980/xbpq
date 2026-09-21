/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

abstract class O {
    int a;

    O() {
    }

    static void h(StringBuilder stringBuilder) {
        if (stringBuilder != null) {
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    final boolean a() {
        boolean bl = this.a == 5;
        return bl;
    }

    final boolean b() {
        boolean bl = this.a == 4;
        return bl;
    }

    final boolean c() {
        int n2 = this.a;
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }

    final boolean d() {
        boolean bl = this.a == 6;
        return bl;
    }

    final boolean e() {
        boolean bl = this.a == 3;
        return bl;
    }

    final boolean f() {
        boolean bl = this.a == 2;
        return bl;
    }

    abstract O g();
}

