/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.e0.a;
import com.github.catvod.spider.merge.xc.e0.e;
import com.github.catvod.spider.merge.xc.e0.f;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.e0.j;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.s0;
import com.github.catvod.spider.merge.xc.s0.v;

public abstract class w
extends a
implements f {
    public static final v b = new v();

    public w() {
        super(e.a);
    }

    @Override
    public final g b(h object) {
        Object object2;
        block6: {
            w w2;
            block4: {
                v v2;
                block5: {
                    i.e(object, "key");
                    boolean bl = object instanceof v;
                    w2 = null;
                    if (!bl) break block4;
                    v2 = (v)object;
                    object = this.a;
                    i.e(object, "key");
                    if (object == v2) break block5;
                    object2 = w2;
                    if (v2.b != object) break block6;
                }
                object = (g)v2.a.invoke(this);
                object2 = w2;
                if (object instanceof g) {
                    object2 = object;
                }
                break block6;
            }
            object2 = w2;
            if (e.a == object) {
                object2 = this;
            }
        }
        return object2;
    }

    public abstract void d(com.github.catvod.spider.merge.xc.e0.i var1, Runnable var2);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final com.github.catvod.spider.merge.xc.e0.i e(h object) {
        i.e(object, "key");
        boolean bl = object instanceof v;
        j j2 = j.a;
        if (bl) {
            object = (v)object;
            h h2 = this.a;
            i.e(h2, "key");
            if (h2 != object) {
                if (((v)object).b != h2) return this;
            }
            if ((g)((v)object).a.invoke(this) == null) return this;
            return j2;
        }
        if (e.a != object) return this;
        return j2;
    }

    public boolean g() {
        return this instanceof s0 ^ true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(E.c(this));
        return stringBuilder.toString();
    }
}

