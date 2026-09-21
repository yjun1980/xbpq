/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.q0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.f0.a;
import com.github.catvod.spider.merge.xc.q0.e;
import com.github.catvod.spider.merge.xc.q0.f;

public abstract class g {
    public final Object a(e object, d d2) {
        object = object.iterator();
        f f2 = (f)this;
        boolean bl = object.hasNext();
        com.github.catvod.spider.merge.xc.c0.f f4 = com.github.catvod.spider.merge.xc.c0.f.a;
        a a2 = a.a;
        if (!bl) {
            object = f4;
        } else {
            f2.c = object;
            f2.a = 2;
            f2.d = d2;
            i.e(d2, "frame");
            object = a2;
        }
        if (object == a2) {
            return object;
        }
        return f4;
    }
}

