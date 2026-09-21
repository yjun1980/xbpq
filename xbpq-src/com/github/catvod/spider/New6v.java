/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0671;
import com.github.catvod.spider.merge.\u0788;
import com.github.catvod.spider.merge.\u078c;
import com.github.catvod.spider.merge.\u0e33;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class New6v
extends Spider {
    private static String \u037f = "http://www.xb6v.com";

    private static String \u037f(String string) {
        try {
            Object object = new JSONObject();
            object.put(SOY.d("2F21340459361D373F02"), (Object)SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594D4354627F4242474C7C644254241B3430041D584F6166584741"));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(SOY.d("3A1A3417101208216C"));
            stringBuilder.append(object.toString());
            object = stringBuilder.toString();
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string;
        }
    }

    private static HashMap<String, String> \u0528(String object) {
        object = new HashMap();
        ((HashMap)object).put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594D4354627F4242474C7C644254241B3430041D584F6166584741"));
        CharSequence charSequence = new StringBuilder();
        charSequence.append(\u037f);
        charSequence.append(SOY.d("55"));
        charSequence = charSequence.toString();
        ((HashMap)object).put(SOY.d("28373713061208"), charSequence);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String object, String string, boolean bl, HashMap<String, String> object2) {
        int n2;
        String string2;
        String string3;
        Object object3;
        String string4 = SOY.d("99D2DB");
        CharSequence charSequence = SOY.d("543A251B18");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        CharSequence charSequence2 = SOY.d("01313002113E1E2F");
        if (!string.equals(SOY.d("4B"))) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(SOY.d("01313002113E1E2F38181012020D"));
            ((StringBuilder)charSequence2).append(string);
            ((StringBuilder)charSequence2).append((String)charSequence);
            charSequence2 = ((StringBuilder)charSequence2).toString();
            if (((String)object).contains(charSequence)) {
                return "";
            }
        }
        charSequence = charSequence2;
        if (bl) {
            charSequence = charSequence2;
            if (object2 != null) {
                charSequence = charSequence2;
                if (((HashMap)object2).size() > 0) {
                    object3 = ((HashMap)object2).keySet().iterator();
                    while (true) {
                        charSequence = charSequence2;
                        if (!object3.hasNext()) break;
                        string3 = (String)object3.next();
                        string2 = (String)((HashMap)object2).get(string3);
                        if (string2.length() <= 0) continue;
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(SOY.d("01"));
                        ((StringBuilder)charSequence).append(string3);
                        ((StringBuilder)charSequence).append(SOY.d("07"));
                        charSequence2 = ((String)charSequence2).replace(((StringBuilder)charSequence).toString(), string2);
                    }
                }
            }
        }
        charSequence2 = ((String)charSequence).replaceAll(SOY.d("26293217001233360D0B"), (String)object);
        object2 = charSequence2;
        if (!((String)object).contains(SOY.d("12262506"))) {
            object2 = \u0788.\u052a(\u037f, (String)charSequence2);
        }
        object2 = \u0671.\u037f(\u0788.\u0528((String)object2, SOY.d("0F26375B4C"), New6v.\u0528(\u037f)));
        bl = ((String)object).contains(SOY.d("552338171A"));
        string2 = SOY.d("0C3D352906121733231D07");
        String string5 = SOY.d("0C3D3529041E19");
        charSequence = SOY.d("0C3D35291A161737");
        object3 = SOY.d("0C3D35291D13");
        charSequence2 = SOY.d("12203410");
        int n3 = 0;
        string3 = SOY.d("1B");
        if (bl) {
            \u0e33 \u0e332 = ((\u013a)object2).\u08b3(SOY.d("1E3B27550016187F32191A031F3C2556181E"));
            for (n2 = n3; n2 < \u0e332.size(); ++n2) {
                \u013a \u013a2 = (\u013a)\u0e332.get(n2);
                object = object2 = \u013a2.\u08b3(string3).\u052e();
                if (((String)object2).contains(string4)) {
                    object = object2;
                    if (((String)object2).contains(SOY.d("99D2DA"))) {
                        object = ((String)object2).substring(((String)object2).indexOf(string4));
                    }
                }
                object2 = \u013a2.\u08b3(string3).\u037f((String)charSequence2);
                \u013a2 = new JSONObject();
                \u013a2.put((String)object3, object2);
                \u013a2.put((String)charSequence, object);
                \u013a2.put(string5, "");
                \u013a2.put(string2, "");
                jSONArray.put((Object)\u013a2);
            }
        } else {
            object = ((\u013a)object2).\u08b3(SOY.d("0F3E72061B040E0D32191A031B3B3F130657163B"));
            for (n2 = 0; n2 < ((ArrayList)object).size(); ++n2) {
                Object object4 = (\u013a)((ArrayList)object).get(n2);
                String string6 = ((\u013a)object4).\u08b3(SOY.d("1260")).\u052e();
                string4 = ((\u013a)object4).\u08b3(SOY.d("133F36")).\u037f(SOY.d("092032"));
                object2 = ((\u013a)object4).\u08b3(SOY.d("543B3F101B281E332513")).\u052e();
                object4 = ((\u013a)object4).\u08b3(string3).\u037f((String)charSequence2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((String)object3, object4);
                jSONObject2.put((String)charSequence, (Object)string6);
                jSONObject2.put(string5, (Object)New6v.\u037f(string4));
                jSONObject2.put(string2, object2);
                jSONArray.put((Object)jSONObject2);
            }
        }
        try {
            jSONObject.put(SOY.d("0A333613"), (Object)string);
            jSONObject.put(SOY.d("0A33361317180F3C25"), Integer.MAX_VALUE);
            jSONObject.put(SOY.d("163B3C1F00"), jSONArray.length());
            jSONObject.put(SOY.d("0E3D251718"), Integer.MAX_VALUE);
            jSONObject.put(SOY.d("163B2202"), (Object)jSONArray);
            return jSONObject.toString();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    /*
     * Unable to fully structure code
     */
    public String detailContent(List<String> var1_1) {
        var8_3 = SOY.d("1B");
        var3_4 = \u0671.\u037f(\u0788.\u0528(\u0788.\u052a(New6v.\u037f, var1_1.get(0)), SOY.d("0F26375B4C"), New6v.\u0528(New6v.\u037f)));
        var6_6 = ((\u013a)var3_4.\u08b3(SOY.d("1E3B2755041809260E151B190E373F02541E1735")).get(0)).\u0529(SOY.d("092032"));
        var5_7 = var3_4.\u08b3(SOY.d("1E3B275517181426341800491E3B27481C46")).\u052e();
        var7_8 = new ArrayList();
        try {
            var9_9 = var3_4.\u08b3(SOY.d("1E3B2755041809260E151B190E373F025416213A23131229473F30111A120E0F7D172F1F0837372849121E603A2B"));
            var2_10 = 0;
        }
        catch (Exception var3_5) {
            SpiderDebug.log((Throwable)var3_5);
lbl46:
            // 2 sources

            var3_4 = var7_8.size() > 0 ? TextUtils.join((CharSequence)SOY.d("59"), var7_8) : "";
        }
        while (true) {
            block13: {
                if (var2_10 >= var9_9.size()) ** GOTO lbl46
                var3_4 = (\u013a)var9_9.get(var2_10);
                var4_11 = var3_4.\u08b3(var8_3).\u052e();
                var10_12 = var3_4.\u08b3(var8_3).\u037f(SOY.d("12203410"));
                if (!var10_12.startsWith(SOY.d("1F36631D4E"))) break block13;
                var11_13 = Pattern.compile(SOY.d("262E371F1812262E79585E48530E2D")).matcher(URLDecoder.decode(var10_12));
                var3_4 = var4_11;
                if (var11_13.find()) {
                    var3_4 = var11_13.group(1);
                }
                ** GOTO lbl32
            }
            var3_4 = var4_11;
            if (!var10_12.startsWith(SOY.d("17333618110340"))) ** GOTO lbl32
            var11_13 = Pattern.compile(SOY.d("520C2D505D13146F792D2A512778785E520B5E7B")).matcher(URLDecoder.decode(var10_12));
            var3_4 = var4_11;
            if (var11_13.find()) {
                var3_4 = var11_13.group(2);
            }
lbl32:
            // 5 sources

            var4_11 = new StringBuilder();
            var4_11.append((String)var3_4);
            var4_11.append(SOY.d("5E"));
            var4_11.append(var10_12);
            var7_8.add(var4_11.toString());
            ++var2_10;
            continue;
            break;
        }
        var8_3 = new JSONObject();
        var4_11 = new JSONArray();
        var7_8 = new JSONObject();
        var7_8.put(SOY.d("0C3D35291D13"), (Object)var1_1.get(0));
        var7_8.put(SOY.d("0C3D35291A161737"), (Object)var5_7);
        var7_8.put(SOY.d("0C3D3529041E19"), (Object)New6v.\u037f(var6_6));
        var7_8.put(SOY.d("0C3D352917181426341800"), (Object)"");
        var7_8.put(SOY.d("0C3D3529041B1B2B0E10061817"), (Object)SOY.d("9CC4E14022"));
        var7_8.put(SOY.d("0C3D3529041B1B2B0E03061B"), var3_4);
        var4_11.put((Object)var7_8);
        var8_3.put(SOY.d("163B2202"), var4_11);
        var1_1 = var8_3.toString();
        return var1_1;
        {
            catch (Exception var1_2) {
                SpiderDebug.log((Throwable)var1_2);
                return "";
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeContent(boolean bl) {
        try {
            String string;
            Object object = new JSONArray();
            Object object2 = \u037f;
            for (\u013a \u013a2 : \u0671.\u037f(\u0788.\u0528((String)object2, SOY.d("0F26375B4C"), New6v.\u0528((String)object2))).\u08b3(SOY.d("0F3E721B11190F217117"))) {
                string = \u013a2.\u08b9();
                boolean bl2 = !string.contains(SOY.d("93F4C79FD5C2")) && !string.contains(SOY.d("9CCED190E2C7")) && !string.contains(SOY.d("9CC5F691FDFF"));
                if (!bl2) continue;
                String string2 = \u013a2.\u0529(SOY.d("12203410"));
                \u013a2 = new JSONObject();
                \u013a2.put(SOY.d("0E2B21132B1E1E"), string2);
                \u013a2.put(SOY.d("0E2B21132B191B3F34"), string);
                object.put((Object)\u013a2);
            }
            object2 = new JSONObject();
            object2.put(SOY.d("193E300507"), object);
            if (!bl) return object2.toString();
            object = SOY.d("1C3B3D02110509");
            string = new JSONObject(SOY.d("012F"));
            object2.put((String)object, (Object)string);
            return object2.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String string) {
        super.init(context, string);
        if (!string.isEmpty()) {
            \u037f = string;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String string, String string2, List<String> jSONObject) {
        boolean bl;
        JSONObject jSONObject2;
        try {
            jSONObject2 = new JSONObject();
            jSONObject = new JSONObject();
            jSONObject.put(SOY.d("2F21340459361D373F02"), (Object)SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594D4354627F4242474C7C644254241B3430041D584F6166584741"));
            jSONObject2.put(SOY.d("0F203D"), (Object)string2);
            bl = string2.startsWith(SOY.d("0E2433190C"));
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        string = SOY.d("0A33230511");
        {
            if (!bl && !string2.startsWith(SOY.d("1F36631D"))) {
                jSONObject2.put(SOY.d("123730121105"), (Object)jSONObject.toString());
                jSONObject2.put(string, 1);
            } else {
                jSONObject2.put(string, 0);
            }
            jSONObject2.put(SOY.d("0A3E300F210516"), (Object)"");
            return jSONObject2.toString();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String searchContent(String string, boolean bl) {
        JSONArray jSONArray;
        String string2 = SOY.d("99D2DB");
        String string3 = SOY.d("4B");
        try {
            jSONArray = new JSONArray();
            Serializable serializable = new StringBuilder();
            ((StringBuilder)serializable).append(\u037f);
            ((StringBuilder)serializable).append(SOY.d("55377E05111608313959451E1436340E5A071222"));
            Object object = ((StringBuilder)serializable).toString();
            serializable = new LinkedHashMap();
            ((HashMap)serializable).put(SOY.d("093A3E01"), SOY.d("0E3B251A11"));
            ((HashMap)serializable).put(SOY.d("0E373C061D13"), string3);
            ((HashMap)serializable).put(SOY.d("0E303F171912"), SOY.d("1B20251F171B1F"));
            ((HashMap)serializable).put(SOY.d("173B35"), string3);
            ((HashMap)serializable).put(SOY.d("1E3D21190703"), SOY.d("09373004171F"));
            ((HashMap)serializable).put(SOY.d("0927331B1D03"), "");
            ((HashMap)serializable).put(SOY.d("113728141B160836"), string);
            \u078c.\u0529.clear();
            serializable = \u0671.\u037f(\u0788.\u0529((String)object, (Map<String, String>)((Object)serializable), SOY.d("0F26375B4C"), New6v.\u0528(\u037f))).\u08b3(SOY.d("0F3E72061B040E0D32191A031B3B3F130657163B"));
            for (int i2 = 0; i2 < ((ArrayList)serializable).size(); ++i2) {
                object = (\u013a)((ArrayList)serializable).get(i2);
                string = string3 = ((\u013a)object).\u08b3(SOY.d("1260")).\u052e();
                if (string3.contains(string2)) {
                    string = string3;
                    if (string3.contains(SOY.d("99D2DA"))) {
                        string = string3.substring(string3.indexOf(string2));
                    }
                }
                String string4 = ((\u013a)object).\u08b3(SOY.d("133F36")).\u037f(SOY.d("092032"));
                string3 = ((\u013a)object).\u08b3(SOY.d("543B3F101B281E332513")).\u052e();
                object = ((\u013a)object).\u08b3(SOY.d("1B")).\u037f(SOY.d("12203410"));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SOY.d("0C3D35291D13"), object);
                jSONObject.put(SOY.d("0C3D35291A161737"), (Object)string);
                jSONObject.put(SOY.d("0C3D3529041E19"), (Object)New6v.\u037f(string4));
                jSONObject.put(SOY.d("0C3D352906121733231D07"), (Object)string3);
                jSONArray.put((Object)jSONObject);
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        {
            string = new JSONObject();
            string.put(SOY.d("163B2202"), (Object)jSONArray);
            return string.toString();
        }
    }
}

