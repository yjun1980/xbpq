/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0786;
import com.github.catvod.spider.merge.\u078c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppYsV2
extends Spider {
    private static final Pattern \u037f = Pattern.compile(SOY.d("1B22382A5A0712227E585E4855243E12"));
    private static final Pattern \u0528 = Pattern.compile(SOY.d("1B22382A5A0712227E585F48267C271910"));
    private static final Pattern \u0529 = Pattern.compile(SOY.d("557C7A2A4B59516F"));
    private static final Pattern \u052a = Pattern.compile(SOY.d("54787903061B06242D001D130622390628481336784B"));
    private static final Pattern \u052b = Pattern.compile(SOY.d("122625060748407D7E2D2A582778"));
    private static final Pattern[] \u052c = new Pattern[]{Pattern.compile(SOY.d("0A3E300F1105473C3401")), Pattern.compile(SOY.d("46363800541E1E6F73001D131F3D73")), Pattern.compile(SOY.d("46363800541E1E6F732D2A5527786E06181603372354")), Pattern.compile(SOY.d("557DB9D1F29ED8C3B8E5CA91F4F7")), Pattern.compile(SOY.d("323E223C072716332813062B52")), Pattern.compile(SOY.d("463B3704151A1F090D05282427786E05061447700A28562A516D73")), Pattern.compile(SOY.d("462438121118210E222A272A506D2204174A58090F54295C4570"))};
    private final HashMap<String, ArrayList<String>> \u052d = new HashMap();
    private String[] \u052e = null;

    private String \u037f(String string) {
        if (!(string.contains(SOY.d("1B223858041F0A7D300604")) || string.contains(SOY.d("0235300604")) || string.contains(SOY.d("1C2034131F1614")))) {
            if (!(string.contains(SOY.d("002133")) || string.contains(SOY.d("1C392905")) || string.contains(SOY.d("02332805")) || string.contains(SOY.d("02312805")) || string.contains(SOY.d("09282805")) || string.contains(SOY.d("1E2A2805")) || string.contains(SOY.d("03262805")) || string.contains(SOY.d("0B3C2805")))) {
                if (string.contains(SOY.d("54243E12"))) {
                    return SOY.d("15393902000755667F475A47");
                }
                return SOY.d("3E333D001D1C55607F475A47");
            }
            return SOY.d("3E3323025B45546364565C131B20254C1D1853");
        }
        return SOY.d("3E3323025B45546365565C131B20254C1D1853");
    }

    private void \u0529(JSONObject jSONObject, String string, ArrayList<JSONArray> arrayList) {
        Iterator iterator = jSONObject.keys();
        block3: while (iterator.hasNext()) {
            int n2;
            String string2 = (String)iterator.next();
            try {
                Object object = jSONObject.get(string2);
                if (string2.equals(string) && object instanceof JSONArray) {
                    arrayList.add((JSONArray)object);
                }
                if (object instanceof JSONObject) {
                    this.\u0529((JSONObject)object, string, arrayList);
                    continue;
                }
                if (!(object instanceof JSONArray)) continue;
                string2 = (JSONArray)object;
                n2 = 0;
            }
            catch (JSONException jSONException) {
                SpiderDebug.log((Throwable)jSONException);
                continue;
            }
            while (true) {
                if (n2 >= string2.length()) continue block3;
                this.\u0529(string2.getJSONObject(n2), string, arrayList);
                ++n2;
                continue;
                break;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void \u052a(String var1_1, JSONObject var2_2, String var3_5, JSONObject var4_6, String var5_7) {
        block32: {
            block34: {
                var3_5 = new ArrayList<E>();
                var9_8 = new ArrayList<Object>();
                var8_9 = var1_1.contains(SOY.d("1B223858041F0A7D30060458"));
                var10_10 = SOY.d("14333C13");
                var13_11 = SOY.d("0A33230511281B2238");
                var12_12 = SOY.d("193D3513");
                var24_13 = SOY.d("0C3D35290105160D261F001F25223D170D1208");
                var19_14 = SOY.d("0C3D3529171B1B2122");
                var23_15 = SOY.d("1E332517");
                var11_16 = SOY.d("0F203D");
                var15_17 = SOY.d("0E2B21132B191B3F34");
                var14_18 = SOY.d("0C3D352917181426341800");
                var16_19 = SOY.d("0C3D3529101E083732021B05");
                var17_20 = SOY.d("0C3D352915140E3D23");
                var18_21 = SOY.d("0C3D352906121733231D07");
                var20_22 = SOY.d("0C3D352915051F33");
                var21_23 = SOY.d("0C3D35290D121B20");
                var22_24 = SOY.d("0C3D3529041E19");
                var25_25 = SOY.d("0C3D35291A161737");
                var26_26 = SOY.d("0C3D35291D13");
                if (var8_9) {
                    var1_1 = var2_2.getJSONObject(var23_15);
                    var4_6.put(var26_26, (Object)var1_1.optString(var26_26, (String)var5_7));
                    var4_6.put(var25_25, (Object)var1_1.getString(var25_25));
                    var4_6.put(var22_24, (Object)var1_1.getString(var22_24));
                    var4_6.put((String)var15_17, (Object)var1_1.optString(var19_14));
                    var4_6.put(var21_23, (Object)var1_1.optString(var21_23));
                    var4_6.put(var20_22, (Object)var1_1.optString(var20_22));
                    var4_6.put(var18_21, (Object)var1_1.optString(var18_21));
                    var4_6.put((String)var17_20, (Object)var1_1.optString((String)var17_20));
                    var4_6.put(var16_19, (Object)var1_1.optString(var16_19));
                    var4_6.put((String)var14_18, (Object)var1_1.optString((String)var14_18));
                    var14_18 = var1_1.getJSONArray(var24_13);
                    var6_27 = 0;
                    while (true) {
                        var2_2 = var3_5;
                        var1_1 = var9_8;
                        if (var6_27 >= var14_18.length()) break;
                        var2_2 = var14_18.getJSONObject(var6_27);
                        var1_1 = var2_2.optString(var12_12).trim();
                        if (var1_1.isEmpty()) {
                            var1_1 = var2_2.getString((String)var10_10).trim();
                        }
                        var9_8.add(var1_1);
                        var3_5.add(var2_2.getString(var11_16));
                        var15_17 = var2_2.optString((String)var13_11).trim();
                        var2_2 = var5_7 = this.\u052d.get(var1_1);
                        if (var5_7 == null) {
                            var2_2 = new ArrayList<E>();
                            this.\u052d.put((String)var1_1, (ArrayList<String>)var2_2);
                        }
                        if (!var15_17.isEmpty() && !var2_2.contains(var15_17)) {
                            var2_2.add(var15_17);
                        }
                        ++var6_27;
                    }
                    while (true) {
                        var3_5 = var2_2;
                        var2_2 = var1_1;
                        var1_1 = var3_5;
                        break block32;
                        break;
                    }
                }
                if (var1_1.contains(SOY.d("0235300604"))) {
                    var1_1 = var2_2.getJSONObject(var23_15).getJSONObject(SOY.d("0C3D35291D191C3D"));
                    var4_6.put(var26_26, (Object)var1_1.optString(var26_26, (String)var5_7));
                    var4_6.put(var25_25, (Object)var1_1.getString(var25_25));
                    var4_6.put(var22_24, (Object)var1_1.getString(var22_24));
                    var4_6.put((String)var15_17, (Object)var1_1.optString(var19_14));
                    var4_6.put(var21_23, (Object)var1_1.optString(var21_23));
                    var4_6.put(var20_22, (Object)var1_1.optString(var20_22));
                    var4_6.put(var18_21, (Object)var1_1.optString(var18_21));
                    var4_6.put((String)var17_20, (Object)var1_1.optString((String)var17_20));
                    var4_6.put(var16_19, (Object)var1_1.optString(var16_19));
                    var4_6.put((String)var14_18, (Object)var1_1.optString((String)var14_18));
                    var14_18 = var1_1.getJSONArray(var24_13);
                    var6_28 = 0;
                    while (true) {
                        var2_2 = var3_5;
                        var1_1 = var9_8;
                        if (var6_28 >= var14_18.length()) ** continue;
                        var2_2 = var14_18.getJSONObject(var6_28);
                        var1_1 = var2_2.optString(var12_12).trim();
                        if (var1_1.isEmpty()) {
                            var1_1 = var2_2.getString((String)var10_10).trim();
                        }
                        var9_8.add(var1_1);
                        var3_5.add(var2_2.getString(var11_16));
                        var15_17 = var2_2.optString((String)var13_11).trim();
                        var2_2 = var5_7 = this.\u052d.get(var1_1);
                        if (var5_7 == null) {
                            var2_2 = new ArrayList<E>();
                            this.\u052d.put((String)var1_1, (ArrayList<String>)var2_2);
                        }
                        if (!var15_17.isEmpty() && !var2_2.contains(var15_17)) {
                            var2_2.add(var15_17);
                        }
                        ++var6_28;
                    }
                }
                if (!var1_1.contains(SOY.d("54243E12"))) break block34;
                var2_2 = var2_2.getJSONObject(var23_15);
                var4_6.put(var26_26, (Object)var2_2.optString(var26_26, (String)var5_7));
                var4_6.put(var25_25, (Object)var2_2.getString(var25_25));
                var4_6.put(var22_24, (Object)var2_2.getString(var22_24));
                var4_6.put((String)var15_17, (Object)var2_2.optString(var19_14));
                var4_6.put(var21_23, (Object)var2_2.optString(var21_23));
                var4_6.put(var20_22, (Object)var2_2.optString(var20_22));
                var4_6.put(var18_21, (Object)var2_2.optString(var18_21));
                var4_6.put((String)var17_20, (Object)var2_2.optString((String)var17_20));
                var4_6.put(var16_19, (Object)var2_2.optString(var16_19));
                var4_6.put((String)var14_18, (Object)var2_2.optString((String)var14_18));
                var12_12 = var2_2.getJSONArray(SOY.d("0C3D3529041B1B2B0E1A1D040E"));
                for (var6_29 = 0; var6_29 < var12_12.length(); ++var6_29) {
                    block33: {
                        var14_18 = var12_12.getJSONObject(var6_29);
                        var10_10 = SOY.d("0A3E300F1105253B3F101B");
                        var2_2 = var5_7 = var14_18.getJSONObject((String)var10_10).optString(SOY.d("1C203E1B")).trim();
                        if (var5_7.isEmpty()) {
                            var2_2 = var14_18.getJSONObject((String)var10_10).optString(SOY.d("093A3E01")).trim();
                        }
                        var9_8.add(var2_2);
                        var3_5.add(var14_18.getString(var11_16));
                        var13_11 = new ArrayList();
                        var5_7 = var14_18.getJSONObject((String)var10_10).optString(SOY.d("0A33230511")).split(SOY.d("56"));
                        var10_10 = var14_18.getJSONObject((String)var10_10).optString(SOY.d("0A3323051145")).split(SOY.d("56"));
                        var13_11.addAll(Arrays.asList(var5_7));
                        var13_11.addAll(Arrays.asList(var10_10));
                        var5_7 = var10_10 = this.\u052d.get(var2_2);
                        if (var10_10 != null) ** GOTO lbl168
                        var5_7 = new ArrayList();
                        this.\u052d.put((String)var2_2, (ArrayList<String>)var5_7);
lbl168:
                        // 2 sources

                        var13_11 = var13_11.iterator();
                        while (var13_11.hasNext()) {
                            var10_10 = (String)var13_11.next();
                            if (!var10_10.contains(SOY.d("12262506"))) ** GOTO lbl179
                            var14_18 = AppYsV2.\u052a.matcher((CharSequence)var10_10);
                            var2_2 = var10_10;
                        }
                        continue;
                        {
                            if (var14_18.find()) {
                                var2_2 = var14_18.group(0);
                            }
                            ** GOTO lbl205
lbl179:
                            // 1 sources

                            if (!var10_10.contains(SOY.d("557D"))) ** GOTO lbl191
                            var14_18 = AppYsV2.\u052a.matcher((CharSequence)var10_10);
                            var2_2 = var10_10;
                            if (var14_18.find()) {
                                var2_2 = new StringBuilder();
                                var2_2.append(SOY.d("122625064E"));
                                var2_2.append(var14_18.group(0));
                                var2_2 = var2_2.toString();
                            }
                            ** GOTO lbl205
lbl191:
                            // 1 sources

                            var15_17 = AppYsV2.\u052b.matcher((CharSequence)var1_1);
                            var2_2 = var10_10;
                            if (!var15_17.find()) ** GOTO lbl205
                            var14_18 = AppYsV2.\u052a.matcher((CharSequence)var1_1);
                            var2_2 = var10_10;
                            try {
                                if (var14_18.find()) {
                                    var2_2 = new StringBuilder();
                                    var2_2.append(var15_17.group(0));
                                    var2_2.append(var14_18.group(0));
                                    var2_2 = var2_2.toString();
                                }
lbl205:
                                // 6 sources

                                if ((var2_2 = var2_2.replace(SOY.d("547C"), SOY.d("54")).trim()).isEmpty() || var5_7.contains(var2_2)) continue;
                                var5_7.add(var2_2);
                                continue;
                            }
                            catch (Exception var2_3) {
                                break block33;
                                break;
                            }
                        }
                        catch (Exception var2_4) {
                            // empty catch block
                        }
                    }
                    SpiderDebug.log((Throwable)var2_2);
                }
                var1_1 = var3_5;
                var2_2 = var9_8;
                break block32;
            }
            if (AppYsV2.\u037f.matcher((CharSequence)var1_1).find()) {
                var4_6.put(var26_26, (Object)var2_2.optString(var26_26, (String)var5_7));
                var10_10 = SOY.d("0E3B251A11");
                var4_6.put(var25_25, (Object)var2_2.getString((String)var10_10));
                var4_6.put(var22_24, (Object)var2_2.getString(SOY.d("133F3629010516")));
                var4_6.put((String)var15_17, (Object)this.\u0784(var2_2.optJSONArray(SOY.d("0E2B2113"))));
                var4_6.put(var21_23, (Object)var2_2.optString(SOY.d("0A2733021D1A1F")));
                var4_6.put(var20_22, (Object)this.\u0784(var2_2.optJSONArray(SOY.d("1B203417"))));
                var4_6.put(var18_21, (Object)var2_2.optString(SOY.d("0E2024181F")));
                var4_6.put((String)var17_20, (Object)this.\u0784(var2_2.optJSONArray(SOY.d("1B31251906"))));
                var4_6.put(var16_19, (Object)this.\u0784(var2_2.optJSONArray(SOY.d("1E3B231317031520"))));
                var4_6.put((String)var14_18, (Object)var2_2.optString(SOY.d("133C25041B")));
                var12_12 = var2_2.getJSONObject(SOY.d("0C3B35131B1B132125"));
                var13_11 = var12_12.keys();
                var2_2 = var11_16;
                while (var13_11.hasNext()) {
                    var11_16 = (String)var13_11.next();
                    var5_7 = this.\u052d.get(var11_16);
                    var1_1 = var5_7;
                    if (var5_7 == null) {
                        var1_1 = new ArrayList<E>();
                        this.\u052d.put(var11_16, (ArrayList<String>)var1_1);
                    }
                    var14_18 = var12_12.getJSONArray(var11_16);
                    var5_7 = new ArrayList<E>();
                    for (var6_30 = 0; var6_30 < var14_18.length(); ++var6_30) {
                        var16_19 = var14_18.getJSONObject(var6_30);
                        var15_17 = var16_19.getString((String)var2_2);
                        if (var15_17.contains(SOY.d("0F203D4B"))) {
                            var7_31 = var15_17.indexOf(SOY.d("0F203D4B")) + 4;
                            var17_20 = var15_17.substring(0, var7_31).trim();
                            if (!var17_20.isEmpty() && !var1_1.contains(var17_20)) {
                                var1_1.add((String)var17_20);
                            }
                            var17_20 = new StringBuilder();
                            var17_20.append(var16_19.getString((String)var10_10));
                            var17_20.append(SOY.d("5E"));
                            var17_20.append(var15_17.substring(var7_31).trim());
                            var5_7.add(var17_20.toString());
                            continue;
                        }
                        var17_20 = new StringBuilder();
                        var17_20.append(var16_19.getString((String)var10_10));
                        var17_20.append(SOY.d("5E"));
                        var17_20.append((String)var15_17);
                        var5_7.add(var17_20.toString());
                    }
                    var9_8.add(var11_16);
                    var3_5.add(TextUtils.join((CharSequence)SOY.d("59"), (Iterable)var5_7));
                }
            }
            var2_2 = var9_8;
            var1_1 = var3_5;
        }
        var3_5 = SOY.d("5E7675");
        var2_2 = TextUtils.join((CharSequence)var3_5, (Iterable)var2_2);
        var4_6.put(SOY.d("0C3D3529041B1B2B0E10061817"), var2_2);
        var1_1 = TextUtils.join((CharSequence)var3_5, (Iterable)var1_1);
        var4_6.put(SOY.d("0C3D3529041B1B2B0E03061B"), var1_1);
    }

    private String \u052b() {
        String[] stringArray = this.\u052e;
        if (stringArray != null && stringArray.length >= 1) {
            return stringArray[0].trim();
        }
        return "";
    }

    private JSONObject \u058f(String string, ArrayList<String> patternArray, String string2) {
        String string3;
        Iterator<String> iterator = patternArray.iterator();
        string = "";
        while (true) {
            int n2;
            String string4;
            block6: {
                boolean bl = iterator.hasNext();
                string3 = SOY.d("0F203D");
                int n3 = 1;
                patternArray = null;
                if (!bl) break;
                string4 = iterator.next();
                if (string4.isEmpty() || string4.equals(SOY.d("14273D1A"))) continue;
                CharSequence charSequence = new StringBuilder();
                charSequence.append(string4);
                charSequence.append(string2);
                String string5 = this.\u0528(\u078c.\u058f(charSequence.toString(), null), (byte)4);
                try {
                    charSequence = \u0786.\u052d(string2, string5);
                    patternArray = charSequence;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                if (patternArray != null && patternArray.has(string3) && patternArray.has((String)(charSequence = SOY.d("123730121105")))) {
                    patternArray.put((String)charSequence, (Object)patternArray.getJSONObject((String)charSequence).toString());
                    return patternArray;
                }
                if (!string5.contains(SOY.d("463A251B18"))) continue;
                patternArray = \u052c;
                int n4 = patternArray.length;
                for (n2 = 0; n2 < n4; ++n2) {
                    if (!patternArray[n2].matcher(string5).find()) continue;
                    n2 = n3;
                    break block6;
                }
                n2 = 0;
            }
            if (n2 == 0) continue;
            string = string4;
        }
        if (!string.isEmpty()) {
            patternArray = new JSONObject();
            patternArray.put(SOY.d("0A33230511"), 1);
            patternArray.put(SOY.d("0A3E300F210516"), (Object)string);
            patternArray.put(string3, (Object)string2);
            return patternArray;
        }
        return null;
    }

    private HashMap<String, String> \u0620(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        string = this.\u037f(string);
        hashMap.put(SOY.d("2F21340459361D373F02"), string);
        return hashMap;
    }

    private String \u0782(String string, String string2) {
        boolean bl = string.contains(SOY.d("54243E12"));
        CharSequence charSequence = SOY.d("5C223011114A");
        if (bl) {
            if (string.contains(SOY.d("133D21131A0E0F3C7F151B1A"))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(SOY.d("553E380500480D366C"));
                stringBuilder.append(string2);
                stringBuilder.append((String)charSequence);
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(SOY.d("4525354B"));
            stringBuilder.append(string2);
            stringBuilder.append((String)charSequence);
            return stringBuilder.toString();
        }
        if (!string.contains(SOY.d("1B223858041F0A7D300604")) && !string.contains(SOY.d("0235300604"))) {
            if (\u037f.matcher(string).find()) {
                if (!(string.contains(SOY.d("1F21341A18160F263E")) || string.contains(SOY.d("4B7C60425A41497C604645")) || string.contains(SOY.d("00382805")) || string.contains(SOY.d("1E3135")) || string.contains(SOY.d("162A2413")) || string.contains(SOY.d("0D373402151E54313F")) || string.contains(SOY.d("12333E1D1519102760")) || string.contains(SOY.d("1C3B254C4C")) || string.contains(SOY.d("00383B58181E1C37")) || string.contains(SOY.d("163D27134D4E426B")) || string.contains(SOY.d("42366907")) || string.contains(SOY.d("16397F060C0214")) || string.contains(SOY.d("1235280E")) || string.contains(SOY.d("4F60600E41")) || string.contains(SOY.d("162A280F0D")) || string.contains(SOY.d("4A6A604E0001")) || string.contains(SOY.d("1E3B2819011E")) || string.contains(SOY.d("1E3B3D1F1F030C")) || string.contains(SOY.d("0A222B1E01")) || string.contains(SOY.d("1B3B25130702193338")) || string.contains(SOY.d("00287F151D")) || string.contains(SOY.d("193A291C1B19")) || string.contains(SOY.d("0D3325151C1A13")) || string.contains(SOY.d("0C3B211404")) || string.contains(SOY.d("183A2500")) || string.contains(SOY.d("0234281D18")))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append(SOY.d("4533324B181E0926770C194A"));
                    stringBuilder.append(string2);
                    stringBuilder.append((String)charSequence);
                    return stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(SOY.d("4533324B181E09267701104A"));
                stringBuilder.append(string2);
                stringBuilder.append((String)charSequence);
                return stringBuilder.toString();
            }
            return "";
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(SOY.d("09373004171F4526340E004A"));
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(SOY.d("5C22364B"));
        return ((StringBuilder)charSequence).toString();
    }

    private boolean \u0783(String string) {
        boolean bl = string.equals(SOY.d("9EEEF791E4F1")) || string.equals(SOY.d("9CD1D49EFDC5")) || string.equals(SOY.d("9DF4DE93FCDE"));
        return bl;
    }

    private String \u0784(JSONArray object) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = 0;
        while (true) {
            if (n2 >= object.length()) break;
            arrayList.add(object.getString(n2));
            ++n2;
            continue;
            break;
        }
        try {
            object = TextUtils.join((CharSequence)SOY.d("56"), arrayList);
            return object;
        }
        catch (JSONException jSONException) {
            return "";
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String categoryContent(String var1_1, String var2_6, boolean var3_7, HashMap<String, String> var4_8) {
        block45: {
            block43: {
                block42: {
                    block40: {
                        block41: {
                            block39: {
                                block38: {
                                    block37: {
                                        block36: {
                                            block35: {
                                                block34: {
                                                    block33: {
                                                        block32: {
                                                            block31: {
                                                                block30: {
                                                                    var14_9 = SOY.d("03373004");
                                                                    var15_10 = SOY.d("16333F11");
                                                                    var16_11 = SOY.d("1B203417");
                                                                    var17_12 = SOY.d("193E300507");
                                                                    var13_13 = SOY.d("0E3D251718071B3534");
                                                                    var8_14 = SOY.d("163B3C1F00");
                                                                    var7_15 = SOY.d("0C3D35291D13");
                                                                    var9_16 = SOY.d("0E3D251718");
                                                                    var10_17 = SOY.d("0A33361317180F3C25");
                                                                    var11_18 = SOY.d("163B2202");
                                                                    var12_19 = SOY.d("1E332517");
                                                                    var19_20 = this.\u052b();
                                                                    var18_21 = new StringBuilder();
                                                                    var18_21.append(this.\u052c(var19_20));
                                                                    var18_21.append((String)var1_1 /* !! */ );
                                                                    var18_21.append(this.\u052d(var19_20));
                                                                    var18_21 = var18_21.toString().replace(SOY.d("59021F55"), var2_6);
                                                                    var19_20 = SOY.d("9DFFCA9FF4FE193E300507");
                                                                    if (var4_8 /* !! */  == null) break block30;
                                                                    if (!var4_8 /* !! */ .containsKey(var17_12)) break block30;
                                                                    var1_1 /* !! */  = var4_8 /* !! */ .get(var17_12);
                                                                    break block31;
                                                                }
                                                                var1_1 /* !! */  = "";
                                                            }
                                                            var17_12 = var18_21.replace(var19_20, (CharSequence)var1_1 /* !! */ );
                                                            var18_21 = SOY.d("9DFFCA9FF4FE1B203417");
                                                            if (var4_8 /* !! */  == null) break block32;
                                                            if (!var4_8 /* !! */ .containsKey(var16_11)) break block32;
                                                            var1_1 /* !! */  = var4_8 /* !! */ .get(var16_11);
                                                            break block33;
                                                        }
                                                        var1_1 /* !! */  = "";
                                                    }
                                                    var17_12 = var17_12.replace(var18_21, (CharSequence)var1_1 /* !! */ );
                                                    var16_11 = SOY.d("9DFFCA9FF4FE16333F11");
                                                    if (var4_8 /* !! */  == null) break block34;
                                                    if (!var4_8 /* !! */ .containsKey(var15_10)) break block34;
                                                    var1_1 /* !! */  = var4_8 /* !! */ .get(var15_10);
                                                    break block35;
                                                }
                                                var1_1 /* !! */  = "";
                                            }
                                            var15_10 = var17_12.replace(var16_11, (CharSequence)var1_1 /* !! */ );
                                            var16_11 = SOY.d("9DFFCA9FF4FE03373004");
                                            if (var4_8 /* !! */  == null) break block36;
                                            if (!var4_8 /* !! */ .containsKey(var14_9)) break block36;
                                            var1_1 /* !! */  = var4_8 /* !! */ .get(var14_9);
                                            break block37;
                                        }
                                        var1_1 /* !! */  = "";
                                    }
                                    var14_9 = var15_10.replace(var16_11, (CharSequence)var1_1 /* !! */ );
                                    var15_10 = SOY.d("9CDCC393CEF8");
                                    if (var4_8 /* !! */  != null) {
                                        if (!var4_8 /* !! */ .containsKey(var15_10)) break block38;
                                        var1_1 /* !! */  = var4_8 /* !! */ .get(var15_10);
                                        break block39;
                                    }
                                }
                                var1_1 /* !! */  = "";
                            }
                            var1_1 /* !! */  = var14_9.replace(var15_10, (CharSequence)var1_1 /* !! */ );
                            SpiderDebug.log((String)var1_1 /* !! */ );
                            var1_1 /* !! */  = this.\u0528(\u078c.\u058f((String)var1_1 /* !! */ , this.\u0620((String)var1_1 /* !! */ )), (byte)2);
                            var14_9 = new JSONObject((String)var1_1 /* !! */ );
                            if (var14_9.has(var13_13) && var14_9.get(var13_13) instanceof Integer) {
                                var5_22 = var14_9.getInt(var13_13);
                                break block40;
                            }
                            if (var14_9.has(var10_17) && var14_9.get(var10_17) instanceof Integer) {
                                var5_22 = var14_9.getInt(var10_17);
                                break block40;
                            }
                            if (!var14_9.has(var12_19) || !(var14_9.get(var12_19) instanceof JSONObject) || !var14_9.getJSONObject(var12_19).has(var9_16) || !(var14_9.getJSONObject(var12_19).get(var9_16) instanceof Integer) || !var14_9.getJSONObject(var12_19).has(var8_14) || !(var14_9.getJSONObject(var12_19).get(var8_14) instanceof Integer)) break block41;
                            var5_22 = var14_9.getJSONObject(var12_19).getInt(var8_14);
                            var6_23 = var14_9.getJSONObject(var12_19).getInt(var9_16);
                            if (var6_23 % var5_22 != 0) ** GOTO lbl95
                            try {
                                var5_22 = var6_23 / var5_22;
                                break block40;
lbl95:
                                // 1 sources

                                var5_22 = var6_23 / var5_22;
                                ++var5_22;
                                break block40;
                            }
                            catch (Exception var1_2) {
                                SpiderDebug.log((Throwable)var1_2);
                            }
                        }
                        var5_22 = 0x7FFFFFFF;
                    }
                    var4_8 /* !! */  = null;
                    var13_13 = new JSONArray();
                    if (var14_9.has(var11_18) && var14_9.get(var11_18) instanceof JSONArray) {
                        var1_1 /* !! */  = var14_9.getJSONArray(var11_18);
                        break block42;
                    }
                    if (var14_9.has(var12_19) && var14_9.get(var12_19) instanceof JSONObject && var14_9.getJSONObject(var12_19).has(var11_18) && var14_9.getJSONObject(var12_19).get(var11_18) instanceof JSONArray) {
                        var1_1 /* !! */  = var14_9.getJSONObject(var12_19).getJSONArray(var11_18);
                        break block42;
                    }
                    var1_1 /* !! */  = var4_8 /* !! */ ;
                    if (!var14_9.has(var12_19)) break block42;
                    var1_1 /* !! */  = var4_8 /* !! */ ;
                    if (!(var14_9.get(var12_19) instanceof JSONArray)) break block42;
                    var1_1 /* !! */  = var14_9.getJSONArray(var12_19);
                }
                if (var1_1 /* !! */  == null) break block43;
                var6_23 = 0;
                while (true) {
                    block44: {
                        if (var6_23 >= var1_1 /* !! */ .length()) break;
                        var12_19 = var1_1 /* !! */ .getJSONObject(var6_23);
                        var3_7 = var12_19.has(var7_15);
                        var4_8 /* !! */  = SOY.d("0C3D352906121733231D07");
                        var14_9 = SOY.d("0C3D3529041E19");
                        var15_10 = SOY.d("0C3D35291A161737");
                        if (!var3_7) ** GOTO lbl145
                        var16_11 = new JSONObject();
                        var16_11.put(var7_15, (Object)var12_19.getString(var7_15));
                        var16_11.put(var15_10, (Object)var12_19.getString(var15_10));
                        var16_11.put(var14_9, (Object)var12_19.getString(var14_9));
                        var16_11.put((String)var4_8 /* !! */ , (Object)var12_19.getString((String)var4_8 /* !! */ ));
                        var13_13.put((Object)var16_11);
                        break block44;
lbl145:
                        // 1 sources

                        var16_11 = new JSONObject();
                        var16_11.put(var7_15, (Object)var12_19.getString(SOY.d("14372902181E1439")));
                        var16_11.put(var15_10, (Object)var12_19.getString(SOY.d("0E3B251A11")));
                        var16_11.put(var14_9, (Object)var12_19.getString(SOY.d("0A3B32")));
                        var16_11.put((String)var4_8 /* !! */ , (Object)var12_19.getString(SOY.d("0926300211")));
                        var13_13.put((Object)var16_11);
                    }
                    ++var6_23;
                    continue;
                    break;
                }
            }
            var1_1 /* !! */  = new JSONObject();
            var1_1 /* !! */ .put(SOY.d("0A333613"), (Object)var2_6);
            var1_1 /* !! */ .put(var10_17, var5_22);
            var1_1 /* !! */ .put(var8_14, 90);
            var1_1 /* !! */ .put(var9_16, 0x7FFFFFFF);
            var1_1 /* !! */ .put(var11_18, (Object)var13_13);
            var1_1 /* !! */  = var1_1 /* !! */ .toString();
            return var1_1 /* !! */ ;
            {
                catch (Exception var1_3) {}
            }
            break block45;
            catch (Exception var1_4) {
                // empty catch block
            }
        }
        SpiderDebug.log((Throwable)var1_5);
        return "";
    }

    public String detailContent(List<String> object) {
        try {
            String string = this.\u052b();
            CharSequence charSequence = new StringBuilder();
            charSequence.append(this.\u0780(string));
            charSequence.append(object.get(0));
            charSequence = charSequence.toString();
            SpiderDebug.log((String)charSequence);
            String string2 = this.\u0528(\u078c.\u058f((String)charSequence, this.\u0620((String)charSequence)), (byte)3);
            JSONObject jSONObject = new JSONObject(string2);
            JSONObject jSONObject2 = new JSONObject();
            charSequence = new JSONObject();
            this.\u052a(string, jSONObject, string2, (JSONObject)charSequence, object.get(0));
            object = new JSONArray();
            object.put((Object)charSequence);
            jSONObject2.put(SOY.d("163B2202"), object);
            object = jSONObject2.toString();
            return object;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    /*
     * Loose catch block
     */
    public String homeContent(boolean bl) {
        Object object;
        Object object2;
        block117: {
            int n2;
            String[] stringArray;
            Object object3;
            Object object4;
            Object object5;
            String string;
            Object object6;
            String[] stringArray2;
            String string2;
            Object object7;
            Object object8;
            String string3;
            Object object9;
            Object object10;
            block102: {
                object10 = SOY.d("9DFFCA9FF4FE");
                object9 = "";
                string3 = SOY.d("1C3B3D02110509");
                object8 = SOY.d("163B2202");
                object7 = SOY.d("1E332517");
                object2 = object9;
                string2 = this.\u052e(this.\u052b());
                object2 = object9;
                boolean bl2 = string2.isEmpty();
                stringArray2 = SOY.d("47");
                object6 = SOY.d("2679");
                string = SOY.d("70");
                object = null;
                object5 = SOY.d("0E2B21132B1E1E");
                object4 = SOY.d("0E2B21132B191B3F34");
                if (!bl2) {
                    block103: {
                        block101: {
                            object2 = object9;
                            SpiderDebug.log((String)string2);
                            object2 = object9;
                            object3 = this.\u0528(\u078c.\u058f(string2, this.\u0620(string2)), (byte)0);
                            object2 = object9;
                            object2 = object9;
                            stringArray = new JSONObject((String)object3);
                            object2 = object9;
                            if (!stringArray.has((String)object8)) break block101;
                            object2 = object9;
                            if (!(stringArray.get((String)object8) instanceof JSONArray)) break block101;
                            object2 = object9;
                            object3 = stringArray.getJSONArray((String)object8);
                            break block102;
                        }
                        object2 = object9;
                        if (!stringArray.has((String)object7)) break block103;
                        object2 = object9;
                        if (!(stringArray.get((String)object7) instanceof JSONObject)) break block103;
                        object2 = object9;
                        if (!stringArray.getJSONObject((String)object7).has((String)object8)) break block103;
                        object2 = object9;
                        if (!(stringArray.getJSONObject((String)object7).get((String)object8) instanceof JSONArray)) break block103;
                        object2 = object9;
                        object3 = stringArray.getJSONObject((String)object7).getJSONArray((String)object8);
                        break block102;
                    }
                    object3 = object;
                    object2 = object9;
                    if (!stringArray.has((String)object7)) break block102;
                    object3 = object;
                    object2 = object9;
                    if (!(stringArray.get((String)object7) instanceof JSONArray)) break block102;
                    object2 = object9;
                    object3 = stringArray.getJSONArray((String)object7);
                    break block102;
                }
                object2 = object9;
                stringArray = this.\u052f(string2, null).split(string)[0].split((String)object6);
                object2 = object9;
                object2 = object9;
                object = new JSONArray();
                n2 = 1;
                while (true) {
                    block104: {
                        object3 = object;
                        object2 = object9;
                        if (n2 >= stringArray.length) break;
                        object2 = object9;
                        object7 = stringArray[n2].trim().split((String)stringArray2);
                        object2 = object9;
                        if (((String[])object7).length < 2) break block104;
                        object2 = object9;
                        object2 = object9;
                        object3 = new JSONObject();
                        object2 = object9;
                        object3.put((String)object4, (Object)object7[0].trim());
                        object2 = object9;
                        object3.put((String)object5, (Object)object7[1].trim());
                        object2 = object9;
                        object.put(object3);
                    }
                    ++n2;
                }
            }
            object2 = object9;
            object2 = object9;
            JSONObject jSONObject = new JSONObject();
            object2 = object9;
            object2 = object9;
            stringArray = new JSONArray();
            object = SOY.d("193E300507");
            object7 = object9;
            String[] stringArray3 = stringArray;
            object8 = object;
            if (object3 != null) {
                int n3 = 0;
                Object object11 = object3;
                object3 = object9;
                object9 = object10;
                while (true) {
                    block105: {
                        block116: {
                            block106: {
                                JSONArray jSONArray;
                                String string4;
                                block115: {
                                    object7 = object3;
                                    stringArray3 = stringArray;
                                    object8 = object;
                                    object2 = object3;
                                    if (n3 >= object11.length()) break;
                                    object2 = object3;
                                    object7 = object11.getJSONObject(n3);
                                    object2 = object3;
                                    object8 = object7.getString((String)object4);
                                    object2 = object3;
                                    if (this.\u0783((String)object8)) {
                                        object7 = object9;
                                        object9 = object;
                                        object = stringArray2;
                                        object2 = object6;
                                        stringArray2 = object4;
                                        object4 = object7;
                                        object6 = object;
                                        object = object3;
                                        object3 = object9;
                                        break block105;
                                    }
                                    object2 = object3;
                                    string4 = object7.getString((String)object5);
                                    object2 = object3;
                                    object2 = object3;
                                    object10 = new JSONObject();
                                    object2 = object3;
                                    object10.put((String)object5, (Object)string4);
                                    object2 = object3;
                                    object10.put((String)object4, object8);
                                    object2 = object3;
                                    object7 = object7.optJSONObject(SOY.d("0E2B21132B120226341810"));
                                    if (!bl) break block106;
                                    object2 = object3;
                                    stringArray3 = this.\u052f(string2, (JSONObject)object7).split(string);
                                    object2 = object3;
                                    object2 = object3;
                                    jSONArray = new JSONArray();
                                    object2 = object3;
                                    n2 = string2.isEmpty() ? 1 : 0;
                                    object7 = object5;
                                    object8 = object6;
                                    object5 = stringArray2;
                                    stringArray2 = object;
                                    object6 = object10;
                                    while (true) {
                                        block107: {
                                            Object object12;
                                            block110: {
                                                block108: {
                                                    block112: {
                                                        block111: {
                                                            block109: {
                                                                object2 = object3;
                                                                if (n2 >= stringArray3.length) break;
                                                                object2 = object3;
                                                                object = stringArray3[n2].trim();
                                                                object2 = object3;
                                                                if (((String)object).isEmpty()) {
                                                                    object2 = object5;
                                                                    object = object4;
                                                                    object4 = object6;
                                                                    object6 = object;
                                                                    object = object3;
                                                                    object3 = stringArray2;
                                                                    break block107;
                                                                }
                                                                object2 = object3;
                                                                object12 = ((String)object).split((String)object8);
                                                                object2 = object3;
                                                                object = object12[0].trim();
                                                                object2 = object3;
                                                                if (!((String)object).contains((CharSequence)object9)) break block108;
                                                                object2 = object3;
                                                                object10 = ((String)object).replace((CharSequence)object9, (CharSequence)object3);
                                                                object2 = object3;
                                                                if (!((String)object10).equals(stringArray2)) break block109;
                                                                object2 = object3;
                                                                object = SOY.d("9DE3EA93EAFC");
                                                                break block110;
                                                            }
                                                            object2 = object3;
                                                            if (!((String)object10).equals(SOY.d("1B203417"))) break block111;
                                                            object2 = object3;
                                                            object = SOY.d("9FCEE193F8CD");
                                                            break block110;
                                                        }
                                                        object2 = object3;
                                                        if (!((String)object10).equals(SOY.d("16333F11"))) break block112;
                                                        object2 = object3;
                                                        object = SOY.d("92FDFC9EDCF7");
                                                        break block110;
                                                    }
                                                    object2 = object3;
                                                    if (!((String)object10).equals(SOY.d("03373004"))) break block110;
                                                    object2 = object3;
                                                    object = SOY.d("9FEBE592CFCA");
                                                    break block110;
                                                }
                                                object2 = object;
                                                object10 = object;
                                                object = object2;
                                            }
                                            object2 = object3;
                                            object2 = object3;
                                            JSONObject jSONObject2 = new JSONObject();
                                            object2 = object3;
                                            jSONObject2.put(SOY.d("113728"), object10);
                                            object2 = object3;
                                            jSONObject2.put(SOY.d("14333C13"), object);
                                            object2 = object3;
                                            object2 = object3;
                                            JSONArray jSONArray2 = new JSONArray();
                                            int n4 = 1;
                                            object10 = object12;
                                            while (true) {
                                                block113: {
                                                    JSONObject jSONObject3;
                                                    block114: {
                                                        object2 = object3;
                                                        if (n4 >= ((Object)object10).length) break;
                                                        object2 = object3;
                                                        object2 = object3;
                                                        jSONObject3 = new JSONObject();
                                                        object2 = object3;
                                                        object12 = ((String)object10[n4]).trim();
                                                        object2 = object3;
                                                        int n5 = ((String)object12).indexOf((String)object5);
                                                        object = object3;
                                                        String string5 = SOY.d("0C");
                                                        object2 = SOY.d("14");
                                                        if (n5 == -1) {
                                                            object3 = object;
                                                            if (this.\u0783((String)object12)) break block113;
                                                            object3 = object;
                                                            jSONObject3.put((String)object2, object12);
                                                            object3 = object;
                                                            jSONObject3.put(string5, object12);
                                                            break block114;
                                                        }
                                                        object3 = object;
                                                        String string6 = ((String)object12).substring(0, n5);
                                                        object3 = object;
                                                        if (this.\u0783(string6)) break block113;
                                                        object3 = object;
                                                        jSONObject3.put((String)object2, (Object)string6.trim());
                                                        object3 = object;
                                                        jSONObject3.put(string5, (Object)((String)object12).substring(n5 + 1).trim());
                                                    }
                                                    object3 = object;
                                                    jSONArray2.put((Object)jSONObject3);
                                                }
                                                ++n4;
                                                object3 = object;
                                            }
                                            object = object3;
                                            object10 = object6;
                                            object2 = object5;
                                            object6 = object4;
                                            object3 = object;
                                            jSONObject2.put(SOY.d("0C333D0311"), (Object)jSONArray2);
                                            object3 = object;
                                            jSONArray.put((Object)jSONObject2);
                                            object3 = stringArray2;
                                            object4 = object10;
                                        }
                                        ++n2;
                                        object5 = object4;
                                        object4 = object6;
                                        stringArray2 = object3;
                                        object3 = object;
                                        object6 = object5;
                                        object5 = object2;
                                    }
                                    stringArray3 = object9;
                                    object = object3;
                                    object9 = stringArray2;
                                    object10 = object5;
                                    object2 = object8;
                                    object5 = object7;
                                    stringArray2 = object4;
                                    object3 = object;
                                    if (jSONObject.has(string3)) break block115;
                                    object3 = object;
                                    object3 = object;
                                    object4 = new JSONObject();
                                    object3 = object;
                                    jSONObject.put(string3, object4);
                                }
                                object3 = object;
                                jSONObject.getJSONObject(string3).put(string4, (Object)jSONArray);
                                object7 = object6;
                                object4 = stringArray3;
                                object6 = object10;
                                break block116;
                            }
                            object2 = object9;
                            object7 = object3;
                            object3 = object6;
                            object9 = object;
                            object = object7;
                            object6 = stringArray2;
                            stringArray2 = object4;
                            object4 = object2;
                            object2 = object3;
                            object7 = object10;
                        }
                        object3 = object;
                        stringArray.put(object7);
                        object3 = object9;
                    }
                    ++n3;
                    object9 = object4;
                    object4 = stringArray2;
                    stringArray2 = object;
                    object = object3;
                    object3 = stringArray2;
                    stringArray2 = object6;
                    object6 = object2;
                }
            }
            object3 = object7;
            jSONObject.put((String)object8, (Object)stringArray3);
            object3 = object7;
            try {
                object = jSONObject.toString();
                return object;
            }
            catch (Exception exception) {
                object = object3;
            }
            break block117;
            catch (Exception exception) {
                object = object2;
                object2 = exception;
            }
        }
        SpiderDebug.log((Throwable)object2);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeVideoContent() {
        int n2;
        String string = this.\u052b();
        CharSequence charSequence = this.\u0781(string);
        boolean bl = ((String)charSequence).isEmpty();
        int n3 = 0;
        if (bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.\u052c(string));
            ((StringBuilder)charSequence).append(SOY.d("173D271F11510A33361349465C332313154A5C262806114A5C212517060347"));
            charSequence = ((StringBuilder)charSequence).toString();
            n2 = 1;
        } else {
            n2 = 0;
        }
        SpiderDebug.log((String)charSequence);
        charSequence = this.\u0528(\u078c.\u058f((String)charSequence, this.\u0620((String)charSequence)), (byte)1);
        Object object = new JSONObject((String)charSequence);
        charSequence = new JSONArray();
        string = SOY.d("0C3D352906121733231D07");
        String string2 = SOY.d("0C3D3529041E19");
        String string3 = SOY.d("0C3D35291A161737");
        String string4 = SOY.d("0C3D35291D13");
        if (n2 != 0) {
            JSONArray jSONArray = object.getJSONArray(SOY.d("1E332517"));
            for (n2 = n3; n2 < jSONArray.length(); ++n2) {
                object = jSONArray.getJSONObject(n2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(string4, (Object)object.getString(SOY.d("14372902181E1439")));
                jSONObject.put(string3, (Object)object.getString(SOY.d("0E3B251A11")));
                jSONObject.put(string2, (Object)object.getString(SOY.d("0A3B32")));
                jSONObject.put(string, (Object)object.getString(SOY.d("0926300211")));
                charSequence.put((Object)jSONObject);
            }
        } else {
            Object object2 = new ArrayList();
            this.\u0529((JSONObject)object, SOY.d("0C3E380500"), (ArrayList<JSONArray>)object2);
            if (((ArrayList)object2).isEmpty()) {
                this.\u0529((JSONObject)object, SOY.d("0C3D3529181E0926"), (ArrayList<JSONArray>)object2);
            }
            object = new ArrayList();
            object2 = ((ArrayList)object2).iterator();
            while (object2.hasNext()) {
                JSONArray jSONArray = (JSONArray)object2.next();
                for (n2 = 0; n2 < jSONArray.length(); ++n2) {
                    JSONObject jSONObject = jSONArray.getJSONObject(n2);
                    String string5 = jSONObject.getString(string4);
                    if (object.contains(string5)) continue;
                    object.add(string5);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(string4, (Object)string5);
                    jSONObject2.put(string3, (Object)jSONObject.getString(string3));
                    jSONObject2.put(string2, (Object)jSONObject.getString(string2));
                    jSONObject2.put(string, (Object)jSONObject.getString(string));
                    charSequence.put((Object)jSONObject2);
                }
            }
        }
        try {
            string = new JSONObject();
            string.put(SOY.d("163B2202"), (Object)charSequence);
            return string.toString();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void init(Context context, String string) {
        super.init(context, string);
        try {
            this.\u052e = string.split(SOY.d("597172"));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public boolean isVideoFormat(String string) {
        return \u0786.\u052b(string);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public String playerContent(String var1_1, String var2_3, List<String> var3_4) {
        try {
            var5_5 = this.\u052d.get(var1_1);
            var3_4 = var5_5;
            if (var5_5 != null) ** GOTO lbl10
        }
        catch (Exception var1_2) {
            SpiderDebug.log((Throwable)var1_2);
            return "";
        }
        var3_4 = new ArrayList();
lbl10:
        // 2 sources

        if (var3_4.isEmpty() || (var1_1 = this.\u058f(var1_1, (ArrayList<String>)var3_4, var2_3)) == null) ** GOTO lbl13
        return var1_1.toString();
lbl13:
        // 1 sources

        var4_6 = \u0786.\u052b(var2_3);
        var1_1 = SOY.d("0F203D");
        var3_4 = SOY.d("0A33230511");
        if (!var4_6) ** GOTO lbl26
        var5_5 = new JSONObject();
        var5_5.put((String)var3_4, 0);
        var5_5.put(SOY.d("0A3E300F210516"), (Object)"");
        var5_5.put(var1_1, (Object)var2_3);
        return var5_5.toString();
lbl26:
        // 1 sources

        var5_5 = new JSONObject();
        var5_5.put((String)var3_4, 1);
        var5_5.put(SOY.d("102A"), (Object)SOY.d("4B"));
        var5_5.put(var1_1, (Object)var2_3);
        var1_1 = var5_5.toString();
        return var1_1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String searchContent(String var1_1, boolean var2_3) {
        block12: {
            block11: {
                var6_4 = SOY.d("0C3D35291D13");
                var5_5 = SOY.d("163B2202");
                var8_6 = SOY.d("1E332517");
                var1_1 = this.\u0782(this.\u052b(), URLEncoder.encode(var1_1));
                var1_1 = this.\u0528(\u078c.\u058f(var1_1, this.\u0620(var1_1)), (byte)5);
                var9_7 /* !! */  = new JSONObject(var1_1);
                var4_8 = null;
                var7_9 = new JSONArray();
                if (var9_7 /* !! */ .has(var5_5) && var9_7 /* !! */ .get(var5_5) instanceof JSONArray) {
                    var1_1 = var9_7 /* !! */ .getJSONArray(var5_5);
                    break block11;
                }
                if (var9_7 /* !! */ .has(var8_6) && var9_7 /* !! */ .get(var8_6) instanceof JSONObject && var9_7 /* !! */ .getJSONObject(var8_6).has(var5_5) && var9_7 /* !! */ .getJSONObject(var8_6).get(var5_5) instanceof JSONArray) {
                    var1_1 = var9_7 /* !! */ .getJSONObject(var8_6).getJSONArray(var5_5);
                    break block11;
                }
                var1_1 = var4_8;
                if (!var9_7 /* !! */ .has(var8_6)) break block11;
                var1_1 = var4_8;
                if (!(var9_7 /* !! */ .get(var8_6) instanceof JSONArray)) break block11;
                var1_1 = var9_7 /* !! */ .getJSONArray(var8_6);
            }
            if (var1_1 == null) break block12;
            var3_10 = 0;
            while (true) {
                block13: {
                    if (var3_10 >= var1_1.length()) break;
                    var4_8 = var1_1.getJSONObject(var3_10);
                    var2_3 = var4_8.has(var6_4);
                    var9_7 /* !! */  = SOY.d("0C3D352906121733231D07");
                    var8_6 = SOY.d("0C3D3529041E19");
                    var10_11 = SOY.d("0C3D35291A161737");
                    if (!var2_3) ** GOTO lbl49
                    var11_12 = new JSONObject();
                    var11_12.put(var6_4, (Object)var4_8.getString(var6_4));
                    var11_12.put(var10_11, (Object)var4_8.getString(var10_11));
                    var11_12.put(var8_6, (Object)var4_8.getString(var8_6));
                    var11_12.put((String)var9_7 /* !! */ , (Object)var4_8.getString((String)var9_7 /* !! */ ));
                    var7_9.put((Object)var11_12);
                    break block13;
lbl49:
                    // 1 sources

                    var11_12 = new JSONObject();
                    var11_12.put(var6_4, (Object)var4_8.getString(SOY.d("14372902181E1439")));
                    var11_12.put(var10_11, (Object)var4_8.getString(SOY.d("0E3B251A11")));
                    var11_12.put(var8_6, (Object)var4_8.getString(SOY.d("0A3B32")));
                    var11_12.put((String)var9_7 /* !! */ , (Object)var4_8.getString(SOY.d("0926300211")));
                    var7_9.put((Object)var11_12);
                }
                ++var3_10;
                continue;
                break;
            }
        }
        try {
            var1_1 = new JSONObject();
            var1_1.put(var5_5, (Object)var7_9);
            var1_1 = var1_1.toString();
            return var1_1;
        }
        catch (Exception var1_2) {
            SpiderDebug.log((Throwable)var1_2);
            return "";
        }
    }

    protected String \u0528(String string, byte by) {
        String[] stringArray = this.\u052e;
        if (stringArray.length > 1) {
            stringArray[1].equals(SOY.d("14342500"));
        }
        return string;
    }

    String \u052c(String charSequence) {
        if (!((String)charSequence).contains(SOY.d("1B223858041F0A7D300604")) && !((String)charSequence).contains(SOY.d("0235300604"))) {
            if (((String)charSequence).contains(SOY.d("54243E12"))) {
                if (((String)charSequence).contains(SOY.d("133D21131A0E0F3C"))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append(SOY.d("553E380500480E2B211349"));
                    return stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append(SOY.d("45262806114A"));
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(SOY.d("4533324B181E09267715181609216C"));
            return stringBuilder.toString();
        }
        boolean bl = ((String)charSequence).contains(SOY.d("1E3B3B1F150F1333"));
        String string = SOY.d("0C3B35131B480E3B354B");
        if (bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(SOY.d("122625064E58552526015A13133838170C1E1B7C321919581B223858041F0A7D30060458"));
            ((StringBuilder)charSequence).append(string);
            return ((StringBuilder)charSequence).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    String \u052d(String string) {
        if (!string.contains(SOY.d("1B223858041F0A7D300604")) && !string.contains(SOY.d("0235300604"))) {
            if (string.contains(SOY.d("54243E12"))) {
                return SOY.d("5C313D17070447B5FCED9DF7F3313D1707045C332313154A9DFFCA9FF4FE1B203417521B1B3C364B93DAE1BBD1FF18161435770F1116086FB6DBEF9EFADB281315055C30284B92F9E8B7EBF9521B133F380249464274211713124771013857");
            }
            return SOY.d("5C223011114A59021F5552160837304B93DAE1BBD1FF15051F3377020D071F6FB6DBEF9EFADB321A15040974220215050E6FB6DBEF9EFADB28131505");
        }
        return SOY.d("5C313D17070447B5FCED9DF7F3313D1707045C332313154A9DFFCA9FF4FE1B203417521B1B3C364B93DAE1BBD1FF18161435770F1116086FB6DBEF9EFADB281315055C3E381B1D034763695004104771013857");
    }

    String \u052e(String string) {
        if (!string.contains(SOY.d("1B223858041F0A7D300604")) && !string.contains(SOY.d("0235300604"))) {
            if (string.contains(SOY.d("54243E12"))) {
                if (string.contains(SOY.d("133D21131A0E0F3C7F151B1A"))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append(SOY.d("553E380500480E2B2113"));
                    return stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(SOY.d("552628061104"));
                return stringBuilder.toString();
            }
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(SOY.d("14332749001811373F4B"));
        return stringBuilder.toString();
    }

    String \u052f(String charSequence, JSONObject object) {
        String string = "";
        CharSequence charSequence2 = string;
        if (object != null) {
            Iterator iterator = object.keys();
            charSequence2 = string;
            while (true) {
                string = charSequence2;
                charSequence2 = string;
                if (!iterator.hasNext()) break;
                String string2 = (String)iterator.next();
                if (!(string2.equals(SOY.d("193E300507")) || string2.equals(SOY.d("1B203417")) || string2.equals(SOY.d("16333F11")))) {
                    charSequence2 = string;
                    if (!string2.equals(SOY.d("03373004"))) continue;
                }
                try {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append(string);
                    ((StringBuilder)charSequence2).append(SOY.d("9DFFCA9FF4FE"));
                    ((StringBuilder)charSequence2).append(string2);
                    ((StringBuilder)charSequence2).append(SOY.d("51B7D4DE9DF4D26F7A"));
                    ((StringBuilder)charSequence2).append(object.getString(string2).replace(SOY.d("56"), SOY.d("51")));
                    ((StringBuilder)charSequence2).append(SOY.d("70"));
                    charSequence2 = ((StringBuilder)charSequence2).toString();
                }
                catch (JSONException jSONException) {
                    charSequence2 = string;
                }
            }
        }
        if (((String)charSequence).contains(SOY.d("54243E12"))) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append(SOY.d("70B4DFE491CDF579B4F3DC9EF9FA6C5D92EBFAB4C7C64903133F345D92EBFAB5D2DB491F1326225D9CD8FEB7D9F04904193D2313"));
            object = ((StringBuilder)charSequence).toString();
        } else {
            object = charSequence2;
            if (!((String)charSequence).contains(SOY.d("1B223858041F0A7D300604"))) {
                object = ((String)charSequence).contains(SOY.d("0235300604")) ? charSequence2 : SOY.d("9FDAD791C5CC51B7D4DE9DF4D26F7A91E0C29FEFE04B19180C3B345D9CC8E4B5EADB91FEDD6F2500041B1B2B7A91CFCB92DBEB4B0001093A3E015F92F0FAB7CADF4A193D3C1F175C4E196C1B1B0113370E421F5C9EEFC29EF6C54726380F017D9DFFCA9FF4FE193E3005075C9FD7F99FF7DF4779B4E0E892F3F57A91FCC69CD1D45D92F6EAB4D1E05F92F0FAB5CBE85C9DF5C093CDCC51B7D8D192F4FF79B7FEEC93C0DB7A9ED9D19FDEFB5D93FDD5B5ECDC5F92F0FAB6E2CF5C9FF7D693CDCC51B4FCD090C9DA79B4F0E69EE3FB7A90EADD9CDAC95D92F6EAB4D1E05F91F8FEB6E0E55C9CD1DB90F6ED51B5EAF991F2C279B8EBE691E2F77A90E2F092DBEB5D91C9D4B5C5C391CACB79B4F9D09FD9D77A93FAF19FDDE35D9CC8EAB7DBDE5F92FCCEB7EBE55C9CD1DB90F6ED51B4D2FC92F5E079B5CAD290EAD47A90F7F292DBE35D93D1F5B7D9DF5F93C2DBB6CCD35C9FD6EE91DFD251B5ECE793CCE6B5C5C391CACB58B6DBEF9EFADB3004111651B7D4DE9DF4D26F7A93D0D093CBD75D9DD1E3B4E9D95F92F5E2B7CFCA5C9DECDF93EFCA51BADAC791ECC779B7C5E192E1EF7A90E3D29CCEFD5D9DE8D3B7CACB5F92C4E5B4EDC95C9CE1E193EFCA51B7DCC691CDDC79B9D3CB90F5FFB6FFED5C9FD8F190FFC89FF6F65D91F2CCB6EAE07E90D7C9B8F6FD0E1F33235D91F2D2BBD2DE495C486263445F454A60605D464748627A44444643796346454F51606147435C486260405F454A63645D46474B667A44444649796346454551606147455C486260465F454A62685D46474A6A7A4444474D796346444151606146415C486261425F454A62625D46474A607A4444474B7963464447");
            }
        }
        return object;
    }

    String \u0780(String charSequence) {
        if (!((String)charSequence).contains(SOY.d("1B223858041F0A7D300604")) && !((String)charSequence).contains(SOY.d("0235300604"))) {
            if (((String)charSequence).contains(SOY.d("54243E12"))) {
                if (((String)charSequence).contains(SOY.d("133D21131A0E0F3C"))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append(SOY.d("55363402151E161B154902181E0D381249"));
                    return stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append(SOY.d("55363402151E166D2719102813366C"));
                return stringBuilder.toString();
            }
            return "";
        }
        boolean bl = ((String)charSequence).contains(SOY.d("1E3B3B1F150F1333"));
        String string = SOY.d("0C3B35131B281E3725171D1B453B354B");
        if (bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(SOY.d("12262506074D557D260103591E3B3B1F150F13337F151B1A5533211F5A0712227E17040755"));
            ((StringBuilder)charSequence).append(string);
            return ((StringBuilder)charSequence).toString();
        }
        if (((String)charSequence).contains(SOY.d("4B626046100E"))) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(SOY.d("122625064E58552526015A464A6361120D5919317E17041E542239065B160A227E"));
            ((StringBuilder)charSequence).append(string);
            return ((StringBuilder)charSequence).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    String \u0781(String string) {
        if (!string.contains(SOY.d("1B223858041F0A7D300604")) && !string.contains(SOY.d("0235300604"))) {
            if (string.contains(SOY.d("54243E12"))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(SOY.d("55243E12241F18133D1A"));
                return stringBuilder.toString();
            }
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(SOY.d("133C35130C280C3B35131B480E3D3A131A4A"));
        return stringBuilder.toString();
    }
}

