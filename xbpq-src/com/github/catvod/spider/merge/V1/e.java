/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V1;

import com.github.catvod.spider.merge.V1.a;
import com.github.catvod.spider.merge.V1.d;
import com.github.catvod.spider.merge.V1.f;

final class e
extends a {
    private final d[] c;
    final f d;

    e(f dArray, int n2, int n3) {
        this.d = dArray;
        super(n2, n3);
        this.c = new d[1 << n2 + n3];
        for (n2 = 0; n2 < (dArray = this.c).length; ++n2) {
            dArray[n2] = new d(this);
        }
    }

    final void b() {
        int n2;
        int n3 = this.a(f.a(this.d).c(0), f.a(this.d).d());
        d d2 = this.c[n3];
        boolean bl = d2.b.d.c.b();
        n3 = 1;
        if (bl) {
            do {
                n3 = n2 = f.b(d2.b.d).a(d2.a, n3) | n3 << 1;
            } while (n2 < 256);
        } else {
            int n4;
            int n5 = f.a(d2.b.d).c(d2.b.d.b[0]);
            n2 = 256;
            n3 = 1;
            do {
                int n6 = (n5 <<= 1) & n2;
                int n7 = f.b(d2.b.d).a(d2.a, n2 + n6 + n3);
                n4 = n3 << 1 | n7;
                n2 &= ~n6 ^ 0 - n7;
                n3 = n4;
            } while (n4 < 256);
            n2 = n4;
        }
        f.a(d2.b.d).g((byte)n2);
        d2.b.d.c.d();
    }

    final void c() {
        d[] dArray;
        for (int i2 = 0; i2 < (dArray = this.c).length; ++i2) {
            com.github.catvod.spider.merge.W1.a.e(dArray[i2].a);
        }
    }
}

