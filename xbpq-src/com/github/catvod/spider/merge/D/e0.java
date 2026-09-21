/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.C.s;
import com.github.catvod.spider.merge.C.w;
import com.github.catvod.spider.merge.D.A;
import com.github.catvod.spider.merge.D.B;
import com.github.catvod.spider.merge.D.D;
import com.github.catvod.spider.merge.D.E;
import com.github.catvod.spider.merge.D.F;
import com.github.catvod.spider.merge.D.G;
import com.github.catvod.spider.merge.D.H;
import com.github.catvod.spider.merge.D.I;
import com.github.catvod.spider.merge.D.J;
import com.github.catvod.spider.merge.D.K;
import com.github.catvod.spider.merge.D.M;
import com.github.catvod.spider.merge.D.N;
import com.github.catvod.spider.merge.D.Q;
import com.github.catvod.spider.merge.D.S;
import com.github.catvod.spider.merge.D.T;
import com.github.catvod.spider.merge.D.U;
import com.github.catvod.spider.merge.D.W;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.Y;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.D.b0;
import com.github.catvod.spider.merge.D.c;
import com.github.catvod.spider.merge.D.d0;
import com.github.catvod.spider.merge.D.e;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.D.g;
import com.github.catvod.spider.merge.D.h;
import com.github.catvod.spider.merge.D.i;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.j;
import com.github.catvod.spider.merge.D.j0;
import com.github.catvod.spider.merge.D.k0;
import com.github.catvod.spider.merge.D.m;
import com.github.catvod.spider.merge.D.n;
import com.github.catvod.spider.merge.D.o;
import com.github.catvod.spider.merge.D.q;
import com.github.catvod.spider.merge.D.r;
import com.github.catvod.spider.merge.D.t;
import com.github.catvod.spider.merge.D.u;
import com.github.catvod.spider.merge.D.v;
import com.github.catvod.spider.merge.D.y;
import com.github.catvod.spider.merge.D.z;
import com.github.catvod.spider.merge.E.a;
import com.github.catvod.spider.merge.H.k;
import com.github.catvod.spider.merge.z.d;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Node;

public final class e0 {
    public static final e0 i = new e0();
    private static boolean j = false;
    private static boolean k = false;
    private static boolean l = false;
    private static boolean m = false;
    private static boolean n = false;
    private static boolean o = false;
    private boolean a = com.github.catvod.spider.merge.H.c.a ^ true;
    private b b;
    protected String c = com.github.catvod.spider.merge.y.a.c;
    private final k<Type, X> d;
    private final k<Type, k<Type, X>> e;
    private final boolean f;
    private long[] g = new long[]{4165360493669296979L, 4446674157046724083L};
    private List<a> h = new ArrayList<a>();

