/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Yy;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class O5 {
    public static Object[] S(String object) {
        try {
            LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap = new LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>>();
            O5.b(linkedHashMap, (String)object, null);
            object = new ByteArrayInputStream(O5.l8(linkedHashMap).getBytes("UTF-8"));
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
        return new Object[]{200, "text/plain; charset=utf-8", object};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void T4(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String arrayList) {
        try {
            Object object = new StringReader((String)((Object)arrayList));
            BufferedReader bufferedReader = new BufferedReader((Reader)object);
            arrayList = bufferedReader.readLine();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            object = linkedHashMap2;
            while (true) {
                String string;
                block13: {
                    int n2;
                    String[] stringArray;
                    block15: {
                        block14: {
                            if (arrayList == null) break block14;
                            if (((String)((Object)arrayList)).trim().isEmpty()) {
                                arrayList = bufferedReader.readLine();
                                continue;
                            }
                            stringArray = ((String)((Object)arrayList)).split(",");
                            if (stringArray.length < 2) {
                                arrayList = bufferedReader.readLine();
                                continue;
                            }
                            boolean bl = ((String)((Object)arrayList)).contains("#genre#");
                            n2 = 0;
                            if (!bl) break block15;
                            object = stringArray[0].trim();
                            if (!linkedHashMap.containsKey(object)) {
                                arrayList = new LinkedHashMap();
                                linkedHashMap.put((String)object, (LinkedHashMap<String, ArrayList<String>>)((Object)arrayList));
                                break block13;
                            } else {
                                arrayList = linkedHashMap.get(object);
                            }
                            break block13;
                        }
                        bufferedReader.close();
                        if (linkedHashMap2.isEmpty()) return;
                        linkedHashMap.put("\u672a\u5206\u7ec4", linkedHashMap2);
                        return;
                    }
                    string = stringArray[0].trim();
                    stringArray = stringArray[1].trim().split("#");
                    while (true) {
                        arrayList = object;
                        if (n2 >= stringArray.length) break;
                        String string2 = stringArray[n2].trim();
                        if (!string2.isEmpty() && (string2.startsWith("http") || string2.startsWith("rtsp") || string2.startsWith("rtmp"))) {
                            if (!((HashMap)object).containsKey(string)) {
                                arrayList = new ArrayList();
                                ((HashMap)object).put(string, arrayList);
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

    public static void b(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String string, HashMap<String, String> hashMap) {
        O5.T4(linkedHashMap, Yy.v(string, hashMap));
    }

    /*
     * Unable to fully structure code
     */
    public static String l8(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> var0) {
        var2_1 = new JSONArray();
        block4: for (String var4_4 : var0.keySet()) {
            var5_6 = new JSONArray();
            var6_7 = var0.get(var4_4);
            if (var6_7.isEmpty()) continue;
            block5: for (String var9_10 : var6_7.keySet()) {
                var8_9 = (ArrayList)var6_7.get(var9_10);
                if (var8_9.isEmpty()) continue;
                var10_12 = new JSONArray();
                for (var1_3 = 0; var1_3 < var8_9.size(); ++var1_3) {
                    var10_12.put(var8_9.get(var1_3));
                }
                var8_9 = new JSONObject();
                var8_9.put("name", var9_10);
                var8_9.put("urls", var10_12);
lbl20:
                // 2 sources

                while (true) {
                    var5_6.put((Object)var8_9);
                    continue block5;
                    break;
                }
            }
            var6_7 = new JSONObject();
            var6_7.put("group", (Object)var4_4);
            var6_7.put("channels", (Object)var5_6);
lbl30:
            // 2 sources

            while (true) {
                var2_1.put((Object)var6_7);
                continue block4;
                break;
            }
        }
        return var2_1.toString();
        catch (JSONException var9_11) {
            ** continue;
        }
        catch (JSONException var4_5) {
            ** continue;
        }
    }
}

