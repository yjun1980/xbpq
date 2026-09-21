/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import java.util.function.UnaryOperator;
import org.mozilla.javascript.JavaToJSONConverters;

public final class h
implements UnaryOperator {
    public static final h a = new h();

    private /* synthetic */ h() {
    }

    @Override
    public final Object apply(Object object) {
        return JavaToJSONConverters.d(object);
    }
}

