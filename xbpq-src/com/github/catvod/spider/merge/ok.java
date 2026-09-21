/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.PV;
import com.github.catvod.spider.merge.Sj;
import com.github.catvod.spider.merge.U;

public class ok
extends U {
    private final transient Sj S;
    private final boolean T4;

    public ok(Sj sj) {
        this.S = sj;
        this.T4 = false;
    }

    public ok(Class<?> clazz) {
        this(ok.l8(clazz));
    }

    private static Sj l8(Class<?> object) {
        object = object == null ? PV.n("") : PV.HM(object);
        return object;
    }
}

