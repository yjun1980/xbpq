/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z.h;
import com.github.catvod.spider.merge.z.i;

public abstract class b<B extends h, E extends B>
implements i<E> {
    private final com.github.catvod.spider.merge.D.b<h, E> a;
    private final i<?> b;

    public b(i<B> i2, com.github.catvod.spider.merge.D.b<? super h, ? extends E> i3) {
        f.e(i2, cYh.d("053132341C3F1E"));
        this.a = i3;
        i3 = i2;
        if (i2 instanceof b) {
            i3 = ((b)i2).b;
        }
        this.b = i3;
    }

    public final boolean a(i<?> i2) {
        f.e(i2, cYh.d("0C3538"));
        boolean bl = i2 == this || this.b == i2;
        return bl;
    }

    public final E b(h h2) {
        f.e(h2, cYh.d("023C243C323413"));
        return (E)((h)this.a.c(h2));
    }
}

