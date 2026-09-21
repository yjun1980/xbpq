/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.Nx.X
 *  com.github.catvod.spider.merge.Nx.w
 */
package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Nx.X;
import com.github.catvod.spider.merge.Nx.w;
import java.util.HashMap;
import java.util.Map;

public final class Y {
    protected final Map<X, X> a = new HashMap<X, X>();

    public final X a(X x2) {
        w w2 = X.b;
        if (x2 == w2) {
            return w2;
        }
        w2 = (X)((HashMap)this.a).get(x2);
        if (w2 != null) {
            return w2;
        }
        ((HashMap)this.a).put(x2, x2);
        return x2;
    }
}

