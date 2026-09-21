/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import java.util.Arrays;

final class P {
    private final Object[] a;
    private final int b;

    P(Object ... objectArray) {
        this.a = objectArray;
        this.b = Arrays.hashCode(objectArray) + 31;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (P.class != object.getClass()) {
            return false;
        }
        object = (P)object;
        return Arrays.deepEquals(this.a, ((P)object).a);
    }

    public final int hashCode() {
        return this.b;
    }
}

