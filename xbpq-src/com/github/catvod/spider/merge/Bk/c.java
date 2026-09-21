/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Bk;

import com.github.catvod.spider.merge.Bk.a;
import com.github.catvod.spider.merge.Bk.b;
import com.github.catvod.spider.merge.Bk.g;
import com.github.catvod.spider.merge.Bk.k;
import com.github.catvod.spider.merge.Bk.o;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class c {
    public static final c c = new c();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void c(HashMap object, b object2, g g2, Class clazz) {
        g g3 = (g)((Object)((HashMap)object).get(object2));
        if (g3 != null && g2 != g3) {
            object = ((b)object2).b;
            object2 = new StringBuilder("Method ");
            ((StringBuilder)object2).append(((Method)object).getName());
            ((StringBuilder)object2).append(" in ");
            ((StringBuilder)object2).append(clazz.getName());
            ((StringBuilder)object2).append(" already declared with different @OnLifecycleEvent value: previous value ");
            ((StringBuilder)object2).append((Object)g3);
            ((StringBuilder)object2).append(", new value ");
            ((StringBuilder)object2).append((Object)g2);
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        if (g3 == null) {
            ((HashMap)object).put(object2, g2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a a(Class clazz, Method[] object) {
        void var2_6;
        int n2;
        Class clazz2 = clazz.getSuperclass();
        HashMap hashMap = new HashMap();
        if (clazz2 != null) {
            hashMap.putAll(this.b(clazz2).b);
        }
        Class<?>[] classArray = clazz.getInterfaces();
        int n3 = classArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            for (Map.Entry entry : this.b(classArray[n2]).b.entrySet()) {
                com.github.catvod.spider.merge.Bk.c.c(hashMap, (b)entry.getKey(), (g)((Object)entry.getValue()), clazz);
            }
        }
        if (object == null) {
            try {
                Method[] methodArray = clazz.getDeclaredMethods();
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
                throw illegalArgumentException;
            }
        }
        int n4 = ((void)var2_6).length;
        n3 = 0;
        boolean bl = false;
        while (true) {
            if (n3 >= n4) {
                a a2 = new a(hashMap);
                this.a.put(clazz, a2);
                this.b.put(clazz, bl);
                return a2;
            }
            Iterator iterator = var2_6[n3];
            o o2 = ((Method)((Object)iterator)).getAnnotation(o.class);
            if (o2 != null) {
                Class<?>[] classArray2 = ((Method)((Object)iterator)).getParameterTypes();
                if (classArray2.length > 0) {
                    if (!classArray2[0].isAssignableFrom(k.class)) throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    n2 = 1;
                } else {
                    n2 = 0;
                }
                g g2 = o2.value();
                if (classArray2.length > 1) {
                    if (!classArray2[1].isAssignableFrom(g.class)) throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    if (g2 != g.ON_ANY) throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    n2 = 2;
                }
                if (classArray2.length > 2) throw new IllegalArgumentException("cannot have more than 2 params");
                com.github.catvod.spider.merge.Bk.c.c(hashMap, new b((Method)((Object)iterator), n2), g2, clazz);
                bl = true;
            }
            ++n3;
        }
    }

    public final a b(Class clazz) {
        a a2 = (a)this.a.get(clazz);
        if (a2 != null) {
            return a2;
        }
        return this.a(clazz, null);
    }
}

