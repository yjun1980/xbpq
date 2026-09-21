/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;

class ClassCache$CacheKey {
    final Class<?> cls;
    final Object sec;

    public ClassCache$CacheKey(Class<?> clazz, Object object) {
        this.cls = clazz;
        this.sec = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof ClassCache$CacheKey)) return false;
        Class<?> clazz = this.cls;
        object = (ClassCache$CacheKey)object;
        if (!Objects.equals(clazz, ((ClassCache$CacheKey)object).cls)) return false;
        if (!Objects.equals(this.sec, ((ClassCache$CacheKey)object).sec)) return false;
        return true;
    }

    public int hashCode() {
        int n2 = this.cls.hashCode();
        Object object = this.sec;
        if (object != null) {
            n2 = object.hashCode() * 31;
        }
        return n2;
    }
}

