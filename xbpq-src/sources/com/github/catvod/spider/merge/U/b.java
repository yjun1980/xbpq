package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.cYh;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    private static final Map<String, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b;
    private static final Map<Class<?>, Class<?>> c;
    private static final Map<String, String> d;
    public static final /* synthetic */ int e = 0;

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map<java.lang.Class<?>, java.lang.Class<?>>, java.util.HashMap] */
    static {
        String.valueOf('.');
        String.valueOf('$');
        HashMap hashMap = new HashMap();
        a = hashMap;
        Class cls = Boolean.TYPE;
        String d2 = cYh.d("053F2E3D323B09");
        hashMap.put(d2, cls);
        Class cls2 = Byte.TYPE;
        String d3 = cYh.d("05293534");
        hashMap.put(d3, cls2);
        Class cls3 = Character.TYPE;
        String d4 = cYh.d("04382023");
        hashMap.put(d4, cls3);
        Class cls4 = Short.TYPE;
        String d5 = cYh.d("14382E2323");
        hashMap.put(d5, cls4);
        Class cls5 = Integer.TYPE;
        String d6 = cYh.d("0E3E35");
        hashMap.put(d6, cls5);
        Class cls6 = Long.TYPE;
        String d7 = cYh.d("0B3F2F36");
        hashMap.put(d7, cls6);
        Class cls7 = Double.TYPE;
        String d8 = cYh.d("033F34333B3F");
        hashMap.put(d8, cls7);
        Class cls8 = Float.TYPE;
        String d9 = cYh.d("013C2E3023");
        hashMap.put(d9, cls8);
        hashMap.put(cYh.d("113F2835"), Void.TYPE);
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap2.put(cls, Boolean.class);
        hashMap2.put(Byte.TYPE, Byte.class);
        hashMap2.put(Character.TYPE, Character.class);
        hashMap2.put(Short.TYPE, Short.class);
        hashMap2.put(cls5, Integer.class);
        hashMap2.put(cls6, Long.class);
        hashMap2.put(Double.TYPE, Double.class);
        hashMap2.put(cls8, Float.class);
        Class cls9 = Void.TYPE;
        hashMap2.put(cls9, cls9);
        c = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            Class cls10 = (Class) entry.getKey();
            Class cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                c.put(cls11, cls10);
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put(d6, cYh.d("2E"));
        hashMap3.put(d2, cYh.d("3D"));
        hashMap3.put(d9, cYh.d("21"));
        hashMap3.put(d7, cYh.d("2D"));
        hashMap3.put(d5, cYh.d("34"));
        hashMap3.put(d3, cYh.d("25"));
        hashMap3.put(d8, cYh.d("23"));
        hashMap3.put(d4, cYh.d("24"));
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            hashMap4.put(entry2.getValue(), entry2.getKey());
        }
        Collections.unmodifiableMap(hashMap3);
        d = Collections.unmodifiableMap(hashMap4);
    }

    public static String a(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (h.c(name)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (name.startsWith(cYh.d("3C"))) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                sb.append(cYh.d("3C0D"));
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
            Map<String, String> map = d;
            if (map.containsKey(name)) {
                name = map.get(name);
            }
        }
        int lastIndexOf = name.lastIndexOf(46);
        int indexOf = name.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        String substring = name.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }
}
