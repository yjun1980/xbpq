/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.b0.b;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.d;
import com.github.catvod.spider.merge.e0.f;
import java.util.Arrays;
import java.util.Collection;

final class e
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
    public final boolean a(l l2, l l3) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (!this.a.get(i2).a(l2, l3)) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.b0.b.e(this.a, cYh.d("4B70"));
    }
}

