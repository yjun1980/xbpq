/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.P0.a;
import com.github.catvod.spider.merge.c1.d;
import kotlin.Metadata;

@Metadata
public final class c
extends a {
    static {
        new c();
    }

    public final boolean equals(Object object) {
        char c2;
        boolean bl = object instanceof c && (this.isEmpty() && ((c)object).isEmpty() || (c2 = this.a()) == ((a)(object = (c)object)).a() && this.c() == ((a)object).c());
        return bl;
    }

    public final int hashCode() {
        int n2 = this.isEmpty() ? -1 : this.a() * 31 + this.c();
        return n2;
    }

    public final boolean isEmpty() {
        boolean bl = d.b(this.a(), this.c()) > 0;
        return bl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a());
        stringBuilder.append("..");
        stringBuilder.append(this.c());
        return stringBuilder.toString();
    }
}

