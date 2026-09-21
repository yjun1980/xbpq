/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n0;

import com.github.catvod.spider.merge.n0.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class b {
    private Map<String, String> a = new HashMap<String, String>();
    private int b = 0;
    private boolean c = true;
    private ExecutorService d;

    static /* bridge */ /* synthetic */ boolean a(b b2) {
        return b2.c;
    }

    static /* bridge */ /* synthetic */ ExecutorService b(b b2) {
        return b2.d;
    }

    static /* bridge */ /* synthetic */ Map c(b b2) {
        return b2.a;
    }

    static /* bridge */ /* synthetic */ int d(b b2) {
        return b2.b;
    }

    public final c e() {
        if (this.d == null) {
            this.d = Executors.newCachedThreadPool(com.github.catvod.spider.merge.n0.c.a());
        }
        return new c(this);
    }

    public final b f(String string, String string2) {
        ((HashMap)this.a).put(string, string2);
        return this;
    }

    public final b g() {
        this.b = 2;
        return this;
    }
}

