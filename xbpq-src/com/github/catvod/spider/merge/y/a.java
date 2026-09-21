/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.D.J;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.M;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.e0;
import com.github.catvod.spider.merge.D.f0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.y.Q;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.c;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.y.e;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a
implements Q,
c {
    public static TimeZone a;
    public static Locale b;
    public static String c;
    static final f0[] d;
    public static String e;
    public static int f;
    public static int g;
    private static final ConcurrentHashMap<Type, Type> h;

    static {
        Properties properties;
        block8: {
            int n2;
            block7: {
                String string;
                block6: {
                    a = TimeZone.getDefault();
                    b = Locale.getDefault();
                    c = "@type";
                    d = new f0[0];
                    e = "yyyy-MM-dd HH:mm:ss";
                    h = new ConcurrentHashMap(16);
                    f = com.github.catvod.spider.merge.B.c.b.a | 0 | com.github.catvod.spider.merge.B.c.e.a | com.github.catvod.spider.merge.B.c.h.a | com.github.catvod.spider.merge.B.c.c.a | com.github.catvod.spider.merge.B.c.d.a | com.github.catvod.spider.merge.B.c.g.a | com.github.catvod.spider.merge.B.c.j.a | com.github.catvod.spider.merge.B.c.i.a;
                    g = 0 | i0.b.a | i0.l.a | i0.f.a | i0.m.a;
                    properties = i.a;
                    string = properties.getProperty("fastjson.serializerFeatures.MapSortField");
                    n2 = i0.C.a;
                    if (!"true".equals(string)) break block6;
                    n2 = g | n2;
                    break block7;
                }
                if (!"false".equals(string)) break block8;
                n2 = g & ~n2;
            }
            g = n2;
        }
        if ("true".equals(properties.getProperty("parser.features.NonStringKeyAsString"))) {
            f |= com.github.catvod.spider.merge.B.c.u.a;
        }
        if ("true".equals(properties.getProperty("parser.features.ErrorOnEnumNotMatch")) || "true".equals(properties.getProperty("fastjson.parser.features.ErrorOnEnumNotMatch"))) {
            f |= com.github.catvod.spider.merge.B.c.w.a;
        }
        if ("false".equals(properties.getProperty("fastjson.asmEnable"))) {
            o.v.m();
            e0.i.g();
        }
        new ThreadLocal();
        new ThreadLocal();
    }

    public static Type d(Type type) {
        if (type != null) {
            return h.get(type);
        }
        return null;
    }

    public static Object f(String object) {
        int n2 = f;
        o o2 = o.v;
        com.github.catvod.spider.merge.B.b b2 = null;
        if (object == null) {
            object = b2;
        } else {
            b2 = new com.github.catvod.spider.merge.B.b((String)object, o2, n2);
            object = b2.o(null);
            b2.k(object);
            b2.close();
        }
        return object;
    }

    public static Object g(String object, o object2, int n2) {
        if (object == null) {
            return null;
        }
        object2 = new com.github.catvod.spider.merge.B.b((String)object, (o)object2, n2);
        object = ((com.github.catvod.spider.merge.B.b)object2).o(null);
        ((com.github.catvod.spider.merge.B.b)object2).k(object);
        ((com.github.catvod.spider.merge.B.b)object2).close();
        return object;
    }

    public static e i(String object) {
        if ((object = com.github.catvod.spider.merge.y.a.f((String)object)) instanceof e) {
            return (e)object;
        }
        try {
            object = (e)com.github.catvod.spider.merge.y.a.k(object);
            return object;
        }
        catch (RuntimeException runtimeException) {
            throw new d("can not cast to JSONObject.", runtimeException);
        }
    }

    public static <T> T j(String string, Class<T> clazz) {
        o o2 = o.v;
        int n2 = f;
        int n3 = string.length();
        com.github.catvod.spider.merge.B.b b2 = null;
        if (n3 == 0) {
            string = b2;
        } else {
            b2 = new com.github.catvod.spider.merge.B.b(string, o2, n2);
            string = b2.t(clazz, null);
            b2.k(string);
            b2.close();
        }
        return (T)string;
    }

    public static Object k(Object object) {
        return com.github.catvod.spider.merge.y.a.l(object, e0.i);
    }

    public static Object l(Object object, e0 object2) {
        int n2;
        if (object == null) {
            return null;
        }
        if (object instanceof a) {
            return object;
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            int n3 = map.size();
            object = map instanceof LinkedHashMap ? new LinkedHashMap(n3) : (map instanceof TreeMap ? new TreeMap() : new HashMap(n3));
            e e2 = new e((Map<String, Object>)object);
            for (Map.Entry entry : map.entrySet()) {
                object = entry.getKey();
                boolean bl = A.b;
                object = object == null ? null : object.toString();
                e2.y((String)object, com.github.catvod.spider.merge.y.a.l(entry.getValue(), (e0)object2));
            }
            return e2;
        }
        if (object instanceof Collection) {
            Collection object3 = (Collection)object;
            object = new b(object3.size());
            Iterator object42 = object3.iterator();
            while (object42.hasNext()) {
                ((b)object).add(com.github.catvod.spider.merge.y.a.l(object42.next(), (e0)object2));
            }
            return object;
        }
        if (object instanceof J) {
            return com.github.catvod.spider.merge.y.a.f(com.github.catvod.spider.merge.y.a.m(object));
        }
        Class<?> clazz = object.getClass();
        if (clazz.isEnum()) {
            return ((Enum)object).name();
        }
        boolean bl = clazz.isArray();
        boolean bl2 = false;
        int n3 = 0;
        if (bl) {
            int n4 = Array.getLength(object);
            object2 = new b(n4);
            for (n2 = n3; n2 < n4; ++n2) {
                ((b)object2).add(com.github.catvod.spider.merge.y.a.k(Array.get(object, n2)));
            }
            return object2;
        }
        if (o.i(clazz)) {
            return object;
        }
        X x2 = ((e0)object2).e(clazz);
        if (x2 instanceof M) {
            M m2 = (M)x2;
            Object object5 = m2.o();
            if (object5 != null) {
                object5 = object5.serialzeFeatures();
                n3 = ((i0[])object5).length;
                bl2 = false;
                for (n2 = 0; n2 < n3; ++n2) {
                    i0 i02 = object5[n2];
                    if (i02 != i0.m && i02 != i0.C) continue;
                    bl2 = true;
                }
            }
            object5 = new e(bl2);
            try {
                for (Map.Entry entry : ((LinkedHashMap)m2.n(object)).entrySet()) {
                    ((e)object5).y((String)entry.getKey(), com.github.catvod.spider.merge.y.a.l(entry.getValue(), (e0)object2));
                }
                return object5;
            }
            catch (Exception exception) {
                throw new d("toJSON error", exception);
            }
        }
        n2 = g;
        return com.github.catvod.spider.merge.y.a.f(com.github.catvod.spider.merge.y.a.n(object, (e0)object2, new f0[]{null}, n2, new i0[0]));
    }

    public static String m(Object object) {
        f0[] f0Array = d;
        return com.github.catvod.spider.merge.y.a.n(object, e0.i, f0Array, g, new i0[0]);
    }

    public static String n(Object object, e0 e02, f0[] f0Array, int n2, i0 ... object2) {
        L l2;
        block7: {
            object2 = new h0(n2, (i0[])object2);
            l2 = new L((h0)object2, e02);
            if (f0Array == null) break block7;
            int n3 = f0Array.length;
            for (n2 = 0; n2 < n3; ++n2) {
                l2.c(f0Array[n2]);
                continue;
            }
        }
        try {
            l2.u(object);
            object = ((h0)object2).toString();
            return object;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            ((h0)object2).close();
        }
    }

    @Override
    public final String a() {
        h0 h02 = new h0();
        try {
            Object object = new L(h02, e0.i);
            ((L)object).u(this);
            object = h02.toString();
            return object;
        }
        finally {
            h02.close();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(Appendable object) {
        Throwable throwable2222222;
        h0 h02 = new h0();
        L l2 = new L(h02, e0.i);
        l2.u(this);
        object.append(h02.toString());
        h02.close();
        return;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            {
                object = new d(iOException.getMessage(), iOException);
                throw object;
            }
        }
        h02.close();
        throw throwable2222222;
    }

    public final String toString() {
        return this.a();
    }
}

