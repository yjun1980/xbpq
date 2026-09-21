/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.a;
import com.github.catvod.spider.merge.P1.j;
import com.github.catvod.spider.merge.P1.k;
import com.github.catvod.spider.merge.P1.n;
import com.github.catvod.spider.merge.P1.r;
import java.io.InputStream;

final class m
implements k,
j {
    private int a;

    m(byte[] byArray) {
        if (byArray.length == 1 && (byArray[0] & 0xFF) <= 37) {
            int n2;
            this.a = n2 = byArray[0] & 1 | 2;
            this.a = n2 << (byArray[0] >>> 1) + 11;
            return;
        }
        throw new r("Unsupported LZMA2 properties");
    }

    @Override
    public final InputStream b(InputStream inputStream, a a2) {
        return new n(inputStream, this.a, a2);
    }

    @Override
    public final int e() {
        return n.c(this.a);
    }
}

