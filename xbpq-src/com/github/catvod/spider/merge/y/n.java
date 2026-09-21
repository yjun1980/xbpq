/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;

final class n
extends A {
    private final long[] e;
    private final boolean f;

    public n(String string, boolean bl, long[] lArray, boolean bl2) {
        super(string, bl);
        this.e = lArray;
        this.f = bl2;
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        object = this.b((N)object, object2, object4);
        if (object == null) {
            return false;
        }
        if (object instanceof Number) {
            long l2 = com.github.catvod.spider.merge.H.A.n0((Number)object);
            object = this.e;
            int n2 = ((Object)object).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (object[i2] != l2) continue;
                return this.f ^ true;
            }
        }
        return this.f;
    }
}

