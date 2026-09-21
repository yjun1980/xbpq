/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.z;

final class h
extends A {
    private final double e;
    private final int f;

    public h(String string, boolean bl, double d2, int n2) {
        super(string, bl);
        this.e = d2;
        this.f = n2;
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        object = this.b((N)object, object2, object4);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        if (object == null) {
            return false;
        }
        if (!(object instanceof Number)) {
            return false;
        }
        double d2 = ((Number)object).doubleValue();
        int n2 = z.c(this.f);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                return false;
                            }
                            bl3 = bl6;
                            if (d2 <= this.e) {
                                bl3 = true;
                            }
                            return bl3;
                        }
                        bl3 = bl;
                        if (d2 < this.e) {
                            bl3 = true;
                        }
                        return bl3;
                    }
                    bl3 = bl2;
                    if (d2 >= this.e) {
                        bl3 = true;
                    }
                    return bl3;
                }
                if (d2 > this.e) {
                    bl3 = true;
                }
                return bl3;
            }
            bl3 = bl4;
            if (d2 != this.e) {
                bl3 = true;
            }
            return bl3;
        }
        bl3 = bl5;
        if (d2 == this.e) {
            bl3 = true;
        }
        return bl3;
    }
}

