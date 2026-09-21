/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.j;
import com.github.catvod.spider.merge.S.i;
import com.github.catvod.spider.merge.cYh;

final class g
extends j {
    private final char[] c;

    g(int n2, int n3, char[] cArray) {
        super(n3);
        this.c = cArray;
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
            return n2 & 0xFFFF;
        } else {
            n2 = this.b + 1;
            if (n2 < 0) {
                return -1;
            }
            n2 = this.c[n2];
        }
        return n2 & 0xFFFF;
    }

    @Override
    public final String h(i i2) {
        int n2 = Math.min(i2.a, this.a);
        int n3 = Math.min(i2.b - i2.a + 1, this.a - n2);
        return new String(this.c, n2, n3);
    }
}

