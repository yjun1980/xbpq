package com.github.catvod.spider.merge.j;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.cYh;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {
    private static final Pattern a = Pattern.compile(cYh.d("0F2435217F7258712925232A4E7E687B683E023620243B2E3B7E72676223000C6F323837487E6B2D3F2E13201D022C6B557C3C6E0B744F3D72246F260A20752D3136112C20273E260A3B372D25371B272C272B3717373D3C633B1B3D31627E260F2435210B091C61737D2A653B7E693C642F5F2C2C216326013C372D362C0E2C2C3A2126153D3D263A2C1B3D31362B3753313D3C27694E0C7E0D04701B3835252706342B70637B27583D72246F06347A3D39232E1778696E76321324317879734D6F2534313B123C350D79331F392624360649332E3C78744D2C2925232A4F787E703F2E1320687F7E705834383233344A242E220B7417233530232A3C0E1D6E0A701B38352527744D6F6E213B3B1E7E3A617B691A0C7E0A092F153C1C2A65765F2D7C7F7D260F2435217970587F313D362302226E7F7D653C20110C3B3B1E0C6F213F2A3B6F34233B67497A3D39232E177E6B6E783E08272F3D383B037E202227223B6F6F7B2B321324317F7D6548313138782F170F20213E741738310D68744D2C2925232A147E6B6E0B745166383A0B74043E6F7B2B32132431797F6546383525277349796B6E393F13352022320649332E3C783C0E3C247E79701B38352527724F6F6039232E17796F787D65033F34283E343B7E223E3A75497A6E213B3B1E7F1D6E79701B38352527724F6F6039232E17796F787D650F252E223F3B090C6F323837487E6B7E0B650E24243C79701B3D2036393F136A6F7B2B3F03622A6B79701B3635216D744D2C352735351F7D39366D744D2C353922340335336B79701B2034223F60497A"));
    public static Charset b = Charset.forName(cYh.d("3204077C6F"));
    public static Charset c = Charset.forName(cYh.d("0E232E7C6F6252696C60"));

    public static String a(String str, Charset charset) {
        try {
            byte[] digest = MessageDigest.getInstance(cYh.d("2A1474")).digest(str.getBytes(charset));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
            }
            return sb.toString().toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(String str, String str2) {
        String replaceAll;
        StringBuilder sb;
        String d = cYh.d("48");
        String d2 = cYh.d("5D7F6E");
        String d3 = cYh.d("0F243521");
        try {
            if (!str2.startsWith(d3) && !str2.startsWith(cYh.d("0A31263F322E5D")) && !str2.startsWith(cYh.d("0124316B")) && !str2.startsWith(cYh.d("0234733A6D")) && !str2.startsWith(cYh.d("1326233E2F771F377B")) && !str2.startsWith(cYh.d("1338343F333F156A")) && !str2.startsWith(cYh.d("172532396D"))) {
                Uri parse = Uri.parse(str);
                if (str2.startsWith(d2)) {
                    sb = new StringBuilder();
                    sb.append(parse.getScheme());
                    sb.append(str2);
                } else {
                    if (!str2.startsWith(cYh.d("487F"))) {
                        boolean contains = str2.contains(d2);
                        String d4 = cYh.d("4361");
                        if (!contains && str2.startsWith(d)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((str + d).replaceAll(cYh.d("497A6939232E17237E0D6D75480B1F7E0A714E7F6F7B"), d4));
                            sb2.append(str2);
                            replaceAll = sb2.toString();
                        } else {
                            if (!str2.contains(d3) || str2.startsWith(d3)) {
                                return str2;
                            }
                            replaceAll = str2.replaceAll(cYh.d("497A6939232E177E6B78"), d4);
                        }
                        return replaceAll;
                    }
                    sb = new StringBuilder();
                    sb.append(parse.getScheme());
                    sb.append(cYh.d("5D"));
                    sb.append(str2);
                }
                replaceAll = sb.toString();
                return replaceAll;
            }
            return str2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    public static boolean c(String str) {
        if (a.matcher(str).find()) {
            return ((str.contains(cYh.d("04342F7C233514")) && (str.contains(cYh.d("49333222")) || str.contains(cYh.d("493A32")))) || str.contains(cYh.d("12222D6C3F2E1320"))) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str) {
        String d = cYh.d("0E2128283E74043F2C");
        try {
            if (str.contains(cYh.d("12222D6C3F2E1320"))) {
                return false;
            }
            String host = Uri.parse(str).getHost();
            String[] strArr = {d, cYh.d("117E30207939083D"), cYh.d("1E3F343A2274043F2C"), cYh.d("0B356F323837"), cYh.d("1325253E2274043F2C"), cYh.d("0A3735277939083D"), cYh.d("143F29247939083D"), cYh.d("063327243974043E"), cYh.d("05392D3835330B396F323837"), cYh.d("05312E373234007E223E3A"), cYh.d("172035277939083D"), cYh.d("566971647939083D")};
            for (int i = 0; i < 12; i++) {
                if (host.contains(strArr[i]) && (!d.equals(strArr[i]) || str.contains(cYh.d("0E2128283E74043F2C7E3605")) || str.contains(cYh.d("0E2128283E74043F2C7E2005")) || str.contains(cYh.d("0E2128283E74043F2C7E2105")))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static JSONObject e(String str, String str2) {
        String d;
        JSONObject jSONObject = new JSONObject(str2);
        String d2 = cYh.d("03313530");
        boolean has = jSONObject.has(d2);
        String d3 = cYh.d("12222D");
        String string = has ? jSONObject.getJSONObject(d2).getString(d3) : jSONObject.getString(d3);
        if (string.startsWith(cYh.d("487F"))) {
            string = com.github.catvod.spider.merge.b.n.a(cYh.d("0F2435212460"), string);
        }
        if (!string.startsWith(cYh.d("0F243521"))) {
            return null;
        }
        if (string.equals(str) && (d(string) || !c(string))) {
            return null;
        }
        if (string.contains(cYh.d("5E67726860694928382B")) || string.contains(cYh.d("493628256D"))) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String optString = jSONObject.optString(cYh.d("122324237A3B00352F25"), "");
        int length = optString.trim().length();
        String d4 = cYh.d("322324237A1B00352F25");
        String d5 = cYh.d("47");
        if (length > 0) {
            jSONObject2.put(d4, d5 + optString);
        }
        String optString2 = jSONObject.optString(cYh.d("15352734253F15"), "");
        int length2 = optString2.trim().length();
        String d6 = cYh.d("35352734253F15");
        if (length2 > 0) {
            jSONObject2.put(d6, d5 + optString2);
        }
        if (!str.contains(cYh.d("1027367F3A3D13266F323837")) && !string.contains(cYh.d("1339353039740A373527"))) {
            if (str.contains(cYh.d("05392D3835330B39"))) {
                jSONObject2.put(d6, cYh.d("4738352527295D7F6E26202D4932283D3E380E3C287F34350A7F"));
                d = cYh.d("471D2E2B3E360B316E64796A47781638393E08273271190E4761717F67614707283F616E5C7039676373471131213B3F3035231A3E2E4865726679695170691A1F0E2A1C6D713B330C35611632390C3F68711432153F2C347863537E717F636C57666F64637A34312730253348657266796951");
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(cYh.d("0F3520353228"), jSONObject2);
            jSONObject3.put(d3, string);
            return jSONObject3;
        }
        jSONObject2.put(d6, d5);
        d = cYh.d("471D2E2B3E360B316E64796A");
        jSONObject2.put(d4, d);
        JSONObject jSONObject32 = new JSONObject();
        jSONObject32.put(cYh.d("0F3520353228"), jSONObject2);
        jSONObject32.put(d3, string);
        return jSONObject32;
    }
}
