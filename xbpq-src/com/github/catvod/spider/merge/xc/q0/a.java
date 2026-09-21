/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.q0;

import com.github.catvod.spider.merge.xc.q0.e;
import com.github.catvod.spider.merge.xc.q0.i;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a
implements e {
    public final AtomicReference a;

    public a(i i2) {
        this.a = new AtomicReference<i>(i2);
    }

    @Override
    public final Iterator iterator() {
        e e2 = this.a.getAndSet(null);
        if (e2 != null) {
            return e2.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

