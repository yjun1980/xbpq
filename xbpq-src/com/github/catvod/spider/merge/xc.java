/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.net.UrlQuerySanitizer
 *  android.os.Environment
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.Response
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.UrlQuerySanitizer;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy$3;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0786;
import com.github.catvod.spider.merge.\u0788;
import com.github.catvod.spider.merge.\u078a;
import com.github.catvod.spider.merge.\u078c;
import com.github.catvod.spider.merge.\u0790;
import com.github.catvod.spider.merge.\u0793;
import com.github.catvod.spider.merge.\u0796;
import java.io.ByteArrayInputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class xc
extends Spider {
    private static long \u037f = 0L;
    private static SharedPreferences \u0528;
    private static String \u0529 = "";
    private static String \u052a = "";
    private static boolean \u052b = false;
    private static String \u052c = "";
    private static String \u052d = "";
    public static String \u052e = "";
    public static String \u052f = "";
    public static String \u058f = "";
    private static String \u0620 = "";
    private static String \u0780 = "";
    public static String \u0781 = "";
    public static String \u0782 = "";
    private static String \u0783 = "";
    private static String \u0784 = "";
    private static String \u0785 = "";
    private static String \u0786 = "";
    private static String \u0787 = "";
    private static String \u0788 = "";
    private static boolean \u0789 = true;
    private static boolean \u078a = true;
    private static String \u078b = "false";
    private static String \u078c = "";
    private static String \u078d = "";
    private static String \u078e = ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a#.wma";
    private static String \u078f = "=http#.html#?http";
    private static String \u0790;
    private static Map<String, String> \u0791;
    private static Map<String, Long> \u0792;
    private static Map<String, String> \u0793;
    private static final Map<String, Map<String, String>> \u0794;
    private static final ReentrantLock \u0795;
    public static Pattern \u0796;
    public static Pattern \u0797;
    private static boolean \u0798;
    private static boolean \u0799;
    private static boolean \u079a;
    private static boolean \u079b;

    static {
        \u0790 = Environment.getExternalStorageDirectory().getAbsolutePath();
        \u0791 = new HashMap<String, String>();
        \u0792 = new HashMap<String, Long>();
        \u0793 = new HashMap<String, String>();
        \u0794 = new HashMap<String, Map<String, String>>();
        \u0795 = new ReentrantLock();
        \u0796 = Pattern.compile(SOY.d("523A25020404407D7E010300547A301A1D071B3C2D17181E03273F12061E0C3778581718177D22592F29580F7A5F"));
        \u0797 = Pattern.compile(SOY.d("0D2526585C16163B21171A0B1B3E380F01191E203800115E54313E1B5B04557A0A285B2A517B79591218163634045B5F210C7E2B5F5E536D"));
        \u0798 = true;
        \u0799 = true;
        \u079a = true;
    }

    public static Object[] File(Map<String, String> object) {
        String string;
        try {
            String string2 = object.get(SOY.d("093A300411281336"));
            string = SOY.d("1B22211A1D141B2638191A580C3C355815070A3E345819071F35240418");
            object = new ByteArrayInputStream(xc.\u0786(string2, xc.\u0783(string2, ""), object.get(SOY.d("1C3B3D132B1E1E"))).getBytes());
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
        return new Object[]{200, string, object};
    }

    public static Object[] ProxyMedia(Map<String, String> object) {
        \u078a.\u037f \u03f3;
        try {
            String string = object.get(SOY.d("093A300411281336"));
            \u03f3 = object.get(SOY.d("1C3B3D132B1E1E"));
            String string2 = object.get(SOY.d("1737351F15281336"));
            String string3 = xc.\u0783(string, "");
            ReentrantLock reentrantLock = \u0795;
            reentrantLock.lock();
            Map<String, Map<String, String>> map = \u0794;
            object = map.get(\u03f3).get(string2);
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer((String)object);
            Long l2 = new Long(urlQuerySanitizer.getValue(SOY.d("027F3E05075A1F2A211F061209")));
            if (l2 - xc.\u0785() <= 60L) {
                xc.\u0786(string, string3, (String)((Object)\u03f3));
                object = map.get(\u03f3).get(string2);
            }
            reentrantLock.unlock();
            \u03f3 = new \u078a.\u037f(){

                @Override
                public void onFailure(Call call, Exception exception) {
                }

                @Override
                public void onResponse(Response response) {
                }
            };
            com.github.catvod.spider.merge.\u078c.\u052a(com.github.catvod.spider.merge.\u078c.\u0529(), (String)object, null, xc.\u0620(), \u03f3);
            object = SOY.d("0C3B35131B5837026322");
            \u03f3 = ((Response)\u03f3.getResult()).body().byteStream();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
        return new Object[]{200, object, \u03f3};
    }

    /*
     * Unable to fully structure code
     */
    public static Object[] ProxyopenMedia(Map<String, String> var0) {
        try {
            var7_2 = var0.get(SOY.d("1C3B3D132B1E1E"));
            var4_3 = var0.get(SOY.d("1737351F15281336"));
            var5_4 = var0.get(SOY.d("1E20380011281336"));
            var1_5 = var0.get(SOY.d("1E373D13121E1637")).equals(SOY.d("0E202413"));
            var3_6 = xc.\u0795;
            var3_6.lock();
        }
        catch (Exception var0_1) {
            SpiderDebug.log((Throwable)var0_1);
            return null;
        }
        var2_7 = SOY.d("0C3B35131B5837026322");
        var6_8 = SOY.d("027F3E05075A1F2A211F061209");
        if (!var1_5) ** GOTO lbl30
        var7_2 = var0.get(SOY.d("093A300411281336"));
        xc.\u0620 = xc.\u0783(var7_2, "");
        var8_9 = (String)var0.get(SOY.d("1520361F1A11133E34291D13"));
        var10_11 = xc.\u0794;
        var0 = var10_11.get(var8_9).get(var4_3);
        var11_15 = new UrlQuerySanitizer((String)var0);
        var9_13 = new Long(var11_15.getValue(var6_8));
        if (var9_13 - xc.\u0785() <= 60L) {
            xc.getOpenPreview(var8_9, var7_2, var5_4);
            var0 = var10_11.get(var8_9).get(var4_3);
        }
        var3_6.unlock();
        var3_6 = new \u078a.\u037f(){

            @Override
            public void onFailure(Call call, Exception exception) {
            }

            @Override
            public void onResponse(Response response) {
            }
        };
        com.github.catvod.spider.merge.\u078c.\u052a(com.github.catvod.spider.merge.\u078c.\u0529(), (String)var0, null, xc.\u0620(), var3_6);
        return new Object[]{200, var2_7, ((Response)var3_6.getResult()).body().byteStream()};
lbl30:
        // 1 sources

        var9_14 = xc.\u0794;
        var0 = var9_14.get(var7_2).get(var4_3);
        var10_12 = new UrlQuerySanitizer((String)var0);
        var8_10 = new Long(var10_12.getValue(var6_8));
        if (var8_10 - xc.\u0785() <= 60L) {
            xc.getPreviewUrl(var7_2, var5_4, var1_5);
            var0 = var9_14.get(var7_2).get(var4_3);
        }
        var3_6.unlock();
        var3_6 = new \u078a.\u037f(){

            @Override
            public void onFailure(Call call, Exception exception) {
            }

            @Override
            public void onResponse(Response response) {
            }
        };
        com.github.catvod.spider.merge.\u078c.\u052a(com.github.catvod.spider.merge.\u078c.\u0529(), (String)var0, null, xc.\u0620(), var3_6);
        var0 = ((Response)var3_6.getResult()).body().byteStream();
        return new Object[]{200, var2_7, var0};
    }

    public static boolean checkstring(String string) {
        String string2 = SOY.d("1761244E5A070D7D1217171F1F");
        String string3 = SOY.d("1C203E1B491F0E2621054E58553030180D0214357F0603");
        String string4 = SOY.d("1D37251B4702426D2404184A12262506");
        for (int i2 = 0; i2 < 3; ++i2) {
            if (!string.contains((new String[]{string2, string3, string4})[i2])) continue;
            return true;
        }
        return false;
    }

    public static String getOpenPreview(String string, String string2, String string3) {
        block3: {
            String string4;
            try {
                \u079b = true;
                string4 = xc.\u052d(string, string2, string3);
                string = xc.getPreviewUrl(string4, string3, string, string2, \u079b);
                if (string4 == null) break block3;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return "";
            }
            if (string4.isEmpty()) break block3;
            xc.\u052e(string4, string3);
        }
        return string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String getPreviewUrl(String var0, String var1_2, String var2_3, String var3_4, boolean var4_5) {
        var10_6 = SOY.d("70");
        var8_7 = SOY.d("55");
        xc.\u079b = var4_5;
        if (xc.\u0789 != false ? xc.\u0528.getString(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F"), xc.\u058f).isEmpty() != false : xc.\u0528.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), xc.\u0782).isEmpty() != false) {
            xc.\u078a();
        }
        var7_8 = 0;
        var5_9 = 0;
        while (true) {
            var9_10 = new JSONObject();
            var9_10.put(SOY.d("1C3B3D132B1E1E"), (Object)var0);
            var9_10.put(SOY.d("1E20380011281336"), (Object)var1_2);
            var9_10.put(SOY.d("193325131318082B"), (Object)SOY.d("163B27132B0308333F0517181E3B3F11"));
            var9_10.put(SOY.d("0F203D29110F0A3B23132B041F31"), (Object)SOY.d("4B66654644"));
            if (!(var9_10 = xc.\u052a(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B161E20380011580C637F465B180A373F301D1B1F7D361300211336341924051F24381303271633283F1A1115"), (JSONObject)var9_10)).contains(SOY.d("5827231A564D583A250204")) && ++var5_9 <= 3) continue;
            break;
        }
        var11_11 = new JSONObject((String)var9_10);
        var11_11 = xc.\u0781(var11_11.getJSONObject(SOY.d("0C3B35131B280A2034001D120D0D211A150E253B3F101B")).getJSONArray(SOY.d("163B27132B0308333F0517181E3B3F112B031B213A29181E0926")));
        var13_12 = com.github.catvod.spider.merge.\u078c.\u058f((String)var11_11, xc.\u0620());
        var9_10 = new StringBuilder();
        var9_10.append(var11_11.substring(0, var11_11.lastIndexOf(var8_7)));
        var9_10.append(var8_7);
        var9_10 = var9_10.toString();
        var11_11 = new ArrayList();
        var12_13 = new HashMap<StringBuilder, String>();
        var13_12 = var13_12.split(var10_6);
        var6_14 = 0;
        var5_9 = var7_8;
        while (true) {
            block14: {
                block15: {
                    if (var5_9 >= var13_12.length) break;
                    var8_7 = var13_12[var5_9];
                    if (!var8_7.contains(SOY.d("027F3E05075A1F2A211F061209"))) break block14;
                    var14_15 /* !! */  = new StringBuilder();
                    var14_15 /* !! */ .append("");
                    var14_15 /* !! */ .append(var6_14);
                    var14_15 /* !! */  = var14_15 /* !! */ .toString();
                    var15_16 /* !! */  = new StringBuilder();
                    var15_16 /* !! */ .append((String)var9_10);
                    var15_16 /* !! */ .append(var8_7);
                    var12_13.put(var14_15 /* !! */ , var15_16 /* !! */ .toString());
                    var4_5 = xc.\u079b;
                    var8_7 = SOY.d("5C3F34121D16253B354B");
                    var14_15 /* !! */  = SOY.d("5C34381A112813366C");
                    var15_16 /* !! */  = SOY.d("45363E4B0402093A77020D071F6F3E0611191737351F15511E203800112813366C");
                    if (!var4_5) ** GOTO lbl88
                    var16_17 = new StringBuilder();
                    var16_17.append(Proxy$3.localProxyUrl());
                    var16_17.append((String)var15_16 /* !! */ );
                    var16_17.append(var1_2);
                    var16_17.append((String)var14_15 /* !! */ );
                    var16_17.append(var0);
                    var16_17.append(SOY.d("5C2139170612253B354B"));
                    var16_17.append(var3_4);
                    var16_17.append(SOY.d("5C3D23111D191C3B3D132B1E1E6F"));
                    var16_17.append(var2_3);
                    var16_17.append(var8_7);
                    var16_17.append(var6_14);
                    var16_17.append(SOY.d("5C36341A1111133E344B00050F37"));
                    var8_7 = var16_17.toString();
                    break block15;
lbl88:
                    // 1 sources

                    var16_17 = new StringBuilder();
                    var16_17.append(Proxy$3.localProxyUrl());
                    var16_17.append((String)var15_16 /* !! */ );
                    var16_17.append(var1_2);
                    var16_17.append((String)var14_15 /* !! */ );
                    var16_17.append(var0);
                    var16_17.append(var8_7);
                    var16_17.append(var6_14);
                    var16_17.append(SOY.d("5C36341A1111133E344B1216162134"));
                    var8_7 = var16_17.toString();
                }
                ++var6_14;
            }
            var11_11.add(var8_7);
            ++var5_9;
            continue;
            break;
        }
        try {
            if (xc.\u079b) {
                xc.\u0794.put(var2_3, var12_13);
            } else {
                xc.\u0794.put(var0, var12_13);
            }
            var0 = TextUtils.join((CharSequence)var10_6, (Iterable)var11_11);
            return var0;
        }
        catch (Exception var0_1) {
            var0_1.printStackTrace();
            return "";
        }
    }

    public static String getPreviewUrl(String string, String string2, boolean bl) {
        return xc.getPreviewUrl(string, string2, "", "", bl);
    }

    public static String getSize(double d2) {
        if (d2 == 0.0) {
            return "";
        }
        String string = SOY.d("5F7C63105104");
        if (d2 > 1.099511627776E12) {
            return String.format(Locale.getDefault(), string, d2 /= 1.099511627776E12, SOY.d("2E10"));
        }
        if (d2 > 1.073741824E9) {
            return String.format(Locale.getDefault(), string, d2 /= 1.073741824E9, SOY.d("3D10"));
        }
        if (d2 > 1048576.0) {
            return String.format(Locale.getDefault(), string, d2 /= 1048576.0, SOY.d("3710"));
        }
        return String.format(Locale.getDefault(), string, d2 /= 1024.0, SOY.d("3110"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object[] loadPic(Map<String, String> object) {
        try {
            Object object2 = (String)object.get(SOY.d("093B2513"));
            String string = (String)object.get(SOY.d("0A3B32"));
            object = new HashMap();
            ((HashMap)object).put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594D4354627F4242474C7C644254241B3430041D584F6166584741"));
            ((HashMap)object).put(SOY.d("08373713061208"), object2);
            \u078a.\u037f \u03f3 = new \u078a.\u037f(){

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            com.github.catvod.spider.merge.\u078c.\u052a(com.github.catvod.spider.merge.\u078c.\u0529(), string, null, object, \u03f3);
            if (((Response)\u03f3.getResult()).code() != 200) return null;
            object = object2 = ((Response)\u03f3.getResult()).headers().get(SOY.d("393D3F0211190E7F050F0412"));
            if (object2 == null) {
                object = SOY.d("1B22211A1D141B2638191A5815312513005A09262313151A");
            }
            System.out.println(string);
            System.out.println((String)object);
            object2 = ((Response)\u03f3.getResult()).body().byteStream();
            return new Object[]{200, object, object2};
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public static Object[] openFile(Map<String, String> object) {
        Object object2;
        try {
            object2 = object.get(SOY.d("093A300411281336"));
            String string = object.get(SOY.d("1C3B3D132B1E1E"));
            String string2 = object.get(SOY.d("1E20380011281336"));
            object = SOY.d("1B22211A1D141B2638191A580C3C355815070A3E345819071F35240418");
            object2 = new ByteArrayInputStream(xc.getOpenPreview(string, (String)object2, string2).getBytes());
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
        return new Object[]{200, object, object2};
    }

    public static Object[] openselfFile(Map<String, String> object) {
        Object object2;
        try {
            object2 = object.get(SOY.d("1C3B3D132B1E1E"));
            String string = object.get(SOY.d("1E20380011281336"));
            boolean bl = object.get(SOY.d("1E373D13121E1637")).equals(SOY.d("0E202413"));
            object = SOY.d("1B22211A1D141B2638191A580C3C355815070A3E345819071F35240418");
            object2 = new ByteArrayInputStream(xc.getPreviewUrl((String)object2, string, bl).getBytes());
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
        return new Object[]{200, object, object2};
    }

    public static String repl(String string) {
        String string2 = SOY.d("593B36181B051F1B3C11490308273455");
        int n2 = 0;
        String string3 = SOY.d("593B36181B051F0438121118472623031154");
        String string4 = SOY.d("593B36181B051F1F24051D14472623031154");
        String string5 = SOY.d("593B22201D131F3D6C0206021F71");
        String string6 = SOY.d("593B223B010413316C0206021F71");
        String string7 = SOY.d("593B36181B051F1F62234C54");
        String string8 = SOY.d("593B223B47024271");
        String string9 = SOY.d("0C3B35131B4D557D");
        String string10 = string;
        if (!string.isEmpty()) {
            while (true) {
                string10 = string;
                if (n2 >= 8) break;
                string = string.replace((new String[]{string2, string3, string4, string5, string6, string7, string8, string9})[n2], "");
                ++n2;
            }
        }
        return string10.replaceAll(SOY.d("95EECA99C8EC"), SOY.d("41"));
    }

    public static Object[] vod(Map<String, String> map) {
        String string = map.get(SOY.d("0E2B2113"));
        if (string.equals(SOY.d("1761244E"))) {
            return xc.File(map);
        }
        if (string.equals(SOY.d("1737351F15"))) {
            return xc.ProxyMedia(map);
        }
        if (string.equals(SOY.d("152234180402183F62034C"))) {
            return xc.openFile(map);
        }
        if (string.equals(SOY.d("15223418071216343C45014F"))) {
            return xc.openselfFile(map);
        }
        if (string.equals(SOY.d("1522341819121E3B30"))) {
            return xc.ProxyopenMedia(map);
        }
        if (string.equals(SOY.d("0A3B32060618022B"))) {
            return xc.loadPic(map);
        }
        return null;
    }

    private static String \u037f(String string, String string2) {
        CharSequence charSequence;
        if (!string.startsWith(SOY.d("1226250607"))) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C59"));
            ((StringBuilder)charSequence).append(string);
            string = ((StringBuilder)charSequence).toString();
        }
        charSequence = xc.\u078b(string, string2, xc.\u052f());
        if (xc.\u052b((String)charSequence)) {
            return xc.\u037f(string, string2);
        }
        return charSequence;
    }

    private static String \u0528(String string, JSONObject jSONObject) {
        return xc.\u037f(string, jSONObject.toString());
    }

    private static String \u0529(String string, String string2) {
        CharSequence charSequence;
        if (!string.startsWith(SOY.d("1226250607"))) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B"));
            ((StringBuilder)charSequence).append(string);
            string = ((StringBuilder)charSequence).toString();
        }
        charSequence = xc.\u078b(string, string2, xc.\u058f());
        if (xc.\u052c((String)charSequence)) {
            return xc.\u0529(string, string2);
        }
        return charSequence;
    }

    private static String \u052a(String string, JSONObject jSONObject) {
        return xc.\u0529(string, jSONObject.toString());
    }

    private static boolean \u052b(String string) {
        if (!string.contains(SOY.d("3B31321307042E3D3A131A3E1424301A1D13")) && !string.contains(SOY.d("3B31321307042E3D3A131A32022238041113"))) {
            return false;
        }
        if (\u0789) {
            \u052d = "";
        } else {
            \u0780 = "";
        }
        xc.\u0782();
        return \u078a;
    }

    private static boolean \u052c(String string) {
        if (!string.contains(SOY.d("3B31321307042E3D3A131A3E1424301A1D13")) && !string.contains(SOY.d("3B31321307042E3D3A131A32022238041113"))) {
            return false;
        }
        if (\u0789) {
            \u052d = "";
            \u052f = "";
            \u0528.edit().remove(SOY.d("2A27331A1D14283737041104121D21131A")).apply();
            \u058f = "";
            \u0528.edit().remove(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F")).apply();
        } else {
            \u0780 = "";
            \u0781 = "";
            \u0528.edit().remove(SOY.d("2A20380015031F0034100612093A1E061119")).apply();
            \u0782 = "";
            \u0528.edit().remove(SOY.d("2A20380015031F133215110409063E1D111935223418")).apply();
        }
        xc.\u0782();
        if (\u079a) {
            xc.\u078a();
        }
        return \u078a;
    }

    private static String \u052d(String string, String string2, String string3) {
        string = String.format(SOY.d("0170231305021F212505564D212973141B1303706B0D5611133E34291D135868735307555670221E15051F0D3812564D5877225458551B2725192B051F3C301B115540262303115B58263E29041608373F022B11133E34291D13586873041B180E707D5400182536231F0212253B35544E555F21730B585512373012110509706B0D5634153C25131A0357062806115540703006041B133130021D18147D3B051B19582F7D541D1358687346565B583F34021C181E706B5424382906735A5602083E734C56581C3B3D135B1415222854092A5670231307180F203213564D5834381A115507"), string, string2, string3);
        string = xc.\u037f(SOY.d("1B36231F02125524635916160E3139"), string);
        if (string.contains(SOY.d("1F2A321311131F3671021C125A3E381B1D03"))) {
            if (\u0789) {
                \u0528.edit().remove(SOY.d("2A27331A1D1428373704110412063E1D1119")).apply();
                \u0528.edit().remove(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F")).apply();
            } else {
                \u0528.edit().remove(SOY.d("2A20380015031F0034100612093A05191F1214")).apply();
                \u0528.edit().remove(SOY.d("2A20380015031F133215110409063E1D111935223418")).apply();
            }
            Init.show(SOY.d("9FEFC293FDFA92E6F793FBC09FDDFE91E0DF9DFBEB9FE3C39FE5E390CFD695EEDD9EDBC09FE2CC9EDBE29CEAD491E4F19DEFC091EFEF9FC2DF9FF3FA92FDC495F4F5"));
        }
        return new JSONObject(string).getJSONArray(SOY.d("083722061B19093722")).getJSONObject(0).getJSONObject(SOY.d("183D350F")).getString(SOY.d("1C3B3D132B1E1E"));
    }

    private static void \u052e(String string, String string2) {
        try {
            string = String.format(SOY.d("0170231305021F212505564D212973141B1303706B0D5613083B27132B1E1E706B545104587E73101D1B1F0D3812564D58772254095B583A341710120821734C0F55393D3F0211190E7F050F0412586873170407163B3217001E153C7E1C071814702C5A561E1E706B545104587E731B1103123D35544E552A1D0222565B5827231A564D587D371F18125536341A11031F702C2B58550837221901051937734C5611133E345409"), string2, string, string);
            xc.\u037f(SOY.d("1B36231F02125524635916160E3139"), string);
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
    }

    private static HashMap<String, String> \u052f() {
        HashMap<String, String> hashMap = xc.\u0620();
        boolean bl = \u0789;
        String string = SOY.d("1B27251E1B05132830021D1814");
        if (bl) {
            hashMap.put(string, \u052d);
        } else {
            hashMap.put(string, \u0780);
        }
        hashMap.put(SOY.d("027F32171A16082B"), SOY.d("193E38131A034725341458160A226C051C1608377D001105093B3E184901487C625845"));
        if (\u079b) {
            string = \u0620;
            hashMap.put(SOY.d("027F221E15051F7F25191F1214"), string);
        }
        return hashMap;
    }

    private static HashMap<String, String> \u058f() {
        HashMap<String, String> hashMap = xc.\u0620();
        boolean bl = \u0789;
        String string = SOY.d("1B27251E1B05132830021D1814");
        if (bl) {
            SharedPreferences sharedPreferences = \u0528;
            String string2 = \u058f;
            hashMap.put(string, sharedPreferences.getString(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F"), string2));
        } else {
            SharedPreferences sharedPreferences = \u0528;
            String string3 = \u0782;
            hashMap.put(string, sharedPreferences.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), string3));
        }
        return hashMap;
    }

    private static HashMap<String, String> \u0620() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F345945464A7C615844594A7202171216083B7E434740546167"));
        hashMap.put(SOY.d("28373713061208"), SOY.d("12262506074D557D260103591B3E380F01191E2038001159193D3C59"));
        return hashMap;
    }

    private static HashMap<String, String> \u0780() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F345945464A7C615844594A7202171216083B7E434740546167"));
        return hashMap;
    }

    private static String \u0781(JSONArray jSONArray) {
        String string;
        String string2 = SOY.d("2F1A15");
        String string3 = SOY.d("2B1A15");
        String string4 = SOY.d("3C1A15");
        String string5 = SOY.d("3216");
        String string6 = SOY.d("2916");
        String string7 = SOY.d("3616");
        int n2 = 0;
        while (true) {
            string = SOY.d("0F203D");
            if (n2 >= 6) break;
            String string8 = (new String[]{string2, string3, string4, string5, string6, string7})[n2];
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (!jSONObject.getString(SOY.d("0E373C0618160E370E1F10")).equals(string8)) continue;
                return jSONObject.getString(string);
            }
            ++n2;
        }
        return jSONArray.getJSONObject(0).getString(string);
    }

    /*
     * Exception decompiling
     */
    private static void \u0782() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[SIMPLE_IF_TAKEN]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static String \u0783(String string, String string2) {
        String string3;
        long l2;
        block12: {
            long l3;
            // MONITORENTER : com.github.catvod.spider.merge.xc.class
            // MONITORENTER : com.github.catvod.spider.merge.xc.class
            l2 = xc.\u0785();
            string3 = \u0791.get(string);
            Long l4 = \u0792.get(string);
            if (TextUtils.isEmpty((CharSequence)string3) || (l3 = l4.longValue()) - l2 <= 600L) break block12;
            // MONITOREXIT : com.github.catvod.spider.merge.xc.class
            return string3;
        }
        string3 = new JSONObject();
        string3.put(SOY.d("093A300411281336"), (Object)string);
        string3.put(SOY.d("093A300411280A2535"), (Object)string2);
        string2 = new JSONObject(xc.\u078b(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C590245552139170612253E38181F581D372529071F1B203429001811373F"), string3.toString(), xc.\u0620()));
        string3 = string2.getString(SOY.d("093A300411280E3D3A131A"));
        \u0792.put(string, l2 + string2.getLong(SOY.d("1F2A211F0612090D3818")));
        \u0791.put(string, string3);
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        // MONITOREXIT : com.github.catvod.spider.merge.xc.class
        return string3;
        {
            catch (JSONException jSONException) {}
            {
                SpiderDebug.log((Throwable)jSONException);
                // MONITOREXIT : com.github.catvod.spider.merge.xc.class
            }
            // MONITOREXIT : com.github.catvod.spider.merge.xc.class
            return "";
        }
    }

    private static void \u0784() {
        Object object = new \u0793();
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(SOY.d("4A66"));
        ((StringBuilder)charSequence).append(com.github.catvod.spider.merge.\u0796.\u0528(((\u0793)object).\u037f().\u037f().\u037f()));
        \u0529 = ((StringBuilder)charSequence).toString();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(SOY.d("4F36351340124B3035104D124E6B6740164442653317414F1C663345121319616B"));
        ((StringBuilder)charSequence).append(\u0783);
        String string = SOY.d("40");
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(\u0784);
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(0);
        charSequence = com.github.catvod.spider.merge.\u0796.\u0528(com.github.catvod.spider.merge.\u0790.\u037f(((StringBuilder)charSequence).toString(), (\u0793)object).\u037f().\u037f());
        object = new StringBuilder();
        ((StringBuilder)object).append(((String)charSequence).substring(((String)charSequence).length() - 128));
        ((StringBuilder)object).append(SOY.d("4A63"));
        \u052a = ((StringBuilder)object).toString();
    }

    protected static long \u0785() {
        return System.currentTimeMillis() / 1000L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String \u0786(String var0, String var1_2, String var2_3) {
        block36: {
            var8_4 = SOY.d("70");
            var10_5 = SOY.d("55");
            var13_6 = SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C5902455534381A11581D372529071F1B203429181E14390E001D131F3D0E0606120C3B34012B07163328291D191C3D");
            var11_7 = SOY.d("0E373C0618160E370E1F10");
            var14_8 = SOY.d("3B31321307042E3D3A131A3E1424301A1D13");
            var15_9 = SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C5901041F2022590246552722130604553634001D141F7D320411160E370E051104093B3E18");
            xc.\u0784();
            var12_10 = xc.\u0620();
            var3_11 = 0;
            while (true) {
                block35: {
                    block34: {
                        var17_16 /* !! */  = new JSONObject();
                        var17_16 /* !! */ .put(SOY.d("1E37271F171234333C13"), (Object)SOY.d("393A231919129CE7DE9ED3FF9FCBF9"));
                        var17_16 /* !! */ .put(SOY.d("173D351318391B3F34"), (Object)SOY.d("2D3B3F121B0009B5ECE79DD6CFB5D8FE"));
                        var17_16 /* !! */ .put(SOY.d("143D3F1511"), 0);
                        var17_16 /* !! */ .put(SOY.d("0A27333D110E"), (Object)xc.\u0529);
                        var6_12 = xc.\u0789;
                        var9_14 = SOY.d("1B27251E1B05132830021D1814");
                        var7_13 = SOY.d("083737041104120D25191F1214");
                        if (!var6_12) ** GOTO lbl32
                        var17_16 /* !! */ .put(var7_13, (Object)xc.\u0528.getString(SOY.d("2A27331A1D1428373704110412063E1D1119"), xc.\u052e));
                        var12_10.put((String)var9_14, (String)xc.\u052d);
                        break block34;
lbl32:
                        // 1 sources

                        var17_16 /* !! */ .put(var7_13, (Object)xc.\u0528.getString(SOY.d("2A20380015031F0034100612093A05191F1214"), xc.\u052e));
                        var12_10.put((String)var9_14, (String)xc.\u0780);
                    }
                    var12_10.put((String)SOY.d("027F221E15051F7F25191F1214"), (String)var1_2);
                    var12_10.put((String)SOY.d("027F3513021E19377C1F10"), (String)xc.\u0783);
                    var12_10.put((String)SOY.d("027F221F13191B26240411"), (String)xc.\u052a);
                    var9_14 = xc.\u078b(var15_9, var17_16 /* !! */ .toString(), var12_10);
                    var6_12 = var9_14.contains(var14_8);
                    var16_15 = SOY.d("3B31321307042E3D3A131A32022238041113");
                    if (var6_12) ** GOTO lbl50
                    var7_13 = var9_14;
                    if (!var9_14.contains(var16_15)) break block35;
lbl50:
                    // 2 sources

                    if (xc.\u0789) {
                        xc.\u052d = "";
                    } else {
                        xc.\u0780 = "";
                    }
                    xc.\u0782();
                    var7_13 = xc.\u078b(var15_9, var17_16 /* !! */ .toString(), var12_10);
                }
                if (var7_13.contains(SOY.d("083722031803586825040112"))) break;
                xc.\u0784();
                if (++var3_11 <= 3) continue;
                break;
            }
            var12_10.put((String)SOY.d("027F32171A16082B"), (String)SOY.d("193E38131A034725341458160A226C1710051324345A0212082138191A4A0C667F475A46"));
            var12_10.put((String)SOY.d("152038111D19"), (String)SOY.d("12262506074D557D260103591B3E380F01191E2038001159193D3C"));
            var12_10.put((String)SOY.d("1C3B3D131D13"), (String)xc.\u0784);
            var9_14 = new HashMap<String, String>();
            var9_14.put(SOY.d("193325131318082B"), SOY.d("163B27132B0308333F0517181E3B3F11"));
            var9_14.put(SOY.d("1C3B3D132B1E1E"), var2_3);
            var9_14.put(SOY.d("1D37252904051F24381303280F203D"), true);
            var9_14.put(SOY.d("1D3725290702182638021812253B3F101B"), true);
            var9_14.put(SOY.d("093A300411281336"), var0);
            var9_14.put((String)var11_7, "");
            var7_13 = xc.\u078b(var13_6, var9_14.toString(), var12_10);
            if (var7_13.contains(var14_8)) ** GOTO lbl85
            var1_2 = var7_13;
            if (!var7_13.contains(var16_15)) break block36;
lbl85:
            // 2 sources

            if (xc.\u0789) {
                xc.\u052d = "";
            } else {
                xc.\u0780 = "";
            }
            xc.\u0782();
            var1_2 = xc.\u078b(var13_6, var9_14.toString(), var12_10);
        }
        var7_13 = new JSONObject((String)var1_2);
        var9_14 = var7_13.getJSONObject(SOY.d("0C3B35131B280A2034001D120D0D211A150E253B3F101B")).getJSONArray(SOY.d("163B27132B0308333F0517181E3B3F112B031B213A29181E0926"));
        var13_6 = SOY.d("2F1A15");
        var16_15 = SOY.d("2B1A15");
        var14_8 = SOY.d("3C1A15");
        var15_9 = SOY.d("3216");
        var18_17 = SOY.d("2916");
        var17_16 /* !! */  = SOY.d("3616");
        var1_2 = "";
        var3_11 = 0;
        while (true) {
            var12_10 = SOY.d("0F203D");
            var7_13 = var1_2;
            if (var3_11 >= 6) break;
            var19_19 = (new String[]{var13_6, var16_15, var14_8, var15_9, var18_17, var17_16 /* !! */ })[var3_11];
            var4_18 = 0;
            while (true) {
                var7_13 = var1_2;
                if (var4_18 >= var9_14.length()) break;
                var7_13 = var9_14.getJSONObject(var4_18);
                if (var7_13.optString(var11_7).equals(var19_19) && var7_13.optString((String)var12_10).startsWith(SOY.d("12262506"))) {
                    var7_13 = var7_13.getString((String)var12_10);
                    break;
                }
                ++var4_18;
                continue;
                break;
            }
            if (!var7_13.isEmpty()) break;
            ++var3_11;
            var1_2 = var7_13;
            continue;
            break;
        }
        var1_2 = var7_13;
        if (!var7_13.isEmpty()) ** GOTO lbl131
        var1_2 = var7_13;
        if (var9_14.length() > 0) {
            var1_2 = var9_14.getJSONObject(0).getString((String)var12_10);
        }
lbl131:
        // 4 sources

        var7_13 = com.github.catvod.spider.merge.\u078c.\u058f((String)var1_2, xc.\u0620());
        var9_14 = new HashMap<String, String>();
        var4_18 = var1_2.lastIndexOf(var10_5);
        var3_11 = 0;
        var9_14.append(var1_2.substring(0, var4_18));
        var9_14.append(var10_5);
        var10_5 = var9_14.toString();
        var11_7 = new ArrayList<CharSequence>();
        var9_14 = new HashMap<String, String>();
        var12_10 = var7_13.split(var8_4);
        var5_20 = 0;
        while (true) {
            block33: {
                if (var5_20 >= var12_10.length) break;
                var7_13 = var12_10[var5_20];
                var1_2 = var7_13;
                var4_18 = var3_11;
                if (!var7_13.contains(SOY.d("027F3E05075A1F2A211F061209"))) break block33;
                var1_2 = new StringBuilder();
                var1_2.append("");
                var1_2.append(var3_11);
                var13_6 = var1_2.toString();
                var1_2 = new StringBuilder();
                var1_2.append(var10_5);
                var1_2.append(var7_13);
                var9_14.put(var13_6, var1_2.toString());
                var1_2 = new StringBuilder();
                var1_2.append(Proxy$3.localProxyUrl());
                var1_2.append(SOY.d("45363E4B0402093A77020D071F6F3C13101E1B74221E15051F0D381249"));
                var1_2.append(var0);
                var1_2.append(SOY.d("5C34381A112813366C"));
                var1_2.append(var2_3);
                var1_2.append(SOY.d("5C3F34121D16253B354B"));
                var1_2.append(var3_11);
                var1_2 = var1_2.toString();
                var4_18 = var3_11 + 1;
            }
            var11_7.add(var1_2);
            ++var5_20;
            var3_11 = var4_18;
            continue;
            break;
        }
        try {
            xc.\u0794.put(var2_3, var9_14);
            var0 = TextUtils.join((CharSequence)var8_4, var11_7);
            return var0;
        }
        catch (Exception var0_1) {
            SpiderDebug.log((Throwable)var0_1);
            return "";
        }
    }

    private String \u0787(String string) {
        JSONObject jSONObject = new JSONObject();
        Object object = SOY.d("083737041104120D25191F1214");
        jSONObject.put((String)object, (Object)string);
        jSONObject.put(SOY.d("1D20301800280E2B2113"), object);
        string = jSONObject.toString();
        object = xc.\u0620();
        return new JSONObject(xc.\u078b(SOY.d("12262506074D557D3003001F54333D1F0D021436231F021254313E1B5B01487D301517180F3C2559001811373F"), string, (Map<String, String>)object)).getString(SOY.d("0F2134042B1E1E"));
    }

    private String \u0788(String string, String string2) {
        Object object;
        if (\u0789 ? \u0528.getString(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F"), \u058f).isEmpty() : \u0528.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), \u0782).isEmpty()) {
            xc.\u078a();
        }
        int n2 = 0;
        while (true) {
            int n3;
            object = new JSONObject();
            object.put(SOY.d("1C3B3D132B1E1E"), (Object)string);
            object.put(SOY.d("1E20380011281336"), (Object)string2);
            object = xc.\u052a(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B161E20380011580C637F465B180A373F301D1B1F7D3613003315253F1A1B161E07231A"), (JSONObject)object);
            if (((String)object).contains(SOY.d("5827231A564D583A250204"))) break;
            n2 = n3 = n2 + 1;
            if (n3 <= 3) continue;
            break;
        }
        try {
            string = new JSONObject((String)object);
            string = string.getString(SOY.d("0F203D"));
            return string;
        }
        catch (Exception exception) {
            return "";
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void \u0789(String var0) {
        block9: {
            SpiderDebug.log((String)SOY.d("351324021C572837351F061219267F585A"));
            var2_2 = "";
            var3_3 /* !! */  = new JSONObject();
            var3_3 /* !! */ .put(SOY.d("193D3513"), (Object)var0);
            var3_3 /* !! */ .put(SOY.d("1D20301800280E2B2113"), (Object)SOY.d("1B27251E1B05132830021D18140D32191012"));
            var0 = var2_2;
            if (!xc.\u0798) ** GOTO lbl17
            var0 = var2_2 = xc.\u078b(SOY.d("12262506074D557D30061D59143C7F151D581B3E380500581B3E38291B071F3C7E021B1C1F3C"), var3_3 /* !! */ .toString(), xc.\u0620());
            if (var2_2.isEmpty()) {
                var0 = xc.\u078b(SOY.d("12262506074D557D30061D5A19347F181A59193B7E17181E09267E17181E253D21131A58193D3513"), var3_3 /* !! */ .toString(), xc.\u0620());
            }
lbl17:
            // 4 sources

            if (var0.contains(SOY.d("2E3D3E563916142B712411060F37220207"))) {
                xc.\u0798 = false;
                Init.show(SOY.d("92FDE690C5F59FF6FB9FD6E69DEBD099C8FB92F5F793FBE693CBC193FCC19EE8D7"));
            } else {
                xc.\u0798 = true;
            }
            var2_2 = new JSONObject(var0);
            xc.\u079a = false;
            var1_4 = xc.\u0789;
            var3_3 /* !! */  = SOY.d("1B313213070425263E1D1119");
            var0 = SOY.d("5A");
            var4_5 = SOY.d("0E3D3A131A280E2B2113");
            var5_6 = SOY.d("083737041104120D25191F1214");
            if (!var1_4) ** GOTO lbl43
            try {
                xc.\u052f = var2_2.optString((String)var5_6);
                var5_6 = new StringBuilder();
                var5_6.append(var2_2.optString(var4_5));
                var5_6.append(var0);
                var5_6.append(var2_2.optString((String)var3_3 /* !! */ ));
                xc.\u058f = var5_6.toString();
                xc.\u0528.edit().putString(SOY.d("2A27331A1D14283737041104121D21131A"), xc.\u052f).apply();
                xc.\u0528.edit().putString(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F"), xc.\u058f).apply();
                break block9;
lbl43:
                // 1 sources

                xc.\u0781 = var2_2.optString((String)var5_6);
                var5_6 = new StringBuilder();
                var5_6.append(var2_2.optString(var4_5));
                var5_6.append(var0);
                var5_6.append(var2_2.optString((String)var3_3 /* !! */ ));
                xc.\u0782 = var5_6.toString();
                xc.\u0528.edit().putString(SOY.d("2A20380015031F0034100612093A1E061119"), xc.\u0781).apply();
                xc.\u0528.edit().putString(SOY.d("2A20380015031F133215110409063E1D111935223418"), xc.\u0782).apply();
            }
            catch (Exception var0_1) {
                SpiderDebug.log((Throwable)var0_1);
            }
        }
    }

    private static void \u078a() {
        try {
            SpiderDebug.log((String)SOY.d("351324021C572837200311040E7C7F58"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("1B27251E1B05132834"), 1);
            jSONObject.put(SOY.d("09313E0611"), (Object)SOY.d("0F2134044E151B21345A121E16376B17181B40203417105B1C3B3D134E16163E6B01061E0E37"));
            JSONObject jSONObject2 = new JSONObject(xc.\u0528(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B181B27251E5B02093723055B160F263919061E00376E15181E1F3C25291D134765674F45401931321510434E666015474E4E67661744431C64614E40111860375006121E3B231317032527231F491F0E2621054E5855333D1F0703543C3F58171E55263E1918581B3E380F01191E203800115819333D1A16161939770517180A376C0307120868331707125634381A114D1B3E3D4C06121B367D101D1B1F68301A184D0D203802115109263002114A"), jSONObject));
            xc.\u0789(jSONObject2.getString(SOY.d("0837351F0612192604041D")).split(SOY.d("193D351349"))[1]);
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
    }

    private static String \u078b(String string, String string2, Map<String, String> map) {
        \u078a.\u0528 \u0529 = new \u078a.\u0528(){

            @Override
            public void onFailure(Call call, Exception exception) {
            }

            @Override
            public void onResponse(String string) {
            }
        };
        com.github.catvod.spider.merge.\u078c.\u052e(com.github.catvod.spider.merge.\u078c.\u0529(), string, string2, map, \u0529);
        return (String)\u0529.getResult();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void \u078c() {
        String string = SOY.d("08372219010519370E12061E0C370E1F10");
        try {
            HashMap<String, String> hashMap = xc.\u0620();
            String string2 = SOY.d("1B27251E1B05132830021D1814");
            String string3 = \u0789 ? \u052d : \u0780;
            hashMap.put(string2, string3);
            string3 = new JSONObject(xc.\u078b(SOY.d("12262506074D557D2405110554333D1F0D021436231F021254313E1B5B01487D2405110555353402"), SOY.d("012F"), hashMap));
            if (!TextUtils.isEmpty((CharSequence)string3.optString(string)) && !string3.optString(string).equals(SOY.d("14273D1A"))) {
                \u0788 = string3.optString(string);
                if (\u0789) {
                    \u0528.edit().putString(SOY.d("2A27331A1D14283722121D13"), \u0788).apply();
                    return;
                } else {
                    \u0528.edit().putString(SOY.d("2A20380015031F003405101E1E"), \u0788).apply();
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public String detailContent(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [211[CATCHBLOCK]], but top level block is 18[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    public String downalisub(String var1_1, String var2_3) {
        block3: {
            try {
                var4_4 = new JSONObject();
                var4_4.put(SOY.d("093A300411281336"), (Object)var2_3);
                var4_4.put(SOY.d("1C3B3D132B1E1E"), var1_1);
                var1_1 = xc.\u0620();
                var3_5 = xc.\u0789;
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
                SpiderDebug.log((Throwable)var1_2);
                return "";
            }
            var5_6 = SOY.d("1B27251E1B05132830021D1814");
            if (!var3_5) ** GOTO lbl19
            var1_1.put(var5_6, xc.\u052d);
            break block3;
lbl19:
            // 1 sources

            var1_1.put(var5_6, xc.\u0780);
        }
        var1_1.put(SOY.d("027F221E15051F7F25191F1214"), xc.\u0783(var2_3, ""));
        var1_1 = xc.\u078b(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C5902455534381A11581D372529071F1B203429181E14390E121B00143E3E1710280F203D"), var4_4.toString(), (Map<String, String>)var1_1);
        var2_3 = new JSONObject((String)var1_1);
        var1_1 = var2_3.getString(SOY.d("1E3D261818181B360E03061B"));
        return var1_1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getAliContent(List<String> var1_1) {
        var8_3 = SOY.d("59");
        var10_4 = SOY.d("0E2B2113");
        var7_5 = SOY.d("0F203D");
        var9_6 = SOY.d("1C3B3D132B1E14343E05");
        try {
            var5_7 = ((String)var1_1.get(0)).trim();
            var4_8 = var5_7;
            if (var5_7.startsWith(SOY.d("01"))) {
                var4_8 = var5_7;
                if (var5_7.endsWith(SOY.d("07"))) {
                    var4_8 = var5_7;
                    if (var5_7.contains(SOY.d("5827231A"))) {
                        var6_9 = new JSONObject((String)var5_7);
                        if (var6_9.has((String)var7_5)) {
                            var4_8 = xc.repl(var6_9.getString((String)var7_5));
                        } else {
                            var4_8 = var5_7;
                            if (var6_9.has(SOY.d("0F203D05"))) {
                                var4_8 = xc.repl((String)var5_7);
                            }
                        }
                    }
                }
            }
            if (!(var5_7 = xc.\u0797.matcher((CharSequence)var4_8)).find()) {
                return "";
            }
            var12_10 = var5_7.group(2);
            var5_7 = var5_7.groupCount() == 4 ? var5_7.group(4) : "";
            var7_5 = xc.\u0620();
            var7_5.put(SOY.d("027F32171A16082B"), SOY.d("193E38131A034725341458160A226C051C1608377D001105093B3E184901487C625845"));
            var6_9 = new JSONObject();
            var6_9.put(SOY.d("093A300411281336"), (Object)var12_10);
            var6_9 = xc.\u078b(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C591513083B27135B01497D221E15051F0D3D1F1A1C553534022B04123323132B15030D30181B19033F3E0307"), var6_9.toString(), (Map<String, String>)var7_5);
            if (var6_9.contains(SOY.d("093A30041128163B3F1D541E097237190615133635131A"))) {
                Init.show(SOY.d("9CC4D692CFC192EDCC9ED3F395EEDD90D4CE9CDFFF91EFCF9FD7E290C7E29FECDA90C7E292F5D59ED2F69CE3D399C8FB92FDF490E2F09EE9E793C3C59DF4D090D9D592FCEE9FE3D999D2D3"));
            }
            if (var6_9.contains(SOY.d("093A30041128163B3F1D541E097232171A141F3E3D1310")) || var6_9.contains(SOY.d("093A30041128163B3F1D541E0972340E041E083735"))) {
                Init.show(SOY.d("9CCFF490EDED9FC7F799C8FB92FDF493FCF19EE8FA93C3C59FF6E090E1FF99D2D3"));
            }
            if ((var15_12 = (var13_11 = new JSONObject((String)var6_9)).getJSONArray(var9_6)).length() == 0) {
                return "";
            }
            var3_13 = TextUtils.isEmpty((CharSequence)var5_7);
        }
        catch (Exception var1_2) {
            SpiderDebug.log((Throwable)var1_2);
            return "";
        }
        var14_14 = SOY.d("1C3B3D132B1E1E");
        if (var3_13) ** GOTO lbl-1000
        {
            for (var2_15 = 0; var2_15 < var15_12.length(); ++var2_15) {
                var7_5 = var15_12.getJSONObject(var2_15);
                if (!var7_5.getString(var14_14).equals(var7_5.getString(var14_14))) continue;
                var6_9 = var5_7;
                var5_7 = var7_5;
                ** GOTO lbl56
            }
            var7_5 = null;
            var6_9 = var5_7;
            var5_7 = var7_5;
            ** GOTO lbl56
        }
lbl-1000:
        // 1 sources

        {
            var5_7 = var15_12.getJSONObject(0);
            var6_9 = var5_7.getString(var14_14);
lbl56:
            // 3 sources

            var7_5 = new JSONObject();
            var7_5.put(SOY.d("0C3D35291D13"), var1_1.get(0));
            var7_5.put(SOY.d("0C3D35291A161737"), (Object)var13_11.getString(SOY.d("093A3004112814333C13")));
            var7_5.put(SOY.d("0C3D3529041E19"), (Object)var13_11.getString(SOY.d("1B2430021505")));
            var7_5.put(SOY.d("0C3D352917181426341800"), var4_8);
            var7_5.put(SOY.d("0E2B21132B191B3F34"), (Object)SOY.d("93CAEE9FF3FB9EE8C091EFEF"));
            var11_16 = new ArrayList<String>();
            if (var5_7.getString((String)var10_4).equals(SOY.d("1C3B3D13"))) {
                var6_9 = SOY.d("083D3E02");
            }
            var16_17 = xc.\u0783((String)var12_10, "");
            var4_8 = new LinkedHashMap();
            var5_7 = new Object();
            var1_1 = var4_8;
            this.listFiles((Map<String, String>)var4_8, (ArrayList<String>)var5_7, (String)var12_10, var16_17, (String)var6_9);
            if (var15_12.length() <= 1) ** GOTO lbl-1000
            for (var2_15 = 1; var2_15 < var13_11.getJSONArray(var9_6).length(); ++var2_15) {
                if (!var13_11.getJSONArray(var9_6).getJSONObject(var2_15).getString((String)var10_4).equals(SOY.d("1C3D3D121105"))) continue;
                this.listFiles((Map<String, String>)var1_1, (ArrayList<String>)var5_7, (String)var12_10, var16_17, var13_11.getJSONArray(var9_6).getJSONObject(var2_15).getString(var14_14));
            }
        }
lbl-1000:
        // 3 sources

        {
            for (String var9_6 : var1_1.keySet()) {
                var4_8 = (String)var1_1.get(var9_6);
                if (var5_7.size() > 0) {
                    var13_11 = var5_7.iterator();
                    while (var13_11.hasNext()) {
                        var10_4 = (String)var13_11.next();
                        var12_10 = var10_4.split(SOY.d("3A1211"))[0];
                        var14_14 = var9_6.substring(0, var9_6.lastIndexOf(91));
                        var14_14 = var14_14.substring(0, var14_14.lastIndexOf(46));
                        if (!var9_6.contains(var12_10) && !var12_10.contains(var14_14)) continue;
                        var12_10 = new StringBuilder();
                        var12_10.append((String)var4_8);
                        var12_10.append(SOY.d("51"));
                        var12_10.append((String)var10_4);
                        var4_8 = var12_10.toString();
                        break;
                    }
                }
                var10_4 = new StringBuilder();
                var10_4.append(var9_6);
                var10_4.append(SOY.d("5E"));
                var10_4.append((String)var4_8);
                var11_16.add(var10_4.toString());
            }
            if (var11_16.size() > 0) {
                var1_1 = new ArrayList();
                var1_1.add(TextUtils.join((CharSequence)var8_3, var11_16));
                var1_1.add(TextUtils.join((CharSequence)var8_3, var11_16));
                var4_8 = SOY.d("0C3D3529041B1B2B0E03061B");
                var1_1 = TextUtils.join((CharSequence)SOY.d("5E7675"), (Iterable)var1_1);
                var7_5.put((String)var4_8, var1_1);
                var7_5.put(SOY.d("0C3D3529041B1B2B0E10061817"), (Object)SOY.d("3522341891F9E5B5C5CD50535E1D21131A9FC7FEB6D6F5"));
            }
            var1_1 = new JSONObject();
            var4_8 = new JSONArray();
            var4_8.put(var7_5);
            var1_1.put(SOY.d("163B2202"), var4_8);
            return var1_1.toString();
        }
    }

    public String getDownloadUrl(String string, String string2, String string3) {
        block3: {
            try {
                \u079b = true;
                string = xc.\u052d(string, string2, string3);
                string2 = this.\u0788(string, string3);
                if (string == null) break block3;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return "";
            }
            if (string.isEmpty()) break block3;
            xc.\u052e(string, string3);
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getSelfContent(List<String> object) {
        String string = SOY.d("59");
        String string2 = SOY.d("14333C13");
        String string3 = SOY.d("0F203D");
        Object object2 = SOY.d("1E373717011B0E0D35041D011F0D3812");
        try {
            ArrayList<String> arrayList = ((String)object.get(0)).trim();
            String string4 = SOY.d("370BB8EECB9EFDDEB5CCE590E1CA");
            Object object3 = new JSONObject();
            LinkedHashMap<String, String> linkedHashMap = arrayList;
            ArrayList<String> arrayList2 = string4;
            JSONObject jSONObject = object3;
            if (((String)((Object)arrayList)).startsWith(SOY.d("01"))) {
                linkedHashMap = arrayList;
                arrayList2 = string4;
                jSONObject = object3;
                if (((String)((Object)arrayList)).endsWith(SOY.d("07"))) {
                    linkedHashMap = arrayList;
                    arrayList2 = string4;
                    jSONObject = object3;
                    if (((String)((Object)arrayList)).contains(SOY.d("5827231A"))) {
                        Object object4 = new JSONObject((String)((Object)arrayList));
                        if (object4.has(string3)) {
                            object3 = xc.repl(object4.getString(string3));
                        } else {
                            object3 = arrayList;
                            if (object4.has(SOY.d("0F203D05"))) {
                                object3 = xc.repl((String)((Object)arrayList));
                            }
                        }
                        linkedHashMap = object3;
                        arrayList2 = string4;
                        jSONObject = object4;
                        if (object4.has(string2)) {
                            arrayList2 = object4.getString(string2);
                            jSONObject = object4;
                            linkedHashMap = object3;
                        }
                    }
                }
            }
            \u052b = false;
            \u0789 = false;
            xc.\u0782();
            object3 = SOY.d("083D3E02");
            if (((String)((Object)linkedHashMap)).contains(SOY.d("5536231F021255343E1A1012087D"))) {
                object3 = ((String)((Object)linkedHashMap)).split(SOY.d("55343E1A1012087D"))[1];
            }
            if (jSONObject.has((String)object2)) {
                \u0787 = jSONObject.getString((String)object2);
            }
            jSONObject = new JSONObject();
            jSONObject.put(SOY.d("0C3D35291D13"), object.get(0));
            jSONObject.put(SOY.d("0C3D35291A161737"), (Object)arrayList2);
            jSONObject.put(SOY.d("0C3D3529041E19"), (Object)\u0785);
            jSONObject.put(SOY.d("0C3D352917181426341800"), (Object)linkedHashMap);
            jSONObject.put(SOY.d("0E2B21132B191B3F34"), (Object)SOY.d("93CAEE9FF3FB9EE8C091EFEF"));
            arrayList2 = new ArrayList<String>();
            linkedHashMap = new LinkedHashMap<String, String>();
            arrayList = new ArrayList<String>();
            if (\u0528.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), \u0782).isEmpty()) {
                xc.\u078a();
            }
            this.listSelfFiles(linkedHashMap, arrayList, \u0787, (String)object3);
            for (Object object4 : linkedHashMap.keySet()) {
                block16: {
                    object = object3 = (String)linkedHashMap.get(object4);
                    if (arrayList.size() > 0) {
                        object2 = arrayList.iterator();
                        do {
                            object = object3;
                            if (!object2.hasNext()) break block16;
                            object = (String)object2.next();
                            string2 = ((String)object).split(SOY.d("3A1211"))[0];
                            string3 = ((String)object4).substring(0, ((String)object4).lastIndexOf(91));
                            string3 = string3.substring(0, string3.lastIndexOf(46));
                        } while (!((String)object4).contains(string2) && !string2.contains(string3));
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append((String)object3);
                        ((StringBuilder)object2).append(SOY.d("06"));
                        ((StringBuilder)object2).append((String)object);
                        object = ((StringBuilder)object2).toString();
                    }
                }
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object4);
                ((StringBuilder)object3).append(SOY.d("5E"));
                ((StringBuilder)object3).append((String)object);
                arrayList2.add(((StringBuilder)object3).toString());
            }
            if (arrayList2.size() > 0) {
                object = new ArrayList();
                ((ArrayList)object).add(TextUtils.join((CharSequence)string, arrayList2));
                ((ArrayList)object).add(TextUtils.join((CharSequence)string, arrayList2));
                jSONObject.put(SOY.d("0C3D3529041B1B2B0E03061B"), (Object)TextUtils.join((CharSequence)SOY.d("5E7675"), (Iterable)object));
                jSONObject.put(SOY.d("0C3D3529041B1B2B0E10061817"), (Object)SOY.d("93CAEE9FF3FB9FDCCE91E0CC5E76759FECC893D5DD9EC9DB9DF2D0"));
            }
            object3 = new JSONObject();
            object = new JSONArray();
            object.put((Object)jSONObject);
            object3.put(SOY.d("163B2202"), object);
            return object3.toString();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    public String getselfDownloadUrl(String string, String string2) {
        Object object;
        int n2;
        int n3;
        block6: {
            n3 = 0;
            \u079b = false;
            n2 = n3;
            if (!\u0528.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), \u0782).isEmpty()) break block6;
            xc.\u078a();
            n2 = n3;
        }
        while (true) {
            object = new JSONObject();
            object.put(SOY.d("1C3B3D132B1E1E"), (Object)string);
            object.put(SOY.d("1E20380011281336"), (Object)string2);
            object = xc.\u052a(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B161E20380011580C637F465B180A373F301D1B1F7D3613003315253F1A1B161E07231A"), (JSONObject)object);
            if (((String)object).contains(SOY.d("5827231A564D583A250204"))) break;
            n2 = n3 = n2 + 1;
            if (n3 <= 3) continue;
            break;
        }
        try {
            string = new JSONObject((String)object);
            string = string.getString(SOY.d("0F203D"));
            return string;
        }
        catch (Exception exception) {
            return "";
        }
    }

    /*
     * Unable to fully structure code
     */
    public String getshareAudioUrl(String var1_1, String var2_3) {
        block3: {
            try {
                var4_4 = xc.\u0620();
                var4_4.put(SOY.d("027F221E15051F7F25191F1214"), xc.\u0783(var2_3, ""));
                var3_5 = xc.\u0789;
            }
            catch (Exception var1_2) {
                SpiderDebug.log((Throwable)var1_2);
                return "";
            }
            var5_6 = SOY.d("1B27251E1B05132830021D1814");
            if (!var3_5) ** GOTO lbl15
            var4_4.put(var5_6, xc.\u052d);
            break block3;
lbl15:
            // 1 sources

            var4_4.put(var5_6, xc.\u0780);
        }
        var5_6 = new JSONObject();
        var5_6.put(SOY.d("1C3B3D132B1E1E"), (Object)var1_1);
        var5_6.put(SOY.d("1D37252915021E3B3E29041B1B2B0E1F1A1115"), true);
        var5_6.put(SOY.d("093A300411281336"), (Object)var2_3);
        var1_1 = new JSONObject(xc.\u078b(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C5902455534381A11581D372529071F1B203429181E14390E121B00143E3E1710280F203D"), var5_6.toString(), var4_4));
        var1_1 = var1_1.getString(SOY.d("1E3D261818181B360E03061B"));
        return var1_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String hikernetpush(List<String> object) {
        String string = SOY.d("0F203D");
        try {
            JSONObject jSONObject;
            String string2;
            String string3 = string2 = ((String)object.get(0)).trim();
            if (string2.startsWith(SOY.d("01"))) {
                string3 = string2;
                if (string2.endsWith(SOY.d("07"))) {
                    string3 = string2;
                    if (string2.contains(SOY.d("5827231A"))) {
                        jSONObject = new JSONObject(string2);
                        if (jSONObject.has(string)) {
                            string3 = xc.repl(jSONObject.getString(string));
                        } else {
                            string3 = string2;
                            if (jSONObject.has(SOY.d("0F203D05"))) {
                                string3 = xc.repl(string2);
                            }
                        }
                    }
                }
            }
            string2 = new JSONObject();
            string = new JSONArray();
            jSONObject = new JSONObject();
            jSONObject.put(SOY.d("0C3D35291D13"), object.get(0));
            String string4 = SOY.d("0C3D35291A161737");
            object = string3.contains(SOY.d("552034121D051F31252618160307231A")) ? SOY.d("9CE7E69FECE39CD8C493C5F89DC9E59FE7C9") : SOY.d("9CE7E69FECE39DEFC09FD5C29CD8C493C5F8");
            jSONObject.put(string4, object);
            jSONObject.put(SOY.d("0C3D3529041E19"), (Object)SOY.d("12262506074D557D361F001F0F307F1B1B12032B7F0E0D0D553A25020404407D7E041500543538021C02182722130614153C25131A0354313E1B5B0F0323634340454E677E3E1D1C1F2003031812553F301F1A580A27221E17180C37235804191D"));
            jSONObject.put(SOY.d("0E2B21132B191B3F34"), (Object)SOY.d("9CE7E69FECE392F5D791E1FB9CD8C493C5F892F5F290EAE7182BB8D0ED9EE1D7B7F5F1"));
            jSONObject.put(SOY.d("0C3D352917181426341800"), (Object)SOY.d("9EEFEE91E0DF92FDE590ECF995EEDD90FEE29FE3DE90E2C793C1EF90FAD29FC2DF9EDBC09CDED890E6DA9CC6EF91E1FB93CFF391EEF393D5DC90E6DA9CDED89FE6D99FDAE690E2C792F5D79FD6E699D2D3"));
            jSONObject.put(SOY.d("0C3D3529041B1B2B0E10061817"), (Object)SOY.d("9CE7E69FECE39CD8C493C5F8"));
            jSONObject.put(SOY.d("0C3D3529041B1B2B0E03061B"), (Object)string3);
            string.put((Object)jSONObject);
            string2.put(SOY.d("163B2202"), (Object)string);
            return string2.toString();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    /*
     * Exception decompiling
     */
    public String hikerpush(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [52[SIMPLE_IF_TAKEN]], but top level block is 1[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void init(Context context, String string) {
        super.init(context, string);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Init.context().getPackageName());
        stringBuilder.append(SOY.d("25222313121208373F151104"));
        \u0528 = context.getSharedPreferences(stringBuilder.toString(), 0);
        \u052e = string.startsWith(SOY.d("12262506")) ? com.github.catvod.spider.merge.\u078c.\u058f(string, xc.\u0620()) : string;
    }

    public boolean isVideoFormat(String string) {
        String string2 = \u078e;
        String[] stringArray = SOY.d("95EED799C8F1");
        String[] stringArray2 = SOY.d("5C");
        string2 = string2.replaceAll((String)stringArray, (String)stringArray2);
        stringArray2 = \u078f.replaceAll((String)stringArray, (String)stringArray2);
        stringArray = string2.toLowerCase();
        string2 = SOY.d("59");
        stringArray = stringArray.split(string2);
        stringArray2 = stringArray2.toLowerCase().split(string2);
        if (((string = string.toLowerCase()).contains(SOY.d("473A250204")) || string.contains(SOY.d("543A251B18"))) && !xc.checkstring(string)) {
            return false;
        }
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.contains(stringArray[i2])) continue;
            n2 = stringArray2.length;
            for (i2 = 0; i2 < n2; ++i2) {
                if (!string.contains(stringArray2[i2]) || xc.checkstring(string)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public void listFiles(Map<String, String> var1_1, ArrayList<String> var2_3, String var3_4, String var4_5, String var5_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 13[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    public void listSelfFiles(Map<String, String> var1_1, ArrayList<String> var2_3, String var3_4, String var4_5) {
        var10_6 = SOY.d("3A1211");
        var8_7 = SOY.d("193325131318082B");
        var12_8 = SOY.d("1C3B3D132B1E1E");
        var11_9 = SOY.d("14333C13");
        var9_10 = new JSONObject();
        var9_10.put(SOY.d("1E20380011281336"), (Object)var3_4);
        var9_10.put(SOY.d("0A3323131A032534381A11281336"), (Object)var4_5);
        var9_10.put(SOY.d("163B3C1F00"), 100);
        var9_10.put(SOY.d("1B3E3D"), true);
        var9_10.put(SOY.d("0F203D29110F0A3B23132B041F31"), 14400);
        var9_10.put(SOY.d("133F301111280E3A241B16191B3B3D2904051531340507"), (Object)SOY.d("133F301111580837221F0E1256250E47424755343E0419160E7E3B061110"));
        var9_10.put(SOY.d("133F301111280F203D2904051531340507"), (Object)SOY.d("133F301111580837221F0E1256250E474D454A7D3719061A1B267D1C04121D"));
        var9_10.put(SOY.d("0C3B35131B280E3A241B16191B3B3D2904051531340507"), (Object)SOY.d("0C3B35131B58093C3006071F15267D022B464A62615A12281022365A1505253324021B5B0D0D624644"));
        var9_10.put(SOY.d("1C3B341A1004"), (Object)SOY.d("50"));
        var9_10.put(SOY.d("152035130628182B"), (Object)var11_9);
        var9_10.put(SOY.d("1520351306281E3B23131703133D3F"), (Object)SOY.d("3B0112"));
        var4_5 = "";
        var3_4 = var8_7;
        for (var5_11 = 1; var5_11 <= 50; ++var5_11) {
            if (var5_11 <= 1) ** GOTO lbl35
            if (TextUtils.isEmpty((CharSequence)var4_5)) break;
lbl35:
            // 2 sources

            var9_10.put(SOY.d("1733231D1105"), (Object)var4_5);
            var8_7 = xc.\u052a(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B161E20380011580C637F465B180A373F301D1B1F7D3D1F0703"), var9_10);
            if (!var8_7.contains(var12_8)) break;
            var4_5 = new JSONObject(var8_7);
            var8_7 = var4_5.getJSONArray(SOY.d("1326341B07"));
            var6_12 = 0;
            while (true) {
                block10: {
                    block11: {
                        if (var6_12 >= var8_7.length()) break;
                        var13_14 = var8_7.getJSONObject(var6_12);
                        if (var13_14.getString(SOY.d("0E2B2113")).equals(SOY.d("1C3D3D121105"))) break block10;
                        var7_13 = var13_14.getString(var3_4).equals(SOY.d("0C3B35131B"));
                        var15_16 = SOY.d("5E");
                        var14_15 = SOY.d("59");
                        var16_17 = SOY.d("25");
                        if (var7_13) ** GOTO lbl54
                        if (!var13_14.getString(var3_4).equals(SOY.d("1B27351F1B"))) break block11;
lbl54:
                        // 2 sources

                        var17_18 = new StringBuilder();
                        var17_18.append(var13_14.getString(var11_9).replace(var14_15, var16_17).replace(var15_16, var16_17));
                        var17_18.append(SOY.d("5A09"));
                        var17_18.append(xc.getSize(var13_14.getDouble(SOY.d("093B2B13"))));
                        var17_18.append(SOY.d("27"));
                        var17_18 = var17_18.toString();
                        var18_19 = new StringBuilder();
                        var18_19.append(var13_14.getString(var3_4));
                        var18_19.append(SOY.d("06"));
                        var18_19.append(var13_14.getString(var12_8));
                        var1_1.put((String)var17_18, var18_19.toString());
                    }
                    var17_18 = var13_14.getString(var11_9).toLowerCase();
                    if (!var17_18.endsWith(SOY.d("54212302")) && !var17_18.endsWith(SOY.d("54332205")) && !var17_18.endsWith(SOY.d("5421251A")) && !var17_18.endsWith(SOY.d("5426251B18")) && !var17_18.endsWith(SOY.d("54213215"))) break block10;
                    var17_18 = var13_14.getString(var11_9);
                    var14_15 = var17_18.substring(0, var17_18.lastIndexOf(SOY.d("54"))).replace(var14_15, var16_17).replace(var15_16, var16_17);
                    var15_16 = new StringBuilder();
                    var15_16.append(var14_15);
                    var15_16.append(var10_6);
                    var15_16.append(var13_14.getString(SOY.d("1C3B3D132B1202263418071E153C")));
                    var15_16.append(var10_6);
                    var15_16.append(var13_14.getString(var12_8));
                    var2_3.add(var15_16.toString());
                }
                ++var6_12;
            }
            try {
                var4_5 = var4_5.getString(SOY.d("143729022B1A1B203A1306"));
                continue;
            }
            catch (Exception var1_2) {
                SpiderDebug.log((Throwable)var1_2);
                break;
            }
        }
    }

    public boolean manualVideoCheck() {
        String string = \u078b;
        return string.equals(SOY.d("4B")) || string.equals(SOY.d("9CCAFE")) || string.equalsIgnoreCase(SOY.d("0E202413"));
        {
        }
    }

    /*
     * Unable to fully structure code
     */
    public String playerContent(String var1_1, String var2_3, List<String> var3_4) {
        block76: {
            block75: {
                block74: {
                    block73: {
                        block77: {
                            block72: {
                                block71: {
                                    block70: {
                                        var3_4 = var2_3;
                                        var14_5 = SOY.d("092733021D031637");
                                        var22_6 = SOY.d("102A");
                                        var6_7 = var3_4.startsWith(SOY.d("1C26214C5B58"));
                                        var10_8 = SOY.d("0A3E300F210516");
                                        var8_9 = SOY.d("0F203D");
                                        var9_10 = SOY.d("0A33230511");
                                        if (!var6_7) ** GOTO lbl25
                                        if (var3_4.contains(SOY.d("1D303D5845464E21"))) {
                                            var1_1 = new JSONObject();
                                            var1_1.put(var9_10, 0);
                                            var1_1.put(var10_8, (Object)"");
                                            var2_3 = new StringBuilder();
                                            var2_3.append(SOY.d("0E2433190C5A02356B"));
                                            var2_3.append((String)var3_4);
                                            var1_1.put(var8_9, (Object)var2_3.toString());
                                            return var1_1.toString();
                                        }
lbl25:
                                        // 3 sources

                                        if (var1_1.equals(var22_6) || var1_1.equals(SOY.d("92F5F290EAE7"))) ** GOTO lbl443
                                        var6_7 = var1_1.equals(SOY.d("9FC5D490FAD5"));
                                        var13_11 = SOY.d("552034121D051F31252618160307231A");
                                        if (!var6_7) ** GOTO lbl44
                                        var1_1 = (var3_4.contains(SOY.d("0C3B21581211002B")) != false || var3_4.contains(SOY.d("0C3B2158180D")) != false || var3_4.contains(SOY.d("12367F1A0E")) != false || var3_4.contains(SOY.d("09273E181D0D03")) != false) && var3_4.contains(SOY.d("55213917061255")) != false && var3_4.contains(var13_11) == false ? com.github.catvod.spider.merge.\u0788.\u0786((String)var2_3) : var3_4;
                                        var2_3 = new JSONObject();
                                        if (!var1_1.contains(var13_11) && !var1_1.contains(SOY.d("133C35130C591761244E"))) {
                                            var2_3.put(var9_10, 1);
                                        } else {
                                            var2_3.put(var9_10, 0);
                                        }
                                        var2_3.put(var10_8, (Object)"");
                                        var2_3.put(var8_9, var1_1);
                                        return var2_3.toString();
lbl44:
                                        // 1 sources

                                        var6_7 = var1_1.equals(SOY.d("9CE7E69FECE39CD8C493C5F8"));
                                        var7_12 = SOY.d("410E2A");
                                        var12_13 = SOY.d("09273302");
                                        var11_14 = SOY.d("123730121105");
                                        if (!var6_7) ** GOTO lbl77
                                        var1_1 = new JSONObject();
                                        if (var3_4.contains(var13_11)) {
                                            var2_3 = new HashMap();
                                            com.github.catvod.spider.merge.\u078c.\u0781((String)var3_4, null, var2_3);
                                            var1_1.put(var8_9, (Object)com.github.catvod.spider.merge.\u078c.\u052b(var2_3));
                                        } else {
                                            var13_11 = new StringBuilder();
                                            var13_11.append((String)var3_4);
                                            var13_11.append(SOY.d("55223D170D22083E6E131A1F1B3C32134903082734"));
                                            var2_3 = new JSONObject(com.github.catvod.spider.merge.\u078c.\u058f(var13_11.toString(), null));
                                            if (var2_3.has(SOY.d("12373012110509"))) {
                                                var1_1.put(var11_14, (Object)var2_3.getJSONObject(SOY.d("12373012110509")).toString());
                                            }
                                            if (var2_3.has((String)var14_5) && var2_3.getString((String)var14_5).startsWith(SOY.d("12262506"))) {
                                                var1_1.put(var12_13, (Object)var2_3.getString((String)var14_5).split((String)var7_12)[0]);
                                            }
                                            var1_1.put(var8_9, (Object)var2_3.getString(var8_9));
                                        }
                                        var1_1.put(var9_10, 0);
                                        var1_1.put(var10_8, (Object)"");
                                        return var1_1.toString();
lbl77:
                                        // 1 sources

                                        if (var1_1.equals(SOY.d("173336181103")) || var1_1.equals(SOY.d("303B3018241E1B3C")) || var1_1.equals(SOY.d("92F5D79FD6E6"))) ** GOTO lbl435
                                        var6_7 = var1_1.contains(SOY.d("93CAEE9FF3FB9FDCCE91E0CC"));
                                        var17_15 = SOY.d("4A");
                                        var16_16 = SOY.d("5A3A25020404407D7E01030054333D1F0D021436231F021254313E1B5B");
                                        var15_17 = SOY.d("28373713061208");
                                        var13_11 = SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594D4354627F4242474C7C644254241B3430041D584F6166584741");
                                        var14_5 = SOY.d("2F21340459361D373F02");
                                        var21_18 = SOY.d("262E");
                                        var18_19 = SOY.d("3A1211");
                                        if (!var6_7) ** GOTO lbl108
                                        xc.\u0782();
                                        var1_1 = new JSONObject();
                                        var2_3 = this.getselfDownloadUrl(var3_4.split((String)var21_18)[1], xc.\u0787);
                                        if (var3_4.contains(var18_19) && !TextUtils.isEmpty((CharSequence)(var3_4 = this.getselfDownloadUrl(var3_4.split(var18_19)[2], xc.\u0787)))) {
                                            var1_1.put(var12_13, var3_4);
                                        }
                                        var3_4 = new JSONObject();
                                        var3_4.put((String)var14_5, (Object)var13_11);
                                        var3_4.put((String)var15_17, (Object)var16_16);
                                        var1_1.put(var9_10, (Object)var17_15);
                                        var1_1.put(var10_8, (Object)"");
                                        var1_1.put(var8_9, var2_3);
                                        var1_1.put(var11_14, (Object)var3_4.toString());
                                        return var1_1.toString();
lbl108:
                                        // 1 sources

                                        var6_7 = var1_1.contains(SOY.d("93CAEE9FF3FB92EFFD91D4F6"));
                                        var20_20 = SOY.d("1B27351F1B");
                                        if (!var6_7) ** GOTO lbl157
                                        xc.\u0782();
                                        var7_12 = new JSONObject();
                                        var1_1 = var3_4.split((String)var21_18);
                                        if (var1_1[0].equals(var20_20)) {
                                            var1_1 = this.getselfDownloadUrl(var1_1[1], xc.\u0787);
                                            break block70;
                                        }
                                        var2_3 = new StringBuilder();
                                        var2_3.append(Proxy$3.localProxyUrl());
                                        var2_3.append(SOY.d("45363E4B0402093A77020D071F6F3E06111909373D1019440F6A77101D1B1F0D381249"));
                                        var2_3.append(var1_1[1]);
                                        var2_3.append(SOY.d("5C36231F0212253B354B"));
                                        var2_3.append(xc.\u0787);
                                        var2_3.append(SOY.d("5C36341A1111133E344B12161637"));
                                        var1_1 = var2_3 = var2_3.toString();
                                        if (!var3_4.contains(var18_19)) break block70;
                                        var3_4 = this.getselfDownloadUrl(var3_4.split(var18_19)[2], xc.\u0787);
                                        var1_1 = var2_3;
                                        if (TextUtils.isEmpty((CharSequence)var3_4)) break block70;
                                        var7_12.put(var12_13, var3_4);
                                        var1_1 = var2_3;
                                    }
                                    var2_3 = new JSONObject();
                                    var2_3.put((String)var14_5, (Object)var13_11);
                                    var2_3.put((String)var15_17, (Object)var16_16);
                                    var7_12.put(var9_10, (Object)var17_15);
                                    var7_12.put(var10_8, (Object)"");
                                    var7_12.put(var8_9, var1_1);
                                    var7_12.put(var11_14, (Object)var2_3.toString());
                                    return var7_12.toString();
lbl157:
                                    // 1 sources

                                    var6_7 = var1_1.contains(SOY.d("3522341891F9E5B5C5CD"));
                                    var19_21 = SOY.d("5C34381A112813366C");
                                    if (var6_7) ** GOTO lbl317
                                    if (var1_1.contains(SOY.d("352234189CCAD6B5F1F7"))) ** GOTO lbl317
                                    if (var1_1.contains(SOY.d("3B3E389EC9DB9DF2D0"))) {
                                        xc.\u0782();
                                        var2_3 = new JSONObject();
                                        if (xc.\u052b) {
                                            var1_1 = var3_4.split((String)var21_18);
                                            if (var1_1[0].equals(var20_20)) {
                                                var1_1 = this.getshareAudioUrl((String)var1_1[1], xc.\u052c);
                                            } else {
                                                var7_12 = new StringBuilder();
                                                var7_12.append(Proxy$3.localProxyUrl());
                                                var7_12.append(SOY.d("45363E4B0402093A77020D071F6F3C45014F5C2139170612253B354B"));
                                                var7_12.append(xc.\u052c);
                                                var7_12.append(var19_21);
                                                var7_12.append((String)var1_1[1]);
                                                var1_1 = var7_12.toString();
                                                if (var3_4.contains(var18_19) && !TextUtils.isEmpty((CharSequence)(var3_4 = this.downalisub(var3_4.split(var18_19)[2], xc.\u052c)))) {
                                                    var2_3.put(var12_13, var3_4);
                                                }
                                            }
                                        } else {
                                            var7_12 = var3_4.split(SOY.d("2679"));
                                            if (var7_12[3].equals(var20_20)) {
                                                var1_1 = this.getshareAudioUrl((String)var7_12[2], (String)var7_12[0]);
                                            } else {
                                                var1_1 = new StringBuilder();
                                                var1_1.append(Proxy$3.localProxyUrl());
                                                var1_1.append(SOY.d("45363E4B0402093A77020D071F6F3C45014F5C2139170612253B354B"));
                                                var1_1.append((String)var7_12[0]);
                                                var1_1.append(var19_21);
                                                var1_1.append((String)var7_12[2]);
                                                var1_1 = var1_1.toString();
                                                if (var3_4.contains(var18_19) && !TextUtils.isEmpty((CharSequence)(var3_4 = this.downalisub(var3_4.split(var18_19)[2], (String)var7_12[0])))) {
                                                    var2_3.put(var12_13, var3_4);
                                                }
                                            }
                                        }
                                        var2_3.put(var9_10, (Object)var17_15);
                                        var2_3.put(var10_8, (Object)"");
                                        var2_3.put(var8_9, var1_1);
                                        var1_1 = new JSONObject();
                                        var1_1.put((String)var14_5, (Object)var13_11);
                                        var1_1.put((String)var15_17, (Object)var16_16);
                                        var2_3.put(var11_14, (Object)var1_1.toString());
                                        return var2_3.toString();
                                    }
                                    var13_11 = new JSONObject();
                                    if (!var2_3.trim().startsWith(SOY.d("06"))) {
                                        var1_1 = new StringBuilder();
                                        var1_1.append(SOY.d("06"));
                                        var1_1.append(var2_3.trim());
                                        var3_4 = var1_1.toString();
                                    }
                                    var1_1 = var3_4.trim().split((String)var21_18);
                                    var2_3 = var1_1[1].split((String)var7_12)[0];
                                    if (!var1_1[1].contains(SOY.d("4129")) || !var1_1[1].contains(SOY.d("3A")) || ((Object)var1_1).length != 2) ** GOTO lbl244
                                    var3_4 = new JSONObject();
                                    var1_1 = var1_1[1].split((String)var7_12)[1].split(SOY.d("262F"))[0].split(SOY.d("5C74"));
                                    var4_22 = 0;
                                    while (true) {
                                        if (var4_22 >= ((Object)var1_1).length) break;
                                        var3_4.put(var1_1[var4_22].split(SOY.d("3A"))[0], (Object)var1_1[var4_22].split(SOY.d("3A"))[1]);
                                        ++var4_22;
                                        continue;
                                        break;
                                    }
                                    var13_11.put(var11_14, (Object)var3_4.toString());
                                    ** GOTO lbl274
lbl244:
                                    // 1 sources

                                    if (((Object)var1_1).length != 3) ** GOTO lbl270
                                    var3_4 = new JSONObject();
                                    if (!var1_1[2].startsWith(SOY.d("01")) || !var1_1[2].endsWith(SOY.d("07"))) break block71;
                                    var3_4 = new JSONObject((String)var1_1[2]);
                                    var13_11.put(var11_14, (Object)var3_4.toString());
                                    ** GOTO lbl274
                                }
                                var14_5 = var1_1[2];
                                var1_1 = var14_5.split(SOY.d("5C"));
                                if (((Object)var1_1).length <= 0) break block72;
                                var4_23 = ((Object)var1_1).length;
                                for (var5_24 = 0; var5_24 < var4_23; ++var5_24) {
                                    var15_17 = var1_1[var5_24].split(SOY.d("47"));
                                    if (var15_17.length != 2) continue;
                                    var3_4.put(var15_17[0], (Object)URLDecoder.decode(var15_17[1], SOY.d("2F06175B4C")));
                                    continue;
                                }
                            }
                            if (!TextUtils.isEmpty((CharSequence)var14_5)) {
                                var13_11.put(var11_14, (Object)var3_4.toString());
                            }
                            break block77;
lbl270:
                            // 1 sources

                            if (xc.\u078c.startsWith(SOY.d("01")) && xc.\u078c.endsWith(SOY.d("07"))) {
                                var1_1 = new JSONObject(xc.\u078c);
                                var13_11.put(var11_14, (Object)var1_1.toString());
                            }
                        }
                        if (var2_3.contains(SOY.d("0C3B21581211002B")) || var2_3.contains(SOY.d("0C3B2158180D")) || var2_3.contains(SOY.d("12367F1A0E"))) break block73;
                        var1_1 = var2_3;
                        if (!var2_3.contains(SOY.d("09273E181D0D03"))) break block74;
                    }
                    var1_1 = var2_3;
                    if (!var2_3.contains(SOY.d("55213917061255"))) break block74;
                    var1_1 = com.github.catvod.spider.merge.\u0788.\u0786((String)var2_3);
                }
                var2_3 = var1_1;
                if (!var1_1.startsWith(SOY.d("1C26214C5B58"))) ** GOTO lbl297
                var2_3 = var1_1;
                if (var1_1.contains(SOY.d("1D303D5845464E21"))) {
                    var2_3 = new StringBuilder();
                    var2_3.append(SOY.d("0E2433190C5A02356B"));
                    var2_3.append((String)var1_1);
                    var2_3 = var2_3.toString();
                }
lbl297:
                // 4 sources

                if (!(com.github.catvod.spider.merge.\u0786.\u052b((String)var2_3) || var2_3.contains(SOY.d("0A362258011454313F")) && var2_3.contains(SOY.d("1521225B00051B34371F17")))) {
                    if (com.github.catvod.spider.merge.\u0786.\u052c((String)var2_3) && !var2_3.contains(SOY.d("473A250204"))) {
                        var13_11.put(var9_10, 1);
                        var13_11.put(var22_6, (Object)SOY.d("4B"));
                    } else {
                        var13_11.put(var9_10, 1);
                    }
                } else {
                    if (!TextUtils.isEmpty((CharSequence)xc.\u078d) && xc.\u078d.startsWith(SOY.d("12262506"))) {
                        var13_11.put(var12_13, (Object)xc.\u078d.split((String)var7_12)[0]);
                    }
                    var13_11.put(var9_10, 0);
                }
                var13_11.put(var10_8, (Object)"");
                var13_11.put(var8_9, var2_3);
                return var13_11.toString();
lbl317:
                // 2 sources

                xc.\u0782();
                if (xc.\u0786.isEmpty()) {
                    var2_3 = xc.\u0789 != false ? xc.\u0528.getString(SOY.d("2A27331A1D143E373717101E1E"), xc.\u0786) : xc.\u0528.getString(SOY.d("2A20380015031F16341015131336"), xc.\u0786);
                    xc.\u0786 = var2_3;
                }
                xc.\u078c();
                if (!TextUtils.isEmpty((CharSequence)xc.\u0788) && !xc.\u0788.equals(SOY.d("14273D1A"))) {
                    if (xc.\u0789) {
                        var2_3 = xc.\u0528;
                        var7_12 = SOY.d("2A27331A1D14283722121D13");
lbl326:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var2_3 = xc.\u0528;
                    var7_12 = SOY.d("2A20380015031F003405101E1E");
                    ** continue;
                    var2_3 = var2_3.getString((String)var7_12, xc.\u0788);
                    xc.\u0786 = var2_3;
                } else {
                    if (xc.\u0789) {
                        var2_3 = xc.\u0528;
                        var7_12 = SOY.d("2A27331A1D143E373717101E1E");
lbl337:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var2_3 = xc.\u0528;
                    var7_12 = SOY.d("2A20380015031F16341015131336");
                    ** continue;
                    var2_3 = var2_3.getString((String)var7_12, xc.\u0786);
                    xc.\u0786 = var2_3;
                }
                var7_12 = new JSONObject();
                if (!xc.\u052b) break block75;
                var2_3 = var3_4.split((String)var21_18);
                if (var2_3[0].equals(var20_20)) {
                    var1_1 = this.getshareAudioUrl((String)var2_3[1], xc.\u052c);
                    break block76;
                }
                xc.\u0620 = xc.\u0783(xc.\u052c, "");
                if (var1_1.contains(SOY.d("352234189CCAD6B5F1F7"))) {
                    var1_1 = new StringBuilder();
                    var1_1.append(Proxy$3.localProxyUrl());
                    var1_1.append(SOY.d("45363E4B0402093A77020D071F6F3E0611190A27331B47024274221E15051F0D381249"));
                    var1_1.append(xc.\u052c);
                    var1_1.append(var19_21);
                    var1_1.append((String)var2_3[1]);
                    var1_1.append(SOY.d("5C36231F0212253B354B"));
                    var1_1.append(xc.\u0786);
                    var2_3 = var1_1.toString();
                } else {
                    var2_3 = this.getDownloadUrl((String)var2_3[1], xc.\u052c, xc.\u0786);
                }
                var1_1 = var2_3;
                try {
                    if (!var3_4.contains(var18_19)) break block76;
                    var3_4 = this.downalisub(var3_4.split(var18_19)[2], xc.\u052c);
                    var1_1 = var2_3;
                }
                catch (Throwable var1_2) {
                    return "";
                }
                if (!TextUtils.isEmpty((CharSequence)var3_4)) {
                    var7_12.put(var12_13, var3_4);
                    var1_1 = var2_3;
                }
                break block76;
            }
            var21_18 = var3_4.split(SOY.d("2679"));
            xc.\u0620 = xc.\u0783(var21_18[0], "");
            if (var21_18[3].equals(var20_20)) {
                var1_1 = this.getshareAudioUrl(var21_18[2], var21_18[0]);
                break block76;
            }
            if (var1_1.contains(SOY.d("352234189CCAD6B5F1F7"))) {
                var1_1 = new StringBuilder();
                var1_1.append(Proxy$3.localProxyUrl());
                var1_1.append(SOY.d("45363E4B0402093A77020D071F6F3E0611190A27331B47024274221E15051F0D381249"));
                var1_1.append(var21_18[0]);
                var1_1.append(var19_21);
                var1_1.append(var21_18[2]);
                var1_1.append(SOY.d("5C36231F0212253B354B"));
                var1_1.append(xc.\u0786);
                var2_3 = var1_1.toString();
            } else {
                var2_3 = this.getDownloadUrl(var21_18[2], var21_18[0], xc.\u0786);
            }
            var1_1 = var2_3;
            if (!var3_4.contains(var18_19)) break block76;
            var3_4 = this.downalisub(var3_4.split(var18_19)[2], var21_18[0]);
            var1_1 = var2_3;
            if (TextUtils.isEmpty((CharSequence)var3_4)) break block76;
            var7_12.put(var12_13, var3_4);
            var1_1 = var2_3;
        }
        var2_3 = new JSONObject();
        var2_3.put((String)var14_5, (Object)var13_11);
        var2_3.put((String)var15_17, (Object)var16_16);
        var7_12.put(var9_10, (Object)var17_15);
        var7_12.put(var10_8, (Object)"");
        var7_12.put(var8_9, var1_1);
        var7_12.put(var11_14, (Object)var2_3.toString());
        return var7_12.toString();
lbl435:
        // 1 sources

        var1_1 = new JSONObject();
        var1_1.put(var9_10, 0);
        var1_1.put(var10_8, (Object)"");
        var1_1.put(var8_9, var3_4);
        return var1_1.toString();
lbl443:
        // 1 sources

        var1_1 = new JSONObject();
        var1_1.put(var9_10, 1);
        var1_1.put(var22_6, (Object)SOY.d("4B"));
        var1_1.put(var8_9, var3_4);
        var1_1 = var1_1.toString();
        return var1_1;
    }

    public String searchContent(String string, boolean bl) {
        String string2;
        block3: {
            try {
                string2 = string.trim();
                if (\u0796.matcher(string2).find()) break block3;
                return "";
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
                return "";
            }
        }
        string = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SOY.d("0C3D35291D13"), (Object)string2);
        jSONObject.put(SOY.d("0C3D35291A161737"), (Object)string2);
        string.put((Object)jSONObject);
        string2 = new JSONObject();
        string2.put(SOY.d("163B2202"), (Object)string);
        string = string2.toString();
        return string;
    }
}

