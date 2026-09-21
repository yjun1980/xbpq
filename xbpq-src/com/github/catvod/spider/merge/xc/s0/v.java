/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.e0.e;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.s0.u;

public final class v
implements h {
    public final l a;
    public final h b;

    public v() {
        e e2 = e.a;
        Object object = u.a;
        i.e(e2, "baseKey");
        this.a = object;
        object = e2;
        if (e2 instanceof v) {
            object = ((v)((Object)e2)).b;
        }
        this.b = object;
    }
}

