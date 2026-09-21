/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.v8dtoa;

import com.github.catvod.spider.merge.C.a;

class DiyFp {
    static final boolean $assertionsDisabled = false;
    static final int kSignificandSize = 64;
    static final long kUint64MSB = Long.MIN_VALUE;
    private int e;
    private long f;

    DiyFp() {
        this.f = 0L;
        this.e = 0;
    }

    DiyFp(long l2, int n2) {
        this.f = l2;
        this.e = n2;
    }

    static DiyFp minus(DiyFp diyFp, DiyFp diyFp2) {
        diyFp = new DiyFp(diyFp.f, diyFp.e);
        diyFp.subtract(diyFp2);
        return diyFp;
    }

    static DiyFp normalize(DiyFp diyFp) {
        diyFp = new DiyFp(diyFp.f, diyFp.e);
        diyFp.normalize();
        return diyFp;
    }

    static DiyFp times(DiyFp diyFp, DiyFp diyFp2) {
        diyFp = new DiyFp(diyFp.f, diyFp.e);
        diyFp.multiply(diyFp2);
        return diyFp;
    }

    private static boolean uint64_gte(long l2, long l3) {
        int n2;
        int n3;
        boolean bl = false;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false || ((n3 = l2 < 0L ? 1 : 0) ^ (l4 = l4 > 0 ? (long)1 : (long)0) ^ (n2 = l3 < 0L ? 1 : 0)) != 0) {
            bl = true;
        }
        return bl;
    }

    int e() {
        return this.e;
    }

    long f() {
        return this.f;
    }

    void multiply(DiyFp diyFp) {
        long l2 = this.f;
        long l3 = l2 >>> 32;
        long l4 = diyFp.f;
        long l5 = l4 >>> 32;
        long l6 = l5 * (l2 &= 0xFFFFFFFFL);
        long l7 = l3 * (l4 &= 0xFFFFFFFFL);
        int n2 = this.e;
        this.e = diyFp.e + 64 + n2;
        this.f = l3 * l5 + (l7 >>> 32) + (l6 >>> 32) + ((l2 * l4 >>> 32) + (l7 & 0xFFFFFFFFL) + (0xFFFFFFFFL & l6) + 0x80000000L >>> 32);
    }

    void normalize() {
        int n2;
        long l2;
        long l3 = this.f;
        int n3 = this.e;
        while (true) {
            l2 = l3;
            n2 = n3;
            if ((0xFFC0000000000000L & l3) != 0L) break;
            l3 <<= 10;
            n3 -= 10;
        }
        while ((Long.MIN_VALUE & l2) == 0L) {
            l2 <<= 1;
            --n2;
        }
        this.f = l2;
        this.e = n2;
    }

    void setE(int n2) {
        this.e = n2;
    }

    void setF(long l2) {
        this.f = l2;
    }

    void subtract(DiyFp diyFp) {
        this.f -= diyFp.f;
    }

    public String toString() {
        StringBuilder stringBuilder = a.c("[DiyFp f:");
        stringBuilder.append(this.f);
        stringBuilder.append(", e:");
        stringBuilder.append(this.e);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

