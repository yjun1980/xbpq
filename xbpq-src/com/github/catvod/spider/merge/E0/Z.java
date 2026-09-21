/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.E0.g0;
import com.github.catvod.spider.merge.E0.h0;

final class Z
implements h0 {
    private h0[] a;

    Z(h0 ... h0Array) {
        this.a = h0Array;
    }

    @Override
    public final boolean a(Class<?> clazz) {
        h0[] h0Array = this.a;
        int n2 = h0Array.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!h0Array[i2].a(clazz)) continue;
            return true;
        }
        return false;
    }

    @Override
    public final g0 b(Class<?> clazz) {
        for (h0 h02 : this.a) {
            if (!h02.a(clazz)) continue;
            return h02.b(clazz);
        }
        throw new UnsupportedOperationException(h.e(clazz, com.github.catvod.spider.merge.C.a.c("No factory is available for message type: ")));
    }
}

