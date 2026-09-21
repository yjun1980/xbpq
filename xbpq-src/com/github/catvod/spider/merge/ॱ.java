/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.Arrays;

public class \u0971 {
    private static int[] \u037f = new int[0];
    private int[] \u0528 = \u037f;
    private int \u0529;

    private void \u0529(int n2) {
        if (n2 >= 0 && n2 <= 0x7FFFFFF7) {
            int[] nArray = this.\u0528;
            int n3 = nArray.length == 0 ? 4 : nArray.length;
            while (n3 < n2) {
                int n4 = n3 * 2;
                if (n4 >= 0) {
                    n3 = n4;
                    if (n4 <= 0x7FFFFFF7) continue;
                }
                n3 = 0x7FFFFFF7;
            }
            this.\u0528 = Arrays.copyOf(this.\u0528, n3);
            return;
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError();
        throw outOfMemoryError;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof \u0971)) {
            return false;
        }
        object = (\u0971)object;
        if (this.\u0529 != ((\u0971)object).\u0529) {
            return false;
        }
        for (int i2 = 0; i2 < this.\u0529; ++i2) {
            if (this.\u0528[i2] == ((\u0971)object).\u0528[i2]) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.\u0529; ++i2) {
            n2 = n2 * 31 + this.\u0528[i2];
        }
        return n2;
    }

    public String toString() {
        return Arrays.toString(this.\u052e());
    }

    public final void \u037f(int n2) {
        int n3 = this.\u0528.length;
        int n4 = this.\u0529;
        if (n3 == n4) {
            this.\u0529(n4 + 1);
        }
        int[] nArray = this.\u0528;
        n3 = this.\u0529;
        nArray[n3] = n2;
        this.\u0529 = n3 + 1;
    }

    public final void \u0528() {
        Arrays.fill(this.\u0528, 0, this.\u0529, 0);
        this.\u0529 = 0;
    }

    public final int \u052a(int n2) {
        if (n2 >= 0 && n2 < this.\u0529) {
            return this.\u0528[n2];
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean \u052b() {
        boolean bl = this.\u0529 == 0;
        return bl;
    }

    public final int \u052c(int n2) {
        int n3 = this.\u052a(n2);
        int[] nArray = this.\u0528;
        System.arraycopy(nArray, n2 + 1, nArray, n2, this.\u0529 - n2 - 1);
        nArray = this.\u0528;
        n2 = this.\u0529;
        nArray[n2 - 1] = 0;
        this.\u0529 = n2 - 1;
        return n3;
    }

    public final int \u052d() {
        return this.\u0529;
    }

    public final int[] \u052e() {
        int n2 = this.\u0529;
        if (n2 == 0) {
            return \u037f;
        }
        return Arrays.copyOf(this.\u0528, n2);
    }
}

