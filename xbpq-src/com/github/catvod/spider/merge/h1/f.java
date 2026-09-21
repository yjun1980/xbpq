/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import java.util.function.UnaryOperator;
import org.mozilla.javascript.JavaToJSONConverters;

public final class f
implements UnaryOperator {
    public static final f a = new f();

    private /* synthetic */ f() {
    }

    @Override
    public final Object apply(Object object) {
        return JavaToJSONConverters.b(object);
    }
}

