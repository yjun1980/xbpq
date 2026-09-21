/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  okhttp3.Call
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge;

import android.net.Uri;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u078a;
import com.github.catvod.spider.merge.\u078c;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import okhttp3.Call;
import org.json.JSONObject;

public class \u0786 {
    private static final String[] \u037f = new String[]{SOY.d("543F62034C"), SOY.d("543F2142"), SOY.d("54343D00"), SOY.d("5433271F"), SOY.d("543F3A00"), SOY.d("54203C"), SOY.d("54253C00"), SOY.d("543F2111"), SOY.d("0C3B35131B580E3D22"), SOY.d("543F2145"), SOY.d("543F6517"), SOY.d("173B3C132B030322344B021E1E373E2919074E")};
    private static final String[] \u0528 = new String[]{SOY.d("473A250204"), SOY.d("543A251B18"), SOY.d("453A250204")};
    public static Charset \u0529 = Charset.forName(SOY.d("2F06175B4C"));
    public static Charset \u052a = Charset.forName(SOY.d("13213E5B4C4F4F6B7C47"));

    public static String \u037f(String string, Charset comparable) {
        byte[] byArray = MessageDigest.getInstance(SOY.d("371664")).digest(string.getBytes((Charset)comparable));
        comparable = new Comparable<Charset>();
        int n2 = 0;
        while (true) {
            if (n2 >= byArray.length) break;
            string = Integer.toHexString(byArray[n2] & 0xFF);
            if (string.length() < 2) {
                ((StringBuilder)comparable).append(0);
            }
            ((StringBuilder)comparable).append(string);
            ++n2;
            continue;
            break;
        }
        try {
            string = ((StringBuilder)comparable).toString().toLowerCase();
            return string;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return "";
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean \u0528(String string) {
        block3: {
            String string2 = SOY.d("193D3C590758");
            try {
                boolean bl;
                HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E434740546167"));
                hashMap.put(SOY.d("28373713061208"), SOY.d("12262506074D557D260103591B3E380F01191E2038001159193D3C59"));
                \u078a.\u0528 \u0529 = new \u078a.\u0528(){

                    @Override
                    public void onFailure(Call call, Exception exception) {
                    }

                    @Override
                    public void onResponse(String string) {
                    }
                };
                String string3 = SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C591513083B27135B01497D221E15051F0D3D1F1A1C553534022B04123323132B15030D30181B19033F3E0307");
                String string4 = string.split(string2)[1].substring(0, 11);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SOY.d("093A300411281336"), (Object)string4);
                if (!string.contains(string2) || string.isEmpty()) break block3;
                \u078c.\u052e(\u078c.\u0529(), string3, jSONObject.toString(), hashMap, \u0529);
                string = (String)\u0529.getResult();
                if (!string.contains(SOY.d("093A30041128163B3F1D541E09")) && !(bl = string.contains(SOY.d("093A30041128163B3F1D54141B3C3F1900")))) break block3;
                return false;
            }
            catch (Exception exception) {
                return true;
            }
        }
        return true;
    }

    public static JSONObject \u0529(JSONObject object, String string, String string2) {
        JSONObject jSONObject = object;
        if (object == null) {
            jSONObject = new JSONObject();
        }
        boolean bl = string.contains(SOY.d("0D25265819100E247F151B1A"));
        String string3 = SOY.d("5A1F3E0C1D1B16337E435A47");
        object = SOY.d("5A");
        String string4 = SOY.d("2F21340459361D373F02");
        String string5 = SOY.d("28373713061208");
        if (bl) {
            jSONObject.put(string5, object);
            jSONObject.put(string4, (Object)string3);
        } else if (string2.contains(SOY.d("0E3B25171A5917352500"))) {
            jSONObject.put(string5, object);
            jSONObject.put(string4, (Object)string3);
        } else if (string.contains(SOY.d("183B3D1F161E163B"))) {
            jSONObject.put(string5, (Object)SOY.d("5A3A25020404407D7E0103005430381A1D15133E38581718177D"));
            jSONObject.put(string4, (Object)SOY.d("5A1F3E0C1D1B16337E435A475A7A061F1A13152522563A235A636158444C5A053818424341722940405E5A13210618122D37333D1D03556762415A444C72793D3C23371E7D56181E113771311114113D7856371F083D3C135B4649617F465A475462712515111B20385941444D7C6240"));
        }
        return jSONObject;
    }

    public static boolean \u052a(String string, String string2) {
        return string2.contains(SOY.d("4365624F4344542A280C")) || string2.contains(SOY.d("543438024E"));
        {
        }
    }

    public static boolean \u052b(String string) {
        string = string.toLowerCase();
        boolean bl = string.contains(SOY.d("473A250204"));
        String string2 = SOY.d("1C203E1B491F0E2621054E58553030180D0214357F0603");
        String string3 = SOY.d("1761244E5A070D7D1217171F1F");
        if (!bl && !string.contains(SOY.d("543A251B18")) || string.contains(string3) && string.contains(string2)) {
            String[] stringArray = \u037f;
            int n2 = stringArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!string.contains(stringArray[i2])) continue;
                stringArray = \u0528;
                n2 = stringArray.length;
                for (i2 = 0; i2 < n2; ++i2) {
                    if (!string.contains(stringArray[i2]) || string.contains(string3) && string.contains(string2) && string.contains(SOY.d("1D37251B4702426D2404184A12262506"))) continue;
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean \u052c(String string) {
        int n2;
        String string2 = SOY.d("1323380F1D59193D3C");
        boolean bl = false;
        String string3 = Uri.parse((String)string).getHost();
        String[] stringArray = new String[16];
        stringArray[0] = string2;
        try {
            stringArray[1] = SOY.d("0C7C20075A14153F");
            stringArray[2] = SOY.d("033D241D0159193D3C");
            stringArray[3] = SOY.d("16377F151B1A");
            stringArray[4] = SOY.d("0E2735190159193D3C");
            stringArray[5] = SOY.d("173525005A14153F");
            stringArray[6] = SOY.d("093D39035A14153F");
            stringArray[7] = SOY.d("1B3137031A59193C");
            stringArray[8] = SOY.d("183B3D1F161E163B7F151B1A");
            stringArray[9] = SOY.d("18333E1011191D7C321919");
            stringArray[10] = SOY.d("0A2225005A14153F");
            stringArray[11] = SOY.d("0D252658191E1D27271F1012157C321919");
            stringArray[12] = SOY.d("0D2526581D0F133524175A14153F");
            stringArray[13] = SOY.d("0C3B2158454E4A677F151B1A");
            stringArray[14] = SOY.d("0D2526581202147C2500");
            stringArray[15] = SOY.d("177C37031A590E24");
            n2 = 0;
        }
        catch (Exception exception) {
            return bl;
        }
        while (true) {
            boolean bl2 = bl;
            if (n2 >= 16) return bl2;
            if (string3.contains(stringArray[n2])) {
                if (!string2.equals(stringArray[n2])) return true;
                if (string.contains(SOY.d("1323380F1D59193D3C591528"))) return true;
                if (string.contains(SOY.d("1323380F1D59193D3C590328"))) return true;
                bl2 = string.contains(SOY.d("1323380F1D59193D3C590228"));
                if (bl2) {
                    return true;
                }
            }
            ++n2;
            continue;
            break;
        }
    }

    public static JSONObject \u052d(String string, String string2) {
        Object object = new JSONObject(string2);
        string2 = SOY.d("1E332517");
        boolean bl = object.has(string2);
        String string3 = SOY.d("0F203D");
        string2 = bl ? object.getJSONObject(string2).getString(string3) : object.getString(string3);
        CharSequence charSequence = string2;
        if (string2.startsWith(SOY.d("557D"))) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(SOY.d("12262506074D"));
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        if (!((String)charSequence).startsWith(SOY.d("12262506"))) {
            return null;
        }
        if (((String)charSequence).equals(string) && (\u0786.\u052c((String)charSequence) || !\u0786.\u052b((String)charSequence))) {
            return null;
        }
        if (\u0786.\u052a(string, (String)charSequence)) {
            return null;
        }
        string2 = new JSONObject();
        String string4 = object.optString(SOY.d("0F21340459161D373F02"), "");
        int n2 = string4.trim().length();
        String string5 = SOY.d("5A");
        if (n2 > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string5);
            stringBuilder.append(string4);
            string4 = stringBuilder.toString();
            string2.put(SOY.d("2F21340459361D373F02"), (Object)string4);
        }
        if ((string4 = object.optString(SOY.d("08373713061208"), "")).trim().length() > 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string5);
            ((StringBuilder)object).append(string4);
            object = ((StringBuilder)object).toString();
            string2.put(SOY.d("28373713061208"), object);
        }
        string = \u0786.\u0529((JSONObject)string2, string, (String)charSequence);
        string2 = new JSONObject();
        string2.put(SOY.d("123730121105"), (Object)string);
        string2.put(string3, (Object)charSequence);
        return string2;
    }
}

