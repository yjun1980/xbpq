/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import java.util.Arrays;

public final class E {
    public final Object[] a;
    public final int b;

    public E(Object ... objectArray) {
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
        if (E.class != object.getClass()) {
            return false;
        }
        object = (E)object;
        return Arrays.deepEquals(this.a, ((E)object).a);
    }

    public final int hashCode() {
        return this.b;
    }
}

