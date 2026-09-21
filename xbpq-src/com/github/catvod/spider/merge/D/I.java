/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.T;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public final class I
implements X {
    public static final I a = new I();

    @Override
    public final void d(L l2, Object object, Object object2, Type type, int n2) {
        h0 h02 = l2.j;
        T t2 = T.i;
        try {
            Field field = object.getClass().getDeclaredField("map");
            if (Modifier.isPrivate(field.getModifiers())) {
                ((AccessibleObject)field).setAccessible(true);
            }
            t2.d(l2, field.get(object), object2, type, n2);
        }
        catch (Exception exception) {
            h02.s();
        }
    }
}

