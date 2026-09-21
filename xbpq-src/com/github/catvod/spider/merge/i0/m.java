/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecList
 *  android.net.Uri
 *  android.net.wifi.WifiManager
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.text.format.Formatter
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.CookieManager
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.i0;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.j;
import com.github.catvod.spider.merge.I.o0;
import com.github.catvod.spider.merge.W0.a;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.i0.e;
import com.github.catvod.spider.merge.i0.k;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class m {
    public static final List<String> a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern[] d;
    private static final Pattern e;
    private static final Pattern f;

    static {
        Charset.forName("UTF-8");
        Charset.forName("iso-8859-1");
        a = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        b = Pattern.compile("^(.+)[sS]\\d{1,2}[eE]?\\d?$");
        c = Pattern.compile("^(.+EP)\\d?$");
        d = new Pattern[]{Pattern.compile("(?:^|[\\s._\\-\\[\\]\\(\\)\u3010\u3011])S\\d{1,2}\\s*[-_. ]*E(?:P)?\\s*0*([1-9]\\d{0,3})(?=$|[\\s._\\-\\[\\]\\(\\)\u3010\u3011])", 2), Pattern.compile("(?<![A-Z])E(?:P)?\\s*0*([1-9]\\d{0,3})(?=$|[^0-9A-Z])", 2), Pattern.compile("\u7b2c\\s*0*([1-9]\\d{0,3})\\s*[\u96c6\u8bdd\u8a71\u671f\u56de]"), Pattern.compile("(?<!\\d)0*([1-9]\\d{0,3})\\s*[\u96c6\u8bdd\u8a71\u671f\u56de]")};
        e = Pattern.compile("(?:^|[\\s._\\-\\[\\]\\(\\)\u3010\u3011])0*([1-9]\\d{0,3})(?=$|[\\s._\\-\\[\\]\\(\\)\u3010\u3011])");
        f = Pattern.compile("(?<![0-9A-Za-z\\u4e00-\\u9fa5])0*([1-9]\\d{0,2})(?=[\\u4e00-\\u9fa5])");
    }

    public static String A(String string) {
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            return "";
        }
        return string.replaceAll("#", "").replaceAll("\\+", "").replaceAll("\\$", "");
    }

    public static String B(long l2) {
        long l3 = l2 / 3600L;
        long l4 = (l2 - 3600L * l3) / 60L;
        if (l3 > 0L) {
            return String.format("%d:%02d:%02d", l3, l4, l2 % 60L);
        }
        return String.format("%d:%02d", l4, l2 % 60L);
    }

    public static String C(Map<String, List<String>> object, String object2) {
        int n2;
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        if (object2 != null && !((String)object2).trim().isEmpty()) {
            String[] object32 = ((String)object2).split(";");
            int n3 = object32.length;
            for (n2 = 0; n2 < n3; ++n2) {
                int n4;
                object2 = object32[n2].trim();
                if (((String)object2).isEmpty() || (n4 = ((String)object2).indexOf(61)) <= 0) continue;
                String string = ((String)object2).substring(0, n4);
                object2 = n4 < ((String)object2).length() - 1 ? ((String)object2).substring(n4 + 1) : "";
                linkedHashMap.put(string, object2);
            }
        }
        if (object.containsKey("Set-Cookie") || object.containsKey("set-cookie")) {
            List list = (List)object.get("Set-Cookie");
            object2 = list;
            if (list == null) {
                object2 = (List)object.get("set-cookie");
            }
            if (object2 != null) {
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    object = ((String)iterator.next()).split(";")[0].trim();
                    if (((String)object).isEmpty() || (n2 = ((String)object).indexOf(61)) <= 0) continue;
                    object2 = ((String)object).substring(0, n2);
                    object = n2 < ((String)object).length() - 1 ? ((String)object).substring(n2 + 1) : "";
                    linkedHashMap.put(object2, object);
                }
            }
        }
        object = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((StringBuilder)object).length() > 0) {
                ((StringBuilder)object).append("; ");
            }
            ((StringBuilder)object).append((String)entry.getKey());
            ((StringBuilder)object).append("=");
            ((StringBuilder)object).append((String)entry.getValue());
        }
        return ((StringBuilder)object).toString();
    }

    public static String D(String string) {
        String string2 = string;
        if (string != null) {
            string2 = string;
            if (string.length() > 1) {
                string2 = string.substring(0, string.length() - 1);
            }
        }
        return string2;
    }

    static /* bridge */ /* synthetic */ String a(String string) {
        return m.p(string);
    }

    public static String b(String object) {
        try {
            Object object2 = MessageDigest.getInstance("MD5").digest(((String)object).getBytes("UTF-8"));
            object = new BigInteger(1, (byte[])object2);
            object2 = new StringBuilder;
            ((StringBuilder)object2)(((BigInteger)object).toString(16));
            while (((StringBuilder)object2).length() < 32) {
                ((StringBuilder)object2).insert(0, "0");
            }
            object = ((StringBuilder)object2).toString().toLowerCase();
        }
        catch (Exception exception) {
            object = "";
        }
        return object;
    }

    public static String c(String object, Charset comparable) {
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

    public static void d(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            ((ViewGroup)Init.getActivity().getWindow().getDecorView().findViewById(0x1020002)).addView(view, layoutParams);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static int e(int n2) {
        return (int)TypedValue.applyDimension((int)1, (float)n2, (DisplayMetrics)Init.context().getResources().getDisplayMetrics());
    }

    public static String f(String object) {
        int n2;
        byte[] byArray = ((String)object).getBytes();
        byte[] byArray2 = "PVGDwmcvfs1uV3d1".getBytes();
        object = new byte[16];
        Object object2 = new com.github.catvod.spider.merge.X0.a(new a(new com.github.catvod.spider.merge.V0.a()));
        ((com.github.catvod.spider.merge.X0.a)object2).e(true, new com.github.catvod.spider.merge.Y0.b(new com.github.catvod.spider.merge.Y0.a(byArray2), (byte[])object));
        byArray2 = new byte[((com.github.catvod.spider.merge.X0.a)object2).d(byArray.length)];
        int n3 = ((com.github.catvod.spider.merge.X0.a)object2).f(byArray, 0, byArray.length, byArray2, 0);
        try {
            n2 = ((com.github.catvod.spider.merge.X0.a)object2).c(byArray2, n3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        object2 = new byte[(n3 += n2) + 16];
        System.arraycopy(object, 0, object2, 0, 16);
        System.arraycopy(byArray2, 0, object2, 16, n3);
        return new String(com.github.catvod.spider.merge.Z0.a.b((byte[])object2));
    }

    public static String g(String ... stringArray) {
        for (String string : stringArray) {
            if (TextUtils.isEmpty((CharSequence)string)) continue;
            return string;
        }
        return "";
    }

    public static String h(String string) {
        long l2;
        block6: {
            try {
                l2 = Long.parseLong(string.replaceAll("[^0-9]", ""));
                if (l2 < 100000000L) break block6;
            }
            catch (Exception exception) {
                String string2 = string;
                if (TextUtils.isEmpty((CharSequence)string)) {
                    string2 = "0";
                }
                return string2;
            }
            return String.format(Locale.CHINA, "%.1f\u4ebf", (double)l2 / 1.0E8);
        }
        if (l2 >= 10000L) {
            return String.format(Locale.CHINA, "%.1f\u4e07", (double)l2 / 10000.0);
        }
        return String.valueOf(l2);
    }

    public static String i(List<String> object) {
        block6: {
            block4: {
                String string;
                block5: {
                    int n2 = object.size();
                    if (n2 <= 1) break block4;
                    string = object.get(0);
                    for (int i2 = 1; i2 < n2; ++i2) {
                        int n3;
                        for (n3 = 0; n3 < string.length() && n3 < ((String)object.get(i2)).length() && string.charAt(n3) == ((String)object.get(i2)).charAt(n3); ++n3) {
                        }
                        string = ((String)object.get(i2)).substring(0, n3);
                    }
                    object = b.matcher(string);
                    if (!((Matcher)object).matches() && !((Matcher)(object = c.matcher(string))).matches()) break block5;
                    object = ((Matcher)object).group(1);
                    break block6;
                }
                object = string;
                if (!"\u300a".equals(string)) break block6;
            }
            object = "";
        }
        return object;
    }

    public static String j(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (string != null && !string.trim().isEmpty()) {
            Matcher matcher = Pattern.compile("([^=;]+)=([^;]*)").matcher(string);
            while (matcher.find()) {
                string = matcher.group(1).trim();
                String string2 = matcher.group(2).trim();
                if (string.isEmpty()) continue;
                hashMap.put(string, string2);
            }
        }
        return (String)hashMap.get("__pus");
    }

    public static String k(String string) {
        return string.substring(string.lastIndexOf(".") + 1);
    }

    public static InputStream l(String object) {
        int n2;
        Object object2;
        Object var2_1;
        block4: {
            var2_1 = null;
            object2 = new URL((String)object);
            object2 = (HttpURLConnection)((URL)object2).openConnection();
            ((HttpURLConnection)object2).setRequestMethod("GET");
            ((URLConnection)object2).setRequestProperty("Referer", (String)object);
            ((URLConnection)object2).setConnectTimeout(10000);
            ((URLConnection)object2).setReadTimeout(10000);
            n2 = ((HttpURLConnection)object2).getResponseCode();
            if (n2 != 200) break block4;
            object = object2 = ((URLConnection)object2).getInputStream();
        }
        try {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Failed to download file. ServerStart returned HTTP response code: ");
            ((StringBuilder)object2).append(n2);
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            object = var2_1;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Failed to download ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append(exception.getMessage());
            m.y(((StringBuilder)object2).toString());
            object = var2_1;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String m() {
        String string = "";
        try {
            Object object;
            int n2 = ((WifiManager)Init.context().getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
            if (n2 != 0) {
                return Formatter.formatIpAddress((int)n2);
            }
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            block2: while (true) {
                object = string;
                if (!enumeration.hasMoreElements()) return object;
                Enumeration<InetAddress> enumeration2 = enumeration.nextElement().getInetAddresses();
                do {
                    if (!enumeration2.hasMoreElements()) continue block2;
                } while (((InetAddress)(object = enumeration2.nextElement())).isLoopbackAddress() || !(object instanceof Inet4Address));
                break;
            }
            return ((InetAddress)object).getHostAddress();
        }
        catch (Exception exception) {
            return string;
        }
    }

    public static String n(String string) {
        if (string.endsWith(".mp4")) {
            return "video/mp4";
        }
        if (string.endsWith(".webm")) {
            return "video/webm";
        }
        if (string.endsWith(".avi")) {
            return "video/x-msvideo";
        }
        if (string.endsWith(".wmv")) {
            return "video/x-ms-wmv";
        }
        if (string.endsWith(".flv")) {
            return "video/x-flv";
        }
        if (string.endsWith(".mov")) {
            return "video/quicktime";
        }
        if (string.endsWith(".mkv")) {
            return "video/x-matroska";
        }
        if (string.endsWith(".mpeg")) {
            return "video/mpeg";
        }
        if (string.endsWith(".3gp")) {
            return "video/3gpp";
        }
        if (string.endsWith(".ts")) {
            return "video/MP2T";
        }
        if (string.endsWith(".mp3")) {
            return "audio/mp3";
        }
        if (string.endsWith(".wav")) {
            return "audio/wav";
        }
        if (string.endsWith(".aac")) {
            return "audio/aac";
        }
        if (string.endsWith(".iso")) {
            return "video/iso";
        }
        if (string.endsWith(".m2ts")) {
            return "video/m2ts";
        }
        if (string.endsWith(".mpg")) {
            return "video/mpg";
        }
        return null;
    }

    public static String o(double d2) {
        if (d2 == 0.0) {
            return "";
        }
        if (d2 > 1.099511627776E12) {
            return String.format(Locale.getDefault(), "%.2f%s", d2 /= 1.099511627776E12, "TB");
        }
        if (d2 > 1.073741824E9) {
            return String.format(Locale.getDefault(), "%.2f%s", d2 /= 1.073741824E9, "GB");
        }
        if (d2 > 1048576.0) {
            return String.format(Locale.getDefault(), "%.2f%s", d2 /= 1048576.0, "MB");
        }
        return String.format(Locale.getDefault(), "%.2f%s", d2 /= 1024.0, "KB");
    }

    private static String p(String string) {
        String string2;
        CookieManager cookieManager;
        String string3;
        block5: {
            string3 = "";
            cookieManager = CookieManager.getInstance();
            string2 = cookieManager.getCookie(string);
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                return string2;
            }
            try {
                string = Uri.parse((String)string);
                string2 = string.getHost();
                if (!TextUtils.isEmpty((CharSequence)string2)) break block5;
                return "";
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return "";
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.getScheme());
        stringBuilder.append("://");
        stringBuilder.append(string2);
        stringBuilder.append("/");
        string = cookieManager.getCookie(stringBuilder.toString());
        if (string == null) {
            string = string3;
        }
        return string;
    }

    public static HashMap<String, String> q(String string, HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        Init.run(new j(new k(hashMap2), hashMap, string));
        long l2 = SystemClock.elapsedRealtime();
        while (!hashMap2.containsKey("_done") && SystemClock.elapsedRealtime() < l2 + 30000L) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                Thread.currentThread().interrupt();
                break;
            }
        }
        hashMap2.remove("_done");
        if (!hashMap2.containsKey("cookies")) {
            hashMap2.put("cookies", m.p(string));
        }
        if (!hashMap2.containsKey("html")) {
            hashMap2.put("html", "");
        }
        return hashMap2;
    }

    public static boolean r() {
        MediaCodecInfo[] mediaCodecInfoArray = new MediaCodecList(1).getCodecInfos();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (MediaCodecInfo mediaCodecInfo : mediaCodecInfoArray) {
            if (mediaCodecInfo.isEncoder()) continue;
            for (String string : mediaCodecInfo.getSupportedTypes()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("\n");
                arrayList.add(stringBuilder.toString());
                if (!(string.equalsIgnoreCase("video/x-vnd.on2.vp8") || string.equalsIgnoreCase("video/x-vnd.on2.vp9") || string.equalsIgnoreCase("video/av01"))) {
                    continue;
                }
                return true;
            }
        }
        com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("codecs.txt"), ((Object)arrayList).toString());
        return false;
    }

    private static boolean s(String string) {
        boolean bl = "264".equals(string) || "265".equals(string) || "480".equals(string) || "576".equals(string) || "720".equals(string) || "1080".equals(string);
        return bl;
    }

    public static boolean t(String string) {
        boolean bl = string.equals("srt") || string.equals("ass") || string.equals("ssa");
        return bl;
    }

    public static boolean u(String string) {
        if (!(string.contains("url=http") || string.contains(".js") || string.contains(".css") || string.contains(".html"))) {
            return com.github.catvod.spider.merge.i0.e.a.matcher(string).find();
        }
        return false;
    }

    public static boolean v(String string) {
        Iterator<String> iterator = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com").iterator();
        while (iterator.hasNext()) {
            if (!string.contains(iterator.next())) continue;
            return true;
        }
        return false;
    }

    public static JSONObject w(String string, String string2) {
        String string3;
        block10: {
            block9: {
                block8: {
                    Object object = new JSONObject(string2);
                    string2 = string3 = object.getString("url");
                    if (string3.startsWith("//")) {
                        string2 = com.github.catvod.spider.merge.B.e.c("https:", string3);
                    }
                    if (!string2.startsWith("http")) {
                        return null;
                    }
                    if (string2.equals(string) && (m.v(string2) || !m.u(string2))) {
                        return null;
                    }
                    string3 = new JSONObject();
                    String string4 = object.optString("user-agent", "");
                    if (string4.trim().length() > 0) {
                        string3.put("User-Agent", (Object)string4);
                    }
                    if (((String)(object = object.optString("referer", ""))).trim().length() > 0) {
                        string3.put("Referer", object);
                    }
                    if (!string.contains("www.mgtv.com") && !string2.contains("titan.mgtv")) break block8;
                    string3.put("Referer", (Object)"");
                    string = "Mozilla/5.0";
                    break block9;
                }
                if (!string.contains("bilibili")) break block10;
                string3.put("Referer", (Object)"https://www.bilibili.com/");
                string = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
            }
            string3.put("User-Agent", (Object)string);
        }
        string = new JSONObject();
        string.put("header", (Object)string3);
        string.put("url", (Object)string2);
        return string;
    }

    public static String x(String string) {
        Object object;
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            return "";
        }
        string = string.trim();
        Object object2 = d;
        int n2 = ((Pattern[])object2).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = object2[i2].matcher(string);
            if (!((Matcher)object).find()) continue;
            return ((Matcher)object).group(1);
        }
        object2 = e.matcher(string);
        while (((Matcher)object2).find()) {
            object = ((Matcher)object2).group(1);
            if (m.s((String)object)) continue;
            return object;
        }
        object2 = f.matcher(string);
        while (((Matcher)object2).find()) {
            string = ((Matcher)object2).group(1);
            if (m.s(string)) continue;
            return string;
        }
        return "";
    }

    public static void y(String string) {
        SpiderDebug.log((String)string);
        Init.run(new o0(string, 5));
    }

    public static String z(String string) {
        String string2 = string;
        if (string.contains(".")) {
            string2 = string.substring(0, string.lastIndexOf("."));
        }
        return string2;
    }
}

