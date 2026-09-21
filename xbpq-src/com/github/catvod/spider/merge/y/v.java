/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.b;

final class v
implements G {
    private final int[] a;

    public v(int[] nArray) {
        this.a = nArray;
    }

    @Override
    public final Object a(N n2, Object object, Object object2) {
        b b2 = new b(this.a.length);
        for (int i2 = 0; i2 < ((Object)(object = (Object)this.a)).length; ++i2) {
            b2.add(n2.i(object2, (int)object[i2]));
        }
        return b2;
    }
}

