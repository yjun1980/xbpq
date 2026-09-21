/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mI;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.C0.a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class i {
    public static final Object[] a = new Object[0];

    public static boolean a(Object object, Object object2) {
        boolean bl = object == null ? object2 == null : object.equals(object2);
        return bl;
    }

    public static void b(Object object) {
        if (object != null) {
            return;
        }
        object = new NullPointerException();
        i.f((RuntimeException)object, i.class.getName());
        throw object;
    }

    public static void c(Object object, String string) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string);
        i.f((RuntimeException)object, i.class.getName());
        throw object;
    }

    public static void d(Object object, String string) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string.concat(" must not be null"));
        i.f((RuntimeException)object, i.class.getName());
        throw object;
    }

    public static void e(Object object, String string) {
        if (object == null) {
            int n2;
            object = Thread.currentThread().getStackTrace();
            Object object2 = i.class.getName();
            int n3 = 0;
            do {
                n2 = ++n3;
            } while (!object[n3].getClassName().equals(object2));
            while (object[n2].getClassName().equals(object2)) {
                ++n2;
            }
            object2 = object[n2];
            object = ((StackTraceElement)object2).getClassName();
            object2 = ((StackTraceElement)object2).getMethodName();
            StringBuilder stringBuilder = new StringBuilder("Parameter specified as non-null is null: method ");
            stringBuilder.append((String)object);
            stringBuilder.append(".");
            stringBuilder.append((String)object2);
            stringBuilder.append(", parameter ");
            stringBuilder.append(string);
            object = new NullPointerException(stringBuilder.toString());
            i.f((RuntimeException)object, i.class.getName());
            throw object;
        }
    }

    public static void f(RuntimeException runtimeException, String string) {
        StackTraceElement[] stackTraceElementArray = runtimeException.getStackTrace();
        int n2 = stackTraceElementArray.length;
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals(stackTraceElementArray[i2].getClassName())) continue;
            n3 = i2;
        }
        runtimeException.setStackTrace(Arrays.copyOfRange(stackTraceElementArray, n3 + 1, n2));
    }

    public static void g(String object) {
        object = new a(m.r("lateinit property ", (String)object, " has not been initialized"));
        i.f((RuntimeException)object, i.class.getName());
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] h(Collection objectArray) {
        i.e(objectArray, "collection");
        int n2 = objectArray.size();
        Object[] objectArray2 = a;
        if (n2 == 0) {
            return objectArray2;
        }
        Iterator iterator = objectArray.iterator();
        if (!iterator.hasNext()) {
            return objectArray2;
        }
        objectArray = new Object[n2];
        n2 = 0;
        while (true) {
            int n3 = n2 + 1;
            objectArray[n2] = iterator.next();
            if (n3 >= objectArray.length) {
                int n4;
                if (!iterator.hasNext()) {
                    return objectArray;
                }
                n2 = n4 = n3 * 3 + 1 >>> 1;
                if (n4 <= n3) {
                    n2 = 0x7FFFFFFD;
                    if (n3 >= 0x7FFFFFFD) throw new OutOfMemoryError();
                }
                objectArray2 = Arrays.copyOf(objectArray, n2);
                i.d(objectArray2, "copyOf(...)");
            } else {
                objectArray2 = objectArray;
                if (!iterator.hasNext()) {
                    objectArray = Arrays.copyOf(objectArray, n3);
                    i.d(objectArray, "copyOf(...)");
                    return objectArray;
                }
            }
            n2 = n3;
            objectArray = objectArray2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final Object[] i(Collection object, Object[] objectArray) {
        void var0_8;
        void var0_12;
        void var1_13;
        i.e(object, "collection");
        var1_13.getClass();
        int n2 = object.size();
        int n3 = 0;
        if (n2 == 0) {
            void var0_1 = var1_13;
            if (((void)var1_13).length <= 0) return var0_12;
            var1_13[0] = null;
            void var0_2 = var1_13;
            return var0_12;
        }
        Iterator iterator = object.iterator();
        if (!iterator.hasNext()) {
            void var0_3 = var1_13;
            if (((void)var1_13).length <= 0) return var0_12;
            var1_13[0] = null;
            void var0_4 = var1_13;
            return var0_12;
        }
        if (n2 <= ((void)var1_13).length) {
            void var0_5 = var1_13;
        } else {
            Object object2 = Array.newInstance(var1_13.getClass().getComponentType(), n2);
            i.c(object2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objectArray2 = (Object[])object2;
        }
        while (true) {
            void var5_18;
            n2 = n3 + 1;
            var0_8[n3] = iterator.next();
            if (n2 >= ((void)var0_8).length) {
                int n4;
                if (!iterator.hasNext()) {
                    return var0_12;
                }
                n3 = n4 = n2 * 3 + 1 >>> 1;
                if (n4 <= n2) {
                    n3 = 0x7FFFFFFD;
                    if (n2 >= 0x7FFFFFFD) throw new OutOfMemoryError();
                }
                T[] TArray = Arrays.copyOf(var0_8, n3);
                i.d(TArray, "copyOf(...)");
            } else {
                void var5_20 = var0_8;
                if (!iterator.hasNext()) {
                    if (var0_8 != var1_13) break;
                    var1_13[n2] = null;
                    void var0_10 = var1_13;
                    return var0_12;
                }
            }
            n3 = n2;
            void var0_9 = var5_18;
        }
        T[] TArray = Arrays.copyOf(var0_8, n2);
        i.d(TArray, "copyOf(...)");
        return var0_12;
    }
}

