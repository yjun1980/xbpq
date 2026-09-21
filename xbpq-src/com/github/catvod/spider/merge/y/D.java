/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.z;
import java.math.BigDecimal;

final class D
extends A {
    private final G e;
    private final int f;

    public D(String string, boolean bl, G g2, int n2) {
        super(string, bl);
        this.e = g2;
        this.f = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        object3 = this.b((N)object, object2, object4);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        if (object3 == null) {
            return false;
        }
        if (!(object3 instanceof Number)) {
            return false;
        }
        if (!((object = this.e.a((N)object, object2, object2)) instanceof Integer || object instanceof Long || object instanceof Short)) {
            if (!(object instanceof Byte)) throw new UnsupportedOperationException();
        }
        long l2 = com.github.catvod.spider.merge.H.A.n0((Number)object);
        if (!(object3 instanceof Integer || object3 instanceof Long || object3 instanceof Short || object3 instanceof Byte)) {
            if (!(object3 instanceof BigDecimal)) throw new UnsupportedOperationException();
            int n2 = BigDecimal.valueOf(l2).compareTo((BigDecimal)object3);
            int n3 = z.c(this.f);
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                if (n3 != 5) {
                                    return false;
                                }
                                if (n2 < 0) return bl12;
                                return true;
                            }
                            bl12 = bl;
                            if (n2 <= 0) return bl12;
                            return true;
                        }
                        bl12 = bl2;
                        if (n2 > 0) return bl12;
                        return true;
                    }
                    bl12 = bl3;
                    if (n2 >= 0) return bl12;
                    return true;
                }
                bl12 = bl4;
                if (n2 == 0) return bl12;
                return true;
            }
            bl12 = bl5;
            if (n2 != 0) return bl12;
            return true;
        }
        long l3 = com.github.catvod.spider.merge.H.A.n0((Number)object3);
        int n4 = z.c(this.f);
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        if (n4 != 4) {
                            if (n4 != 5) throw new UnsupportedOperationException();
                            bl12 = bl6;
                            if (l3 > l2) return bl12;
                            return true;
                        }
                        bl12 = bl7;
                        if (l3 >= l2) return bl12;
                        return true;
                    }
                    bl12 = bl8;
                    if (l3 < l2) return bl12;
                    return true;
                }
                bl12 = bl9;
                if (l3 <= l2) return bl12;
                return true;
            }
            bl12 = bl10;
            if (l3 == l2) return bl12;
            return true;
        }
        bl12 = bl11;
        if (l3 != l2) return bl12;
        return true;
    }
}

