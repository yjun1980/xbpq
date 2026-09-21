/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.a1.a;
import com.github.catvod.spider.merge.a1.e;

final class i {
    private int a;
    int[] b;
    int[] c;

    i() {
    }

    static void a(i i2, a a2) {
        int n2 = i2.c.length;
        int n3 = 0;
        for (int i4 = 0; i4 < n2; ++i4) {
            i2.c[i4] = n3;
            e.g(i2.a, i2.b, n3, a2);
            n3 += 1080;
        }
    }

    static void b(i i2, int n2, int n3) {
        i2.a = n2;
        i2.b = new int[n3 * 1080];
        i2.c = new int[n3];
    }
}

