/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.Z;

final class X
extends Z {
    public X(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(m m2, m m3) {
        m m4 = m3;
        if (m2 == m3) {
            return false;
        }
        while ((m3 = m4.l0()) != null) {
            m4 = m3;
            if (!this.a.a(m2, m3)) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.a);
    }
}

