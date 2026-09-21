/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.E.f
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.ka.d;
import java.io.Serializable;

public final class u
implements Serializable {
    public final Throwable c;

    public u(Throwable throwable) {
        this.c = throwable;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof u && f.a((Object)this.c, (Object)((u)object).c);
        return bl;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = d.b("Failure(");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

