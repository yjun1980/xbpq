/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Response
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.AppYsV2$1;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.g;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppYsV2
extends Spider {
    private static final Pattern d = Pattern.compile(cYh.d("0620280D792A0F206E7F7D6548262E35"));
    private static final Pattern e;
    private static final Pattern f;
    protected static final Pattern[] g;
    private String a = "";
    protected final HashMap<String, ArrayList<String>> b = new HashMap();
    private String[] c = null;

    static {
        Pattern.compile(cYh.d("0620280D792A0F206E7F7C653B7E373E33"));
        Pattern.compile(cYh.d("487E6A0D68744C6D"));
        e = Pattern.compile(cYh.d("497A692425361B263D273E3E1B2029210B650E34686C"));
        f = Pattern.compile(cYh.d("0F24352124655D7F6E0A09753A7A"));
        g = new Pattern[]{Pattern.compile(cYh.d("173C202832285A3E2426")), Pattern.compile(cYh.d("5B3428277733036D63273E3E023F63")), Pattern.compile(cYh.d("5B3428277733036D630A09783A7A7E213B3B1E353373")), Pattern.compile(cYh.d("487FA9F6D1B3C5C1A8C2E9BCE9F5")), Pattern.compile(cYh.d("2F3C321B240A0B31383425064F")), Pattern.compile(cYh.d("5B3927233637020B1D220B093A7A7E2225395A721A0F75074C6F63")), Pattern.compile(cYh.d("5B26283532353C0C320D04074D6F32233467450B1F730A715872"))};
    }

    private void b(JSONObject jSONObject, String string, ArrayList<JSONArray> arrayList) {
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
                    this.b((JSONObject)object, string, arrayList);
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
                this.b(string2.getJSONObject(n2), string, arrayList);
                ++n2;
                continue;
                break;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void c(String var1_1, JSONObject var2_2, JSONObject var3_5, String var4_6) {
        block35: {
            block39: {
                block37: {
                    block36: {
                        block34: {
                            var15_7 = cYh.d("4B");
                            var9_8 = new ArrayList<Object>();
                            var11_9 = new ArrayList();
                            var7_10 = var1_1.contains(cYh.d("0620287F2732177F20212775"));
                            var8_11 = cYh.d("173133223205062028");
                            var13_12 = cYh.d("09312C34");
                            var14_13 = cYh.d("043F2534");
                            var29_14 = cYh.d("113F250E22280B0F3638233238202D302E3F15");
                            var19_15 = cYh.d("113F250E3436062332");
                            var28_16 = cYh.d("03313530");
                            var17_17 = cYh.d("132931340834063D24");
                            var12_18 = cYh.d("33");
                            var10_19 = cYh.d("12222D");
                            var18_20 = cYh.d("113F250E34350924243F23");
                            var20_21 = cYh.d("113F250E3333153522253828");
                            var21_22 = cYh.d("113F250E3639133F33");
                            var22_23 = cYh.d("113F250E253F0A31333A24");
                            var23_24 = cYh.d("113F250E36280231");
                            var25_25 = cYh.d("113F250E2E3F0622");
                            var26_26 = cYh.d("113F250E393B0A35");
                            var24_27 = cYh.d("113F250E273304");
                            var27_28 = cYh.d("113F250E3E3E");
                            if (!var7_10) break block34;
                            var2_2 = var2_2.getJSONObject(var28_16);
                            var1_1 = this.fixCover(var2_2.getString(var24_27), (String)var1_1);
                            var3_5.put(var27_28, (Object)var2_2.optString(var27_28, (String)var4_6));
                            var3_5.put(var26_26, (Object)var2_2.getString(var26_26));
                            var3_5.put(var24_27, var1_1);
                            var3_5.put((String)var17_17, (Object)var2_2.optString((String)var19_15));
                            var3_5.put(var25_25, (Object)var2_2.optString(var25_25));
                            var3_5.put(var23_24, (Object)var2_2.optString(var23_24));
                            var3_5.put(var22_23, (Object)var2_2.optString(var22_23));
                            var3_5.put(var21_22, (Object)var2_2.optString(var21_22));
                            var3_5.put(var20_21, (Object)var2_2.optString(var20_21));
                            var3_5.put(var18_20, (Object)var2_2.optString(var18_20));
                            var15_7 = var2_2.getJSONArray(var29_14);
                            for (var5_29 = 0; var5_29 < var15_7.length(); ++var5_29) {
                                var2_2 = var15_7.getJSONObject(var5_29);
                                var1_1 = var2_2.optString((String)var14_13).trim();
                                if (var1_1.isEmpty()) {
                                    var1_1 = var2_2.getString(var13_12).trim();
                                }
                                if (this.a.indexOf(var12_18) < 0) {
                                    var11_9.add(var1_1);
                                } else {
                                    var11_9.add(var2_2.getString(var10_19));
                                }
                                var9_8.add(var2_2.getString(var10_19));
                                var16_33 = var2_2.optString((String)var8_11).trim();
                                var2_2 = var4_6 = this.b.get(var1_1);
                                if (var4_6 == null) {
                                    var2_2 = new ArrayList<E>();
                                    this.b.put((String)var1_1, (ArrayList<String>)var2_2);
                                }
                                if (var16_33.isEmpty() || var2_2.contains(var16_33)) continue;
                                var2_2.add(var16_33);
                            }
                            var1_1 = var9_8;
                            var2_2 = var11_9;
                            break block35;
                        }
                        var16_34 = var8_11;
                        var8_11 = var9_8;
                        var9_8 = var11_9;
                        if (!var1_1.contains(cYh.d("1F37202127"))) break block36;
                        var2_2 = var2_2.getJSONObject(var28_16).getJSONObject(cYh.d("113F250E3E34013F"));
                        var1_1 = this.fixCover(var2_2.getString(var24_27), (String)var1_1);
                        var3_5.put(var27_28, (Object)var2_2.optString(var27_28, (String)var4_6));
                        var3_5.put(var26_26, (Object)var2_2.getString(var26_26));
                        var3_5.put(var24_27, var1_1);
                        var3_5.put((String)var17_17, (Object)var2_2.optString((String)var19_15));
                        var3_5.put(var25_25, (Object)var2_2.optString(var25_25));
                        var3_5.put(var23_24, (Object)var2_2.optString(var23_24));
                        var3_5.put(var22_23, (Object)var2_2.optString(var22_23));
                        var3_5.put(var21_22, (Object)var2_2.optString(var21_22));
                        var3_5.put(var20_21, (Object)var2_2.optString(var20_21));
                        var3_5.put(var18_20, (Object)var2_2.optString(var18_20));
                        var11_9 = var2_2.getJSONArray(var29_14);
                        for (var5_30 = 0; var5_30 < var11_9.length(); ++var5_30) {
                            var2_2 = var11_9.getJSONObject(var5_30);
                            var1_1 = var2_2.optString((String)var14_13).trim();
                            if (var1_1.isEmpty()) {
                                var1_1 = var2_2.getString(var13_12).trim();
                            }
                            if (this.a.indexOf(var12_18) < 0) {
                                var9_8.add(var1_1);
                            } else {
                                var9_8.add(var2_2.getString(var10_19));
                            }
                            var8_11.add(var2_2.getString(var10_19));
                            var15_7 = var2_2.optString((String)var16_34).trim();
                            var2_2 = var4_6 = this.b.get(var1_1);
                            if (var4_6 == null) {
                                var2_2 = new ArrayList<E>();
                                this.b.put((String)var1_1, (ArrayList<String>)var2_2);
                            }
                            if (var15_7.isEmpty() || var2_2.contains(var15_7)) continue;
                            var2_2.add(var15_7);
                        }
                        var1_1 = var8_11;
                        var2_2 = var9_8;
                        break block35;
                    }
                    if (!var1_1.contains(cYh.d("49262E35"))) break block37;
                    var11_9 = var2_2.getJSONObject(var28_16);
                    var2_2 = this.fixCover(var11_9.getString(var24_27), (String)var1_1);
                    var3_5.put(var27_28, (Object)var11_9.optString(var27_28, (String)var4_6));
                    var3_5.put(var26_26, (Object)var11_9.getString(var26_26));
                    var3_5.put(var24_27, var2_2);
                    var3_5.put((String)var17_17, (Object)var11_9.optString((String)var19_15));
                    var3_5.put(var25_25, (Object)var11_9.optString(var25_25));
                    var3_5.put(var23_24, (Object)var11_9.optString(var23_24));
                    var3_5.put(var22_23, (Object)var11_9.optString(var22_23));
                    var3_5.put(var21_22, (Object)var11_9.optString(var21_22));
                    var3_5.put(var20_21, (Object)var11_9.optString(var20_21));
                    var3_5.put(var18_20, (Object)var11_9.optString(var18_20));
                    var13_12 = var11_9.getJSONArray(cYh.d("113F250E273606291E3D3E2913"));
                    for (var5_31 = 0; var5_31 < var13_12.length(); ++var5_31) {
                        block33: {
                            var11_9 = var13_12.getJSONObject(var5_31);
                            var16_34 = cYh.d("173C2028322838392F3738");
                            var2_2 = var4_6 = var11_9.getJSONObject((String)var16_34).optString(cYh.d("01222E3C")).trim();
                            if (var4_6.isEmpty()) {
                                var2_2 = var11_9.getJSONObject((String)var16_34).optString(cYh.d("14382E26")).trim();
                            }
                            if (this.a.indexOf(var12_18) < 0) {
                                var9_8.add(var2_2);
                            } else {
                                var9_8.add(var11_9.getString(var10_19));
                            }
                            var8_11.add(var11_9.getString(var10_19));
                            var14_13 = new ArrayList();
                            var4_6 = var11_9.getJSONObject((String)var16_34).optString(cYh.d("1731332232"));
                            var4_6 = var4_6.split(var15_7);
                            var11_9 = var11_9.getJSONObject((String)var16_34).optString(cYh.d("173133223268")).split(var15_7);
                            var14_13.addAll(Arrays.asList(var4_6));
                            var14_13.addAll(Arrays.asList(var11_9));
                            var4_6 = var11_9 = this.b.get(var2_2);
                            if (var11_9 != null) ** GOTO lbl182
                            var4_6 = new ArrayList();
                            this.b.put((String)var2_2, (ArrayList<String>)var4_6);
lbl182:
                            // 2 sources

                            var14_13 = var14_13.iterator();
                            while (var14_13.hasNext()) {
                                var11_9 = (String)var14_13.next();
                                if (!var11_9.contains(cYh.d("0F243521"))) ** GOTO lbl193
                                var16_34 = AppYsV2.e.matcher((CharSequence)var11_9);
                                var2_2 = var11_9;
                            }
                            continue;
                            {
                                if (var16_34.find()) {
                                    var2_2 = var16_34.group(0);
                                }
                                ** GOTO lbl221
lbl193:
                                // 1 sources

                                if (!var11_9.contains(cYh.d("487F"))) ** GOTO lbl206
                                var16_34 = AppYsV2.e.matcher((CharSequence)var11_9);
                                var2_2 = var11_9;
                                if (!var16_34.find()) ** GOTO lbl221
                                var11_9 = new StringBuilder();
                                var11_9.append(cYh.d("0F2435216D"));
                                var2_2 = var16_34.group(0);
lbl202:
                                // 2 sources

                                while (true) {
                                    var11_9.append((String)var2_2);
                                    ** GOTO lbl220
                                    break;
                                }
lbl206:
                                // 1 sources

                                var16_34 = AppYsV2.f.matcher((CharSequence)var1_1);
                                var2_2 = var11_9;
                                if (!var16_34.find()) ** GOTO lbl221
                                var17_17 = AppYsV2.e.matcher((CharSequence)var1_1);
                                var2_2 = var11_9;
                                try {
                                    block38: {
                                        if (var17_17.find()) {
                                            var11_9 = new StringBuilder();
                                            var11_9.append(var16_34.group(0));
                                            var2_2 = var17_17.group(0);
                                            ** continue;
                                        }
                                        break block38;
lbl220:
                                        // 1 sources

                                        var2_2 = var11_9.toString();
                                    }
                                    if ((var2_2 = var2_2.replace(cYh.d("497E"), cYh.d("49")).trim()).isEmpty() || var4_6.contains(var2_2)) continue;
                                    var4_6.add(var2_2);
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
                    var1_1 = var8_11;
                    var2_2 = var9_8;
                    break block35;
                }
                if (!AppYsV2.d.matcher((CharSequence)var1_1).find()) break block39;
                var1_1 = this.fixCover(var2_2.getString(cYh.d("0E3D260E22280B")), (String)var1_1);
                var3_5.put(var27_28, (Object)var2_2.optString(var27_28, (String)var4_6));
                var13_12 = cYh.d("1339353D32");
                var3_5.put(var26_26, (Object)var2_2.getString(var13_12));
                var3_5.put(var24_27, var1_1);
                var3_5.put((String)var17_17, (Object)this.n(var2_2.optJSONArray(cYh.d("13293134"))));
                var3_5.put(var25_25, (Object)var2_2.optString(cYh.d("172523253E3702")));
                var3_5.put(var23_24, (Object)this.n(var2_2.optJSONArray(cYh.d("06222430"))));
                var3_5.put(var22_23, (Object)var2_2.optString(cYh.d("1322343F3C")));
                var3_5.put(var21_22, (Object)this.n(var2_2.optJSONArray(cYh.d("0633353E25"))));
                var3_5.put(var20_21, (Object)this.n(var2_2.optJSONArray(cYh.d("03393334342E0822"))));
                var3_5.put(var18_20, (Object)var2_2.optString(cYh.d("0E3E352338")));
                var14_13 = var2_2.getJSONObject(cYh.d("1139253438360E2335"));
                var1_1 = var14_13.keys();
                var11_9 = var12_18;
                while (var1_1.hasNext()) {
                    var15_7 = (String)var1_1.next();
                    var4_6 = var2_2 = this.b.get(var15_7);
                    if (var2_2 == null) {
                        var4_6 = new ArrayList<E>();
                        this.b.put(var15_7, (ArrayList<String>)var4_6);
                    }
                    var16_34 = var14_13.getJSONArray(var15_7);
                    var17_17 = new ArrayList<E>();
                    for (var5_32 = 0; var5_32 < var16_34.length(); ++var5_32) {
                        block42: {
                            block40: {
                                block41: {
                                    var2_2 = var16_34.getJSONObject(var5_32);
                                    var12_18 = var2_2.getString(var10_19);
                                    var19_15 = cYh.d("12222D6C");
                                    var7_10 = var12_18.contains(var19_15);
                                    var18_20 = cYh.d("43");
                                    if (!var7_10) break block40;
                                    var6_35 = var12_18.indexOf((String)var19_15) + 4;
                                    if (!(var19_15 = var12_18.substring(0, var6_35).trim()).isEmpty() && !var4_6.contains(var19_15)) {
                                        var4_6.add(var19_15);
                                    }
                                    if (this.a.indexOf((String)var11_9) >= 0) break block41;
                                    var19_15 = new StringBuilder();
                                    var19_15.append(var2_2.getString(var13_12));
                                    var19_15.append(var18_20);
                                    var19_15.append(var12_18.substring(var6_35).trim());
                                    var2_2 = var19_15.toString();
                                    break block42;
                                }
                                var2_2 = new StringBuilder();
                                var2_2.append(var12_18.substring(var6_35).trim());
                                var2_2.append(var18_20);
                                var12_18 = var12_18.substring(var6_35).trim();
                                ** GOTO lbl318
                            }
                            if (this.a.indexOf((String)var11_9) < 0) {
                                var19_15 = new StringBuilder();
                                var19_15.append(var2_2.getString(var13_12));
                                var19_15.append(var18_20);
                                var19_15.append(var12_18);
                                var2_2 = var19_15.toString();
                            } else {
                                var2_2 = new StringBuilder();
                                var2_2.append(var12_18);
                                var2_2.append(var18_20);
lbl318:
                                // 2 sources

                                var2_2.append(var12_18);
                                var2_2 = var2_2.toString();
                            }
                        }
                        var17_17.add(var2_2);
                    }
                    var9_8.add(var15_7);
                    var8_11.add(TextUtils.join((CharSequence)cYh.d("44"), (Iterable)var17_17));
                }
            }
            var1_1 = var8_11;
            var2_2 = var9_8;
        }
        var4_6 = cYh.d("437465");
        var2_2 = TextUtils.join((CharSequence)var4_6, (Iterable)var2_2);
        var3_5.put(cYh.d("113F250E273606291E3725350A"), var2_2);
        var1_1 = TextUtils.join((CharSequence)var4_6, (Iterable)var1_1);
        var3_5.put(cYh.d("113F250E273606291E242536"), var1_1);
    }

    private String d() {
        String[] stringArray = this.c;
        if (stringArray != null && stringArray.length >= 1) {
            return stringArray[0].trim();
        }
        return "";
    }

    private static HashMap<String, String> i(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        string = string.contains(cYh.d("113F257F6E3F57636F323837")) ? cYh.d("2A3F3B383B36067F747F677A4F1C283F22225C70003F3328083925716174576B611F322212236164771812392D357817351174691973471131213B3F3035231A3E2E4865726679695170691A1F0E2A1C6D713B330C35611632390C3F68711432153F2C34786B57636F61796A4960611C38380E3C2471043B01313338786F54676F6261") : (!(string.contains(cYh.d("0620287F2732177F202127")) || string.contains(cYh.d("1F37202127")) || string.contains(cYh.d("012224343C3B09"))) ? (!(string.contains(cYh.d("1D2323")) || string.contains(cYh.d("013B3922")) || string.contains(cYh.d("1F313822")) || string.contains(cYh.d("1F333822")) || string.contains(cYh.d("142A3822")) || string.contains(cYh.d("03283822")) || string.contains(cYh.d("1E243822")) || string.contains(cYh.d("163E3822"))) ? (string.contains(cYh.d("49262E35")) ? cYh.d("083B2925232A48646F60796A") : cYh.d("23312D273E3148626F60796A")) : cYh.d("233133257868496174717F3E0622356B3E354E")) : cYh.d("233133257868496175717F3E0622356B3E354E"));
        hashMap.put(cYh.d("322324237A1B00352F25"), string);
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String l(String charSequence, String string) {
        block9: {
            CharSequence charSequence2;
            String string2;
            block7: {
                block8: {
                    boolean bl = ((String)charSequence).contains(cYh.d("49262E35"));
                    string2 = cYh.d("412020363267");
                    if (!bl) break block8;
                    if (((String)charSequence).contains(cYh.d("0E3F31343923123E6F323837"))) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)charSequence);
                        charSequence2 = cYh.d("483C2822236510347C");
                        charSequence = stringBuilder;
                        break block7;
                    } else {
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append((String)charSequence);
                        String string3 = cYh.d("5827256C");
                        charSequence = charSequence2;
                        charSequence2 = string3;
                    }
                    break block7;
                }
                if (((String)charSequence).contains(cYh.d("0620287F2732177F202127")) || ((String)charSequence).contains(cYh.d("1F37202127"))) break block9;
                if (!d.matcher(charSequence).find()) return "";
                if (!(((String)charSequence).contains(cYh.d("0223243D3B3B12242E")) || ((String)charSequence).contains(cYh.d("567E7065796C547E706166")) || ((String)charSequence).contains(cYh.d("1D3A3822")) || ((String)charSequence).contains(cYh.d("033325")) || ((String)charSequence).contains(cYh.d("0B283434")) || ((String)charSequence).contains(cYh.d("10352425363349332F")) || ((String)charSequence).contains(cYh.d("0F312E3A36340D2570")) || ((String)charSequence).contains(cYh.d("0139356B6F")) || ((String)charSequence).contains(cYh.d("1D3A2B7F3B330135")) || ((String)charSequence).contains(cYh.d("0B3F37346E635F69")) || ((String)charSequence).contains(cYh.d("5F347920")) || ((String)charSequence).contains(cYh.d("0B3B6F212F2F09")) || ((String)charSequence).contains(cYh.d("0F373829")) || ((String)charSequence).contains(cYh.d("5262702962")) || ((String)charSequence).contains(cYh.d("0B2838282E")) || ((String)charSequence).contains(cYh.d("57687069232C")) || ((String)charSequence).contains(cYh.d("0339383E2233")) || ((String)charSequence).contains(cYh.d("03392D383C2E11")) || ((String)charSequence).contains(cYh.d("17203B3922")) || ((String)charSequence).contains(cYh.d("06393534242F043128")) || ((String)charSequence).contains(cYh.d("1D2A6F323E")) || ((String)charSequence).contains(cYh.d("0438393B3834")) || ((String)charSequence).contains(cYh.d("103135323F370E")) || ((String)charSequence).contains(cYh.d("1139313327")) || ((String)charSequence).contains(cYh.d("05383527")) || ((String)charSequence).contains(cYh.d("1F36383A3B")))) {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append((String)charSequence);
                    String string4 = cYh.d("5831226C3B331424672B3A67");
                    charSequence = charSequence2;
                    charSequence2 = string4;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence);
                    charSequence2 = cYh.d("5831226C3B33142467263367");
                    charSequence = stringBuilder;
                }
            }
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(string2);
            return ((StringBuilder)charSequence).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(cYh.d("143520233432582424292367"));
        stringBuilder.append(string);
        stringBuilder.append(cYh.d("4120266C"));
        charSequence = stringBuilder;
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object[] loadPic(Map<String, String> object) {
        try {
            Object object2 = (String)object.get(cYh.d("14393534"));
            String string = (String)object.get(cYh.d("173922"));
            object = AppYsV2.i((String)object2);
            AppYsV2$1 appYsV2$1 = new AppYsV2$1();
            com.github.catvod.spider.merge.k.g.c(com.github.catvod.spider.merge.k.g.b(), string, object, appYsV2$1);
            if (((Response)appYsV2$1.getResult()).code() != 200) return null;
            object = object2 = ((Response)appYsV2$1.getResult()).headers().get(cYh.d("243F2F253234137D1528273F"));
            if (object2 == null) {
                object = cYh.d("0620313D3E390624283E3975083335342377142433343637");
            }
            System.out.println(string);
            System.out.println((String)object);
            object2 = ((Response)appYsV2$1.getResult()).body().byteStream();
            return new Object[]{200, object, object2};
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private boolean m(String string) {
        boolean bl = this.a.indexOf(cYh.d("46")) >= 0 && (string.equals(cYh.d("83ECE7B6C7DC")) || string.equals(cYh.d("81D3C4B9DEE8")) || string.equals(cYh.d("80F6CEB4DFF3")));
        return bl;
    }

    private String n(JSONArray object) {
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
            object = TextUtils.join((CharSequence)cYh.d("4B"), arrayList);
            return object;
        }
        catch (JSONException jSONException) {
            return "";
        }
    }

    protected final String a(String string) {
        String[] stringArray = this.c;
        if (stringArray.length > 1) {
            stringArray[1].equals(cYh.d("09363527"));
        }
        return string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String categoryContent(String var1_1, String var2_6, boolean var3_7, HashMap<String, String> var4_8) {
        block48: {
            block47: {
                block45: {
                    block46: {
                        block44: {
                            block42: {
                                block43: {
                                    block41: {
                                        block40: {
                                            block39: {
                                                block38: {
                                                    block37: {
                                                        block36: {
                                                            block35: {
                                                                block34: {
                                                                    block33: {
                                                                        block32: {
                                                                            var14_9 = cYh.d("1E352023");
                                                                            var15_10 = cYh.d("0B312F36");
                                                                            var16_11 = cYh.d("06222430");
                                                                            var17_12 = cYh.d("043C202224");
                                                                            var10_13 = cYh.d("133F35303B2A063724");
                                                                            var12_14 = cYh.d("0B392C3823");
                                                                            var9_15 = cYh.d("113F250E3E3E");
                                                                            var8_16 = cYh.d("133F35303B");
                                                                            var13_17 = cYh.d("173126343435123E35");
                                                                            var7_18 = cYh.d("0B393225");
                                                                            var11_19 = cYh.d("03313530");
                                                                            var19_20 = this.d();
                                                                            var18_21 /* !! */  = new StringBuilder();
                                                                            var18_21 /* !! */ .append(this.e(var19_20));
                                                                            var18_21 /* !! */ .append(var1_1 /* !! */ );
                                                                            var1_1 /* !! */  = !var19_20.contains(cYh.d("0620287F2732177F202127")) && !var19_20.contains(cYh.d("1F37202127")) ? (var19_20.contains(cYh.d("49262E35")) ? cYh.d("41332D3024295AB7ECCABEDAEE332D30242941313334366780FDDAB8D7D3062224307136063E266CB0F7FCB9C1D83B3B09376728323B156DA6FCCCB3E7D9383436284132386CB1D4F5B5FBDE71360E3D28256A6B5F763130303F5A73111F74") : cYh.d("41202036326744000F72713B1535206CB0F7FCB9C1D83628023167252E2A026DA6FCCCB3E7D9223D3629147632253628136DA6FCCCB3E7D938343628")) : cYh.d("41332D3024295AB7ECCABEDAEE332D30242941313334366780FDDAB8D7D3062224307136063E266CB0F7FCB9C1D83B3B09376728323B156DA6FCCCB3E7D938343628413C283C3E2E5A617977273D5A73111F74");
                                                                            var18_21 /* !! */ .append(var1_1 /* !! */ );
                                                                            var19_20 = var18_21 /* !! */ .toString().replace(cYh.d("44000F72"), var2_6);
                                                                            var18_21 /* !! */  = cYh.d("80FDDAB8D7D3043C202224");
                                                                            if (var4_8 /* !! */  == null) break block32;
                                                                            if (!var4_8 /* !! */ .containsKey(var17_12)) break block32;
                                                                            var1_1 /* !! */  = var4_8 /* !! */ .get(var17_12);
                                                                            break block33;
                                                                        }
                                                                        var1_1 /* !! */  = "";
                                                                    }
                                                                    var17_12 = var19_20.replace(var18_21 /* !! */ , var1_1 /* !! */ );
                                                                    var18_21 /* !! */  = cYh.d("80FDDAB8D7D306222430");
                                                                    if (var4_8 /* !! */  == null) break block34;
                                                                    if (!var4_8 /* !! */ .containsKey(var16_11)) break block34;
                                                                    var1_1 /* !! */  = var4_8 /* !! */ .get(var16_11);
                                                                    break block35;
                                                                }
                                                                var1_1 /* !! */  = "";
                                                            }
                                                            var16_11 = var17_12.replace(var18_21 /* !! */ , var1_1 /* !! */ );
                                                            var17_12 = cYh.d("80FDDAB8D7D30B312F36");
                                                            if (var4_8 /* !! */  == null) break block36;
                                                            if (!var4_8 /* !! */ .containsKey(var15_10)) break block36;
                                                            var1_1 /* !! */  = var4_8 /* !! */ .get(var15_10);
                                                            break block37;
                                                        }
                                                        var1_1 /* !! */  = "";
                                                    }
                                                    var16_11 = var16_11.replace(var17_12, var1_1 /* !! */ );
                                                    var15_10 = cYh.d("80FDDAB8D7D31E352023");
                                                    if (var4_8 /* !! */  == null) break block38;
                                                    if (!var4_8 /* !! */ .containsKey(var14_9)) break block38;
                                                    var1_1 /* !! */  = var4_8 /* !! */ .get(var14_9);
                                                    break block39;
                                                }
                                                var1_1 /* !! */  = "";
                                            }
                                            var14_9 = var16_11.replace(var15_10, var1_1 /* !! */ );
                                            var15_10 = cYh.d("81DED3B4EDD5");
                                            if (var4_8 /* !! */  != null) {
                                                if (!var4_8 /* !! */ .containsKey(var15_10)) break block40;
                                                var1_1 /* !! */  = var4_8 /* !! */ .get(var15_10);
                                                break block41;
                                            }
                                        }
                                        var1_1 /* !! */  = "";
                                    }
                                    var14_9 = var14_9.replace(var15_10, var1_1 /* !! */ );
                                    SpiderDebug.log((String)var14_9);
                                    var1_1 /* !! */  = com.github.catvod.spider.merge.k.g.g(var14_9, AppYsV2.i(var14_9));
                                    this.a(var1_1 /* !! */ );
                                    var4_8 /* !! */  = new JSONObject(var1_1 /* !! */ );
                                    if (var4_8 /* !! */ .has(var10_13) && var4_8 /* !! */ .get(var10_13) instanceof Integer) {
                                        var5_22 = var4_8 /* !! */ .getInt(var10_13);
                                        break block42;
                                    }
                                    if (var4_8 /* !! */ .has(var13_17) && var4_8 /* !! */ .get(var13_17) instanceof Integer) {
                                        var5_22 = var4_8 /* !! */ .getInt(var13_17);
                                        break block42;
                                    }
                                    if (!var4_8 /* !! */ .has(var11_19) || !(var4_8 /* !! */ .get(var11_19) instanceof JSONObject) || !var4_8 /* !! */ .getJSONObject(var11_19).has(var8_16) || !(var4_8 /* !! */ .getJSONObject(var11_19).get(var8_16) instanceof Integer) || !var4_8 /* !! */ .getJSONObject(var11_19).has(var12_14) || !(var4_8 /* !! */ .getJSONObject(var11_19).get(var12_14) instanceof Integer)) break block43;
                                    var5_22 = var4_8 /* !! */ .getJSONObject(var11_19).getInt(var12_14);
                                    var6_23 = var4_8 /* !! */ .getJSONObject(var11_19).getInt(var8_16);
                                    if (var6_23 % var5_22 != 0) ** GOTO lbl98
                                    try {
                                        var5_22 = var6_23 / var5_22;
                                        break block42;
lbl98:
                                        // 1 sources

                                        var5_22 = var6_23 / var5_22;
                                        ++var5_22;
                                        break block42;
                                    }
                                    catch (Exception var1_2) {
                                        SpiderDebug.log((Throwable)var1_2);
                                    }
                                }
                                var5_22 = 0x7FFFFFFF;
                            }
                            var10_13 = null;
                            var15_10 = new JSONArray();
                            if (!var4_8 /* !! */ .has(var7_18) || !(var4_8 /* !! */ .get(var7_18) instanceof JSONArray)) break block44;
                            var1_1 /* !! */  = var4_8 /* !! */ ;
                            ** GOTO lbl117
                        }
                        if (!var4_8 /* !! */ .has(var11_19) || !(var4_8 /* !! */ .get(var11_19) instanceof JSONObject) || !var4_8 /* !! */ .getJSONObject(var11_19).has(var7_18) || !(var4_8 /* !! */ .getJSONObject(var11_19).get(var7_18) instanceof JSONArray)) break block46;
                        var1_1 /* !! */  = var4_8 /* !! */ .getJSONObject(var11_19);
lbl117:
                        // 2 sources

                        var1_1 /* !! */  = var1_1 /* !! */ .getJSONArray(var7_18);
                        break block45;
                    }
                    var1_1 /* !! */  = var10_13;
                    if (!var4_8 /* !! */ .has(var11_19)) break block45;
                    var1_1 /* !! */  = var10_13;
                    if (!(var4_8 /* !! */ .get(var11_19) instanceof JSONArray)) break block45;
                    var1_1 /* !! */  = var4_8 /* !! */ .getJSONArray(var11_19);
                }
                var10_13 = var8_16;
                var11_19 = var7_18;
                if (var1_1 /* !! */  == null) break block47;
                var6_23 = 0;
                var4_8 /* !! */  = var8_16;
                while (true) {
                    var10_13 = var4_8 /* !! */ ;
                    var11_19 = var7_18;
                    if (var6_23 >= var1_1 /* !! */ .length()) break;
                    var17_12 = var1_1 /* !! */ .getJSONObject(var6_23);
                    var3_7 = var17_12.has(var9_15);
                    var11_19 = cYh.d("113F250E253F0A31333A24");
                    var8_16 = cYh.d("113F250E393B0A35");
                    var16_11 = cYh.d("113F250E273304");
                    if (!var3_7) ** GOTO lbl156
                    var18_21 /* !! */  = this.fixCover(var17_12.getString(var16_11), var14_9);
                    var10_13 = new JSONObject();
                    var10_13.put(var9_15, (Object)var17_12.getString(var9_15));
                    var10_13.put(var8_16, (Object)var17_12.getString(var8_16));
                    var10_13.put(var16_11, (Object)var18_21 /* !! */ );
                    var8_16 = var17_12.getString(var11_19);
lbl154:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl156:
                    // 1 sources

                    var18_21 /* !! */  = this.fixCover(var17_12.getString(cYh.d("173922")), var14_9);
                    var10_13 = new JSONObject();
                    var10_13.put(var9_15, (Object)var17_12.getString(cYh.d("093539253B33093B")));
                    var10_13.put(var8_16, (Object)var17_12.getString(cYh.d("1339353D32")));
                    var10_13.put(var16_11, (Object)var18_21 /* !! */ );
                    var8_16 = var17_12.getString(cYh.d("1424202532"));
                    ** continue;
                    var10_13.put(var11_19, (Object)var8_16);
                    var15_10.put((Object)var10_13);
                    ++var6_23;
                    continue;
                    break;
                }
            }
            var1_1 /* !! */  = new JSONObject();
            var1_1 /* !! */ .put(cYh.d("17312634"), (Object)var2_6);
            var1_1 /* !! */ .put(var13_17, var5_22);
            var1_1 /* !! */ .put(var12_14, 90);
            var1_1 /* !! */ .put(var10_13, 0x7FFFFFFF);
            var1_1 /* !! */ .put(var11_19, (Object)var15_10);
            var1_1 /* !! */  = var1_1 /* !! */ .toString();
            return var1_1 /* !! */ ;
            {
                catch (Exception var1_3) {}
            }
            break block48;
            catch (Exception var1_4) {
                // empty catch block
            }
        }
        SpiderDebug.log((Throwable)var1_5);
        return "";
    }

    public String detailContent(List<String> object) {
        try {
            String string = this.d();
            CharSequence charSequence = new StringBuilder();
            charSequence.append(this.j(string));
            charSequence.append(object.get(0));
            charSequence = charSequence.toString();
            SpiderDebug.log((String)charSequence);
            String string2 = com.github.catvod.spider.merge.k.g.g((String)charSequence, AppYsV2.i((String)charSequence));
            this.a(string2);
            charSequence = new JSONObject(string2);
            JSONObject jSONObject = new JSONObject();
            string2 = new JSONObject();
            this.c(string, (JSONObject)charSequence, (JSONObject)string2, object.get(0));
            object = new JSONArray();
            object.put((Object)string2);
            jSONObject.put(cYh.d("0B393225"), object);
            object = jSONObject.toString();
            return object;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    final String e(String string) {
        StringBuilder stringBuilder;
        if (!string.contains(cYh.d("0620287F2732177F202127")) && !string.contains(cYh.d("1F37202127"))) {
            if (string.contains(cYh.d("49262E35"))) {
                if (string.contains(cYh.d("0E3F31343923123E"))) {
                    stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
                    string = cYh.d("483C28222365132931346A");
                } else {
                    stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
                    string = cYh.d("582438213267");
                }
            } else {
                stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
                string = cYh.d("5831226C3B33142467323B3B14237C");
            }
        } else {
            if (string.contains(cYh.d("03392B3836220E31"))) {
                return cYh.d("0F2435216D7548273626793E0E3A28302F33067E223E3A750620287F2732177F202127751139253438651339256C");
            }
            stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
            string = cYh.d("1139253438651339256C");
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final String f(String string) {
        StringBuilder stringBuilder;
        if (!string.contains(cYh.d("0620287F2732177F202127")) && !string.contains(cYh.d("1F37202127"))) {
            if (!string.contains(cYh.d("49262E35"))) return "";
            if (string.contains(cYh.d("0E3F31343923123E6F323837"))) {
                stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
                string = cYh.d("483C2822236513293134");
            } else {
                stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
                string = cYh.d("482438213229");
            }
        } else {
            stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
            string = cYh.d("0931376E23350C352F6C");
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String fixCover(String string, String string2) {
        block4: {
            try {
                if (this.a.indexOf(cYh.d("13")) >= 0) break block4;
                return string;
            }
            catch (Exception exception) {
                return string;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("17222E292E60487F253E6A3B172018220168412328253267"));
        stringBuilder.append(string2);
        stringBuilder.append(cYh.d("412028326A"));
        stringBuilder.append(string);
        string2 = stringBuilder.toString();
        return string2;
    }

    final String g(String string, JSONObject object) {
        String string2 = "";
        CharSequence charSequence = string2;
        if (object != null) {
            Iterator iterator = object.keys();
            charSequence = string2;
            while (true) {
                string2 = charSequence;
                charSequence = string2;
                if (!iterator.hasNext()) break;
                String string3 = (String)iterator.next();
                if (!(string3.equals(cYh.d("043C202224")) || string3.equals(cYh.d("06222430")) || string3.equals(cYh.d("0B312F36")))) {
                    charSequence = string2;
                    if (!string3.equals(cYh.d("1E352023"))) continue;
                }
                try {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append(cYh.d("80FDDAB8D7D3"));
                    ((StringBuilder)charSequence).append(string3);
                    ((StringBuilder)charSequence).append(cYh.d("4CB5C4F9BED9CF6D6A"));
                    ((StringBuilder)charSequence).append(object.getString(string3).replace(cYh.d("4B"), cYh.d("4C")));
                    ((StringBuilder)charSequence).append(cYh.d("6D"));
                    charSequence = ((StringBuilder)charSequence).toString();
                }
                catch (JSONException jSONException) {
                    charSequence = string2;
                }
            }
        }
        if (string.contains(cYh.d("49262E35"))) {
            object = n.a((String)charSequence, cYh.d("6DB6CFC3B2E0E87BA4D4FFB3E4F87C7AB1C6E7B6D7E16A2E0E3D247AB1C6E7B7C2FC6A320E24327ABFF5E3B5C9D76A29043F3334"));
        } else {
            object = charSequence;
            if (!string.contains(cYh.d("0620287F2732177F202127"))) {
                object = string.contains(cYh.d("1F37202127")) ? charSequence : cYh.d("82D8C7B6E6E14CB5C4F9BED9CF6D6AB6C3EF82EDF06C3A351139247ABFE5F9B7FAFCB2D3C06D3527273606296AB6ECE68FD9FB6C232C14382E267CBFEDF8A7EDFC67043F2C383471531B7C3C382C0E351E653C7183EDD2B9D5E85A242828225080FDDAB8D7D3043C2022247182D5E9B8D4F25A7BA4C7CBBFEEF76AB6DFEB81D3C47AB1DBF7B6C1C77CBFEDF8A5ECCB7180F7D0B4EEE14CB5C8F6B1D9E27BA7D9CFBEDDD96AB9FAFC82DCEB7AB0D0C8B7FCFB7CBFEDF8A6C5EC7182F5C6B4EEE14CB6ECF7B3E4C77BA4D7C5B3FEF96AB7C9F081D8D97AB1DBF7B6C1C77CBCE5FCA6C7C67181D3CBB7D5C04CB7FADEB2DFDF7BA8CCC5BCFFF56AB7C1DD8FD9FB7AB2E4C9B7D5E4B2E7D67BA4DEF3B2C4D56AB4D9DC82DFF37ABFE5F7B5CBF97CBFE1CCA7CCC67181D3CBB7D5C04CB6C2DBB1D8FD7BA5EDF1BDF7D66AB7D4DF8FD9F37AB0FCE8B5C9F87CBEDFD9A6EBF07182D4FEB6FCFF4CB7FCC0B0E1FBB7D5E4B2E7D65AA6FCCCB3E7D92023323B4CB5C4F9BED9CF6D6AB4F3FD8EC9C77ABEFCFEB6F9FE7CBFE8E0A7E8E97180EECFB4CCE74CB8CAE0B2C1DA7BA7E2C2BFFCED6AB7C0FF81CCED7ABEC5CEB5DAEC7CBFD9E7A4CAEA7181E3F1B4CCE74CB5CCE1B2E0C17BA9F4E8BDE8FDA6D8CE7182DAE1B7DCE582F4E67AB2DFD1B4FAC75DBDCACBA8D1DE230231337AB2DFCFB9C2F96A71556073637C685762707A656A55606A63676B5E7B736166624C6271606071556070677C685761747A656A56646A63676B547B736166684C6271606671556070617C685760787A656A57686A63676A507B7361676C4C6271616271556071657C685760727A656A57626A63676A567B7361676A");
            }
        }
        return object;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected final JSONObject h(ArrayList object, String string) {
        Pattern[] patternArray;
        String string2;
        String string3;
        String string4;
        Iterator iterator = object.iterator();
        object = "";
        while (true) {
            int n2;
            String string5;
            block7: {
                boolean bl = iterator.hasNext();
                string4 = cYh.d("173C202802280B");
                string3 = cYh.d("1731332232");
                string2 = cYh.d("12222D");
                patternArray = null;
                int n3 = 1;
                if (!bl) break;
                string5 = (String)iterator.next();
                if (string5.isEmpty() || string5.equals(cYh.d("09252D3D"))) continue;
                String string6 = n.a(string5, string);
                String string7 = com.github.catvod.spider.merge.k.g.g(string6, null);
                this.a(string7);
                if (string5.contains(cYh.d("53696F6364694964767F63685D6979686F"))) {
                    object = new HashMap();
                    com.github.catvod.spider.merge.k.g.j(string6, null, object);
                    string = com.github.catvod.spider.merge.k.g.d(object);
                    object = new JSONObject();
                    object.put(string3, 0);
                    object.put(string4, (Object)"");
                    object.put(string2, (Object)string);
                    return object;
                }
                try {
                    string4 = m.e(string, string7);
                    patternArray = string4;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                if (patternArray != null && patternArray.has(string2) && patternArray.has(string4 = cYh.d("0F3520353228"))) {
                    patternArray.put(string4, (Object)patternArray.getJSONObject(string4).toString());
                    return patternArray;
                }
                if (!string7.contains(cYh.d("5B38353C3B"))) continue;
                patternArray = g;
                int n4 = patternArray.length;
                for (n2 = 0; n2 < n4; ++n2) {
                    if (!patternArray[n2].matcher(string7).find()) continue;
                    n2 = n3;
                    break block7;
                }
                n2 = 0;
            }
            if (n2 == 0) continue;
            object = string5;
        }
        if (!object.isEmpty()) {
            patternArray = new JSONObject();
            patternArray.put(string3, 1);
            patternArray.put(string4, object);
            patternArray.put(string2, (Object)string);
            return patternArray;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String homeContent(boolean var1_1) {
        block120: {
            block118: {
                block103: {
                    var22_2 = cYh.d("80FDDAB8D7D3");
                    var14_3 /* !! */  = "";
                    var24_4 = cYh.d("01392D25322814");
                    var17_5 = cYh.d("0B393225");
                    var15_6 = cYh.d("03313530");
                    var9_7 /* !! */  = var14_3 /* !! */ ;
                    var18_8 = this.f(this.d());
                    var9_7 /* !! */  = var14_3 /* !! */ ;
                    var6_9 = var18_8.isEmpty();
                    var13_10 /* !! */  = cYh.d("5A");
                    var12_11 /* !! */  = cYh.d("3B7B");
                    var19_12 = cYh.d("6D");
                    var8_13 /* !! */  = null;
                    var11_15 /* !! */  = cYh.d("13293134083303");
                    var10_16 = cYh.d("132931340834063D24");
                    if (!var6_9) {
                        block104: {
                            block102: {
                                var9_7 /* !! */  = var14_3 /* !! */ ;
                                SpiderDebug.log((String)var18_8);
                                var9_7 /* !! */  = var14_3 /* !! */ ;
                                var7_17 /* !! */  = com.github.catvod.spider.merge.k.g.g(var18_8, AppYsV2.i(var18_8));
                                var9_7 /* !! */  = var14_3 /* !! */ ;
                                this.a((String)var7_17 /* !! */ );
                                var9_7 /* !! */  = var14_3 /* !! */ ;
                                var9_7 /* !! */  = var14_3 /* !! */ ;
                                var16_19 /* !! */  = new JSONObject((String)var7_17 /* !! */ );
                                var9_7 /* !! */  = var14_3 /* !! */ ;
                                if (!var16_19 /* !! */ .has((String)var17_5)) break block102;
                                var9_7 /* !! */  = var14_3 /* !! */ ;
                                if (!(var16_19 /* !! */ .get((String)var17_5) instanceof JSONArray)) break block102;
                                var9_7 /* !! */  = var14_3 /* !! */ ;
                                var7_17 /* !! */  = var16_19 /* !! */ .getJSONArray((String)var17_5);
                                break block103;
                            }
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            if (!var16_19 /* !! */ .has((String)var15_6)) break block104;
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            if (!(var16_19 /* !! */ .get((String)var15_6) instanceof JSONObject)) break block104;
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            if (!var16_19 /* !! */ .getJSONObject((String)var15_6).has((String)var17_5)) break block104;
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            if (!(var16_19 /* !! */ .getJSONObject((String)var15_6).get((String)var17_5) instanceof JSONArray)) break block104;
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            var7_17 /* !! */  = var16_19 /* !! */ .getJSONObject((String)var15_6).getJSONArray((String)var17_5);
                            break block103;
                        }
                        var7_17 /* !! */  = var8_13 /* !! */ ;
                        var9_7 /* !! */  = var14_3 /* !! */ ;
                        if (!var16_19 /* !! */ .has((String)var15_6)) break block103;
                        var7_17 /* !! */  = var8_13 /* !! */ ;
                        var9_7 /* !! */  = var14_3 /* !! */ ;
                        if (!(var16_19 /* !! */ .get((String)var15_6) instanceof JSONArray)) break block103;
                        var9_7 /* !! */  = var14_3 /* !! */ ;
                        var7_17 /* !! */  = var16_19 /* !! */ .getJSONArray((String)var15_6);
                        break block103;
                    }
                    var9_7 /* !! */  = var14_3 /* !! */ ;
                    var15_6 = this.g(var18_8, null).split(var19_12)[0].split((String)var12_11 /* !! */ );
                    var9_7 /* !! */  = var14_3 /* !! */ ;
                    var9_7 /* !! */  = var14_3 /* !! */ ;
                    var8_13 /* !! */  = new JSONArray();
                    var2_20 = 1;
                    while (true) {
                        block105: {
                            var7_17 /* !! */  = var8_13 /* !! */ ;
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            if (var2_20 >= ((String[])var15_6).length) break;
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            var7_17 /* !! */  = var15_6[var2_20].trim().split((String)var13_10 /* !! */ );
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            if (var7_17 /* !! */ .length < 2) break block105;
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            var16_19 /* !! */  = new JSONObject();
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            var16_19 /* !! */ .put((String)var10_16, (Object)var7_17 /* !! */ [0].trim());
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            var16_19 /* !! */ .put((String)var11_15 /* !! */ , (Object)var7_17 /* !! */ [1].trim());
                            var9_7 /* !! */  = var14_3 /* !! */ ;
                            var8_13 /* !! */ .put((Object)var16_19 /* !! */ );
                        }
                        ++var2_20;
                    }
                }
                var9_7 /* !! */  = var14_3 /* !! */ ;
                var9_7 /* !! */  = var14_3 /* !! */ ;
                var25_21 = new JSONObject();
                var9_7 /* !! */  = var14_3 /* !! */ ;
                var9_7 /* !! */  = var14_3 /* !! */ ;
                var15_6 = new JSONArray();
                var8_13 /* !! */  = cYh.d("043C202224");
                var16_19 /* !! */  = var14_3 /* !! */ ;
                var17_5 = var15_6;
                var21_22 = var8_13 /* !! */ ;
                if (var7_17 /* !! */  == null) break block118;
                var3_23 = 0;
                var20_24 /* !! */  = var7_17 /* !! */ ;
                var7_17 /* !! */  = var14_3 /* !! */ ;
                var14_3 /* !! */  = var22_2;
                while (true) {
                    block106: {
                        block117: {
                            block107: {
                                block116: {
                                    var16_19 /* !! */  = var7_17 /* !! */ ;
                                    var17_5 = var15_6;
                                    var21_22 = var8_13 /* !! */ ;
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    if (var3_23 >= var20_24 /* !! */ .length()) break;
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var16_19 /* !! */  = var20_24 /* !! */ .getJSONObject(var3_23);
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var17_5 = var16_19 /* !! */ .getString((String)var10_16);
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    if (this.m((String)var17_5)) {
                                        var16_19 /* !! */  = var14_3 /* !! */ ;
                                        var14_3 /* !! */  = var8_13 /* !! */ ;
                                        var9_7 /* !! */  = var13_10 /* !! */ ;
                                        var8_13 /* !! */  = var12_11 /* !! */ ;
                                        var12_11 /* !! */  = var11_15 /* !! */ ;
                                        var13_10 /* !! */  = var10_16;
                                        var10_16 = var8_13 /* !! */ ;
                                        var11_15 /* !! */  = var16_19 /* !! */ ;
                                        var8_13 /* !! */  = var7_17 /* !! */ ;
                                        var7_17 /* !! */  = var14_3 /* !! */ ;
                                        break block106;
                                    }
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var26_28 = var16_19 /* !! */ .getString((String)var11_15 /* !! */ );
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var22_2 = new JSONObject();
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var22_2.put((String)var11_15 /* !! */ , (Object)var26_28);
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var22_2.put((String)var10_16, var17_5);
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var16_19 /* !! */  = var16_19 /* !! */ .optJSONObject(cYh.d("13293134083F1F24243F33"));
                                    if (!var1_1) break block107;
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var21_22 = this.g(var18_8, var16_19 /* !! */ ).split(var19_12);
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var27_29 = new JSONArray();
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var2_20 = var18_8.isEmpty() != false ? 1 : 0;
                                    var16_19 /* !! */  = var11_15 /* !! */ ;
                                    var17_5 = var12_11 /* !! */ ;
                                    var11_15 /* !! */  = var13_10 /* !! */ ;
                                    var12_11 /* !! */  = var22_2;
                                    while (true) {
                                        block108: {
                                            block119: {
                                                block109: {
                                                    block111: {
                                                        block113: {
                                                            block112: {
                                                                block110: {
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    if (var2_20 >= var21_22.length) break;
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    var13_10 /* !! */  = var21_22[var2_20].trim();
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    if (var13_10 /* !! */ .isEmpty()) {
                                                                        var13_10 /* !! */  = var12_11 /* !! */ ;
                                                                        var12_11 /* !! */  = var8_13 /* !! */ ;
                                                                        var9_7 /* !! */  = var11_15 /* !! */ ;
                                                                        var11_15 /* !! */  = var13_10 /* !! */ ;
                                                                        var8_13 /* !! */  = var7_17 /* !! */ ;
                                                                        var7_17 /* !! */  = var12_11 /* !! */ ;
                                                                        break block108;
                                                                    }
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    var23_27 = var13_10 /* !! */ .split((String)var17_5);
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    var13_10 /* !! */  = var23_27[0].trim();
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    if (!var13_10 /* !! */ .contains((CharSequence)var14_3 /* !! */ )) break block109;
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    var22_2 = var13_10 /* !! */ .replace((CharSequence)var14_3 /* !! */ , (CharSequence)var7_17 /* !! */ );
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    if (!var22_2.equals(var8_13 /* !! */ )) break block110;
                                                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                    var13_10 /* !! */  = cYh.d("80E1FAB4C9D1");
                                                                    break block111;
                                                                }
                                                                var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                if (!var22_2.equals(cYh.d("06222430"))) break block112;
                                                                var9_7 /* !! */  = var7_17 /* !! */ ;
                                                                var9_7 /* !! */  = var13_10 /* !! */  = cYh.d("82CCF1B4DBE0");
lbl232:
                                                                // 3 sources

                                                                while (true) {
                                                                    var13_10 /* !! */  = var9_7 /* !! */ ;
                                                                    break block111;
                                                                    break;
                                                                }
                                                            }
                                                            var9_7 /* !! */  = var7_17 /* !! */ ;
                                                            if (!var22_2.equals(cYh.d("0B312F36"))) break block113;
                                                            var9_7 /* !! */  = var7_17 /* !! */ ;
                                                            var9_7 /* !! */  = var13_10 /* !! */  = cYh.d("8FFFECB9FFDA");
                                                            ** GOTO lbl232
                                                        }
                                                        var9_7 /* !! */  = var7_17 /* !! */ ;
                                                        if (!var22_2.equals(cYh.d("1E352023"))) break block111;
                                                        var9_7 /* !! */  = var7_17 /* !! */ ;
                                                        var9_7 /* !! */  = var13_10 /* !! */  = cYh.d("82E9F5B5ECE7");
                                                        ** continue;
                                                    }
                                                    var9_7 /* !! */  = var22_2;
                                                    var22_2 = var13_10 /* !! */ ;
                                                    var13_10 /* !! */  = var9_7 /* !! */ ;
                                                    break block119;
                                                }
                                                var22_2 = var13_10 /* !! */ ;
                                            }
                                            var9_7 /* !! */  = var7_17 /* !! */ ;
                                            var9_7 /* !! */  = var7_17 /* !! */ ;
                                            var28_30 = new JSONObject();
                                            var9_7 /* !! */  = var7_17 /* !! */ ;
                                            var28_30.put(cYh.d("0C3538"), (Object)var13_10 /* !! */ );
                                            var9_7 /* !! */  = var7_17 /* !! */ ;
                                            var28_30.put(cYh.d("09312C34"), var22_2);
                                            var9_7 /* !! */  = var7_17 /* !! */ ;
                                            var9_7 /* !! */  = var7_17 /* !! */ ;
                                            var22_2 = new JSONArray();
                                            var4_25 = 1;
                                            var13_10 /* !! */  = var23_27;
                                            while (true) {
                                                block114: {
                                                    block115: {
                                                        var9_7 /* !! */  = var7_17 /* !! */ ;
                                                        if (var4_25 >= var13_10 /* !! */ .length) break;
                                                        var9_7 /* !! */  = var7_17 /* !! */ ;
                                                        var9_7 /* !! */  = var7_17 /* !! */ ;
                                                        var29_31 = new JSONObject();
                                                        var9_7 /* !! */  = var7_17 /* !! */ ;
                                                        var23_27 = var13_10 /* !! */ [var4_25].trim();
                                                        var9_7 /* !! */  = var7_17 /* !! */ ;
                                                        var5_26 = var23_27.indexOf((String)var11_15 /* !! */ );
                                                        var9_7 /* !! */  = var7_17 /* !! */ ;
                                                        var32_34 = cYh.d("11");
                                                        var31_33 = cYh.d("09");
                                                        if (var5_26 == -1) {
                                                            var7_17 /* !! */  = var9_7 /* !! */ ;
                                                            if (this.m((String)var23_27)) break block114;
                                                            var7_17 /* !! */  = var9_7 /* !! */ ;
                                                            var29_31.put(var31_33, var23_27);
                                                            var7_17 /* !! */  = var9_7 /* !! */ ;
                                                            var29_31.put(var32_34, var23_27);
                                                            break block115;
                                                        }
                                                        var7_17 /* !! */  = var9_7 /* !! */ ;
                                                        var30_32 = var23_27.substring(0, var5_26);
                                                        var7_17 /* !! */  = var9_7 /* !! */ ;
                                                        if (this.m(var30_32)) break block114;
                                                        var7_17 /* !! */  = var9_7 /* !! */ ;
                                                        var29_31.put(var31_33, (Object)var30_32.trim());
                                                        var7_17 /* !! */  = var9_7 /* !! */ ;
                                                        var29_31.put(var32_34, (Object)var23_27.substring(var5_26 + 1).trim());
                                                    }
                                                    var7_17 /* !! */  = var9_7 /* !! */ ;
                                                    var22_2.put((Object)var29_31);
                                                }
                                                ++var4_25;
                                                var7_17 /* !! */  = var9_7 /* !! */ ;
                                            }
                                            var7_17 /* !! */  = var9_7 /* !! */  = var7_17 /* !! */ ;
                                            var28_30.put(cYh.d("11312D2432"), var22_2);
                                            var7_17 /* !! */  = var9_7 /* !! */ ;
                                            var27_29.put((Object)var28_30);
                                            var7_17 /* !! */  = var8_13 /* !! */ ;
                                            var8_13 /* !! */  = var9_7 /* !! */ ;
                                            var9_7 /* !! */  = var11_15 /* !! */ ;
                                            var11_15 /* !! */  = var12_11 /* !! */ ;
                                        }
                                        ++var2_20;
                                        var12_11 /* !! */  = var8_13 /* !! */ ;
                                        var8_13 /* !! */  = var7_17 /* !! */ ;
                                        var7_17 /* !! */  = var12_11 /* !! */ ;
                                        var12_11 /* !! */  = var11_15 /* !! */ ;
                                        var11_15 /* !! */  = var9_7 /* !! */ ;
                                    }
                                    var9_7 /* !! */  = var7_17 /* !! */ ;
                                    var21_22 = var8_13 /* !! */ ;
                                    var8_13 /* !! */  = var11_15 /* !! */ ;
                                    var13_10 /* !! */  = var10_16;
                                    var7_17 /* !! */  = var9_7 /* !! */ ;
                                    if (var25_21.has(var24_4)) break block116;
                                    var7_17 /* !! */  = var9_7 /* !! */ ;
                                    var7_17 /* !! */  = var9_7 /* !! */ ;
                                    var10_16 = new JSONObject();
                                    var7_17 /* !! */  = var9_7 /* !! */ ;
                                    var25_21.put(var24_4, var10_16);
                                }
                                var7_17 /* !! */  = var9_7 /* !! */ ;
                                var25_21.getJSONObject(var24_4).put(var26_28, (Object)var27_29);
                                var22_2 = var12_11 /* !! */ ;
                                var10_16 = var17_5;
                                var11_15 /* !! */  = var14_3 /* !! */ ;
                                var12_11 /* !! */  = var16_19 /* !! */ ;
                                var14_3 /* !! */  = var8_13 /* !! */ ;
                                var8_13 /* !! */  = var9_7 /* !! */ ;
                                var9_7 /* !! */  = var21_22;
                                break block117;
                            }
                            var16_19 /* !! */  = var14_3 /* !! */ ;
                            var14_3 /* !! */  = var7_17 /* !! */ ;
                            var7_17 /* !! */  = var12_11 /* !! */ ;
                            var9_7 /* !! */  = var8_13 /* !! */ ;
                            var8_13 /* !! */  = var14_3 /* !! */ ;
                            var14_3 /* !! */  = var13_10 /* !! */ ;
                            var13_10 /* !! */  = var10_16;
                            var12_11 /* !! */  = var11_15 /* !! */ ;
                            var11_15 /* !! */  = var16_19 /* !! */ ;
                            var10_16 = var7_17 /* !! */ ;
                        }
                        var7_17 /* !! */  = var8_13 /* !! */ ;
                        var15_6.put(var22_2);
                        var7_17 /* !! */  = var9_7 /* !! */ ;
                        var9_7 /* !! */  = var14_3 /* !! */ ;
                    }
                    ++var3_23;
                    var16_19 /* !! */  = var10_16;
                    var14_3 /* !! */  = var11_15 /* !! */ ;
                    var11_15 /* !! */  = var12_11 /* !! */ ;
                    var10_16 = var13_10 /* !! */ ;
                    var12_11 /* !! */  = var8_13 /* !! */ ;
                    var8_13 /* !! */  = var7_17 /* !! */ ;
                    var7_17 /* !! */  = var12_11 /* !! */ ;
                    var13_10 /* !! */  = var9_7 /* !! */ ;
                    var12_11 /* !! */  = var16_19 /* !! */ ;
                }
            }
            var7_17 /* !! */  = var16_19 /* !! */ ;
            var25_21.put((String)var21_22, var17_5);
            var7_17 /* !! */  = var16_19 /* !! */ ;
            try {
                var8_13 /* !! */  = var25_21.toString();
                return var8_13 /* !! */ ;
            }
            catch (Exception var8_14) {
                var9_7 /* !! */  = var7_17 /* !! */ ;
            }
            break block120;
            catch (Exception var7_18) {
                var8_13 /* !! */  = var7_18;
            }
        }
        SpiderDebug.log((Throwable)var8_13 /* !! */ );
        return var9_7 /* !! */ ;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeVideoContent() {
        int n2;
        String string = this.d();
        CharSequence charSequence = this.k(string);
        boolean bl = ((String)charSequence).isEmpty();
        int n3 = 0;
        if (bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.e(string));
            ((StringBuilder)charSequence).append(cYh.d("0A3F3738327C173126346A6B41313334366741243821326741233530252E5A"));
            charSequence = ((StringBuilder)charSequence).toString();
            n2 = 1;
        } else {
            n2 = 0;
        }
        SpiderDebug.log((String)charSequence);
        string = com.github.catvod.spider.merge.k.g.g((String)charSequence, AppYsV2.i((String)charSequence));
        this.a(string);
        Object object = new JSONObject(string);
        string = new JSONArray();
        String string2 = cYh.d("113F250E253F0A31333A24");
        String string3 = cYh.d("113F250E273304");
        String string4 = cYh.d("113F250E393B0A35");
        String string5 = cYh.d("113F250E3E3E");
        if (n2 != 0) {
            JSONArray jSONArray = object.getJSONArray(cYh.d("03313530"));
            for (n2 = n3; n2 < jSONArray.length(); ++n2) {
                JSONObject jSONObject = jSONArray.getJSONObject(n2);
                object = this.fixCover(jSONObject.getString(cYh.d("173922")), (String)charSequence);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(string5, (Object)jSONObject.getString(cYh.d("093539253B33093B")));
                jSONObject2.put(string4, (Object)jSONObject.getString(cYh.d("1339353D32")));
                jSONObject2.put(string3, object);
                jSONObject2.put(string2, (Object)jSONObject.getString(cYh.d("1424202532")));
                string.put((Object)jSONObject2);
            }
        } else {
            Object object2 = new ArrayList();
            this.b((JSONObject)object, cYh.d("113C282223"), (ArrayList<JSONArray>)object2);
            if (((ArrayList)object2).isEmpty()) {
                this.b((JSONObject)object, cYh.d("113F250E3B331424"), (ArrayList<JSONArray>)object2);
            }
            object = new ArrayList();
            Iterator<JSONArray> iterator = ((ArrayList)object2).iterator();
            while (iterator.hasNext()) {
                JSONArray jSONArray = iterator.next();
                for (n2 = 0; n2 < jSONArray.length(); ++n2) {
                    JSONObject jSONObject = jSONArray.getJSONObject(n2);
                    String string6 = jSONObject.getString(string5);
                    if (((ArrayList)object).contains(string6)) continue;
                    ((ArrayList)object).add(string6);
                    object2 = this.fixCover(jSONObject.getString(string3), (String)charSequence);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(string5, (Object)string6);
                    jSONObject3.put(string4, (Object)jSONObject.getString(string4));
                    jSONObject3.put(string3, object2);
                    jSONObject3.put(string2, (Object)jSONObject.getString(string2));
                    string.put((Object)jSONObject3);
                }
            }
        }
        try {
            charSequence = new JSONObject();
            charSequence.put(cYh.d("0B393225"), (Object)string);
            return charSequence.toString();
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
        String string2 = cYh.d("5C6B");
        String string3 = string;
        if (string.indexOf(string2) >= 0) {
            string3 = string.split(string2).length > 1 ? string.split(string2)[1] : "";
            this.a = string3;
            string3 = string.split(string2)[0];
        }
        super.init(context, string3);
        try {
            this.c = string3.split(cYh.d("447362"));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public boolean isVideoFormat(String string) {
        return m.c(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final String j(String string) {
        StringBuilder stringBuilder;
        if (!string.contains(cYh.d("0620287F2732177F202127")) && !string.contains(cYh.d("1F37202127"))) {
            if (!string.contains(cYh.d("49262E35"))) return "";
            if (string.contains(cYh.d("0E3F31343923123E"))) {
                stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
                string = cYh.d("4834242536330B19056E2135030F28356A");
            } else {
                stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
                string = cYh.d("4834242536330B6F373E33050E347C");
            }
        } else {
            if (string.contains(cYh.d("03392B3836220E31"))) {
                return cYh.d("0F2435212460487F3626207403392B3836220E316F32383748313138792A0F206E30272A4826283532353834242536330B6F28356A");
            }
            if (string.contains(cYh.d("566070613323"))) {
                return cYh.d("0F2435216D7548273626796B576171352E7404336E30273349202921783B17206E273E3E023F1E35322E06392D6E3E3E5A");
            }
            stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
            string = cYh.d("113925343805033535303E365839256C");
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final String k(String string) {
        StringBuilder stringBuilder;
        if (!string.contains(cYh.d("0620287F2732177F202127")) && !string.contains(cYh.d("1F37202127"))) {
            if (!string.contains(cYh.d("49262E35"))) return "";
            stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
            string = cYh.d("48262E35073205112D3D");
        } else {
            stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
            string = cYh.d("0E3E25342F05113925343865133F2A343967");
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public boolean manualVideoCheck() {
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String object, String string, List<String> list) {
        boolean bl;
        void var2_11;
        try {
            bl = m.c((String)var2_11);
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        String string2 = cYh.d("12222D");
        String string3 = cYh.d("1731332232");
        {
            if (!bl && (m.d((String)var2_11) || this.a.indexOf(cYh.d("11")) < 0)) {
                JSONObject jSONObject;
                void var1_4;
                ArrayList<String> arrayList;
                ArrayList<String> arrayList2 = arrayList = this.b.get(object);
                if (arrayList == null) {
                    ArrayList arrayList3 = new ArrayList();
                }
                if (!var1_4.isEmpty() && (jSONObject = this.h((ArrayList)var1_4, (String)var2_11)) != null) {
                    return jSONObject.toString();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(string3, 1);
                jSONObject2.put(cYh.d("0D28"), (Object)cYh.d("56"));
                jSONObject2.put(string2, (Object)var2_11);
                return jSONObject2.toString();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(string3, 0);
            jSONObject.put(cYh.d("173C202802280B"), (Object)"");
            jSONObject.put(string2, (Object)var2_11);
            return jSONObject.toString();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String searchContent(String var1_1, boolean var2_3) {
        block13: {
            block12: {
                var7_4 = cYh.d("113F250E3E3E");
                var6_5 = cYh.d("0B393225");
                var5_6 = cYh.d("03313530");
                var8_7 = this.l(this.d(), URLEncoder.encode(var1_1));
                var1_1 = com.github.catvod.spider.merge.k.g.g(var8_7, AppYsV2.i(var8_7));
                this.a(var1_1);
                var10_8 /* !! */  = new JSONObject(var1_1);
                var4_9 /* !! */  = null;
                var9_10 = new JSONArray();
                if (var10_8 /* !! */ .has(var6_5) && var10_8 /* !! */ .get(var6_5) instanceof JSONArray) {
                    var1_1 = var10_8 /* !! */ .getJSONArray(var6_5);
                    break block12;
                }
                if (var10_8 /* !! */ .has(var5_6) && var10_8 /* !! */ .get(var5_6) instanceof JSONObject && var10_8 /* !! */ .getJSONObject(var5_6).has(var6_5) && var10_8 /* !! */ .getJSONObject(var5_6).get(var6_5) instanceof JSONArray) {
                    var1_1 = var10_8 /* !! */ .getJSONObject(var5_6).getJSONArray(var6_5);
                    break block12;
                }
                var1_1 = var4_9 /* !! */ ;
                if (!var10_8 /* !! */ .has(var5_6)) break block12;
                var1_1 = var4_9 /* !! */ ;
                if (!(var10_8 /* !! */ .get(var5_6) instanceof JSONArray)) break block12;
                var1_1 = var10_8 /* !! */ .getJSONArray(var5_6);
            }
            if (var1_1 == null) break block13;
            var3_11 = 0;
            while (true) {
                if (var3_11 >= var1_1.length()) break;
                var4_9 /* !! */  = var1_1.getJSONObject(var3_11);
                var2_3 = var4_9 /* !! */ .has(var7_4);
                var10_8 /* !! */  = cYh.d("113F250E253F0A31333A24");
                var12_13 = cYh.d("113F250E393B0A35");
                var11_12 = cYh.d("113F250E273304");
                if (!var2_3) ** GOTO lbl50
                var13_14 = this.fixCover(var4_9 /* !! */ .getString(var11_12), var8_7);
                var5_6 = new JSONObject();
                var5_6.put(var7_4, (Object)var4_9 /* !! */ .getString(var7_4));
                var5_6.put(var12_13, (Object)var4_9 /* !! */ .getString(var12_13));
                var5_6.put(var11_12, (Object)var13_14);
                var4_9 /* !! */  = var4_9 /* !! */ .getString((String)var10_8 /* !! */ );
lbl48:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl50:
                // 1 sources

                var13_14 = this.fixCover(var4_9 /* !! */ .getString(cYh.d("173922")), var8_7);
                var5_6 = new JSONObject();
                var5_6.put(var7_4, (Object)var4_9 /* !! */ .getString(cYh.d("093539253B33093B")));
                var5_6.put(var12_13, (Object)var4_9 /* !! */ .getString(cYh.d("1339353D32")));
                var5_6.put(var11_12, (Object)var13_14);
                var4_9 /* !! */  = var4_9 /* !! */ .getString(cYh.d("1424202532"));
                ** continue;
                var5_6.put((String)var10_8 /* !! */ , (Object)var4_9 /* !! */ );
                var9_10.put((Object)var5_6);
                ++var3_11;
                continue;
                break;
            }
        }
        try {
            var1_1 = new JSONObject();
            var1_1.put(var6_5, (Object)var9_10);
            var1_1 = var1_1.toString();
            return var1_1;
        }
        catch (Exception var1_2) {
            SpiderDebug.log((Throwable)var1_2);
            return "";
        }
    }
}

