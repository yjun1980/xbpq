/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U;

import java.util.function.Supplier;

public final class i
implements Supplier {
    public final String a;
    public final Object[] b;

    public /* synthetic */ i(String string, Object[] objectArray) {
        this.a = string;
        this.b = objectArray;
    }

    public final Object get() {
        return String.format(this.a, this.b);
    }
}

