/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import java.util.function.UnaryOperator;
import org.mozilla.javascript.JavaToJSONConverters;

public final class i
implements UnaryOperator {
    public static final i a = new i();

    private /* synthetic */ i() {
    }

    @Override
    public final Object apply(Object object) {
        return JavaToJSONConverters.e(object);
    }
}

