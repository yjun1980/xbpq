/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 */
package com.github.catvod.spider.merge.j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.github.catvod.spider.merge.j.g;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.q.f;
import com.github.catvod.spider.merge.q.o;

final class b
extends m {
    f<Long> I;
    o<Integer> J;

    b(b object, g g2, Resources resources) {
        super((m)((Object)object), g2, resources);
        if (object != null) {
            this.I = object.I;
            object = object.J;
        } else {
            this.I = new f();
            object = new o();
        }
        this.J = object;
    }

    private static long n(int n2, int n3) {
        long l2 = n2;
        return (long)n3 | l2 << 32;
    }

    @Override
    final void i() {
        this.I = this.I.b();
        this.J = this.J.b();
    }

    final int m(int n2, int n3, Drawable object, boolean bl) {
        int n4 = this.a((Drawable)object);
        long l2 = com.github.catvod.spider.merge.j.b.n(n2, n3);
        long l3 = bl ? 0x200000000L : 0L;
        object = this.I;
        long l4 = n4;
        ((f)object).a(l2, l4 | l3);
        if (bl) {
            l2 = com.github.catvod.spider.merge.j.b.n(n3, n2);
            this.I.a(l2, 0x100000000L | l4 | l3);
        }
        return n4;
    }

    @Override
    public final Drawable newDrawable() {
        return new g(this, null);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new g(this, resources);
    }

    final int o(int n2) {
        int n3 = 0;
        n2 = n2 < 0 ? n3 : this.J.c(n2, 0);
        return n2;
    }

    final int p(int n2, int n3) {
        long l2 = com.github.catvod.spider.merge.j.b.n(n2, n3);
        return (int)this.I.d(l2, -1L).longValue();
    }

    final boolean q(int n2, int n3) {
        long l2 = com.github.catvod.spider.merge.j.b.n(n2, n3);
        boolean bl = (this.I.d(l2, -1L) & 0x100000000L) != 0L;
        return bl;
    }

    final boolean r(int n2, int n3) {
        long l2 = com.github.catvod.spider.merge.j.b.n(n2, n3);
        boolean bl = (this.I.d(l2, -1L) & 0x200000000L) != 0L;
        return bl;
    }
}

