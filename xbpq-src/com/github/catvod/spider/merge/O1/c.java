/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O1;

import com.github.catvod.spider.merge.N1.a;
import com.github.catvod.spider.merge.O1.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

public final class c
implements com.github.catvod.spider.merge.M1.b {
    private final String a;
    private volatile com.github.catvod.spider.merge.M1.b b;
    private Boolean c;
    private Method d;
    private a e;
    private Queue<com.github.catvod.spider.merge.N1.c> f;
    private final boolean g;

    public c(String string, Queue<com.github.catvod.spider.merge.N1.c> queue, boolean bl) {
        this.a = string;
        this.f = queue;
        this.g = bl;
    }

    @Override
    public final void a(String string, Object object) {
        this.m().a(string, object);
    }

    @Override
    public final void b(String string, Object object) {
        this.m().b(string, object);
    }

    @Override
    public final void c(String string, Object object) {
        this.m().c(string, object);
    }

    @Override
    public final void d() {
        this.m().d();
    }

    @Override
    public final void e(String string) {
        this.m().e(string);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            return this.a.equals(((c)object).a);
        }
        return false;
    }

    @Override
    public final void f(String string, Object object, Object object2) {
        this.m().f(string, object, object2);
    }

    @Override
    public final void g(String string, Object ... objectArray) {
        this.m().g(string, objectArray);
    }

    @Override
    public final String getName() {
        return this.a;
    }

    @Override
    public final void h(Object object, Object object2) {
        this.m().h(object, object2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final void i(String string, Object object) {
        this.m().i(string, object);
    }

    @Override
    public final void j(String string) {
        this.m().j(string);
    }

    @Override
    public final void k(Object ... objectArray) {
        this.m().k(objectArray);
    }

    @Override
    public final void l(Throwable throwable) {
        this.m().l(throwable);
    }

    final com.github.catvod.spider.merge.M1.b m() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return com.github.catvod.spider.merge.O1.b.a;
        }
        if (this.e == null) {
            this.e = new a(this, this.f);
        }
        return this.e;
    }

    public final boolean n() {
        Boolean bl = this.c;
        if (bl != null) {
            return bl;
        }
        try {
            this.d = this.b.getClass().getMethod("log", com.github.catvod.spider.merge.N1.b.class);
            this.c = Boolean.TRUE;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            this.c = Boolean.FALSE;
        }
        return this.c;
    }

    public final boolean o() {
        return this.b instanceof b;
    }

    public final boolean p() {
        boolean bl = this.b == null;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(com.github.catvod.spider.merge.N1.b b2) {
        if (!this.n()) return;
        try {
            this.d.invoke(this.b, b2);
            return;
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
            return;
        }
    }

    public final void r(com.github.catvod.spider.merge.M1.b b2) {
        this.b = b2;
    }
}

