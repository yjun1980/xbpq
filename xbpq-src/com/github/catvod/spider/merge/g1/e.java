/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.d;
import com.github.catvod.spider.merge.g1.f;
import java.util.Arrays;
import java.util.Collection;

public final class e
extends f {
    e() {
    }

    e(N ... object) {
        object = Arrays.asList(object);
        if (this.b > 1) {
            this.a.add(new d((Collection<N>)object));
        } else {
            this.a.addAll((Collection<N>)object);
        }
        this.b();
    }

    @Override
    public final boolean a(m m2, m m3) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (!this.a.get(i2).a(m2, m3)) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        return c.f(this.a, ", ");
    }
}

