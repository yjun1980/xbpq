/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Dw.p;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class o {
    private static final Map<String, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b;
    private static final Map<Class<?>, Class<?>> c;
    private static final Map<String, String> d;
    public static final int e = 0;

    static {
        HashMap<String, Class<Object>> hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = Boolean.TYPE;
        hashMap.put("boolean", (Class<Object>)((Object)hashMap2));
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        hashMap.put("short", Short.TYPE);
        Serializable serializable = Integer.TYPE;
        hashMap.put("int", (Class<Object>)serializable);
        Class<Long> object2 = Long.TYPE;
        hashMap.put("long", object2);
        hashMap.put("double", Double.TYPE);
        Class<Float> clazz = Float.TYPE;
        hashMap.put("float", clazz);
        hashMap.put("void", Void.TYPE);
        hashMap = new HashMap();
        b = hashMap;
        hashMap.put((String)((Object)hashMap2), (Class<Object>)Boolean.class);
        hashMap.put((String)((Object)Byte.TYPE), (Class<Object>)Byte.class);
        hashMap.put((String)((Object)Character.TYPE), (Class<Object>)Character.class);
        hashMap.put((String)((Object)Short.TYPE), (Class<Object>)Short.class);
        hashMap.put((String)((Object)serializable), (Class<Object>)Integer.class);
        hashMap.put((String)((Object)object2), (Class<Object>)Long.class);
        hashMap.put((String)((Object)Double.TYPE), (Class<Object>)Double.class);
        hashMap.put((String)((Object)clazz), (Class<Object>)Float.class);
        hashMap2 = Void.TYPE;
        hashMap.put((String)((Object)hashMap2), (Class<Object>)((Object)hashMap2));
        c = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            Class clazz2;
            Class clazz3 = (Class)entry.getKey();
            if (clazz3.equals(clazz2 = (Class)entry.getValue())) continue;
            ((HashMap)c).put(clazz2, clazz3);
        }
        serializable = new HashMap();
        ((HashMap)serializable).put("int", "I");
        ((HashMap)serializable).put("boolean", "Z");
        ((HashMap)serializable).put("float", "F");
        ((HashMap)serializable).put("long", "J");
        ((HashMap)serializable).put("short", "S");
        ((HashMap)serializable).put("byte", "B");
        ((HashMap)serializable).put("double", "D");
        ((HashMap)serializable).put("char", "C");
        hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap)serializable).entrySet()) {
            hashMap2.put(entry.getValue(), entry.getKey());
        }
        Collections.unmodifiableMap(serializable);
        d = Collections.unmodifiableMap(hashMap2);
    }

    public static String a(Class<?> object) {
        Object object2 = "";
        if (object == null) {
            return "";
        }
        if (p.c((CharSequence)(object = ((Class)object).getName()))) {
            object = object2;
        } else {
            int n2;
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl = ((String)object).startsWith("[");
            int n3 = 0;
            object2 = object;
            if (bl) {
                object2 = object;
                while (((String)object2).charAt(0) == '[') {
                    object2 = ((String)object2).substring(1);
                    stringBuilder.append("[]");
                }
                object = object2;
                if (((String)object2).charAt(0) == 'L') {
                    object = object2;
                    if (((String)object2).charAt(((String)object2).length() - 1) == ';') {
                        object = ((String)object2).substring(1, ((String)object2).length() - 1);
                    }
                }
                Map<String, String> map = d;
                object2 = object;
                if (map.containsKey(object)) {
                    object2 = map.get(object);
                }
            }
            if ((n2 = ((String)object2).lastIndexOf(46)) != -1) {
                n3 = n2 + 1;
            }
            n3 = ((String)object2).indexOf(36, n3);
            object = object2 = ((String)object2).substring(n2 + 1);
            if (n3 != -1) {
                object = ((String)object2).replace('$', '.');
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append((Object)stringBuilder);
            object = ((StringBuilder)object2).toString();
        }
        return object;
    }
}

