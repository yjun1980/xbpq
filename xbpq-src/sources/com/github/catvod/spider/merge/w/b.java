package com.github.catvod.spider.merge.w;

import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class b {
    private final byte[][] a;
    private final int b;
    private final int c;

    public b(int i, int i2) {
        this.a = (byte[][]) Array.newInstance((Class<?>) byte.class, i2, i);
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                this.a[i][i2] = -1;
            }
        }
    }

    public final byte b(int i, int i2) {
        return this.a[i2][i];
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

    public final void f(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public final void g(int i, int i2, boolean z) {
        this.a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.a[i][i2];
                sb.append(b != 0 ? b != 1 ? cYh.d("4770") : cYh.d("4761") : cYh.d("4760"));
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
