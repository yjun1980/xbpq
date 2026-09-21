/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.N;

import android.graphics.Bitmap;
import android.util.Base64;
import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.E;
import com.github.catvod.spider.merge.j.o;
import com.github.catvod.spider.merge.k.g;
import com.github.catvod.spider.merge.r.b;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static void a(String string) {
        throw new IllegalArgumentException(string);
    }

    public static int b(int n2, int n3) {
        n2 ^= n3 * 4;
        n2 = (n2 ^ n2 >>> 16) * -2048144789;
        n2 = (n2 ^ n2 >>> 13) * -1028477387;
        return n2 ^ n2 >>> 16;
    }

    public static Bitmap c(String object) {
        EnumMap enumMap = new EnumMap(b.class);
        enumMap.put((Object)b.d, cYh.d("3204077C6F"));
        enumMap.put((Object)b.h, (Object)2);
        int n2 = o.a(240);
        int n3 = o.a(240);
        com.github.catvod.spider.merge.r.a a2 = com.github.catvod.spider.merge.r.a.l;
        Object object2 = new com.github.catvod.spider.merge.A0.a();
        object2 = object2.a((String)object, a2, n2, n3, enumMap);
        int n4 = ((com.github.catvod.spider.merge.s.b)object2).c();
        int n5 = ((com.github.catvod.spider.merge.s.b)object2).b();
        object = new int[n4 * n5];
        for (n2 = 0; n2 < n5; ++n2) {
            for (n3 = 0; n3 < n4; ++n3) {
                int n6 = ((com.github.catvod.spider.merge.s.b)object2).a(n3, n2) ? -16777216 : -1;
                object[n2 * n4 + n3] = n6;
            }
        }
        try {
            object2 = Bitmap.createBitmap((int)n4, (int)n5, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            object2.setPixels((int[])object, 0, n4, 0, 0, n4, n5);
            return object2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void e(boolean bl) {
        if (!bl) {
            return;
        }
        throw new IllegalArgumentException(cYh.d("2A2532257738027027303B2902"));
    }

    public static void f(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(cYh.d("2A253225773802703523223F"));
    }

    /*
     * Unable to fully structure code
     */
    public static String g(LinkedHashMap var0) {
        var2_1 = new JSONArray();
        block4: for (String var5_6 : var0.keySet()) {
            var4_4 = new JSONArray();
            var6_7 = (LinkedHashMap)var0.get(var5_6);
            if (var6_7.isEmpty()) continue;
            block5: for (String var8_9 : var6_7.keySet()) {
                var9_11 = (ArrayList)var6_7.get(var8_9);
                if (var9_11.isEmpty()) continue;
                var10_12 = new JSONArray();
                for (var1_3 = 0; var1_3 < var9_11.size(); ++var1_3) {
                    var10_12.put(var9_11.get(var1_3));
                }
                var9_11 = new JSONObject();
                var9_11.put(cYh.d("09312C34"), var8_9);
                var9_11.put(cYh.d("12222D22"), var10_12);
lbl20:
                // 2 sources

                while (true) {
                    var4_4.put((Object)var9_11);
                    continue block5;
                    break;
                }
            }
            var6_7 = new JSONObject();
            var6_7.put(cYh.d("00222E2427"), var5_6);
            var6_7.put(cYh.d("0438203F393F0B23"), var4_4);
lbl30:
            // 2 sources

            while (true) {
                var2_1.put((Object)var6_7);
                continue block4;
                break;
            }
        }
        return var2_1.toString();
        catch (JSONException var8_10) {
            ** continue;
        }
        catch (JSONException var4_5) {
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object[] h(String string) {
        try {
            Object object = new LinkedHashMap();
            boolean bl = string.contains(cYh.d("49322C21"));
            string = g.g(string, null);
            if (bl) {
                String[] stringArray = string.split(cYh.d("3B7A1D7B"));
                string = new String(Base64.decode((String)stringArray[1], (int)0));
                a.m((LinkedHashMap)object, string);
            } else {
                a.m(object, string);
            }
            object = a.g(object);
            string = cYh.d("13353925782A0B31283F6C7A04382023243F136D342531775F");
            object = new ByteArrayInputStream(((String)object).getBytes(cYh.d("3204077C6F")));
            return new Object[]{200, string, object};
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public static void i(String string) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new IllegalArgumentException(cYh.d("34243338393D473D3422237A093F3571353F47352C212323"));
    }

    public static void j(String string, String string2) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new IllegalArgumentException(string2);
    }

    public static void k(Object object) {
        if (object != null) {
            return;
        }
        throw new IllegalArgumentException(cYh.d("28322B34342E473D3422237A093F3571353F473E343D3B"));
    }

    public static h l(String string) {
        return E.c(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void m(LinkedHashMap linkedHashMap, String arrayList) {
        try {
            Object object = new StringReader((String)((Object)arrayList));
            BufferedReader bufferedReader = new BufferedReader((Reader)object);
            arrayList = bufferedReader.readLine();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            object = linkedHashMap2;
            while (true) {
                String string;
                block11: {
                    int n2;
                    String[] stringArray;
                    block15: {
                        block12: {
                            block14: {
                                block13: {
                                    if (arrayList == null) break block12;
                                    if (!((String)((Object)arrayList)).trim().isEmpty()) break block13;
                                    arrayList = object;
                                    break block11;
                                }
                                stringArray = ((String)((Object)arrayList)).split(cYh.d("4B"));
                                if (stringArray.length >= 2) break block14;
                                arrayList = object;
                                break block11;
                            }
                            boolean bl = ((String)((Object)arrayList)).contains(cYh.d("4437243F253F44"));
                            n2 = 0;
                            if (!bl) break block15;
                            object = stringArray[0].trim();
                            if (!((AbstractMap)linkedHashMap).containsKey(object)) {
                                arrayList = new LinkedHashMap();
                                ((AbstractMap)linkedHashMap).put(object, arrayList);
                                break block11;
                            } else {
                                arrayList = (LinkedHashMap)linkedHashMap.get(object);
                            }
                            break block11;
                        }
                        bufferedReader.close();
                        if (((AbstractMap)linkedHashMap2).isEmpty()) return;
                        ((AbstractMap)linkedHashMap).put(cYh.d("81CCEBB4DFDC80EBC5"), linkedHashMap2);
                        return;
                    }
                    string = stringArray[0].trim();
                    stringArray = stringArray[1].trim().split(cYh.d("44"));
                    while (true) {
                        arrayList = object;
                        if (n2 >= stringArray.length) break;
                        String string2 = stringArray[n2].trim();
                        if (!string2.isEmpty() && (string2.startsWith(cYh.d("0F243521")) || string2.startsWith(cYh.d("15243221")) || string2.startsWith(cYh.d("15242C21")))) {
                            if (!((AbstractMap)object).containsKey(string)) {
                                arrayList = new ArrayList();
                                ((AbstractMap)object).put(string, arrayList);
                            } else {
                                arrayList = (ArrayList)((LinkedHashMap)object).get(string);
                            }
                            if (!arrayList.contains(string2)) {
                                arrayList.add(string2);
                            }
                        }
                        ++n2;
                    }
                }
                string = bufferedReader.readLine();
                object = arrayList;
                arrayList = string;
            }
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static int o(int n2, int n3) {
        return ((n2 ^= ((n3 *= -862048943) >>> 17 | n3 << 15) * 461845907) >>> 19 | n2 << 13) * 5 - 430675100;
    }

    public static int p(int n2, Object object) {
        int n3 = object != null ? object.hashCode() : 0;
        return a.o(n2, n3);
    }

    public boolean d() {
        throw null;
    }

    public Object n() {
        throw null;
    }
}

