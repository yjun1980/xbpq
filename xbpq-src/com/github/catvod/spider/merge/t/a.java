/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.t.b;

public final class a {
    public static final a g = new a(4201, 4096, 1);
    public static final a h = new a(1033, 1024, 1);
    public static final a i = new a(67, 64, 1);
    public static final a j = new a(19, 16, 1);
    public static final a k = new a(285, 256, 0);
    public static final a l = new a(301, 256, 1);
    private final int[] a;
    private final int[] b;
    private final b c;
    private final int d;
    private final int e;
    private final int f;

    public a(int n2, int n3, int n4) {
        this.e = n2;
        this.d = n3;
        this.f = n4;
        this.a = new int[n3];
        this.b = new int[n3];
        n4 = 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5;
            this.a[i2] = n4;
            n4 = n5 = n4 << 1;
            if (n5 < n3) continue;
            n4 = (n5 ^ n2) & n3 - 1;
        }
        for (n2 = 0; n2 < n3 - 1; ++n2) {
            this.b[this.a[n2]] = n2;
        }
        this.c = new b(this, new int[]{0});
        new b(this, new int[]{1});
    }

    final b a(int n2, int n3) {
        if (n2 >= 0) {
            if (n3 == 0) {
                return this.c;
            }
            int[] nArray = new int[n2 + 1];
            nArray[0] = n3;
            return new b(this, nArray);
        }
        throw new IllegalArgumentException();
    }

    final int b(int n2) {
        return this.a[n2];
    }

    public final int c() {
        return this.f;
    }

    final b d() {
        return this.c;
    }

    final int e(int n2) {
        if (n2 != 0) {
            return this.a[this.d - this.b[n2] - 1];
        }
        throw new ArithmeticException();
    }

    final int f(int n2) {
        if (n2 != 0) {
            return this.b[n2];
        }
        throw new IllegalArgumentException();
    }

    final int g(int n2, int n3) {
        if (n2 != 0 && n3 != 0) {
            int[] nArray = this.a;
            int[] nArray2 = this.b;
            return nArray[(nArray2[n2] + nArray2[n3]) % (this.d - 1)];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(cYh.d("201669612F"));
        stringBuilder.append(Integer.toHexString(this.e));
        stringBuilder.append(',');
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

