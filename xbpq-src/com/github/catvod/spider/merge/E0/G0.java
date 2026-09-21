/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class G0
implements PrivilegedExceptionAction<Unsafe> {
    G0() {
    }

    public final Unsafe a() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            ((AccessibleObject)field).setAccessible(true);
            Object object = field.get(null);
            if (!Unsafe.class.isInstance(object)) continue;
            return (Unsafe)Unsafe.class.cast(object);
        }
        return null;
    }
}

