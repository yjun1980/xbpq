/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.c0;

import com.github.catvod.spider.merge.mI.i;
import java.io.Serializable;

public final class e
implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public e(Object object, Object object2, Object object3) {
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        e e2 = (e)object;
        object = e2.a;
        if (!i.a(this.a, object)) {
            return false;
        }
        if (!i.a(this.b, e2.b)) {
            return false;
        }
        return i.a(this.c, e2.c);
    }

    public final int hashCode() {
        int n2 = 0;
        Object object = this.a;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n4 = object == null ? 0 : object.hashCode();
        object = this.c;
        if (object != null) {
            n2 = object.hashCode();
        }
        return (n3 * 31 + n4) * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

