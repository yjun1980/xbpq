/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;

final class L
extends A {
    private final Object e;
    private boolean f = true;

    public L(String string, boolean bl, Object object, boolean bl2) {
        super(string, bl);
        if (object != null) {
            this.e = object;
            this.f = bl2;
            return;
        }
        throw new IllegalArgumentException("value is null");
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        boolean bl;
        object = this.b((N)object, object2, object4);
        boolean bl2 = bl = this.e.equals(object);
        if (!this.f) {
            bl2 = bl ^ true;
        }
        return bl2;
    }
}

