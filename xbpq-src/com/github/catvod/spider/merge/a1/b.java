/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.a1.a;
import com.github.catvod.spider.merge.a1.c;
import com.github.catvod.spider.merge.a1.e;
import com.github.catvod.spider.merge.a1.l;
import java.io.IOException;
import java.io.InputStream;

public final class b
extends InputStream {
    private byte[] a;
    private int b;
    private int c;
    private final l d;

    public b(InputStream inputStream) {
        l l2;
        this.d = l2 = new l();
        if (inputStream != null) {
            this.a = new byte[16384];
            this.b = 0;
            this.c = 0;
            try {
                l.a(l2, inputStream);
                return;
            }
            catch (c c2) {
                throw new IOException("Brotli decoder initialization failed", c2);
            }
        }
        throw new IllegalArgumentException("source is null");
    }

    @Override
    public final void close() {
        l l2 = this.d;
        int n2 = l2.a;
        if (n2 != 0) {
            if (n2 != 11) {
                l2.a = 11;
                com.github.catvod.spider.merge.a1.a.b(l2.c);
            }
            return;
        }
        throw new IllegalStateException("State MUST be initialized");
    }

    @Override
    public final int read() {
        int n2;
        byte[] byArray;
        if (this.c >= this.b) {
            byArray = this.a;
            this.b = n2 = this.read(byArray, 0, byArray.length);
            this.c = 0;
            if (n2 == -1) {
                return -1;
            }
        }
        byArray = this.a;
        n2 = this.c;
        this.c = n2 + 1;
        return byArray[n2] & 0xFF;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (n2 >= 0) {
            if (n3 >= 0) {
                int n4 = n2 + n3;
                if (n4 <= byArray.length) {
                    int n5;
                    if (n3 == 0) {
                        return 0;
                    }
                    n4 = n5 = Math.max(this.b - this.c, 0);
                    int n6 = n2;
                    int n7 = n3;
                    if (n5 != 0) {
                        n5 = Math.min(n5, n3);
                        System.arraycopy(this.a, this.c, byArray, n2, n5);
                        this.c += n5;
                        n6 = n2 + n5;
                        n2 = n3 - n5;
                        n4 = n5;
                        n7 = n2;
                        if (n2 == 0) {
                            return n5;
                        }
                    }
                    try {
                        l l2 = this.d;
                        l2.Y = byArray;
                        l2.T = n6;
                        l2.U = n7;
                        l2.V = 0;
                        e.e(l2);
                        n2 = this.d.V;
                        if (n2 == 0) {
                            return -1;
                        }
                        return n2 + n4;
                    }
                    catch (c c2) {
                        throw new IOException("Brotli stream decoding failed", c2);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Buffer overflow: ");
                stringBuilder.append(n4);
                stringBuilder.append(" > ");
                stringBuilder.append(byArray.length);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new IllegalArgumentException(r.a("Bad length: ", n3));
        }
        throw new IllegalArgumentException(r.a("Bad offset: ", n2));
    }
}

