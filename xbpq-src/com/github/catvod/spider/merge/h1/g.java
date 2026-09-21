/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import java.util.function.UnaryOperator;
import org.mozilla.javascript.JavaToJSONConverters;

public final class g
implements UnaryOperator {
    public static final g a = new g();

    private /* synthetic */ g() {
    }

    @Override
    public final Object apply(Object object) {
        return JavaToJSONConverters.c(object);
    }
}

