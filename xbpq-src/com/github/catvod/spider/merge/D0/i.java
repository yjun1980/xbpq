/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D0;

import com.github.catvod.spider.merge.n0.e;
import java.util.function.Supplier;

public final class i
implements Supplier {
    public static final i a = new i();

    private /* synthetic */ i() {
    }

    public final Object get() {
        return new e("Continuation endpoint not found");
    }
}