    public e0() {
        Object object;
        this.f = false;
        this.d = new k(8192);
        this.e = new k(16);
        try {
            if (this.a) {
                object = new b();
                this.b = object;
            }
        }
        catch (Throwable throwable) {
            this.a = false;
        }
        this.f((Type)((Object)Boolean.class), com.github.catvod.spider.merge.D.o.a);
        this.f((Type)((Object)Character.class), t.a);
        object = G.a;
        this.f((Type)((Object)Byte.class), (X)object);
        this.f((Type)((Object)Short.class), (X)object);
        this.f((Type)((Object)Integer.class), (X)object);
        this.f((Type)((Object)Long.class), S.a);
        this.f((Type)((Object)Float.class), E.b);
        this.f((Type)((Object)Double.class), z.b);
        this.f((Type)((Object)BigDecimal.class), com.github.catvod.spider.merge.D.m.c);
        this.f((Type)((Object)BigInteger.class), com.github.catvod.spider.merge.D.n.c);
        this.f((Type)((Object)String.class), j0.a);
        object = Y.a;
        this.f((Type)((Object)byte[].class), (X)object);
        this.f((Type)((Object)short[].class), (X)object);
        this.f((Type)((Object)int[].class), (X)object);
        this.f((Type)((Object)long[].class), (X)object);
        this.f((Type)((Object)float[].class), (X)object);
        this.f((Type)((Object)double[].class), (X)object);
        this.f((Type)((Object)boolean[].class), (X)object);
        this.f((Type)((Object)char[].class), (X)object);
        this.f((Type)((Object)Object[].class), W.a);
        object = U.b;
        this.f((Type)((Object)Class.class), (X)object);
        this.f((Type)((Object)SimpleDateFormat.class), (X)object);
        this.f((Type)((Object)Currency.class), new U());
        this.f((Type)((Object)TimeZone.class), (X)object);
        this.f((Type)((Object)InetAddress.class), (X)object);
        this.f((Type)((Object)Inet4Address.class), (X)object);
        this.f((Type)((Object)Inet6Address.class), (X)object);
        this.f((Type)((Object)InetSocketAddress.class), (X)object);
        this.f((Type)((Object)File.class), (X)object);
        object = com.github.catvod.spider.merge.D.f.a;
        this.f((Type)((Object)Appendable.class), (X)object);
        this.f((Type)((Object)StringBuffer.class), (X)object);
        this.f((Type)((Object)StringBuilder.class), (X)object);
        object = k0.a;
        this.f((Type)((Object)Charset.class), (X)object);
        this.f((Type)((Object)Pattern.class), (X)object);
        this.f((Type)((Object)Locale.class), (X)object);
        this.f((Type)((Object)URI.class), (X)object);
        this.f((Type)((Object)URL.class), (X)object);
        this.f((Type)((Object)UUID.class), (X)object);
        h h2 = com.github.catvod.spider.merge.D.h.a;
        this.f((Type)((Object)AtomicBoolean.class), h2);
        this.f((Type)((Object)AtomicInteger.class), h2);
        this.f((Type)((Object)AtomicLong.class), h2);
        object = b0.a;
        this.f((Type)((Object)AtomicReference.class), (X)object);
        this.f((Type)((Object)AtomicIntegerArray.class), h2);
        this.f((Type)((Object)AtomicLongArray.class), h2);
        this.f((Type)((Object)WeakReference.class), (X)object);
        this.f((Type)((Object)SoftReference.class), (X)object);
        this.f((Type)((Object)LinkedList.class), v.a);
    }

    private final M a(d0 object) {
        Object object2;
        object = this.b.k((d0)object);
        for (int i2 = 0; i2 < ((D[])(object2 = ((M)object).j)).length; ++i2) {
            object2 = object2[i2].a.e;
            if (!((Class)object2).isEnum()) continue;
            boolean bl = this.e((Class<?>)object2) instanceof A;
        }
        return object;
    }

