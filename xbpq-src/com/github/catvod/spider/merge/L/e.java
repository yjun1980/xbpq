/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.L.d;
import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z.a;
import com.github.catvod.spider.merge.z.b;
import com.github.catvod.spider.merge.z.g;
import com.github.catvod.spider.merge.z.i;
import com.github.catvod.spider.merge.z.k;
import com.github.catvod.spider.merge.z.l;

public abstract class e
extends a
implements g {
    public static final d c = new d();

    public e() {
        super(g.a);
    }

    @Override
    public final <E extends com.github.catvod.spider.merge.z.h> E get(i<E> b2) {
        Object object;
        f.e(b2, cYh.d("0C3538"));
        boolean bl = b2 instanceof b;
        e e2 = null;
        if (bl) {
            b2 = b2;
            object = e2;
            if (b2.a(this.getKey())) {
                b2 = b2.b(this);
                object = e2;
                if (b2 instanceof com.github.catvod.spider.merge.z.h) {
                    object = b2;
                }
            }
        } else {
            object = e2;
            if (g.a == b2) {
                object = this;
            }
        }
        return (E)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final k minusKey(i<?> object) {
        f.e(object, cYh.d("0C3538"));
        if (object instanceof b) {
            if (!((b)(object = (b)object)).a(this.getKey())) return this;
            if (((b)object).b(this) == null) return this;
            return l.c;
        }
        if (g.a != object) return this;
        return l.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(h.d(this));
        return stringBuilder.toString();
    }
}

