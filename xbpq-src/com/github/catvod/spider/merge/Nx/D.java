/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.Nx.C
 *  com.github.catvod.spider.merge.Nx.H
 */
package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Nx.C;
import com.github.catvod.spider.merge.Nx.H;
import com.github.catvod.spider.merge.gu.d;
import com.github.catvod.spider.merge.gu.s;
import java.util.Arrays;

public final class D {
    private final C[] a;
    private final int b;

    public D(C[] cArray) {
        this.a = cArray;
        int n2 = cArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = i.p(n3, cArray[i2]);
        }
        this.b = i.b(n3, cArray.length);
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
            int n4;
            block15: {
                int n5;
                int n6;
                C[] cArray;
                n4 = d2.i();
                n3 = 0;
                try {
                    cArray = this.a;
                    n6 = cArray.length;
                    n5 = 0;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                for (int i2 = 0; i2 < n6; ++i2) {
                    C c2;
                    int n7;
                    block14: {
                        block13: {
                            C c3;
                            block12: {
                                c3 = cArray[i2];
                                n3 = n5;
                                try {
                                    if (!(c3 instanceof H)) break block12;
                                    n3 = n5;
                                }
                                catch (Throwable throwable) {
                                    break block15;
                                }
                                n7 = ((H)c3).d() + n2;
                                n3 = n5;
                                d2.d(n7);
                                n3 = n5;
                                c2 = c3 = ((H)c3).c();
                                if (n7 == n4) break block13;
                                n7 = 1;
                                c2 = c3;
                                break block14;
                            }
                            n7 = n5;
                            c2 = c3;
                            n3 = n5;
                            if (!c3.b()) break block14;
                            n3 = n5;
                            d2.d(n4);
                            c2 = c3;
                        }
                        n7 = 0;
                    }
                    n3 = n7;
                    c2.a(s2);
                    n5 = n7;
                    continue;
                }
                if (n5 != 0) {
                    d2.d(n4);
                }
                return;
            }
            if (n3 == 0) break block16;
            d2.d(n4);
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

