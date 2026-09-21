/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.XYQBiu;
import com.github.catvod.spider.merge.SOY;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class XYQBiuAL
extends XYQBiu {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String detailContent(List<String> var1_1) {
        block22: {
            block24: {
                block23: {
                    var9_5 = SOY.d("0C3D3529041B1B2B0E10061817");
                    var5_6 = SOY.d("26760D522853");
                    var8_7 = SOY.d("163B2202");
                    var7_8 = super.detailContent((List<String>)var1_1);
                    if (var7_8.length() <= 0) return var7_8;
                    var10_9 = SOY.d("0C3D3529041B1B2B0E03061B");
                    if (var7_8.contains(var10_9) == false) return var7_8;
                    var15_10 = new ArrayList<String>();
                    var17_11 = new ArrayList<String>();
                    var16_12 = new ArrayList();
                    var1_1 = new ArrayList();
                    var4_13 = new ArrayList();
                    var14_14 = new ArrayList<String>();
                    var13_15 = new ArrayList<String>();
                    var11_16 = new JSONObject(var7_8);
                    var6_17 = var11_16.optJSONArray(var8_7).getJSONObject(0).optString(var10_9).split((String)var5_6);
                    var18_18 = var11_16.optJSONArray(var8_7).getJSONObject(0).optString(var9_5).split((String)var5_6);
                    var2_19 = ((String[])var6_17).length;
                    var12_20 = SOY.d("5E7675");
                    if (var2_19 <= 0) ** GOTO lbl-1000
                    ** GOTO lbl33
lbl-1000:
                    // 1 sources

                    {
                        block21: {
                            var6_17 = var4_13;
                            var4_13 = var1_1;
                            var1_1 = var6_17;
lbl26:
                            // 2 sources

                            while (var15_10.size() > 0) {
                                var2_19 = 0;
                                break block21;
                            }
                            ** GOTO lbl102
                            catch (Exception var1_4) {
                                // empty catch block
                            }
                            break block22;
lbl33:
                            // 1 sources

                            ** try [egrp 1[TRYBLOCK] [1 : 196->305)] { 
lbl34:
                            // 2 sources

                            for (var2_19 = 0; var2_19 < ((String[])var6_17).length; ++var2_19) {
                                var20_23 = var6_17[var2_19].split(SOY.d("2671"));
                                if (var20_23.length > 0) {
                                    var19_22 = new ArrayList<String>();
                                    for (var3_21 = 0; var3_21 < var20_23.length; ++var3_21) {
                                        var21_24 = var20_23[var3_21].split(SOY.d("2676"))[1];
                                        if (!var21_24.isEmpty() && XYQBiu.\u0529.matcher(var21_24).find()) {
                                            var15_10.add(var21_24);
                                            continue;
                                        }
                                        var19_22.add(var20_23[var3_21]);
                                    }
                                    var17_11.add(TextUtils.join((CharSequence)SOY.d("59"), var19_22));
                                }
                                var16_12.add(var18_18[var2_19]);
                            }
                            var6_17 = var1_1;
                            var1_1 = var4_13;
                            var14_14.add(TextUtils.join((CharSequence)var12_20, var16_12));
                            var13_15.add(TextUtils.join((CharSequence)var12_20, var17_11));
                            var4_13 = var6_17;
                            ** GOTO lbl26
                        }
lbl61:
                        // 2 sources

                        while (var2_19 < var15_10.size()) {
                            var6_17 = new ArrayList();
                            var6_17.add((String)var15_10.get(var2_19));
                            break block23;
                        }
                        ** GOTO lbl80
                    }
                }
                var16_12 = this.\u052f.detailContent((List<String>)var6_17);
                if (var16_12.length() > 0 && var16_12.contains(var10_9)) {
                    var6_17 = new JSONObject((String)var16_12);
                    var16_12 = var6_17.optJSONArray(var8_7).getJSONObject(0).optString(var9_5);
                    if (!(var6_17 = var6_17.optJSONArray(var8_7).getJSONObject(0).optString(var10_9)).isEmpty()) {
                        var4_13.add(var6_17);
                        var1_1.add(var16_12);
                    }
                }
                ++var2_19;
                ** GOTO lbl61
lbl80:
                // 1 sources

                var1_1 = TextUtils.join((CharSequence)var12_20, (Iterable)var1_1).split((String)var5_6);
                var5_6 = new ArrayList<String>();
                var2_19 = 0;
                break block24;
lbl84:
                // 1 sources

                catch (Exception var1_3) {
                    break block22;
                }
            }
            while (var2_19 < ((Object)var1_1).length) {
                var6_17 = new StringBuilder();
                var6_17.append((String)var1_1[var2_19]);
                var6_17.append("");
                var6_17.append(++var2_19);
                var5_6.add(var6_17.toString());
            }
            var14_14.add(TextUtils.join((CharSequence)var12_20, var5_6));
            var13_15.add(TextUtils.join((CharSequence)var12_20, (Iterable)var4_13));
lbl102:
            // 4 sources

            for (var2_19 = 0; var2_19 < var13_15.size(); ++var2_19) {
                if (!((String)var13_15.get(var2_19)).isEmpty()) continue;
                var13_15.remove(var2_19);
                var14_14.remove(var2_19);
            }
            try {
                var1_1 = TextUtils.join((CharSequence)var12_20, var14_14);
                var4_13 = TextUtils.join((CharSequence)var12_20, var13_15);
                var11_16.optJSONArray(var8_7).getJSONObject(0).put(var10_9, var4_13);
                var11_16.optJSONArray(var8_7).getJSONObject(0).put(var9_5, var1_1);
                return var11_16.toString();
            }
            catch (Exception var1_2) {}
        }
        SpiderDebug.log((Throwable)var1_1);
        return var7_8;
    }
}

