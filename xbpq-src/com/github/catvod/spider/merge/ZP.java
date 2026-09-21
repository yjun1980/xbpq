/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge;

import android.net.Uri;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ZP {
    public static Charset S;
    public static Charset T4;
    public static Charset b;
    private static final Pattern l8;

    static {
        l8 = Pattern.compile("http((?!http).)*?default\\.365yg\\.com/.*|http((?!http).){26,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|http((?!http).){26,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");
        S = Charset.forName("UTF-8");
        T4 = Charset.forName("iso-8859-1");
        b = Charset.forName("gb2312");
    }

    public static boolean OL(String string) {
        if (l8.matcher(string).find()) {
            return !string.contains(".js");
        }
        return false;
    }

    public static String S(String object) {
        object = MessageDigest.getInstance("SHA-1").digest(((String)object).getBytes());
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = ((Object)object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = Integer.toHexString(object[i2] & 0xFF);
            if (string.length() == 1) {
                stringBuilder.append('0');
            }
            stringBuilder.append(string);
            continue;
        }
        try {
            object = stringBuilder.toString();
            return object;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            RuntimeException runtimeException = new RuntimeException("SHA-1 algorithm not found", noSuchAlgorithmException);
            throw runtimeException;
        }
    }

    public static JSONObject T4(JSONObject jSONObject, String string, String string2) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        }
        if (string.contains("www.mgtv.com")) {
            jSONObject2.put("Referer", (Object)" ");
            jSONObject2.put("User-Agent", (Object)" Mozilla/5.0");
        } else if (string2.contains("titan.mgtv")) {
            jSONObject2.put("Referer", (Object)" ");
            jSONObject2.put("User-Agent", (Object)" Mozilla/5.0");
        } else if (string.contains("bilibili")) {
            jSONObject2.put("Referer", (Object)" https://www.bilibili.com/");
            jSONObject2.put("User-Agent", (Object)" Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        }
        return jSONObject2;
    }

    public static boolean b(String string, String string2) {
        return string2.contains("973973.xyz") || string2.contains(".fit:");
        {
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean l(String string) {
        int n2;
        String[] stringArray;
        String string2;
        boolean bl = false;
        try {
            string2 = Uri.parse((String)string).getHost();
            stringArray = new String[]{"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com", "1905"};
            n2 = 0;
        }
        catch (Exception exception) {
            return bl;
        }
        while (true) {
            boolean bl2 = bl;
            if (n2 >= 12) return bl2;
            if (string2.contains(stringArray[n2])) {
                if (!"iqiyi.com".equals(stringArray[n2])) return true;
                if (string.contains("iqiyi.com/a_")) return true;
                if (string.contains("iqiyi.com/w_")) return true;
                bl2 = string.contains("iqiyi.com/v_");
                if (bl2) {
                    return true;
                }
            }
            ++n2;
            continue;
            break;
        }
    }

    public static String l8(String object, Charset comparable) {
        object = MessageDigest.getInstance("MD5").digest(((String)object).getBytes((Charset)comparable));
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

    public static JSONObject tT(String string, String charSequence) {
        CharSequence charSequence2;
        Object object = new JSONObject((String)charSequence);
        String string2 = object.optString("url");
        charSequence = string2;
        if (string2.startsWith("//")) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("https:");
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        if (!((String)charSequence).startsWith("http")) {
            return null;
        }
        if (((String)charSequence).equals(string) && (ZP.l((String)charSequence) || !ZP.OL((String)charSequence))) {
            return null;
        }
        if (ZP.b(string, (String)charSequence)) {
            return null;
        }
        string2 = new JSONObject();
        String string3 = object.optString("user-agent", "");
        if (string3.trim().length() > 0) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(" ");
            ((StringBuilder)charSequence2).append(string3);
            string2.put("User-Agent", (Object)((StringBuilder)charSequence2).toString());
        }
        if (((String)(charSequence2 = object.optString("referer", ""))).trim().length() > 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append(" ");
            ((StringBuilder)object).append((String)charSequence2);
            string2.put("Referer", (Object)((StringBuilder)object).toString());
        }
        string2 = ZP.T4((JSONObject)string2, string, (String)charSequence);
        string = new JSONObject();
        string.put("header", (Object)string2);
        string.put("parse", 0);
        string.put("jx", 0);
        string.put("url", (Object)charSequence);
        return string;
    }
}

