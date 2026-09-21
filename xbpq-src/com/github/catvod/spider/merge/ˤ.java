/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02d1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class \u02e4 {
    public static final String \u037f = String.valueOf('.');
    public static final String \u0528 = String.valueOf('$');
    private static final Map<String, Class<?>> \u0529;
    private static final Map<Class<?>, Class<?>> \u052a;
    private static final Map<Class<?>, Class<?>> \u052b;
    private static final Map<String, String> \u052c;
    private static final Map<String, String> \u052d;

    static {
        Object object = new HashMap();
        \u0529 = object;
        Class clazz = Boolean.TYPE;
        String string = SOY.d("183D3E1A111614");
        object.put((String)string, clazz);
        Class<Byte> object22 = Byte.TYPE;
        Object object2 = SOY.d("182B2513");
        object.put((String)object2, object22);
        Object object3 = Character.TYPE;
        String string2 = SOY.d("193A3004");
        object.put((String)string2, object3);
        Object object4 = Short.TYPE;
        object3 = SOY.d("093A3E0400");
        object.put((String)object3, object4);
        Class<Integer> clazz2 = Integer.TYPE;
        String string3 = SOY.d("133C25");
        object.put((String)string3, clazz2);
        Class<Long> clazz3 = Long.TYPE;
        object4 = SOY.d("163D3F11");
        object.put((String)object4, clazz3);
        Object object5 = Double.TYPE;
        String string4 = SOY.d("1E3D24141812");
        object.put((String)string4, object5);
        Class<Float> clazz4 = Float.TYPE;
        object5 = SOY.d("1C3E3E1700");
        object.put((String)object5, clazz4);
        Class<Void> clazz5 = Void.TYPE;
        object.put((String)SOY.d("0C3D3812"), clazz5);
        object = new HashMap();
        \u052a = object;
        object.put(clazz, Boolean.class);
        object.put(Byte.TYPE, Byte.class);
        object.put(Character.TYPE, Character.class);
        object.put(Short.TYPE, Short.class);
        object.put(clazz2, Integer.class);
        object.put(clazz3, Long.class);
        object.put(Double.TYPE, Double.class);
        object.put(clazz4, Float.class);
        clazz = Void.TYPE;
        object.put(clazz, clazz);
        \u052b = new HashMap();
        for (Map.Entry entry : object.entrySet()) {
            Class clazz6;
            clazz = (Class)entry.getKey();
            if (clazz.equals(clazz6 = (Class)entry.getValue())) continue;
            \u052b.put(clazz6, clazz);
        }
        clazz = new HashMap();
        clazz.put(string3, SOY.d("33"));
        clazz.put(string, SOY.d("20"));
        clazz.put(object5, SOY.d("3C"));
        clazz.put(object4, SOY.d("30"));
        clazz.put(object3, SOY.d("29"));
        clazz.put(object2, SOY.d("38"));
        clazz.put(string4, SOY.d("3E"));
        clazz.put(string2, SOY.d("39"));
        object2 = new HashMap();
        for (Map.Entry entry : clazz.entrySet()) {
            object2.put(entry.getValue(), entry.getKey());
        }
        \u052c = Collections.unmodifiableMap(clazz);
        \u052d = Collections.unmodifiableMap(object2);
    }

    public static String \u037f(Class<?> clazz) {
        if (clazz == null) {
            return "";
        }
        return \u02e4.\u0529(clazz.getName());
    }

    public static String \u0528(Object object, String string) {
        if (object == null) {
            return string;
        }
        return \u02e4.\u037f(object.getClass());
    }

    public static String \u0529(String string) {
        int n2;
        if (\u02d1.\u058f(string)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = string.startsWith(SOY.d("21"));
        int n3 = 0;
        CharSequence charSequence = string;
        if (bl) {
            charSequence = string;
            while (((String)charSequence).charAt(0) == '[') {
                charSequence = ((String)charSequence).substring(1);
                stringBuilder.append(SOY.d("210F"));
            }
            string = charSequence;
            if (((String)charSequence).charAt(0) == 'L') {
                string = charSequence;
                if (((String)charSequence).charAt(((String)charSequence).length() - 1) == ';') {
                    string = ((String)charSequence).substring(1, ((String)charSequence).length() - 1);
                }
            }
            Map<String, String> map = \u052d;
            charSequence = string;
            if (map.containsKey(string)) {
                charSequence = map.get(string);
            }
        }
        if ((n2 = ((String)charSequence).lastIndexOf(46)) != -1) {
            n3 = n2 + 1;
        }
        n3 = ((String)charSequence).indexOf(36, n3);
        charSequence = ((String)charSequence).substring(n2 + 1);
        string = charSequence;
        if (n3 != -1) {
            string = ((String)charSequence).replace('$', '.');
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append((Object)stringBuilder);
        return ((StringBuilder)charSequence).toString();
    }
}

