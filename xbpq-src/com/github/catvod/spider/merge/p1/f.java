/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.function.Function;

public final class f
implements Function {
    public static final f a = new f();

    private /* synthetic */ f() {
    }

    public final Object apply(Object object) {
        return (ChronoUnit)((Map.Entry)object).getKey();
    }
}

