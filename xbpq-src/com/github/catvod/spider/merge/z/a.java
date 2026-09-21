/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.D.c;
import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z.h;
import com.github.catvod.spider.merge.z.i;
import com.github.catvod.spider.merge.z.j;
import com.github.catvod.spider.merge.z.k;
import com.github.catvod.spider.merge.z.l;

public abstract class a
implements h {
    private final i<?> key;

    public a(i<?> i2) {
        f.e(i2, cYh.d("0C3538"));
        this.key = i2;
    }

    @Override
    public <R> R fold(R r2, c<? super R, ? super h, ? extends R> c2) {
        f.e(c2, cYh.d("08202423362E0E3F2F"));
        return c2.b(r2, this);
    }

    @Override
    public <E extends h> E get(i<E> object) {
        f.e(object, cYh.d("0C3538"));
        object = f.a(this.getKey(), object) ? this : null;
        return (E)object;
    }

    @Override
    public i<?> getKey() {
        return this.key;
    }

    @Override
    public k minusKey(i<?> object) {
        f.e(object, cYh.d("0C3538"));
        object = f.a(this.getKey(), object) ? l.c : this;
        return object;
    }

    public k plus(k k2) {
        f.e(k2, cYh.d("043F2F25322213"));
        k2 = k2 == l.c ? this : k2.fold(this, j.c);
        return k2;
    }
}