    private static Member d(Class object) {
        Object object2;
        Object object3;
        int n2;
        Method[] methodArray = ((Class)object).getMethods();
        int n3 = methodArray.length;
        int n4 = 0;
        Object object4 = null;
        for (n2 = 0; n2 < n3; ++n2) {
            object3 = methodArray[n2];
            if (((Method)object3).getReturnType() == Void.class) {
                object2 = object4;
            } else {
                object2 = object4;
                if (((Method)object3).getAnnotation(com.github.catvod.spider.merge.z.b.class) != null) {
                    if (object4 != null) {
                        return null;
                    }
                    object2 = object3;
                }
            }
            object4 = object2;
        }
        object3 = ((Class)object).getFields();
        n3 = ((Field[])object3).length;
        for (n2 = n4; n2 < n3; ++n2) {
            object2 = object3[n2];
            object = object4;
            if (((Field)object2).getAnnotation(com.github.catvod.spider.merge.z.b.class) != null) {
                if (object4 != null) {
                    return null;
                }
                object = object2;
            }
            object4 = object;
        }
        return object4;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final X b(Class<?> object) {
        int n2;
        Object object2;
        int n3;
        void var1_18;
        Object object3 = ((Class)object).getName();
        long l2 = com.github.catvod.spider.merge.H.A.z((String)object3);
        if (Arrays.binarySearch(this.g, l2) >= 0) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("not support class : ", (String)object3));
        object3 = com.github.catvod.spider.merge.H.A.b((Class)object, this.f);
        if (((d0)object3).e.length == 0 && Iterable.class.isAssignableFrom((Class<?>)object)) {
            return U.b;
        }
        Object object4 = ((d0)object3).d;
        boolean bl = this.a;
        int n4 = 0;
        int n5 = bl && !this.f ? 1 : 0;
        int n6 = n5;
        if (object4 != null) {
            block32: {
                Class<?> clazz = object4.serializer();
                if (clazz != Void.class) {
                    try {
                        Object obj = clazz.newInstance();
                        if (obj instanceof X) {
                            X x2 = (X)obj;
                            return var1_18;
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (!object4.asm()) {
                    n5 = 0;
                }
                n3 = n5;
                if (n5 != 0) {
                    object2 = object4.serialzeFeatures();
                    n2 = ((i0[])object2).length;
                    n6 = 0;
                    while (true) {
                        n3 = n5;
                        if (n6 >= n2) break block32;
                        i0 i02 = object2[n6];
                        if (i0.z == i02 || i0.e == i02 || i0.w == i02 || i0.r == i02) break;
                        ++n6;
                    }
                    n3 = 0;
                }
            }
            n6 = n3;
            if (n3 != 0) {
                n6 = n3;
                if (object4.serialzeFilters().length != 0) {
                    n6 = 0;
                }
            }
        }
        if (!Modifier.isPublic(((Class)(object4 = ((d0)object3).a)).getModifiers())) {
            M m2 = new M((d0)object3);
            return var1_18;
        }
        if (n6 != 0 && this.b.a.b((Class<?>)object4) || object4 == Serializable.class || object4 == Object.class) {
            n6 = 0;
        }
        n5 = n6;
        if (n6 != 0) {
            n5 = n6;
            if (!com.github.catvod.spider.merge.H.c.a(((Class)object4).getSimpleName())) {
                n5 = 0;
            }
        }
        n6 = n5;
        if (n5 != 0) {
            n6 = n5;
            if (((d0)object3).a.isInterface()) {
                n6 = 0;
            }
        }
        n5 = n6;
        boolean bl2 = true;
        while (true) {
            block37: {
                Method method;
                block33: {
                    i0[] i0Array;
                    block38: {
                        block36: {
                            int n7;
                            com.github.catvod.spider.merge.H.e[] eArray;
                            block35: {
                                if (!bl2 || (bl2 = false)) break block35;
                                if (n6 == 0) break block36;
                                eArray = ((d0)object3).e;
                                n7 = eArray.length;
                                n3 = 0;
                            }
                            n5 = n6;
                            if (n3 >= n7) break block36;
                            com.github.catvod.spider.merge.H.e e2 = eArray[n3];
                            object2 = e2.c;
                            if (object2 != null && !((Field)object2).getType().equals(e2.e)) {
                                n2 = n4;
                                break;
                            }
                            method = e2.b;
                            if (method != null && !method.getReturnType().equals(e2.e)) {
                                n2 = n4;
                                break;
                            }
                            if (e2.e.isEnum() && this.c(e2.e) != A.b) {
                                n2 = n4;
                                break;
                            }
                            object2 = e2.h();
                            if (object2 == null) break block37;
                            i0Array = object2.format();
                            if (i0Array.length() != 0) {
                                n2 = n4;
                                if (e2.e != String.class) break;
                                n2 = n4;
                                if (!"trim".equals(i0Array)) break;
                            }
                            n2 = n4;
                            if (!com.github.catvod.spider.merge.H.c.a(object2.name())) break;
                            n2 = n4;
                            if (object2.jsonDirect()) break;
                            n2 = n4;
                            if (object2.serializeUsing() != Void.class) break;
                            if (object2.unwrapped()) {
                                n2 = n4;
                                break;
                            }
                            break block38;
                        }
                        n2 = n5;
                        break;
                    }
                    i0Array = object2.serialzeFeatures();
                    int n8 = i0Array.length;
                    n2 = 0;
                    while (true) {
                        n5 = n6;
                        if (n2 >= n8) break block33;
                        i0 i03 = i0Array[n2];
                        if (i0.z == i03 || i0.e == i03 || i0.w == i03 || i0.r == i03 || i0.o == i03) break;
                        ++n2;
                    }
                    n5 = 0;
                }
                n2 = n4;
                if (com.github.catvod.spider.merge.H.A.a0(method)) break;
                if (com.github.catvod.spider.merge.H.A.Z(method)) {
                    n2 = n4;
                    break;
                }
                n6 = n5;
                if (object2.defaultValue() != null) {
                    n6 = n5;
                    if (!"".equals(object2.defaultValue())) {
                        n2 = n4;
                        break;
                    }
                }
            }
            ++n3;
        }
        if (n2 != 0) {
            try {
                M m3 = this.a((d0)object3);
                return var1_18;
            }
            catch (Throwable throwable) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("create asm serializer error, verson 1.2.83, class ");
                ((StringBuilder)object3).append(object4);
                throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object3).toString(), throwable);
            }
            catch (OutOfMemoryError outOfMemoryError) {
                if (outOfMemoryError.getMessage().indexOf("Metaspace") != -1) throw outOfMemoryError;
            }
            catch (ClassCastException | ClassFormatError | ClassNotFoundException throwable) {}
        }
        M m4 = new M((d0)object3);
        return var1_18;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final X c(Type object) {
        Type type = com.github.catvod.spider.merge.y.a.d((Type)object);
        if (type == null) {
            object = this.d.b((Type)object);
            return (X)object;
        }
        if ((object = this.e.b((Type)object)) == null) {
            return null;
        }
        object = ((k)object).b((Type)type);
        return (X)object;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final X e(Class<?> var1_1) {
        var6_2 = this.c(var1_1);
        if (var6_2 != null) ** GOTO lbl295
        try {
            for (Class<?> var7_12 : com.github.catvod.spider.merge.H.q.a(i.class, Thread.currentThread().getContextClassLoader())) {
                if (!(var7_12 /* !! */  instanceof i)) continue;
                var7_12 /* !! */  = (i)var7_12 /* !! */ ;
                var8_13 = var7_12 /* !! */ .a().iterator();
                while (var8_13.hasNext()) {
                    this.f(var8_13.next(), (X)var7_12 /* !! */ );
                }
            }
        }
        catch (ClassCastException var6_3) {
            // empty catch block
        }
        var7_12 /* !! */  = this.c(var1_1);
        var6_2 = var7_12 /* !! */ ;
        if (var7_12 /* !! */  != null) ** GOTO lbl34
        var8_13 = com.github.catvod.spider.merge.y.a.class.getClassLoader();
        var6_2 = var7_12 /* !! */ ;
        if (var8_13 == Thread.currentThread().getContextClassLoader()) ** GOTO lbl34
        try {
            for (Class<?> var7_12 : com.github.catvod.spider.merge.H.q.a(i.class, var8_13)) {
                if (!(var7_12 /* !! */  instanceof i)) continue;
                var7_12 /* !! */  = (i)var7_12 /* !! */ ;
                var8_13 = var7_12 /* !! */ .a().iterator();
                while (var8_13.hasNext()) {
                    this.f(var8_13.next(), (X)var7_12 /* !! */ );
                }
            }
        }
        catch (ClassCastException var6_11) {
            ** continue;
        }
lbl32:
        // 2 sources

        while (true) {
            block49: {
                block65: {
                    block51: {
                        block57: {
                            block69: {
                                block59: {
                                    block47: {
                                        block79: {
                                            block78: {
                                                block77: {
                                                    block76: {
                                                        block75: {
                                                            block74: {
                                                                block73: {
                                                                    block72: {
                                                                        block71: {
                                                                            block67: {
                                                                                block70: {
                                                                                    block68: {
                                                                                        block66: {
                                                                                            block64: {
                                                                                                block63: {
                                                                                                    block62: {
                                                                                                        block61: {
                                                                                                            block60: {
                                                                                                                block58: {
                                                                                                                    block56: {
                                                                                                                        block55: {
                                                                                                                            block54: {
                                                                                                                                block53: {
                                                                                                                                    block52: {
                                                                                                                                        block50: {
                                                                                                                                            var6_2 = this.c(var1_1);
lbl34:
                                                                                                                                            // 3 sources

                                                                                                                                            var8_13 = this.h.iterator();
                                                                                                                                            var7_12 /* !! */  = var6_2;
                                                                                                                                            while (var8_13.hasNext()) {
                                                                                                                                                var6_2 = ((a)var8_13.next()).a();
                                                                                                                                                var7_12 /* !! */  = var6_2;
                                                                                                                                                if (var6_2 == null) continue;
                                                                                                                                                break block47;
                                                                                                                                            }
                                                                                                                                            var6_2 = var7_12 /* !! */ ;
                                                                                                                                            if (var7_12 /* !! */  != null) break block49;
                                                                                                                                            var9_14 = var1_1.getName();
                                                                                                                                            if (!Map.class.isAssignableFrom(var1_1)) break block50;
                                                                                                                                            var6_2 = T.i;
                                                                                                                                            break block51;
                                                                                                                                        }
                                                                                                                                        if (!List.class.isAssignableFrom(var1_1)) break block52;
                                                                                                                                        var6_2 = Q.a;
                                                                                                                                        break block51;
                                                                                                                                    }
                                                                                                                                    if (!Collection.class.isAssignableFrom(var1_1)) break block53;
                                                                                                                                    var6_2 = v.a;
                                                                                                                                    break block51;
                                                                                                                                }
                                                                                                                                if (!Date.class.isAssignableFrom(var1_1)) break block54;
                                                                                                                                var6_2 = y.a;
                                                                                                                                break block51;
                                                                                                                            }
                                                                                                                            if (!com.github.catvod.spider.merge.y.c.class.isAssignableFrom(var1_1)) break block55;
                                                                                                                            var6_2 = H.a;
                                                                                                                            break block51;
                                                                                                                        }
                                                                                                                        if (!J.class.isAssignableFrom(var1_1)) break block56;
                                                                                                                        var6_2 = K.a;
                                                                                                                        break block51;
                                                                                                                    }
                                                                                                                    if (com.github.catvod.spider.merge.y.Q.class.isAssignableFrom(var1_1)) break block57;
                                                                                                                    var5_15 = var1_1.isEnum();
                                                                                                                    var8_13 = null;
                                                                                                                    var7_12 /* !! */  = null;
                                                                                                                    if (!var5_15) break block58;
                                                                                                                    var8_13 = (Class)com.github.catvod.spider.merge.y.a.d(var1_1);
                                                                                                                    var6_2 = var8_13 != null ? com.github.catvod.spider.merge.H.A.D(var8_13, d.class) : com.github.catvod.spider.merge.H.A.D(var1_1, d.class);
                                                                                                                    if ((var6_2 = (d)var6_2) != null && var6_2.serializeEnumAsJavaBean()) break block59;
                                                                                                                    if (var8_13 != null) {
                                                                                                                        var8_13 = e0.d((Class)var8_13);
                                                                                                                        var6_2 = var7_12 /* !! */ ;
                                                                                                                        if (var8_13 != null) {
                                                                                                                            var6_2 = var7_12 /* !! */ ;
                                                                                                                            try {
                                                                                                                                if (var8_13 instanceof Method) {
                                                                                                                                    var6_2 = (Method)var8_13;
                                                                                                                                    var6_2 = var1_1.getMethod(var6_2.getName(), var6_2.getParameterTypes());
                                                                                                                                }
                                                                                                                            }
                                                                                                                            catch (Exception var6_4) {
                                                                                                                                var6_2 = var7_12 /* !! */ ;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var6_2 = e0.d(var1_1);
                                                                                                                    }
                                                                                                                    if (var6_2 == null) break block60;
                                                                                                                    var6_2 = new A((Member)var6_2);
                                                                                                                    break block51;
                                                                                                                }
                                                                                                                var6_2 = var1_1.getSuperclass();
                                                                                                                if (var6_2 == null || !var6_2.isEnum()) break block61;
                                                                                                                if ((var6_2 = com.github.catvod.spider.merge.H.A.D(var6_2, d.class)) != null && var6_2.serializeEnumAsJavaBean()) break block59;
                                                                                                            }
                                                                                                            var6_2 = A.b;
                                                                                                            break block51;
                                                                                                        }
                                                                                                        if (!var1_1.isArray()) break block62;
                                                                                                        var6_2 = var1_1.getComponentType();
                                                                                                        var7_12 /* !! */  = new g(var6_2, this.e(var6_2));
                                                                                                        break block63;
                                                                                                    }
                                                                                                    var5_15 = Throwable.class.isAssignableFrom(var1_1);
                                                                                                    var3_16 = 0;
                                                                                                    if (!var5_15) break block64;
                                                                                                    var6_2 = com.github.catvod.spider.merge.H.A.b(var1_1, false);
                                                                                                    var6_2.g |= i0.o.a;
                                                                                                    var7_12 /* !! */  = new M((d0)var6_2);
                                                                                                }
                                                                                                this.f(var1_1, (X)var7_12 /* !! */ );
                                                                                                break block65;
                                                                                            }
                                                                                            if (TimeZone.class.isAssignableFrom(var1_1) || Map.Entry.class.isAssignableFrom(var1_1)) break block57;
                                                                                            if (!Appendable.class.isAssignableFrom(var1_1)) break block66;
                                                                                            var6_2 = com.github.catvod.spider.merge.D.f.a;
                                                                                            break block51;
                                                                                        }
                                                                                        if (Charset.class.isAssignableFrom(var1_1)) break block67;
                                                                                        if (!Enumeration.class.isAssignableFrom(var1_1)) break block68;
                                                                                        var6_2 = B.a;
                                                                                        break block51;
                                                                                    }
                                                                                    if (Calendar.class.isAssignableFrom(var1_1) || XMLGregorianCalendar.class.isAssignableFrom(var1_1)) break block69;
                                                                                    if (!com.github.catvod.spider.merge.H.A.b0(var1_1)) break block70;
                                                                                    var6_2 = u.a;
                                                                                    break block51;
                                                                                }
                                                                                if (!com.github.catvod.spider.merge.H.A.h0(var1_1)) break block71;
                                                                            }
                                                                            var6_2 = k0.a;
                                                                            break block51;
                                                                        }
                                                                        if (Iterator.class.isAssignableFrom(var1_1) || Node.class.isAssignableFrom(var1_1)) break block57;
                                                                        if (var9_14.startsWith("java.awt.") && com.github.catvod.spider.merge.D.j.j(var1_1) && !e0.j) {
                                                                            for (var2_17 = 0; var2_17 < 4; ++var2_17) {
                                                                                try {
                                                                                    var6_2 = (new String[]{"java.awt.Color", "java.awt.Font", "java.awt.Point", "java.awt.Rectangle"})[var2_17];
                                                                                    if (!var6_2.equals(var9_14)) continue;
                                                                                    var7_12 /* !! */  = Class.forName((String)var6_2);
                                                                                    var6_2 = com.github.catvod.spider.merge.D.j.a;
                                                                                    this.f(var7_12 /* !! */ , (X)var6_2);
                                                                                    break block49;
                                                                                }
                                                                                catch (Throwable var6_5) {
                                                                                    e0.j = true;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (e0.k || !var9_14.startsWith("java.time.") && !var9_14.startsWith("java.util.Optional") && !var9_14.equals("java.util.concurrent.atomic.LongAdder") && !var9_14.equals("java.util.concurrent.atomic.DoubleAdder")) break block72;
                                                                        for (var2_17 = 0; var2_17 < 11; ++var2_17) {
                                                                            var6_2 = (new String[]{"java.time.LocalDateTime", "java.time.LocalDate", "java.time.LocalTime", "java.time.ZonedDateTime", "java.time.OffsetDateTime", "java.time.OffsetTime", "java.time.ZoneOffset", "java.time.ZoneRegion", "java.time.Period", "java.time.Duration", "java.time.Instant"})[var2_17];
                                                                            if (!var6_2.equals(var9_14)) continue;
                                                                            var7_12 /* !! */  = Class.forName((String)var6_2);
                                                                            var6_2 = s.a;
                                                                            ** GOTO lbl175
                                                                        }
                                                                        for (var2_17 = 0; var2_17 < 4; ++var2_17) {
                                                                            var6_2 = (new String[]{"java.util.Optional", "java.util.OptionalDouble", "java.util.OptionalInt", "java.util.OptionalLong"})[var2_17];
                                                                            if (!var6_2.equals(var9_14)) continue;
                                                                            var7_12 /* !! */  = Class.forName((String)var6_2);
                                                                            var6_2 = w.a;
                                                                            ** GOTO lbl175
                                                                        }
                                                                        for (var2_17 = 0; var2_17 < 2; ++var2_17) {
                                                                            try {
                                                                                var6_2 = (new String[]{"java.util.concurrent.atomic.LongAdder", "java.util.concurrent.atomic.DoubleAdder"})[var2_17];
                                                                                if (!var6_2.equals(var9_14)) continue;
                                                                                var7_12 /* !! */  = Class.forName((String)var6_2);
                                                                                var6_2 = com.github.catvod.spider.merge.D.c.a;
lbl175:
                                                                                // 3 sources

                                                                                this.f(var7_12 /* !! */ , (X)var6_2);
                                                                                break block49;
                                                                            }
                                                                            catch (Throwable var6_6) {
                                                                                e0.k = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!e0.l && var9_14.startsWith("oracle.sql.")) {
                                                                        for (var2_17 = 0; var2_17 < 2; ++var2_17) {
                                                                            try {
                                                                                var6_2 = (new String[]{"oracle.sql.DATE", "oracle.sql.TIMESTAMP"})[var2_17];
                                                                                if (!var6_2.equals(var9_14)) continue;
                                                                                var7_12 /* !! */  = Class.forName((String)var6_2);
                                                                                var6_2 = y.a;
                                                                                this.f(var7_12 /* !! */ , (X)var6_2);
                                                                                break block49;
                                                                            }
                                                                            catch (Throwable var6_7) {
                                                                                e0.l = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!e0.m && var9_14.equals("springfox.documentation.spring.web.json.Json")) {
                                                                        try {
                                                                            var7_12 /* !! */  = Class.forName("springfox.documentation.spring.web.json.Json");
                                                                            var6_2 = com.github.catvod.spider.merge.G.a.a;
                                                                            this.f(var7_12 /* !! */ , (X)var6_2);
                                                                            break block49;
                                                                        }
                                                                        catch (ClassNotFoundException var6_8) {
                                                                            e0.m = true;
                                                                        }
                                                                    }
                                                                    if (!e0.n && var9_14.startsWith("com.google.common.collect.")) {
                                                                        for (var2_17 = 0; var2_17 < 5; ++var2_17) {
                                                                            try {
                                                                                var6_2 = (new String[]{"com.google.common.collect.HashMultimap", "com.google.common.collect.LinkedListMultimap", "com.google.common.collect.LinkedHashMultimap", "com.google.common.collect.ArrayListMultimap", "com.google.common.collect.TreeMultimap"})[var2_17];
                                                                                if (!var6_2.equals(var9_14)) continue;
                                                                                var7_12 /* !! */  = Class.forName((String)var6_2);
                                                                                var6_2 = F.a;
                                                                                this.f(var7_12 /* !! */ , (X)var6_2);
                                                                                break block49;
                                                                            }
                                                                            catch (ClassNotFoundException var6_9) {
                                                                                e0.n = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!var9_14.equals("net.sf.json.JSONNull")) break block73;
                                                                    var6_2 = U.b;
                                                                    break block47;
                                                                }
                                                                if (!var9_14.equals("org.json.JSONObject")) break block74;
                                                                var6_2 = I.a;
                                                                break block47;
                                                            }
                                                            if (!e0.o && var9_14.startsWith("org.joda.")) {
                                                                for (var2_17 = 0; var2_17 < 11; ++var2_17) {
                                                                    try {
                                                                        var6_2 = (new String[]{"org.joda.time.LocalDate", "org.joda.time.LocalDateTime", "org.joda.time.LocalTime", "org.joda.time.Instant", "org.joda.time.DateTime", "org.joda.time.Period", "org.joda.time.Duration", "org.joda.time.DateTimeZone", "org.joda.time.UTCDateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "org.joda.time.tz.FixedDateTimeZone"})[var2_17];
                                                                        if (!var6_2.equals(var9_14)) continue;
                                                                        var7_12 /* !! */  = Class.forName((String)var6_2);
                                                                        var6_2 = N.a;
                                                                        this.f(var7_12 /* !! */ , (X)var6_2);
                                                                        break block49;
                                                                    }
                                                                    catch (ClassNotFoundException var6_10) {
                                                                        e0.o = true;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            if (!"java.nio.HeapByteBuffer".equals(var9_14)) break block75;
                                                            var6_2 = q.a;
                                                            break block47;
                                                        }
                                                        if (!"org.javamoney.moneta.Money".equals(var9_14)) break block76;
                                                        var6_2 = com.github.catvod.spider.merge.F.a.a;
                                                        break block47;
                                                    }
                                                    if (!"com.google.protobuf.Descriptors$FieldDescriptor".equals(var9_14)) break block77;
                                                    var6_2 = k0.a;
                                                    break block47;
                                                }
                                                var9_14 = var1_1.getInterfaces();
                                                if (var9_14.length != 1 || !var9_14[0].isAnnotation()) break block78;
                                                var6_2 = com.github.catvod.spider.merge.D.e.e;
                                                break block47;
                                            }
                                            if (!com.github.catvod.spider.merge.H.A.i0(var1_1)) break block79;
                                            var6_2 = this.e(var1_1.getSuperclass());
                                            break block47;
                                        }
                                        if (!Proxy.isProxyClass(var1_1)) break block59;
                                        if (var9_14.length == 2) {
                                            var6_2 = var9_14[1];
                                        } else {
                                            var4_18 = var9_14.length;
                                            var6_2 = null;
                                            for (var2_17 = var3_16; var2_17 < var4_18; ++var2_17) {
                                                var7_12 /* !! */  = var9_14[var2_17];
                                                if (var7_12 /* !! */ .getName().startsWith("org.springframework.aop.")) continue;
                                                if (var6_2 != null) {
                                                    var6_2 = var8_13;
                                                    break;
                                                }
                                                var6_2 = var7_12 /* !! */ ;
                                            }
                                        }
                                        if (var6_2 == null) break block59;
                                        var6_2 = this.e(var6_2);
                                    }
                                    this.f(var1_1, (X)var6_2);
                                    break block49;
                                }
                                var6_2 = this.b(var1_1);
                                break block51;
                            }
                            var6_2 = r.b;
                            break block51;
                        }
                        var6_2 = U.b;
                    }
                    this.f(var1_1, (X)var6_2);
                    var7_12 /* !! */  = var6_2;
                }
                var6_2 = var7_12 /* !! */ ;
                if (var7_12 /* !! */  == null) {
                    var6_2 = this.c(var1_1);
                }
            }
            return var6_2;
        }
    }

    public final boolean f(Type type, X x2) {
        Type type2 = com.github.catvod.spider.merge.y.a.d(type);
        if (type2 != null) {
            k<Type, X> k2;
            k<Type, X> k3 = k2 = this.e.b(type);
            if (k2 == null) {
                k3 = new k(4);
                this.e.c(type, k3);
            }
            return k3.c(type2, x2);
        }
        return this.d.c(type, x2);
    }

    public final void g() {
        if (com.github.catvod.spider.merge.H.c.a) {
            return;
        }
        this.a = false;
    }
}

