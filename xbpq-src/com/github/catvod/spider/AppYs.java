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
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.g;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppYs
extends Spider {
    private static HashMap<String, String> c;
    private static final Object d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private static final Pattern h;
    private static final Pattern i;
    private static final Pattern[] j;
    private static final Pattern[] k;
    private String a = "";
    private final HashMap<String, String> b = new HashMap();

    static {
        d = new Object();
        e = Pattern.compile(cYh.d("0620280D792A0F206E7F7D6548262E35"));
        f = Pattern.compile(cYh.d("0620280D792A0F206E7F7C653B7E373E33"));
        g = Pattern.compile(cYh.d("487E6A0D68744C6D"));
        h = Pattern.compile(cYh.d("497A692425361B263D273E3E1B2029210B650E34686C"));
        i = Pattern.compile(cYh.d("0F24352124655D7F6E0A09753A7A"));
        j = new Pattern[]{Pattern.compile(cYh.d("0D281D7F7C3212392C3038300E311D7F7C39083D6E213B3B1E3533")), Pattern.compile(cYh.d("17291D7F7C6D5F6931303906497B223F782A0B3138342575133D1D7F2732170C7E2425365A")), Pattern.compile(cYh.d("1D2438220B744C272023223B092A380D7971043F2C7E27360629242378065825333D6A")), Pattern.compile(cYh.d("1E392F3624320E0C6F7A203B1525203F2D233B7E6A32383748677968273B097F1D6E22280B6D")), Pattern.compile(cYh.d("1139310D7971173133263E223B7E6A3238375D6475626475173C20283228480C7E2425365A")), Pattern.compile(cYh.d("0620280D79710428282534353B7E6A3239")), Pattern.compile(cYh.d("482628210B744C22243F253F093D287F3439")), Pattern.compile(cYh.d("1E312F333E34000C6F7A273B152728290B744C332E3C6D6E5363727E273606292423")), Pattern.compile(cYh.d("0D232E3F0B744C33203F2333090C6F7A3439483131383D29083E1D7F273217")), Pattern.compile(cYh.d("0136253C0B744C3D283038360224370D7971043F2C7E0B6512222D6C")), Pattern.compile(cYh.d("1139310D797114292D263B06497B223F783B17396E0D683102297C")), Pattern.compile(cYh.d("0D281D7F7C3E0E3B2E252106497B223E3A753B6F34233B67")), Pattern.compile(cYh.d("1D3C380D79711F3A30292D06497B353E2775173C20283228480C7E2425365A")), Pattern.compile(cYh.d("522A2F3F0B744C28382B78375425790D7971173831")), Pattern.compile(cYh.d("1239256C666D5465673C2E67")), Pattern.compile(cYh.d("0620280D79711F3B3738333F080C6F7A333F1439263F78375425790D79711738310D682F153C7C")), Pattern.compile(cYh.d("173C20280B744C233B33383E063E2A282E06497B223E3A751F282E3E34340A32")), Pattern.compile(cYh.d("1139310D7971013A77616F6A3B7E6A292E2048202D302E3F157F1D6E22280B6D")), Pattern.compile(cYh.d("060C6F7A33221D3A79690B744C332E3C78300E353938")), Pattern.compile(cYh.d("0F3F32250B744C216C200B744C27203F3075062028")), Pattern.compile(cYh.d("83EFDCB5EACB"))};
        k = new Pattern[]{Pattern.compile(cYh.d("173C202832285A3E2426")), Pattern.compile(cYh.d("5B3428277733036D63273E3E023F63")), Pattern.compile(cYh.d("5B3428277733036D630A09783A7A7E213B3B1E353373")), Pattern.compile(cYh.d("487FA9F6D1B3C5C1A8C2E9BCE9F5")), Pattern.compile(cYh.d("2F3C321B240A0B31383425064F")), Pattern.compile(cYh.d("5B3927233637020B1D220B093A7A7E2225395A721A0F75074C6F63")), Pattern.compile(cYh.d("5B26283532353C0C320D04074D6F32233467450B1F730A715872"))};
    }

    private void a(JSONObject jSONObject, String string, ArrayList<JSONArray> arrayList) {
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
                    this.a((JSONObject)object, string, arrayList);
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
                this.a(string2.getJSONObject(n2), string, arrayList);
                ++n2;
                continue;
                break;
            }
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private void b(String var1_1, JSONObject var2_2, JSONObject var3_5, String var4_6) {
        block49: {
            block50: {
                block48: {
                    block41: {
                        var18_7 = cYh.d("4B");
                        var11_8 = new ArrayList();
                        var12_13 = new ArrayList<Object>();
                        var10_14 = var1_1.contains(cYh.d("0620287F2732177F20212775"));
                        var17_15 = cYh.d("0F2435216D75482628217937023E2629792C0E206E393837027F20213E65132931346A2314763438336754627568616351762A342E6706352720252E12273928121C2F1B0F1E06034125333D6A");
                        var13_16 = cYh.d("0D20267F3F35127E2D2478300A7F3B30783309342429792A0F20");
                        var14_17 = cYh.d("173133223205062028");
                        var15_18 = cYh.d("09312C34");
                        var28_19 = cYh.d("113F250E22280B0F3638233238202D302E3F15");
                        var19_20 /* !! */  = cYh.d("113F250E3436062332");
                        var25_21 = cYh.d("03313530");
                        var16_22 = cYh.d("12222D");
                        var21_23 = cYh.d("132931340834063D24");
                        var22_24 = cYh.d("113F250E34350924243F23");
                        var20_25 = cYh.d("113F250E3333153522253828");
                        var23_26 = cYh.d("113F250E3639133F33");
                        var24_27 = cYh.d("113F250E253F0A31333A24");
                        var26_28 = cYh.d("113F250E36280231");
                        var27_29 = cYh.d("113F250E2E3F0622");
                        var29_30 = cYh.d("113F250E273304");
                        var30_31 = cYh.d("113F250E393B0A35");
                        var31_32 = cYh.d("113F250E3E3E");
                        if (var10_14) {
                            var1_1 = var2_2 /* !! */ .getJSONObject(var25_21);
                            var3_5.put(var31_32, (Object)var1_1.optString(var31_32, (String)var4_6 /* !! */ ));
                            var3_5.put(var30_31, (Object)var1_1.getString(var30_31));
                            var3_5.put(var29_30, (Object)var1_1.getString(var29_30));
                            var3_5.put((String)var21_23, (Object)var1_1.optString((String)var19_20 /* !! */ ));
                            var3_5.put(var27_29, (Object)var1_1.optString(var27_29));
                            var3_5.put(var26_28, (Object)var1_1.optString(var26_28));
                            var3_5.put(var24_27, (Object)var1_1.optString(var24_27));
                            var3_5.put(var23_26, (Object)var1_1.optString(var23_26));
                            var3_5.put((String)var20_25, (Object)var1_1.optString((String)var20_25));
                            var3_5.put(var22_24, (Object)var1_1.optString(var22_24));
                            var4_6 /* !! */  = var1_1.getJSONArray(var28_19);
                            var5_33 = 0;
                            while (true) {
                                var1_1 = var11_8;
                                var2_2 /* !! */  = var12_13;
                                if (var5_33 < var4_6 /* !! */ .length()) {
                                    var1_1 = var4_6 /* !! */ .getJSONObject(var5_33);
                                    var2_2 /* !! */  = AppYs.o(var1_1.getString(var15_18));
                                    var12_13.add(var2_2 /* !! */ );
                                    var11_8.add(var1_1.getString((String)var16_22));
                                    var1_1 = var1_1.optString(var14_17);
                                    if (var1_1.contains(var13_16)) {
                                        var1_1 = var17_15;
                                    }
                                    this.b.put((String)var2_2 /* !! */ , (String)var1_1);
                                    ++var5_33;
                                    continue;
                                }
                                break block41;
                                break;
                            }
                        }
                        if (var1_1.contains(cYh.d("1F37202127"))) {
                            var1_1 = var2_2 /* !! */ .getJSONObject(var25_21).getJSONObject(cYh.d("113F250E3E34013F"));
                            var3_5.put(var31_32, (Object)var1_1.optString(var31_32, (String)var4_6 /* !! */ ));
                            var3_5.put(var30_31, (Object)var1_1.getString(var30_31));
                            var3_5.put(var29_30, (Object)var1_1.getString(var29_30));
                            var3_5.put((String)var21_23, (Object)var1_1.optString((String)var19_20 /* !! */ ));
                            var3_5.put(var27_29, (Object)var1_1.optString(var27_29));
                            var3_5.put(var26_28, (Object)var1_1.optString(var26_28));
                            var3_5.put(var24_27, (Object)var1_1.optString(var24_27));
                            var3_5.put(var23_26, (Object)var1_1.optString(var23_26));
                            var3_5.put((String)var20_25, (Object)var1_1.optString((String)var20_25));
                            var3_5.put(var22_24, (Object)var1_1.optString(var22_24));
                            var4_6 /* !! */  = var1_1.getJSONArray(var28_19);
                            var5_34 = 0;
                            while (true) {
                                var1_1 = var11_8;
                                var2_2 /* !! */  = var12_13;
                                if (var5_34 >= var4_6 /* !! */ .length()) ** break;
                                var1_1 = var4_6 /* !! */ .getJSONObject(var5_34);
                                var2_2 /* !! */  = AppYs.o(var1_1.getString(var15_18));
                                var12_13.add(var2_2 /* !! */ );
                                var11_8.add(var1_1.getString((String)var16_22));
                                var1_1 = var1_1.optString(var14_17);
                                if (var1_1.contains(var13_16)) {
                                    var1_1 = var17_15;
                                }
                                this.b.put((String)var2_2 /* !! */ , (String)var1_1);
                                ++var5_34;
                            }
                        }
                        break block48;
                    }
                    var4_6 /* !! */  = var1_1;
                    var1_1 = var2_2 /* !! */ ;
                    var2_2 /* !! */  = var4_6 /* !! */ ;
                    break block49;
                }
                var14_17 = var16_22;
                if (!var1_1.contains(cYh.d("49262E35"))) break block50;
                var2_2 /* !! */  = var2_2 /* !! */ .getJSONObject(var25_21);
                var3_5.put(var31_32, (Object)var2_2 /* !! */ .optString(var31_32, (String)var4_6 /* !! */ ));
                var3_5.put(var30_31, (Object)var2_2 /* !! */ .getString(var30_31));
                var3_5.put(var29_30, (Object)var2_2 /* !! */ .getString(var29_30));
                var3_5.put((String)var21_23, (Object)var2_2 /* !! */ .optString((String)var19_20 /* !! */ ));
                var3_5.put(var27_29, (Object)var2_2 /* !! */ .optString(var27_29));
                var3_5.put(var26_28, (Object)var2_2 /* !! */ .optString(var26_28));
                var3_5.put(var24_27, (Object)var2_2 /* !! */ .optString(var24_27));
                var3_5.put(var23_26, (Object)var2_2 /* !! */ .optString(var23_26));
                var3_5.put((String)var20_25, (Object)var2_2 /* !! */ .optString((String)var20_25));
                var3_5.put(var22_24, (Object)var2_2 /* !! */ .optString(var22_24));
                var2_2 /* !! */  = var2_2 /* !! */ .getJSONArray(cYh.d("113F250E273606291E3D3E2913"));
                var13_16 = var11_8;
                var15_18 = var18_7;
                for (var5_35 = 0; var5_35 < var2_2 /* !! */ .length(); ++var5_35) {
                    block47: {
                        block46: {
                            block43: {
                                block45: {
                                    var16_22 = var2_2 /* !! */ .getJSONObject(var5_35);
                                    var11_8 = cYh.d("173C2028322838392F3738");
                                    var17_15 = AppYs.o(var16_22.getJSONObject((String)var11_8).getString(cYh.d("14382E26")));
                                    var12_13.add(var17_15);
                                    var13_16.add(var16_22.getString(var14_17));
                                    var18_7 = new ArrayList();
                                    var4_6 /* !! */  = var16_22.getJSONObject((String)var11_8).optString(cYh.d("1731332232"));
                                    var4_6 /* !! */  = var4_6 /* !! */ .split(var15_18);
                                    var11_8 = var16_22.getJSONObject((String)var11_8).optString(cYh.d("173133223268")).split(var15_18);
                                    for (Object var16_22 : var4_6 /* !! */ ) {
                                        block42: {
                                            if (!AppYs.g.matcher((CharSequence)var16_22).find()) continue;
                                            var19_20 /* !! */  = AppYs.j;
                                            var8_39 = var19_20 /* !! */ .length;
                                            for (var9_40 = 0; var9_40 < var8_39; ++var9_40) {
                                                if (!var19_20 /* !! */ [var9_40].matcher((CharSequence)var16_22).find()) continue;
                                                var8_39 = 0;
                                                break block42;
                                            }
                                            var8_39 = 1;
                                        }
                                        if (var8_39 == 0) continue;
                                        var18_7.add(var16_22);
                                        continue;
                                        catch (Exception var11_9) {
                                            break block43;
                                        }
                                    }
                                    var4_6 /* !! */  = var2_2 /* !! */ ;
                                    var8_39 = ((Object)var11_8).length;
                                    for (var6_37 = 0; var6_37 < var8_39; ++var6_37) {
                                        block44: {
                                            var19_20 /* !! */  = var11_8[var6_37];
                                            if (!AppYs.g.matcher((CharSequence)var19_20 /* !! */ ).find()) continue;
                                            var16_22 = AppYs.j;
                                            var9_40 = ((Pattern[])var16_22).length;
                                            for (var7_38 = 0; var7_38 < var9_40; ++var7_38) {
                                                if (!var16_22[var7_38].matcher((CharSequence)var19_20 /* !! */ ).find()) continue;
                                                var7_38 = 0;
                                                break block44;
                                            }
                                            var7_38 = 1;
                                        }
                                        var11_8 = var16_22 = var11_8;
                                        if (var7_38 == 0) continue;
                                        var18_7.add(var19_20 /* !! */ );
                                        var11_8 = var16_22;
                                    }
                                    if (var18_7.size() <= 0 || !((String)var18_7.get(0)).contains(cYh.d("5A"))) ** GOTO lbl245
                                    var16_22 = (String)var18_7.get(0);
                                    var10_14 = var16_22.contains(cYh.d("0F243521"));
                                    var18_7 = cYh.d("49");
                                    var19_20 /* !! */  = cYh.d("497E");
                                    if (!var10_14) ** GOTO lbl210
                                    var20_25 = AppYs.h.matcher((CharSequence)var16_22);
                                    var11_8 = var16_22;
                                    if (var20_25.find()) {
                                        var11_8 = var20_25.group(0).replace((CharSequence)var19_20 /* !! */ , (CharSequence)var18_7).replace(cYh.d("1139317F36351339203F7936082624"), cYh.d("1139317F303B0824283039740B3F3734"));
                                    }
                                    break block45;
lbl210:
                                    // 1 sources

                                    if (!var16_22.contains(cYh.d("487F"))) ** GOTO lbl222
                                    var20_25 = AppYs.h.matcher((CharSequence)var16_22);
                                    var11_8 = var16_22;
                                    if (var20_25.find()) {
                                        var11_8 = new StringBuilder();
                                        var11_8.append(cYh.d("0F2435216D"));
                                        var11_8.append(var20_25.group(0).replace((CharSequence)var19_20 /* !! */ , (CharSequence)var18_7));
                                        var11_8 = var11_8.toString();
                                    }
                                    break block45;
lbl222:
                                    // 1 sources

                                    var20_25 = AppYs.i.matcher((CharSequence)var1_1);
                                    var11_8 = var16_22;
                                    if (!var20_25.find()) break block45;
                                    var21_23 = AppYs.h.matcher((CharSequence)var1_1);
                                    var11_8 = var16_22;
                                    if (!var21_23.find()) break block45;
                                    var11_8 = new StringBuilder();
                                    try {
                                        var11_8.append(var20_25.group(0));
                                        var11_8.append(var21_23.group(0).replace((CharSequence)var19_20 /* !! */ , (CharSequence)var18_7));
                                        var11_8 = var11_8.toString();
                                    }
                                    catch (Exception var2_3) {
                                        break block46;
                                    }
                                }
                                try {
                                    this.b.put((String)var17_15, (String)var11_8);
                                    break block47;
lbl245:
                                    // 1 sources

                                    this.b.put((String)var17_15, cYh.d("0F2435216D7548616F60666D49617463796854697B626E6A57606E6E22280B6D"));
                                }
                                catch (Exception var2_4) {
                                    break block46;
                                }
                                catch (Exception var11_10) {
                                    // empty catch block
                                }
                            }
                            var4_6 /* !! */  = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var11_8;
                            break block46;
                            catch (Exception var11_11) {
                                var4_6 /* !! */  = var2_2 /* !! */ ;
                                var2_2 /* !! */  = var11_11;
                            }
                            break block46;
                            catch (Exception var11_12) {
                                var4_6 /* !! */  = var2_2 /* !! */ ;
                                var2_2 /* !! */  = var11_12;
                            }
                        }
                        SpiderDebug.log((Throwable)var2_2 /* !! */ );
                    }
                    var2_2 /* !! */  = var4_6 /* !! */ ;
                }
                var2_2 /* !! */  = var13_16;
                var1_1 = var12_13;
                break block49;
            }
            if (AppYs.e.matcher((CharSequence)var1_1).find()) {
                var3_5.put(var31_32, (Object)var2_2 /* !! */ .optString(var31_32, (String)var4_6 /* !! */ ));
                var1_1 = cYh.d("1339353D32");
                var3_5.put(var30_31, (Object)var2_2 /* !! */ .getString((String)var1_1));
                var3_5.put(var29_30, (Object)var2_2 /* !! */ .getString(cYh.d("0E3D260E22280B")));
                var3_5.put((String)var21_23, (Object)this.n(var2_2 /* !! */ .optJSONArray(cYh.d("13293134"))));
                var3_5.put(var27_29, (Object)var2_2 /* !! */ .optString(cYh.d("172523253E3702")));
                var3_5.put(var26_28, (Object)this.n(var2_2 /* !! */ .optJSONArray(cYh.d("06222430"))));
                var3_5.put(var24_27, (Object)var2_2 /* !! */ .optString(cYh.d("1322343F3C")));
                var3_5.put(var23_26, (Object)this.n(var2_2 /* !! */ .optJSONArray(cYh.d("0633353E25"))));
                var3_5.put((String)var20_25, (Object)this.n(var2_2 /* !! */ .optJSONArray(cYh.d("03393334342E0822"))));
                var3_5.put(var22_24, (Object)var2_2 /* !! */ .optString(cYh.d("0E3E352338")));
                var13_16 = var2_2 /* !! */ .getJSONObject(cYh.d("1139253438360E2335"));
                var16_22 = var13_16.keys();
                while (var16_22.hasNext()) {
                    var4_6 /* !! */  = (String)var16_22.next();
                    var15_18 = var13_16.getJSONArray((String)var4_6 /* !! */ );
                    var17_15 = new ArrayList<E>();
                    for (var5_36 = 0; var5_36 < var15_18.length(); ++var5_36) {
                        var2_2 /* !! */  = var15_18.getJSONObject(var5_36);
                        var18_7 = new StringBuilder();
                        var18_7.append(var2_2 /* !! */ .getString((String)var1_1));
                        var18_7.append(cYh.d("43"));
                        var18_7.append(var2_2 /* !! */ .getString(var14_17));
                        var17_15.add(var18_7.toString());
                    }
                    var12_13.add(AppYs.o((String)var4_6 /* !! */ ));
                    var11_8.add(TextUtils.join((CharSequence)cYh.d("44"), (Iterable)var17_15));
                }
            }
            var1_1 = var12_13;
            var2_2 /* !! */  = var11_8;
        }
        var4_6 /* !! */  = cYh.d("437465");
        var1_1 = TextUtils.join((CharSequence)var4_6 /* !! */ , (Iterable)var1_1);
        var3_5.put(cYh.d("113F250E273606291E3725350A"), var1_1);
        var1_1 = TextUtils.join((CharSequence)var4_6 /* !! */ , (Iterable)var2_2 /* !! */ );
        var3_5.put(cYh.d("113F250E273606291E242536"), var1_1);
    }

    private void f(String object, JSONObject jSONObject) {
        block20: {
            String string;
            block35: {
                String string2;
                block13: {
                    String string3;
                    block7: {
                        CharSequence charSequence;
                        block15: {
                            Object object2;
                            block32: {
                                String string4;
                                block8: {
                                    block36: {
                                        boolean bl;
                                        block38: {
                                            block37: {
                                                block16: {
                                                    int n2;
                                                    block25: {
                                                        block17: {
                                                            block27: {
                                                                String string5;
                                                                block34: {
                                                                    block29: {
                                                                        String string6;
                                                                        String string7;
                                                                        block33: {
                                                                            Object object3;
                                                                            String string8;
                                                                            block30: {
                                                                                String string9;
                                                                                block31: {
                                                                                    block21: {
                                                                                        String string10;
                                                                                        String string11;
                                                                                        block23: {
                                                                                            block28: {
                                                                                                block26: {
                                                                                                    block24: {
                                                                                                        block6: {
                                                                                                            block18: {
                                                                                                                block22: {
                                                                                                                    block19: {
                                                                                                                        block5: {
                                                                                                                            block14: {
                                                                                                                                block10: {
                                                                                                                                    block11: {
                                                                                                                                        block12: {
                                                                                                                                            block9: {
                                                                                                                                                bl = ((String)object).contains(cYh.d("053128352274043F2C"));
                                                                                                                                                string2 = cYh.d("173C202802280B");
                                                                                                                                                string3 = cYh.d("1731332232");
                                                                                                                                                string = cYh.d("12222D");
                                                                                                                                                if (!bl) break block7;
                                                                                                                                                string4 = ((String)object).split(cYh.d("10347C"))[1];
                                                                                                                                                bl = string4.contains(cYh.d("03252E3522351D296F323837"));
                                                                                                                                                charSequence = cYh.d("0F3520353228");
                                                                                                                                                if (bl || string4.contains(cYh.d("14252E2838740433"))) break block8;
                                                                                                                                                if (!string4.contains(cYh.d("1F3638"))) break block9;
                                                                                                                                                object = new JSONObject(com.github.catvod.spider.merge.k.g.g(string4, null));
                                                                                                                                                jSONObject.put(string3, 0);
                                                                                                                                                jSONObject.put(string2, (Object)"");
                                                                                                                                                jSONObject.put(string, (Object)object.getString(string));
                                                                                                                                                object = cYh.d("1C723334313F153533736D7847313121302F0620287F3B330F312E28223449242E216D6B5665756275764505323425772637243F23785D7261153628137F737F666E47782530252E5D392E7875271A");
                                                                                                                                                break block10;
                                                                                                                                            }
                                                                                                                                            bl = string4.contains(cYh.d("0620287F3E3517352F28223449332E3C6D625F"));
                                                                                                                                            object = cYh.d("5A");
                                                                                                                                            if (!bl) break block11;
                                                                                                                                            if (!string4.contains(cYh.d("0F242C3D"))) break block12;
                                                                                                                                            charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("0F2435212460487F20213E740A633469792E116A7467606248382E3C32750620286E232317357C28247C1239256C656954677060713102297C3530330B3F34271111290212060F685366767722280B6D"));
                                                                                                                                            ((StringBuilder)charSequence).append(string4.split((String)object)[1]);
                                                                                                                                            object = new JSONObject(com.github.catvod.spider.merge.k.g.g(((StringBuilder)charSequence).toString(), null)).getString(string);
                                                                                                                                            jSONObject.put(string3, 0);
                                                                                                                                            break block13;
                                                                                                                                        }
                                                                                                                                        jSONObject.put(string3, 1);
                                                                                                                                        jSONObject.put(string2, (Object)"");
                                                                                                                                        jSONObject.put(string, (Object)string4);
                                                                                                                                        jSONObject.put(cYh.d("1231"), (Object)cYh.d("2A3F3B383B36067F747F677A30392F35382D146171"));
                                                                                                                                        object = cYh.d("1C721334313F153533736D780F2435212460487F3422322849392E2132341E252F7F34350A6A7463677512232423782C0E34243E78781A");
                                                                                                                                        break block10;
                                                                                                                                    }
                                                                                                                                    if (!string4.contains(cYh.d("0431357F203101392D347939083D"))) break block14;
                                                                                                                                    jSONObject.put(string3, 0);
                                                                                                                                    jSONObject.put(string2, (Object)"");
                                                                                                                                    jSONObject.put(string, (Object)string4);
                                                                                                                                    object = cYh.d("1C72142232284A112634392E456A63711B3B11366E646F7456626F60676A457C6303323C0222242375604570363A31330B356F323837452D");
                                                                                                                                }
                                                                                                                                CharSequence charSequence2 = charSequence;
                                                                                                                                break block15;
                                                                                                                            }
                                                                                                                            if (!string4.contains((CharSequence)object) && string4.indexOf(cYh.d("493D72246F")) > 15 || string4.indexOf(string8 = cYh.d("493D3165")) > 15 || string4.contains(cYh.d("483F233B782E0823"))) break block16;
                                                                                                                            if (!string4.contains((CharSequence)object)) break block17;
                                                                                                                            object3 = new HashMap<String, String>();
                                                                                                                            String string12 = cYh.d("322324237A1B00352F25");
                                                                                                                            String string13 = cYh.d("2A3F3B383B36067F747F677A263E2523383303");
                                                                                                                            ((HashMap)object3).put(string12, string13);
                                                                                                                            TreeMap<String, List<String>> treeMap = new TreeMap<String, List<String>>();
                                                                                                                            string11 = com.github.catvod.spider.merge.k.g.j(string4, object3, treeMap);
                                                                                                                            object = com.github.catvod.spider.merge.k.g.d(treeMap);
                                                                                                                            string9 = cYh.d("05392D3835330B396F323837");
                                                                                                                            string10 = cYh.d("0A3735277939083D");
                                                                                                                            string7 = cYh.d("5B38353C3B");
                                                                                                                            string5 = cYh.d("12222D6C");
                                                                                                                            if (object == null) break block18;
                                                                                                                            object2 = "";
                                                                                                                            while (object != null) {
                                                                                                                                if (((String)object).indexOf(string8) <= 30) {
                                                                                                                                    ((HashMap)object3).put((String)string12, (String)string13);
                                                                                                                                    string11 = com.github.catvod.spider.merge.k.g.j((String)object, object3, treeMap);
                                                                                                                                    String string14 = com.github.catvod.spider.merge.k.g.d(treeMap);
                                                                                                                                    object2 = object;
                                                                                                                                    object = string14;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                break block5;
                                                                                                                            }
                                                                                                                            object = object2;
                                                                                                                        }
                                                                                                                        if (((String)object).contains(cYh.d("5A38352527")) || ((String)object).contains(string5)) break block19;
                                                                                                                        bl = string4.contains(cYh.d("1027367F3A3D13266F323837"));
                                                                                                                        jSONObject.put(string3, 0);
                                                                                                                        jSONObject.put(string2, (Object)"");
                                                                                                                        jSONObject.put(string, object);
                                                                                                                        if (!bl) break block20;
                                                                                                                        break block21;
                                                                                                                    }
                                                                                                                    if (!string11.contains(string7)) break block22;
                                                                                                                    jSONObject.put(string3, 1);
                                                                                                                    jSONObject.put(string2, (Object)"");
                                                                                                                    jSONObject.put(string, object);
                                                                                                                    break block20;
                                                                                                                }
                                                                                                                object2 = new JSONObject(string11).getString(string);
                                                                                                                jSONObject.put(string3, 0);
                                                                                                                jSONObject.put(string2, (Object)"");
                                                                                                                jSONObject.put(string, object2);
                                                                                                                if (((String)object).contains(string10)) break block21;
                                                                                                                ((String)object).contains(string9);
                                                                                                                break block20;
                                                                                                            }
                                                                                                            bl = string11.contains(string7);
                                                                                                            object2 = cYh.d("0F2435212460487F2B297938063E3824393D4928382B6D6D5069787E273606292423786512222D6C");
                                                                                                            string8 = cYh.d("0F2435216D7548616F60666D49617463796854697B626E6A57606E6E22280B6D");
                                                                                                            string7 = cYh.d("15352F2332340A39");
                                                                                                            object3 = cYh.d("0F243521");
                                                                                                            string6 = cYh.d("0F2435216D7548273626796B5768713A36344933227E3D330228287E25280A396F213F2A5825333D6A");
                                                                                                            if (!bl) break block23;
                                                                                                            object = k;
                                                                                                            n2 = ((JSONObject)object).length;
                                                                                                            for (int i2 = 0; i2 < n2; ++i2) {
                                                                                                                if (!((Pattern)object[i2]).matcher(string11).find()) continue;
                                                                                                                n2 = 1;
                                                                                                                break block6;
                                                                                                            }
                                                                                                            n2 = 0;
                                                                                                        }
                                                                                                        if (n2 == 0) break block24;
                                                                                                        n2 = 1;
                                                                                                        break block25;
                                                                                                    }
                                                                                                    if (!string4.split(string5)[1].contains((CharSequence)object3)) break block26;
                                                                                                    jSONObject.put(string3, 1);
                                                                                                    jSONObject.put(string2, (Object)"");
                                                                                                    object = new StringBuilder();
                                                                                                    ((StringBuilder)object).append(string8);
                                                                                                    charSequence = string4.split(string5)[1];
                                                                                                    break block27;
                                                                                                }
                                                                                                if (!string4.split(string5)[1].contains(string7)) break block28;
                                                                                                jSONObject.put(string3, 1);
                                                                                                jSONObject.put(string2, (Object)"");
                                                                                                object2 = new StringBuilder();
                                                                                                ((StringBuilder)object2).append(string6);
                                                                                                object = string4.split(string5)[1];
                                                                                                break block29;
                                                                                            }
                                                                                            object = string4.split(string5)[1];
                                                                                            jSONObject.put(string3, 1);
                                                                                            jSONObject.put(string2, (Object)"");
                                                                                            object = new StringBuilder();
                                                                                            ((StringBuilder)object).append((String)object2);
                                                                                            charSequence = string4.split(string5)[1];
                                                                                            break block27;
                                                                                        }
                                                                                        try {
                                                                                            object = new JSONObject(string11);
                                                                                            object = object.optString(string);
                                                                                        }
                                                                                        catch (Exception exception) {
                                                                                            exception.printStackTrace();
                                                                                            object = "";
                                                                                        }
                                                                                        if (((String)object).length() <= 1) break block30;
                                                                                        if (!string4.contains(string10)) break block31;
                                                                                        jSONObject.put(string3, 0);
                                                                                        jSONObject.put(string2, (Object)"");
                                                                                        jSONObject.put(string, object);
                                                                                    }
                                                                                    object = cYh.d("1C72142232284A112634392E456A63711A351D392D3D3675527E71737B7A4502243732280222636B757A452D");
                                                                                    break block32;
                                                                                }
                                                                                string4.contains(string9);
                                                                                jSONObject.put(string3, 0);
                                                                                break block13;
                                                                            }
                                                                            if (!string4.split(string5)[1].contains((CharSequence)object3)) break block33;
                                                                            jSONObject.put(string3, 1);
                                                                            jSONObject.put(string2, (Object)"");
                                                                            object = new StringBuilder();
                                                                            ((StringBuilder)object).append(string8);
                                                                            charSequence = string4.split(string5)[1];
                                                                            break block27;
                                                                        }
                                                                        if (!string4.split(string5)[1].contains(string7)) break block34;
                                                                        jSONObject.put(string3, 1);
                                                                        jSONObject.put(string2, (Object)"");
                                                                        object2 = new StringBuilder();
                                                                        ((StringBuilder)object2).append(string6);
                                                                        object = string4.split(string5)[1];
                                                                    }
                                                                    ((StringBuilder)object2).append((String)object);
                                                                    jSONObject.put(string, (Object)((StringBuilder)object2).toString());
                                                                    object = cYh.d("1C721334313F153533736D780F2435216D7548273626796B5768713A36344933227E7527");
                                                                    break block32;
                                                                }
                                                                object = string4.split(string5)[1];
                                                                jSONObject.put(string3, 1);
                                                                jSONObject.put(string2, (Object)"");
                                                                object = new StringBuilder();
                                                                ((StringBuilder)object).append((String)object2);
                                                                charSequence = string4.split(string5)[1];
                                                            }
                                                            ((StringBuilder)object).append((String)charSequence);
                                                            object = ((StringBuilder)object).toString();
                                                            break block35;
                                                        }
                                                        n2 = 0;
                                                    }
                                                    jSONObject.put(string3, n2);
                                                    jSONObject.put(string2, (Object)"");
                                                    break block36;
                                                }
                                                if (!string4.contains(cYh.d("0F232D7F2E2900336F292E20"))) break block37;
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append(cYh.d("0F2435212460487F2B2979231437227F2F231D7F7E2425365A"));
                                                ((StringBuilder)object).append(string4);
                                                object = new JSONObject(com.github.catvod.spider.merge.k.g.g(((StringBuilder)object).toString(), null)).getString(string);
                                                jSONObject.put(string3, 0);
                                                jSONObject.put(string2, (Object)"");
                                                jSONObject.put(string, object);
                                                object = cYh.d("1C721334313F153533736D784738352527295D7F6E28243D047E22327527");
                                                break block32;
                                            }
                                            if (!string4.contains(cYh.d("567E33243E3C023E263D3574043F2C"))) break block38;
                                            jSONObject.put(string3, 0);
                                            jSONObject.put(string2, (Object)"");
                                            jSONObject.put(string, (Object)string4);
                                            object = cYh.d("1C721334313F153533736D784738352527295D7F6E60792812392734393D0B326F323837452D");
                                            break block32;
                                        }
                                        object = Pattern.compile(cYh.d("497A6939232E177E6B78")).matcher(string4);
                                        bl = ((Matcher)object).find();
                                        jSONObject.put(string3, 0);
                                        jSONObject.put(string2, (Object)"");
                                        if (!bl) break block36;
                                        object = ((Matcher)object).group(1);
                                        break block35;
                                    }
                                    jSONObject.put(string, (Object)string4);
                                    break block20;
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append(cYh.d("0F2435212460487F36262074516079613C3B097E2232783B17206F213F2A5825333D6A"));
                                ((StringBuilder)object).append(string4);
                                object = new JSONObject(com.github.catvod.spider.merge.k.g.g(((StringBuilder)object).toString(), null));
                                jSONObject.put(string3, 0);
                                jSONObject.put(string2, (Object)"");
                                jSONObject.put(string, (Object)object.getString(string));
                                object = cYh.d("1C72142232284A112634392E456A63711A351D392D3D3675527E71717F0D0E3E253E2029471E1571666A49607A71001530667578771B17202D34003F051B2825786F54676F62617A4F1B09051A164B702D383C3F471724323C354E70023925350A356E666574577E7267656C49687071043B01313338786F54676F62617A341561637902471D242536091570707F67784B723334313F153533736D784738352527295D7F6E213B3B1E35337F332F0834343E2D2349332E3C7576453F3338303309727B737732132431226D754834317F332F0834343E2D2349332E3C757645182E2223785D72613236390F356F3C642F5F7E32243823087E22327527");
                            }
                            object2 = charSequence;
                        }
                        jSONObject.put((String)charSequence, object);
                        break block20;
                    }
                    jSONObject.put(string3, 1);
                }
                jSONObject.put(string2, (Object)"");
            }
            jSONObject.put(string, object);
        }
    }

    private HashMap<String, String> g(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        string = !(string.contains(cYh.d("0620287F2732177F202127")) || string.contains(cYh.d("1F37202127")) || string.contains(cYh.d("012224343C3B09"))) ? (!(string.contains(cYh.d("1D2323")) || string.contains(cYh.d("013B3922")) || string.contains(cYh.d("1F313822")) || string.contains(cYh.d("1F333822")) || string.contains(cYh.d("142A3822")) || string.contains(cYh.d("03283822")) || string.contains(cYh.d("1E243822")) || string.contains(cYh.d("163E3822"))) ? (string.contains(cYh.d("49262E35")) ? cYh.d("083B2925232A48646F60796A") : cYh.d("23312D273E3148626F60796A")) : cYh.d("233133257868496174717F3E0622356B3E354E")) : cYh.d("233133257868496175717F3E0622356B3E354E");
        hashMap.put(cYh.d("322324237A1B00352F25"), string);
        return hashMap;
    }

    /*
     * Unable to fully structure code
     */
    private String h(String var1_1, String var2_2) {
        block15: {
            block19: {
                block20: {
                    block14: {
                        block17: {
                            block18: {
                                block16: {
                                    if (!AppYs.f.matcher(var1_1).find()) break block16;
                                    if (this.b.containsKey(var2_2)) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var4_3 = this.b.get(var2_2);
                                            break block14;
                                            break;
                                        }
                                    }
                                    break block17;
                                }
                                if (var1_1.contains(cYh.d("0620287F2732177F20212775"))) break block18;
                                var4_3 = var1_1;
                                if (!var1_1.contains(cYh.d("1F37202127"))) break block14;
                            }
                            ** while (this.b.containsKey((Object)var2_2))
                        }
                        var4_3 = "";
                    }
                    var3_4 = var4_3.contains(cYh.d("1426282179300F29343F79301F7E223F"));
                    var5_5 = cYh.d("0F2435212460487F2B29792A062236382F74043F2C6B636E54636E213B3B1E35337E682F153C7C");
                    if (var3_4 || var4_3.contains(cYh.d("1426282179300F343826792C0E20"))) break block19;
                    if (var4_3.contains(cYh.d("0D38323B7937063E25243F2F49332E3C")) || var4_3.contains(cYh.d("117E2B393323107E373827750938252B616C51"))) break block20;
                    var1_1 = var4_3;
                    if (!var4_3.contains(cYh.d("1F7D2F7F3439"))) break block15;
                }
                while (true) {
                    var1_1 = var5_5;
                    break block15;
                    break;
                }
            }
            if (var2_2.contains(cYh.d("83EAFBB5EDE08FEFF6"))) {
                var1_1 = cYh.d("0F2435216D7548273626796B5768713A36344933227E3D330228287E25280A396F213F2A5825333D6A");
            } else if (var2_2.contains(cYh.d("83EAFBB5EDE0"))) {
                var1_1 = cYh.d("0F2435216D7548273626796B5768713A36344933227E3D330228287E252849202921682F153C7C");
            } else {
                if (!var2_2.contains(cYh.d("80C5EBB9DBDE"))) ** continue;
                var1_1 = cYh.d("0F2435216D7548273626796B5768713A36344933227E3D330228287E312B49202921682F153C7C");
            }
        }
        return var1_1;
    }

    private String j(String charSequence, String string, String string2) {
        boolean bl = ((String)charSequence).contains(cYh.d("1F37202127"));
        String string3 = cYh.d("1F3638");
        String string4 = cYh.d("483F233B782E0823");
        String string5 = cYh.d("493D3165");
        String string6 = cYh.d("493D72246F");
        String string7 = cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C");
        String string8 = cYh.d("12222D6C");
        if (!(bl || ((String)charSequence).contains(cYh.d("0620287F2732177F20212775")) || ((String)charSequence).contains(cYh.d("49262E35")))) {
            if (e.matcher(charSequence).find()) {
                if (string2.indexOf(string6) <= 15 && string2.indexOf(string5) <= 15 && !string2.contains(string4)) {
                    if (string2.contains(string3)) {
                        if (string2.contains(string8)) {
                            charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E176A6E7E343B0438247F333713246F292E20482827283D22482827283D2249202921682F153C7C"));
                            ((StringBuilder)charSequence).append(string2.split(string8)[1]);
                            return ((StringBuilder)charSequence).toString();
                        }
                        return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E7830143F2F7F3F3C1E22367F34350A7F2C303874003F7E2425365A"), string2);
                    }
                    if (string2.contains(cYh.d("1027367F35330B3923383B3349332E3C"))) {
                        charSequence = string2.split(string8)[1];
                        return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E78301F7E3130252D0E286F3238375D6475626475173C20283228486F34233B67"), (String)charSequence);
                    }
                    if (!(((String)charSequence).contains(cYh.d("1D38243F3123")) || ((String)charSequence).contains(string = cYh.d("042A3527")) || ((String)charSequence).contains(cYh.d("567E7065796C547E706166")) || ((String)charSequence).contains(cYh.d("0139356B6F")) || ((String)charSequence).contains(cYh.d("03392D383C2E117E39282D")) || ((String)charSequence).contains(cYh.d("17203B392274113931")) || ((String)charSequence).contains(cYh.d("0620287F6F3E5F216F323837")) || ((String)charSequence).contains(cYh.d("0F312E3A36340D25707F3439")) || ((String)charSequence).contains(string))) {
                        if (!(((String)charSequence).contains(cYh.d("0B2838282E")) || ((String)charSequence).contains(cYh.d("0D7E3B3B3D740B392734")) || ((String)charSequence).contains(cYh.d("0B3B3527")) || ((String)charSequence).contains(cYh.d("57687069232C")) || ((String)charSequence).contains(cYh.d("15252E293E340227")))) {
                            return n.a(string7, string2);
                        }
                        charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E782A0B31387F23311E236F2521755825333D6A"));
                        ((StringBuilder)charSequence).append(string2.split(string8)[1]);
                        return ((StringBuilder)charSequence).toString();
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string7);
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append(cYh.d("413131216A6B57607161713B04332E24392E5A627663606D52607369712A062332263828036D3020656D5567766467685F"));
                    return ((StringBuilder)charSequence).toString();
                }
                if (string2.contains(string8)) {
                    charSequence = com.github.catvod.spider.merge.d.d.b(string7);
                    ((StringBuilder)charSequence).append(string2.split(string8)[1]);
                    return ((StringBuilder)charSequence).toString();
                }
                return n.a(string7, string2);
            }
            return n.a(string7, string2);
        }
        if (string2.indexOf(string6) <= 15 && string2.indexOf(string5) <= 15 && !string2.contains(string4)) {
            if (!string.contains(string8) && string2.contains(cYh.d("353F2F360F3309371703"))) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E783C0623357F253509373938393D11226F3239605F687767783B17396E6E3C3F1E6D2F023F0D123D06351A130504363F300E0519672425365A"), string2);
            }
            if (!string.contains(string8) && string2.contains(cYh.d("2B04"))) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E783C507E31282F3E03336F3238374832223B2F75533B6F213F2A5825333D6A"), string2);
            }
            if (!string.contains(string8) && string2.contains(cYh.d("15352F2332340A39"))) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E78311232207F253F0922243F3A334933226B656851666E302733486F2A342E673E6614081B03133A083C03192C3578691D1E4125333D6A"), string2);
            }
            if (!string.contains(string8) && string2.contains(cYh.d("4938353C3B"))) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E176A6E7E66745661767F666F557E73626E605469716167755825333D6A"), string2);
            }
            if (string2.contains(string3)) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E176A6E7E3D330228287F2E2F093C6F3234750620287E683102297C290E142203180221121761050765390C1B327722280B6D"), string2);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string7);
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(string2);
            return ((StringBuilder)charSequence).toString();
        }
        if (string2.contains(string8)) {
            charSequence = com.github.catvod.spider.merge.d.d.b(string7);
            ((StringBuilder)charSequence).append(string2.split(string8)[1]);
            return ((StringBuilder)charSequence).toString();
        }
        return n.a(string7, string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private String l(String charSequence, String string) {
        block9: {
            String string2;
            String string3;
            block7: {
                block8: {
                    boolean bl = ((String)charSequence).contains(cYh.d("49262E35"));
                    string3 = cYh.d("412020363267");
                    if (!bl) break block8;
                    if (((String)charSequence).contains(cYh.d("0E3F31343923123E6F323837"))) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)charSequence);
                        string2 = cYh.d("483C2822236510347C");
                        charSequence = stringBuilder;
                        break block7;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)charSequence);
                        string2 = cYh.d("5827256C");
                        charSequence = stringBuilder;
                    }
                    break block7;
                }
                if (((String)charSequence).contains(cYh.d("0620287F2732177F202127")) || ((String)charSequence).contains(cYh.d("1F37202127"))) break block9;
                if (!e.matcher(charSequence).find()) return "";
                if (!(((String)charSequence).contains(cYh.d("0223243D3B3B12242E")) || ((String)charSequence).contains(cYh.d("567E7065796C547E706166")) || ((String)charSequence).contains(cYh.d("1D3A3822")) || ((String)charSequence).contains(cYh.d("033325")) || ((String)charSequence).contains(cYh.d("0B283434")) || ((String)charSequence).contains(cYh.d("10352425363349332F")) || ((String)charSequence).contains(cYh.d("0F312E3A36340D2570")) || ((String)charSequence).contains(cYh.d("0139356B6F")) || ((String)charSequence).contains(cYh.d("1D3A2B7F3B330135")) || ((String)charSequence).contains(cYh.d("0B3F37346E635F69")) || ((String)charSequence).contains(cYh.d("5F347920")) || ((String)charSequence).contains(cYh.d("0B3B6F212F2F09")) || ((String)charSequence).contains(cYh.d("0F373829")) || ((String)charSequence).contains(cYh.d("5262702962")) || ((String)charSequence).contains(cYh.d("0B2838282E")) || ((String)charSequence).contains(cYh.d("57687069232C")) || ((String)charSequence).contains(cYh.d("0339383E2233")) || ((String)charSequence).contains(cYh.d("03392D383C2E11")) || ((String)charSequence).contains(cYh.d("17203B3922")) || ((String)charSequence).contains(cYh.d("06393534242F043128")) || ((String)charSequence).contains(cYh.d("1D2A6F323E")) || ((String)charSequence).contains(cYh.d("0438393B3834")) || ((String)charSequence).contains(cYh.d("103135323F370E")) || ((String)charSequence).contains(cYh.d("1139313327")) || ((String)charSequence).contains(cYh.d("05383527")) || ((String)charSequence).contains(cYh.d("1F36383A3B")))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence);
                    string2 = cYh.d("5831226C3B331424672B3A67");
                    charSequence = stringBuilder;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence);
                    string2 = cYh.d("5831226C3B33142467263367");
                    charSequence = stringBuilder;
                }
            }
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(string3);
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

    private boolean m(String string) {
        boolean bl = string.equals(cYh.d("83ECE7B6C7DC")) || string.equals(cYh.d("81D3C4B9DEE8")) || string.equals(cYh.d("80F6CEB4DFF3"));
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String o(String string) {
        Object object = d;
        synchronized (object) {
            if (c == null) {
                HashMap<String, String> hashMap = new HashMap<String, String>();
                c = hashMap;
                hashMap.put(cYh.d("1E3F343A22"), cYh.d("83ECD9B8D2ED2A"));
                c.put(cYh.d("1621"), cYh.d("8FD5FFB9F9F52A"));
                c.put(cYh.d("0E2128283E"), cYh.d("80D8F0B4F2DD8FD9FB1C"));
                c.put(cYh.d("16393838"), cYh.d("82F5C6B9DEE02A"));
                c.put(cYh.d("0B353527"), cYh.d("83E9D1B9F0DC2A"));
                c.put(cYh.d("143F2924"), cYh.d("81C0DDB6DCCA2A"));
                c.put(cYh.d("1325253E22"), cYh.d("82CCDEB9E6DC2A"));
                c.put(cYh.d("17203527"), cYh.d("370015071A"));
                c.put(cYh.d("0A373527"), cYh.d("8FDAD3B7C9C633060C"));
                c.put(cYh.d("10313224"), cYh.d("82DDCFB7C2EA2A"));
                c.put(cYh.d("05392D3835330B39"), cYh.d("82C3D5B4C4F32A"));
            }
            if (!c.containsKey(string)) return string;
            return c.get(string);
        }
    }

    final String c(String string) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String categoryContent(String var1_1, String var2_6, boolean var3_7, HashMap<String, String> var4_8) {
        block46: {
            block44: {
                block43: {
                    block41: {
                        block42: {
                            block40: {
                                block39: {
                                    block38: {
                                        block37: {
                                            block36: {
                                                block35: {
                                                    block34: {
                                                        block33: {
                                                            block32: {
                                                                block31: {
                                                                    var14_9 = cYh.d("1E352023");
                                                                    var15_10 = cYh.d("0B312F36");
                                                                    var16_11 = cYh.d("06222430");
                                                                    var17_12 = cYh.d("043C202224");
                                                                    var8_13 = cYh.d("133F35303B2A063724");
                                                                    var11_14 = cYh.d("0B392C3823");
                                                                    var7_15 = cYh.d("113F250E3E3E");
                                                                    var10_16 = cYh.d("133F35303B");
                                                                    var12_17 = cYh.d("173126343435123E35");
                                                                    var9_18 = cYh.d("0B393225");
                                                                    var13_19 = cYh.d("03313530");
                                                                    var19_20 = this.a;
                                                                    var18_21 = new StringBuilder();
                                                                    var18_21.append(this.c(var19_20));
                                                                    var18_21.append(var1_1 /* !! */ );
                                                                    var1_1 /* !! */  = !var19_20.contains(cYh.d("0620287F2732177F202127")) && !var19_20.contains(cYh.d("1F37202127")) ? (var19_20.contains(cYh.d("49262E35")) ? cYh.d("41332D3024295AB7ECCABEDAEE332D30242941313334366780FDDAB8D7D3062224307136063E266CB0F7FCB9C1D83B3B09376728323B156DA6FCCCB3E7D9383436284132386CB1D4F5B5FBDE71360E3D28256A6B5F763130303F5A73111F74") : cYh.d("41202036326744000F72713B1535206CB0F7FCB9C1D83628023167252E2A026DA6FCCCB3E7D9223D3629147632253628136DA6FCCCB3E7D938343628")) : cYh.d("41332D3024295AB7ECCABEDAEE332D30242941313334366780FDDAB8D7D3062224307136063E266CB0F7FCB9C1D83B3B09376728323B156DA6FCCCB3E7D938343628413C283C3E2E5A617977273D5A73111F74");
                                                                    var18_21.append(var1_1 /* !! */ );
                                                                    var18_21 = var18_21.toString().replace(cYh.d("44000F72"), var2_6);
                                                                    var19_20 = cYh.d("80FDDAB8D7D3043C202224");
                                                                    if (var4_8 /* !! */  == null) break block31;
                                                                    if (!var4_8 /* !! */ .containsKey(var17_12)) break block31;
                                                                    var1_1 /* !! */  = var4_8 /* !! */ .get(var17_12);
                                                                    break block32;
                                                                }
                                                                var1_1 /* !! */  = "";
                                                            }
                                                            var18_21 = var18_21.replace(var19_20, var1_1 /* !! */ );
                                                            var17_12 = cYh.d("80FDDAB8D7D306222430");
                                                            if (var4_8 /* !! */  == null) break block33;
                                                            if (!var4_8 /* !! */ .containsKey(var16_11)) break block33;
                                                            var1_1 /* !! */  = var4_8 /* !! */ .get(var16_11);
                                                            break block34;
                                                        }
                                                        var1_1 /* !! */  = "";
                                                    }
                                                    var17_12 = var18_21.replace(var17_12, var1_1 /* !! */ );
                                                    var16_11 = cYh.d("80FDDAB8D7D30B312F36");
                                                    if (var4_8 /* !! */  == null) break block35;
                                                    if (!var4_8 /* !! */ .containsKey(var15_10)) break block35;
                                                    var1_1 /* !! */  = var4_8 /* !! */ .get(var15_10);
                                                    break block36;
                                                }
                                                var1_1 /* !! */  = "";
                                            }
                                            var16_11 = var17_12.replace(var16_11, var1_1 /* !! */ );
                                            var15_10 = cYh.d("80FDDAB8D7D31E352023");
                                            if (var4_8 /* !! */  == null) break block37;
                                            if (!var4_8 /* !! */ .containsKey(var14_9)) break block37;
                                            var1_1 /* !! */  = var4_8 /* !! */ .get(var14_9);
                                            break block38;
                                        }
                                        var1_1 /* !! */  = "";
                                    }
                                    var14_9 = var16_11.replace(var15_10, var1_1 /* !! */ );
                                    var15_10 = cYh.d("81DED3B4EDD5");
                                    if (var4_8 /* !! */  != null) {
                                        if (!var4_8 /* !! */ .containsKey(var15_10)) break block39;
                                        var1_1 /* !! */  = var4_8 /* !! */ .get(var15_10);
                                        break block40;
                                    }
                                }
                                var1_1 /* !! */  = "";
                            }
                            var1_1 /* !! */  = var14_9.replace(var15_10, var1_1 /* !! */ );
                            SpiderDebug.log((String)var1_1 /* !! */ );
                            var1_1 /* !! */  = com.github.catvod.spider.merge.k.g.g(var1_1 /* !! */ , this.g(var1_1 /* !! */ ));
                            var4_8 /* !! */  = new JSONObject(var1_1 /* !! */ );
                            if (var4_8 /* !! */ .has(var8_13) && var4_8 /* !! */ .get(var8_13) instanceof Integer) {
                                var5_22 = var4_8 /* !! */ .getInt(var8_13);
                                break block41;
                            }
                            if (var4_8 /* !! */ .has(var12_17) && var4_8 /* !! */ .get(var12_17) instanceof Integer) {
                                var5_22 = var4_8 /* !! */ .getInt(var12_17);
                                break block41;
                            }
                            if (!var4_8 /* !! */ .has(var13_19) || !(var4_8 /* !! */ .get(var13_19) instanceof JSONObject) || !var4_8 /* !! */ .getJSONObject(var13_19).has(var10_16) || !(var4_8 /* !! */ .getJSONObject(var13_19).get(var10_16) instanceof Integer) || !var4_8 /* !! */ .getJSONObject(var13_19).has(var11_14) || !(var4_8 /* !! */ .getJSONObject(var13_19).get(var11_14) instanceof Integer)) break block42;
                            var6_23 = var4_8 /* !! */ .getJSONObject(var13_19).getInt(var11_14);
                            var5_22 = var4_8 /* !! */ .getJSONObject(var13_19).getInt(var10_16);
                            if (var5_22 % var6_23 != 0) ** GOTO lbl96
                            try {
                                var5_22 /= var6_23;
                                break block41;
lbl96:
                                // 1 sources

                                var5_22 /= var6_23;
                                ++var5_22;
                                break block41;
                            }
                            catch (Exception var1_2) {
                                SpiderDebug.log((Throwable)var1_2);
                            }
                        }
                        var5_22 = 0x7FFFFFFF;
                    }
                    var8_13 = null;
                    var14_9 = new JSONArray();
                    if (!var4_8 /* !! */ .has(var9_18) || !(var4_8 /* !! */ .get(var9_18) instanceof JSONArray)) ** GOTO lbl114
                    var1_1 /* !! */  = var4_8 /* !! */ ;
                    while (true) {
                        var1_1 /* !! */  = var1_1 /* !! */ .getJSONArray(var9_18);
                        break block43;
                        break;
                    }
lbl114:
                    // 1 sources

                    if (var4_8 /* !! */ .has(var13_19) && var4_8 /* !! */ .get(var13_19) instanceof JSONObject && var4_8 /* !! */ .getJSONObject(var13_19).has(var9_18) && var4_8 /* !! */ .getJSONObject(var13_19).get(var9_18) instanceof JSONArray) {
                        var1_1 /* !! */  = var4_8 /* !! */ .getJSONObject(var13_19);
                        ** continue;
                    }
                    var1_1 /* !! */  = var8_13;
                    if (!var4_8 /* !! */ .has(var13_19)) break block43;
                    var1_1 /* !! */  = var8_13;
                    if (!(var4_8 /* !! */ .get(var13_19) instanceof JSONArray)) break block43;
                    var1_1 /* !! */  = var4_8 /* !! */ .getJSONArray(var13_19);
                }
                if (var1_1 /* !! */  == null) break block44;
                var6_23 = 0;
                while (true) {
                    block45: {
                        if (var6_23 >= var1_1 /* !! */ .length()) break;
                        var8_13 = var1_1 /* !! */ .getJSONObject(var6_23);
                        var3_7 = var8_13.has(var7_15);
                        var15_10 = cYh.d("113F250E253F0A31333A24");
                        var13_19 = cYh.d("113F250E273304");
                        var4_8 /* !! */  = cYh.d("113F250E393B0A35");
                        if (!var3_7) ** GOTO lbl149
                        var16_11 = new JSONObject();
                        var16_11.put(var7_15, (Object)var8_13.getString(var7_15));
                        var16_11.put((String)var4_8 /* !! */ , (Object)var8_13.getString((String)var4_8 /* !! */ ));
                        var16_11.put(var13_19, (Object)var8_13.getString(var13_19));
                        var16_11.put(var15_10, (Object)var8_13.getString(var15_10));
                        var14_9.put((Object)var16_11);
                        break block45;
lbl149:
                        // 1 sources

                        var16_11 = new JSONObject();
                        var16_11.put(var7_15, (Object)var8_13.getString(cYh.d("093539253B33093B")));
                        var16_11.put((String)var4_8 /* !! */ , (Object)var8_13.getString(cYh.d("1339353D32")));
                        var16_11.put(var13_19, (Object)var8_13.getString(cYh.d("173922")));
                        var16_11.put(var15_10, (Object)var8_13.getString(cYh.d("1424202532")));
                        var14_9.put((Object)var16_11);
                    }
                    ++var6_23;
                    continue;
                    break;
                }
            }
            var1_1 /* !! */  = new JSONObject();
            var1_1 /* !! */ .put(cYh.d("17312634"), (Object)var2_6);
            var1_1 /* !! */ .put(var12_17, var5_22);
            var1_1 /* !! */ .put(var11_14, 90);
            var1_1 /* !! */ .put(var10_16, 0x7FFFFFFF);
            var1_1 /* !! */ .put(var9_18, (Object)var14_9);
            var1_1 /* !! */  = var1_1 /* !! */ .toString();
            return var1_1 /* !! */ ;
            {
                catch (Exception var1_3) {}
            }
            break block46;
            catch (Exception var1_4) {
                // empty catch block
            }
        }
        SpiderDebug.log((Throwable)var1_5);
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final String d(String string) {
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

    public String detailContent(List<String> object) {
        try {
            String string = this.a;
            CharSequence charSequence = new StringBuilder();
            charSequence.append(this.i(string));
            charSequence.append(object.get(0));
            charSequence = charSequence.toString();
            SpiderDebug.log((String)charSequence);
            String string2 = com.github.catvod.spider.merge.k.g.g((String)charSequence, this.g((String)charSequence));
            charSequence = new JSONObject(string2);
            string2 = new JSONObject();
            JSONObject jSONObject = new JSONObject();
            this.b(string, (JSONObject)charSequence, jSONObject, object.get(0));
            object = new JSONArray();
            object.put((Object)jSONObject);
            string2.put(cYh.d("0B393225"), object);
            object = string2.toString();
            return object;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    final String e(String string, JSONObject object) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String homeContent(boolean var1_1) {
        block118: {
            block117: {
                block102: {
                    var22_2 = cYh.d("80FDDAB8D7D3");
                    var14_3 = "";
                    var24_4 = cYh.d("01392D25322814");
                    var17_5 = cYh.d("0B393225");
                    var15_6 = cYh.d("03313530");
                    var9_7 = var14_3;
                    var19_9 = this.d(this.a);
                    var9_7 = var14_3;
                    var6_10 = var19_9.isEmpty();
                    var13_11 /* !! */  = cYh.d("5A");
                    var10_12 /* !! */  = cYh.d("3B7B");
                    var18_13 = cYh.d("6D");
                    var8_14 = null;
                    var12_15 = cYh.d("13293134083303");
                    var11_16 = cYh.d("132931340834063D24");
                    if (!var6_10) {
                        block103: {
                            block101: {
                                var9_7 = var14_3;
                                SpiderDebug.log((String)var19_9);
                                var9_7 = var14_3;
                                var7_17 /* !! */  = com.github.catvod.spider.merge.k.g.g(var19_9, this.g(var19_9));
                                var9_7 = var14_3;
                                var9_7 = var14_3;
                                var16_19 /* !! */  = new JSONObject((String)var7_17 /* !! */ );
                                var9_7 = var14_3;
                                if (!var16_19 /* !! */ .has((String)var17_5)) break block101;
                                var9_7 = var14_3;
                                if (!(var16_19 /* !! */ .get((String)var17_5) instanceof JSONArray)) break block101;
                                var9_7 = var14_3;
                                var7_17 /* !! */  = var16_19 /* !! */ .getJSONArray((String)var17_5);
                                break block102;
                            }
                            var9_7 = var14_3;
                            if (!var16_19 /* !! */ .has((String)var15_6)) break block103;
                            var9_7 = var14_3;
                            if (!(var16_19 /* !! */ .get((String)var15_6) instanceof JSONObject)) break block103;
                            var9_7 = var14_3;
                            if (!var16_19 /* !! */ .getJSONObject((String)var15_6).has((String)var17_5)) break block103;
                            var9_7 = var14_3;
                            if (!(var16_19 /* !! */ .getJSONObject((String)var15_6).get((String)var17_5) instanceof JSONArray)) break block103;
                            var9_7 = var14_3;
                            var7_17 /* !! */  = var16_19 /* !! */ .getJSONObject((String)var15_6).getJSONArray((String)var17_5);
                            break block102;
                        }
                        var7_17 /* !! */  = var8_14;
                        var9_7 = var14_3;
                        if (!var16_19 /* !! */ .has((String)var15_6)) break block102;
                        var7_17 /* !! */  = var8_14;
                        var9_7 = var14_3;
                        if (!(var16_19 /* !! */ .get((String)var15_6) instanceof JSONArray)) break block102;
                        var9_7 = var14_3;
                        var7_17 /* !! */  = var16_19 /* !! */ .getJSONArray((String)var15_6);
                        break block102;
                    }
                    var9_7 = var14_3;
                    var15_6 = this.e(var19_9, null).split(var18_13)[0].split((String)var10_12 /* !! */ );
                    var9_7 = var14_3;
                    var9_7 = var14_3;
                    var8_14 = new JSONArray();
                    var2_20 = 1;
                    while (true) {
                        block104: {
                            var7_17 /* !! */  = var8_14;
                            var9_7 = var14_3;
                            if (var2_20 >= ((String[])var15_6).length) break;
                            var9_7 = var14_3;
                            var7_17 /* !! */  = var15_6[var2_20].trim().split((String)var13_11 /* !! */ );
                            var9_7 = var14_3;
                            if (((JSONArray)var7_17 /* !! */ ).length < 2) break block104;
                            var9_7 = var14_3;
                            var9_7 = var14_3;
                            var16_19 /* !! */  = new JSONObject();
                            var9_7 = var14_3;
                            var16_19 /* !! */ .put((String)var11_16, (Object)var7_17 /* !! */ [0].trim());
                            var9_7 = var14_3;
                            var16_19 /* !! */ .put((String)var12_15, (Object)var7_17 /* !! */ [1].trim());
                            var9_7 = var14_3;
                            var8_14.put((Object)var16_19 /* !! */ );
                        }
                        ++var2_20;
                    }
                }
                var9_7 = var14_3;
                var9_7 = var14_3;
                var25_21 = new JSONObject();
                var9_7 = var14_3;
                var9_7 = var14_3;
                var15_6 = new JSONArray();
                var8_14 = cYh.d("043C202224");
                var16_19 /* !! */  = var14_3;
                var17_5 = var15_6;
                var21_22 = var8_14;
                if (var7_17 /* !! */  == null) break block117;
                var3_23 = 0;
                var20_24 /* !! */  = var7_17 /* !! */ ;
                var7_17 /* !! */  = var14_3;
                var14_3 = var22_2;
                while (true) {
                    block105: {
                        block116: {
                            block106: {
                                block115: {
                                    var16_19 /* !! */  = var7_17 /* !! */ ;
                                    var17_5 = var15_6;
                                    var21_22 = var8_14;
                                    var9_7 = var7_17 /* !! */ ;
                                    if (var3_23 >= var20_24 /* !! */ .length()) break;
                                    var9_7 = var7_17 /* !! */ ;
                                    var17_5 = var20_24 /* !! */ .getJSONObject(var3_23);
                                    var9_7 = var7_17 /* !! */ ;
                                    var16_19 /* !! */  = var17_5.getString((String)var11_16);
                                    var9_7 = var7_17 /* !! */ ;
                                    if (this.m((String)var16_19 /* !! */ )) {
                                        var16_19 /* !! */  = var14_3;
                                        var14_3 = var7_17 /* !! */ ;
                                        var7_17 /* !! */  = var8_14;
                                        var8_14 = var13_11 /* !! */ ;
                                        var9_7 = var10_12 /* !! */ ;
                                        var10_12 /* !! */  = var16_19 /* !! */ ;
                                        var13_11 /* !! */  = var11_16;
                                        var11_16 = var8_14;
                                        var8_14 = var14_3;
                                        break block105;
                                    }
                                    var9_7 = var7_17 /* !! */ ;
                                    var26_28 = var17_5.getString((String)var12_15);
                                    var9_7 = var7_17 /* !! */ ;
                                    var9_7 = var7_17 /* !! */ ;
                                    var22_2 = new JSONObject();
                                    var9_7 = var7_17 /* !! */ ;
                                    var22_2.put((String)var12_15, (Object)var26_28);
                                    var9_7 = var7_17 /* !! */ ;
                                    var22_2.put((String)var11_16, (Object)var16_19 /* !! */ );
                                    var9_7 = var7_17 /* !! */ ;
                                    var16_19 /* !! */  = var17_5.optJSONObject(cYh.d("13293134083F1F24243F33"));
                                    if (!var1_1) break block106;
                                    var9_7 = var7_17 /* !! */ ;
                                    var21_22 = this.e(var19_9, var16_19 /* !! */ ).split(var18_13);
                                    var9_7 = var7_17 /* !! */ ;
                                    var9_7 = var7_17 /* !! */ ;
                                    var27_29 = new JSONArray();
                                    var9_7 = var7_17 /* !! */ ;
                                    var2_20 = var19_9.isEmpty() != false ? 1 : 0;
                                    var16_19 /* !! */  = var12_15;
                                    var17_5 = var10_12 /* !! */ ;
                                    var12_15 = var13_11 /* !! */ ;
                                    var13_11 /* !! */  = var8_14;
                                    var10_12 /* !! */  = var22_2;
                                    while (true) {
                                        block107: {
                                            block110: {
                                                block108: {
                                                    block112: {
                                                        block111: {
                                                            block109: {
                                                                var9_7 = var7_17 /* !! */ ;
                                                                if (var2_20 >= var21_22.length) break;
                                                                var9_7 = var7_17 /* !! */ ;
                                                                var8_14 = var21_22[var2_20].trim();
                                                                var9_7 = var7_17 /* !! */ ;
                                                                if (var8_14.isEmpty()) {
                                                                    var9_7 = var12_15;
                                                                    var8_14 = var11_16;
                                                                    var11_16 = var10_12 /* !! */ ;
                                                                    var10_12 /* !! */  = var8_14;
                                                                    var8_14 = var7_17 /* !! */ ;
                                                                    var7_17 /* !! */  = var13_11 /* !! */ ;
                                                                    break block107;
                                                                }
                                                                var9_7 = var7_17 /* !! */ ;
                                                                var23_27 = var8_14.split((String)var17_5);
                                                                var9_7 = var7_17 /* !! */ ;
                                                                var8_14 = var23_27[0].trim();
                                                                var9_7 = var7_17 /* !! */ ;
                                                                if (!var8_14.contains((CharSequence)var14_3)) break block108;
                                                                var9_7 = var7_17 /* !! */ ;
                                                                var22_2 = var8_14.replace((CharSequence)var14_3, (CharSequence)var7_17 /* !! */ );
                                                                var9_7 = var7_17 /* !! */ ;
                                                                if (!var22_2.equals(var13_11 /* !! */ )) break block109;
                                                                var9_7 = var7_17 /* !! */ ;
                                                                var8_14 = cYh.d("80E1FAB4C9D1");
lbl220:
                                                                // 5 sources

                                                                while (true) {
                                                                    var9_7 = var22_2;
                                                                    var22_2 = var8_14;
                                                                    var8_14 = var9_7;
                                                                    break block110;
                                                                    break;
                                                                }
                                                            }
                                                            var9_7 = var7_17 /* !! */ ;
                                                            if (!var22_2.equals(cYh.d("06222430"))) break block111;
                                                            var9_7 = var7_17 /* !! */ ;
                                                            var8_14 = cYh.d("82CCF1B4DBE0");
                                                            ** GOTO lbl220
                                                        }
                                                        var9_7 = var7_17 /* !! */ ;
                                                        if (!var22_2.equals(cYh.d("0B312F36"))) break block112;
                                                        var9_7 = var7_17 /* !! */ ;
                                                        var8_14 = cYh.d("8FFFECB9FFDA");
                                                        ** GOTO lbl220
                                                    }
                                                    var9_7 = var7_17 /* !! */ ;
                                                    if (!var22_2.equals(cYh.d("1E352023"))) ** GOTO lbl220
                                                    var9_7 = var7_17 /* !! */ ;
                                                    var8_14 = cYh.d("82E9F5B5ECE7");
                                                    ** continue;
                                                }
                                                var22_2 = var8_14;
                                            }
                                            var9_7 = var7_17 /* !! */ ;
                                            var9_7 = var7_17 /* !! */ ;
                                            var28_30 = new JSONObject();
                                            var9_7 = var7_17 /* !! */ ;
                                            var28_30.put(cYh.d("0C3538"), var8_14);
                                            var9_7 = var7_17 /* !! */ ;
                                            var28_30.put(cYh.d("09312C34"), (Object)var22_2);
                                            var9_7 = var7_17 /* !! */ ;
                                            var9_7 = var7_17 /* !! */ ;
                                            var29_31 = new JSONArray();
                                            var4_25 = 1;
                                            var22_2 = var23_27;
                                            while (true) {
                                                block113: {
                                                    block114: {
                                                        var9_7 = var7_17 /* !! */ ;
                                                        if (var4_25 >= ((String[])var22_2).length) break;
                                                        var9_7 = var7_17 /* !! */ ;
                                                        var9_7 = var7_17 /* !! */ ;
                                                        var23_27 = new JSONObject();
                                                        var9_7 = var7_17 /* !! */ ;
                                                        var30_32 = var22_2[var4_25].trim();
                                                        var9_7 = var7_17 /* !! */ ;
                                                        var5_26 = var30_32.indexOf((String)var12_15);
                                                        var8_14 = var7_17 /* !! */ ;
                                                        var31_33 = cYh.d("11");
                                                        var32_34 = cYh.d("09");
                                                        if (var5_26 == -1) {
                                                            var7_17 /* !! */  = var8_14;
                                                            if (this.m(var30_32)) break block113;
                                                            var7_17 /* !! */  = var8_14;
                                                            var23_27.put(var32_34, (Object)var30_32);
                                                            var7_17 /* !! */  = var8_14;
                                                            var23_27.put(var31_33, (Object)var30_32);
                                                            break block114;
                                                        }
                                                        var7_17 /* !! */  = var8_14;
                                                        var9_7 = var30_32.substring(0, var5_26);
                                                        var7_17 /* !! */  = var8_14;
                                                        if (this.m((String)var9_7)) break block113;
                                                        var7_17 /* !! */  = var8_14;
                                                        var23_27.put(var32_34, (Object)var9_7.trim());
                                                        var7_17 /* !! */  = var8_14;
                                                        var23_27.put(var31_33, (Object)var30_32.substring(var5_26 + 1).trim());
                                                    }
                                                    var7_17 /* !! */  = var8_14;
                                                    var29_31.put((Object)var23_27);
                                                }
                                                ++var4_25;
                                                var7_17 /* !! */  = var8_14;
                                            }
                                            var8_14 = var7_17 /* !! */ ;
                                            var22_2 = var10_12 /* !! */ ;
                                            var9_7 = var12_15;
                                            var10_12 /* !! */  = var11_16;
                                            var7_17 /* !! */  = var8_14;
                                            var28_30.put(cYh.d("11312D2432"), (Object)var29_31);
                                            var7_17 /* !! */  = var8_14;
                                            var27_29.put((Object)var28_30);
                                            var7_17 /* !! */  = var13_11 /* !! */ ;
                                            var11_16 = var22_2;
                                        }
                                        ++var2_20;
                                        var12_15 = var11_16;
                                        var11_16 = var10_12 /* !! */ ;
                                        var13_11 /* !! */  = var7_17 /* !! */ ;
                                        var7_17 /* !! */  = var8_14;
                                        var10_12 /* !! */  = var12_15;
                                        var12_15 = var9_7;
                                    }
                                    var21_22 = var14_3;
                                    var8_14 = var7_17 /* !! */ ;
                                    var14_3 = var13_11 /* !! */ ;
                                    var22_2 = var12_15;
                                    var9_7 = var17_5;
                                    var12_15 = var16_19 /* !! */ ;
                                    var7_17 /* !! */  = var8_14;
                                    if (var25_21.has(var24_4)) break block115;
                                    var7_17 /* !! */  = var8_14;
                                    var7_17 /* !! */  = var8_14;
                                    var13_11 /* !! */  = new JSONObject();
                                    var7_17 /* !! */  = var8_14;
                                    var25_21.put(var24_4, (Object)var13_11 /* !! */ );
                                }
                                var7_17 /* !! */  = var8_14;
                                var25_21.getJSONObject(var24_4).put(var26_28, (Object)var27_29);
                                var16_19 /* !! */  = var10_12 /* !! */ ;
                                var10_12 /* !! */  = var21_22;
                                var13_11 /* !! */  = var11_16;
                                var11_16 = var22_2;
                                break block116;
                            }
                            var9_7 = var14_3;
                            var17_5 = var7_17 /* !! */ ;
                            var7_17 /* !! */  = var10_12 /* !! */ ;
                            var10_12 /* !! */  = var11_16;
                            var16_19 /* !! */  = var22_2;
                            var14_3 = var8_14;
                            var8_14 = var17_5;
                            var11_16 = var13_11 /* !! */ ;
                            var13_11 /* !! */  = var10_12 /* !! */ ;
                            var10_12 /* !! */  = var9_7;
                            var9_7 = var7_17 /* !! */ ;
                        }
                        var7_17 /* !! */  = var8_14;
                        var15_6.put((Object)var16_19 /* !! */ );
                        var7_17 /* !! */  = var14_3;
                    }
                    ++var3_23;
                    var16_19 /* !! */  = var9_7;
                    var9_7 = var13_11 /* !! */ ;
                    var13_11 /* !! */  = var8_14;
                    var8_14 = var7_17 /* !! */ ;
                    var14_3 = var10_12 /* !! */ ;
                    var7_17 /* !! */  = var13_11 /* !! */ ;
                    var13_11 /* !! */  = var11_16;
                    var10_12 /* !! */  = var16_19 /* !! */ ;
                    var11_16 = var9_7;
                }
            }
            var7_17 /* !! */  = var16_19 /* !! */ ;
            var25_21.put((String)var21_22, var17_5);
            var7_17 /* !! */  = var16_19 /* !! */ ;
            try {
                var8_14 = var25_21.toString();
                return var8_14;
            }
            catch (Exception var9_8) {
                var8_14 = var7_17 /* !! */ ;
            }
            break block118;
            catch (Exception var7_18) {
                var8_14 = var9_7;
                var9_7 = var7_18;
            }
        }
        SpiderDebug.log((Throwable)var9_7);
        return var8_14;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeVideoContent() {
        int n2;
        String string = this.a;
        CharSequence charSequence = this.k(string);
        boolean bl = ((String)charSequence).isEmpty();
        int n3 = 0;
        if (bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.c(string));
            ((StringBuilder)charSequence).append(cYh.d("0A3F3738327C173126346A6B41313334366741243821326741233530252E5A"));
            charSequence = ((StringBuilder)charSequence).toString();
            n2 = 1;
        } else {
            n2 = 0;
        }
        SpiderDebug.log((String)charSequence);
        charSequence = com.github.catvod.spider.merge.k.g.g((String)charSequence, this.g((String)charSequence));
        Object object = new JSONObject((String)charSequence);
        charSequence = new JSONArray();
        String string2 = cYh.d("113F250E253F0A31333A24");
        String string3 = cYh.d("113F250E273304");
        string = cYh.d("113F250E393B0A35");
        String string4 = cYh.d("113F250E3E3E");
        if (n2 != 0) {
            JSONArray jSONArray = object.getJSONArray(cYh.d("03313530"));
            for (n2 = n3; n2 < jSONArray.length(); ++n2) {
                object = jSONArray.getJSONObject(n2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(string4, (Object)object.getString(cYh.d("093539253B33093B")));
                jSONObject.put(string, (Object)object.getString(cYh.d("1339353D32")));
                jSONObject.put(string3, (Object)object.getString(cYh.d("173922")));
                jSONObject.put(string2, (Object)object.getString(cYh.d("1424202532")));
                charSequence.put((Object)jSONObject);
            }
        } else {
            JSONObject jSONObject = new ArrayList();
            this.a((JSONObject)object, cYh.d("113C282223"), (ArrayList<JSONArray>)jSONObject);
            if (jSONObject.isEmpty()) {
                this.a((JSONObject)object, cYh.d("113F250E3B331424"), (ArrayList<JSONArray>)jSONObject);
            }
            object = new ArrayList();
            for (JSONArray jSONArray : jSONObject) {
                for (n2 = 0; n2 < jSONArray.length(); ++n2) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(n2);
                    String string5 = jSONObject2.getString(string4);
                    if (((ArrayList)object).contains(string5)) continue;
                    ((ArrayList)object).add(string5);
                    jSONObject = new JSONObject();
                    jSONObject.put(string4, (Object)string5);
                    jSONObject.put(string, (Object)jSONObject2.getString(string));
                    jSONObject.put(string3, (Object)jSONObject2.getString(string3));
                    jSONObject.put(string2, (Object)jSONObject2.getString(string2));
                    charSequence.put((Object)jSONObject);
                }
            }
        }
        try {
            string = new JSONObject();
            string.put(cYh.d("0B393225"), (Object)charSequence);
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
    final String i(String string) {
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

    public void init(Context context, String string) {
        super.init(context, string);
        this.a = string;
    }

    public boolean isVideoFormat(String string) {
        return m.c(string);
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

    public String playerContent(String string, String string2, List<String> object) {
        try {
            object = this.a;
            string = this.j((String)object, this.h((String)object, string), string2);
            string2 = new JSONObject();
            this.f(string, (JSONObject)string2);
            string = string2.toString();
            return string;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String searchContent(String var1_1, boolean var2_3) {
        block13: {
            block12: {
                var6_4 = cYh.d("113F250E3E3E");
                var5_5 = cYh.d("0B393225");
                var8_6 = cYh.d("03313530");
                var1_1 = this.l(this.a, URLEncoder.encode(var1_1));
                var1_1 = com.github.catvod.spider.merge.k.g.g(var1_1, this.g(var1_1));
                var9_7 /* !! */  = new JSONObject(var1_1);
                var4_8 = null;
                var7_9 = new JSONArray();
                if (var9_7 /* !! */ .has(var5_5) && var9_7 /* !! */ .get(var5_5) instanceof JSONArray) {
                    var1_1 = var9_7 /* !! */ .getJSONArray(var5_5);
                    break block12;
                }
                if (var9_7 /* !! */ .has(var8_6) && var9_7 /* !! */ .get(var8_6) instanceof JSONObject && var9_7 /* !! */ .getJSONObject(var8_6).has(var5_5) && var9_7 /* !! */ .getJSONObject(var8_6).get(var5_5) instanceof JSONArray) {
                    var1_1 = var9_7 /* !! */ .getJSONObject(var8_6).getJSONArray(var5_5);
                    break block12;
                }
                var1_1 = var4_8;
                if (!var9_7 /* !! */ .has(var8_6)) break block12;
                var1_1 = var4_8;
                if (!(var9_7 /* !! */ .get(var8_6) instanceof JSONArray)) break block12;
                var1_1 = var9_7 /* !! */ .getJSONArray(var8_6);
            }
            if (var1_1 == null) break block13;
            var3_10 = 0;
            while (true) {
                if (var3_10 >= var1_1.length()) break;
                var11_12 = var1_1.getJSONObject(var3_10);
                var2_3 = var11_12.has(var6_4);
                var10_11 = cYh.d("113F250E253F0A31333A24");
                var8_6 = cYh.d("113F250E273304");
                var9_7 /* !! */  = cYh.d("113F250E393B0A35");
                if (!var2_3) ** GOTO lbl48
                var4_8 = new JSONObject();
                var4_8.put(var6_4, (Object)var11_12.getString(var6_4));
                var4_8.put((String)var9_7 /* !! */ , (Object)var11_12.getString((String)var9_7 /* !! */ ));
                var4_8.put(var8_6, (Object)var11_12.getString(var8_6));
                var4_8.put(var10_11, (Object)var11_12.getString(var10_11));
lbl46:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl48:
                // 1 sources

                var4_8 = new JSONObject();
                var4_8.put(var6_4, (Object)var11_12.getString(cYh.d("093539253B33093B")));
                var4_8.put((String)var9_7 /* !! */ , (Object)var11_12.getString(cYh.d("1339353D32")));
                var4_8.put(var8_6, (Object)var11_12.getString(cYh.d("173922")));
                var4_8.put(var10_11, (Object)var11_12.getString(cYh.d("1424202532")));
                ** continue;
                var7_9.put((Object)var4_8);
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
}

