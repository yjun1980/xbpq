package com.github.catvod.spider.merge.A0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.q0.b;
import com.github.catvod.spider.merge.r.EnumC0227a;
import com.github.catvod.spider.merge.r.EnumC0228b;
import com.github.catvod.spider.merge.r.InterfaceC0229c;
import com.github.catvod.spider.merge.s.C0232b;
import com.github.catvod.spider.merge.v.C0237a;
import com.github.catvod.spider.merge.w.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements InterfaceC0229c {
    public static List b(List list) {
        if (list == null) {
            return null;
        }
        List<String> e = b.e();
        if (e.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.github.catvod.spider.merge.u0.a) {
                if (!e.contains(((com.github.catvod.spider.merge.u0.a) obj).a())) {
                    arrayList.add(obj);
                }
            } else if (obj instanceof Map) {
                Map c = c((Map) obj);
                if (c != null && c.size() != 0) {
                    arrayList.add(obj);
                }
            } else {
                if (obj instanceof JsonObject) {
                    JsonObject jsonObject = (JsonObject) obj;
                    if (jsonObject == null) {
                        jsonObject = null;
                    } else {
                        List<String> e2 = b.e();
                        if (!e2.isEmpty()) {
                            JsonObject jsonObject2 = new JsonObject();
                            for (Map.Entry entry : jsonObject.entrySet()) {
                                String str = (String) entry.getKey();
                                if (!e2.contains(str)) {
                                    jsonObject2.add(str, (JsonElement) entry.getValue());
                                }
                            }
                            jsonObject = jsonObject2;
                        }
                    }
                    if (jsonObject != null && jsonObject.size() != 0) {
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Map c(Map map) {
        if (map == null) {
            return null;
        }
        List<String> e = b.e();
        if (e.isEmpty()) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String obj = entry.getKey().toString();
            if (!e.contains(obj)) {
                linkedHashMap.put(obj, entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // com.github.catvod.spider.merge.r.InterfaceC0229c
    public C0232b a(String str, EnumC0227a enumC0227a, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(cYh.d("213F343F337A023D31252E7A043F2F2532341323"));
        }
        if (i >= 0 && i2 >= 0) {
            EnumC0228b enumC0228b = EnumC0228b.c;
            int c = map.containsKey(enumC0228b) ? C0237a.c(map.get(enumC0228b).toString()) : 1;
            EnumC0228b enumC0228b2 = EnumC0228b.h;
            int parseInt = map.containsKey(enumC0228b2) ? Integer.parseInt(map.get(enumC0228b2).toString()) : 4;
            com.github.catvod.spider.merge.w.b a = c.c(str, c, map).a();
            if (a == null) {
                throw new IllegalStateException();
            }
            int e = a.e();
            int d = a.d();
            int i3 = parseInt << 1;
            int i4 = e + i3;
            int i5 = i3 + d;
            int max = Math.max(i, i4);
            int max2 = Math.max(i2, i5);
            int min = Math.min(max / i4, max2 / i5);
            int i6 = (max - (e * min)) / 2;
            int i7 = (max2 - (d * min)) / 2;
            C0232b c0232b = new C0232b(max, max2);
            int i8 = 0;
            while (i8 < d) {
                int i9 = i6;
                int i10 = 0;
                while (i10 < e) {
                    if (a.b(i10, i8) == 1) {
                        c0232b.d(i9, i7, min, min);
                    }
                    i10++;
                    i9 += min;
                }
                i8++;
                i7 += min;
            }
            return c0232b;
        }
        throw new IllegalArgumentException(cYh.d("3535302432291335257133330A352F223E3509236130253F47242E3E77290A312D3D6D7A") + i + 'x' + i2);
    }
}
