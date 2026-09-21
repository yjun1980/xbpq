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
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class MeijuMi
extends Spider {
    private static String \u037f = "https://www.meijumi.xyz";

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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> cloneable) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        String string3 = SOY.d("1B");
        try {
            String string4;
            Object object;
            jSONObject = new JSONObject();
            jSONArray = new JSONArray();
            CharSequence charSequence = SOY.d("01313002113E1E2F");
            if (!string2.equals(SOY.d("4B"))) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(SOY.d("01313002113E1E2F2117131255"));
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(SOY.d("55"));
                charSequence = ((StringBuilder)charSequence).toString();
            }
            CharSequence charSequence2 = charSequence;
            if (bl) {
                charSequence2 = charSequence;
                if (cloneable != null) {
                    charSequence2 = charSequence;
                    if (((HashMap)cloneable).size() > 0) {
                        object = ((HashMap)cloneable).keySet().iterator();
                        while (true) {
                            charSequence2 = charSequence;
                            if (!object.hasNext()) break;
                            String string5 = (String)object.next();
                            string4 = (String)((HashMap)cloneable).get(string5);
                            if (string4.length() <= 0) continue;
                            charSequence2 = new StringBuilder();
                            ((StringBuilder)charSequence2).append(SOY.d("01"));
                            ((StringBuilder)charSequence2).append(string5);
                            ((StringBuilder)charSequence2).append(SOY.d("07"));
                            charSequence = ((String)charSequence).replace(((StringBuilder)charSequence2).toString(), string4);
                        }
                    }
                }
            }
            cloneable = \u0671.\u037f(\u0788.\u0528(((String)charSequence2).replaceAll(SOY.d("26293217001233360D0B"), string), SOY.d("0F26375B4C"), MeijuMi.\u0528(\u037f))).\u08b3(SOY.d("1E3B2755041809260E1A1D040E0D33190C571B20251F171B1F"));
            for (int i2 = 0; i2 < ((ArrayList)cloneable).size(); ++i2) {
                object = (\u013a)((ArrayList)cloneable).get(i2);
                charSequence = ((\u013a)object).\u08b3(string3).\u037f(SOY.d("0E3B251A11")).replace(SOY.d("92EDD49FEFC09EEADA9EC9CA"), "").trim();
                string = ((\u013a)object).\u08b3(SOY.d("133F36")).\u037f(SOY.d("092032"));
                charSequence2 = ((\u013a)object).\u08b3(SOY.d("5435290207")).\u052e();
                object = ((\u013a)object).\u08b3(string3).\u037f(SOY.d("12203410"));
                string4 = new JSONObject();
                string4.put(SOY.d("0C3D35291D13"), object);
                string4.put(SOY.d("0C3D35291A161737"), (Object)charSequence);
                string4.put(SOY.d("0C3D3529041E19"), (Object)MeijuMi.\u037f(string));
                string4.put(SOY.d("0C3D352906121733231D07"), (Object)charSequence2);
                jSONArray.put((Object)string4);
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        {
            jSONObject.put(SOY.d("0A333613"), (Object)string2);
            jSONObject.put(SOY.d("0A33361317180F3C25"), Integer.MAX_VALUE);
            jSONObject.put(SOY.d("163B3C1F00"), jSONArray.length());
            jSONObject.put(SOY.d("0E3D251718"), Integer.MAX_VALUE);
            jSONObject.put(SOY.d("163B2202"), (Object)jSONArray);
            return jSONObject.toString();
        }
    }

    /*
     * Unable to fully structure code
     */
    public String detailContent(List<String> var1_1) {
        var8_3 = SOY.d("1B");
        var3_4 = \u0671.\u037f(\u0788.\u0528(var1_1.get(0), SOY.d("0F26375B4C"), MeijuMi.\u0528(MeijuMi.\u037f)));
        var5_6 = ((\u013a)var3_4.\u08b3(SOY.d("1E3B2758071E14353D135914153C25131A035A3B3C11")).get(0)).\u0529(SOY.d("092032"));
        var6_7 = var3_4.\u08b3(SOY.d("54373F02060E572638021812")).\u052e().replace(SOY.d("92EDD49FEFC09EEADA9EC9CA"), "").trim();
        var7_8 = new ArrayList();
        try {
            var9_9 = var3_4.\u08b3(SOY.d("1E3B2758071E14353D135914153C25131A035A330A1E06121C0C6C1B15101437252B5816213A23131229473735441F2A"));
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
        var7_8.put(SOY.d("0C3D35291A161737"), (Object)var6_7);
        var7_8.put(SOY.d("0C3D3529041E19"), (Object)MeijuMi.\u037f(var5_6));
        var7_8.put(SOY.d("0C3D352917181426341800"), (Object)"");
        var7_8.put(SOY.d("0C3D3529041B1B2B0E10061817"), (Object)SOY.d("9DECDF93FDD092EDE6"));
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
            for (\u013a \u013a2 : \u0671.\u037f(\u0788.\u0528((String)object2, SOY.d("0F26375B4C"), MeijuMi.\u0528((String)object2))).\u08b3(SOY.d("0F3E7F181501573F341801571B"))) {
                string = \u013a2.\u08b9();
                boolean bl2 = !string.contains(SOY.d("9CC9E590E2C7")) && !string.contains(SOY.d("9CDCF99EF9E7")) && !string.contains(SOY.d("93F4C79FD5C2")) && !string.contains(SOY.d("93CDF893FDD0")) && !string.contains(SOY.d("9FDFE293C4F1"));
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
    public String playerContent(String string, String string2, List<String> object) {
        boolean bl;
        JSONObject jSONObject;
        try {
            string = new JSONObject();
            jSONObject = new JSONObject();
            jSONObject.put(SOY.d("2F21340459361D373F02"), (Object)SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594D4354627F4242474C7C644254241B3430041D584F6166584741"));
            string.put(SOY.d("0F203D"), (Object)string2);
            bl = string2.startsWith(SOY.d("0E2433190C"));
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        object = SOY.d("0A33230511");
        {
            if (!bl && !string2.startsWith(SOY.d("1F36631D"))) {
                string.put(SOY.d("123730121105"), (Object)jSONObject.toString());
                string.put((String)object, 1);
            } else {
                string.put((String)object, 0);
            }
            string.put(SOY.d("0A3E300F210516"), (Object)"");
            return string.toString();
        }
    }

    public String searchContent(String object, boolean bl) {
        String string = SOY.d("1B");
        JSONArray jSONArray = new JSONArray();
        CharSequence charSequence = new StringBuilder();
        charSequence.append(\u037f);
        charSequence.append(SOY.d("556D224B"));
        charSequence.append(URLEncoder.encode((String)object));
        object = \u0671.\u037f(\u0788.\u0528(charSequence.toString(), SOY.d("0F26375B4C"), MeijuMi.\u0528(\u037f))).\u08b3(SOY.d("0F3E7F0511160831395B04161D377117060313313D13"));
        int n2 = 0;
        while (true) {
            if (n2 >= ((ArrayList)object).size()) break;
            Object object2 = (\u013a)((ArrayList)object).get(n2);
            String string2 = ((\u013a)object2).\u08b3(string).\u037f(SOY.d("0E3B251A11")).replace(SOY.d("92EDD49FEFC09EEADA9EC9CA"), "").trim();
            charSequence = ((\u013a)object2).\u08b3(SOY.d("133F36")).\u037f(SOY.d("092032"));
            String string3 = ((\u013a)object2).\u08b3(SOY.d("5435290207")).\u052e();
            object2 = ((\u013a)object2).\u08b3(string).\u037f(SOY.d("12203410"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("0C3D35291D13"), object2);
            jSONObject.put(SOY.d("0C3D35291A161737"), (Object)string2);
            jSONObject.put(SOY.d("0C3D3529041E19"), (Object)MeijuMi.\u037f((String)charSequence));
            jSONObject.put(SOY.d("0C3D352906121733231D07"), (Object)string3);
            jSONArray.put((Object)jSONObject);
            ++n2;
            continue;
            break;
        }
        try {
            object = new JSONObject();
            object.put(SOY.d("163B2202"), (Object)jSONArray);
            object = object.toString();
            return object;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }
}

