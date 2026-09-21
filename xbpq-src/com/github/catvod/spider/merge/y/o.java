/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;

final class o
extends A {
    private final Long[] e;
    private final boolean f;

    public o(String string, boolean bl, Long[] longArray, boolean bl2) {
        super(string, bl);
        this.e = longArray;
        this.f = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        object = this.b((N)object, object2, object4);
        int n2 = 0;
        int n3 = 0;
        if (object == null) {
            object = this.e;
            n2 = ((Long[])object).length;
            while (n3 < n2) {
                if (object[n3] == null) {
                    return this.f ^ true;
                }
                ++n3;
            }
            return this.f;
        }
        if (!(object instanceof Number)) return this.f;
        long l2 = com.github.catvod.spider.merge.H.A.n0((Number)object);
        object = this.e;
        int n4 = ((Long[])object).length;
        n3 = n2;
        while (n3 < n4) {
            object2 = object[n3];
            if (object2 != null && (Long)object2 == l2) {
                return this.f ^ true;
            }
            ++n3;
        }
        return this.f;
    }
}

