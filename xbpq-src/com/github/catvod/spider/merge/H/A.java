/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.C.j;
import com.github.catvod.spider.merge.C.q;
import com.github.catvod.spider.merge.D.d0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.d;
import com.github.catvod.spider.merge.H.e;
import com.github.catvod.spider.merge.H.f;
import com.github.catvod.spider.merge.H.g;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.H.m;
import com.github.catvod.spider.merge.H.n;
import com.github.catvod.spider.merge.H.r;
import com.github.catvod.spider.merge.H.s;
import com.github.catvod.spider.merge.H.t;
import com.github.catvod.spider.merge.H.u;
import com.github.catvod.spider.merge.H.v;
import com.github.catvod.spider.merge.H.w;
import com.github.catvod.spider.merge.H.x;
import com.github.catvod.spider.merge.H.y;
import com.github.catvod.spider.merge.H.z;
import com.github.catvod.spider.merge.Q0.a;
import com.github.catvod.spider.merge.y.V;
import com.github.catvod.spider.merge.z.b;
import java.io.InputStream;
import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class A {
    private static volatile Map<Class, String[]> A;
    private static volatile boolean B;
    private static ConcurrentMap<String, Class<?>> C;
    private static Class<?> D;
    private static boolean E;
    private static Class<? extends Annotation> F;
    private static boolean G;
    private static volatile Class H;
    private static volatile Class I;
    private static volatile boolean J;
    private static volatile Method K;
    private static volatile Field L;
    private static volatile Object M;
    private static Class N;
    private static f<Class, Boolean> O;
    private static f<Object, Object> P;
    private static f<Object, Object> Q;
    public static f<Object, Object> R;
    private static d<Object, Class, Object> S;
    private static f<Map<String, Class<?>>, Void> T;
    private static final Set<String> U;
    private static Object V;
    private static boolean W;
    private static final Pattern a;
    public static boolean b;
    public static boolean c;
    private static boolean d;
    private static boolean e;
    private static Method f;
    private static boolean g;
    private static Method h;
    private static boolean i;
    private static Class<?> j;
    private static boolean k;
    private static Class<? extends Annotation> l;
    private static Class<? extends Annotation> m;
    private static boolean n;
    private static Class<? extends Annotation> o;
    private static boolean p;
    private static Method q;
    private static boolean r;
    private static volatile Class s;
    private static volatile boolean t;
    private static volatile boolean u;
    private static volatile Constructor v;
    private static volatile Method w;
    private static volatile Method x;
    private static volatile Method y;
    private static volatile boolean z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        a = Pattern.compile("\\.0*$");
        b = false;
        c = false;
        d = true;
        e = false;
        g = false;
        i = false;
        k = false;
        m = null;
        n = false;
        o = null;
        p = false;
        q = null;
        r = false;
        C = new ConcurrentHashMap(256, 0.75f, 1);
        E = false;
        F = null;
        G = false;
        H = null;
        I = null;
        J = false;
        K = null;
        L = null;
        M = null;
        N = null;
        try {
            b = "true".equals(com.github.catvod.spider.merge.H.i.e("fastjson.compatibleWithJavaBean"));
            c = "true".equals(com.github.catvod.spider.merge.H.i.e("fastjson.compatibleWithFieldName"));
        }
        catch (Throwable throwable) {}
        try {
            N = Class.forName("java.util.Deque");
        }
        catch (Throwable throwable) {}
        O = new r();
        P = new s();
        Q = new t();
        R = new u();
        S = new v();
        T = new w();
        ((ConcurrentHashMap)C).put("byte", Byte.TYPE);
        ((ConcurrentHashMap)C).put("short", Short.TYPE);
        ((ConcurrentHashMap)C).put("int", Integer.TYPE);
        ((ConcurrentHashMap)C).put("long", Long.TYPE);
        ((ConcurrentHashMap)C).put("float", Float.TYPE);
        ((ConcurrentHashMap)C).put("double", Double.TYPE);
        ((ConcurrentHashMap)C).put("boolean", Boolean.TYPE);
        ((ConcurrentHashMap)C).put("char", Character.TYPE);
        ((ConcurrentHashMap)C).put("[byte", byte[].class);
        ((ConcurrentHashMap)C).put("[short", short[].class);
        ((ConcurrentHashMap)C).put("[int", int[].class);
        ((ConcurrentHashMap)C).put("[long", long[].class);
        ((ConcurrentHashMap)C).put("[float", float[].class);
        ((ConcurrentHashMap)C).put("[double", double[].class);
        ((ConcurrentHashMap)C).put("[boolean", boolean[].class);
        ((ConcurrentHashMap)C).put("[char", char[].class);
        ((ConcurrentHashMap)C).put("[B", byte[].class);
        ((ConcurrentHashMap)C).put("[S", short[].class);
        ((ConcurrentHashMap)C).put("[I", int[].class);
        ((ConcurrentHashMap)C).put("[J", long[].class);
        ((ConcurrentHashMap)C).put("[F", float[].class);
        ((ConcurrentHashMap)C).put("[D", double[].class);
        ((ConcurrentHashMap)C).put("[C", char[].class);
        ((ConcurrentHashMap)C).put("[Z", boolean[].class);
        Class clazz = com.github.catvod.spider.merge.H.A.m0("java.lang.AutoCloseable", false);
        Class<?> clazz2 = Collections.EMPTY_MAP.getClass();
        int n2 = 0;
        while (true) {
            if (n2 >= 69) {
                com.github.catvod.spider.merge.H.m.b(T, C);
                new x();
                U = new y();
                W = false;
                return;
            }
            Class clazz3 = (new Class[]{Object.class, Cloneable.class, clazz, Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, HashMap.class, LinkedHashMap.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, LinkedHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, ArrayList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, clazz2, Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, SimpleDateFormat.class, com.github.catvod.spider.merge.y.e.class, com.github.catvod.spider.merge.y.f.class, com.github.catvod.spider.merge.y.b.class})[n2];
            if (clazz3 != null) {
                ((ConcurrentHashMap)C).put(clazz3.getName(), clazz3);
            }
            ++n2;
        }
    }

    public static long A(String string) {
        long l2 = -3750763034362895579L;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            long l3 = l2;
            if (c2 != '_') {
                if (c2 == '-') {
                    l3 = l2;
                } else {
                    char c3 = c2;
                    if (c2 >= 'A') {
                        c3 = c2;
                        if (c2 <= 'Z') {
                            c3 = (char)(c2 + 32);
                        }
                    }
                    l3 = (l2 ^ (long)c3) * 1099511628211L;
                }
            }
            l2 = l3;
        }
        return l2;
    }

    public static long B(String string) {
        long l2 = -3750763034362895579L;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2;
            char c3 = c2 = string.charAt(i2);
            if (c2 >= 'A') {
                c3 = c2;
                if (c2 <= 'Z') {
                    c3 = (char)(c2 + 32);
                }
            }
            l2 = (l2 ^ (long)c3) * 1099511628211L;
        }
        return l2;
    }

    private static Type C(Type type, Map<TypeVariable, Type> map) {
        if (type instanceof TypeVariable) {
            return map.get(type);
        }
        if (type instanceof ParameterizedType) {
            return com.github.catvod.spider.merge.H.A.p0(com.github.catvod.spider.merge.H.A.W(type), ((ParameterizedType)type).getActualTypeArguments(), map);
        }
        if (type instanceof GenericArrayType) {
            return new g(com.github.catvod.spider.merge.H.A.C(((GenericArrayType)type).getGenericComponentType(), map));
        }
        return type;
    }

    public static <A extends Annotation> A D(Class<?> clazz, Class<A> clazz2) {
        int n2;
        int n3;
        A a2 = clazz.getAnnotation(clazz2);
        Object object = com.github.catvod.spider.merge.y.a.d(clazz);
        object = object instanceof Class ? (Class)object : null;
        int n4 = 0;
        if (object != null) {
            A a3 = object.getAnnotation(clazz2);
            Annotation[] annotationArray = object.getAnnotations();
            object = a3;
            if (a3 == null) {
                object = a3;
                if (annotationArray.length > 0) {
                    n3 = annotationArray.length;
                    object = a3;
                    for (n2 = 0; n2 < n3 && (object = annotationArray[n2].annotationType().getAnnotation(clazz2)) == null; ++n2) {
                    }
                }
            }
            if (object != null) {
                return (A)object;
            }
        }
        object = clazz.getAnnotations();
        clazz = a2;
        if (a2 == null) {
            clazz = a2;
            if (((Annotation[])object).length > 0) {
                n3 = ((Annotation[])object).length;
                clazz = a2;
                for (n2 = n4; n2 < n3 && (clazz = object[n2].annotationType().getAnnotation(clazz2)) == null; ++n2) {
                }
            }
        }
        return (A)clazz;
    }

    public static <A extends Annotation> A E(Field field, Class<A> clazz) {
        A a2 = field.getAnnotation(clazz);
        Class clazz2 = com.github.catvod.spider.merge.y.a.d(field.getDeclaringClass());
        boolean bl = clazz2 instanceof Class;
        Object var4_6 = null;
        clazz2 = bl ? (Class)clazz2 : null;
        if (clazz2 != null) {
            String string = field.getName();
            while (true) {
                field = var4_6;
                if (clazz2 == null) break;
                field = var4_6;
                if (clazz2 == Object.class) break;
                try {
                    field = clazz2.getDeclaredField(string);
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    clazz2 = clazz2.getSuperclass();
                    continue;
                }
                break;
            }
            if (field == null) {
                return a2;
            }
            if ((field = field.getAnnotation(clazz)) != null) {
                return (A)field;
            }
        }
        return a2;
    }

    public static <A extends Annotation> A F(Method method, Class<A> clazz) {
        A a2 = method.getAnnotation(clazz);
        Class clazz2 = com.github.catvod.spider.merge.y.a.d(method.getDeclaringClass());
        boolean bl = clazz2 instanceof Class;
        Object var4_6 = null;
        clazz2 = bl ? (Class)clazz2 : null;
        if (clazz2 != null) {
            String string = method.getName();
            Class<?>[] classArray = method.getParameterTypes();
            while (true) {
                method = var4_6;
                if (clazz2 == null) break;
                method = var4_6;
                if (clazz2 == Object.class) break;
                try {
                    method = clazz2.getDeclaredMethod(string, classArray);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    clazz2 = clazz2.getSuperclass();
                    continue;
                }
                break;
            }
            if (method == null) {
                return a2;
            }
            if ((method = method.getAnnotation(clazz)) != null) {
                return (A)method;
            }
        }
        return a2;
    }

    public static Class<?> G(Type object) {
        block8: {
            block7: {
                block6: {
                    if (object.getClass() == Class.class) {
                        return (Class)object;
                    }
                    if (!(object instanceof ParameterizedType)) break block6;
                    object = ((ParameterizedType)object).getRawType();
                    break block7;
                }
                if (object instanceof TypeVariable) {
                    if ((object = ((TypeVariable)object).getBounds()[0]) instanceof Class) {
                        return (Class)object;
                    }
                    return com.github.catvod.spider.merge.H.A.G((Type)object);
                }
                if (!(object instanceof WildcardType) || ((Type[])(object = ((WildcardType)object).getUpperBounds())).length != 1) break block8;
                object = object[0];
            }
            return com.github.catvod.spider.merge.H.A.G((Type)object);
        }
        return Object.class;
    }

    public static Class<?> H(String string) {
        return (Class)((ConcurrentHashMap)C).get(string);
    }

    public static Class<?> I(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2;
            type = type2 = ((ParameterizedType)type).getActualTypeArguments()[0];
            if (type2 instanceof WildcardType) {
                Type[] typeArray = ((WildcardType)type2).getUpperBounds();
                type = type2;
                if (typeArray.length == 1) {
                    type = typeArray[0];
                }
            }
            if (type instanceof Class) {
                if (Modifier.isPublic(((Class)(type = (Class)type)).getModifiers())) {
                    return type;
                }
                throw new com.github.catvod.spider.merge.y.d("can not create ASMParser");
            }
            throw new com.github.catvod.spider.merge.y.d("can not create ASMParser");
        }
        return Object.class;
    }

    private static Type J(Class<?> object) {
        object = ((Class)object).getName().startsWith("java.") ? Object.class : com.github.catvod.spider.merge.H.A.L(com.github.catvod.spider.merge.H.A.M(object));
        return object;
    }

    private static Type K(ParameterizedType object) {
        Type[] typeArray = object.getRawType();
        Object object2 = object.getActualTypeArguments();
        if (typeArray == Collection.class) {
            object = object2 = object2[0];
            if (object2 instanceof WildcardType) {
                object = ((WildcardType)object2).getUpperBounds();
                object = ((Type[])object).length > 0 ? object[0] : Object.class;
            }
            return object;
        }
        typeArray = (Class)typeArray;
        TypeVariable<Class<T>>[] typeVariableArray = typeArray.getTypeParameters();
        int n2 = typeVariableArray.length;
        object = new HashMap(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            object.put(typeVariableArray[i2], object2[i2]);
        }
        if ((typeArray = com.github.catvod.spider.merge.H.A.M(typeArray)) instanceof ParameterizedType) {
            object2 = com.github.catvod.spider.merge.H.A.W((Type)typeArray);
            object = (typeArray = ((ParameterizedType)typeArray).getActualTypeArguments()).length > 0 ? com.github.catvod.spider.merge.H.A.K(com.github.catvod.spider.merge.H.A.p0(object2, typeArray, (Map<TypeVariable, Type>)object)) : com.github.catvod.spider.merge.H.A.J(object2);
            return object;
        }
        return com.github.catvod.spider.merge.H.A.J((Class)typeArray);
    }

    public static Type L(Type type) {
        if (type instanceof ParameterizedType) {
            return com.github.catvod.spider.merge.H.A.K((ParameterizedType)type);
        }
        if (type instanceof Class) {
            return com.github.catvod.spider.merge.H.A.J((Class)type);
        }
        return Object.class;
    }

    private static Type M(Class<?> clazz) {
        Type type;
        Type[] typeArray = clazz.getGenericInterfaces();
        int n2 = typeArray.length;
        Type type2 = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            type = typeArray[i2];
            Class<?> clazz2 = com.github.catvod.spider.merge.H.A.W(type);
            if (clazz2 == Collection.class) {
                return type;
            }
            if (!Collection.class.isAssignableFrom(clazz2)) continue;
            type2 = type;
        }
        type = type2;
        if (type2 == null) {
            type = clazz.getGenericSuperclass();
        }
        return type;
    }

    public static Field N(Class<?> clazz, String string, Field[] fieldArray) {
        for (Field field : fieldArray) {
            char c2;
            String string2 = field.getName();
            if (string.equals(string2)) {
                return field;
            }
            if (string.length() <= 2 || (c2 = string.charAt(0)) < 'a' || c2 > 'z' || (c2 = string.charAt(1)) < 'A' || c2 > 'Z' || !string.equalsIgnoreCase(string2)) continue;
            return field;
        }
        if ((clazz = clazz.getSuperclass()) != null && clazz != Object.class) {
            return com.github.catvod.spider.merge.H.A.N(clazz, string, clazz.getDeclaredFields());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static List<e> O(Class<?> object, boolean bl, Map<String, e> object2) {
        e e2;
        void var0_4;
        ArrayList<e> arrayList = new ArrayList<e>();
        com.github.catvod.spider.merge.z.d d2 = com.github.catvod.spider.merge.H.A.D(object, com.github.catvod.spider.merge.z.d.class);
        if (d2 != null) {
            String[] stringArray = d2.orders();
        } else {
            Object var0_3 = null;
        }
        if (var0_4 != null && ((void)var0_4).length > 0) {
            LinkedHashMap<String, e> linkedHashMap = new LinkedHashMap<String, e>(e2.size());
            for (e e3 : e2.values()) {
                ((AbstractMap)linkedHashMap).put(e3.a, e3);
            }
            for (void var7_11 : var0_4) {
                e2 = (e)linkedHashMap.get(var7_11);
                if (e2 == null) continue;
                arrayList.add(e2);
                ((AbstractMap)linkedHashMap).remove(var7_11);
            }
            arrayList.addAll(linkedHashMap.values());
        } else {
            void var1_5;
            arrayList.addAll(e2.values());
            if (var1_5 != false) {
                Collections.sort(arrayList);
            }
        }
        return arrayList;
    }

    public static Type P(Type type) {
        if (type instanceof ParameterizedType) {
            return type;
        }
        Type type2 = type;
        if (type instanceof Class) {
            type2 = com.github.catvod.spider.merge.H.A.P(((Class)type).getGenericSuperclass());
        }
        return type2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String[] Q(Class object) {
        int n2;
        Object object2;
        if (v == null && !u) {
            try {
                v = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            }
            catch (Throwable throwable) {
                u = true;
            }
        }
        if (v == null) {
            return null;
        }
        if (w == null && !u) {
            try {
                w = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", new Class[0]);
            }
            catch (Throwable throwable) {
                u = true;
            }
        }
        if (x == null && !u) {
            try {
                x = a.class.getMethod("getParameters", new Class[0]);
            }
            catch (Throwable throwable) {
                u = true;
            }
        }
        if (y == null && !u) {
            try {
                y = com.github.catvod.spider.merge.Q0.b.class.getMethod("getName", new Class[0]);
            }
            catch (Throwable throwable) {
                u = true;
            }
        }
        if (z) {
            return null;
        }
        object = v.newInstance(object);
        Iterator<Object> iterator = ((Iterable)w.invoke(object, new Object[0])).iterator();
        object = null;
        while (true) {
            block25: {
                block24: {
                    if (!iterator.hasNext()) break;
                    object2 = iterator.next();
                    List list = (List)x.invoke(object2, new Object[0]);
                    if (object == null) break block24;
                    if (list.size() == 0) break block25;
                }
                object = object2;
            }
            iterator.hasNext();
            continue;
            break;
        }
        if (object == null) {
            return null;
        }
        try {
            object = (List)x.invoke(object, new Object[0]);
            object2 = new String[object.size()];
            n2 = 0;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            z = true;
            return null;
        }
        while (true) {
            if (n2 >= object.size()) return object2;
            iterator = object.get(n2);
            object2[n2] = (String)y.invoke(iterator, new Object[0]);
            ++n2;
            continue;
            break;
        }
    }

    public static Constructor R(Constructor[] constructorArray, String[] stringArray) {
        int n2 = constructorArray.length;
        Constructor constructor = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            Constructor constructor2 = constructorArray[i2];
            Class<?>[] classArray = constructor2.getParameterTypes();
            if (stringArray != null && classArray.length != stringArray.length) continue;
            if (classArray.length > 0) {
                classArray[classArray.length - 1].getName();
            }
            if (constructor != null && constructor.getParameterTypes().length >= classArray.length) continue;
            constructor = constructor2;
        }
        return constructor;
    }

    public static Annotation[][] S(Constructor object) {
        Annotation[][] annotationArray = object.getParameterAnnotations();
        Class clazz = com.github.catvod.spider.merge.y.a.d(object.getDeclaringClass());
        boolean bl = clazz instanceof Class;
        Class[] classArray = null;
        clazz = bl ? (Class)clazz : null;
        if (clazz != null) {
            Object object2;
            Class<?>[] classArray2 = object.getParameterTypes();
            ArrayList<GenericDeclaration> arrayList = new ArrayList<GenericDeclaration>(2);
            for (object = clazz.getEnclosingClass(); object != null; object = object.getEnclosingClass()) {
                arrayList.add((GenericDeclaration)object);
            }
            int n2 = arrayList.size();
            object = clazz;
            while (true) {
                object2 = classArray;
                if (object == null) break;
                object2 = classArray;
                if (object == Object.class) break;
                if (n2 != 0) {
                    object2 = new Class[classArray2.length + n2];
                    System.arraycopy(classArray2, 0, object2, n2, classArray2.length);
                    for (int i2 = n2; i2 > 0; --i2) {
                        int n3 = i2 - 1;
                        object2[n3] = (Class)arrayList.get(n3);
                        continue;
                    }
                    object2 = clazz.getDeclaredConstructor((Class<?>)object2);
                    object = object2;
                }
                try {
                    object2 = clazz.getDeclaredConstructor(classArray2);
                    object = object2;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    --n2;
                    object = object.getSuperclass();
                    continue;
                }
                object2 = object;
                break;
            }
            if (object2 == null) {
                return annotationArray;
            }
            object = object2.getParameterAnnotations();
            if (object != null) {
                return object;
            }
        }
        return annotationArray;
    }

    public static Annotation[][] T(Method object) {
        Annotation[][] annotationArray = object.getParameterAnnotations();
        Class clazz = com.github.catvod.spider.merge.y.a.d(object.getDeclaringClass());
        boolean bl = clazz instanceof Class;
        Object var3_5 = null;
        clazz = bl ? (Class)clazz : null;
        if (clazz != null) {
            String string = object.getName();
            Class<?>[] classArray = object.getParameterTypes();
            while (true) {
                object = var3_5;
                if (clazz == null) break;
                object = var3_5;
                if (clazz == Object.class) break;
                try {
                    object = clazz.getDeclaredMethod(string, classArray);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    clazz = clazz.getSuperclass();
                    continue;
                }
                break;
            }
            if (object == null) {
                return annotationArray;
            }
            if ((object = object.getParameterAnnotations()) != null) {
                return object;
            }
        }
        return annotationArray;
    }

    private static String U(Map<String, Field> map, String string, String string2, int n2) {
        String string3 = string2;
        if (c) {
            string3 = string2;
            if (!map.containsKey(string2)) {
                string = string.substring(n2);
                string3 = string2;
                if (map.containsKey(string)) {
                    string3 = string;
                }
            }
        }
        return string3;
    }

    public static String V(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toLowerCase(string.charAt(3)));
        stringBuilder.append(string.substring(4));
        return stringBuilder.toString();
    }

    public static Class<?> W(Type object) {
        block6: {
            block7: {
                block5: {
                    block4: {
                        if (object instanceof Class) {
                            return (Class)object;
                        }
                        if (!(object instanceof ParameterizedType)) break block4;
                        object = ((ParameterizedType)object).getRawType();
                        break block5;
                    }
                    if (!(object instanceof WildcardType)) break block6;
                    if (((Type[])(object = ((WildcardType)object).getUpperBounds())).length != 1) break block7;
                    object = object[0];
                }
                return com.github.catvod.spider.merge.H.A.W((Type)object);
            }
            throw new com.github.catvod.spider.merge.y.d("TODO");
        }
        throw new com.github.catvod.spider.merge.y.d("TODO");
    }

    public static b X(Class<?> classArray, Method method) {
        int n4;
        Object object;
        Class<?>[] classArray2 = classArray.getInterfaces();
        if (classArray2.length > 0) {
            object = method.getParameterTypes();
            int n2 = classArray2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Method[] object3 = classArray2[i2].getMethods();
                int n3 = object3.length;
                for (n4 = 0; n4 < n3; ++n4) {
                    int n32;
                    Object object2;
                    Method method2;
                    block8: {
                        method2 = object3[n4];
                        object2 = method2.getParameterTypes();
                        if (((Class<?>[])object2).length != ((Object)object).length || !method2.getName().equals(method.getName())) continue;
                        for (n32 = 0; n32 < ((Object)object).length; ++n32) {
                            if (object2[n32].equals(object[n32])) continue;
                            n32 = 0;
                            break block8;
                        }
                        n32 = 1;
                    }
                    if (n32 == 0 || (object2 = com.github.catvod.spider.merge.H.A.F(method2, b.class)) == null) continue;
                    return object2;
                }
            }
        }
        if ((object = classArray.getSuperclass()) == null) {
            return null;
        }
        if (Modifier.isAbstract(((Class)object).getModifiers())) {
            classArray = method.getParameterTypes();
            for (Method method3 : ((Class)object).getMethods()) {
                b b2;
                block9: {
                    classArray2 = method3.getParameterTypes();
                    if (classArray2.length != classArray.length || !method3.getName().equals(method.getName())) continue;
                    for (n4 = 0; n4 < classArray.length; ++n4) {
                        if (classArray2[n4].equals(classArray[n4])) continue;
                        n4 = 0;
                        break block9;
                    }
                    n4 = 1;
                }
                if (n4 == 0 || (b2 = com.github.catvod.spider.merge.H.A.F(method3, b.class)) == null) continue;
                return b2;
            }
        }
        return null;
    }

    public static int Y(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0;
        }
        int n2 = bigDecimal.scale();
        if (n2 >= -100 && n2 <= 100) {
            return bigDecimal.intValue();
        }
        return bigDecimal.intValueExact();
    }

    public static boolean Z(Method method) {
        boolean bl;
        block7: {
            block8: {
                boolean bl2 = false;
                if (method == null) {
                    return false;
                }
                if (o == null && !p) {
                    try {
                        o = Class.forName("javax.persistence.ManyToMany");
                    }
                    catch (Throwable throwable) {
                        p = true;
                    }
                }
                bl = bl2;
                if (o == null) break block7;
                if (method.isAnnotationPresent(m)) break block8;
                bl = bl2;
                if (!method.isAnnotationPresent(o)) break block7;
            }
            bl = true;
        }
        return bl;
    }

    public static void a(String string, Class<?> clazz) {
        ((ConcurrentHashMap)C).put(string, clazz);
    }

    public static boolean a0(Method method) {
        boolean bl = false;
        if (method == null) {
            return false;
        }
        if (m == null && !n) {
            try {
                m = Class.forName("javax.persistence.OneToMany");
            }
            catch (Throwable throwable) {
                n = true;
            }
        }
        Class<? extends Annotation> clazz = m;
        boolean bl2 = bl;
        if (clazz != null) {
            bl2 = bl;
            if (method.isAnnotationPresent(clazz)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static d0 b(Class clazz, boolean bl) {
        int n2;
        Object object;
        Object object2;
        List list;
        Object[] objectArray;
        Object object3;
        com.github.catvod.spider.merge.z.d d2 = com.github.catvod.spider.merge.H.A.D(clazz, com.github.catvod.spider.merge.z.d.class);
        Object object4 = null;
        Object[] objectArray2 = null;
        if (d2 != null) {
            object3 = d2.orders();
            objectArray = d2.typeName();
            list = objectArray;
            if (objectArray.length() == 0) {
                list = null;
            }
            if ((objectArray = d2.naming()) == com.github.catvod.spider.merge.y.V.b) {
                objectArray = null;
            }
            int n3 = i0.h(d2.serialzeFeatures());
            object4 = clazz.getSuperclass();
            object2 = null;
            while (true) {
                object = object2;
                if (object4 == null) break;
                object = object2;
                if (object4 == Object.class) break;
                object = com.github.catvod.spider.merge.H.A.D(object4, com.github.catvod.spider.merge.z.d.class);
                if (object == null) {
                    object = object2;
                    break;
                }
                object2 = object.typeKey();
                if (((String)object2).length() != 0) {
                    object = object2;
                    break;
                }
                object4 = object4.getSuperclass();
            }
            object4 = clazz.getInterfaces();
            int n4 = ((Class<?>[])object4).length;
            n2 = 0;
            object2 = object;
            while (true) {
                object = object2;
                if (n2 >= n4) break;
                object = com.github.catvod.spider.merge.H.A.D(object4[n2], com.github.catvod.spider.merge.z.d.class);
                if (object != null) {
                    object2 = object = object.typeKey();
                    if (((String)object).length() != 0) break;
                }
                ++n2;
            }
            object2 = object != null && ((String)object).length() == 0 ? objectArray2 : object;
            objectArray2 = object2;
            object4 = objectArray;
            object = object3;
            object2 = list;
            objectArray = objectArray2;
            n2 = n3;
        } else {
            object = null;
            object2 = null;
            objectArray = object2;
            n2 = 0;
        }
        object3 = new HashMap();
        com.github.catvod.spider.merge.B.o.k(clazz, (Map<String, Field>)object3);
        list = bl ? com.github.catvod.spider.merge.H.A.w(clazz, false, object4) : com.github.catvod.spider.merge.H.A.v(clazz, (Map)object3, false, object4);
        objectArray2 = new e[list.size()];
        list.toArray(objectArray2);
        if (object != null && (object).length != 0) {
            list = bl ? com.github.catvod.spider.merge.H.A.w(clazz, true, object4) : com.github.catvod.spider.merge.H.A.v(clazz, (Map)object3, true, object4);
        } else {
            list = new ArrayList(list);
            Collections.sort(list);
        }
        object = new e[list.size()];
        list.toArray((T[])object);
        list = object;
        if (Arrays.equals((Object[])object, objectArray2)) {
            list = objectArray2;
        }
        return new d0(clazz, d2, (String)object2, (String)objectArray, n2, (e[])objectArray2, (e[])list);
    }

    public static boolean b0(Class constable) {
        boolean bl = (constable = com.github.catvod.spider.merge.H.m.b(O, constable)) != null ? (Boolean)constable : false;
        return bl;
    }

    public static byte c(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0;
        }
        int n2 = bigDecimal.scale();
        if (n2 >= -100 && n2 <= 100) {
            return bigDecimal.byteValue();
        }
        return bigDecimal.byteValueExact();
    }

    public static boolean c0(Type type) {
        boolean bl = type instanceof ParameterizedType;
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        if (type instanceof Class) {
            if ((type = ((Class)type).getGenericSuperclass()) == Object.class || !com.github.catvod.spider.merge.H.A.c0(type)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static <T> T d(Object object, Class<T> serializable, o TArray) {
        T[] TArray2;
        Date date;
        int n2 = 0;
        Object object2 = null;
        if (object == null) {
            if (date == Integer.TYPE) {
                return (T)Integer.valueOf(0);
            }
            if (date == Long.TYPE) {
                return (T)Long.valueOf(0L);
            }
            if (date == Short.TYPE) {
                return (T)Short.valueOf((short)0);
            }
            if (date == Byte.TYPE) {
                return (T)Byte.valueOf((byte)0);
            }
            if (date == Float.TYPE) {
                return (T)Float.valueOf(0.0f);
            }
            if (date == Double.TYPE) {
                return (T)Double.valueOf(0.0);
            }
            if (date != Boolean.TYPE) return null;
            return (T)Boolean.FALSE;
        }
        if (date == null) throw new IllegalArgumentException("clazz is null");
        if (date == object.getClass()) {
            return (T)object;
        }
        if (object instanceof Map) {
            if (date == Map.class) {
                return (T)object;
            }
            object2 = (Map)object;
            if (date != Object.class) return com.github.catvod.spider.merge.H.A.p((Map<String, Object>)object2, date, (o)TArray2);
            if (object2.containsKey(com.github.catvod.spider.merge.y.a.c)) return com.github.catvod.spider.merge.H.A.p((Map<String, Object>)object2, date, (o)TArray2);
            return (T)object;
        }
        if (((Class)((Object)date)).isArray()) {
            if (object instanceof Collection) {
                object2 = (Collection)object;
                Object object3 = Array.newInstance(((Class)((Object)date)).getComponentType(), object2.size());
                object2 = object2.iterator();
                while (object2.hasNext()) {
                    Array.set(object3, n2, com.github.catvod.spider.merge.H.A.d(object2.next(), ((Class)((Object)date)).getComponentType(), (o)TArray2));
                    ++n2;
                }
                return (T)object3;
            }
            if (date == byte[].class) {
                void var0_4;
                if (object instanceof byte[]) {
                    byte[] byArray = (byte[])object;
                    return var0_4;
                }
                if (!(object instanceof String)) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to byte[], value : ", object));
                byte[] byArray = com.github.catvod.spider.merge.H.i.b((String)object);
                return var0_4;
            }
        }
        if (((Class)((Object)date)).isAssignableFrom(object.getClass())) {
            return (T)object;
        }
        if (date == Boolean.TYPE) return (T)com.github.catvod.spider.merge.H.A.i(object);
        if (date == Boolean.class) {
            return (T)com.github.catvod.spider.merge.H.A.i(object);
        }
        if (date == Byte.TYPE) return (T)com.github.catvod.spider.merge.H.A.j(object);
        if (date == Byte.class) {
            return (T)com.github.catvod.spider.merge.H.A.j(object);
        }
        if (date == Character.TYPE) return (T)com.github.catvod.spider.merge.H.A.k(object);
        if (date == Character.class) {
            return (T)com.github.catvod.spider.merge.H.A.k(object);
        }
        if (date == Short.TYPE) return (T)com.github.catvod.spider.merge.H.A.r(object);
        if (date == Short.class) {
            return (T)com.github.catvod.spider.merge.H.A.r(object);
        }
        if (date == Integer.TYPE) return (T)com.github.catvod.spider.merge.H.A.o(object);
        if (date == Integer.class) {
            return (T)com.github.catvod.spider.merge.H.A.o(object);
        }
        if (date == Long.TYPE) return (T)com.github.catvod.spider.merge.H.A.q(object);
        if (date == Long.class) {
            return (T)com.github.catvod.spider.merge.H.A.q(object);
        }
        if (date == Float.TYPE) return (T)com.github.catvod.spider.merge.H.A.n(object);
        if (date == Float.class) {
            return (T)com.github.catvod.spider.merge.H.A.n(object);
        }
        if (date == Double.TYPE) return (T)com.github.catvod.spider.merge.H.A.m(object);
        if (date == Double.class) {
            return (T)com.github.catvod.spider.merge.H.A.m(object);
        }
        if (date == String.class) {
            return (T)object.toString();
        }
        if (date == BigDecimal.class) {
            return (T)com.github.catvod.spider.merge.H.A.g(object);
        }
        if (date == BigInteger.class) {
            return (T)com.github.catvod.spider.merge.H.A.h(object);
        }
        if (date == Date.class) {
            return (T)com.github.catvod.spider.merge.H.A.l(object, null);
        }
        Object object4 = com.github.catvod.spider.merge.H.m.a(S, object, date);
        if (object4 != null) {
            return (T)object4;
        }
        if (((Class)((Object)date)).isEnum()) {
            T[] TArray3;
            void var0_15;
            block48: {
                try {
                    if (object instanceof String) {
                        void var0_8;
                        com.github.catvod.spider.merge.C.v v2;
                        object4 = (String)object;
                        if (((String)object4).length() == 0) {
                            Object object5 = object2;
                            return var0_15;
                        }
                        T[] TArray4 = TArray2;
                        if (TArray2 == null) {
                            o o2 = com.github.catvod.spider.merge.B.o.v;
                        }
                        if ((v2 = var0_8.f((Type)((Object)date))) instanceof j) {
                            Enum enum_ = ((j)v2).b(com.github.catvod.spider.merge.H.A.z((String)object4));
                            return var0_15;
                        }
                        Object t2 = Enum.valueOf(date, (String)object4);
                        return var0_15;
                    }
                    if (!(object instanceof BigDecimal) || (n2 = com.github.catvod.spider.merge.H.A.Y((BigDecimal)object)) >= (TArray2 = ((Class)((Object)date)).getEnumConstants()).length) break block48;
                }
                catch (Exception exception) {
                    throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e((Class)((Object)date), com.github.catvod.spider.merge.C.a.c("can not cast to : ")), exception);
                }
                Object t3 = TArray2[n2];
                return var0_15;
            }
            if (!(object instanceof Number)) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e((Class)((Object)date), com.github.catvod.spider.merge.C.a.c("can not cast to : ")));
            n2 = ((Number)object).intValue();
            if (n2 >= (TArray3 = ((Class)((Object)date)).getEnumConstants()).length) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e((Class)((Object)date), com.github.catvod.spider.merge.C.a.c("can not cast to : ")));
            Object t4 = TArray3[n2];
            return var0_15;
        }
        if (Calendar.class.isAssignableFrom((Class<?>)((Object)date))) {
            void var0_19;
            TArray2 = com.github.catvod.spider.merge.H.A.l(object, null);
            if (date == Calendar.class) {
                Calendar calendar = Calendar.getInstance(com.github.catvod.spider.merge.y.a.a, com.github.catvod.spider.merge.y.a.b);
            } else {
                Calendar calendar = (Calendar)((Class)((Object)date)).newInstance();
            }
            var0_19.setTime((Date)TArray2);
            return var0_19;
            catch (Exception exception) {
                throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e((Class)((Object)date), com.github.catvod.spider.merge.C.a.c("can not cast to : ")), exception);
            }
        }
        object2 = ((Class)((Object)date)).getName();
        if (((String)object2).equals("javax.xml.datatype.XMLGregorianCalendar")) {
            date = com.github.catvod.spider.merge.H.A.l(object, null);
            Calendar calendar = Calendar.getInstance(com.github.catvod.spider.merge.y.a.a, com.github.catvod.spider.merge.y.a.b);
            calendar.setTime(date);
            return (T)com.github.catvod.spider.merge.D.r.b.g(calendar);
        }
        if (object instanceof String) {
            object4 = (String)object;
            if (((String)object4).length() == 0) return null;
            if ("null".equals(object4)) return null;
            if ("NULL".equals(object4)) {
                return null;
            }
            if (date == Currency.class) {
                return (T)Currency.getInstance((String)object4);
            }
            if (date == Locale.class) {
                return (T)com.github.catvod.spider.merge.H.A.u0((String)object4);
            }
            if (((String)object2).startsWith("java.time.")) {
                return com.github.catvod.spider.merge.y.a.j(com.github.catvod.spider.merge.y.a.m(object4), date);
            }
        }
        if (TArray2.d((Type)((Object)date)) == null) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e((Class)((Object)date), com.github.catvod.spider.merge.C.a.c("can not cast to : ")));
        return com.github.catvod.spider.merge.y.a.j(com.github.catvod.spider.merge.y.a.m(object), date);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d0(Object object) {
        Method method;
        if (object == null) {
            return false;
        }
        if (q == null && !r) {
            try {
                q = Class.forName("org.hibernate.Hibernate").getMethod("isInitialized", Object.class);
            }
            catch (Throwable throwable) {
                r = true;
            }
        }
        if ((method = q) == null) return true;
        try {
            return (Boolean)method.invoke(null, object);
        }
        catch (Throwable throwable) {
            return true;
        }
    }

    public static <T> T e(Object object72, ParameterizedType object2, o object3) {
        Object object;
        Object object4;
        Type object62 = object2.getRawType();
        if (object62 == List.class || object62 == ArrayList.class) {
            object4 = object2.getActualTypeArguments()[0];
            if (object72 instanceof List) {
                object72 = (List)object72;
                object2 = new ArrayList(object72.size());
                Iterator iterator = object72.iterator();
                while (iterator.hasNext()) {
                    object72 = iterator.next();
                    object72 = object4 instanceof Class ? (object72 != null && object72.getClass() == com.github.catvod.spider.merge.y.e.class ? ((com.github.catvod.spider.merge.y.e)object72).z((Class)object4, (o)object3) : com.github.catvod.spider.merge.H.A.d(object72, (Class)object4, (o)object3)) : com.github.catvod.spider.merge.H.A.f(object72, (Type)object4, (o)object3);
                    ((ArrayList)object2).add(object72);
                }
                return (T)object2;
            }
        }
        if (object62 == Set.class || object62 == HashSet.class || object62 == TreeSet.class || object62 == Collection.class || object62 == List.class || object62 == ArrayList.class) {
            object4 = object2.getActualTypeArguments()[0];
            if (object72 instanceof Iterable) {
                object2 = object62 != Set.class && object62 != HashSet.class ? (object62 == TreeSet.class ? new TreeSet() : new ArrayList()) : new HashSet();
                for (Object object72 : (Iterable)object72) {
                    object72 = object4 instanceof Class ? (object72 != null && object72.getClass() == com.github.catvod.spider.merge.y.e.class ? ((com.github.catvod.spider.merge.y.e)object72).z((Class)object4, (o)object3) : com.github.catvod.spider.merge.H.A.d(object72, (Class)object4, (o)object3)) : com.github.catvod.spider.merge.H.A.f(object72, (Type)object4, (o)object3);
                    object2.add(object72);
                }
                return (T)object2;
            }
        }
        if (object62 == Map.class || object62 == HashMap.class) {
            object = object2.getActualTypeArguments()[0];
            object4 = object2.getActualTypeArguments()[1];
            if (object72 instanceof Map) {
                object2 = new HashMap();
                for (Map.Entry entry : ((Map)object72).entrySet()) {
                    ((HashMap)object2).put(com.github.catvod.spider.merge.H.A.f(entry.getKey(), (Type)object, (o)object3), com.github.catvod.spider.merge.H.A.f(entry.getValue(), (Type)object4, (o)object3));
                }
                return (T)object2;
            }
        }
        if (object72 instanceof String && ((String)object72).length() == 0) {
            return null;
        }
        object4 = object2.getActualTypeArguments();
        if (((Type[])object4).length == 1 && object2.getActualTypeArguments()[0] instanceof WildcardType) {
            return com.github.catvod.spider.merge.H.A.f(object72, object62, (o)object3);
        }
        if (object62 == Map.Entry.class && object72 instanceof Map && (object = (Map)object72).size() == 1) {
            object72 = object.entrySet().iterator().next();
            object2 = object72.getValue();
            if (((Type[])object4).length == 2 && object2 instanceof Map) {
                object72.setValue(com.github.catvod.spider.merge.H.A.f(object2, object4[1], (o)object3));
            }
            return (T)object72;
        }
        if (object62 instanceof Class) {
            object4 = object3;
            if (object3 == null) {
                object4 = com.github.catvod.spider.merge.B.o.v;
            }
            if ((object3 = object4.f(object62)) != null) {
                object72 = com.github.catvod.spider.merge.y.a.m(object72);
                return object3.c(new com.github.catvod.spider.merge.B.b(object72, new com.github.catvod.spider.merge.B.i((String)object72, com.github.catvod.spider.merge.y.a.f), (o)object4), (Type)object2, null);
            }
        }
        object72 = new StringBuilder();
        ((StringBuilder)object72).append("can not cast to : ");
        ((StringBuilder)object72).append(object2);
        throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object72).toString());
    }

    private static boolean e0(Class<?> clazz, String string) {
        String[] stringArray = com.github.catvod.spider.merge.H.A.D(clazz, com.github.catvod.spider.merge.z.d.class);
        if (stringArray != null) {
            String[] stringArray2 = stringArray.includes();
            if (stringArray2.length > 0) {
                int n2 = stringArray2.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (!string.equals(stringArray2[i2])) continue;
                    return false;
                }
                return true;
            }
            stringArray = stringArray.ignores();
            int n3 = stringArray.length;
            for (int i4 = 0; i4 < n3; ++i4) {
                if (!string.equals(stringArray[i4])) continue;
                return true;
            }
        }
        if (clazz.getSuperclass() != Object.class && clazz.getSuperclass() != null) {
            return com.github.catvod.spider.merge.H.A.e0(clazz.getSuperclass(), string);
        }
        return false;
    }

    public static <T> T f(Object object, Type type, o object2) {
        if (object == null) {
            return null;
        }
        if (type instanceof Class) {
            return com.github.catvod.spider.merge.H.A.d(object, (Class)type, (o)object2);
        }
        if (type instanceof ParameterizedType) {
            return com.github.catvod.spider.merge.H.A.e(object, (ParameterizedType)type, (o)object2);
        }
        if (object instanceof String && (((String)(object2 = (String)object)).length() == 0 || "null".equals(object2) || "NULL".equals(object2))) {
            return null;
        }
        if (type instanceof TypeVariable) {
            return (T)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("can not cast to : ");
        ((StringBuilder)object).append(type);
        throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object).toString());
    }

    public static boolean f0(Class clazz) {
        Class clazz2 = s;
        boolean bl = true;
        if (clazz2 == null && !t) {
            try {
                s = Class.forName("com.github.catvod.spider.merge.N0.a");
            }
            catch (Throwable throwable) {
                t = true;
            }
        }
        if (s == null || !clazz.isAnnotationPresent(s)) {
            bl = false;
        }
        return bl;
    }

    public static BigDecimal g(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Float) {
            Float f2 = (Float)object;
            if (Float.isNaN(f2.floatValue()) || Float.isInfinite(f2.floatValue())) {
                return null;
            }
        } else if (object instanceof Double) {
            Double d2 = (Double)object;
            if (Double.isNaN(d2) || Double.isInfinite(d2)) {
                return null;
            }
        } else {
            if (object instanceof BigDecimal) {
                return (BigDecimal)object;
            }
            if (object instanceof BigInteger) {
                return new BigDecimal((BigInteger)object);
            }
            if (object instanceof Map && ((Map)object).size() == 0) {
                return null;
            }
        }
        if (((String)(object = object.toString())).length() != 0 && !((String)object).equalsIgnoreCase("null")) {
            if (((String)object).length() <= 65535) {
                return new BigDecimal((String)object);
            }
            throw new com.github.catvod.spider.merge.y.d("decimal overflow");
        }
        return null;
    }

    public static boolean g0(String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (!(c2 != '+' && c2 != '-' ? c2 < '0' || c2 > '9' : i2 != 0)) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static BigInteger h(Object object) {
        BigDecimal bigDecimal;
        int n2;
        long l2;
        if (object == null) {
            return null;
        }
        if (object instanceof Float) {
            if (Float.isNaN(((Float)(object = (Float)object)).floatValue()) || Float.isInfinite(((Float)object).floatValue())) return null;
            l2 = ((Float)object).longValue();
            return BigInteger.valueOf(l2);
        }
        if (object instanceof Double) {
            if (Double.isNaN((Double)(object = (Double)object)) || Double.isInfinite((Double)object)) return null;
            l2 = ((Double)object).longValue();
            return BigInteger.valueOf(l2);
        }
        if (object instanceof BigInteger) {
            return (BigInteger)object;
        }
        if (object instanceof BigDecimal && (n2 = (bigDecimal = (BigDecimal)object).scale()) > -1000 && n2 < 1000) {
            return bigDecimal.toBigInteger();
        }
        if (((String)(object = object.toString())).length() == 0 || ((String)object).equalsIgnoreCase("null")) return null;
        if (((String)object).length() > 65535) throw new com.github.catvod.spider.merge.y.d("decimal overflow");
        return new BigInteger((String)object);
    }

    public static boolean h0(Class<?> clazz) {
        Class<?> clazz2;
        if (D == null && !E) {
            try {
                D = Class.forName("java.nio.file.Path");
            }
            catch (Throwable throwable) {
                E = true;
            }
        }
        if ((clazz2 = D) != null) {
            return clazz2.isAssignableFrom(clazz);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Boolean i(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        boolean bl = object instanceof BigDecimal;
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl) {
            bl2 = bl3;
            if (com.github.catvod.spider.merge.H.A.Y((BigDecimal)object) != 1) return bl2;
            bl2 = true;
            return bl2;
        }
        if (object instanceof Number) {
            if (((Number)object).intValue() != 1) return bl2;
            bl2 = true;
            return bl2;
        }
        if (!(object instanceof String)) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to boolean, value : ", object));
        String string = (String)object;
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) return null;
        if ("true".equalsIgnoreCase(string) || "1".equals(string)) return Boolean.TRUE;
        if ("false".equalsIgnoreCase(string) || "0".equals(string)) return Boolean.FALSE;
        if ("Y".equalsIgnoreCase(string) || "T".equals(string)) return Boolean.TRUE;
        if (!"F".equalsIgnoreCase(string) && !"N".equals(string)) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to boolean, value : ", object));
        return Boolean.FALSE;
    }

    public static boolean i0(Class<?> object) {
        Class<?>[] classArray = ((Class)object).getInterfaces();
        int n2 = classArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = classArray[i2].getName();
            if (!((HashSet)U).contains(object)) continue;
            return true;
        }
        return false;
    }

    public static Byte j(Object object) {
        block8: {
            block9: {
                byte by;
                block6: {
                    block7: {
                        block5: {
                            if (object == null) {
                                return null;
                            }
                            if (!(object instanceof BigDecimal)) break block5;
                            by = com.github.catvod.spider.merge.H.A.c((BigDecimal)object);
                            break block6;
                        }
                        if (!(object instanceof Number)) break block7;
                        by = ((Number)object).byteValue();
                        break block6;
                    }
                    if (!(object instanceof String)) break block8;
                    if (((String)(object = (String)object)).length() == 0 || "null".equals(object) || "NULL".equals(object)) break block9;
                    by = Byte.parseByte((String)object);
                }
                return by;
            }
            return null;
        }
        if (object instanceof Boolean) {
            return (byte)(((Boolean)object).booleanValue() ? 1 : 0);
        }
        throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to byte, value : ", object));
    }

    /*
     * Unable to fully structure code
     */
    public static boolean j0(Method var0) {
        var2_2 = false;
        if (var0 == null) {
            return false;
        }
        if (com.github.catvod.spider.merge.H.A.k) ** GOTO lbl13
        try {
            com.github.catvod.spider.merge.H.A.l = Class.forName("java.beans.Transient");
        }
        catch (Throwable var0_1) {
            com.github.catvod.spider.merge.H.A.k = true;
            throw var0_1;
        }
lbl11:
        // 2 sources

        while (true) {
            com.github.catvod.spider.merge.H.A.k = true;
lbl13:
            // 2 sources

            var3_4 = com.github.catvod.spider.merge.H.A.l;
            var1_5 = var2_2;
            if (var3_4 != null) {
                var1_5 = var2_2;
                if (com.github.catvod.spider.merge.H.A.F(var0, var3_4) != null) {
                    var1_5 = true;
                }
            }
            return var1_5;
        }
        catch (Exception var3_3) {
            ** continue;
        }
    }

    public static Character k(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Character) {
            return (Character)object;
        }
        if (object instanceof String) {
            String string = (String)object;
            if (string.length() == 0) {
                return null;
            }
            if (string.length() == 1) {
                return Character.valueOf(string.charAt(0));
            }
            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to char, value : ", object));
        }
        throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to char, value : ", object));
    }

    public static boolean k0(Class object) {
        boolean bl;
        block17: {
            Class clazz = I;
            bl = true;
            if (clazz == null && !J) {
                try {
                    I = Class.forName("javax.xml.bind.annotation.XmlAccessorType");
                }
                catch (Throwable throwable) {
                    J = true;
                }
            }
            if (I == null) {
                return false;
            }
            if ((object = com.github.catvod.spider.merge.H.A.D(object, I)) == null) {
                return false;
            }
            if (K == null && !J) {
                try {
                    K = I.getMethod("value", new Class[0]);
                }
                catch (Throwable throwable) {
                    J = true;
                }
            }
            if (K == null) {
                return false;
            }
            if (!J) {
                try {
                    object = K.invoke(object, new Object[0]);
                    break block17;
                }
                catch (Throwable throwable) {
                    J = true;
                }
            }
            object = null;
        }
        if (object == null) {
            return false;
        }
        if (H == null && !J) {
            try {
                H = Class.forName("javax.xml.bind.annotation.XmlAccessType");
                L = H.getField("FIELD");
                M = L.get(null);
            }
            catch (Throwable throwable) {
                J = true;
            }
        }
        if (object != M) {
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public static Date l(Object var0, String var1_7) {
        block31: {
            block33: {
                block32: {
                    block30: {
                        block29: {
                            block27: {
                                block28: {
                                    if (var0 == null) {
                                        return null;
                                    }
                                    if (var0 instanceof Date) {
                                        return (Date)var0;
                                    }
                                    if (var0 instanceof Calendar) {
                                        return ((Calendar)var0).getTime();
                                    }
                                    if (var0 instanceof BigDecimal) {
                                        return new Date(com.github.catvod.spider.merge.H.A.o0((BigDecimal)var0));
                                    }
                                    if (var0 instanceof Number) {
                                        var3_11 = var5_10 = ((Number)var0).longValue();
                                        if ("unixtime".equals(var1_7)) {
                                            var3_11 = var5_10 * 1000L;
                                        }
                                        return new Date(var3_11);
                                    }
                                    if (!(var0 instanceof String)) break block29;
                                    var8_13 = (String)var0;
                                    var7_14 = new com.github.catvod.spider.merge.B.i(var8_13);
                                    if (var7_14.x0(false)) {
                                        var0 = var7_14.S().getTime();
                                        return var0;
                                    }
                                    var7_14 = var8_13;
                                    if (var8_13.startsWith("/Date(")) {
                                        var7_14 = var8_13;
                                        if (var8_13.endsWith(")/")) {
                                            var7_14 = var8_13.substring(6, var8_13.length() - 2);
                                        }
                                    }
                                    if (var7_14.indexOf(45) > 0 || var7_14.indexOf(43) > 0 || var1_7 != null) break block27;
                                    if (var7_14.length() != 0) break block28;
                                    return null;
                                }
                                var3_12 = Long.parseLong((String)var7_14);
                                break block30;
                            }
                            var0 = var1_7;
                            if (var1_7 == null) {
                                var2_15 = var7_14.length();
                                var0 = !(var2_15 == com.github.catvod.spider.merge.y.a.e.length() || var2_15 == 22 && com.github.catvod.spider.merge.y.a.e.equals("yyyyMMddHHmmssSSSZ")) ? (var2_15 == 10 ? "yyyy-MM-dd" : (var2_15 == 19 ? "yyyy-MM-dd HH:mm:ss" : (var2_15 == 29 && var7_14.charAt(26) == ':' && var7_14.charAt(28) == '0' ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : (var2_15 == 23 && var7_14.charAt(19) == ',' ? "yyyy-MM-dd HH:mm:ss,SSS" : "yyyy-MM-dd HH:mm:ss.SSS")))) : com.github.catvod.spider.merge.y.a.e;
                            }
                            var0 = new SimpleDateFormat((String)var0, com.github.catvod.spider.merge.y.a.b);
                            var0.setTimeZone(com.github.catvod.spider.merge.y.a.a);
                            try {
                                var0 = var0.parse((String)var7_14);
                                return var0;
                            }
                            catch (ParseException var0_1) {
                                throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("can not cast to Date, value : ", (String)var7_14));
                            }
                            finally {
                                var7_14.close();
                            }
                        }
                        var3_12 = -1L;
                    }
                    if (var3_12 != -1L) break block31;
                    var1_7 = var0.getClass();
                    if (!"oracle.sql.TIMESTAMP".equals(var1_7.getName())) break block32;
                    if (com.github.catvod.spider.merge.H.A.f != null || com.github.catvod.spider.merge.H.A.e) ** GOTO lbl62
                    try {
                        com.github.catvod.spider.merge.H.A.f = var1_7.getMethod("toJdbc", new Class[0]);
                    }
                    catch (Throwable var0_3) {
                        com.github.catvod.spider.merge.H.A.e = true;
                        throw var0_3;
                    }
lbl60:
                    // 2 sources

                    while (true) {
                        com.github.catvod.spider.merge.H.A.e = true;
lbl62:
                        // 2 sources

                        try {
                            var0 = com.github.catvod.spider.merge.H.A.f.invoke(var0, new Object[0]);
                        }
                        catch (Exception var0_4) {
                            throw new com.github.catvod.spider.merge.y.d("can not cast oracle.sql.TIMESTAMP to Date", var0_4);
                        }
                        return (Date)var0;
                    }
                }
                if (!"oracle.sql.DATE".equals(var1_7.getName())) break block33;
                if (com.github.catvod.spider.merge.H.A.h != null || com.github.catvod.spider.merge.H.A.g) ** GOTO lbl78
                try {
                    com.github.catvod.spider.merge.H.A.h = var1_7.getMethod("toJdbc", new Class[0]);
                }
                catch (Throwable var0_5) {
                    com.github.catvod.spider.merge.H.A.g = true;
                    throw var0_5;
                }
lbl76:
                // 2 sources

                while (true) {
                    com.github.catvod.spider.merge.H.A.g = true;
lbl78:
                    // 2 sources

                    try {
                        var0 = com.github.catvod.spider.merge.H.A.h.invoke(var0, new Object[0]);
                    }
                    catch (Exception var0_6) {
                        throw new com.github.catvod.spider.merge.y.d("can not cast oracle.sql.DATE to Date", var0_6);
                    }
                    return (Date)var0;
                }
            }
            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to Date, value : ", var0));
        }
        return new Date(var3_12);
        catch (NoSuchMethodException var1_8) {
            ** continue;
        }
lbl89:
        // 1 sources

        ** GOTO lbl60
        catch (NoSuchMethodException var1_9) {
            ** continue;
        }
    }

    public static Class<?> l0(String string) {
        return com.github.catvod.spider.merge.H.A.m0(string, false);
    }

    public static Double m(Object object) {
        block8: {
            block9: {
                double d2;
                block7: {
                    block6: {
                        if (object == null) {
                            return null;
                        }
                        if (!(object instanceof Number)) break block6;
                        d2 = ((Number)object).doubleValue();
                        break block7;
                    }
                    if (!(object instanceof String)) break block8;
                    String string = object.toString();
                    if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) break block9;
                    object = string;
                    if (string.indexOf(44) != -1) {
                        object = string.replaceAll(",", "");
                    }
                    d2 = Double.parseDouble((String)object);
                }
                return d2;
            }
            return null;
        }
        if (object instanceof Boolean) {
            double d3 = (Boolean)object != false ? 1.0 : 0.0;
            return d3;
        }
        throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to double, value : ", object));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Class m0(String string, boolean bl) {
        if (string == null) return null;
        if (string.length() == 0) {
            return null;
        }
        if (string.length() > 198) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("illegal className : ", string));
        Class<?> clazz = (Class<?>)((ConcurrentHashMap)C).get(string);
        if (clazz != null) {
            return clazz;
        }
        if (string.charAt(0) == '[') {
            return Array.newInstance(com.github.catvod.spider.merge.H.A.m0(string.substring(1), false), 0).getClass();
        }
        if (string.startsWith("L") && string.endsWith(";")) {
            return com.github.catvod.spider.merge.H.A.m0(string.substring(1, string.length() - 1), false);
        }
        Class<?> clazz2 = clazz;
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            clazz2 = clazz;
            if (classLoader != null) {
                clazz2 = clazz;
                clazz = classLoader.loadClass(string);
                if (!bl) return clazz;
                clazz2 = clazz;
                ((ConcurrentHashMap)C).put(string, clazz);
                return clazz;
            }
        }
        catch (Throwable throwable) {}
        try {
            clazz2 = clazz = Class.forName(string);
            if (!bl) return clazz2;
            clazz2 = clazz;
            ((ConcurrentHashMap)C).put(string, clazz);
            return clazz;
        }
        catch (Throwable throwable) {
            return clazz2;
        }
    }

    public static Float n(Object object) {
        block8: {
            block9: {
                float f2;
                block7: {
                    block6: {
                        if (object == null) {
                            return null;
                        }
                        if (!(object instanceof Number)) break block6;
                        f2 = ((Number)object).floatValue();
                        break block7;
                    }
                    if (!(object instanceof String)) break block8;
                    String string = object.toString();
                    if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) break block9;
                    object = string;
                    if (string.indexOf(44) != -1) {
                        object = string.replaceAll(",", "");
                    }
                    f2 = Float.parseFloat((String)object);
                }
                return Float.valueOf(f2);
            }
            return null;
        }
        if (object instanceof Boolean) {
            float f4 = (Boolean)object != false ? 1.0f : 0.0f;
            return Float.valueOf(f4);
        }
        throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to float, value : ", object));
    }

    public static long n0(Number number) {
        if (number instanceof BigDecimal) {
            return ((BigDecimal)number).longValueExact();
        }
        return number.longValue();
    }

    public static Integer o(Object object) {
        Map map;
        if (object == null) {
            return null;
        }
        if (object instanceof Integer) {
            return (Integer)object;
        }
        if (object instanceof BigDecimal) {
            return com.github.catvod.spider.merge.H.A.Y((BigDecimal)object);
        }
        if (object instanceof Number) {
            return ((Number)object).intValue();
        }
        if (object instanceof String) {
            Object object2 = (String)object;
            if (((String)object2).length() != 0 && !"null".equals(object2) && !"NULL".equals(object2)) {
                object = object2;
                if (((String)object2).indexOf(44) != -1) {
                    object = ((String)object2).replaceAll(",", "");
                }
                if (((Matcher)(object2 = a.matcher((CharSequence)object))).find()) {
                    object = ((Matcher)object2).replaceAll("");
                }
                return Integer.parseInt((String)object);
            }
            return null;
        }
        if (object instanceof Boolean) {
            return ((Boolean)object).booleanValue() ? 1 : 0;
        }
        if (object instanceof Map && (map = (Map)object).size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
            object = map.values().iterator();
            object.next();
            return com.github.catvod.spider.merge.H.A.o(object.next());
        }
        throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to int, value : ", object));
    }

    public static long o0(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0L;
        }
        int n2 = bigDecimal.scale();
        if (n2 >= -100 && n2 <= 100) {
            return bigDecimal.longValue();
        }
        return bigDecimal.longValueExact();
    }

    /*
     * Unable to fully structure code
     */
    public static <T> T p(Map<String, Object> var0, Class<T> var1_2, o var2_3) {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                block32: {
                                    var3_4 = 0;
                                    if (var1_2 != StackTraceElement.class) ** GOTO lbl14
                                    try {
                                        var1_2 = (String)var0.get("className");
                                        var2_3 = (String)var0.get("methodName");
                                        var5_5 = (String)var0.get("fileName");
                                        var0 = (Number)var0.get("lineNumber");
                                        if (var0 == null) ** GOTO lbl13
                                    }
                                    catch (Exception var0_1) {
                                        throw new com.github.catvod.spider.merge.y.d(var0_1.getMessage(), var0_1);
                                    }
                                    var3_4 = var0 instanceof BigDecimal != false ? ((BigDecimal)var0).intValueExact() : var0.intValue();
lbl13:
                                    // 2 sources

                                    return (T)new StackTraceElement((String)var1_2, (String)var2_3, var5_5, var3_4);
lbl14:
                                    // 1 sources

                                    var6_7 = var0.get(com.github.catvod.spider.merge.y.a.c);
                                    var4_8 = var6_7 instanceof String;
                                    var7_9 = null;
                                    var5_6 = var2_3;
                                    if (!var4_8) ** GOTO lbl41
                                    var5_6 = (String)var6_7;
                                    var6_7 = var2_3;
                                    if (var2_3 != null) ** GOTO lbl25
                                    var6_7 = com.github.catvod.spider.merge.B.o.v;
lbl25:
                                    // 2 sources

                                    Objects.requireNonNull(var6_7);
                                    var2_3 = var6_7.b((String)var5_6, null, com.github.catvod.spider.merge.y.a.f);
                                    if (var2_3 == null) ** GOTO lbl34
                                    var5_6 = var6_7;
                                    if (!var2_3.equals(var1_2)) {
                                        return com.github.catvod.spider.merge.H.A.p((Map<String, Object>)var0, var2_3, (o)var6_7);
                                    }
                                    break block32;
lbl34:
                                    // 1 sources

                                    var0 = new StringBuilder();
                                    var0.append((String)var5_6);
                                    var0.append(" not found");
                                    var1_2 = new ClassNotFoundException(var0.toString());
                                    throw var1_2;
                                }
                                if (!var1_2.isInterface()) break block26;
                                var0 = var0 instanceof com.github.catvod.spider.merge.y.e != false ? (com.github.catvod.spider.merge.y.e)var0 : new com.github.catvod.spider.merge.y.e((Map<String, Object>)var0);
                                var2_3 = var5_6;
                                if (var5_6 != null) ** GOTO lbl48
                                var2_3 = com.github.catvod.spider.merge.B.o.v;
lbl48:
                                // 2 sources

                                if (var2_3.d((Type)var1_2) != null) {
                                    return com.github.catvod.spider.merge.y.a.j(com.github.catvod.spider.merge.y.a.m(var0), var1_2);
                                }
                                return (T)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{var1_2}, (InvocationHandler)var0);
                            }
                            if (var1_2 == Locale.class) {
                                var6_7 = var0.get("language");
                                var2_3 = var0.get("country");
                                if (!(var6_7 instanceof String)) break block27;
                                var6_7 = (String)var6_7;
                                if (var2_3 instanceof String) {
                                    return (T)new Locale((String)var6_7, (String)var2_3);
                                }
                                if (var2_3 != null) break block27;
                                return (T)new Locale((String)var6_7);
                            }
                        }
                        if (var1_2 == String.class) {
                            if (!(var0 instanceof com.github.catvod.spider.merge.y.e)) break block28;
                            return (T)var0.toString();
                        }
                    }
                    if (var1_2 == com.github.catvod.spider.merge.y.a.class) {
                        if (!(var0 instanceof com.github.catvod.spider.merge.y.e)) break block29;
                        return (T)var0;
                    }
                }
                if (var1_2 == LinkedHashMap.class) {
                    if (!(var0 instanceof com.github.catvod.spider.merge.y.e) || !((var2_3 = ((com.github.catvod.spider.merge.y.e)var0).q()) instanceof LinkedHashMap)) break block30;
                    return (T)var2_3;
                }
            }
            if (!var1_2.isInstance(var0)) break block31;
            return (T)var0;
        }
        if (var1_2 == com.github.catvod.spider.merge.y.e.class) {
            return (T)new com.github.catvod.spider.merge.y.e((Map<String, Object>)var0);
        }
        var2_3 = var5_6;
        if (var5_6 != null) ** GOTO lbl90
        var2_3 = com.github.catvod.spider.merge.B.o.v;
