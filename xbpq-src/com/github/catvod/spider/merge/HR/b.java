/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.a;
import com.github.catvod.spider.merge.HR.c;
import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.F0.l;
import java.util.Arrays;
import java.util.Collection;

public final class b
extends c {
    public b() {
    }

    public b(n ... object) {
        object = Arrays.asList(object);
        if (this.b > 1) {
            this.a.add(new a((Collection)object));
        } else {
            this.a.addAll(object);
        }
        this.b = this.a.size();
    }

    @Override
    public final boolean a(l l2, l l3) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (!((n)this.a.get(i2)).a(l2, l3)) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.xc.E0.b.f(", ", this.a);
    }
}

