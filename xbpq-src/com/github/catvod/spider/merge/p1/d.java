/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.B.e;
import java.util.function.Supplier;

public final class d
implements Supplier {
    public final String a;

    public /* synthetic */ d(String string) {
        this.a = string;
    }

    public final Object get() {
        return new IllegalArgumentException(e.c("Not a localization code: ", this.a));
    }
}

