/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.d;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

public final class e
implements X {
    private static volatile Class a;
    private static volatile boolean b;
    private static volatile Method c;
    private static volatile Method d;
    public static e e;

    static {
        e = new e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(L l2, Object object, Object object2, Type object3, int n2) {
        Iterator iterator;
        Serializable serializable;
        object2 = object.getClass().getInterfaces();
        if (((Class<?>[])object2).length == 1 && object2[0].isAnnotation()) {
            serializable = object2[0];
            if (a == null && !b) {
                try {
                    a = Class.forName("sun.reflect.annotation.AnnotationType");
                }
                catch (Throwable throwable) {
                    b = true;
                    throw new d("not support Type Annotation.", throwable);
                }
            }
            if (a == null) {
                throw new d("not support Type Annotation.");
            }
            if (c == null && !b) {
                try {
                    c = a.getMethod("getInstance", Class.class);
                }
                catch (Throwable throwable) {
                    b = true;
                    throw new d("not support Type Annotation.", throwable);
                }
            }
            if (d == null && !b) {
                try {
                    d = a.getMethod("members", new Class[0]);
                }
                catch (Throwable throwable) {
                    b = true;
                    throw new d("not support Type Annotation.", throwable);
                }
            }
            if (c != null && !b) {
                try {
                    object3 = c;
                    object2 = null;
                    object3 = ((Method)object3).invoke(null, serializable);
                }
                catch (Throwable throwable) {
                    b = true;
                    throw new d("not support Type Annotation.", throwable);
                }
                try {
                    object3 = (Map)d.invoke(object3, new Object[0]);
                    serializable = new com.github.catvod.spider.merge.y.e(object3.size(), false);
                    iterator = object3.entrySet().iterator();
                }
                catch (Throwable throwable) {
                    b = true;
                    throw new d("not support Type Annotation.", throwable);
                }
            }
            throw new d("not support Type Annotation.");
        }
        return;
        while (true) {
            if (!iterator.hasNext()) {
                l2.u(serializable);
                return;
            }
            Map.Entry entry = iterator.next();
            try {
                object3 = ((Method)entry.getValue()).invoke(object, new Object[0]);
                object2 = object3;
            }
            catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {}
            ((com.github.catvod.spider.merge.y.e)serializable).y((String)entry.getKey(), com.github.catvod.spider.merge.y.a.k(object2));
        }
    }
}

