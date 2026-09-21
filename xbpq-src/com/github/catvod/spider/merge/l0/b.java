/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.l0;

import android.text.TextUtils;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.i0.d;
import com.github.catvod.spider.merge.l0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {
    private static final Map<String, String> a;
    private static final Map<String, String> b;
    private static final Map<String, String> c;
    private static final Pattern d;
    public static final int e = 0;

    static {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        a = linkedHashMap;
        b = new LinkedHashMap<String, String>();
        c = new LinkedHashMap<String, String>();
        d = Pattern.compile("(https?://[^\\s\\u4e00-\\u9fa5]+)", 2);
        com.github.catvod.spider.merge.l0.b.k("quark", "\u5938\u514b\u7f51\u76d8", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "https://pan.quark.cn/", "quark");
        com.github.catvod.spider.merge.l0.b.k("uc", "UC\u7f51\u76d8", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "https://drive.uc.cn/", "uc");
        com.github.catvod.spider.merge.l0.b.k("baidu", "\u767e\u5ea6\u7f51\u76d8", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/df/92/ee/df92ee21-b113-91fd-d6a9-c63827f1ae28/AppIcon-0-0-1x_U007ephone-0-11-0-0-sRGB-85-220.png/350x350.png", "https://pan.baidu.com/", "dp", "dp");
        com.github.catvod.spider.merge.l0.b.k("xunlei", "\u8fc5\u96f7\u7f51\u76d8", "https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256", "https://pan.xunlei.com/", "xunlei");
        com.github.catvod.spider.merge.l0.b.k("123", "123\u7f51\u76d8", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png", "https://www.123pan.com/", "p123", "p123");
        com.github.catvod.spider.merge.l0.b.k("tianyi", "\u5929\u7ffc\u7f51\u76d8", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a8/fa/f0/a8faf032-0fa4-d9c5-ac70-920d9c84dff1/AppIcon-0-0-1x_U007emarketing-0-7-0-0-sRGB-85-220.png/350x350.png", "https://cloud.189.cn/", "ty", "ty");
        com.github.catvod.spider.merge.l0.b.k("115", "115\u7f51\u76d8", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "https://115.com/", "115");
        com.github.catvod.spider.merge.l0.b.k("aliyun", "\u963f\u91cc\u7f51\u76d8", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", "https://www.alipan.com/", "ali", "ali");
        com.github.catvod.spider.merge.l0.b.k("guangya", "\u5149\u9e2d\u7f51\u76d8", "https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256", "https://guangyapan.com/", "guangya");
        com.github.catvod.spider.merge.l0.b.k("yd", "\u79fb\u52a8\u4e91\u76d8", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/87/17/34/871734bc-6a96-b3bb-55d4-72908f285eef/AppIcon-0-0-1x_U007ephone-0-5-0-85-220-0.png/460x0w.webp", "https://yun.139.com/", "yd", "mobile");
        linkedHashMap.put("yd", "\u79fb\u52a8\u7f51\u76d8");
        com.github.catvod.spider.merge.l0.b.k("magnet", "\u78c1\u529b\u94fe\u63a5", "", "", new String[0]);
        com.github.catvod.spider.merge.l0.b.k("others", "\u5176\u4ed6\u7f51\u76d8", "", "", "other");
    }

    public static boolean a(String string) {
        String string2;
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        boolean bl3 = !(TextUtils.isEmpty((CharSequence)string) || !(string2 = string.toLowerCase(Locale.ROOT)).startsWith("http://") && !string2.startsWith("https://") && !string2.startsWith("magnet:") || !string2.contains("pan.quark") && !string2.contains("drive.uc") && !string2.contains("pan.baidu") && !string2.contains("pan.xunlei") && !string2.contains("123pan") && !string2.contains("123684") && !string2.contains("123865") && !string2.contains("123912") && !string2.contains("123592") && !string2.contains("cloud.189") && !string2.contains("115.com") && !string2.contains("115cdn") && !string2.contains("anxia.com") && !string2.contains("alipan") && !string2.contains("aliyundrive") && !string2.contains("guangyapan") && !string2.contains("yun.139") && !string2.contains("caiyun.139") && !string2.startsWith("magnet:") && !string2.contains(".share.") && !string2.contains(".mshare."));
        if (bl3) {
            return true;
        }
        bl = bl2;
        if (!"other".equals(com.github.catvod.spider.merge.l0.b.j(string))) {
            bl = bl2;
            if (com.github.catvod.spider.merge.l0.b.f(string)) {
                bl = true;
            }
        }
        return bl;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public static String b(String object) {
        if (TextUtils.isEmpty((CharSequence)object)) {
            return "";
        }
        Object object2 = d.matcher((CharSequence)(object = ((String)object).trim().replace("\\ ", " ").replace('\n', ' ').replace('\r', ' ')));
        if (((Matcher)object2).find()) {
            object = ((Matcher)object2).group(1);
        }
        int n2 = ((String)object).indexOf(35);
        object2 = object;
        if (n2 >= 0) {
            object2 = ((String)object).substring(0, n2);
        }
        while (((String)object2).length() > 0 && ((n2 = (int)((String)object2).charAt(((String)object2).length() - 1)) == 46 || n2 == 44 || n2 == 65292 || n2 == 12290 || n2 == 12289 || n2 == 34 || n2 == 39 || n2 == 32 || n2 == 92 || n2 == 41 || n2 == 65307 || n2 == 59)) {
            n2 = ((String)object2).length() - 1;
            object = object2;
            object2 = ((String)object).substring(0, n2);
        }
        return ((String)object2).trim();
    }

    public static List<String> c() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("magnet");
        arrayList.add("quark");
        arrayList.add("uc");
        arrayList.add("baidu");
        arrayList.add("aliyun");
        arrayList.add("xunlei");
        arrayList.add("115");
        arrayList.add("tianyi");
        arrayList.add("123");
        arrayList.add("yd");
        arrayList.add("mobile");
        arrayList.add("guangya");
        return arrayList;
    }

    public static String d(String string, String string2, String string3) {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c(string);
        string = string2;
        if (string2 == null) {
            string = "";
        }
        stringBuilder.append(string);
        stringBuilder.append("@");
        string = string3;
        if (string3 == null) {
            string = "";
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String e(String ... stringArray) {
        for (String string : stringArray) {
            if (!com.github.catvod.spider.merge.R0.e.d(string)) continue;
            return string;
        }
        return "";
    }

    public static boolean f(String string) {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if ((string = string.trim().toLowerCase(Locale.ROOT)).startsWith("http://") || string.startsWith("https://") || string.startsWith("magnet:") || string.startsWith("thunder:") || string.startsWith("ed2k:")) {
            bl2 = true;
        }
        return bl2;
    }

    public static String g(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        String string2 = com.github.catvod.spider.merge.l0.b.p(string);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            return string2;
        }
        string2 = com.github.catvod.spider.merge.l0.b.p(com.github.catvod.spider.merge.l0.b.j(string));
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            return string2;
        }
        try {
            string = NetPan.getYunPanPic(string);
            return string;
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public static String h(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        return com.github.catvod.spider.merge.i0.d.b(string);
    }

    public static String i(String string, String string2) {
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            return string2;
        }
        string = string.trim();
        while (string.endsWith("/")) {
            string = string.substring(0, string.length() - 1);
        }
        return string;
    }

    public static String j(String string) {
        if ((string = string == null ? "" : string.toLowerCase(Locale.ROOT)).contains("quark")) {
            return "quark";
        }
        if (!(string.contains("drive.uc") || string.matches(".*\\buc\\b.*") || string.contains("uc\u7f51\u76d8"))) {
            if (string.contains("baidu")) {
                return "baidu";
            }
            if (string.contains("ali")) {
                return "aliyun";
            }
            if (!(string.contains("xunlei") || string.contains("thunder") || string.contains("\u8fc5\u96f7"))) {
                if (string.contains("115")) {
                    return "115";
                }
                if (!(string.contains("189") || string.contains("tianyi") || string.contains("\u5929\u7ffc"))) {
                    if (!(string.contains("123") || string.contains("mshare") || string.contains("share.123"))) {
                        if (!(string.contains("139") || string.contains("yidong") || string.contains("mobile") || string.contains("\u79fb\u52a8"))) {
                            String string2;
                            String string3 = string2 = "guangya";
                            if (!string.contains("guangya")) {
                                if (string.contains("\u5149\u9e2d")) {
                                    string3 = string2;
                                } else {
                                    string3 = string2 = "magnet";
                                    if (!string.contains("magnet")) {
                                        if (string.startsWith("magnet:")) {
                                            string3 = string2;
                                        } else {
                                            return "other";
                                        }
                                    }
                                }
                            }
                            return string3;
                        }
                        return "yd";
                    }
                    return "123";
                }
                return "tianyi";
            }
            return "xunlei";
        }
        return "uc";
    }

    private static void k(String string, String string2, String string3, String string4, String ... stringArray) {
        com.github.catvod.spider.merge.l0.b.l(string, string2, string3, string4);
        for (String string5 : stringArray) {
            if (com.github.catvod.spider.merge.R0.e.b(string5) || string5.equals(string)) continue;
            com.github.catvod.spider.merge.l0.b.l(string5, string2, string3, string4);
        }
    }

    private static void l(String string, String string2, String string3, String string4) {
        a.put(string, string2);
        b.put(string, string3);
        c.put(string, string4);
    }

    public static void m(String string, String string2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        com.github.catvod.spider.merge.i0.d.c(string, string3);
    }

    public static void n(List<String> list) {
        if (!list.isEmpty()) {
            Collections.sort(list, new a(com.github.catvod.spider.merge.l0.b.c()));
        }
    }

    public static String o(String object) {
        if (TextUtils.isEmpty((CharSequence)object)) {
            return "\u7f51\u76d8";
        }
        Map<String, String> map = a;
        String string = (String)((LinkedHashMap)map).get(object);
        if (string != null) {
            return string;
        }
        if ((map = (String)((LinkedHashMap)map).get(((String)object).toLowerCase(Locale.ROOT))) != null) {
            object = map;
        }
        return object;
    }

    public static String p(String string) {
        Map<String, String> map;
        block5: {
            boolean bl = TextUtils.isEmpty((CharSequence)string);
            String string2 = "";
            if (bl) {
                return "";
            }
            map = b;
            Object object = (String)((LinkedHashMap)map).get(string);
            if (object != null && !((String)object).isEmpty()) {
                return object;
            }
            if ((map = (String)((LinkedHashMap)map).get(string.toLowerCase(Locale.ROOT))) != null && !((String)((Object)map)).isEmpty()) {
                return map;
            }
            object = ((LinkedHashMap)a).entrySet().iterator();
            do {
                map = string2;
                if (!object.hasNext()) break block5;
            } while (!((String)(map = (Map.Entry)object.next()).getValue()).equals(string));
            string = (String)((LinkedHashMap)b).get(map.getKey());
            map = string2;
            if (string != null) {
                map = string;
            }
        }
        return map;
    }
}

