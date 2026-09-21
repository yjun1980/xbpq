/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.q0.a;
import com.github.catvod.spider.merge.xc.q0.e;
import com.github.catvod.spider.merge.xc.q0.h;
import com.github.catvod.spider.merge.xc.s0.y;
import java.util.List;
import java.util.ServiceLoader;

public abstract class g {
    public static final List a;

    static {
        Object object = ServiceLoader.load(y.class, y.class.getClassLoader()).iterator();
        i.e(object, "<this>");
        object = new com.github.catvod.spider.merge.xc.q0.i(1, object);
        if (!(object instanceof a)) {
            object = new a((com.github.catvod.spider.merge.xc.q0.i)object);
        }
        a = h.S((e)object);
    }
}

