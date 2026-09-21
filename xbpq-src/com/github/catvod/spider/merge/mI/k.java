/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mI;

import com.github.catvod.spider.merge.mI.c;
import com.github.catvod.spider.merge.mI.i;

public final class k
implements c {
    public final Class a;

    public k(Class clazz) {
        i.e(clazz, "jClass");
        this.a = clazz;
    }

    @Override
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof k && i.a(this.a, object = ((k)object).a);
        return bl;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.toString());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

