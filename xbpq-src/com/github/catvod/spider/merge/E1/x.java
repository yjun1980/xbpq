/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.D;
import com.github.catvod.spider.merge.F0.e;
import java.util.function.Function;

public final class x
implements Function {
    public final D a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ x(D d2, int n2, String string, String string2, String string3) {
        this.a = d2;
        this.b = n2;
        this.c = string;
        this.d = string2;
        this.e = string3;
    }

    public final Object apply(Object object) {
        return D.g0(this.a, this.b, this.c, this.d, this.e, (e)object);
    }
}

