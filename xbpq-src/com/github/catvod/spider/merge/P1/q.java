/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.a;
import com.github.catvod.spider.merge.P1.d;
import com.github.catvod.spider.merge.P1.f;
import com.github.catvod.spider.merge.P1.l;
import com.github.catvod.spider.merge.P1.r;
import com.github.catvod.spider.merge.P1.u;
import com.github.catvod.spider.merge.Q1.c;
import com.github.catvod.spider.merge.Q1.e;
import com.github.catvod.spider.merge.R1.b;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;

public final class q
extends InputStream {
    private InputStream a;
    private final a b;
    private final int c;
    private final b d;
    private final c e;
    private final boolean f;
    private d g;
    private final com.github.catvod.spider.merge.T1.a h;
    private boolean i;
    private IOException j;
    private final byte[] k;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    q(InputStream object, int n2, boolean bl, byte[] byArray, a a2) {
        block7: {
            block6: {
                this.g = null;
                this.h = new com.github.catvod.spider.merge.T1.a();
                this.i = false;
                this.j = null;
                this.k = new byte[1];
                this.b = a2;
                this.a = object;
                this.c = n2;
                this.f = bl;
                this.d = object = com.github.catvod.spider.merge.R1.a.c(byArray);
                n2 = ((b)object).a;
                if (n2 == 0) break block6;
                if (n2 != 1) {
                    if (n2 != 4) {
                        if (n2 != 10) throw new r(com.github.catvod.spider.merge.I.r.a("Unsupported Check ID ", n2));
                        try {
                            object = new e();
                        }
                        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                            throw new r(com.github.catvod.spider.merge.I.r.a("Unsupported Check ID ", n2));
                        }
                    } else {
                        object = new com.github.catvod.spider.merge.Q1.b();
                    }
                    break block7;
                } else {
                    object = new com.github.catvod.spider.merge.Q1.a();
                }
                break block7;
            }
            object = new com.github.catvod.spider.merge.Q1.d();
        }
        this.e = object;
    }

    private void b() {
        Object object = new byte[12];
        new DataInputStream(this.a).readFully((byte[])object);
        object = com.github.catvod.spider.merge.R1.a.b(object);
        boolean bl = this.d.a == object.a;
        if (bl && this.h.b() == object.b) {
            return;
        }
        throw new f("XZ Stream Footer does not match Stream Header");
    }

    public final void a(boolean bl) {
        if (this.a != null) {
            d d2 = this.g;
            if (d2 != null) {
                d2.close();
                this.g = null;
            }
            if (bl) {
                try {
                    this.a.close();
                }
                finally {
                    this.a = null;
                }
            }
        }
    }

    @Override
    public final int available() {
        if (this.a != null) {
            Object object = this.j;
            if (object == null) {
                object = this.g;
                int n2 = object == null ? 0 : ((d)object).available();
                return n2;
            }
            throw object;
        }
        throw new u("Stream closed");
    }

    @Override
    public final void close() {
        this.a(true);
    }

    @Override
    public final int read() {
        int n2 = this.read(this.k, 0, 1);
        int n3 = -1;
        if (n2 != -1) {
            n3 = this.k[0] & 0xFF;
        }
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
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
        n4 = 0;
        if (n3 == 0) {
            return 0;
        }
        if (this.a == null) throw new u("Stream closed");
        Object object = this.j;
        if (object != null) throw object;
        boolean bl = this.i;
        int n5 = -1;
        if (bl) {
            return -1;
        }
        while (n3 > 0) {
            try {
                int n6;
                object = this.g;
                if (object == null) {
                    try {
                        this.g = object = new d(this.a, this.e, this.f, this.c, this.b);
                    }
                    catch (l l2) {
                        this.h.c(this.a);
                        this.b();
                        this.i = true;
                        n2 = n5;
                        if (n4 <= 0) return n2;
                        return n4;
                    }
                }
                if ((n6 = this.g.read(byArray, n2, n3)) > 0) {
                    n4 += n6;
                    n2 += n6;
                    n3 -= n6;
                    continue;
                }
                if (n6 != -1) continue;
            }
            catch (IOException iOException) {
                this.j = iOException;
                if (n4 == 0) throw iOException;
                return n4;
            }
            {
                this.h.a(this.g.b(), this.g.a());
                this.g = null;
            }
        }
        return n4;
    }
}

