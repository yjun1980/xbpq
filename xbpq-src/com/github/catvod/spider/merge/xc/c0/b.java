/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.c0;

import com.github.catvod.spider.merge.mI.i;
import java.io.Serializable;

public final class b
implements Serializable {
    public final Object a;
    public final Object b;

    public b(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        object = b2.a;
        if (!i.a(this.a, object)) {
            return false;
        }
        return i.a(this.b, b2.b);
    }

    public final int hashCode() {
        int n2 = 0;
        Object object = this.a;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n2 = object.hashCode();
        }
        return n3 * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

