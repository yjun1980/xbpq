/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class l
implements PrivilegedExceptionAction<Unsafe> {
    l() {
    }

    public final Unsafe a() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            ((AccessibleObject)field).setAccessible(true);
            Object object = field.get(null);
            if (!Unsafe.class.isInstance(object)) continue;
            return (Unsafe)Unsafe.class.cast(object);
        }
        NoSuchFieldError noSuchFieldError = new NoSuchFieldError(cYh.d("13382471023414312734"));
        throw noSuchFieldError;
    }
}

