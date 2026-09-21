/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.D;
import java.util.function.Supplier;

public final class t
implements Supplier {
    public final D a;
    public final String b;

    public /* synthetic */ t(D d2, String string) {
        this.a = d2;
        this.b = string;
    }

    public final Object get() {
        return D.b0(this.a, this.b);
    }
}

