/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.D;
import com.github.catvod.spider.merge.K1.i;
import java.util.function.Function;

public final class y
implements Function {
    public final D a;
    public final String b;
    public final String c;
    public final int d;

    public /* synthetic */ y(D d2, String string, String string2, int n2) {
        this.a = d2;
        this.b = string;
        this.c = string2;
        this.d = n2;
    }

    public final Object apply(Object object) {
        return D.f0(this.a, this.b, this.c, this.d, (i)object);
    }
}

