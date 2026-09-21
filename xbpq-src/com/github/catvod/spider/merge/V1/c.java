/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V1;

import com.github.catvod.spider.merge.V1.f;
import com.github.catvod.spider.merge.W1.a;

final class c {
    final short[] a;
    final short[][] b;
    final short[][] c;
    final short[] d;
    final f e;

    c(f f2) {
        this.e = f2;
        this.a = new short[2];
        this.b = new short[16][8];
        this.c = new short[16][8];
        this.d = new short[256];
    }

    final int a(int n2) {
        if (f.b(this.e).a(this.a, 0) == 0) {
            return f.b(this.e).b(this.b[n2]) + 2;
        }
        if (f.b(this.e).a(this.a, 1) == 0) {
            return f.b(this.e).b(this.c[n2]) + 2 + 8;
        }
        return f.b(this.e).b(this.d) + 2 + 8 + 8;
    }

    final void b() {
        com.github.catvod.spider.merge.W1.a.e(this.a);
        int n2 = 0;
        int n3 = 0;
        while (true) {
            short[][] sArray = this.b;
            if (n3 >= sArray.length) break;
            com.github.catvod.spider.merge.W1.a.e(sArray[n3]);
            ++n3;
        }
        for (int i2 = n2; i2 < this.b.length; ++i2) {
            com.github.catvod.spider.merge.W1.a.e(this.c[i2]);
        }
        com.github.catvod.spider.merge.W1.a.e(this.d);
    }
}

