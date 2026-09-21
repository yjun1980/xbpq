/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y1;

import com.github.catvod.spider.merge.H1.r;
import java.util.List;
import java.util.function.Consumer;

public final class a
implements Consumer {
    public final List a;

    public /* synthetic */ a(List list) {
        this.a = list;
    }

    public final void accept(Object object) {
        this.a.add((r)object);
    }
}

