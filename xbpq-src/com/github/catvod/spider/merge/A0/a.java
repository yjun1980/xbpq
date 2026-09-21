/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.A0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.r.b;
import com.github.catvod.spider.merge.r.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a
implements c {
    public static List b(List object) {
        if (object == null) {
            return null;
        }
        List<String> list = com.github.catvod.spider.merge.q0.b.e();
        if (list.isEmpty()) {
            return object;
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (e2 instanceof com.github.catvod.spider.merge.u0.a) {
                if (list.contains(((com.github.catvod.spider.merge.u0.a)e2).a())) {
                    continue;
                }
            } else if (e2 instanceof Map) {
                object = a.c((Map)e2);
                if (object == null || object.size() == 0) {
                    continue;
                }
            } else if (e2 instanceof JsonObject) {
                Object object2 = (JsonObject)e2;
                if (object2 == null) {
                    object = null;
                } else {
                    List<String> list2 = com.github.catvod.spider.merge.q0.b.e();
                    if (list2.isEmpty()) {
                        object = object2;
                    } else {
                        object = new JsonObject();
                        for (Map.Entry entry : object2.entrySet()) {
                            object2 = (String)entry.getKey();
                            if (list2.contains(object2)) continue;
                            object.add((String)object2, (JsonElement)entry.getValue());
                        }
                    }
                }
                if (object == null || object.size() == 0) continue;
            }
            arrayList.add(e2);
        }
        return arrayList;
    }

    public static Map c(Map entry2) {
        if (entry2 == null) {
            return null;
        }
        List<String> list = com.github.catvod.spider.merge.q0.b.e();
        if (list.isEmpty()) {
            return entry2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : entry2.entrySet()) {
            String string = entry2.getKey().toString();
            if (list.contains(string)) continue;
            linkedHashMap.put(string, entry2.getValue());
        }
        return linkedHashMap;
    }

    public com.github.catvod.spider.merge.s.b a(String object, com.github.catvod.spider.merge.r.a object2, int n2, int n3, Map map) {
        if (!((String)object).isEmpty()) {
            if (n2 >= 0 && n3 >= 0) {
                int n4 = 4;
                object2 = b.c;
                int n5 = map.containsKey(object2) ? com.github.catvod.spider.merge.v.a.c(map.get(object2).toString()) : 1;
                object2 = b.h;
                if (map.containsKey(object2)) {
                    n4 = Integer.parseInt(map.get(object2).toString());
                }
                if ((object2 = com.github.catvod.spider.merge.w.c.c((String)object, n5, map).a()) != null) {
                    int n6 = ((com.github.catvod.spider.merge.w.b)object2).e();
                    int n7 = ((com.github.catvod.spider.merge.w.b)object2).d();
                    n5 = n4 << 1;
                    n4 = n6 + n5;
                    int n8 = n5 + n7;
                    n5 = Math.max(n2, n4);
                    n3 = Math.max(n3, n8);
                    int n9 = Math.min(n5 / n4, n3 / n8);
                    n8 = (n5 - n6 * n9) / 2;
                    n2 = (n3 - n7 * n9) / 2;
                    object = new com.github.catvod.spider.merge.s.b(n5, n3);
                    n3 = 0;
                    while (n3 < n7) {
                        n5 = n8;
                        n4 = 0;
                        while (n4 < n6) {
                            if (((com.github.catvod.spider.merge.w.b)object2).b(n4, n3) == 1) {
                                ((com.github.catvod.spider.merge.s.b)object).d(n5, n2, n9, n9);
                            }
                            ++n4;
                            n5 += n9;
                        }
                        ++n3;
                        n2 += n9;
                    }
                    return object;
                }
                throw new IllegalStateException();
            }
            object = new StringBuilder(cYh.d("3535302432291335257133330A352F223E3509236130253F47242E3E77290A312D3D6D7A"));
            ((StringBuilder)object).append(n2);
            ((StringBuilder)object).append('x');
            ((StringBuilder)object).append(n3);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        object = new IllegalArgumentException(cYh.d("213F343F337A023D31252E7A043F2F2532341323"));
        throw object;
    }
}

