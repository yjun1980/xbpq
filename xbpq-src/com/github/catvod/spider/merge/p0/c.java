/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.o0.a;
import com.github.catvod.spider.merge.p0.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

public final class c
implements com.github.catvod.spider.merge.n0.b {
    private final String c;
    private volatile com.github.catvod.spider.merge.n0.b d;
    private Boolean e;
    private Method f;
    private a g;
    private Queue<com.github.catvod.spider.merge.o0.c> h;
    private final boolean i;

    public c(String string, Queue<com.github.catvod.spider.merge.o0.c> queue, boolean bl) {
        this.c = string;
        this.h = queue;
        this.i = bl;
    }

    @Override
    public final void a(String string, Throwable throwable) {
        com.github.catvod.spider.merge.n0.b b2;
        if (this.d != null) {
            b2 = this.d;
        } else if (this.i) {
            b2 = b.c;
        } else {
            if (this.g == null) {
                this.g = new a(this, this.h);
            }
            b2 = this.g;
        }
        b2.a(string, throwable);
    }

    @Override
    public final String b() {
        return this.c;
    }

    public final boolean c() {
        Boolean bl = this.e;
        if (bl != null) {
            return bl;
        }
        try {
            this.f = this.d.getClass().getMethod(cYh.d("0B3F26"), com.github.catvod.spider.merge.o0.b.class);
            this.e = Boolean.TRUE;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            this.e = Boolean.FALSE;
        }
        return this.e;
    }

    public final boolean d() {
        return this.d instanceof b;
    }

    public final boolean e() {
        boolean bl = this.d == null;
        return bl;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            return this.c.equals(((c)object).c);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(com.github.catvod.spider.merge.o0.b b2) {
        if (!this.c()) return;
        try {
            this.f.invoke(this.d, b2);
            return;
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
            return;
        }
    }

    public final void g(com.github.catvod.spider.merge.n0.b b2) {
        this.d = b2;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

