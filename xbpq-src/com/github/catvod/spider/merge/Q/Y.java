/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.X;
import java.util.HashMap;
import java.util.Map;

public final class Y {
    protected final Map<X, X> a = new HashMap<X, X>();

    public final X a(X x2) {
        X x3 = X.b;
        if (x2 == x3) {
            return x3;
        }
        x3 = (X)((HashMap)this.a).get(x2);
        if (x3 != null) {
            return x3;
        }
        ((HashMap)this.a).put(x2, x2);
        return x2;
    }
}

