/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.j;
import com.github.catvod.spider.merge.cYh;
import java.nio.charset.StandardCharsets;

final class i
extends j {
    private final byte[] c;

    i(int n2, int n3, byte[] byArray) {
        super(n3);
        this.c = byArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int f(int n2) {
        n2 = Integer.signum(1);
        if (n2 != -1) {
            if (n2 == 0) return 0;
            if (n2 != 1) throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
            n2 = this.b + 1 - 1;
            if (n2 >= this.a) {
                return -1;
            }
            n2 = this.c[n2];
            return n2 & 0xFF;
        } else {
            n2 = this.b + 1;
            if (n2 < 0) {
                return -1;
            }
            n2 = this.c[n2];
        }
        return n2 & 0xFF;
    }

    @Override
    public final String h(com.github.catvod.spider.merge.S.i i2) {
        int n2 = Math.min(i2.a, this.a);
        int n3 = Math.min(i2.b - i2.a + 1, this.a - n2);
        return new String(this.c, n2, n3, StandardCharsets.ISO_8859_1);
    }
}

