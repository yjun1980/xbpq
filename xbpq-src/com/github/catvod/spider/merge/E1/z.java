/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.D;
import com.github.catvod.spider.merge.E1.a;
import java.util.function.Function;

public final class z
implements Function {
    public final D a;
    public final boolean b;

    public /* synthetic */ z(D d2, boolean bl) {
        this.a = d2;
        this.b = bl;
    }

    public final Object apply(Object object) {
        return D.c0(this.a, this.b, (a)object);
    }
}

