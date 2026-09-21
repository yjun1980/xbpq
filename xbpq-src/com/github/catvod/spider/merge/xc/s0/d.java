/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.c;
import com.github.catvod.spider.merge.xc.s0.h;

public final class d
implements h {
    public final c[] a;

    public d(c[] cArray) {
        this.a = cArray;
    }

    @Override
    public final void a() {
        this.b();
    }

    public final void b() {
        c[] cArray = this.a;
        int n2 = cArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            M m2 = cArray[i2].f;
            if (m2 != null) {
                m2.b();
                continue;
            }
            i.g("handle");
            throw null;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisposeHandlersOnCancel[");
        stringBuilder.append(this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

