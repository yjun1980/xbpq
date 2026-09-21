/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.j;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class m {
    private static final Pattern a = Pattern.compile(cYh.d("0F2435217F7258712925232A4E7E687B683E023620243B2E3B7E72676223000C6F323837487E6B2D3F2E13201D022C6B557C3C6E0B744F3D72246F260A20752D3136112C20273E260A3B372D25371B272C272B3717373D3C633B1B3D31627E260F2435210B091C61737D2A653B7E693C642F5F2C2C216326013C372D362C0E2C2C3A2126153D3D263A2C1B3D31362B3753313D3C27694E0C7E0D04701B3835252706342B70637B27583D72246F06347A3D39232E1778696E76321324317879734D6F2534313B123C350D79331F392624360649332E3C78744D2C2925232A4F787E703F2E1320687F7E705834383233344A242E220B7417233530232A3C0E1D6E0A701B38352527744D6F6E213B3B1E7E3A617B691A0C7E0A092F153C1C2A65765F2D7C7F7D260F2435217970587F313D362302226E7F7D653C20110C3B3B1E0C6F213F2A3B6F34233B67497A3D39232E177E6B6E783E08272F3D383B037E202227223B6F6F7B2B321324317F7D6548313138782F170F20213E741738310D68744D2C2925232A147E6B6E0B745166383A0B74043E6F7B2B32132431797F6546383525277349796B6E393F13352022320649332E3C783C0E3C247E79701B38352527724F6F6039232E17796F787D65033F34283E343B7E223E3A75497A6E213B3B1E7F1D6E79701B38352527724F6F6039232E17796F787D650F252E223F3B090C6F323837487E6B7E0B650E24243C79701B3D2036393F136A6F7B2B3F03622A6B79701B3635216D744D2C352735351F7D39366D744D2C353922340335336B79701B2034223F60497A"));
    public static Charset b = Charset.forName(cYh.d("3204077C6F"));
    public static Charset c = Charset.forName(cYh.d("0E232E7C6F6252696C60"));

    public static String a(String object, Charset comparable) {
        object = MessageDigest.getInstance(cYh.d("2A1474")).digest(((String)object).getBytes((Charset)comparable));
        comparable = new Comparable<Charset>();
        int n2 = 0;
        while (true) {
            if (n2 >= ((Object)object).length) break;
            String string = Integer.toHexString(object[n2] & 0xFF);
            if (string.length() < 2) {
                ((StringBuilder)comparable).append(0);
            }
            ((StringBuilder)comparable).append(string);
            ++n2;
            continue;
            break;
        }
        try {
            object = ((StringBuilder)comparable).toString().toLowerCase();
            return object;
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
    public static String b(String charSequence, String string) {
        String string2;
        CharSequence charSequence2;
        block9: {
            boolean bl;
            String string3 = cYh.d("48");
            CharSequence charSequence3 = cYh.d("5D7F6E");
            charSequence2 = cYh.d("0F243521");
            try {
                if (string.startsWith((String)charSequence2)) return string;
                if (string.startsWith(cYh.d("0A31263F322E5D"))) return string;
                if (string.startsWith(cYh.d("0124316B"))) return string;
                if (string.startsWith(cYh.d("0234733A6D"))) return string;
                if (string.startsWith(cYh.d("1326233E2F771F377B"))) return string;
                if (string.startsWith(cYh.d("1338343F333F156A"))) return string;
                if (string.startsWith(cYh.d("172532396D"))) return string;
                Uri uri = Uri.parse((String)charSequence);
                if (string.startsWith((String)charSequence3)) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(uri.getScheme());
                    ((StringBuilder)charSequence).append(string);
                    return ((StringBuilder)charSequence).toString();
                }
                if (string.startsWith(cYh.d("487F"))) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(uri.getScheme());
                    ((StringBuilder)charSequence).append(cYh.d("5D"));
                    ((StringBuilder)charSequence).append(string);
                    return ((StringBuilder)charSequence).toString();
                }
                bl = string.contains(charSequence3);
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
                return string;
            }
            string2 = cYh.d("4361");
            if (!bl) {
                if (!string.startsWith(string3)) break block9;
                charSequence3 = new StringBuilder();
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(string3);
                ((StringBuilder)charSequence3).append(((StringBuilder)charSequence2).toString().replaceAll(cYh.d("497A6939232E17237E0D6D75480B1F7E0A714E7F6F7B"), string2));
                ((StringBuilder)charSequence3).append(string);
                return ((StringBuilder)charSequence3).toString();
            }
        }
        charSequence = string;
        if (!string.contains(charSequence2)) return charSequence;
        charSequence = string;
        if (string.startsWith((String)charSequence2)) return charSequence;
        return string.replaceAll(cYh.d("497A6939232E177E6B78"), string2);
    }

    public static boolean c(String string) {
        if (a.matcher(string).find()) {
            return (!string.contains(cYh.d("04342F7C233514")) || !string.contains(cYh.d("49333222")) && !string.contains(cYh.d("493A32"))) && !string.contains(cYh.d("12222D6C3F2E1320"));
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d(String string) {
        int n2;
        boolean bl;
        String string2;
        block8: {
            string2 = cYh.d("0E2128283E74043F2C");
            bl = false;
            if (!string.contains(cYh.d("12222D6C3F2E1320"))) break block8;
            return false;
        }
        String string3 = Uri.parse((String)string).getHost();
        String[] stringArray = new String[12];
        stringArray[0] = string2;
        try {
            stringArray[1] = cYh.d("117E30207939083D");
            stringArray[2] = cYh.d("1E3F343A2274043F2C");
            stringArray[3] = cYh.d("0B356F323837");
            stringArray[4] = cYh.d("1325253E2274043F2C");
            stringArray[5] = cYh.d("0A3735277939083D");
            stringArray[6] = cYh.d("143F29247939083D");
            stringArray[7] = cYh.d("063327243974043E");
            stringArray[8] = cYh.d("05392D3835330B396F323837");
            stringArray[9] = cYh.d("05312E373234007E223E3A");
            stringArray[10] = cYh.d("172035277939083D");
            stringArray[11] = cYh.d("566971647939083D");
            n2 = 0;
        }
        catch (Exception exception) {
            return bl;
        }
        while (true) {
            boolean bl2 = bl;
            if (n2 >= 12) return bl2;
            if (string3.contains(stringArray[n2])) {
                if (!string2.equals(stringArray[n2])) return true;
                if (string.contains(cYh.d("0E2128283E74043F2C7E3605"))) return true;
                if (string.contains(cYh.d("0E2128283E74043F2C7E2005"))) return true;
                bl2 = string.contains(cYh.d("0E2128283E74043F2C7E2105"));
                if (bl2) {
                    return true;
                }
            }
            ++n2;
            continue;
            break;
        }
    }

    public static JSONObject e(String string, String string2) {
        String string3;
        String string4;
        block11: {
            String string5;
            block10: {
                CharSequence charSequence;
                block9: {
                    Object object = new JSONObject(string2);
                    string2 = cYh.d("03313530");
                    boolean bl = object.has(string2);
                    string4 = cYh.d("12222D");
                    string2 = bl ? object.getJSONObject(string2).getString(string4) : object.getString(string4);
                    string3 = string2;
                    if (string2.startsWith(cYh.d("487F"))) {
                        string3 = n.a(cYh.d("0F2435212460"), string2);
                    }
                    if (!string3.startsWith(cYh.d("0F243521"))) {
                        return null;
                    }
                    if (string3.equals(string) && (m.d(string3) || !m.c(string3))) {
                        return null;
                    }
                    int n2 = !string3.contains(cYh.d("5E67726860694928382B")) && !string3.contains(cYh.d("493628256D")) ? 0 : 1;
                    if (n2 != 0) {
                        return null;
                    }
                    string2 = new JSONObject();
                    CharSequence charSequence2 = object.optString(cYh.d("122324237A3B00352F25"), "");
                    n2 = ((String)charSequence2).trim().length();
                    string5 = cYh.d("322324237A1B00352F25");
                    String string6 = cYh.d("47");
                    if (n2 > 0) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string6);
                        ((StringBuilder)charSequence).append((String)charSequence2);
                        string2.put(string5, (Object)((StringBuilder)charSequence).toString());
                    }
                    object = object.optString(cYh.d("15352734253F15"), "");
                    n2 = ((String)object).trim().length();
                    charSequence = cYh.d("35352734253F15");
                    if (n2 > 0) {
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append(string6);
                        ((StringBuilder)charSequence2).append((String)object);
                        string2.put((String)charSequence, (Object)((StringBuilder)charSequence2).toString());
                    }
                    if (!string.contains(cYh.d("1027367F3A3D13266F323837")) && !string3.contains(cYh.d("1339353039740A373527"))) break block9;
                    string2.put((String)charSequence, (Object)string6);
                    string = cYh.d("471D2E2B3E360B316E64796A");
                    break block10;
                }
                if (!string.contains(cYh.d("05392D3835330B39"))) break block11;
                string2.put((String)charSequence, (Object)cYh.d("4738352527295D7F6E26202D4932283D3E380E3C287F34350A7F"));
                string = cYh.d("471D2E2B3E360B316E64796A47781638393E08273271190E4761717F67614707283F616E5C7039676373471131213B3F3035231A3E2E4865726679695170691A1F0E2A1C6D713B330C35611632390C3F68711432153F2C347863537E717F636C57666F64637A34312730253348657266796951");
            }
            string2.put(string5, (Object)string);
        }
        string = new JSONObject();
        string.put(cYh.d("0F3520353228"), (Object)string2);
        string.put(string4, (Object)string3);
        return string;
    }
}

