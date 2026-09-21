/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.A.a;

public final class g {
    int a;
    int b;
    private int c;
    private int[] d;

    private void a(int n2, int n3, int n4) {
        int n5;
        int[] nArray;
        int[] nArray2;
        int n6;
        if (this.d == null) {
            this.d = new int[6];
        }
        if ((n6 = this.c) >= (nArray2 = this.d).length) {
            nArray = new int[nArray2.length + 6];
            System.arraycopy(nArray2, 0, nArray, 0, nArray2.length);
            this.d = nArray;
        }
        nArray = this.d;
        n6 = this.c;
        this.c = n5 = n6 + 1;
        nArray[n6] = n2;
        this.c = n5 + 1;
        nArray[n5] = n3 | n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void b(a a2, int n2, boolean bl) {
        int n3;
        block5: {
            block4: {
                block2: {
                    block3: {
                        if ((this.a & 2) != 0) break block2;
                        n3 = -1;
                        if (!bl) break block3;
                        this.a(n2, a2.b, 0x20000000);
                        n2 = n3;
                        break block4;
                    }
                    this.a(n2, a2.b, 0x10000000);
                    break block5;
                }
                n3 = n2 = this.b - n2;
                if (!bl) break block5;
            }
            a2.f(n2);
            return;
        }
        a2.g(n3);
    }

    final void c(int n2, byte[] byArray) {
        this.a |= 2;
        this.b = n2;
        int n3 = 0;
        while (n3 < this.c) {
            int[] nArray = this.d;
            int n4 = n3 + 1;
            int n5 = nArray[n3];
            int n6 = nArray[n4];
            n3 = 0xFFFFFFF & n6;
            n5 = n2 - n5;
            if ((n6 & 0xF0000000) == 0x10000000) {
                byArray[n3] = (byte)(n5 >>> 8);
                byArray[n3 + 1] = (byte)n5;
            } else {
                n6 = n3 + 1;
                byArray[n3] = (byte)(n5 >>> 24);
                n3 = n6 + 1;
                byArray[n6] = (byte)(n5 >>> 16);
                byArray[n3] = (byte)(n5 >>> 8);
                byArray[n3 + 1] = (byte)n5;
            }
            n3 = n4 + 1;
        }
    }
}

