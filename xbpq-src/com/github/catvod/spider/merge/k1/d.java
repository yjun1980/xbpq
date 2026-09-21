/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.K1.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class d
implements Serializable {
    private final int a;
    private final String b;
    private final String c;
    private String d;
    private final String e;
    private final List<Throwable> f = new ArrayList<Throwable>();

    public d(int n2, String string, String string2, String string3, String string4) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        com.github.catvod.spider.merge.K1.b.a("Base Created {}", this);
    }

    public final void a(Collection<Throwable> collection) {
        ((ArrayList)this.f).addAll(collection);
    }

    public final void b(Throwable throwable) {
        ((ArrayList)this.f).add(throwable);
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public final int f() {
        return this.a;
    }

    public final String g() {
        return this.c;
    }
}

