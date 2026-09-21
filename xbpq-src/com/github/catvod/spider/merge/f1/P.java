/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

abstract class P {
    int a;
    private int b;
    private int c = -1;

    P() {
    }

    static void i(StringBuilder stringBuilder) {
        if (stringBuilder != null) {
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    final void a(int n2) {
        this.c = n2;
    }

    final boolean b() {
        boolean bl = this.a == 5;
        return bl;
    }

    final boolean c() {
        boolean bl = this.a == 4;
        return bl;
    }

    final boolean d() {
        int n2 = this.a;
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }

    final boolean e() {
        boolean bl = this.a == 6;
        return bl;
    }

    final boolean f() {
        boolean bl = this.a == 3;
        return bl;
    }

    final boolean g() {
        boolean bl = this.a == 2;
        return bl;
    }

    P h() {
        this.b = -1;
        this.c = -1;
        return this;
    }

    final void j(int n2) {
        this.b = n2;
    }
}

