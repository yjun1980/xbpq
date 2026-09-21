/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.merge.UY.m;
import java.util.Arrays;

class AppDrama$ProtoReader {
    public final byte[] a;
    public int b;
    public int c;
    public int d;
    public int e;

    public AppDrama$ProtoReader(byte[] byArray) {
        byte[] byArray2 = byArray;
        if (byArray == null) {
            byArray2 = new byte[]{};
        }
        this.a = byArray2;
    }

    public final byte[] a() {
        int n2 = this.c;
        int n3 = this.d;
        byte[] byArray = this.a;
        return Arrays.copyOfRange(byArray, n2, Math.max(n2, Math.min(n3, byArray.length)));
    }

    public final boolean b() {
        int n2;
        if (this.b >= this.a.length) {
            return false;
        }
        long l2 = this.c();
        this.e = (int)(l2 >> 3);
        int n3 = (int)(l2 & 7L);
        this.c = n2 = this.b;
        if (n3 == 0) {
            this.c();
            this.d = this.b;
        } else if (n3 == 1) {
            this.b = n2 += 8;
            this.d = n2;
        } else if (n3 == 2) {
            n3 = (int)this.c();
            this.c = n2 = this.b;
            this.b = n2 += n3;
            this.d = n2;
        } else if (n3 == 5) {
            this.b = n2 += 4;
            this.d = n2;
        } else {
            this.d = n2;
        }
        return true;
    }

    public final long c() {
        byte[] byArray;
        int n2;
        long l2 = 0L;
        int n3 = 0;
        while ((n2 = this.b) < (byArray = this.a).length) {
            this.b = n2 + 1;
            n2 = byArray[n2];
            l2 |= (long)(n2 & 0x7F) << n3;
            if ((n2 & 0x80) == 0) {
                return l2;
            }
            n3 += 7;
        }
        return l2;
    }

    public final String d() {
        return new String(this.a(), m.m());
    }
}

