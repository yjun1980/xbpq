/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.K0;
import com.github.catvod.spider.merge.E0.L0;
import sun.misc.Unsafe;

final class H0
extends K0 {
    H0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override
    public final boolean c(Object object, long l2) {
        if (L0.g) {
            return L0.c(object, l2);
        }
        return L0.d(object, l2);
    }

    @Override
    public final byte d(Object object, long l2) {
        if (L0.g) {
            return (byte)(L0.p(object, 0xFFFFFFFFFFFFFFFCL & l2) >>> (int)(((l2 ^ 0xFFFFFFFFFFFFFFFFL) & 3L) << 3) & 0xFF);
        }
        return (byte)(L0.p(object, 0xFFFFFFFFFFFFFFFCL & l2) >>> (int)((l2 & 3L) << 3) & 0xFF);
    }

    @Override
    public final double e(Object object, long l2) {
        return Double.longBitsToDouble(this.h(object, l2));
    }

    @Override
    public final float f(Object object, long l2) {
        return Float.intBitsToFloat(this.g(object, l2));
    }

    @Override
    public final void k(Object object, long l2, boolean bl) {
        if (L0.g) {
            L0.e(object, l2, bl);
        } else {
            L0.f(object, l2, bl);
        }
    }

    @Override
    public final void l(Object object, long l2, double d2) {
        this.o(object, l2, Double.doubleToLongBits(d2));
    }

    @Override
    public final void m(Object object, long l2, float f2) {
        this.n(object, l2, Float.floatToIntBits(f2));
    }

    @Override
    public final boolean r() {
        return false;
    }
}

