/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w;

import com.github.catvod.spider.merge.cYh;

public final class b {
    private final byte[][] a;
    private final int b;
    private final int c;

    public b(int n2, int n3) {
        this.a = new byte[n3][n2];
        this.b = n2;
        this.c = n3;
    }

    public final void a() {
        for (int i2 = 0; i2 < this.c; ++i2) {
            for (int i3 = 0; i3 < this.b; ++i3) {
                this.a[i2][i3] = -1;
            }
        }
    }

    public final byte b(int n2, int n3) {
        return this.a[n3][n2];
    }

    public final byte[][] c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final void f(int n2, int n3, int n4) {
        this.a[n3][n2] = (byte)n4;
    }

    public final void g(int n2, int n3, boolean bl) {
        this.a[n3][n2] = (byte)(bl ? 1 : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.b * 2 * this.c + 2);
        for (int i2 = 0; i2 < this.c; ++i2) {
            for (int i3 = 0; i3 < this.b; ++i3) {
                byte by = this.a[i2][i3];
                String string = by != 0 ? (by != 1 ? cYh.d("4770") : cYh.d("4761")) : cYh.d("4760");
                stringBuilder.append(string);
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}

