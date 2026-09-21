/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class g
implements GenericArrayType {
    private final Type a;

    public g(Type type) {
        this.a = type;
    }

    public final boolean equals(Object object) {
        if (object instanceof GenericArrayType) {
            object = (GenericArrayType)object;
            return this.a.equals(object.getGenericComponentType());
        }
        return false;
    }

    @Override
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object object = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        object = object instanceof Class ? ((Class)object).getName() : object.toString();
        stringBuilder.append((String)object);
        stringBuilder.append("[]");
        return stringBuilder.toString();
    }
}

