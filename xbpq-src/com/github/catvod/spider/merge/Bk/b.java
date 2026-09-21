/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Bk;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class b {
    public final int a;
    public final Method b;

    public b(Method method, int n2) {
        this.a = n2;
        this.b = method;
        ((AccessibleObject)method).setAccessible(true);
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        int n2 = ((b)object).a;
        if (this.a != n2 || !this.b.getName().equals(((b)object).b.getName())) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        int n2 = this.a;
        return this.b.getName().hashCode() + n2 * 31;
    }
}

