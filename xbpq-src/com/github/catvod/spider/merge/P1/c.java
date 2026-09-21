/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.a;
import com.github.catvod.spider.merge.P1.b;
import com.github.catvod.spider.merge.P1.k;
import com.github.catvod.spider.merge.P1.p;
import com.github.catvod.spider.merge.P1.r;
import com.github.catvod.spider.merge.X1.d;
import com.github.catvod.spider.merge.X1.e;
import com.github.catvod.spider.merge.X1.f;
import com.github.catvod.spider.merge.X1.g;
import java.io.InputStream;

final class c
extends b
implements k {
    private final long a;
    private final int b;

    c(long l2, byte[] byArray) {
        block5: {
            block4: {
                int n2;
                block3: {
                    this.a = l2;
                    n2 = byArray.length;
                    if (n2 != 0) break block3;
                    this.b = 0;
                    break block4;
                }
                if (byArray.length != 4) break block5;
                n2 = 0;
                for (int i2 = 0; i2 < 4; ++i2) {
                    n2 |= (byArray[i2] & 0xFF) << i2 * 8;
                }
                this.b = n2;
            }
            return;
        }
        throw new r("Unsupported BCJ filter properties");
    }

    @Override
    public final InputStream b(InputStream inputStream, a object) {
        long l2 = this.a;
        object = l2 == 4L ? new g(this.b) : (l2 == 5L ? new d(this.b) : (l2 == 6L ? new com.github.catvod.spider.merge.X1.c(this.b) : (l2 == 7L ? new com.github.catvod.spider.merge.X1.a(this.b) : (l2 == 8L ? new com.github.catvod.spider.merge.X1.b(this.b) : (l2 == 9L ? new e(this.b) : null)))));
        return new p(inputStream, (f)object);
    }

    @Override
    public final int e() {
        int n2 = p.j;
        return 5;
    }
}

