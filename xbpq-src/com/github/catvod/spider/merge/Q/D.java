/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.d;
import com.github.catvod.spider.merge.P.s;
import com.github.catvod.spider.merge.Q.C;
import com.github.catvod.spider.merge.Q.H;
import java.util.Arrays;

public final class D {
    private final C[] a;
    private final int b;

    public D(C[] cArray) {
        this.a = cArray;
        int n2 = cArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = com.github.catvod.spider.merge.N.a.p(n3, cArray[i2]);
        }
        this.b = com.github.catvod.spider.merge.N.a.b(n3, cArray.length);
    }

    public static D a(D cArray, C c2) {
        if (cArray == null) {
            return new D(new C[]{c2});
        }
        cArray = cArray.a;
        cArray = Arrays.copyOf(cArray, cArray.length + 1);
        cArray[cArray.length - 1] = c2;
        return new D(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public final void b(s s2, d d2, int n2) {
        void var1_4;
        block16: {
            int n3;
            block15: {
                int n4;
                int n5;
                C[] cArray;
                n3 = d2.i();
                int n6 = 0;
                try {
                    cArray = this.a;
                    n5 = cArray.length;
                    n4 = 0;
                }
                catch (Throwable throwable) {
                    n2 = n6;
                }
                for (int i2 = 0; i2 < n5; ++i2) {
                    C c2;
                    int n7;
                    block14: {
                        block13: {
                            C c3;
                            block12: {
                                c3 = cArray[i2];
                                n7 = n4;
                                try {
                                    if (!(c3 instanceof H)) break block12;
                                    n7 = n4;
                                }
                                catch (Throwable throwable) {
                                    n2 = n7;
                                    break block15;
                                }
                                n6 = ((H)c3).d() + n2;
                                n7 = n4;
                                d2.d(n6);
                                n7 = n4;
                                c2 = c3 = ((H)c3).c();
                                if (n6 == n3) break block13;
                                n6 = 1;
                                c2 = c3;
                                break block14;
                            }
                            n6 = n4;
                            c2 = c3;
                            n7 = n4;
                            if (!c3.b()) break block14;
                            n7 = n4;
                            d2.d(n3);
                            c2 = c3;
                        }
                        n6 = 0;
                    }
                    n7 = n6;
                    c2.a(s2);
                    n4 = n6;
                    continue;
                }
                if (n4 != 0) {
                    d2.d(n3);
                }
                return;
            }
            if (n2 == 0) break block16;
            d2.d(n3);
        }
        throw var1_4;
    }

    public final D c(int n2) {
        C[] cArray;
        C[] cArray2 = null;
        for (int i2 = 0; i2 < (cArray = this.a).length; ++i2) {
            C[] cArray3 = cArray2;
            if (cArray[i2].b()) {
                cArray = this.a;
                cArray3 = cArray2;
                if (!(cArray[i2] instanceof H)) {
                    cArray3 = cArray2;
                    if (cArray2 == null) {
                        cArray3 = (C[])cArray.clone();
                    }
                    cArray3[i2] = new H(n2, this.a[i2]);
                }
            }
            cArray2 = cArray3;
        }
        if (cArray2 == null) {
            return this;
        }
        return new D(cArray2);
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof D)) {
            return false;
        }
        object = (D)object;
        if (this.b != ((D)object).b || !Arrays.equals(this.a, ((D)object).a)) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        return this.b;
    }
}

