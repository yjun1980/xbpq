/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.p1.e;
import java.util.Locale;
import java.util.function.Function;

public final class c
implements Function {
    public static final c a = new c();

    private /* synthetic */ c() {
    }

    public final Object apply(Object object) {
        object = (Locale)object;
        return new e(((Locale)object).getLanguage(), ((Locale)object).getCountry());
    }
}

