/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.lifecycle.a
 */
package com.github.catvod.spider.merge.xc.e;

import androidx.lifecycle.a;
import java.util.Map;

public final class c
implements Map.Entry {
    public final Object a;
    public final Object b;
    public c c;
    public c d;

    public c(Object object, a a2) {
        this.a = object;
        this.b = a2;
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        object = c2.a;
        if (!this.a.equals(object) || !this.b.equals(c2.b)) {
            bl = false;
        }
        return bl;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final Object setValue(Object object) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

