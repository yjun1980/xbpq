/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.o;

import com.github.catvod.spider.merge.o.c;

public final class a
extends com.github.catvod.spider.merge.b.a {
    private static volatile a c;
    private c a;
    private c b;

    private a() {
        c c2;
        this.b = c2 = new c();
        this.a = c2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a i() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                a a2;
                c = a2 = new a();
            }
            return c;
        }
    }

    public final boolean j() {
        return this.a.i();
    }
}

