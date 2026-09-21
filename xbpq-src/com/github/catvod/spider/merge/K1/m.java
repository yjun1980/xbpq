/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K1;

import java.util.function.Function;

public final class m
implements Function {
    public static final m a = new m();

    private /* synthetic */ m() {
    }

    public final Object apply(Object object) {
        return ((String)object).split("=");
    }
}

