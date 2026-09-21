/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.a;
import com.github.catvod.spider.merge.P1.f;
import com.github.catvod.spider.merge.P1.q;
import com.github.catvod.spider.merge.P1.t;
import com.github.catvod.spider.merge.P1.u;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class v
extends InputStream {
    private final a a;
    private final int b;
    private InputStream c;
    private q d;
    private final boolean e;
    private boolean f;
    private IOException g;
    private final byte[] h;

    public v(InputStream inputStream) {
        a a2 = com.github.catvod.spider.merge.P1.a.a();
        this.f = false;
        this.g = null;
        this.h = new byte[1];
        this.a = a2;
        this.c = inputStream;
        this.b = -1;
        this.e = true;
        byte[] byArray = new byte[12];
        new DataInputStream(inputStream).readFully(byArray);
        this.d = new q(inputStream, -1, true, byArray, a2);
    }

    private void a() {
        InputStream inputStream = new DataInputStream(this.c);
        byte[] byArray = new byte[12];
        do {
            if (inputStream.read(byArray, 0, 1) == -1) {
                this.f = true;
                return;
            }
            inputStream.readFully(byArray, 1, 3);
        } while (byArray[0] == 0 && byArray[1] == 0 && byArray[2] == 0 && byArray[3] == 0);
        inputStream.readFully(byArray, 4, 8);
        try {
            inputStream = new q(this.c, this.b, this.e, byArray, this.a);
            this.d = inputStream;
            return;
        }
        catch (t t2) {
            throw new f("Garbage after a valid XZ Stream");
        }
    }

    @Override
    public final int available() {
        if (this.c != null) {
            Object object = this.g;
            if (object == null) {
                object = this.d;
                int n2 = object == null ? 0 : ((q)object).available();
                return n2;
            }
            throw object;
        }
        throw new u("Stream closed");
    }

    @Override
    public final void close() {
        if (this.c != null) {
            q q2 = this.d;
            if (q2 != null) {
                q2.a(false);
                this.d = null;
            }
            try {
                this.c.close();
            }
            finally {
                this.c = null;
            }
        }
    }

    @Override
    public final int read() {
        int n2 = this.read(this.h, 0, 1);
        int n3 = -1;
        if (n2 != -1) {
            n3 = this.h[0] & 0xFF;
        }
        return n3;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4;
        if (n2 >= 0 && n3 >= 0 && (n4 = n2 + n3) >= 0 && n4 <= byArray.length) {
            n4 = 0;
            if (n3 == 0) {
                return 0;
            }
            if (this.c != null) {
                IOException iOException = this.g;
                if (iOException == null) {
                    boolean bl = this.f;
                    int n5 = -1;
                    if (bl) {
                        return -1;
                    }
                    while (n3 > 0) {
                        block12: {
                            if (this.d != null) break block12;
                            this.a();
                            if (!this.f) break block12;
                            if (n4 == 0) {
                                n4 = n5;
                            }
                            return n4;
                        }
                        int n6 = this.d.read(byArray, n2, n3);
                        if (n6 > 0) {
                            n4 += n6;
                            n2 += n6;
                            n3 -= n6;
                            continue;
                        }
                        if (n6 != -1) continue;
                        try {
                            this.d = null;
                        }
                        catch (IOException iOException2) {
                            this.g = iOException2;
                            if (n4 != 0) break;
                            throw iOException2;
                        }
                    }
                    return n4;
                }
                throw iOException;
            }
            throw new u("Stream closed");
        }
        throw new IndexOutOfBoundsException();
    }
}