lbl90:
        // 2 sources

        var6_7 = var2_3.f((Type)var1_2);
        var5_6 = var7_9;
        if (var6_7 instanceof q) {
            var5_6 = (q)var6_7;
        }
        if (var5_6 == null) ** GOTO lbl98
        return (T)var5_6.f((Map<String, Object>)var0, (o)var2_3);
lbl98:
        // 1 sources

        var0 = new StringBuilder();
        var0.append("can not get javaBeanDeserializer. ");
        var0.append(var1_2.getName());
        var2_3 = new com.github.catvod.spider.merge.y.d(var0.toString());
        throw var2_3;
    }

    private static ParameterizedType p0(Class<?> clazz, Type[] typeArray, Map<TypeVariable, Type> map) {
        int n2 = typeArray.length;
        Type[] typeArray2 = new Type[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            typeArray2[i2] = com.github.catvod.spider.merge.H.A.C(typeArray[i2], map);
        }
        return new n(typeArray2, null, clazz);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Long q(Object iterator) {
        Object object;
        block9: {
            Object var4_1 = null;
            if (iterator == null) {
                return null;
            }
            if (iterator instanceof BigDecimal) {
                return com.github.catvod.spider.merge.H.A.o0((BigDecimal)((Object)iterator));
            }
            if (iterator instanceof Number) {
                return ((Number)((Object)iterator)).longValue();
            }
            if (iterator instanceof String) {
                long l2;
                String string = (String)((Object)iterator);
                if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) return null;
                object = string;
                if (string.indexOf(44) != -1) {
                    object = string.replaceAll(",", "");
                }
                try {
                    l2 = Long.parseLong((String)object);
                }
                catch (NumberFormatException numberFormatException) {
                    com.github.catvod.spider.merge.B.i i2 = new com.github.catvod.spider.merge.B.i((String)object);
                    object = var4_1;
                    if (i2.x0(false)) {
                        object = i2.S();
                    }
                    i2.close();
                    if (object == null) break block9;
                    return ((Calendar)object).getTimeInMillis();
                }
                return l2;
            }
        }
        if (iterator instanceof Map && (object = (Map)((Object)iterator)).size() == 2 && object.containsKey("andIncrement") && object.containsKey("andDecrement")) {
            iterator = object.values().iterator();
            iterator.next();
            return com.github.catvod.spider.merge.H.A.q(iterator.next());
        }
        if (!(iterator instanceof Boolean)) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to long, value : ", iterator));
        long l3 = (Boolean)((Object)iterator) != false ? 1L : 0L;
        return l3;
    }

    static int q0(char c2, char c3) {
        if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9') {
            return c3 - 48 + (c2 - 48) * 10;
        }
        return -1;
    }

    public static Short r(Object object) {
        block8: {
            block9: {
                short s2;
                block6: {
                    block7: {
                        block5: {
                            if (object == null) {
                                return null;
                            }
                            if (!(object instanceof BigDecimal)) break block5;
                            s2 = com.github.catvod.spider.merge.H.A.t0((BigDecimal)object);
                            break block6;
                        }
                        if (!(object instanceof Number)) break block7;
                        s2 = ((Number)object).shortValue();
                        break block6;
                    }
                    if (!(object instanceof String)) break block8;
                    if (((String)(object = (String)object)).length() == 0 || "null".equals(object) || "NULL".equals(object)) break block9;
                    s2 = Short.parseShort((String)object);
                }
                return s2;
            }
            return null;
        }
        if (object instanceof Boolean) {
            return (short)(((Boolean)object).booleanValue() ? 1 : 0);
        }
        throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.A.c.a("can not cast to short, value : ", object));
    }

    public static Object r0(Type object) {
        if (W) {
            return null;
        }
        if ((object = com.github.catvod.spider.merge.H.A.G((Type)object)) == null) {
            return null;
        }
        if ("java.util.Optional".equals(object = ((Class)object).getName())) {
            if (V == null) {
                try {
                    V = Class.forName((String)object).getMethod("empty", new Class[0]).invoke(null, new Object[0]);
                }
                catch (Throwable throwable) {
                    W = true;
                }
            }
            return V;
        }
        return null;
    }

    public static Object s(Object object) {
        return com.github.catvod.spider.merge.H.m.b(P, object);
    }

    static void s0(AccessibleObject accessibleObject) {
        if (!d) {
            return;
        }
        if (accessibleObject.isAccessible()) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        }
        catch (Throwable throwable) {
            d = false;
        }
    }

    public static Object t(Object object) {
        return com.github.catvod.spider.merge.H.m.b(Q, object);
    }

    public static short t0(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0;
        }
        int n2 = bigDecimal.scale();
        if (n2 >= -100 && n2 <= 100) {
            return bigDecimal.shortValue();
        }
        return bigDecimal.shortValueExact();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private static void u(Class clazz, V v2, Map map, Field[] fieldArray) {
        for (Field field : fieldArray) {
            int n2;
            int n3;
            int n4;
            if (Modifier.isStatic(field.getModifiers())) continue;
            b b2 = com.github.catvod.spider.merge.H.A.E(field, b.class);
            String string = field.getName();
            String string2 = null;
            if (b2 != null) {
                if (!b2.serialize()) continue;
                n4 = b2.ordinal();
                n3 = i0.h(b2.serialzeFeatures());
                n2 = com.github.catvod.spider.merge.B.c.b(b2.parseFeatures());
                if (b2.name().length() != 0) {
                    string = b2.name();
                }
                if (b2.label().length() != 0) {
                    string2 = b2.label();
                }
            } else {
                string2 = null;
                n4 = 0;
                n3 = 0;
                n2 = 0;
            }
            String string3 = string;
            if (v2 != null) {
                string3 = v2.b(string);
            }
            if (map.containsKey(string3)) continue;
            map.put(string3, new e(string3, null, field, clazz, n4, n3, n2, null, b2, string2));
        }
    }

    public static Locale u0(String stringArray) {
        if ((stringArray = stringArray.split("_")).length == 1) {
            return new Locale(stringArray[0]);
        }
        if (stringArray.length == 2) {
            return new Locale(stringArray[0], stringArray[1]);
        }
        return new Locale(stringArray[0], stringArray[1], stringArray[2]);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List v(Class var0, Map var1_1, boolean var2_2, V var3_3) {
        block51: {
            var18_4 = var0;
            var21_5 = var3_3;
            var31_6 = new LinkedHashMap<String, e>();
            var15_7 = com.github.catvod.spider.merge.H.A.f0((Class)var0);
            var14_8 = false;
            var16_9 = null;
            var27_11 = var0.getMethods();
            try {
                var16_9 = new z();
                Arrays.sort(var27_11, var16_9);
            }
            catch (Throwable var16_10) {
                ** continue;
            }
lbl11:
            // 2 sources

            while (true) {
                var9_12 = var27_11.length;
                var20_13 /* !! */  = null;
                var16_9 = null;
                var22_15 /* !! */  = var17_14 /* !! */  = var16_9;
                var26_16 = var21_5;
                var10_17 = 0;
                while (true) {
                    block56: {
                        block50: {
                            if (var10_17 >= var9_12) {
                                com.github.catvod.spider.merge.H.A.u((Class)var18_4, (V)var26_16, var31_6, var0.getFields());
                                return com.github.catvod.spider.merge.H.A.O(var18_4, var2_2, var31_6);
                            }
                            var32_36 = var27_11[var10_17];
                            var33_37 = var32_36.getName();
                            var30_35 = null;
                            if (Modifier.isStatic(var32_36.getModifiers())) break block50;
                            var34_38 = var32_36.getReturnType();
                            if (var34_38.equals(Void.TYPE)) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var14_8 = false;
                                    break block50;
                                    break;
                                }
                            }
                            if (var32_36.getParameterTypes().length != 0 || var34_38 == ClassLoader.class || var34_38 == InputStream.class || var34_38 == Reader.class || var33_37.equals("getMetaClass") && var34_38.getName().equals("groovy.lang.MetaClass") || var33_37.equals("getSuppressed") && var32_36.getDeclaringClass() == Throwable.class) ** GOTO lbl-1000
                            if (!var15_7) ** GOTO lbl41
                            if (com.github.catvod.spider.merge.H.A.A == null && !com.github.catvod.spider.merge.H.A.B) {
                                var19_26 = new HashMap();
                                break block51;
                            }
lbl37:
                            // 4 sources

                            while (true) {
                                block54: {
                                    block77: {
                                        block86: {
                                            block55: {
                                                block84: {
                                                    block85: {
                                                        block82: {
                                                            block83: {
                                                                block79: {
                                                                    block80: {
                                                                        block81: {
                                                                            block78: {
                                                                                block66: {
                                                                                    block76: {
                                                                                        block74: {
                                                                                            block73: {
                                                                                                block75: {
                                                                                                    block64: {
                                                                                                        block69: {
                                                                                                            block71: {
                                                                                                                block67: {
                                                                                                                    block72: {
                                                                                                                        block70: {
                                                                                                                            block68: {
                                                                                                                                block65: {
                                                                                                                                    block61: {
                                                                                                                                        block63: {
                                                                                                                                            block62: {
                                                                                                                                                block60: {
                                                                                                                                                    block57: {
                                                                                                                                                        block59: {
                                                                                                                                                            block58: {
                                                                                                                                                                block53: {
                                                                                                                                                                    var6_20 = com.github.catvod.spider.merge.H.A.A != null && (var19_26 = (String[])com.github.catvod.spider.merge.H.A.A.get(var18_4)) != null && Arrays.binarySearch((Object[])var19_26, var33_37) >= 0 ? 1 : 0;
                                                                                                                                                                    if (var6_20 == 0) ** break;
                                                                                                                                                                    ** continue;
lbl41:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    var28_33 = Boolean.FALSE;
                                                                                                                                                                    var23_30 /* !! */  = com.github.catvod.spider.merge.H.A.F(var32_36, b.class);
                                                                                                                                                                    var19_26 = var23_30 /* !! */ ;
                                                                                                                                                                    if (var23_30 /* !! */  == null) {
                                                                                                                                                                        var19_26 = com.github.catvod.spider.merge.H.A.X(var18_4, var32_36);
                                                                                                                                                                    }
                                                                                                                                                                    if (var19_26 != null || !var15_7) break block57;
                                                                                                                                                                    var23_30 /* !! */  = var22_15 /* !! */ ;
                                                                                                                                                                    if (var22_15 /* !! */  != null) ** GOTO lbl-1000
                                                                                                                                                                    var22_15 /* !! */  = var0.getDeclaredConstructors();
                                                                                                                                                                    var24_31 /* !! */  = com.github.catvod.spider.merge.H.A.R((Constructor[])var22_15 /* !! */ , null);
                                                                                                                                                                    var23_30 /* !! */  = var22_15 /* !! */ ;
                                                                                                                                                                    if (var24_31 /* !! */  != null) {
                                                                                                                                                                        var24_31 /* !! */  = com.github.catvod.spider.merge.H.A.S((Constructor)var24_31 /* !! */ );
                                                                                                                                                                        var17_14 /* !! */  = com.github.catvod.spider.merge.H.A.Q((Class)var0);
                                                                                                                                                                        if (var17_14 /* !! */  != null) {
                                                                                                                                                                            var16_9 = new String[var17_14 /* !! */ .length];
                                                                                                                                                                            var6_20 = var17_14 /* !! */ .length;
                                                                                                                                                                            System.arraycopy(var17_14 /* !! */ , 0, var16_9, 0, var6_20);
                                                                                                                                                                            Arrays.sort((Object[])var16_9);
                                                                                                                                                                            var20_13 /* !! */  = (Annotation[][])new short[var17_14 /* !! */ .length];
                                                                                                                                                                            for (var5_19 = 0; var5_19 < var17_14 /* !! */ .length; var5_19 = (int)((short)(var5_19 + 1))) {
                                                                                                                                                                                var20_13 /* !! */ [Arrays.binarySearch((Object[])var16_9, (Object)var17_14 /* !! */ [var5_19])] = (Annotation[])var5_19;
                                                                                                                                                                            }
                                                                                                                                                                            var17_14 /* !! */  = var20_13 /* !! */ ;
                                                                                                                                                                            var20_13 /* !! */  = var22_15 /* !! */ ;
                                                                                                                                                                        } else {
                                                                                                                                                                            var20_13 /* !! */  = var16_9;
                                                                                                                                                                            var16_9 = var17_14 /* !! */ ;
                                                                                                                                                                            var17_14 /* !! */  = var20_13 /* !! */ ;
                                                                                                                                                                            var20_13 /* !! */  = var22_15 /* !! */ ;
                                                                                                                                                                        }
                                                                                                                                                                    } else lbl-1000:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    {
                                                                                                                                                                        var22_15 /* !! */  = var20_13 /* !! */ ;
                                                                                                                                                                        var24_31 /* !! */  = var17_14 /* !! */ ;
                                                                                                                                                                        var20_13 /* !! */  = var23_30 /* !! */ ;
                                                                                                                                                                        var17_14 /* !! */  = var16_9;
                                                                                                                                                                        var16_9 = var22_15 /* !! */ ;
                                                                                                                                                                    }
                                                                                                                                                                    if (var16_9 == null || var17_14 /* !! */  == null || !var33_37.startsWith("get")) break block58;
                                                                                                                                                                    var35_39 = com.github.catvod.spider.merge.H.A.y(var33_37.substring(3));
                                                                                                                                                                    var8_22 = Arrays.binarySearch((Object[])var16_9, var35_39);
                                                                                                                                                                    var29_34 = var20_13 /* !! */ ;
                                                                                                                                                                    var7_21 = var8_22;
                                                                                                                                                                    if (var8_22 < 0) {
                                                                                                                                                                        var6_20 = 0;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            var7_21 = var8_22;
                                                                                                                                                                            if (var6_20 >= ((Annotation[][])var16_9).length) break;
                                                                                                                                                                            if (var35_39.equalsIgnoreCase((String)var16_9[var6_20])) {
                                                                                                                                                                                var7_21 = var6_20;
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            ++var6_20;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    if (var7_21 < 0) break block58;
                                                                                                                                                                    var25_32 = var24_31 /* !! */ [var17_14 /* !! */ [var7_21]];
                                                                                                                                                                    var23_30 /* !! */  = var16_9;
                                                                                                                                                                    var22_15 /* !! */  = var17_14 /* !! */ ;
                                                                                                                                                                    if (var25_32 != null) {
                                                                                                                                                                        var7_21 = ((Object)var25_32).length;
                                                                                                                                                                        var6_20 = 0;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            var23_30 /* !! */  = var16_9;
                                                                                                                                                                            var22_15 /* !! */  = var17_14 /* !! */ ;
                                                                                                                                                                            if (var6_20 >= var7_21) break;
                                                                                                                                                                            var22_15 /* !! */  = var25_32[var6_20];
                                                                                                                                                                            if (var22_15 /* !! */  instanceof b) {
                                                                                                                                                                                var22_15 /* !! */  = (b)var22_15 /* !! */ ;
                                                                                                                                                                                var23_30 /* !! */  = var17_14 /* !! */ ;
                                                                                                                                                                                break block53;
                                                                                                                                                                            }
                                                                                                                                                                            ++var6_20;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    var16_9 = var23_30 /* !! */ ;
                                                                                                                                                                    var23_30 /* !! */  = var22_15 /* !! */ ;
                                                                                                                                                                    var22_15 /* !! */  = var19_26;
                                                                                                                                                                }
                                                                                                                                                                var25_32 = var22_15 /* !! */ ;
                                                                                                                                                                var19_26 = var16_9;
                                                                                                                                                                var17_14 /* !! */  = var23_30 /* !! */ ;
                                                                                                                                                                if (var22_15 /* !! */  != null) break block59;
                                                                                                                                                                var35_39 = com.github.catvod.spider.merge.B.o.h((String)var35_39, var1_1);
                                                                                                                                                                var25_32 = var22_15 /* !! */ ;
                                                                                                                                                                var19_26 = var16_9;
                                                                                                                                                                var17_14 /* !! */  = var23_30 /* !! */ ;
                                                                                                                                                                if (var35_39 == null) break block59;
                                                                                                                                                                var25_32 = com.github.catvod.spider.merge.H.A.E((Field)var35_39, b.class);
                                                                                                                                                                var22_15 /* !! */  = var29_34;
                                                                                                                                                                var20_13 /* !! */  = var16_9;
                                                                                                                                                                break block60;
                                                                                                                                                            }
                                                                                                                                                            var25_32 = var19_26;
                                                                                                                                                            var19_26 = var16_9;
                                                                                                                                                        }
                                                                                                                                                        var22_15 /* !! */  = var20_13 /* !! */ ;
                                                                                                                                                        var20_13 /* !! */  = var19_26;
                                                                                                                                                        var23_30 /* !! */  = var17_14 /* !! */ ;
                                                                                                                                                        break block60;
                                                                                                                                                    }
                                                                                                                                                    var25_32 = var19_26;
                                                                                                                                                    var23_30 /* !! */  = var16_9;
                                                                                                                                                    var24_31 /* !! */  = var17_14 /* !! */ ;
                                                                                                                                                }
                                                                                                                                                if (var25_32 == null) break block61;
                                                                                                                                                if (var25_32.serialize()) break block62;
                                                                                                                                                var17_14 /* !! */  = var18_4;
                                                                                                                                                var16_9 = var21_5;
                                                                                                                                                break block54;
                                                                                                                                            }
                                                                                                                                            var12_24 = var25_32.ordinal();
                                                                                                                                            var13_25 = i0.h(var25_32.serialzeFeatures());
                                                                                                                                            var11_23 = com.github.catvod.spider.merge.B.c.b(var25_32.parseFeatures());
                                                                                                                                            if (var25_32.name().length() == 0) break block63;
                                                                                                                                            var16_9 = var25_32.name();
                                                                                                                                            var31_6.put((String)var16_9, new e((String)var16_9, var32_36, null, (Class)var0, var12_24, var13_25, var11_23, (b)var25_32, null, null));
                                                                                                                                            break block64;
                                                                                                                                        }
                                                                                                                                        var6_20 = var12_24;
                                                                                                                                        var8_22 = var13_25;
                                                                                                                                        var7_21 = var11_23;
                                                                                                                                        var17_14 /* !! */  = var30_35;
                                                                                                                                        if (var25_32.label().length() != 0) {
                                                                                                                                            var17_14 /* !! */  = var25_32.label();
                                                                                                                                            var6_20 = var12_24;
                                                                                                                                            var8_22 = var13_25;
                                                                                                                                            var7_21 = var11_23;
                                                                                                                                        }
                                                                                                                                        break block65;
                                                                                                                                    }
                                                                                                                                    var6_20 = 0;
                                                                                                                                    var8_22 = 0;
                                                                                                                                    var7_21 = 0;
                                                                                                                                    var17_14 /* !! */  = var30_35;
                                                                                                                                }
                                                                                                                                if (!var33_37.startsWith("get")) break block66;
                                                                                                                                if (var33_37.length() < 4 || var33_37.equals("getClass") || var33_37.equals("getDeclaringClass") && var0.isEnum()) break block64;
                                                                                                                                var4_18 = var33_37.charAt(3);
                                                                                                                                if (Character.isUpperCase(var4_18) || var4_18 > '\u0200') break block67;
                                                                                                                                if (var4_18 != '_') break block68;
                                                                                                                                var26_16 = var33_37.substring(3);
                                                                                                                                var29_34 = (Field)var1_1.get(var26_16);
                                                                                                                                var16_9 = var26_16;
                                                                                                                                var19_26 = var29_34;
                                                                                                                                if (var29_34 == null && (var19_26 = com.github.catvod.spider.merge.B.o.h((String)(var16_9 = var33_37.substring(4)), var1_1)) == null) {
                                                                                                                                    var16_9 = var26_16;
                                                                                                                                }
                                                                                                                                break block69;
                                                                                                                            }
                                                                                                                            if (var4_18 != 'f') break block70;
                                                                                                                            var16_9 = var33_37.substring(3);
                                                                                                                            break block71;
                                                                                                                        }
                                                                                                                        if (var33_37.length() < 5 || !Character.isUpperCase(var33_37.charAt(4))) break block72;
                                                                                                                        var16_9 = com.github.catvod.spider.merge.H.A.y(var33_37.substring(3));
                                                                                                                        break block71;
                                                                                                                    }
                                                                                                                    var16_9 = var33_37.substring(3);
                                                                                                                    var19_26 = com.github.catvod.spider.merge.B.o.h((String)var16_9, var1_1);
                                                                                                                    if (var19_26 != null) break block69;
                                                                                                                    break block64;
                                                                                                                }
                                                                                                                var16_9 = com.github.catvod.spider.merge.H.A.b != false ? com.github.catvod.spider.merge.H.A.y(var33_37.substring(3)) : com.github.catvod.spider.merge.H.A.V(var33_37);
                                                                                                                var16_9 = com.github.catvod.spider.merge.H.A.U(var1_1, var33_37, (String)var16_9, 3);
                                                                                                            }
                                                                                                            var19_26 = null;
                                                                                                        }
                                                                                                        if (com.github.catvod.spider.merge.H.A.e0(var18_4, (String)var16_9)) break block64;
                                                                                                        var26_16 = var19_26;
                                                                                                        if (var19_26 == null) {
                                                                                                            var26_16 = com.github.catvod.spider.merge.B.o.h((String)var16_9, var1_1);
                                                                                                        }
                                                                                                        if (var26_16 == null && var16_9.length() > 1 && (var11_23 = (int)var16_9.charAt(1)) >= 65 && var11_23 <= 90) {
                                                                                                            var26_16 = com.github.catvod.spider.merge.B.o.h(com.github.catvod.spider.merge.H.A.y(var33_37.substring(3)), var1_1);
                                                                                                        }
                                                                                                        if (var26_16 == null) break block73;
                                                                                                        var19_26 = var29_34 = com.github.catvod.spider.merge.H.A.E((Field)var26_16, b.class);
                                                                                                        if (var29_34 == null) break block74;
                                                                                                        if (var29_34.serialize()) break block75;
                                                                                                    }
                                                                                                    var17_14 /* !! */  = var18_4;
                                                                                                    var16_9 = var21_5;
lbl216:
                                                                                                    // 4 sources

                                                                                                    while (true) {
                                                                                                        var26_16 = var16_9;
                                                                                                        break block54;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var8_22 = var29_34.ordinal();
                                                                                                var7_21 = i0.h(var29_34.serialzeFeatures());
                                                                                                var6_20 = com.github.catvod.spider.merge.B.c.b(var29_34.parseFeatures());
                                                                                                if (var29_34.name().length() != 0) {
                                                                                                    var16_9 = Boolean.TRUE;
                                                                                                    var18_4 = var29_34.name();
                                                                                                } else {
                                                                                                    var18_4 = var16_9;
                                                                                                    var16_9 = var28_33;
                                                                                                }
                                                                                                if (var29_34.label().length() != 0) {
                                                                                                    var17_14 /* !! */  = var29_34.label();
                                                                                                }
                                                                                                var19_26 = var17_14 /* !! */ ;
                                                                                                var28_33 = var29_34;
                                                                                                var17_14 /* !! */  = var18_4;
                                                                                                var29_34 = var16_9;
                                                                                                var16_9 = var19_26;
                                                                                                break block76;
                                                                                            }
                                                                                            var19_26 = null;
                                                                                        }
                                                                                        var18_4 = var16_9;
                                                                                        var29_34 = var28_33;
                                                                                        var16_9 = var17_14 /* !! */ ;
                                                                                        var11_23 = var6_20;
                                                                                        var6_20 = var7_21;
                                                                                        var7_21 = var8_22;
                                                                                        var8_22 = var11_23;
                                                                                        var28_33 = var19_26;
                                                                                        var17_14 /* !! */  = var18_4;
                                                                                    }
                                                                                    var18_4 = var17_14 /* !! */ ;
                                                                                    if (var21_5 != null) {
                                                                                        var18_4 = var17_14 /* !! */ ;
                                                                                        if (!var29_34.booleanValue()) {
                                                                                            var18_4 = var21_5.b((String)var17_14 /* !! */ );
                                                                                        }
                                                                                    }
                                                                                    var31_6.put((String)var18_4, new e((String)var18_4, var32_36, (Field)var26_16, (Class)var0, var8_22, var7_21, var6_20, (b)var25_32, (b)var28_33, (String)var16_9));
                                                                                    var11_23 = var6_20;
                                                                                    var6_20 = var8_22;
                                                                                    var8_22 = var7_21;
                                                                                    var7_21 = var11_23;
                                                                                    var17_14 /* !! */  = var16_9;
                                                                                }
                                                                                if (!var33_37.startsWith("is") || var33_37.length() < 3 || var34_38 != Boolean.TYPE && var34_38 != Boolean.class) break block77;
                                                                                var4_18 = var33_37.charAt(2);
                                                                                if (!Character.isUpperCase(var4_18)) break block78;
                                                                                if (com.github.catvod.spider.merge.H.A.b) {
                                                                                    var16_9 = com.github.catvod.spider.merge.H.A.y(var33_37.substring(2));
                                                                                } else {
                                                                                    var16_9 = new StringBuilder();
                                                                                    var16_9.append(Character.toLowerCase(var33_37.charAt(2)));
                                                                                    var16_9.append(var33_37.substring(3));
                                                                                    var16_9 = var16_9.toString();
                                                                                }
                                                                                var16_9 = com.github.catvod.spider.merge.H.A.U(var1_1, var33_37, (String)var16_9, 2);
                                                                                break block79;
                                                                            }
                                                                            if (var4_18 != '_') break block80;
                                                                            var21_5 = var33_37.substring(3);
                                                                            var18_4 = (Field)var1_1.get(var21_5);
                                                                            if (var18_4 != null) break block81;
                                                                            var16_9 = var33_37.substring(2);
                                                                            var18_4 = var19_26 = com.github.catvod.spider.merge.B.o.h((String)var16_9, var1_1);
                                                                            if (var19_26 != null) break block82;
                                                                            var18_4 = var19_26;
                                                                        }
                                                                        var16_9 = var21_5;
                                                                        break block82;
                                                                    }
                                                                    var16_9 = var33_37.substring(2);
                                                                    if (var4_18 != 'f') break block83;
                                                                }
                                                                var18_4 = null;
                                                                break block82;
                                                            }
                                                            var18_4 = var19_26 = com.github.catvod.spider.merge.B.o.h((String)var16_9, var1_1);
                                                            if (var19_26 == null) break block77;
                                                        }
                                                        var21_5 = var0;
                                                        if (com.github.catvod.spider.merge.H.A.e0(var21_5, (String)var16_9)) break block77;
                                                        var19_26 = var18_4;
                                                        if (var18_4 == null) {
                                                            var19_26 = com.github.catvod.spider.merge.B.o.h((String)var16_9, var1_1);
                                                        }
                                                        if (var19_26 == null) {
                                                            var19_26 = com.github.catvod.spider.merge.B.o.h(var33_37, var1_1);
                                                        }
                                                        if (var19_26 == null) break block84;
                                                        var18_4 = com.github.catvod.spider.merge.H.A.E((Field)var19_26, b.class);
                                                        if (var18_4 == null) break block85;
                                                        if (!var18_4.serialize()) break block77;
                                                        var6_20 = var18_4.ordinal();
                                                        var7_21 = i0.h(var18_4.serialzeFeatures());
                                                        var8_22 = com.github.catvod.spider.merge.B.c.b(var18_4.parseFeatures());
                                                        if (var18_4.name().length() != 0) {
                                                            var16_9 = var18_4.name();
                                                        }
                                                        if (var18_4.label().length() != 0) {
                                                            var26_16 = var18_4.label();
                                                            var17_14 /* !! */  = var18_4;
                                                            var18_4 = var26_16;
                                                            break block55;
                                                        } else {
                                                            var26_16 = var17_14 /* !! */ ;
                                                            var17_14 /* !! */  = var18_4;
                                                            var18_4 = var26_16;
                                                        }
                                                        break block55;
                                                    }
                                                    var11_23 = var8_22;
                                                    var8_22 = var7_21;
                                                    var26_16 = var17_14 /* !! */ ;
                                                    var17_14 /* !! */  = var18_4;
                                                    var7_21 = var11_23;
                                                    var18_4 = var26_16;
                                                    break block55;
                                                }
                                                var11_23 = var8_22;
                                                var26_16 = null;
                                                var18_4 = var17_14 /* !! */ ;
                                                var17_14 /* !! */  = var26_16;
                                                var8_22 = var7_21;
                                                var7_21 = var11_23;
                                            }
                                            var26_16 = var3_3;
                                            var28_33 = var16_9;
                                            if (var26_16 != null) {
                                                var28_33 = var26_16.b((String)var16_9);
                                            }
                                            if (!var31_6.containsKey(var28_33)) break block86;
                                            var17_14 /* !! */  = var21_5;
                                            var16_9 = var26_16;
                                            ** GOTO lbl216
                                        }
                                        var31_6.put((String)var28_33, new e((String)var28_33, var32_36, (Field)var19_26, (Class)var0, var6_20, var7_21, var8_22, (b)var25_32, (b)var17_14 /* !! */ , (String)var18_4));
                                        var17_14 /* !! */  = var21_5;
                                        var16_9 = var26_16;
                                        ** GOTO lbl216
                                    }
                                    var17_14 /* !! */  = var0;
                                    var16_9 = var3_3;
                                    ** continue;
                                }
                                var14_8 = false;
                                var18_4 = var24_31 /* !! */ ;
                                var19_26 = var23_30 /* !! */ ;
                                var21_5 = var16_9;
                                break block56;
                                break;
                            }
                        }
                        var19_26 = var17_14 /* !! */ ;
                        var17_14 /* !! */  = var18_4;
                        var18_4 = var19_26;
                        var19_26 = var16_9;
                    }
                    ++var10_17;
                    var23_30 /* !! */  = var17_14 /* !! */ ;
                    var16_9 = var19_26;
                    var17_14 /* !! */  = var18_4;
                    var18_4 = var23_30 /* !! */ ;
                }
                break;
            }
        }
        var23_30 /* !! */  = Class.forName("com.github.catvod.spider.merge.P0.c");
        var19_26.put(var23_30 /* !! */ , new String[]{"getEndInclusive", "isEmpty"});
        var19_26.put(Class.forName("com.github.catvod.spider.merge.P0.h"), new String[]{"getEndInclusive", "isEmpty"});
        var19_26.put(Class.forName("com.github.catvod.spider.merge.P0.k"), new String[]{"getEndInclusive", "isEmpty"});
        var19_26.put(Class.forName("com.github.catvod.spider.merge.P0.e"), new String[]{"getEndInclusive", "isEmpty"});
        var19_26.put(Class.forName("com.github.catvod.spider.merge.P0.d"), new String[]{"getEndInclusive", "isEmpty"});
        com.github.catvod.spider.merge.H.A.A = var19_26;
        ** GOTO lbl37
        catch (Throwable var19_27) lbl-1000:
        // 3 sources

        {
            while (true) {
                com.github.catvod.spider.merge.H.A.B = true;
                ** continue;
                break;
            }
        }
        catch (Throwable var19_29) {
            ** GOTO lbl-1000
        }
        catch (Throwable var19_28) {
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static Type v0(Type var0) {
        if (com.github.catvod.spider.merge.H.A.i) ** GOTO lbl10
        try {
            com.github.catvod.spider.merge.H.A.j = Class.forName("java.util.Optional");
        }
        catch (Throwable var0_1) {
            com.github.catvod.spider.merge.H.A.i = true;
            throw var0_1;
        }
lbl8:
        // 2 sources

        while (true) {
            com.github.catvod.spider.merge.H.A.i = true;
lbl10:
            // 2 sources

            var1_3 = var0;
            if (var0 instanceof ParameterizedType) {
                var2_4 = (ParameterizedType)var0;
                var1_3 = var0;
                if (var2_4.getRawType() == com.github.catvod.spider.merge.H.A.j) {
                    var1_3 = var2_4.getActualTypeArguments()[0];
                }
            }
            return var1_3;
        }
        catch (Exception var1_2) {
            ** continue;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static List w(Class clazz, boolean bl, V v2) {
        LinkedHashMap<String, e> linkedHashMap = new LinkedHashMap<String, e>();
        for (Class clazz2 = clazz; clazz2 != null; clazz2 = clazz2.getSuperclass()) {
            com.github.catvod.spider.merge.H.A.u(clazz2, v2, linkedHashMap, clazz2.getDeclaredFields());
        }
        return com.github.catvod.spider.merge.H.A.O(clazz, bl, linkedHashMap);
    }

    public static Collection x(Type object) {
        Class clazz = com.github.catvod.spider.merge.H.A.W((Type)object);
        if (clazz != AbstractCollection.class && clazz != Collection.class) {
            if (clazz.isAssignableFrom(HashSet.class)) {
                object = new HashSet();
            } else if (clazz.isAssignableFrom(LinkedHashSet.class)) {
                object = new LinkedHashSet();
            } else if (clazz.isAssignableFrom(TreeSet.class)) {
                object = new TreeSet();
            } else if (clazz.isAssignableFrom(ArrayList.class)) {
                object = new ArrayList();
            } else if (clazz.isAssignableFrom(EnumSet.class)) {
                object = object instanceof ParameterizedType ? ((ParameterizedType)object).getActualTypeArguments()[0] : Object.class;
                object = EnumSet.noneOf((Class)object);
            } else if (!(clazz.isAssignableFrom(Queue.class) || (object = N) != null && clazz.isAssignableFrom((Class<?>)object))) {
                try {
                    object = (Collection)clazz.newInstance();
                }
                catch (Exception exception) {
                    throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e(clazz, com.github.catvod.spider.merge.C.a.c("create instance error, class ")));
                }
            } else {
                object = new LinkedList();
            }
        } else {
            object = new ArrayList();
        }
        return object;
    }

    public static String y(String object) {
        if (object != null && ((String)object).length() != 0) {
            if (((String)object).length() > 1 && Character.isUpperCase(((String)object).charAt(1)) && Character.isUpperCase(((String)object).charAt(0))) {
                return object;
            }
            object = ((String)object).toCharArray();
            object[0] = Character.toLowerCase((char)object[0]);
            return new String((char[])object);
        }
        return object;
    }

    public static long z(String string) {
        long l2 = -3750763034362895579L;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            l2 = (l2 ^ (long)string.charAt(i2)) * 1099511628211L;
        }
        return l2;
    }
}

