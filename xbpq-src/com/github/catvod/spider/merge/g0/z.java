/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.B0.f;
import java.util.List;
import java.util.function.Consumer;

public final class z
implements Consumer {
    public final List a;

    public /* synthetic */ z(List list) {
        this.a = list;
    }

    public final void accept(Object object) {
        this.a.add((f)object);
    }
}

