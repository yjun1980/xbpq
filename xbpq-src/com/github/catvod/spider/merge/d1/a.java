/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.c1.d;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;

public final class a
extends BufferedInputStream {
    private final boolean a;
    private final int b;
    private int c;
    private boolean d;

    private a(InputStream inputStream, int n2) {
        super(inputStream, 32768);
        boolean bl = false;
        boolean bl2 = n2 >= 0;
        com.github.catvod.spider.merge.c1.d.f(bl2);
        this.b = n2;
        this.c = n2;
        bl2 = bl;
        if (n2 != 0) {
            bl2 = true;
        }
        this.a = bl2;
        System.nanoTime();
    }

    public static a a(InputStream inputStream, int n2) {
        inputStream = inputStream instanceof a ? (a)inputStream : new a(inputStream, n2);
        return inputStream;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (!(this.d || this.a && this.c <= 0)) {
            if (Thread.interrupted()) {
                this.d = true;
                return -1;
            }
            int n4 = n3;
            if (this.a) {
                int n5 = this.c;
                n4 = n3;
                if (n3 > n5) {
                    n4 = n5;
                }
            }
            try {
                n2 = super.read(byArray, n2, n4);
                this.c -= n2;
                return n2;
            }
            catch (SocketTimeoutException socketTimeoutException) {
                return 0;
            }
        }
        return -1;
    }

    @Override
    public final void reset() {
        super.reset();
        this.c = this.b - this.markpos;
    }
}

