package com.github.catvod.spider.merge.Q;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Y {
    protected final Map<X, X> a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Q.X, com.github.catvod.spider.merge.Q.X>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Q.X, com.github.catvod.spider.merge.Q.X>] */
    public final X a(X x) {
        C0031w c0031w = X.b;
        if (x == c0031w) {
            return c0031w;
        }
        X x2 = (X) this.a.get(x);
        if (x2 != null) {
            return x2;
        }
        this.a.put(x, x);
        return x;
    }
}
