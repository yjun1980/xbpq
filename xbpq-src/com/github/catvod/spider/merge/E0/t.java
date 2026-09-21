/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

final class t {
    private final Object a;
    private final int b;

    t(Object object, int n2) {
        this.a = object;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof t;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (t)object;
        bl = bl2;
        if (this.a == ((t)object).a) {
            bl = bl2;
            if (this.b == ((t)object).b) {
                bl = true;
            }
        }
        return bl;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) * 65535 + this.b;
    }
}

