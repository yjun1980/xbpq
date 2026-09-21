/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.F;
import com.github.catvod.spider.merge.xc.s0.L;
import com.github.catvod.spider.merge.xc.t0.B;
import com.github.catvod.spider.merge.xc.t0.v;

public abstract class G {
    public static final int a = 0;

    static {
        Object object;
        int n2 = B.a;
        try {
            object = System.getProperty("kotlinx.coroutines.main.delay");
        }
        catch (SecurityException securityException) {
            object = null;
        }
        boolean bl = object != null ? Boolean.parseBoolean((String)object) : false;
        if (!bl) {
            object = F.j;
        } else {
            object = L.a;
            v.a.getClass();
            object = F.j;
        }
    }
}

