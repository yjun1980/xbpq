/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.U0.b;
import com.github.catvod.spider.merge.U0.c;
import com.github.catvod.spider.merge.U0.d;
import com.github.catvod.spider.merge.U0.e;
import com.github.catvod.spider.merge.U0.f;
import java.util.Objects;

public final class a
extends b {
    com.github.catvod.spider.merge.c.b e;

    public a(com.github.catvod.spider.merge.U0.a a2) {
        com.github.catvod.spider.merge.c.b b2 = new com.github.catvod.spider.merge.c.b();
        this.d = a2;
        this.e = b2;
        this.a = new byte[((com.github.catvod.spider.merge.W0.a)a2).b()];
        this.b = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c(byte[] object, int n2) {
        int n3;
        int n4;
        int n5;
        int n6 = this.d.b();
        if (this.c) {
            if (this.b == n6) {
                if (n6 * 2 + n5 > ((byte[])object).length) {
                    this.b();
                    throw new f();
                }
                n6 = this.d.a(this.a, 0, (byte[])object, n5);
                this.b = 0;
            } else {
                n6 = 0;
            }
            com.github.catvod.spider.merge.c.b b2 = this.e;
            byte[] byArray = this.a;
            int n7 = this.b;
            Objects.requireNonNull(b2);
            byte by = (byte)(byArray.length - n7);
            while (true) {
                if (n7 >= byArray.length) {
                    n5 = this.d.a(this.a, 0, (byte[])object, (int)(n5 + n6)) + n6;
                    this.b();
                    return n5;
                }
                byArray[n7] = by;
                ++n7;
            }
        }
        if (this.b != n6) {
            this.b();
            throw new d("last block incomplete in decryption");
        }
        Object object2 = this.d;
        byte[] byArray = this.a;
        int n8 = object2.a(byArray, 0, byArray, 0);
        this.b = 0;
        object2 = this.e;
        byArray = this.a;
        Objects.requireNonNull(object2);
        int n9 = byArray[byArray.length - 1] & 0xFF;
        byte by = (byte)n9;
        n6 = n9 > byArray.length ? 1 : 0;
        int n10 = n9 == 0 ? 1 : 0;
        n10 = n6 | n10;
        for (n6 = 0; n6 < byArray.length; n10 |= n4 & n3, ++n6) {
            n4 = byArray.length - n6 <= n9 ? 1 : 0;
        }
        {
            n3 = byArray[n6] != by ? 1 : 0;
            continue;
        }
        if (n10 == 0) {
            n6 = n8 - n9;
            System.arraycopy(this.a, 0, object, n5, n6);
            n5 = n6;
            return n5;
        }
        try {
            e e2 = new e();
            throw e2;
        }
        finally {
            this.b();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int d(int n2) {
        byte[] byArray = this.a;
        int n3 = (n2 += this.b) % byArray.length;
        if (n3 == 0) {
            n3 = n2;
            if (!this.c) return n3;
            return n2 + byArray.length;
        }
        n2 -= n3;
        return n2 + byArray.length;
    }

    public final void e(boolean bl, c c2) {
        this.c = bl;
        this.b();
        if (c2 instanceof com.github.catvod.spider.merge.Y0.c) {
            c2 = (com.github.catvod.spider.merge.Y0.c)c2;
            Objects.requireNonNull(this.e);
            this.d.c(bl, null);
        } else {
            Objects.requireNonNull(this.e);
            this.d.c(bl, c2);
        }
    }

    public final int f(byte[] byArray, int n2, int n3, byte[] byArray2, int n4) {
        if (n3 >= 0) {
            int n5 = this.a();
            n4 = this.b + n3;
            byte[] byArray3 = this.a;
            int n6 = n4 % byArray3.length;
            int n7 = 0;
            n4 = n6 == 0 ? Math.max(0, n4 - byArray3.length) : (n4 -= n6);
            if (n4 > 0 && n4 + 0 > byArray2.length) {
                throw new f();
            }
            byArray3 = this.a;
            n4 = byArray3.length;
            int n8 = this.b;
            int n9 = n4 - n8;
            n6 = n2;
            n4 = n3;
            if (n3 > n9) {
                System.arraycopy(byArray, n2, byArray3, n8, n9);
                n4 = this.d.a(this.a, 0, byArray2, 0) + 0;
                this.b = 0;
                n3 -= n9;
                n2 += n9;
                while (n3 > this.a.length) {
                    n4 += this.d.a(byArray, n2, byArray2, 0 + n4);
                    n3 -= n5;
                    n2 += n5;
                }
                n7 = n4;
                n4 = n3;
                n6 = n2;
            }
            System.arraycopy(byArray, n6, this.a, this.b, n4);
            this.b += n4;
            return n7;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}

