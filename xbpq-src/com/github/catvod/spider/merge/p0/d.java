/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.n0.a;
import com.github.catvod.spider.merge.n0.b;
import com.github.catvod.spider.merge.p0.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public final class d
implements a {
    boolean a = false;
    final Map<String, c> b = new HashMap<String, c>();
    final LinkedBlockingQueue<com.github.catvod.spider.merge.o0.c> c = new LinkedBlockingQueue();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final b a(String string) {
        synchronized (this) {
            c c2;
            c c3 = c2 = (c)((HashMap)this.b).get(string);
            if (c2 == null) {
                c3 = new c(string, this.c, this.a);
                ((HashMap)this.b).put(string, c3);
            }
            return c3;
        }
    }

    public final void b() {
        ((HashMap)this.b).clear();
        this.c.clear();
    }

    public final LinkedBlockingQueue<com.github.catvod.spider.merge.o0.c> c() {
        return this.c;
    }

    public final List<c> d() {
        return new ArrayList<c>(((HashMap)this.b).values());
    }

    public final void e() {
        this.a = true;
    }
}

