/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p;

import com.github.catvod.spider.merge.p.d;
import com.github.catvod.spider.merge.p.g;
import com.github.catvod.spider.merge.p.h;
import java.util.Iterator;
import java.util.Map;

final class e
implements Iterator<Map.Entry<Object, Object>>,
g<Object, Object> {
    private d<Object, Object> a;
    private boolean b;
    final h c;

    e(h h2) {
        this.c = h2;
        this.b = true;
    }

    @Override
    public final void b(d<Object, Object> d2) {
        d<Object, Object> d3 = this.a;
        if (d2 == d3) {
            d2 = d3.d;
            this.a = d2;
            boolean bl = d2 == null;
            this.b = bl;
        }
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.b;
        boolean bl2 = true;
        boolean bl3 = true;
        if (bl) {
            bl2 = this.c.a != null ? bl3 : false;
            return bl2;
        }
        d<Object, Object> d2 = this.a;
        if (d2 == null || d2.c == null) {
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public final Object next() {
        d<Object, Object> d2;
        if (this.b) {
            this.b = false;
            d2 = this.c.a;
        } else {
            d2 = this.a;
            d2 = d2 != null ? d2.c : null;
        }
        this.a = d2;
        return d2;
    }
}

