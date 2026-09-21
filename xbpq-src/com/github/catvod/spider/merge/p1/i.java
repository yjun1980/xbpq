/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.E1.G;
import java.util.function.Supplier;

public final class i
implements Supplier {
    public final int a;
    public final Object b;

    public /* synthetic */ i(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final Object get() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return new com.github.catvod.spider.merge.n1.i(e.c("Unable to parse the date: ", (String)this.b));
            }
        }
        return G.t((G)this.b);
    }
}

