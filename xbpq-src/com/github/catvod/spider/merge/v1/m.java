/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.n1.i;
import java.util.function.Supplier;

public final class m
implements Supplier {
    public final String a;

    public /* synthetic */ m(String string) {
        this.a = string;
    }

    public final Object get() {
        return new i(e.c("Cannot convert this language to a locale: ", this.a));
    }
}

