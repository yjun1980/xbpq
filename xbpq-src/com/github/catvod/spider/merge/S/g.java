/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import java.util.Arrays;

public class g {
    private static int[] c = new int[0];
    private int[] a = c;
    private int b;

    public final void a(int n2) {
        int[] nArray = this.a;
        int n3 = nArray.length;
        int n4 = this.b;
        if (n3 == n4) {
            int n5 = n4 + 1;
            if (n5 >= 0 && n5 <= 0x7FFFFFF7) {
                n4 = nArray.length == 0 ? 4 : nArray.length;
                while (n4 < n5) {
                    n3 = n4 * 2;
                    if (n3 >= 0) {
                        n4 = n3;
                        if (n3 <= 0x7FFFFFF7) continue;
                    }
                    n4 = 0x7FFFFFF7;
                }
                this.a = Arrays.copyOf(this.a, n4);
            } else {
                throw new OutOfMemoryError();
            }
        }
        nArray = this.a;
        n4 = this.b;
        nArray[n4] = n2;
        this.b = n4 + 1;
    }

    public final void b() {
        Arrays.fill(this.a, 0, this.b, 0);
        this.b = 0;
    }

    public final int c(int n2) {
        if (n2 >= 0 && n2 < this.b) {
            return this.a[n2];
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean d() {
        boolean bl = this.b == 0;
        return bl;
    }

    public final int e(int n2) {
        int n3;
        if (n2 >= 0 && n2 < (n3 = this.b)) {
            int[] nArray = this.a;
            int n4 = nArray[n2];
            System.arraycopy(nArray, n2 + 1, nArray, n2, n3 - n2 - 1);
            nArray = this.a;
            n2 = this.b;
            nArray[n2 - 1] = 0;
            this.b = n2 - 1;
            return n4;
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        if (this.b != ((g)object).b) {
            return false;
        }
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (this.a[i2] == ((g)object).a[i2]) continue;
            return false;
        }
        return true;
    }

    public final int f() {
        return this.b;
    }

    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.b; ++i2) {
            n2 = n2 * 31 + this.a[i2];
        }
        return n2;
    }

    public final String toString() {
        int n2 = this.b;
        int[] nArray = n2 == 0 ? c : Arrays.copyOf(this.a, n2);
        return Arrays.toString(nArray);
    }
}

