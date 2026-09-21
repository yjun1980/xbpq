/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U1;

import com.github.catvod.spider.merge.P1.f;
import java.io.DataInputStream;
import java.util.Objects;

public final class a {
    private final byte[] a;
    private final int b;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    public a(int n2, com.github.catvod.spider.merge.P1.a a2) {
        this.b = n2;
        Objects.requireNonNull(a2);
        this.a = new byte[n2];
    }

    public final void a(DataInputStream dataInputStream, int n2) {
        n2 = Math.min(this.b - this.d, n2);
        dataInputStream.readFully(this.a, this.d, n2);
        this.d = n2 = this.d + n2;
        if (this.e < n2) {
            this.e = n2;
        }
    }

    public final int b(byte[] byArray, int n2) {
        int n3 = this.d;
        int n4 = this.c;
        int n5 = n3 - n4;
        if (n3 == this.b) {
            this.d = 0;
        }
        System.arraycopy(this.a, n4, byArray, n2, n5);
        this.c = this.d;
        return n5;
    }

    public final int c(int n2) {
        int n3;
        int n4 = this.d;
        int n5 = n3 = n4 - n2 - 1;
        if (n2 >= n4) {
            n5 = n3 + this.b;
        }
        return this.a[n5] & 0xFF;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        boolean bl = this.g > 0;
        return bl;
    }

    public final boolean f() {
        boolean bl = this.d < this.f;
        return bl;
    }

    public final void g(byte by) {
        int n2;
        byte[] byArray = this.a;
        int n3 = this.d;
        this.d = n2 = n3 + 1;
        byArray[n3] = by;
        if (this.e < n2) {
            this.e = n2;
        }
    }

    public final void h(int n2, int n3) {
        if (n2 >= 0 && n2 < this.e) {
            byte[] byArray;
            int n4 = Math.min(this.f - this.d, n3);
            this.g = n3 - n4;
            this.h = n2;
            int n5 = this.d - n2 - 1;
            n2 = n4;
            n3 = n5;
            if (n5 < 0) {
                n3 = this.b;
                n2 = n5 + n3;
                n5 = Math.min(n3 - n2, n4);
                byArray = this.a;
                System.arraycopy(byArray, n2, byArray, this.d, n5);
                this.d += n5;
                n3 = 0;
                n2 = n4 -= n5;
                if (n4 == 0) {
                    return;
                }
            }
            do {
                n4 = Math.min(n2, this.d - n3);
                byArray = this.a;
                System.arraycopy(byArray, n3, byArray, this.d, n4);
                this.d = n5 = this.d + n4;
                n2 = n4 = n2 - n4;
            } while (n4 > 0);
            if (this.e < n5) {
                this.e = n5;
            }
            return;
        }
        throw new f();
    }

    public final void i() {
        int n2 = this.g;
        if (n2 > 0) {
            this.h(this.h, n2);
        }
    }

    public final void j() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.a[this.b - 1] = 0;
    }

    public final void k(int n2) {
        int n3 = this.b;
        int n4 = this.d;
        this.f = n3 - n4 <= n2 ? n3 : n4 + n2;
    }
}

