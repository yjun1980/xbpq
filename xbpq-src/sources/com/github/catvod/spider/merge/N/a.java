package com.github.catvod.spider.merge.N;

import android.graphics.Bitmap;
import android.util.Base64;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.E;
import com.github.catvod.spider.merge.j.o;
import com.github.catvod.spider.merge.k.C0164g;
import com.github.catvod.spider.merge.r.EnumC0227a;
import com.github.catvod.spider.merge.r.EnumC0228b;
import com.github.catvod.spider.merge.s.C0232b;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public static void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static int b(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static Bitmap c(String str) {
        try {
            EnumMap enumMap = new EnumMap(EnumC0228b.class);
            enumMap.put((EnumMap) EnumC0228b.d, (EnumC0228b) cYh.d("3204077C6F"));
            enumMap.put((EnumMap) EnumC0228b.h, (EnumC0228b) 2);
            C0232b a = new com.github.catvod.spider.merge.A0.a().a(str, EnumC0227a.l, o.a(240), o.a(240), enumMap);
            int c = a.c();
            int b = a.b();
            int[] iArr = new int[c * b];
            for (int i = 0; i < b; i++) {
                int i2 = i * c;
                for (int i3 = 0; i3 < c; i3++) {
                    iArr[i2 + i3] = a.a(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(c, b, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, c, 0, 0, c, b);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void e(boolean z) {
        if (z) {
            throw new IllegalArgumentException(cYh.d("2A2532257738027027303B2902"));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalArgumentException(cYh.d("2A253225773802703523223F"));
        }
    }

    public static String g(LinkedHashMap linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        for (String str : linkedHashMap.keySet()) {
            JSONArray jSONArray2 = new JSONArray();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) linkedHashMap.get(str);
            if (!linkedHashMap2.isEmpty()) {
                for (String str2 : linkedHashMap2.keySet()) {
                    ArrayList arrayList = (ArrayList) linkedHashMap2.get(str2);
                    if (!arrayList.isEmpty()) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (int i = 0; i < arrayList.size(); i++) {
                            jSONArray3.put(arrayList.get(i));
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(cYh.d("09312C34"), str2);
                            jSONObject.put(cYh.d("12222D22"), jSONArray3);
                        } catch (JSONException unused) {
                        }
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(cYh.d("00222E2427"), str);
                    jSONObject2.put(cYh.d("0438203F393F0B23"), jSONArray2);
                } catch (JSONException unused2) {
                }
                jSONArray.put(jSONObject2);
            }
        }
        return jSONArray.toString();
    }

    public static Object[] h(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean contains = str.contains(cYh.d("49322C21"));
            String g = C0164g.g(str, null);
            if (contains) {
                m(linkedHashMap, new String(Base64.decode(g.split(cYh.d("3B7A1D7B"))[1], 0)));
            } else {
                m(linkedHashMap, g);
            }
            return new Object[]{200, cYh.d("13353925782A0B31283F6C7A04382023243F136D342531775F"), new ByteArrayInputStream(g(linkedHashMap).getBytes(cYh.d("3204077C6F")))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void i(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(cYh.d("34243338393D473D3422237A093F3571353F47352C212323"));
        }
    }

    public static void j(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(cYh.d("28322B34342E473D3422237A093F3571353F473E343D3B"));
        }
    }

    public static com.github.catvod.spider.merge.c0.h l(String str) {
        return E.c(str);
    }

    public static void m(LinkedHashMap linkedHashMap, String str) {
        ArrayList arrayList;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                if (!readLine.trim().isEmpty()) {
                    String[] split = readLine.split(cYh.d("4B"));
                    if (split.length >= 2) {
                        if (readLine.contains(cYh.d("4437243F253F44"))) {
                            String trim = split[0].trim();
                            if (linkedHashMap.containsKey(trim)) {
                                linkedHashMap3 = (LinkedHashMap) linkedHashMap.get(trim);
                            } else {
                                linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap.put(trim, linkedHashMap3);
                            }
                        } else {
                            String trim2 = split[0].trim();
                            for (String str2 : split[1].trim().split(cYh.d("44"))) {
                                String trim3 = str2.trim();
                                if (!trim3.isEmpty() && (trim3.startsWith(cYh.d("0F243521")) || trim3.startsWith(cYh.d("15243221")) || trim3.startsWith(cYh.d("15242C21")))) {
                                    if (linkedHashMap3.containsKey(trim2)) {
                                        arrayList = (ArrayList) linkedHashMap3.get(trim2);
                                    } else {
                                        arrayList = new ArrayList();
                                        linkedHashMap3.put(trim2, arrayList);
                                    }
                                    if (!arrayList.contains(trim3)) {
                                        arrayList.add(trim3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bufferedReader.close();
            if (linkedHashMap2.isEmpty()) {
                return;
            }
            linkedHashMap.put(cYh.d("81CCEBB4DFDC80EBC5"), linkedHashMap2);
        } catch (Throwable unused) {
        }
    }

    public static int o(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int p(int i, Object obj) {
        return o(i, obj != null ? obj.hashCode() : 0);
    }

    public boolean d() {
        throw null;
    }

    public Object n() {
        throw null;
    }
}
