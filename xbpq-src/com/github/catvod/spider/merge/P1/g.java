/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.e;
import java.io.InputStream;

final class g
extends e {
    private long a = 0L;

    public g(InputStream inputStream) {
        super(inputStream);
    }

    public final long a() {
        return this.a;
    }

    @Override
    public final int read() {
        long l2;
        int n2 = this.in.read();
        if (n2 != -1 && (l2 = this.a) >= 0L) {
            this.a = l2 + 1L;
        }
        return n2;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        long l2;
        if ((n2 = this.in.read(byArray, n2, n3)) > 0 && (l2 = this.a) >= 0L) {
            this.a = l2 + (long)n2;
        }
        return n2;
    }
}

