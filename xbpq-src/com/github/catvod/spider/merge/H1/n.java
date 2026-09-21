/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.n1.i;
import java.util.function.Supplier;

public final class n
implements Supplier {
    public final String a;

    public /* synthetic */ n(String string) {
        this.a = string;
    }

    public final Object get() {
        return new i(e.c("not a valid locale language code: ", this.a));
    }
}

