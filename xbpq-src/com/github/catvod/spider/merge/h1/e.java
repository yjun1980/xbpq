/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import java.util.function.UnaryOperator;
import org.mozilla.javascript.JavaToJSONConverters;

public final class e
implements UnaryOperator {
    public static final e a = new e();

    private /* synthetic */ e() {
    }

    @Override
    public final Object apply(Object object) {
        return JavaToJSONConverters.a(object);
    }
}

