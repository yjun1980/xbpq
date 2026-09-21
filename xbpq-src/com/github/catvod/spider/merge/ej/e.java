/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.d;
import com.github.catvod.spider.merge.ej.f;
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
        return com.github.catvod.spider.merge.Dw.e.e(this.a, ", ");
    }
}

