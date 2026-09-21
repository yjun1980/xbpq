/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.mI.i;

public final class r {
    public final Object a;
    public final l b;

    public r(Object object, l l2) {
        this.a = object;
        this.b = l2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof r)) {
            return false;
        }
        r r2 = (r)object;
        object = r2.a;
        if (!i.a(this.a, object)) {
            return false;
        }
        return i.a(this.b, r2.b);
    }

    public final int hashCode() {
        Object object = this.a;
        int n2 = object == null ? 0 : object.hashCode();
        return this.b.hashCode() + n2 * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompletedWithCancellation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", onCancellation=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

