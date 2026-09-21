/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.z0;

import com.github.catvod.spider.merge.xc.z0.b;
import java.util.Arrays;

public abstract class c {
    public static final byte[] e = new byte[]{13, 10};
    public final byte a;
    public final int b;
    public final int c;
    public final int d;

    public c(int n2, int n3) {
        n2 = n2 > 0 && n3 > 0 ? n2 / 4 * 4 : 0;
        this.b = n2;
        this.c = n3;
        this.a = (byte)61;
        this.d = 2;
    }

    public static byte[] a(int n2, b object) {
        block5: {
            int n3;
            block7: {
                byte[] byArray;
                block6: {
                    block4: {
                        byArray = ((b)object).b;
                        if (byArray != null) break block4;
                        ((b)object).b = new byte[Math.max(n2, 8192)];
                        ((b)object).c = 0;
                        ((b)object).d = 0;
                        break block5;
                    }
                    n3 = ((b)object).c + n2;
                    if (n3 - byArray.length <= 0) break block5;
                    n2 = byArray.length * 2;
                    int n4 = n2 ^ Integer.MIN_VALUE;
                    int n5 = n3 ^ Integer.MIN_VALUE;
                    if (n4 != n5 && n4 < n5) {
                        n2 = n3;
                    }
                    if ((n4 = Integer.MIN_VALUE ^ n2) == -9 || n4 < -9) break block6;
                    if (n3 < 0) break block7;
                    n2 = Math.max(n3, 0x7FFFFFF7);
                }
                ((b)object).b = byArray = Arrays.copyOf(((b)object).b, n2);
                return byArray;
            }
            object = new StringBuilder("Unable to allocate array size: ");
            ((StringBuilder)object).append((long)n3 & 0xFFFFFFFFL);
            throw new OutOfMemoryError(((StringBuilder)object).toString());
        }
        return ((b)object).b;
    }

    public static void b(byte[] byArray, int n2, b b2) {
        int n3 = b2.c;
        int n4 = b2.d;
        int n5 = n3 > n4 ? 1 : 0;
        if (n5 != 0) {
            n5 = n3 > n4 ? n3 - n4 : 0;
            n2 = Math.min(n5, n2);
            System.arraycopy(b2.b, b2.d, byArray, 0, n2);
            b2.d = n2 = b2.d + n2;
            if (b2.c <= n2) {
                b2.d = 0;
                b2.c = 0;
            }
        }
    }
}

