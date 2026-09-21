/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u0864;
import com.github.catvod.spider.merge.\u0cf1;
import com.github.catvod.spider.merge.\u0d54;
import java.util.Arrays;

public class \u0cf2 {
    private final \u0cf1[] \u037f;
    private final int \u0528;

    public \u0cf2(\u0cf1[] \u0cf1Array) {
        this.\u037f = \u0cf1Array;
        int n2 = \u02c6.\u0529();
        int n3 = \u0cf1Array.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = \u02c6.\u052c(n2, \u0cf1Array[i2]);
        }
        this.\u0528 = \u02c6.\u037f(n2, \u0cf1Array.length);
    }

    public static \u0cf2 \u037f(\u0cf2 \u0cf1Array, \u0cf1 \u0cf12) {
        if (\u0cf1Array == null) {
            return new \u0cf2(new \u0cf1[]{\u0cf12});
        }
        \u0cf1Array = \u0cf1Array.\u037f;
        \u0cf1Array = Arrays.copyOf(\u0cf1Array, \u0cf1Array.length + 1);
        \u0cf1Array[\u0cf1Array.length - 1] = \u0cf12;
        return new \u0cf2(\u0cf1Array);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof \u0cf2)) {
            return false;
        }
        object = (\u0cf2)object;
        if (this.\u0528 != ((\u0cf2)object).\u0528 || !Arrays.equals(this.\u037f, ((\u0cf2)object).\u037f)) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return this.\u0528;
    }

    /*
     * WARNING - void declaration
     */
    public void \u0528(\u0864 \u08642, \u079f \u079f2, int n2) {
        void var1_4;
        block16: {
            int n3;
            block15: {
                int n4;
                int n5;
                \u0cf1[] \u0cf1Array;
                n3 = \u079f2.\u052d();
                int n6 = 0;
                try {
                    \u0cf1Array = this.\u037f;
                    n5 = \u0cf1Array.length;
                    n4 = 0;
                }
                catch (Throwable throwable) {
                    n2 = n6;
                }
                for (int i2 = 0; i2 < n5; ++i2) {
                    \u0cf1 \u0cf12;
                    int n7;
                    block14: {
                        block13: {
                            \u0cf1 \u0cf13;
                            block12: {
                                \u0cf13 = \u0cf1Array[i2];
                                n7 = n4;
                                try {
                                    if (!(\u0cf13 instanceof \u0d54)) break block12;
                                    n7 = n4;
                                }
                                catch (Throwable throwable) {
                                    n2 = n7;
                                    break block15;
                                }
                                n6 = ((\u0d54)\u0cf13).\u052a() + n2;
                                n7 = n4;
                                \u079f2.\u0529(n6);
                                n7 = n4;
                                \u0cf12 = \u0cf13 = ((\u0d54)\u0cf13).\u0529();
                                if (n6 == n3) break block13;
                                n6 = 1;
                                \u0cf12 = \u0cf13;
                                break block14;
                            }
                            n6 = n4;
                            \u0cf12 = \u0cf13;
                            n7 = n4;
                            if (!\u0cf13.\u037f()) break block14;
                            n7 = n4;
                            \u079f2.\u0529(n3);
                            \u0cf12 = \u0cf13;
                        }
                        n6 = 0;
                    }
                    n7 = n6;
                    \u0cf12.\u0528(\u08642);
                    n4 = n6;
                    continue;
                }
                if (n4 != 0) {
                    \u079f2.\u0529(n3);
                }
                return;
            }
            if (n2 == 0) break block16;
            \u079f2.\u0529(n3);
        }
        throw var1_4;
    }

    public \u0cf2 \u0529(int n2) {
        \u0cf1[] \u0cf1Array;
        \u0cf1[] \u0cf1Array2 = null;
        for (int i2 = 0; i2 < (\u0cf1Array = this.\u037f).length; ++i2) {
            \u0cf1[] \u0cf1Array3 = \u0cf1Array2;
            if (\u0cf1Array[i2].\u037f()) {
                \u0cf1Array = this.\u037f;
                \u0cf1Array3 = \u0cf1Array2;
                if (!(\u0cf1Array[i2] instanceof \u0d54)) {
                    \u0cf1Array3 = \u0cf1Array2;
                    if (\u0cf1Array2 == null) {
                        \u0cf1Array3 = (\u0cf1[])\u0cf1Array.clone();
                    }
                    \u0cf1Array3[i2] = new \u0d54(n2, this.\u037f[i2]);
                }
            }
            \u0cf1Array2 = \u0cf1Array3;
        }
        if (\u0cf1Array2 == null) {
            return this;
        }
        return new \u0cf2(\u0cf1Array2);
    }
}

