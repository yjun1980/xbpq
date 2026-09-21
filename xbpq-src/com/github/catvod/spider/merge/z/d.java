/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z.c;
import com.github.catvod.spider.merge.z.h;
import com.github.catvod.spider.merge.z.i;
import com.github.catvod.spider.merge.z.k;
import com.github.catvod.spider.merge.z.l;
import java.io.Serializable;

public final class d
implements k,
Serializable {
    private final k c;
    private final h d;

    public d(k k2, h h2) {
        f.e(k2, cYh.d("0B352725"));
        f.e(h2, cYh.d("023C243C323413"));
        this.c = k2;
        this.d = h2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl;
        boolean bl2 = false;
        if (this == object) return true;
        boolean bl3 = bl2;
        if (!(object instanceof d)) return bl3;
        d d2 = (d)object;
        d2.getClass();
        int n2 = 2;
        object = d2;
        int n3 = 2;
        block0: while (true) {
            if ((object = (object = ((d)object).c) instanceof d ? (d)object : null) == null) {
                object = this;
                while (true) {
                    if ((object = (object = ((d)object).c) instanceof d ? (d)object : null) == null) {
                        bl3 = bl2;
                        if (n3 != n2) return bl3;
                        d2.getClass();
                        object = this;
                        while (true) {
                            h h2;
                            if (!f.a(d2.get((h2 = ((d)object).d).getKey()), h2)) {
                                bl = false;
                                break block0;
                            }
                            object = ((d)object).c;
                            if (!(object instanceof d)) break;
                            object = (d)object;
                        }
                        f.c(object, cYh.d("09252D3D7739063E2F3E237A0535613236291370353E7734083E6C3F22360B703528273F473B2E253B33097E223E25351224283F322949132E23382F13392F341435092424292374223C243C323413"));
                        object = (h)object;
                        bl = f.a(d2.get(object.getKey()), object);
                        break block0;
                    }
                    ++n2;
                }
            }
            ++n3;
        }
        bl3 = bl2;
        if (!bl) return bl3;
        return true;
    }

    @Override
    public final <R> R fold(R r2, com.github.catvod.spider.merge.D.c<? super R, ? super h, ? extends R> c2) {
        return c2.b(this.c.fold(r2, c2), this.d);
    }

    @Override
    public final <E extends h> E get(i<E> i2) {
        f.e(i2, cYh.d("0C3538"));
        k k2 = this;
        do {
            E e2;
            if ((e2 = ((d)k2).d.get(i2)) == null) continue;
            return e2;
        } while ((k2 = ((d)k2).c) instanceof d);
        return k2.get(i2);
    }

    public final int hashCode() {
        int n2 = this.c.hashCode();
        return this.d.hashCode() + n2;
    }

    @Override
    public final k minusKey(i<?> object) {
        f.e(object, cYh.d("0C3538"));
        if (this.d.get(object) != null) {
            return this.c;
        }
        object = (object = this.c.minusKey((i<?>)object)) == this.c ? this : (object == l.c ? this.d : new d((k)object, this.d));
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.fold("", com.github.catvod.spider.merge.z.c.c));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

