/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V1;

final class g {
    private int a;

    g() {
    }

    final int a() {
        return this.a;
    }

    final boolean b() {
        boolean bl = this.a < 7;
        return bl;
    }

    final void c() {
        this.a = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void d() {
        int n2 = this.a;
        n2 = n2 <= 3 ? 0 : (n2 <= 9 ? (n2 -= 3) : (n2 -= 6));
        this.a = n2;
    }

    final void e() {
        int n2 = this.a < 7 ? 8 : 11;
        this.a = n2;
    }

    final void f() {
        int n2 = this.a;
        int n3 = 7;
        if (n2 >= 7) {
            n3 = 10;
        }
        this.a = n3;
    }

    final void g() {
        int n2 = this.a < 7 ? 9 : 11;
        this.a = n2;
    }
}

