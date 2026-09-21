/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public final class n
implements ParameterizedType {
    private final Type[] a;
    private final Type b;
    private final Type c;

    public n(Type[] typeArray, Type type, Type type2) {
        this.a = typeArray;
        this.b = type;
        this.c = type2;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && n.class == object.getClass()) {
            object = (n)object;
            if (!Arrays.equals(this.a, ((n)object).a)) {
                return false;
            }
            Type type = this.b;
            if (type != null ? !type.equals(((n)object).b) : ((n)object).b != null) {
                return false;
            }
            type = this.c;
            object = ((n)object).c;
            if (type != null) {
                bl = type.equals(object);
            } else if (object != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return this.a;
    }

    @Override
    public final Type getOwnerType() {
        return this.b;
    }

    @Override
    public final Type getRawType() {
        return this.c;
    }

    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object != null ? Arrays.hashCode((Object[])object) : 0;
        object = this.b;
        int n4 = object != null ? object.hashCode() : 0;
        object = this.c;
        if (object != null) {
            n2 = object.hashCode();
        }
        return (n3 * 31 + n4) * 31 + n2;
    }
}

