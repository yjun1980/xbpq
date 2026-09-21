/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.cYh;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class b {
    private static final Map<String, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b;
    private static final Map<Class<?>, Class<?>> c;
    private static final Map<String, String> d;
    public static final int e = 0;

    static {
        Object object = new HashMap();
        a = object;
        Class clazz = Boolean.TYPE;
        Object object2 = cYh.d("053F2E3D323B09");
        ((HashMap)object).put((String)object2, clazz);
        Iterator iterator = Byte.TYPE;
        String object32 = cYh.d("05293534");
        ((HashMap)object).put((String)object32, iterator);
        Object object3 = Character.TYPE;
        iterator = cYh.d("04382023");
        ((HashMap)object).put((String)((Object)iterator), object3);
        Object object4 = Short.TYPE;
        object3 = cYh.d("14382E2323");
        ((HashMap)object).put((String)object3, object4);
        Class<Integer> clazz2 = Integer.TYPE;
        object4 = cYh.d("0E3E35");
        ((HashMap)object).put((String)object4, clazz2);
        Class<Long> clazz3 = Long.TYPE;
        String string = cYh.d("0B3F2F36");
        ((HashMap)object).put((String)string, clazz3);
        Object object5 = Double.TYPE;
        String string2 = cYh.d("033F34333B3F");
        ((HashMap)object).put((String)string2, object5);
        Class<Float> clazz4 = Float.TYPE;
        object5 = cYh.d("013C2E3023");
        ((HashMap)object).put((String)object5, clazz4);
        Class<Void> clazz5 = Void.TYPE;
        ((HashMap)object).put((String)cYh.d("113F2835"), clazz5);
        object = new HashMap();
        b = object;
        ((HashMap)object).put(clazz, Boolean.class);
        ((HashMap)object).put(Byte.TYPE, Byte.class);
        ((HashMap)object).put(Character.TYPE, Character.class);
        ((HashMap)object).put(Short.TYPE, Short.class);
        ((HashMap)object).put(clazz2, Integer.class);
        ((HashMap)object).put(clazz3, Long.class);
        ((HashMap)object).put(Double.TYPE, Double.class);
        ((HashMap)object).put(clazz4, Float.class);
        clazz = Void.TYPE;
        ((HashMap)object).put(clazz, clazz);
        c = new HashMap();
        for (Map.Entry entry : ((HashMap)object).entrySet()) {
            Class clazz6;
            clazz = (Class)entry.getKey();
            if (clazz.equals(clazz6 = (Class)entry.getValue())) continue;
            ((HashMap)c).put(clazz6, clazz);
        }
        clazz = new HashMap();
        ((HashMap)((Object)clazz)).put(object4, cYh.d("2E"));
        ((HashMap)((Object)clazz)).put(object2, cYh.d("3D"));
        ((HashMap)((Object)clazz)).put(object5, cYh.d("21"));
        ((HashMap)((Object)clazz)).put(string, cYh.d("2D"));
        ((HashMap)((Object)clazz)).put(object3, cYh.d("34"));
        ((HashMap)((Object)clazz)).put(object32, cYh.d("25"));
        ((HashMap)((Object)clazz)).put(string2, cYh.d("23"));
        ((HashMap)((Object)clazz)).put(iterator, cYh.d("24"));
        object2 = new HashMap();
        for (Map.Entry entry : ((HashMap)((Object)clazz)).entrySet()) {
            ((HashMap)object2).put(entry.getValue(), entry.getKey());
        }
        Collections.unmodifiableMap(clazz);
        d = Collections.unmodifiableMap(object2);
    }

    public static String a(Class<?> object) {
        CharSequence charSequence = "";
        if (object == null) {
            return "";
        }
        Object object2 = ((Class)object).getName();
        if (h.c((CharSequence)object2)) {
            object = charSequence;
        } else {
            int n2;
            charSequence = new StringBuilder();
            boolean bl = ((String)object2).startsWith(cYh.d("3C"));
            int n3 = 0;
            object = object2;
            if (bl) {
                object = object2;
                while (((String)object).charAt(0) == '[') {
                    object = ((String)object).substring(1);
                    ((StringBuilder)charSequence).append(cYh.d("3C0D"));
                }
                object2 = object;
                if (((String)object).charAt(0) == 'L') {
                    object2 = object;
                    if (((String)object).charAt(((String)object).length() - 1) == ';') {
                        object2 = ((String)object).substring(1, ((String)object).length() - 1);
                    }
                }
                Map<String, String> map = d;
                object = object2;
                if (map.containsKey(object2)) {
                    object = map.get(object2);
                }
            }
            if ((n2 = ((String)object).lastIndexOf(46)) != -1) {
                n3 = n2 + 1;
            }
            n3 = ((String)object).indexOf(36, n3);
            object = object2 = ((String)object).substring(n2 + 1);
            if (n3 != -1) {
                object = ((String)object2).replace('$', '.');
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append((Object)charSequence);
            object = ((StringBuilder)object2).toString();
        }
        return object;
    }
}

