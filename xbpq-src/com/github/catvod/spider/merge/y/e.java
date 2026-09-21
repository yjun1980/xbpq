/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.d;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class e
extends a
implements Map<String, Object>,
Cloneable,
Serializable,
InvocationHandler {
    private final Map<String, Object> i;

    public e() {
        this(16, false);
    }

    public e(int n2, boolean bl) {
        HashMap hashMap = bl ? new LinkedHashMap(n2) : new HashMap(n2);
        this.i = hashMap;
    }

    public e(Map<String, Object> map) {
        if (map != null) {
            this.i = map;
            return;
        }
        throw new IllegalArgumentException("map is null.");
    }

    public e(boolean bl) {
        this(16, bl);
    }

    @Override
    public final void clear() {
        this.i.clear();
    }

    public final Object clone() {
        HashMap hashMap = this.i instanceof LinkedHashMap ? new LinkedHashMap<String, Object>(this.i) : new HashMap<String, Object>(this.i);
        return new e(hashMap);
    }

    @Override
    public final boolean containsKey(Object object) {
        boolean bl;
        block2: {
            block3: {
                boolean bl2;
                bl = bl2 = this.i.containsKey(object);
                if (bl2) break block2;
                if (object instanceof Number || object instanceof Character || object instanceof Boolean) break block3;
                bl = bl2;
                if (!(object instanceof UUID)) break block2;
            }
            bl = this.i.containsKey(object.toString());
        }
        return bl;
    }

    @Override
    public final boolean containsValue(Object object) {
        return this.i.containsValue(object);
    }

    @Override
    public final Set<Map.Entry<String, Object>> entrySet() {
        return this.i.entrySet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object map) {
        Map<String, Object> map2;
        if (this == map) {
            return true;
        }
        if (map instanceof e) {
            map2 = this.i;
            map = ((e)map).i;
            return map2.equals(map);
        }
        map2 = this.i;
        return map2.equals(map);
    }

    @Override
    public final Object get(Object object) {
        Object object2;
        block2: {
            block3: {
                Object object3;
                object2 = object3 = this.i.get(object);
                if (object3 != null) break block2;
                if (object instanceof Number || object instanceof Character || object instanceof Boolean) break block3;
                object2 = object3;
                if (!(object instanceof UUID)) break block2;
            }
            object2 = this.i.get(object.toString());
        }
        return object2;
    }

    @Override
    public final Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            object2 = object;
        }
        return object2;
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object invoke(Object object, Method object2, Object[] object3) {
        object = ((Method)object2).getParameterTypes();
        int n2 = ((Object)object).length;
        Object object4 = null;
        if (n2 == 1) {
            if (((Method)object2).getName().equals("equals")) {
                return this.equals(object3[0]);
            }
            if (((Method)object2).getReturnType() != Void.TYPE) throw new d("illegal setter");
            object = A.F((Method)object2, com.github.catvod.spider.merge.z.b.class);
            object = object != null && object.name().length() != 0 ? object.name() : null;
            object4 = object;
            if (object == null) {
                object = ((Method)object2).getName();
                if (!((String)object).startsWith("set")) throw new d("illegal setter");
                if (((String)(object = ((String)object).substring(3))).length() == 0) throw new d("illegal setter");
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(Character.toLowerCase(((String)object).charAt(0)));
                ((StringBuilder)object2).append(((String)object).substring(1));
                object4 = ((StringBuilder)object2).toString();
            }
            this.i.put((String)object4, object3[0]);
            return null;
        }
        if (((Object)object).length != 0) throw new UnsupportedOperationException(((Method)object2).toGenericString());
        if (((Method)object2).getReturnType() == Void.TYPE) throw new d("illegal getter");
        object3 = A.F((Method)object2, com.github.catvod.spider.merge.z.b.class);
        object = object4;
        if (object3 != null) {
            object = object4;
            if (object3.name().length() != 0) {
                object = object3.name();
            }
        }
        object3 = object;
        if (object != null) return A.f(this.i.get(object3), ((Method)object2).getGenericReturnType(), o.v);
        object = ((Method)object2).getName();
        if (((String)object).startsWith("get")) {
            object3 = ((String)object).substring(3);
            if (((String)object3).length() == 0) throw new d("illegal getter");
            object = new StringBuilder();
        } else {
            if (!((String)object).startsWith("is")) {
                if (((String)object).startsWith("hashCode")) {
                    return this.hashCode();
                }
                if (!((String)object).startsWith("toString")) throw new d("illegal getter");
                return this.a();
            }
            object3 = ((String)object).substring(2);
            if (((String)object3).length() == 0) throw new d("illegal getter");
            object = new StringBuilder();
        }
        ((StringBuilder)object).append(Character.toLowerCase(((String)object3).charAt(0)));
        ((StringBuilder)object).append(((String)object3).substring(1));
        object3 = ((StringBuilder)object).toString();
        return A.f(this.i.get(object3), ((Method)object2).getGenericReturnType(), o.v);
    }

    @Override
    public final boolean isEmpty() {
        return this.i.isEmpty();
    }

    @Override
    public final Set<String> keySet() {
        return this.i.keySet();
    }

    public final e o(String string, Object object) {
        this.i.put(string, object);
        return this;
    }

    public final boolean p(String object) {
        if ((object = A.i(this.get(object))) == null) {
            return false;
        }
        return (Boolean)object;
    }

    @Override
    public final void putAll(Map<? extends String, ?> map) {
        this.i.putAll(map);
    }

    public final Map<String, Object> q() {
        return this.i;
    }

    public final int r(String object) {
        if ((object = A.o(this.get(object))) == null) {
            return 0;
        }
        return (Integer)object;
    }

    @Override
    public final Object remove(Object object) {
        return this.i.remove(object);
    }

    public final Integer s(String string) {
        return A.o(this.get(string));
    }

    @Override
    public final int size() {
        return this.i.size();
    }

    public final b t(String object) {
        if ((object = this.i.get(object)) instanceof b) {
            return (b)object;
        }
        if (object instanceof List) {
            return new b((List)object);
        }
        object = object instanceof String ? com.github.catvod.spider.merge.y.a.f((String)object) : com.github.catvod.spider.merge.y.a.k(object);
        return (b)object;
    }

    public final e u(String object) {
        if ((object = this.i.get(object)) instanceof e) {
            return (e)object;
        }
        if (object instanceof Map) {
            return new e((Map)object);
        }
        if (object instanceof String) {
            return com.github.catvod.spider.merge.y.a.i((String)object);
        }
        return (e)com.github.catvod.spider.merge.y.a.k(object);
    }

    public final Long v(String string) {
        return A.q(this.get(string));
    }

    @Override
    public final Collection<Object> values() {
        return this.i.values();
    }

    public final long w(String object) {
        if ((object = A.q(this.get(object))) == null) {
            return 0L;
        }
        return (Long)object;
    }

    public final String x(String object) {
        if ((object = this.get(object)) == null) {
            return null;
        }
        return object.toString();
    }

    public final Object y(String string, Object object) {
        return this.i.put(string, object);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public final Object z(Class clazz, o o2) {
        if (clazz == Map.class) {
            return this;
        }
        if (clazz == Object.class && !this.containsKey(com.github.catvod.spider.merge.y.a.c)) {
            return this;
        }
        return A.p(this, clazz, o2);
    }
}

