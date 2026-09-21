/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.u0;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;

public final class a {
    private final String a;
    private final Object b;
    private final boolean c;

    public a(String string, Object object) {
        f.e(string, cYh.d("0C3538"));
        this.a = string;
        this.b = object;
        this.c = false;
    }

    public final String a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        return f.a(((a)object).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

