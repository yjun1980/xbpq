/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.Z;

final class T
extends Z {
    public T(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(m m2, m m3) {
        boolean bl = false;
        if (m2 == m3) {
            return false;
        }
        m3 = m3.i0();
        boolean bl2 = bl;
        if (m3 != null) {
            bl2 = bl;
            if (this.a.a(m2, m3)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final String toString() {
        return String.format("%s > ", this.a);
    }
}

