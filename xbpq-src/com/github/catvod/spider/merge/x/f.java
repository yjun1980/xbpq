/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.x;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.io.Serializable;

public final class f
implements Serializable {
    public final Throwable c;

    public f(Throwable throwable) {
        this.c = throwable;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof f && com.github.catvod.spider.merge.E.f.a(this.c, ((f)object).c);
        return bl;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = d.b(cYh.d("2131283D22280278"));
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

