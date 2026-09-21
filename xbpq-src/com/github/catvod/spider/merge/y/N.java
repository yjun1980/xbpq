/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.D.D;
import com.github.catvod.spider.merge.D.e0;
import com.github.catvod.spider.merge.y.B;
import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.M;
import com.github.catvod.spider.merge.y.O;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.c;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.y.e;
import com.github.catvod.spider.merge.y.g;
import com.github.catvod.spider.merge.y.q;
import com.github.catvod.spider.merge.y.z;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class N
implements c {
    private static ConcurrentMap<String, N> f = new ConcurrentHashMap<String, N>(128, 0.75f, 1);
    private final String a;
    private G[] b;
    private e0 c;
    private o d;
    private boolean e;

    public N(String string, e0 e02, o o2) {
        if (string != null && string.length() != 0) {
            this.a = string;
            this.c = e02;
            this.d = o2;
            this.e = true;
            return;
        }
        throw new O("json-path can not be null or empty");
    }

    /*
     * Enabled aggressive block sorting
     */
    static int b(Object object, Object object2) {
        Object object3;
        Object object4;
        block22: {
            Class<?> clazz;
            block31: {
                block21: {
                    block30: {
                        Class<?> clazz2;
                        block29: {
                            block27: {
                                block28: {
                                    block25: {
                                        block26: {
                                            block23: {
                                                block24: {
                                                    if (object.getClass() == object2.getClass()) {
                                                        object4 = object;
                                                        object3 = object2;
                                                        return ((Comparable)object4).compareTo(object3);
                                                    }
                                                    clazz2 = object.getClass();
                                                    clazz = object2.getClass();
                                                    if (clazz2 != BigDecimal.class) break block23;
                                                    if (clazz != Integer.class) break block24;
                                                    object2 = new BigDecimal((Integer)object2);
                                                    break block21;
                                                }
                                                if (clazz == Long.class) {
                                                    object2 = new BigDecimal((Long)object2);
                                                    break block21;
                                                } else if (clazz == Float.class) {
                                                    object2 = new BigDecimal(((Float)object2).floatValue());
                                                    break block21;
                                                } else {
                                                    object4 = object;
                                                    object3 = object2;
                                                    if (clazz != Double.class) return ((Comparable)object4).compareTo(object3);
                                                    object2 = new BigDecimal((Double)object2);
                                                }
                                                break block21;
                                            }
                                            if (clazz2 != Long.class) break block25;
                                            if (clazz != Integer.class) break block26;
                                            object2 = new Long(((Integer)object2).intValue());
                                            break block21;
                                        }
                                        if (clazz == BigDecimal.class) {
                                            object = new BigDecimal((Long)object);
                                            break block22;
                                        } else if (clazz == Float.class) {
                                            object = new Float(((Long)object).longValue());
                                            break block22;
                                        } else {
                                            object4 = object;
                                            object3 = object2;
                                            if (clazz != Double.class) return ((Comparable)object4).compareTo(object3);
                                            object = new Double(((Long)object).longValue());
                                        }
                                        break block22;
                                    }
                                    if (clazz2 != Integer.class) break block27;
                                    if (clazz != Long.class) break block28;
                                    object = new Long(((Integer)object).intValue());
                                    break block22;
                                }
                                if (clazz == BigDecimal.class) {
                                    object = new BigDecimal((Integer)object);
                                    break block22;
                                } else if (clazz == Float.class) {
                                    object = new Float(((Integer)object).intValue());
                                    break block22;
                                } else {
                                    object4 = object;
                                    object3 = object2;
                                    if (clazz != Double.class) return ((Comparable)object4).compareTo(object3);
                                    object = new Double(((Integer)object).intValue());
                                }
                                break block22;
                            }
                            if (clazz2 != Double.class) break block29;
                            if (clazz == Integer.class) {
                                object2 = new Double(((Integer)object2).intValue());
                                break block21;
                            } else if (clazz == Long.class) {
                                object2 = new Double(((Long)object2).longValue());
                                break block21;
                            } else {
                                object4 = object;
                                object3 = object2;
                                if (clazz != Float.class) return ((Comparable)object4).compareTo(object3);
                                object2 = new Double(((Float)object2).floatValue());
                            }
                            break block21;
                        }
                        object4 = object;
                        object3 = object2;
                        if (clazz2 != Float.class) return ((Comparable)object4).compareTo(object3);
                        if (clazz != Integer.class) break block30;
                        object2 = new Float(((Integer)object2).intValue());
                        break block21;
                    }
                    if (clazz != Long.class) break block31;
                    object2 = new Float(((Long)object2).longValue());
                }
                object4 = object;
                object3 = object2;
                return ((Comparable)object4).compareTo(object3);
            }
            object4 = object;
            object3 = object2;
            if (clazz != Double.class) return ((Comparable)object4).compareTo(object3);
            object = new Double(((Float)object).floatValue());
        }
        object4 = object;
        object3 = object2;
        return ((Comparable)object4).compareTo(object3);
    }

    public static N c(String string) {
        if (string != null) {
            N n2;
            N n3 = n2 = (N)((ConcurrentHashMap)f).get(string);
            if (n2 == null) {
                n3 = n2 = new N(string, e0.i, o.v);
                if (((ConcurrentHashMap)f).size() < 1024) {
                    ((ConcurrentHashMap)f).putIfAbsent(string, n2);
                    n3 = (N)((ConcurrentHashMap)f).get(string);
                }
            }
            return n3;
        }
        throw new O("jsonpath can not be null");
    }

    protected static boolean n(Class<?> clazz) {
        boolean bl = clazz == Byte.class || clazz == Short.class || clazz == Integer.class || clazz == Long.class;
        return bl;
    }

    @Override
    public final String a() {
        return com.github.catvod.spider.merge.y.a.m(this.a);
    }

    protected final void d(Object collection, List<Object> object) {
        Class<Object> clazz2 = collection.getClass();
        com.github.catvod.spider.merge.D.M m2 = this.j(clazz2);
        if (m2 != null) {
            try {
                collection = m2.m(collection);
            }
            catch (Exception exception) {
                object = com.github.catvod.spider.merge.C.a.c("jsonpath error, path ");
                ((StringBuilder)object).append(this.a);
                throw new O(((StringBuilder)object).toString(), exception);
            }
        } else {
            collection = collection instanceof Map ? ((Map)((Object)collection)).values() : (collection instanceof Collection ? (Collection)collection : null);
        }
        if (collection != null) {
            for (Class<Object> clazz2 : collection) {
                if (clazz2 != null && !o.i(clazz2.getClass())) {
                    this.d(clazz2, (List<Object>)object);
                    continue;
                }
                object.add(clazz2);
            }
            return;
        }
        throw new UnsupportedOperationException(clazz2.getName());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void e(Object iterator, String string, List<Object> object) {
        StringBuilder stringBuilder;
        void var2_11;
        if (iterator == null) {
            return;
        }
        if (!(iterator instanceof Map)) {
            if (!(iterator instanceof Collection)) {
                com.github.catvod.spider.merge.D.M m2 = this.j(iterator.getClass());
                if (m2 != null) {
                    try {
                        Comparable<D> comparable = m2.k((String)var2_11);
                        if (comparable != null) {
                            try {
                                stringBuilder.add(((D)comparable).e(iterator));
                                return;
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("getFieldValue error.");
                                stringBuilder.append((String)var2_11);
                                d d2 = new d(stringBuilder.toString(), illegalAccessException);
                                throw d2;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                comparable = new Comparable<D>();
                                ((StringBuilder)comparable).append("getFieldValue error.");
                                ((StringBuilder)comparable).append((String)var2_11);
                                d d3 = new d(((StringBuilder)comparable).toString(), invocationTargetException);
                                throw d3;
                            }
                        }
                        Iterator iterator2 = ((ArrayList)m2.m(iterator)).iterator();
                        while (true) {
                            if (!iterator2.hasNext()) {
                                return;
                            }
                            this.e(iterator2.next(), (String)var2_11, (List<Object>)((Object)stringBuilder));
                        }
                    }
                    catch (Exception exception) {
                        throw new O(z.b(com.github.catvod.spider.merge.C.a.c("jsonpath error, path "), this.a, ", segement ", (String)var2_11), exception);
                    }
                }
                if (iterator instanceof List) {
                    List list = (List)((Object)iterator);
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        this.e(list.get(i2), (String)var2_11, (List<Object>)((Object)stringBuilder));
                    }
                }
                return;
            }
        } else {
            Iterator iterator3 = ((Map)((Object)iterator)).entrySet().iterator();
            while (true) {
                if (!iterator3.hasNext()) {
                    return;
                }
                Map.Entry entry = iterator3.next();
                Object v2 = entry.getValue();
                if (var2_11.equals(entry.getKey())) {
                    if (v2 instanceof Collection) {
                        stringBuilder.addAll((Collection)v2);
                        continue;
                    }
                    stringBuilder.add(v2);
                    continue;
                }
                if (v2 == null || o.i(v2.getClass())) continue;
                this.e(v2, (String)var2_11, (List<Object>)((Object)stringBuilder));
            }
        }
        Iterator iterator4 = ((Collection)((Object)iterator)).iterator();
        while (iterator4.hasNext()) {
            Object e2 = iterator4.next();
            if (o.i(e2.getClass())) continue;
            this.e(e2, (String)var2_11, (List<Object>)((Object)stringBuilder));
        }
        return;
    }

    public final Object f(Object object) {
        G[] gArray;
        if (object == null) {
            return null;
        }
        this.m();
        Object object2 = object;
        for (int i2 = 0; i2 < (gArray = this.b).length; ++i2) {
            object2 = gArray[i2].a(this, object, object2);
        }
        return object2;
    }

    final Set<?> g(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Map) {
            return ((Map)object).keySet();
        }
        if (!(object instanceof Collection || object instanceof Object[] || object.getClass().isArray())) {
            com.github.catvod.spider.merge.D.M m2 = this.j(object.getClass());
            if (m2 == null) {
                return null;
            }
            try {
                object = m2.j(object);
                return object;
            }
            catch (Exception exception) {
                object = com.github.catvod.spider.merge.C.a.c("evalKeySet error : ");
                ((StringBuilder)object).append(this.a);
                throw new O(((StringBuilder)object).toString(), exception);
            }
        }
        return null;
    }

    final int h(Object object) {
        if (object == null) {
            return -1;
        }
        if (object instanceof Collection) {
            return ((Collection)object).size();
        }
        if (object instanceof Object[]) {
            return ((Object[])object).length;
        }
        if (object.getClass().isArray()) {
            return Array.getLength(object);
        }
        if (object instanceof Map) {
            int n2 = 0;
            object = ((Map)object).values().iterator();
            while (object.hasNext()) {
                if (object.next() == null) continue;
                ++n2;
            }
            return n2;
        }
        com.github.catvod.spider.merge.D.M m2 = this.j(object.getClass());
        if (m2 == null) {
            return -1;
        }
        try {
            int n3 = m2.p(object);
            return n3;
        }
        catch (Exception exception) {
            object = com.github.catvod.spider.merge.C.a.c("evalSize error : ");
            ((StringBuilder)object).append(this.a);
            throw new O(((StringBuilder)object).toString(), exception);
        }
    }

    protected final Object i(Object iterator, int n2) {
        if (iterator == null) {
            return null;
        }
        if (iterator instanceof List) {
            iterator = (List)((Object)iterator);
            if (n2 >= 0) {
                if (n2 < iterator.size()) {
                    return iterator.get(n2);
                }
                return null;
            }
            if (Math.abs(n2) <= iterator.size()) {
                return iterator.get(iterator.size() + n2);
            }
            return null;
        }
        if (iterator.getClass().isArray()) {
            int n3 = Array.getLength(iterator);
            if (n2 >= 0) {
                if (n2 < n3) {
                    return Array.get(iterator, n2);
                }
                return null;
            }
            if (Math.abs(n2) <= n3) {
                return Array.get(iterator, n3 + n2);
            }
            return null;
        }
        if (iterator instanceof Map) {
            Map map = (Map)((Object)iterator);
            Object v2 = map.get(n2);
            iterator = v2;
            if (v2 == null) {
                iterator = map.get(Integer.toString(n2));
            }
            return iterator;
        }
        if (iterator instanceof Collection) {
            iterator = (Collection)((Object)iterator);
            int n4 = 0;
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                if (n4 == n2) {
                    return e2;
                }
                ++n4;
            }
            return null;
        }
        if (n2 == 0) {
            return iterator;
        }
        throw new UnsupportedOperationException();
    }

    protected final com.github.catvod.spider.merge.D.M j(Class<?> object) {
        object = (object = this.c.e((Class<?>)object)) instanceof com.github.catvod.spider.merge.D.M ? (com.github.catvod.spider.merge.D.M)object : null;
        return object;
    }

    protected final Object k(Object object, String list, long l2) {
        block43: {
            int n2;
            block40: {
                block45: {
                    block49: {
                        block48: {
                            block47: {
                                block46: {
                                    block44: {
                                        Object object2;
                                        block42: {
                                            block41: {
                                                Object object3;
                                                block33: {
                                                    List list2;
                                                    block34: {
                                                        block30: {
                                                            block31: {
                                                                block32: {
                                                                    object3 = null;
                                                                    if (object == null) {
                                                                        return null;
                                                                    }
                                                                    object2 = object;
                                                                    if (object instanceof String) {
                                                                        try {
                                                                            object2 = (e)com.github.catvod.spider.merge.y.a.g((String)object, this.d, com.github.catvod.spider.merge.y.a.f);
                                                                        }
                                                                        catch (Exception exception) {
                                                                            object2 = object;
                                                                        }
                                                                    }
                                                                    if (!(object2 instanceof Map)) break block30;
                                                                    object2 = (Map)object2;
                                                                    list = object2.get(list);
                                                                    object = list;
                                                                    if (list != null) break block31;
                                                                    if (5614464919154503228L == l2) break block32;
                                                                    object = list;
                                                                    if (-1580386065683472715L != l2) break block31;
                                                                }
                                                                object = object2.size();
                                                            }
                                                            return object;
                                                        }
                                                        object = this.j(object2.getClass());
                                                        if (object != null) {
                                                            try {
                                                                object = ((com.github.catvod.spider.merge.D.M)object).l(object2, (String)((Object)list), l2);
                                                                return object;
                                                            }
                                                            catch (Exception exception) {
                                                                throw new O(z.b(com.github.catvod.spider.merge.C.a.c("jsonpath error, path "), this.a, ", segement ", (String)((Object)list)), exception);
                                                            }
                                                        }
                                                        boolean bl = object2 instanceof List;
                                                        int n3 = 0;
                                                        if (!bl) break block33;
                                                        list2 = (List)object2;
                                                        if (5614464919154503228L == l2) break block34;
                                                        object = object3;
                                                        if (-1580386065683472715L == l2) break block34;
                                                        for (n2 = 0; n2 < list2.size(); ++n2) {
                                                            block38: {
                                                                block36: {
                                                                    Object object4;
                                                                    block39: {
                                                                        block37: {
                                                                            block35: {
                                                                                object4 = list2.get(n2);
                                                                                if (object4 != list2) break block35;
                                                                                object2 = object;
                                                                                object3 = object4;
                                                                                if (object == null) {
                                                                                    object2 = new b(list2.size());
                                                                                    object3 = object4;
                                                                                }
                                                                                break block36;
                                                                            }
                                                                            if (!((object4 = this.k(object4, (String)((Object)list), l2)) instanceof Collection)) break block37;
                                                                            object3 = (Collection)object4;
                                                                            object2 = object;
                                                                            if (object == null) {
                                                                                object2 = new b(list2.size());
                                                                            }
                                                                            ((b)object2).addAll((Collection<?>)object3);
                                                                            break block38;
                                                                        }
                                                                        if (object4 != null) break block39;
                                                                        object2 = object;
                                                                        if (this.e) break block38;
                                                                    }
                                                                    object2 = object;
                                                                    object3 = object4;
                                                                    if (object == null) {
                                                                        object2 = new b(list2.size());
                                                                        object3 = object4;
                                                                    }
                                                                }
                                                                ((b)object2).add(object3);
                                                            }
                                                            object = object2;
                                                        }
                                                        list = object;
                                                        if (object == null) {
                                                            list = Collections.emptyList();
                                                        }
                                                        return list;
                                                    }
                                                    n2 = list2.size();
                                                    break block40;
                                                }
                                                if (!(object2 instanceof Object[])) break block41;
                                                object3 = (Object[])object2;
                                                if (5614464919154503228L != l2 && -1580386065683472715L != l2) {
                                                    b b2 = new b(((Object[])object3).length);
                                                    for (n2 = n3; n2 < ((Object[])object3).length; ++n2) {
                                                        object = object3[n2];
                                                        if (object != object3) {
                                                            object2 = this.k(object, (String)((Object)list), l2);
                                                            if (object2 instanceof Collection) {
                                                                b2.addAll((Collection<?>)((Collection)object2));
                                                                continue;
                                                            }
                                                            object = object2;
                                                            if (object2 == null) {
                                                                if (this.e) continue;
                                                                object = object2;
                                                            }
                                                        }
                                                        b2.add(object);
                                                    }
                                                    return b2;
                                                }
                                                n2 = ((Object[])object3).length;
                                                break block40;
                                            }
                                            if (!(object2 instanceof Enum)) break block42;
                                            object = (Enum)object2;
                                            if (-4270347329889690746L == l2) {
                                                return ((Enum)object).name();
                                            }
                                            if (-1014497654951707614L != l2) break block42;
                                            n2 = ((Enum)object).ordinal();
                                            break block40;
                                        }
                                        if (!(object2 instanceof Calendar)) break block43;
                                        object = (Calendar)object2;
                                        if (8963398325558730460L != l2) break block44;
                                        n2 = 1;
                                        break block45;
                                    }
                                    if (-811277319855450459L != l2) break block46;
                                    n2 = 2;
                                    break block45;
                                }
                                if (-3851359326990528739L != l2) break block47;
                                n2 = 5;
                                break block45;
                            }
                            if (4647432019745535567L != l2) break block48;
                            n2 = 11;
                            break block45;
                        }
                        if (6607618197526598121L != l2) break block49;
                        n2 = 12;
                        break block45;
                    }
                    if (-6586085717218287427L != l2) break block43;
                    n2 = 13;
                }
                n2 = ((Calendar)object).get(n2);
            }
            return n2;
        }
        return null;
    }

    protected final Collection<Object> l(Object list) {
        if (list == null) {
            return null;
        }
        Object object = this.j(list.getClass());
        if (object != null) {
            try {
                list = ((com.github.catvod.spider.merge.D.M)object).m(list);
                return list;
            }
            catch (Exception exception) {
                object = com.github.catvod.spider.merge.C.a.c("jsonpath error, path ");
                ((StringBuilder)object).append(this.a);
                throw new O(((StringBuilder)object).toString(), exception);
            }
        }
        if (list instanceof Map) {
            return ((Map)((Object)list)).values();
        }
        if (list instanceof Collection) {
            return list;
        }
        throw new UnsupportedOperationException();
    }

    protected final void m() {
        if (this.b != null) {
            return;
        }
        if ("*".equals(this.a)) {
            this.b = new G[]{M.b};
        } else {
            q q2 = new q(this.a);
            this.b = q2.c();
            q.b(q2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean o() {
        int n2;
        boolean bl = false;
        try {
            this.m();
            n2 = 0;
        }
        catch (O o2) {
            return bl;
        }
        while (true) {
            Object object = this.b;
            if (n2 >= ((G[])object).length) return true;
            if ((object = object[n2].getClass()) != g.class) {
                if (object != B.class) return false;
            }
            ++n2;
            continue;
            break;
        }
    }
}

