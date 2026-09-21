/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.e0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.e0.b;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.e0.j;
import java.io.Serializable;

public final class c
implements i,
Serializable {
    public final i a;
    public final g b;

    public c(g g2, i i2) {
        com.github.catvod.spider.merge.mI.i.e(i2, "left");
        com.github.catvod.spider.merge.mI.i.e(g2, "element");
        this.a = i2;
        this.b = g2;
    }

    @Override
    public final g b(h h2) {
        com.github.catvod.spider.merge.mI.i.e(h2, "key");
        i i2 = this;
        do {
            g g2;
            if ((g2 = ((c)i2).b.b(h2)) == null) continue;
            return g2;
        } while ((i2 = ((c)i2).a) instanceof c);
        return i2.b(h2);
    }

    @Override
    public final Object c(Object object, p p2) {
        return p2.invoke(this.a.c(object, p2), this.b);
    }

    @Override
    public final i e(h object) {
        com.github.catvod.spider.merge.mI.i.e(object, "key");
        g g2 = this.b;
        g g3 = g2.b((h)object);
        i i2 = this.a;
        if (g3 != null) {
            return i2;
        }
        object = (object = i2.e((h)object)) == i2 ? this : (object == j.a ? g2 : new c(g2, (i)object));
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl;
        if (this == object) return true;
        boolean bl2 = object instanceof c;
        boolean bl3 = bl = false;
        if (!bl2) return bl3;
        c c2 = (c)object;
        c2.getClass();
        int n2 = 2;
        object = c2;
        int n3 = 2;
        block0: while (true) {
            if ((object = (object = ((c)object).a) instanceof c ? (c)object : null) == null) {
                object = this;
                while (true) {
                    if ((object = (object = ((c)object).a) instanceof c ? (c)object : null) == null) {
                        bl3 = bl;
                        if (n3 != n2) return bl3;
                        object = this;
                        while (true) {
                            g g2;
                            if (!com.github.catvod.spider.merge.mI.i.a(c2.b((g2 = ((c)object).b).getKey()), g2)) {
                                bl2 = false;
                                break block0;
                            }
                            object = ((c)object).a;
                            if (!(object instanceof c)) break;
                            object = (c)object;
                        }
                        com.github.catvod.spider.merge.mI.i.c(object, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        object = (g)object;
                        bl2 = com.github.catvod.spider.merge.mI.i.a(c2.b(object.getKey()), object);
                        break block0;
                    }
                    ++n2;
                }
            }
            ++n3;
        }
        bl3 = bl;
        if (!bl2) return bl3;
        return true;
    }

    @Override
    public final i f(i i2) {
        return com.github.catvod.spider.merge.xc.a.a.s(this, i2);
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        return this.b.hashCode() + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append((String)this.c("", com.github.catvod.spider.merge.xc.e0.b.b));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

