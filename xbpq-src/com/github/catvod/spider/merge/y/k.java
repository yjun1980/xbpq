/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.i;

public final class k
implements G {
    private final i a;

    public k(i i2) {
        this.a = i2;
    }

    @Override
    public final Object a(N n2, Object object, Object object2) {
        if (object2 == null) {
            return null;
        }
        b b2 = new b();
        if (object2 instanceof Iterable) {
            for (Object t2 : (Iterable)object2) {
                if (!this.a.a(n2, object, object2, t2)) continue;
                b2.add(t2);
            }
            return b2;
        }
        if (this.a.a(n2, object, object2, object2)) {
            return object2;
        }
        return null;
    }
}

