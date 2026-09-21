/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;

final class m
extends A {
    private final long e;
    private final long f;
    private final boolean g;

    public m(String string, boolean bl, long l2, long l3, boolean bl2) {
        super(string, bl);
        this.e = l2;
        this.f = l3;
        this.g = bl2;
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        long l2;
        if ((object = this.b((N)object, object2, object4)) == null) {
            return false;
        }
        if (object instanceof Number && (l2 = com.github.catvod.spider.merge.H.A.n0((Number)object)) >= this.e && l2 <= this.f) {
            return this.g ^ true;
        }
        return this.g;
    }
}

