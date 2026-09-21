/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.u;
import com.github.catvod.spider.merge.S1.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class i
extends InputStream {
    private InputStream a;
    private final a b;
    private IOException c = null;
    private final byte[] d = new byte[1];

    public i(InputStream inputStream, int n2) {
        Objects.requireNonNull(inputStream);
        this.a = inputStream;
        this.b = new a(n2);
    }

    @Override
    public final int available() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            IOException iOException = this.c;
            if (iOException == null) {
                return inputStream.available();
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
        int n2 = this.read(this.d, 0, 1);
        int n3 = -1;
        if (n2 != -1) {
            n3 = this.d[0] & 0xFF;
        }
        return n3;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        InputStream inputStream = this.a;
        if (inputStream != null) {
            IOException iOException = this.c;
            if (iOException == null) {
                try {
                    n3 = inputStream.read(byArray, n2, n3);
                    if (n3 == -1) {
                        return -1;
                    }
                    this.b.a(byArray, n2, n3);
                    return n3;
                }
                catch (IOException iOException2) {
                    this.c = iOException2;
                    throw iOException2;
                }
            }
            throw iOException;
        }
        throw new u("Stream closed");
    }
}

