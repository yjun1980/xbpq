/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u078c;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class \u0783 {
    private static final Pattern \u037f = Pattern.compile(SOY.d("54787D5E5A5C457B75"));
    private static final Pattern \u0528 = Pattern.compile(SOY.d("1D203E03045A0E3B251A114A587A7F5C4B5E58"));

    private static String \u037f(Pattern object, String object2) {
        if (((Matcher)(object2 = ((Pattern)object).matcher((CharSequence)object2))).find()) {
            return ((Matcher)object2).group(1);
        }
        object = ((Pattern)object).pattern().equals(\u0528.pattern()) ? SOY.d("9CCEFB93FCF19DE9D5") : SOY.d("9CCEFB93E5CA9FC2DC");
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static String \u0528(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> var0) {
        var3_1 = new JSONArray();
        block4: for (String var4_4 : var0.keySet()) {
            var5_6 = new JSONArray();
            var7_8 = var0.get(var4_4);
            if (var7_8.isEmpty()) continue;
            block5: for (String var10_12 : var7_8.keySet()) {
                var9_11 = var7_8.get(var10_12);
                if (var9_11.isEmpty()) continue;
                var8_9 = new JSONArray();
                for (var1_3 = 0; var1_3 < var9_11.size(); ++var1_3) {
                    var8_9.put((Object)var9_11.get(var1_3));
                }
                var9_11 = new JSONObject();
                var9_11.put(SOY.d("14333C13"), (Object)var10_12);
                var9_11.put(SOY.d("0F203D05"), (Object)var8_9);
lbl20:
                // 2 sources

                while (true) {
                    var5_6.put((Object)var9_11);
                    continue block5;
                    break;
                }
            }
            var6_7 = new JSONObject();
            var6_7.put(SOY.d("1D203E0304"), (Object)var4_4);
            var6_7.put(SOY.d("193A30181A121621"), (Object)var5_6);
lbl30:
            // 2 sources

            while (true) {
                var3_1.put((Object)var6_7);
                continue block4;
                break;
            }
        }
        return var3_1.toString();
        catch (JSONException var8_10) {
            ** continue;
        }
        catch (JSONException var4_5) {
            ** continue;
        }
    }

    public static Object[] \u0529(String string) {
        Object object;
        try {
            object = new LinkedHashMap();
            \u0783.\u052c(object, string, null);
            object = \u0783.\u0528(object);
            string = SOY.d("0E3729025B07163338184F57193A300407120E6F2402125A42");
            object = new ByteArrayInputStream(((String)object).getBytes(SOY.d("2F06175B4C")));
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
        return new Object[]{200, string, object};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void \u052a(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String cloneable) {
        try {
            ArrayList arrayList = new ArrayList((String)((Object)cloneable));
            BufferedReader bufferedReader = new BufferedReader((Reader)((Object)arrayList));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while ((cloneable = bufferedReader.readLine()) != null) {
                if (((String)((Object)cloneable)).equals("") || ((String)((Object)cloneable)).startsWith(SOY.d("5917092239442F")) || !((String)((Object)cloneable)).startsWith(SOY.d("591709223D393C"))) continue;
                String string = \u0783.\u037f(\u037f, (String)((Object)cloneable));
                arrayList = \u0783.\u037f(\u0528, (String)((Object)cloneable));
                String string2 = bufferedReader.readLine().trim();
                if (linkedHashMap.containsKey(arrayList)) {
                    cloneable = linkedHashMap.get(arrayList);
                } else {
                    cloneable = new LinkedHashMap();
                    linkedHashMap.put((String)((Object)arrayList), (LinkedHashMap<String, ArrayList<String>>)cloneable);
                }
                if (cloneable != null && ((HashMap)cloneable).containsKey(string)) {
                    cloneable = (ArrayList)((LinkedHashMap)cloneable).get(string);
                } else {
                    arrayList = new ArrayList();
                    ((HashMap)cloneable).put((Object)string, arrayList);
                    cloneable = arrayList;
                }
                if (cloneable == null || ((ArrayList)cloneable).contains(string2)) continue;
                ((ArrayList)cloneable).add(string2);
            }
            bufferedReader.close();
            if (linkedHashMap2.isEmpty()) {
                return;
            }
            linkedHashMap.put(SOY.d("9CCEFB93FCF19DE9D5"), linkedHashMap2);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void \u052b(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String arrayList) {
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
                            stringArray = ((String)((Object)arrayList)).split(SOY.d("56"));
                            if (stringArray.length < 2) {
                                arrayList = bufferedReader.readLine();
                                continue;
                            }
                            boolean bl = ((String)((Object)arrayList)).contains(SOY.d("59353418061259"));
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
                        linkedHashMap.put(SOY.d("9CCEFB93FCF19DE9D5"), linkedHashMap2);
                        return;
                    }
                    string = stringArray[0].trim();
                    stringArray = stringArray[1].trim().split(SOY.d("59"));
                    while (true) {
                        arrayList = object;
                        if (n2 >= stringArray.length) break;
                        String string2 = stringArray[n2].trim();
                        if (!string2.isEmpty() && (string2.startsWith(SOY.d("12262506")) || string2.startsWith(SOY.d("08262206")) || string2.startsWith(SOY.d("08263C06")))) {
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

    public static void \u052c(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String string, HashMap<String, String> hashMap) {
        if ((string = \u078c.\u058f(string, hashMap)).startsWith(SOY.d("5917092239442F"))) {
            \u0783.\u052a(linkedHashMap, string);
        } else {
            \u0783.\u052b(linkedHashMap, string);
        }
    }
}

