/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

public final class a {
    public byte[] a;
    public int b;

    public a() {
        this.a = new byte[64];
    }

    public a(int n2) {
        this.a = new byte[n2];
    }

    private void a(int n2) {
        byte[] byArray = this.a;
        int n3 = byArray.length * 2;
        int n4 = this.b;
        if (n3 > (n2 += n4)) {
            n2 = n3;
        }
        byte[] byArray2 = new byte[n2];
        System.arraycopy(byArray, 0, byArray2, 0, n4);
        this.a = byArray2;
    }

    final a b(int n2, int n3) {
        int n4 = this.b;
        if (n4 + 2 > this.a.length) {
            this.a(2);
        }
        byte[] byArray = this.a;
        int n5 = n4 + 1;
        byArray[n4] = (byte)n2;
        byArray[n5] = (byte)n3;
        this.b = n5 + 1;
        return this;
    }

    public final a c(int n2, int n3) {
        int n4 = this.b;
        if (n4 + 3 > this.a.length) {
            this.a(3);
        }
        byte[] byArray = this.a;
        int n5 = n4 + 1;
        byArray[n4] = (byte)n2;
        n2 = n5 + 1;
        byArray[n5] = (byte)(n3 >>> 8);
        byArray[n2] = (byte)n3;
        this.b = n2 + 1;
        return this;
    }

    public final a d(int n2) {
        int n3 = this.b;
        int n4 = n3 + 1;
        if (n4 > this.a.length) {
            this.a(1);
        }
        this.a[n3] = (byte)n2;
        this.b = n4;
        return this;
    }

    public final a e(byte[] byArray, int n2) {
        if (this.b + n2 > this.a.length) {
            this.a(n2);
        }
        if (byArray != null) {
            System.arraycopy(byArray, 0, this.a, this.b, n2);
        }
        this.b += n2;
        return this;
    }

    public final a f(int n2) {
        int n3 = this.b;
        if (n3 + 4 > this.a.length) {
            this.a(4);
        }
        byte[] byArray = this.a;
        int n4 = n3 + 1;
        byArray[n3] = (byte)(n2 >>> 24);
        n3 = n4 + 1;
        byArray[n4] = (byte)(n2 >>> 16);
        n4 = n3 + 1;
        byArray[n3] = (byte)(n2 >>> 8);
        byArray[n4] = (byte)n2;
        this.b = n4 + 1;
        return this;
    }

    public final a g(int n2) {
        int n3 = this.b;
        if (n3 + 2 > this.a.length) {
            this.a(2);
        }
        byte[] byArray = this.a;
        int n4 = n3 + 1;
        byArray[n3] = (byte)(n2 >>> 8);
        byArray[n4] = (byte)n2;
        this.b = n4 + 1;
        return this;
    }

    public final a h(String string) {
        int n2 = this.b;
        int n3 = string.length();
        if (n2 + 2 + n3 > this.a.length) {
            this.a(n3 + 2);
        }
        byte[] byArray = this.a;
        int n4 = n2 + 1;
        byArray[n2] = (byte)(n3 >>> 8);
        n2 = n4 + 1;
        byArray[n4] = (byte)n3;
        n4 = 0;
        while (n4 < n3) {
            char c2 = string.charAt(n4);
            if (c2 >= '\u0001' && c2 <= '\u007f' || c2 >= '\u4e00' && c2 <= '\u9fff') {
                byArray[n2] = (byte)c2;
                ++n4;
                ++n2;
                continue;
            }
            throw new UnsupportedOperationException();
        }
        this.b = n2;
        return this;
    }
}

