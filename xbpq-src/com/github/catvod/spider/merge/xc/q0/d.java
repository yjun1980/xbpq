/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.q0;

import com.github.catvod.spider.merge.by.a;
import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.q0.c;
import com.github.catvod.spider.merge.xc.q0.e;
import com.github.catvod.spider.merge.xc.q0.k;
import java.util.Iterator;

public final class d
implements e {
    public final a a;
    public final l b;

    public d(k k2, l l2) {
        i.e(l2, "getNextValue");
        this.a = k2;
        this.b = l2;
    }

    @Override
    public final Iterator iterator() {
        return new c(this);
    }
}

