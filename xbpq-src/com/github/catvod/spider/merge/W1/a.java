/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.W1;

import java.util.Arrays;

public abstract class a {
    int a = 0;
    int b = 0;

    public static final void e(short[] sArray) {
        Arrays.fill(sArray, (short)1024);
    }

    public final int a(short[] sArray, int n2) {
        this.f();
        short s2 = sArray[n2];
        int n3 = this.a;
        int n4 = (n3 >>> 11) * s2;
        int n5 = this.b;
        if ((n5 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ n4)) {
            this.a = n4;
            sArray[n2] = (short)(s2 + (2048 - s2 >>> 5));
            n2 = 0;
        } else {
            this.a = n3 - n4;
            this.b = n5 - n4;
            sArray[n2] = (short)(s2 - (s2 >>> 5));
            n2 = 1;
        }
        return n2;
    }

    public final int b(short[] sArray) {
        int n2;
        int n3 = 1;
        do {
            n3 = n2 = this.a(sArray, n3) | n3 << 1;
        } while (n2 < sArray.length);
        return n2 - sArray.length;
    }

    public final int c(int n2) {
        int n3;
        int n4;
        int n5 = 0;
        do {
            this.f();
            this.a = n3 = this.a >>> 1;
            int n6 = this.b;
            n4 = n6 - n3 >>> 31;
            this.b = n6 - (n3 & n4 - 1);
            n3 = n5 << 1 | 1 - n4;
            n4 = n2 - 1;
            n5 = n3;
            n2 = n4;
        } while (n4 != 0);
        return n3;
    }

    public final int d(short[] sArray) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        while (true) {
            int n5 = this.a(sArray, n4);
            n4 = n4 << 1 | n5;
            n3 |= n5 << n2;
            if (n4 >= sArray.length) {
                return n3;
            }
            ++n2;
        }
    }

    public abstract void f();
}

