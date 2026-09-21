/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.c;
import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.l;
import java.util.Arrays;
import java.util.Collection;

public final class a
extends c {
    public a(Collection collection) {
        this.a.addAll(collection);
        this.b = this.a.size();
    }

    public a(n ... nArray) {
        this(Arrays.asList(nArray));
    }

    @Override
    public final boolean a(l l2, l l3) {
        for (int i2 = this.b - 1; i2 >= 0; --i2) {
            if (((n)this.a.get(i2)).a(l2, l3)) continue;
            return false;
        }
        return true;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.xc.E0.b.f("", this.a);
    }
}

