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
package com.github.catvod.spider.merge.Dw;

import android.graphics.Bitmap;
import android.util.Base64;
import com.github.catvod.spider.merge.Dw.j;
import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Fs.E;
import com.github.catvod.spider.merge.mk.g;
import com.github.catvod.spider.merge.nz.o;
import com.github.catvod.spider.merge.t0.a;
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

public final class i {
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
        EnumMap enumMap = new EnumMap(j.class);
        enumMap.put((Object)j.d, "UTF-8");
        enumMap.put((Object)j.h, (Object)2);
        int n2 = o.a(240);
        int n3 = o.a(240);
        a a2 = a.l;
        com.github.catvod.spider.merge.A0.a a3 = new com.github.catvod.spider.merge.A0.a();
        a2 = a3.a((String)object, a2, n2, n3, enumMap);
        int n4 = a2.c();
        int n5 = a2.b();
        object = new int[n4 * n5];
        for (n3 = 0; n3 < n5; ++n3) {
            for (n2 = 0; n2 < n4; ++n2) {
                int n6 = a2.a(n2, n3) ? -16777216 : -1;
                object[n3 * n4 + n2] = n6;
            }
        }
        try {
            a2 = Bitmap.createBitmap((int)n4, (int)n5, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            a2.setPixels((int[])object, 0, n4, 0, 0, n4, n5);
            return a2;
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
        throw new IllegalArgumentException("Must be false");
    }

    public static void f(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    /*
     * Unable to fully structure code
     */
    public static String g(LinkedHashMap var0) {
        var2_1 = new JSONArray();
        block4: for (String var4_4 : var0.keySet()) {
            var5_6 = new JSONArray();
            var6_7 = (LinkedHashMap)var0.get(var4_4);
            if (var6_7.isEmpty()) continue;
            block5: for (String var8_9 : var6_7.keySet()) {
                var10_12 = (ArrayList)var6_7.get(var8_9);
                if (var10_12.isEmpty()) continue;
                var9_11 = new JSONArray();
                for (var1_3 = 0; var1_3 < var10_12.size(); ++var1_3) {
                    var9_11.put(var10_12.get(var1_3));
                }
                var10_12 = new JSONObject();
                var10_12.put("name", var8_9);
                var10_12.put("urls", var9_11);
lbl20:
                // 2 sources

                while (true) {
                    var5_6.put((Object)var10_12);
                    continue block5;
                    break;
                }
            }
            var6_7 = new JSONObject();
            var6_7.put("group", var4_4);
            var6_7.put("channels", var5_6);
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
    public static Object[] h(String object) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean bl = ((String)object).contains(".bmp");
            String string = g.g((String)object, null);
            if (bl) {
                String[] stringArray = string.split("\\*\\*");
                String string2 = new String(Base64.decode((String)stringArray[1], (int)0));
                i.m(linkedHashMap, string2);
            } else {
                i.m(linkedHashMap, string);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i.g(linkedHashMap).getBytes("UTF-8"));
            return new Object[]{200, "text/plain; charset=utf-8", byteArrayInputStream};
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
        throw new IllegalArgumentException("String must not be empty");
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
        throw new IllegalArgumentException("Object must not be null");
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
                                stringArray = ((String)((Object)arrayList)).split(",");
                                if (stringArray.length >= 2) break block14;
                                arrayList = object;
                                break block11;
                            }
                            boolean bl = ((String)((Object)arrayList)).contains("#genre#");
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
                        ((AbstractMap)linkedHashMap).put("\u672a\u5206\u7ec4", linkedHashMap2);
                        return;
                    }
                    string = stringArray[0].trim();
                    stringArray = stringArray[1].trim().split("#");
                    while (true) {
                        arrayList = object;
                        if (n2 >= stringArray.length) break;
                        String string2 = stringArray[n2].trim();
                        if (!string2.isEmpty() && (string2.startsWith("http") || string2.startsWith("rtsp") || string2.startsWith("rtmp"))) {
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
        return i.o(n2, n3);
    }

    public boolean d() {
        throw null;
    }

    public Object n() {
        throw null;
    }
}

