/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.r0;

import java.util.HashMap;
import java.util.Map;

public abstract class a<T extends a<T, S>, S> {
    protected Map<String, String> a;

    public final Map<String, String> a() {
        return this.a;
    }

    public final T b(String string, String string2) {
        if (this.a == null) {
            this.a = new HashMap<String, String>();
        }
        ((HashMap)this.a).put(string, string2);
        return (T)this;
    }
}

