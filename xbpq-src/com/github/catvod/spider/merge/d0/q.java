/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.en.NetPan;
import java.util.List;
import java.util.function.ToIntFunction;

public final class q
implements ToIntFunction {
    public final List a;

    public /* synthetic */ q(List list) {
        this.a = list;
    }

    public final int applyAsInt(Object object) {
        return this.a.indexOf(NetPan.extractNetName((String)object));
    }
}

