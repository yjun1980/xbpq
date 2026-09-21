/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.c0;

import com.github.catvod.spider.merge.mI.i;
import java.io.Serializable;

public final class c
implements Serializable {
    public final Throwable a;

    public c(Throwable throwable) {
        i.e(throwable, "exception");
        this.a = throwable;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof c && i.a(this.a, object = ((c)object).a);
        return bl;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Failure(");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

