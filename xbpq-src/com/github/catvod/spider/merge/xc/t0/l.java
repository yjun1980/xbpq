/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.mI.d;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.c0.b;
import com.github.catvod.spider.merge.xc.c0.c;
import com.github.catvod.spider.merge.xc.t0.F;
import com.github.catvod.spider.merge.xc.t0.a;
import com.github.catvod.spider.merge.xc.t0.e;
import com.github.catvod.spider.merge.xc.t0.j;
import com.github.catvod.spider.merge.xc.t0.k;
import com.github.catvod.spider.merge.xc.t0.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class l {
    public static final int a;
    public static final a b;

    static {
        a a2;
        a = l.b(Throwable.class, -1);
        try {
            a2 = m.a ? F.f : e.f;
        }
        catch (Throwable throwable) {
            a2 = F.f;
        }
        b = a2;
    }

    public static final com.github.catvod.spider.merge.by.l a(Class object) {
        block6: {
            int n2;
            Object object2;
            int n3;
            k k2;
            block5: {
                k2 = k.a;
                n3 = l.b((Class)object, 0);
                if (a == n3) break block5;
                object = k2;
                break block6;
            }
            Object object3 = object.getConstructors();
            ArrayList<Object> arrayList = new ArrayList(((Constructor<?>[])object3).length);
            int n4 = ((Constructor<?>[])object3).length;
            n3 = 0;
            while (true) {
                object = null;
                if (n3 >= n4) break;
                object = object3[n3];
                object2 = object.getParameterTypes();
                n2 = ((Class<?>[])object2).length;
                object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? new b(null, -1) : (i.a(object2[0], String.class) && i.a(object2[1], Throwable.class) ? new b(new com.github.catvod.spider.merge.xc.d0.a(1, new j((Constructor)object, 0)), 3) : new b(null, -1))) : (i.a(object2 = object2[0], String.class) ? new b(new com.github.catvod.spider.merge.xc.d0.a(1, new j((Constructor)object, 1)), 2) : (i.a(object2, Throwable.class) ? new b(new com.github.catvod.spider.merge.xc.d0.a(1, new j((Constructor)object, 2)), 1) : new b(null, -1)))) : new b(new com.github.catvod.spider.merge.xc.d0.a(1, new j((Constructor)object, 3)), 0);
                arrayList.add(object);
                ++n3;
            }
            object2 = arrayList.iterator();
            if (object2.hasNext()) {
                object = object2.next();
                if (object2.hasNext()) {
                    n4 = ((Number)((b)object).b).intValue();
                    object3 = object;
                    do {
                        arrayList = object2.next();
                        n2 = ((Number)((b)((Object)arrayList)).b).intValue();
                        n3 = n4;
                        object = object3;
                        if (n4 < n2) {
                            object = arrayList;
                            n3 = n2;
                        }
                        n4 = n3;
                        object3 = object;
                    } while (object2.hasNext());
                }
            }
            object3 = (b)object;
            object = k2;
            if (object3 == null || (object = (com.github.catvod.spider.merge.by.l)object3.a) != null) break block6;
            object = k2;
        }
        return object;
    }

    public static final int b(Class serializable, int n2) {
        int n3;
        Object object;
        i.e(serializable, "<this>");
        com.github.catvod.spider.merge.mI.m.a.getClass();
        new d((Class)serializable);
        int n4 = 0;
        while (true) {
            object = ((Class)serializable).getDeclaredFields();
            int n5 = ((Field[])object).length;
            int n6 = 0;
            for (n3 = 0; n3 < n5; ++n3) {
                int n7 = n6;
                if (Modifier.isStatic(object[n3].getModifiers()) ^ true) {
                    n7 = n6 + 1;
                }
                n6 = n7;
                continue;
            }
            n3 = n4 + n6;
            object = ((Class)serializable).getSuperclass();
            n4 = n3;
            serializable = object;
            if (object != null) continue;
            break;
        }
        try {
            serializable = Integer.valueOf(n3);
        }
        catch (Throwable throwable) {
            serializable = com.github.catvod.spider.merge.xc.a.a.h(throwable);
        }
        object = serializable;
        if (serializable instanceof c) {
            object = n2;
        }
        return ((Number)object).intValue();
    }
}

