/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.K.h;
import java.util.List;
import java.util.function.ToIntFunction;

public final class r
implements ToIntFunction {
    public final List a;

    public /* synthetic */ r(List list) {
        this.a = list;
    }

    public final int applyAsInt(Object object) {
        List list = this.a;
        h h2 = (h)object;
        object = NetPan.a;
        return list.indexOf(NetPan.extractNetName(h2.c()));
    }
}

