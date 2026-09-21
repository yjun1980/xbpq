/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.P0.f;
import kotlin.Metadata;

@Metadata
public final class h
extends f {
    public final boolean equals(Object object) {
        int n2;
        boolean bl = object instanceof h && (this.isEmpty() && ((h)object).isEmpty() || (n2 = this.a()) == ((f)(object = (h)object)).a() && this.c() == ((f)object).c());
        return bl;
    }

    public final int hashCode() {
        int n2 = this.isEmpty() ? -1 : this.a() * 31 + this.c();
        return n2;
    }

    public final boolean isEmpty() {
        boolean bl = this.a() > this.c();
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

