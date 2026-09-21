/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Wogg;
import java.util.concurrent.Callable;

public final class t
implements Callable {
    public final Wogg a;
    public final String b;

    public /* synthetic */ t(Wogg wogg, String string) {
        this.a = wogg;
        this.b = string;
    }

    public final Object call() {
        return Wogg.o(this.a, this.b);
    }
}

