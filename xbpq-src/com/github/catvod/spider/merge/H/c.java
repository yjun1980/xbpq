/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.A.l;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.z.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class c {
    public static final boolean a;

    static {
        String string = System.getProperty("java.vm.name");
        boolean bl = string != null && ((string = string.toLowerCase()).contains("dalvik") || string.contains("lemur"));
        a = bl;
    }

    public static boolean a(String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 >= '\u0001' && c2 <= '\u007f' && c2 != '.') {
                continue;
            }
            return false;
        }
        return true;
    }

    public static String b(Class<?> object) {
        StringBuilder stringBuilder;
        if (((Class)object).isPrimitive()) {
            return c.d(object);
        }
        if (((Class)object).isArray()) {
            stringBuilder = com.github.catvod.spider.merge.C.a.c("[");
            object = c.b(((Class)object).getComponentType());
        } else {
            stringBuilder = com.github.catvod.spider.merge.C.a.c("L");
            stringBuilder.append(c.f(object));
            object = ";";
        }
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public static String c(Method method) {
        Class<?>[] classArray = method.getParameterTypes();
        StringBuilder stringBuilder = new StringBuilder(classArray.length + 1 << 4);
        stringBuilder.append('(');
        for (int i2 = 0; i2 < classArray.length; ++i2) {
            stringBuilder.append(c.b(classArray[i2]));
        }
        stringBuilder.append(')');
        stringBuilder.append(c.b(method.getReturnType()));
        return stringBuilder.toString();
    }

    public static String d(Class<?> clazz) {
        if (Integer.TYPE == clazz) {
            return "I";
        }
        if (Void.TYPE == clazz) {
            return "V";
        }
        if (Boolean.TYPE == clazz) {
            return "Z";
        }
        if (Character.TYPE == clazz) {
            return "C";
        }
        if (Byte.TYPE == clazz) {
            return "B";
        }
        if (Short.TYPE == clazz) {
            return "S";
        }
        if (Float.TYPE == clazz) {
            return "F";
        }
        if (Long.TYPE == clazz) {
            return "J";
        }
        if (Double.TYPE == clazz) {
            return "D";
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("Type: ");
        stringBuilder.append(clazz.getCanonicalName());
        stringBuilder.append(" is not a primitive type");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static String[] e(AccessibleObject annotationArray) {
        Throwable throwable2;
        Object object;
        block16: {
            int n2;
            String string;
            Object[] objectArray;
            if (a) {
                return new String[0];
            }
            if (annotationArray instanceof Method) {
                annotationArray = (Method)annotationArray;
                objectArray = annotationArray.getParameterTypes();
                string = annotationArray.getName();
                object = annotationArray.getDeclaringClass();
                annotationArray = A.T((Method)annotationArray);
            } else {
                annotationArray = (Constructor)annotationArray;
                objectArray = annotationArray.getParameterTypes();
                object = annotationArray.getDeclaringClass();
                annotationArray = A.S((Constructor)annotationArray);
                string = "<init>";
            }
            if (objectArray.length == 0) {
                return new String[0];
            }
            Object object2 = ((Class)object).getClassLoader();
            String[] stringArray = object2;
            if (object2 == null) {
                stringArray = ClassLoader.getSystemClassLoader();
            }
            object = ((Class)object).getName();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(((String)object).replace('.', '/'));
            ((StringBuilder)object2).append(".class");
            object = stringArray.getResourceAsStream(((StringBuilder)object2).toString());
            if (object == null) {
                return new String[0];
            }
            try {
                object2 = new com.github.catvod.spider.merge.A.b((InputStream)object, false);
                stringArray = new l(string, (Class<?>[])objectArray);
                ((com.github.catvod.spider.merge.A.b)object2).a((l)stringArray);
                stringArray = stringArray.a();
                n2 = 0;
            }
            catch (Throwable throwable2) {
                break block16;
            }
            catch (IOException iOException) {
                i.a((Closeable)object);
                return new String[0];
            }
            while (true) {
                if (n2 >= stringArray.length) break;
                objectArray = annotationArray[n2];
                if (objectArray != null) {
                    int n3 = 0;
                    while (true) {
                        block15: {
                            if (n3 >= objectArray.length) break;
                            if (!(objectArray[n3] instanceof b) || (string = ((b)objectArray[n3]).name()) == null) break block15;
                            if (string.length() <= 0) break block15;
                            stringArray[n2] = string;
                        }
                        ++n3;
                    }
                }
                ++n2;
            }
            i.a((Closeable)object);
            return stringArray;
        }
        i.a((Closeable)object);
        throw throwable2;
    }

    public static String f(Class<?> clazz) {
        if (clazz.isArray()) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("[");
            stringBuilder.append(c.b(clazz.getComponentType()));
            return stringBuilder.toString();
        }
        if (!clazz.isPrimitive()) {
            return clazz.getName().replace('.', '/');
        }
        return c.d(clazz);
    }
}

