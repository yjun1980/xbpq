/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.P0.i;
import kotlin.Metadata;

@Metadata
public final class k
extends i {
    public final boolean equals(Object object) {
        long l2;
        boolean bl = object instanceof k && (this.isEmpty() && ((k)object).isEmpty() || (l2 = this.a()) == ((i)(object = (k)object)).a() && this.c() == ((i)object).c());
        return bl;
    }

    public final int hashCode() {
        int n2 = this.isEmpty() ? -1 : (int)((long)31 * (this.a() ^ this.a() >>> 32) + (this.c() ^ this.c() >>> 32));
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

