/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.k1.l;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.m1.a;
import com.github.catvod.spider.merge.p1.e;
import com.github.catvod.spider.merge.p1.j;
import com.github.catvod.spider.merge.p1.k;
import java.util.Objects;

public abstract class b {
    private final p a;
    private final com.github.catvod.spider.merge.o1.a b;
    private boolean c;
    private final a d;

    protected b(p object, com.github.catvod.spider.merge.o1.a a2) {
        this.hashCode();
        this.c = false;
        Objects.requireNonNull(object, "service is null");
        this.a = object;
        Objects.requireNonNull(a2, "LinkHandler is null");
        this.b = a2;
        object = l.a();
        Objects.requireNonNull(object, "downloader is null");
        this.d = object;
    }

    protected final void a() {
        if (this.c) {
            return;
        }
        throw new IllegalStateException("Page is not fetched. Make sure you call fetchPage()");
    }

    public final void b() {
        if (this.c) {
            return;
        }
        this.o(this.d);
        this.c = true;
    }

    public final String c() {
        return this.b.a();
    }

    public final a d() {
        return this.d;
    }

    public final com.github.catvod.spider.merge.p1.a e() {
        p p2 = this.a;
        Objects.requireNonNull(p2);
        com.github.catvod.spider.merge.p1.a a2 = l.b();
        if (!p2.g().contains(a2)) {
            a2 = com.github.catvod.spider.merge.p1.a.b;
        }
        return a2;
    }

    public final e f() {
        return this.a.b();
    }

    public String g() {
        return this.b.b();
    }

    public final com.github.catvod.spider.merge.o1.a h() {
        return this.b;
    }

    public abstract String i();

    public String j() {
        return this.b.c();
    }

    public final p k() {
        return this.a;
    }

    public final int l() {
        return this.a.d();
    }

    public final j m() {
        Object object = this.a;
        e e2 = this.f();
        Objects.requireNonNull(object);
        object = k.a(e2);
        if (object != null || !e2.a().isEmpty() && (object = k.a(new e(e2.b(), null))) != null) {
            return object;
        }
        throw new IllegalArgumentException(s.a("Localization is not supported (\"", String.valueOf(e2), "\")"));
    }

    public String n() {
        return this.b.d();
    }

    public abstract void o(a var1);

    public final String toString() {
        return this.getClass().getSimpleName();
    }
}

