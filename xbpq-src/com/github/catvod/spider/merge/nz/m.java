/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.nz;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.dp.n;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class m {
    private static final Pattern a = Pattern.compile("http((?!http).)*?default\\.365yg\\.com/.*|http\\S{12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http\\S{12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?\\S*|http\\S{12,}?m3u8\\S*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?dycdn-tos\\.pstatp[^\\?]*|http.*?/play.{0,3}\\?[^url]{2,8}=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*|http((?!http).)*?douyin\\.com/.*/play/\\?.*|http((?!http).)*?huoshan\\.com/.*/\\?item.*|magnet:.*|ed2k:.*|ftp:.*|file:.*|tvbox-xg:.*|thunder:.*|push:.*");
    public static Charset b = Charset.forName("UTF-8");
    public static Charset c = Charset.forName("iso-8859-1");

    public static String a(String object, Charset comparable) {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String b(String charSequence, String string) {
        block8: {
            Object object;
            try {
                if (string.startsWith("http")) return string;
                if (string.startsWith("magnet:")) return string;
                if (string.startsWith("ftp:")) return string;
                if (string.startsWith("ed2k:")) return string;
                if (string.startsWith("file:")) return string;
                if (string.startsWith("tvbox-xg:")) return string;
                if (string.startsWith("thunder:")) return string;
                if (string.startsWith("push:")) return string;
                object = Uri.parse((String)charSequence);
                if (string.startsWith("://")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(object.getScheme());
                    ((StringBuilder)charSequence).append(string);
                    return ((StringBuilder)charSequence).toString();
                }
                if (string.startsWith("//")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(object.getScheme());
                    ((StringBuilder)charSequence).append(":");
                    ((StringBuilder)charSequence).append(string);
                    return ((StringBuilder)charSequence).toString();
                }
                boolean bl = string.contains("://");
                if (bl) break block8;
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
                return string;
            }
            if (!string.startsWith("/")) break block8;
            StringBuilder stringBuilder = new StringBuilder();
            object = new StringBuilder();
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append("/");
            stringBuilder.append(((StringBuilder)object).toString().replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        charSequence = string;
        if (!string.contains("http")) return charSequence;
        charSequence = string;
        if (string.startsWith("http")) return charSequence;
        return string.replaceAll(".*(http.*)", "$1");
    }

    public static boolean c(String string) {
        if (a.matcher(string).find()) {
            return (!string.contains("cdn-tos") || !string.contains(".css") && !string.contains(".js")) && !string.contains("url=http");
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d(String string) {
        int n2;
        String[] stringArray;
        String string2;
        boolean bl;
        block7: {
            bl = false;
            if (!string.contains("url=http")) break block7;
            return false;
        }
        try {
            string2 = Uri.parse((String)string).getHost();
            stringArray = new String[]{"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com", "1905.com"};
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

    public static JSONObject e(String string, String string2) {
        String string3;
        block11: {
            block10: {
                block9: {
                    StringBuilder stringBuilder;
                    Object object = new JSONObject(string2);
                    string2 = object.has("data") ? object.getJSONObject("data").getString("url") : object.getString("url");
                    string3 = string2;
                    if (string2.startsWith("//")) {
                        string3 = n.a("https:", string2);
                    }
                    if (!string3.startsWith("http")) {
                        return null;
                    }
                    if (string3.equals(string) && (m.d(string3) || !m.c(string3))) {
                        return null;
                    }
                    boolean bl = string3.contains("973973.xyz") || string3.contains(".fit:");
                    if (bl) {
                        return null;
                    }
                    string2 = new JSONObject();
                    String string4 = object.optString("user-agent", "");
                    if (string4.trim().length() > 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(" ");
                        stringBuilder.append(string4);
                        string2.put("User-Agent", (Object)stringBuilder.toString());
                    }
                    if (((String)(object = object.optString("referer", ""))).trim().length() > 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(" ");
                        stringBuilder.append((String)object);
                        string2.put("Referer", (Object)stringBuilder.toString());
                    }
                    if (!string.contains("www.mgtv.com") && !string3.contains("titan.mgtv")) break block9;
                    string2.put("Referer", (Object)" ");
                    string = " Mozilla/5.0";
                    break block10;
                }
                if (!string.contains("bilibili")) break block11;
                string2.put("Referer", (Object)" https://www.bilibili.com/");
                string = " Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
            }
            string2.put("User-Agent", (Object)string);
        }
        string = new JSONObject();
        string.put("header", (Object)string2);
        string.put("url", (Object)string3);
        return string;
    }
}

