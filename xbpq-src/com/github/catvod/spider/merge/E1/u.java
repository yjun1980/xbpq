/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.n1.i;
import java.util.function.Supplier;

public final class u
implements Supplier {
    public final String a;

    public /* synthetic */ u(String string) {
        this.a = string;
    }

    public final Object get() {
        return new i(s.a("Could not parse upload date \"", this.a, "\""));
    }
}

