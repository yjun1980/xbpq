/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02ee;
import java.util.function.Supplier;

public final class \u02b9
implements Supplier {
    public final String \u037f;
    public final Object[] \u0528;

    public /* synthetic */ \u02b9(String string, Object[] objectArray) {
        this.\u037f = string;
        this.\u0528 = objectArray;
    }

    public final Object get() {
        return \u02ee.\u037f(this.\u037f, this.\u0528);
    }
}

