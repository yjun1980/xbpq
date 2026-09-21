/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.u;
import com.github.catvod.spider.merge.X1.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

final class p
extends InputStream {
    public static final int j = 0;
    private InputStream a;
    private final f b;
    private final byte[] c = new byte[4096];
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private IOException h = null;
    private final byte[] i = new byte[1];

    p(InputStream inputStream, f f2) {
        Objects.requireNonNull(inputStream);
        this.a = inputStream;
        this.b = f2;
    }

    @Override
    public final int available() {
        if (this.a != null) {
            IOException iOException = this.h;
            if (iOException == null) {
                return this.e;
            }
            throw iOException;
        }
        throw new u("Stream closed");
    }

    @Override
    public final void close() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                inputStream.close();
            }
            finally {
                this.a = null;
            }
        }
    }

    @Override
    public final int read() {
        int n2 = this.read(this.i, 0, 1);
        int n3 = -1;
        if (n2 != -1) {
            n3 = this.i[0] & 0xFF;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (n2 < 0) throw new IndexOutOfBoundsException();
        if (n3 < 0) throw new IndexOutOfBoundsException();
        int n4 = n2 + n3;
        if (n4 < 0) throw new IndexOutOfBoundsException();
        if (n4 > byArray.length) throw new IndexOutOfBoundsException();
        if (n3 == 0) {
            return 0;
        }
        if (this.a == null) throw new u("Stream closed");
        Object object = this.h;
        if (object != null) throw object;
        n4 = 0;
        try {
            while (true) {
                int n6;
                int n7;
                int n8 = Math.min(this.e, n3);
                System.arraycopy(this.c, this.d, byArray, n2, n8);
                this.d = n7 = this.d + n8;
                this.e = n6 = this.e - n8;
                int n5 = n2 + n8;
                n3 -= n8;
                n2 = n4 + n8;
                n4 = this.f;
                if (n7 + n6 + n4 == 4096) {
                    object = this.c;
                    System.arraycopy(object, n7, object, 0, n6 + n4);
                    this.d = 0;
                }
                if (n3 == 0 || this.g) break;
                n4 = this.d;
                n7 = this.e;
                n6 = this.f;
                if ((n4 = this.a.read(this.c, n4 + n7 + n6, 4096 - (n4 + n7 + n6))) == -1) {
                    this.g = true;
                    this.e = this.f;
                    this.f = 0;
                    n4 = n2;
                    n2 = n5;
                    continue;
                }
                this.f = n4 = this.f + n4;
                this.e = n4 = this.b.a(this.c, this.d, n4);
                this.f -= n4;
                n4 = n2;
                n2 = n5;
            }
            if (n2 <= 0) return -1;
            return n2;
        }
        catch (IOException iOException) {
            this.h = iOException;
            throw iOException;
        }
    }
}

