/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.ImageView
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 *  com.google.zxing.BarcodeFormat
 *  com.google.zxing.qrcode.QRCodeWriter
 */
package com.github.catvod.spider.merge.UY;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.F;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.KT.J;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.q;
import com.github.catvod.spider.merge.UY.s;
import com.github.catvod.spider.merge.UY.w;
import com.github.catvod.spider.merge.UY.x;
import com.github.catvod.spider.merge.UY.y;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.L.b;
import com.github.catvod.spider.merge.xc.a.a;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.Serializable;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class z {
    public final HashMap a = new HashMap();
    public final String b;
    public final List c = Arrays.asList(".srt", ".ass", ".scc", ".stl", ".ttml");
    public final HashMap d = new HashMap();
    public String e = null;
    public final String f;
    public final HashMap g = new HashMap();
    public ScheduledExecutorService h;
    public volatile boolean i = false;
    public volatile boolean j = false;
    public volatile boolean k = false;
    public final Object l = new Object();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public z() {
        this.b = "pr=ucpro&fr=pc";
        this.f = "tudou";
        try {
            String string = com.github.catvod.spider.merge.xc.L.a.d();
            if (com.github.catvod.spider.merge.xc.A0.c.c(string) && string.length() > 10) {
                H.a(string);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static String D(String string) {
        try {
            string = Uri.parse((String)string).getHost();
            return string;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static void F(String string) {
        if ((com.github.catvod.spider.merge.xc.A0.c.b(string) || !z.z(string)) && z.z(com.github.catvod.spider.merge.xc.L.a.d())) {
            return;
        }
        com.github.catvod.spider.merge.xc.L.a a2 = com.github.catvod.spider.merge.xc.L.a.c();
        com.github.catvod.spider.merge.xc.L.c c2 = a2.b();
        c2.d(string);
        a2.i(c2);
    }

    public static boolean H(String string) {
        for (int i2 = 0; i2 < 2; ++i2) {
            String string2 = (new String[]{"com.quark.clouddrive", "com.quark.browser"})[i2];
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                intent.setPackage(string2);
                intent.addFlags(0x10000000);
                InitOrigin.context().startActivity(intent);
                A.m("\u5df2\u8df3\u8f6c\uff0c\u8bf7\u5728\u5938\u514bAPP\u4e2d\u786e\u8ba4\u6388\u6743");
                return true;
            }
            catch (Exception exception) {
                continue;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void I(X object) {
        Object object2 = (Map)((X)object).c;
        if (object2 == null) {
            return;
        }
        try {
            Object object3;
            object = object3 = (List)object2.get("Set-Cookie");
            if (object3 == null) {
                object = (List)object2.get("set-cookie");
            }
            if (object == null) {
                return;
            }
            object = Pattern.compile("__puus=([^;]+)").matcher(com.github.catvod.spider.merge.xc.A0.c.e(";;;", (List)object));
            if (!((Matcher)object).find()) return;
            object2 = ((Matcher)object).group(1);
            String string = com.github.catvod.spider.merge.xc.L.a.d();
            if (!z.z(string)) return;
            boolean bl = string.contains("__puus=");
            object = object3 = "";
            if (bl) {
                Matcher matcher = Pattern.compile("__puus=([^;]+)").matcher(string);
                object = object3;
                if (matcher.find()) {
                    object = matcher.group(1);
                }
            }
            if (((String)object2).equals(object)) return;
            if (bl) {
                object = string.replaceAll("__puus=[^;]+", "__puus=".concat((String)object2));
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(";__puus=");
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
            }
            z.F((String)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static String b(String charSequence) {
        if (charSequence == null) {
            return "";
        }
        String string = ((String)charSequence).replace('\n', ' ').replace('\r', ' ');
        charSequence = string;
        if (string.length() > 300) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string.substring(0, 300));
            ((StringBuilder)charSequence).append("...");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    public static boolean c(Object object) {
        boolean bl = false;
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        if (object instanceof Number) {
            bl = bl2;
            if (((Number)object).intValue() == 1) {
                bl = true;
            }
            return bl;
        }
        if ("true".equals(object.toString()) || "1".equals(object.toString())) {
            bl = true;
        }
        return bl;
    }

    public static HashMap l() {
        HashMap hashMap = m.k("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-CN; M2012K11AC Build/SP1A.210812.003) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/123.0.6312.80 Quark/7.8.1.751 Mobile Safari/537.36", "Referer", "https://pan.quark.cn/");
        hashMap.put("Cookie", com.github.catvod.spider.merge.xc.L.a.d());
        return hashMap;
    }

    public static HashMap n() {
        HashMap hashMap = m.k("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch", "Referer", "https://pan.quark.cn/");
        hashMap.put("Cookie", com.github.catvod.spider.merge.xc.L.a.d());
        return hashMap;
    }

    public static HashMap o() {
        HashMap hashMap = m.k("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch", "Referer", "https://pan.quark.cn");
        hashMap.put("Content-Type", "application/json");
        String string = com.github.catvod.spider.merge.xc.L.a.d();
        if (string != null && !string.isEmpty()) {
            hashMap.put("Cookie", string);
        }
        return hashMap;
    }

    public static q p(String object) {
        Object object2 = Pattern.compile("https://pan\\.quark\\.cn/s/([^\\\\|#/?]+)").matcher((CharSequence)object);
        if (((Matcher)object2).find()) {
            String string = ((Matcher)object2).group(1);
            boolean bl = ((String)object).contains("?pwd=");
            Object var3_4 = null;
            object2 = var3_4;
            if (bl) {
                object = object2 = ((String)object).substring(((String)object).indexOf("?pwd=") + 5);
                if (((String)object2).contains("&")) {
                    object = ((String)object2).substring(0, ((String)object2).indexOf("&"));
                }
                object2 = ((String)object).isEmpty() ? var3_4 : object;
            }
            if (object2 != null && !((String)object2).isEmpty()) {
                return new q(0, string, (String)object2);
            }
            return new q(string, "0");
        }
        return new q("", "0");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String s() {
        try {
            var2 = new ArrayList<String>();
            var2.put("client_id", "386");
            var2.put("v", "1.2");
            var2.put("request_id", UUID.randomUUID().toString());
            var1_1 = new HashMap();
            var3_3 = A.e("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin", var2, var1_1);
            var0_4 = com.github.catvod.spider.merge.xc.A0.c.b(com.github.catvod.spider.merge.xc.L.a.d());
            if (var0_4) {
            }
            ** GOTO lbl31
        }
        catch (Exception var1_2) {
            return "";
        }
        var4_5 = (Map)var3_3.c;
        if (var4_5 == null) ** GOTO lbl31
        {
            var2 = (List)var4_5.get("Set-Cookie");
            var1_1 = var2;
            if (var2 == null) {
                var1_1 = (List)var4_5.get("set-cookie");
            }
            if (var1_1 != null) {
                var2 = new ArrayList<String>();
                var1_1 = var1_1.iterator();
                while (var0_4 = var1_1.hasNext()) {
                    var2.add(((String)var1_1.next()).split(";")[0]);
                }
                z.F(TextUtils.join((CharSequence)";", var2));
            }
lbl31:
            // 5 sources

            if ((var1_1 = (Map)C.L(var3_3.b(), Map.class)) == null) {
                return "";
            }
            var0_4 = "ok".equals(var1_1.get("message"));
            if (var0_4 == false) return "";
            return (String)((Map)((Map)var1_1.get("data")).get("members")).get("token");
        }
    }

    public static boolean u() {
        String string = com.github.catvod.spider.merge.xc.L.a.d();
        boolean bl = com.github.catvod.spider.merge.xc.A0.c.b(string);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (string.contains("__pus") || string.contains("__uid") || string.contains("__kp")) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean x(Object object) {
        boolean bl = false;
        if (object == null) {
            return false;
        }
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        if (object instanceof String) {
            return "true".equalsIgnoreCase((String)object);
        }
        boolean bl2 = bl;
        if (object instanceof Number) {
            bl2 = bl;
            if (((Number)object).intValue() != 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static boolean y(String string) {
        boolean bl = string != null && (string.contains("\u514d\u8f6c") || string.contains("\u65e0\u9650") || string.contains("\u5938\u514b\u76f4\u94fe"));
        return bl;
    }

    public static boolean z(String string) {
        boolean bl = com.github.catvod.spider.merge.xc.A0.c.b(string);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (string.contains("__pus") || string.contains("__uid") || string.contains("__kp")) {
            bl2 = true;
        }
        return bl2;
    }

    public final String A(String string) {
        if (this.k) {
            return "video/x-iso";
        }
        if (!((string = string.toLowerCase()).contains(".mp4") || string.contains("filename=01.mp4") || string.contains("filename%3d01.mp4"))) {
            if (string.contains(".mkv")) {
                return "video/x-matroska";
            }
            if (string.contains(".webm")) {
                return "video/webm";
            }
            if (string.contains(".mov")) {
                return "video/quicktime";
            }
            if (string.contains(".avi")) {
                return "video/x-msvideo";
            }
        }
        return "video/mp4";
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String B(String object, String[] object2) {
        boolean bl;
        Object object3;
        CharSequence charSequence;
        int n2;
        Object object4;
        block29: {
            Object object5;
            block30: {
                block31: {
                    boolean bl2;
                    int n3;
                    block25: {
                        Object object6;
                        Object object7;
                        Object object8;
                        block27: {
                            block28: {
                                block26: {
                                    block24: {
                                        block23: {
                                            if (!z.u()) {
                                                this.w();
                                                if (!z.u()) {
                                                    return com.github.catvod.spider.merge.MP.g.c("\u5938\u514b\u6388\u6743\u5931\u8d25\uff0c\u8bf7\u626b\u7801\u767b\u5f55");
                                                }
                                            }
                                            n3 = 0;
                                            bl2 = false;
                                            object4 = object2[0];
                                            object8 = object2[1];
                                            object7 = object2[2];
                                            object6 = object2[3];
                                            n2 = ((Object)object2).length;
                                            charSequence = "";
                                            if (n2 > 4) {
                                                object2 = object2[4];
                                                try {
                                                    object3 = H.b((String)object2);
                                                    break block23;
                                                }
                                                catch (Exception exception) {
                                                    // empty catch block
                                                }
                                            }
                                            object3 = "";
                                        }
                                        bl = J.b((String)object3);
                                        object2 = new StringBuilder("[XENC] quark fileName=");
                                        ((StringBuilder)object2).append((String)object3);
                                        ((StringBuilder)object2).append(", xenc=");
                                        ((StringBuilder)object2).append(bl);
                                        ((StringBuilder)object2).append(", flag=");
                                        ((StringBuilder)object2).append((String)object);
                                        SpiderDebug.log((String)((StringBuilder)object2).toString());
                                        this.k = false;
                                        if (!bl) break block24;
                                        object5 = this.q((String)object7, (String)object6, (String)object4, (String)object8);
                                        StringBuilder stringBuilder = new StringBuilder("[XENC] direct download ");
                                        object2 = TextUtils.isEmpty((CharSequence)object5) ? "empty" : "ok";
                                        stringBuilder.append((String)object2);
                                        stringBuilder.append(", host=");
                                        stringBuilder.append(z.D((String)object5));
                                        SpiderDebug.log((String)stringBuilder.toString());
                                        object2 = object5;
                                        if (TextUtils.isEmpty((CharSequence)object5)) {
                                            object2 = this.h((String)object7, (String)object6, (String)object4, (String)object8);
                                        }
                                        break block25;
                                    }
                                    if (!z.y((String)object)) break block26;
                                    object2 = this.q((String)object7, (String)object6, (String)object4, (String)object8);
                                    break block25;
                                }
                                if (object == null || !((String)object).contains("\u5938\u514b\u539f\u753b") && !((String)object).contains("\u5938\u514b\u539f")) break block27;
                                object5 = this.h((String)object7, (String)object6, (String)object4, (String)object8);
                                if (object5 == null) break block28;
                                object2 = object5;
                                if (!((String)object5).isEmpty()) break block25;
                            }
                            object2 = this.m((String)object7, (String)object6, (String)object4, (String)object8);
                            break block25;
                        }
                        object2 = this.m((String)object7, (String)object6, (String)object4, (String)object8);
                    }
                    if (object2 == null || ((String)object2).isEmpty()) break block29;
                    object5 = z.l();
                    ((HashMap)object5).remove("Host");
                    ((HashMap)object5).remove("Content-Type");
                    if (bl) {
                        if (C.y("xenc_password").length() > 0) {
                            bl2 = true;
                        }
                        object = new StringBuilder("[XENC] password set=");
                        ((StringBuilder)object).append(bl2);
                        ((StringBuilder)object).append(", download host=");
                        ((StringBuilder)object).append(z.D((String)object2));
                        SpiderDebug.log((String)((StringBuilder)object).toString());
                        if (!bl2) {
                            return com.github.catvod.spider.merge.MP.g.c("XENC\u89e3\u5bc6\u5bc6\u7801\u672a\u8bbe\u7f6e");
                        }
                        object = ((String)object3).toLowerCase();
                        object = ((String)object).contains(".mkv.xenc") ? "video/x-matroska" : (((String)object).contains(".webm.xenc") ? "video/webm" : (((String)object).contains(".mov.xenc") ? "video/quicktime" : (((String)object).contains(".avi.xenc") ? "video/x-msvideo" : (((String)object).contains(".flv.xenc") ? "video/x-flv" : "video/mp4"))));
                        F.a.j();
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append((String)object2);
                        ((StringBuilder)object3).append("|xenc|");
                        ((StringBuilder)object3).append((String)object);
                        object3 = H.a(((StringBuilder)object3).toString());
                        F.h.put(object3, object2);
                        F.i.put(object3, object5);
                        F.k.put(object2, object);
                        object5 = new URI((String)object2);
                        object2 = ((URI)object5).getHost();
                        if (object2 == null) {
                            object2 = charSequence;
                        }
                    }
                    n2 = n3;
                    if (object == null) break block30;
                    if (((String)object).contains("\u5938\u514b\u539f\u753b")) break block31;
                    n2 = n3;
                    if (!((String)object).contains("\u5938\u514b\u539f")) break block30;
                }
                n2 = 1;
            }
            if (n2 == 0 && !z.y((String)object)) {
                if (((String)object2).contains(".m3u8")) {
                    object = new g();
                    ((g)object).w((String)object2);
                    ((g)object).g((HashMap)object5);
                    ((g)object).h();
                    return ((g)object).toString();
                }
                object = new g();
                ((g)object).w((String)object2);
                ((g)object).g((HashMap)object5);
                ((g)object).f(this.A((String)object2));
                return ((g)object).toString();
            }
            object = com.github.catvod.spider.merge.xc.L.a.c().b().c() ? "quark_vip" : "quark";
            object = B.y((String)object2, (Map)object5, B.p((String)object), (String)object);
            if (((String)object2).contains(".m3u8")) {
                object2 = new g();
                ((g)object2).w((String)object);
                ((g)object2).h();
                return ((g)object2).toString();
            }
            object3 = new g();
            ((g)object3).w((String)object);
            ((g)object3).f(this.A((String)object2));
            return ((g)object3).toString();
        }
        if (bl) {
            object2 = new StringBuilder("[XENC] download url empty. flag=");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(", fileId=");
            ((StringBuilder)object2).append((String)object4);
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            return com.github.catvod.spider.merge.MP.g.c("XENC\u83b7\u53d6\u5938\u514b\u4e0b\u8f7d\u5730\u5740\u5931\u8d25");
        }
        return "";
        catch (Exception exception) {
            object2 = charSequence;
        }
        charSequence = new StringBuilder("build xenc key=");
        ((StringBuilder)charSequence).append((String)object3);
        ((StringBuilder)charSequence).append(" host=");
        ((StringBuilder)charSequence).append((String)object2);
        ((StringBuilder)charSequence).append(" type=");
        ((StringBuilder)charSequence).append((String)object);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        n2 = F.b;
        object2 = new StringBuilder("http://127.0.0.1:");
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append("/xenc?key=");
        ((StringBuilder)object2).append((String)object3);
        object2 = ((StringBuilder)object2).toString();
        object3 = new StringBuilder("[XENC] proxyUrl=");
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(", format=");
        ((StringBuilder)object3).append((String)object);
        SpiderDebug.log((String)((StringBuilder)object3).toString());
        object3 = new g();
        ((g)object3).w((String)object2);
        ((g)object3).f((String)object);
        return ((g)object3).toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String C(String object, String string) {
        Object object2;
        int n2;
        List list;
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            hashMap.put("fid", object);
            hashMap.put("resolutions", "low,normal,high,super,2k,4k");
            hashMap.put("supports", "fmp4_av,m3u8");
            object = new StringBuilder("file/v2/play?");
            ((StringBuilder)object).append(this.b);
            object = (Map)C.L(this.a(((StringBuilder)object).toString(), Collections.emptyMap(), hashMap, 0, "POST"), Map.class);
            if (object.get("data") == null) {
                return "";
            }
            list = (List)((Map)object.get("data")).get("video_list");
            if (list == null) return "";
            if (list.isEmpty()) {
                return "";
            }
            n2 = 0;
        }
        catch (Exception exception) {
            return "";
        }
        while (true) {
            hashMap = this.g;
            if (n2 >= 6) break;
            {
                String string2 = (new String[]{"4k", "2k", "super", "high", "normal", "low"})[n2];
                object2 = list.iterator();
                while (object2.hasNext()) {
                    Map map = (Map)object2.next();
                    if (!z.c(map.get("accessable")) || !string2.equals(object = map.get("resolution") != null ? map.get("resolution").toString() : "") || map.get("video_info") == null || (object = ((Map)map.get("video_info")).get("url")) == null || !object.toString().startsWith("http")) continue;
                    object = object.toString();
                    hashMap.put(string, new String[]{object, String.valueOf(System.currentTimeMillis())});
                    return object;
                }
                ++n2;
                continue;
            }
            break;
        }
        {
            object = list.iterator();
            do {
                if (!object.hasNext()) return "";
            } while (!z.c((object2 = (Map)object.next()).get("accessable")) || object2.get("video_info") == null || (object2 = ((Map)object2.get("video_info")).get("url")) == null || !object2.toString().startsWith("http"));
            object = object2.toString();
            hashMap.put(string, new String[]{object, String.valueOf(System.currentTimeMillis())});
            return object;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String E(String var1_1, String var2_2, String var3_3, String var4_4) {
        var8_5 = this.e;
        var9_8 = this.b;
        if (var8_5 == null) {
            var8_5 = m.r("file/sort?", var9_8, "&pdir_fid=0&_page=1&_size=200&_sort=file_type:asc,updated_at:desc");
            var10_9 = Collections.emptyMap();
            var11_10 = Collections.emptyMap();
            var10_9 = (Map)C.L(this.a((String)var8_5, (Map)var10_9, (Map)var11_10, 0, "GET"), Map.class);
            var11_10 = var10_9.get("data");
            var8_5 = this.f;
            if (var11_10 != null) {
                for (Object var10_9 : (List)((Map)var10_9.get("data")).get("list")) {
                    if (!var8_5.equals(var10_9.get("file_name"))) continue;
                    this.e = var10_9.get("fid").toString();
                    break;
                }
            }
            if (this.e == null) {
                var8_5 = m.k("pdir_fid", "0", "file_name", (String)var8_5);
                var8_5.put("dir_path", "");
                var8_5.put((String)"dir_init_lock", (String)"false");
                var8_5 = (Map)C.L(this.a(m.q("file?", var9_8), Collections.<K, V>emptyMap(), (Map)var8_5, 0, "POST"), Map.class);
                if (var8_5.get("data") != null && ((Map)var8_5.get("data")).get("fid") != null) {
                    this.e = ((Map)var8_5.get("data")).get("fid").toString();
                }
            }
        }
        if (TextUtils.isEmpty((CharSequence)this.e)) ** GOTO lbl48
        var7_11 = 1;
        var5_12 = 0;
        while (true) {
            block25: {
                block24: {
                    var8_5 = new StringBuilder();
                    var8_5.append("file/sort?");
                    var8_5.append(var9_8);
                    var8_5.append("&uc_param_str=&pdir_fid=");
                    var8_5.append(this.e);
                    var8_5.append("&_page=");
                    var8_5.append(var7_11);
                    var8_5.append("&_size=200&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc");
                    var11_10 = var8_5.toString();
                    var8_5 = Collections.emptyMap();
                    var10_9 = Collections.emptyMap();
                    break block24;
lbl48:
                    // 5 sources

                    while (true) {
                        if (this.e == null) {
                            return "";
                        }
                        var10_9 = this.a;
                        if (var2_2 /* !! */  == null) {
                            this.r(new q((String)var1_1, null));
                            if (!var10_9.containsKey(var1_1)) {
                                return "";
                            }
                        }
                        var8_5 = new HashMap<K, V>();
                        var8_5.put("fid_list", Collections.singletonList(var3_3));
                        var3_3 = var4_4 != null ? var4_4 : "";
                        var8_5.put("fid_token_list", Collections.singletonList(var3_3));
                        var8_5.put("to_pdir_fid", this.e);
                        var8_5.put("pwd_id", var1_1);
                        if (var2_2 /* !! */  == null) {
                            var2_2 /* !! */  = (String)((Map)var10_9.get(var1_1)).get("stoken");
                        }
                        var8_5.put((String)"stoken", (String)var2_2 /* !! */ );
                        var8_5.put((String)"pdir_fid", (String)"0");
                        var8_5.put((String)"scene", (String)"link");
                        var1_1 = this.a(m.q("share/sharepage/save?", var9_8), null, (Map)var8_5, 0, "POST");
                        var2_2 /* !! */  = new StringBuilder("[QUARK-SAVE] response=");
                        var2_2 /* !! */ .append(z.b((String)var1_1));
                        SpiderDebug.log((String)var2_2 /* !! */ .toString());
                        var1_1 = (Map)C.L((String)var1_1, Map.class);
                        if (var1_1.get("data") == null) return "";
                        if (((Map)var1_1.get("data")).get("task_id") == null) return "";
                        var1_1 = ((Map)var1_1.get("data")).get("task_id").toString();
                        var5_12 = 0;
                        while (true) {
                            var2_2 /* !! */  = new StringBuilder("task?");
                            var2_2 /* !! */ .append(var9_8);
                            var2_2 /* !! */ .append("&task_id=");
                            var2_2 /* !! */ .append((String)var1_1);
                            var2_2 /* !! */ .append("&retry_index=");
                            var2_2 /* !! */ .append(var5_12);
                            var2_2 /* !! */  = this.a(var2_2 /* !! */ .toString(), Collections.<K, V>emptyMap(), Collections.<K, V>emptyMap(), 0, "GET");
                            var3_3 = new StringBuilder("[QUARK-SAVE] task retry=");
                            var3_3.append(var5_12);
                            var3_3.append(", response=");
                            var3_3.append(z.b(var2_2 /* !! */ ));
                            SpiderDebug.log((String)var3_3.toString());
                            var3_3 = (Map)C.L(var2_2 /* !! */ , Map.class);
                            var2_2 /* !! */  = var3_3.get("code");
                            if (var2_2 /* !! */  instanceof Number && ((Number)var2_2 /* !! */ ).intValue() == 32003) {
                                InitOrigin.run((Runnable)new s(1));
                                return "";
                            }
                            if (var3_3.get("data") != null && ((Map)var3_3.get("data")).get("save_as") != null && ((Map)((Map)var3_3.get("data")).get("save_as")).get("save_as_top_fids") != null && ((List)((Map)((Map)var3_3.get("data")).get("save_as")).get("save_as_top_fids")).size() > 0) {
                                return (String)((List)((Map)((Map)var3_3.get("data")).get("save_as")).get("save_as_top_fids")).get(0);
                            }
                            if (++var5_12 > 2) {
                                return "";
                            }
                            Thread.sleep(1000L);
                        }
                        break;
                    }
                }
                try {}
                catch (Exception var8_7) {
                }
                break block25;
                catch (Exception var8_6) {
                    ** GOTO lbl48
                }
            }
            var8_5 = (HashMap<String, List<Object>>)C.L(this.a((String)var11_10, (Map)var8_5, (Map)var10_9, 0, "GET"), Map.class);
            var6_13 = var5_12;
            if (var8_5 == null) break;
            if (var8_5.get("data") == null) {
                var6_13 = var5_12;
                break;
            }
            var11_10 = (List)((Map)var8_5.get("data")).get("list");
            var6_13 = var5_12;
            if (var11_10 == null) break;
            if (var11_10.isEmpty()) {
                var6_13 = var5_12;
                break;
            }
            var10_9 = new Object();
            var12_14 = var11_10.iterator();
            while (var12_14.hasNext()) {
                var8_5 = (Map)var12_14.next();
                var8_5 = var8_5.get("fid") != null ? var8_5.get("fid").toString() : "";
                if (TextUtils.isEmpty((CharSequence)var8_5)) continue;
                var10_9.add(var8_5);
            }
            var6_13 = var5_12;
            if (!var10_9.isEmpty()) {
                var8_5 = new HashMap();
                var8_5.put("action_type", 2);
                var8_5.put("filelist", var10_9);
                var8_5.put("exclude_fids", Collections.<T>emptyList());
                var12_14 = new StringBuilder();
                var12_14.append("file/delete?");
                var12_14.append(var9_8);
                var12_14.append("&uc_param_str=");
                this.a(var12_14.toString(), Collections.<K, V>emptyMap(), (Map)var8_5, 0, "POST");
                var6_13 = var5_12 + var10_9.size();
            }
            if (var11_10.size() < 200) break;
            ++var7_11;
            var5_12 = var6_13;
        }
        if (var6_13 <= 0) ** GOTO lbl48
        this.d.clear();
        Thread.sleep(1000L);
        this.e();
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void G(String var1_1) {
        block12: {
            block11: {
                try {
                    var8_5 = var7_4 /* !! */  = InitOrigin.getActivity();
                    if (var7_4 /* !! */  == null) {
                        var8_5 = InitOrigin.context();
                    }
                    if (var8_5 == null) {
                        A.m("\u626b\u7801\u767b\u5f55\u5931\u8d25");
                        return;
                    }
                    var2_6 = var8_5.getResources().getDisplayMetrics().density;
                }
                catch (Exception var1_3) {
                    A.m("\u626b\u7801\u767b\u5f55\u5931\u8d25");
                    return;
                }
                var6_7 = (int)(var2_6 * 200.0f);
                var9_8 = null;
                var7_4 /* !! */  = var9_8;
                try {
                    var7_4 /* !! */  = var9_8;
                    var10_9 /* !! */  = new QRCodeWriter();
                    var7_4 /* !! */  = var9_8;
                    var1_1 = var10_9 /* !! */ .encode((String)var1_1, BarcodeFormat.QR_CODE, var6_7, var6_7);
                    var7_4 /* !! */  = var9_8;
                    var10_9 /* !! */  = (QRCodeWriter)new int[var6_7 * var6_7];
                    var3_10 = 0;
lbl24:
                    // 2 sources

                    while (var3_10 < var6_7) {
                        var4_11 = 0;
lbl26:
                        // 2 sources

                        while (var4_11 < var6_7) {
                            var7_4 /* !! */  = var9_8;
                            var5_12 = var1_1.get(var4_11, var3_10) != false ? -16777216 : -1;
                            ** break block10
                        }
                        break block11;
                    }
                    break block12;
                }
                catch (Exception var1_2) {
                    var1_1 = var7_4 /* !! */ ;
                    ** GOTO lbl48
                }
lbl-1000:
                // 1 sources

                {
                    var10_9 /* !! */ [var3_10 * var6_7 + var4_11] = (QRCodeWriter)var5_12;
                    ++var4_11;
                    ** GOTO lbl26
                    break;
                }
            }
            ++var3_10;
            ** GOTO lbl24
        }
        var7_4 /* !! */  = var9_8;
        {
            var1_1 = Bitmap.createBitmap((int)var6_7, (int)var6_7, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            var7_4 /* !! */  = var1_1;
            var1_1.setPixels((int[])var10_9 /* !! */ , 0, var6_7, 0, 0, var6_7, var6_7);
lbl48:
            // 2 sources

            if (var1_1 != null) ** GOTO lbl51
        }
        {
            A.m("\u4e8c\u7ef4\u7801\u751f\u6210\u5931\u8d25");
            return;
lbl51:
            // 1 sources

            var7_4 /* !! */  = new ImageView((Context)var8_5);
            var7_4 /* !! */ .setImageBitmap((Bitmap)var1_1);
            var7_4 /* !! */ .setPadding(20, 20, 20, 20);
            var1_1 = new AlertDialog.Builder((Context)var8_5);
            var7_4 /* !! */  = var1_1.setTitle((CharSequence)"\u5938\u514b\u7f51\u76d8 - \u626b\u7801\u767b\u5f55").setView((View)var7_4 /* !! */ );
            var1_1 = new w(this);
            var1_1 = var7_4 /* !! */ .setNegativeButton((CharSequence)"\u53d6\u6d88", (DialogInterface.OnClickListener)var1_1);
            var7_4 /* !! */  = new x(0, this);
            var1_1 = var1_1.setOnCancelListener((DialogInterface.OnCancelListener)var7_4 /* !! */ ).create();
            var1_1.show();
            com.github.catvod.spider.merge.xc.a.a.B((AlertDialog)var1_1);
            return;
        }
    }

    public final String a(String string, Map map, Map map2, Integer object, String string2) {
        int n2 = (Integer)object;
        if (com.github.catvod.spider.merge.xc.A0.c.a(com.github.catvod.spider.merge.xc.L.a.d())) {
            this.w();
            return this.a(string, map, map2, n2 - 1, string2);
        }
        object = "GET".equals(string2) ? A.e(m.q("https://drive.quark.cn/1/clouddrive/", string), map, z.l()) : A.k(m.q("https://drive.quark.cn/1/clouddrive/", string), C.Z(map2), z.l());
        z.I((X)object);
        if (((X)object).a != 200 && n2 > 0) {
            Thread.sleep(1000L);
            return this.a(string, map, map2, n2 - 1, string2);
        }
        return ((X)object).b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        this.a.clear();
        this.d.clear();
        com.github.catvod.spider.merge.xc.L.a.c().i(new com.github.catvod.spider.merge.xc.L.c());
        Object object = com.github.catvod.spider.merge.xc.L.a.d;
        synchronized (object) {
            com.github.catvod.spider.merge.xc.L.a.c = null;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        String string = this.b;
        int n2 = 1;
        while (true) {
            try {
                HashMap<String, Serializable> hashMap;
                Object object = new StringBuilder();
                ((StringBuilder)object).append("file/recycle/list?");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("&_page=");
                ((StringBuilder)object).append(n2);
                ((StringBuilder)object).append("&_size=200&_sort=move_recycle_at:desc");
                object = (Map)C.L(this.a(((StringBuilder)object).toString(), Collections.emptyMap(), Collections.emptyMap(), 0, "GET"), Map.class);
                if (object == null) return;
                if (object.get("data") == null) {
                    return;
                }
                if ((object = (List)((Map)object.get("data")).get("list")) == null) return;
                if (object.isEmpty()) {
                    return;
                }
                Serializable serializable = new ArrayList();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    hashMap = (HashMap<String, Serializable>)iterator.next();
                    if (hashMap.get("record_id") == null) continue;
                    ((ArrayList)serializable).add(hashMap.get("record_id").toString());
                }
                if (!((ArrayList)serializable).isEmpty()) {
                    hashMap = new HashMap<String, Serializable>();
                    hashMap.put("select_mode", Integer.valueOf(2));
                    hashMap.put("record_list", serializable);
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append("file/recycle/remove?");
                    ((StringBuilder)serializable).append(string);
                    this.a(((StringBuilder)serializable).toString(), Collections.emptyMap(), hashMap, 0, "POST");
                }
                if (object.size() < 200) {
                    return;
                }
                ++n2;
            }
            catch (Exception exception) {
                return;
            }
            {
                Thread.sleep(500L);
                continue;
            }
            break;
        }
    }

    public final void f(q q2, String iterator, ArrayList arrayList, ArrayList arrayList2) {
        String string = q2.a;
        Object object = this.g(1, string, (String)((Object)iterator));
        iterator = new ArrayList();
        Iterator iterator2 = ((ArrayList)object).iterator();
        while (iterator2.hasNext()) {
            object = (Map)iterator2.next();
            boolean bl = z.x(object.get("dir"));
            boolean bl2 = z.x(object.get("file"));
            Object object2 = object.get("category");
            int n2 = object2 instanceof Number ? ((Number)object2).intValue() : 0;
            object2 = (String)object.get("file_name");
            if (bl) {
                ((ArrayList)((Object)iterator)).add(object);
                continue;
            }
            if (!bl2 || object2 == null) continue;
            String string2 = H.h(object2).toLowerCase();
            String string3 = m.q(".", string2);
            if (this.c.contains(string3)) {
                arrayList2.add(com.github.catvod.spider.merge.xc.L.b.a(string, (Map)object));
                continue;
            }
            if (!"mp4,mkv,avi,mov,wmv,flv,rmvb,rm,3gp,ts,m2ts,webm,iso".contains(string2) && !J.b(object2) && n2 != 1) continue;
            object.put("stoken", ((Map)this.a.get(string)).get("stoken"));
            arrayList.add(com.github.catvod.spider.merge.xc.L.b.a(string, (Map)object));
        }
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while (iterator.hasNext()) {
            this.f(q2, (String)((Map)iterator.next()).get("fid"), arrayList, arrayList2);
        }
    }

    public final ArrayList g(int n2, String string, String string2) {
        List list;
        Object object = (String)((Map)this.a.get(string)).get("stoken");
        StringBuilder stringBuilder = m.i("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&uc_param_str=&pwd_id=", string, "&stoken=");
        try {
            list = URLEncoder.encode((String)object, "UTF-8");
            object = list;
        }
        catch (Exception exception) {
            // empty catch block
        }
        stringBuilder.append((String)object);
        stringBuilder.append("&pdir_fid=");
        stringBuilder.append(string2);
        stringBuilder.append("&force=0&_page=");
        stringBuilder.append(n2);
        stringBuilder.append("&_size=100&_sort=file_type:asc,file_name:asc");
        object = (Map)C.L(A.e(stringBuilder.toString(), Collections.emptyMap(), z.o()).b(), Map.class);
        if (object != null && object.get("data") != null) {
            list = (List)((Map)object.get("data")).get("list");
            if (list == null) {
                return new ArrayList();
            }
            list = new ArrayList(list);
            if ((object = (Map)object.get("metadata")) != null) {
                int n3 = ((Number)object.get("_total")).intValue();
                int n4 = ((Number)object.get("_count")).intValue();
                if (n3 > 0 && n2 * 100 < n3 && n4 == 100) {
                    list.addAll(this.g(n2 + 1, string, string2));
                }
            }
            return list;
        }
        return new ArrayList();
    }

    public final String h(String charSequence, String string, String string2, String string3) {
        HashMap hashMap = this.g;
        String string4 = m.q("download_", string2);
        Object object = (String[])hashMap.get(string4);
        if (object != null && System.currentTimeMillis() - Long.parseLong(object[1]) < 600000L) {
            charSequence = m.i("[QUARK-DIRECT] cache hit fileId=", string2, ", host=");
            ((StringBuilder)charSequence).append(z.D(object[0]));
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            return object[0];
        }
        boolean bl = com.github.catvod.spider.merge.xc.L.a.c().b().b();
        HashMap hashMap2 = this.d;
        Object object2 = (String)hashMap2.get(string2);
        object = object2;
        if (object2 == null) {
            object = com.github.catvod.spider.merge.xc.L.a.c().a(string2);
        }
        String string5 = "";
        object2 = object;
        if (object == null) {
            object2 = this.E((String)charSequence, string, string2, string3);
            if (TextUtils.isEmpty((CharSequence)object2)) {
                m.o("[QUARK-DL] save failed fileId=", string2);
                return "";
            }
            hashMap2.put(string2, object2);
            com.github.catvod.spider.merge.xc.L.a.c().e(string2, (String)object2);
        }
        if (!bl) {
            object = this.k((String)object2);
            long l2 = object != null && object.get("size") != null ? ((Number)object.get("size")).longValue() : 0L;
            object = new StringBuilder("[QUARK-DL] fileSize=");
            ((StringBuilder)object).append(l2);
            ((StringBuilder)object).append(", svip=false, saveFileId=");
            ((StringBuilder)object).append((String)object2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            if (l2 > 0x500000000L) {
                m.o("[QUARK-DL] file too large for non-svip fileId=", string2);
                return "";
            }
        } else {
            m.o("[QUARK-DL] svip=true, saveFileId=", (String)object2);
        }
        if (!TextUtils.isEmpty((CharSequence)(object = this.j((String)object2, bl)))) {
            hashMap.put(string4, new String[]{object, String.valueOf(System.currentTimeMillis())});
            charSequence = m.i("[QUARK-DL] download ok fileId=", string2, ", host=");
            ((StringBuilder)charSequence).append(z.D((String)object));
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            return object;
        }
        object = new StringBuilder("[QUARK-DL] download empty, retry save fileId=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", saveFileId=");
        ((StringBuilder)object).append((String)object2);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        hashMap2.remove(string2);
        com.github.catvod.spider.merge.xc.L.a.c().f(string2);
        charSequence = this.E((String)charSequence, string, string2, string3);
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            hashMap2.put(string2, charSequence);
            com.github.catvod.spider.merge.xc.L.a.c().e(string2, (String)charSequence);
            string = this.j((String)charSequence, bl);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                hashMap.put(string4, new String[]{string, String.valueOf(System.currentTimeMillis())});
                charSequence = m.i("[QUARK-DL] retry download ok fileId=", string2, ", host=");
                ((StringBuilder)charSequence).append(z.D(string));
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            } else {
                m.o("[QUARK-DL] retry download empty fileId=", string2);
            }
            charSequence = string5;
            if (string != null) {
                charSequence = string;
            }
            return charSequence;
        }
        m.o("[QUARK-DL] retry save failed fileId=", string2);
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String i(String object) {
        block15: {
            CharSequence charSequence;
            Object object2;
            block18: {
                block17: {
                    block16: {
                        block14: {
                            block13: {
                                try {
                                    object2 = this.k((String)object);
                                    if (object2 == null) break block13;
                                }
                                catch (Exception exception) {
                                    return "";
                                }
                                if (object2.get("file_name") == null) break block13;
                                object2 = object2.get("file_name").toString();
                                break block14;
                            }
                            object2 = "";
                        }
                        if (object2 == null) return "";
                        if (((String)object2).isEmpty()) break block15;
                        String string = UUID.randomUUID().toString();
                        charSequence = UUID.randomUUID().toString();
                        StringBuilder stringBuilder = new StringBuilder("{\"conversations\":[{\"conversation_id\":\"300000003429402383\",\"conversation_type\":3,\"file_list\":[{\"client_extra\":{\"device_model\":\"TVBOX\",\"group_id\":\"");
                        stringBuilder.append(string);
                        stringBuilder.append("\",\"local_msg_id\":\"");
                        stringBuilder.append((String)charSequence);
                        stringBuilder.append("\"},\"content\":\"");
                        stringBuilder.append((String)object2);
                        stringBuilder.append("\",\"fid\":\"");
                        stringBuilder.append((String)object);
                        stringBuilder.append("\"}],\"merge_file\":0}],\"return_msg_as_list\":1}");
                        object = stringBuilder.toString();
                        object2 = z.n();
                        ((HashMap)object2).put("Content-Type", "application/json");
                        object = (Map)C.L(A.k("https://drive-social-api.quark.cn/1/clouddrive/chat/conv/msg/batch_send?pr=ucpro&fr=pc&sys=win32&ve=3.15.0", (String)object, (Map)object2).b(), Map.class);
                        if (object.get("data") != null) break block16;
                        return "";
                    }
                    object = (List)((Map)object.get("data")).get("conversations");
                    if (object == null) return "";
                    if (object.isEmpty()) break block15;
                    if ((object = (List)((Map)object.get(0)).get("file_list")) == null) return "";
                    if (object.isEmpty()) break block15;
                    if ((object = (Map)((Map)object.get(0)).get("send_result")) != null) break block17;
                    return "";
                }
                object = object.get("store_msg_id") != null ? object.get("store_msg_id").toString() : "";
                if (!((String)object).isEmpty()) break block18;
                return "";
            }
            charSequence = new StringBuilder("{\"conversation_id\":\"300000003429402383\",\"conversation_type\":3,\"msg_id\":\"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"}");
            object = (Map)C.L(A.k("https://drive-social-api.quark.cn/1/clouddrive/chat/conv/file/acquire_dl_token?pr=ucpro&fr=pc&sys=win32&ve=3.15.0", ((StringBuilder)charSequence).toString(), (Map)object2).b(), Map.class);
            if (object == null) return "";
            if (object.get("data") == null) return "";
            if ((object = ((Map)object.get("data")).get("token")) == null) return "";
            return object.toString();
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String j(String object, boolean bl) {
        Exception exception2;
        block5: {
            Object object2;
            block4: {
                try {
                    object2 = new HashMap();
                    ArrayList<String> arrayList = new ArrayList<String>();
                    arrayList.add((String)object);
                    ((HashMap)object2).put("fids", arrayList);
                    if (bl || (object = this.i((String)object)) == null || ((String)object).isEmpty()) break block4;
                    ((HashMap)object2).put("token", object);
                }
                catch (Exception exception2) {
                    break block5;
                }
            }
            object = z.n();
            ((HashMap)object).put("Content-Type", "application/json");
            object2 = A.k("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", C.Z(object2), (Map)object);
            z.I((X)object2);
            object = new StringBuilder("[QUARK-DL] api code=");
            ((StringBuilder)object).append(((X)object2).a);
            ((StringBuilder)object).append(", body=");
            ((StringBuilder)object).append(z.b(((X)object2).b()));
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = (Map)C.L(((X)object2).b(), Map.class);
            if (object == null) return "";
            if (object.get("data") == null) return "";
            if ((object = (List)object.get("data")).isEmpty()) return "";
            boolean bl2 = false;
            if (((Map)object.get(0)).get("download_url") == null) return "";
            object = (Map)object.get(0);
            object2 = object.get("format_type");
            bl = bl2;
            if (object2 != null) {
                bl = bl2;
                if (object2.toString().toLowerCase().contains("iso")) {
                    bl = true;
                }
            }
            this.k = bl;
            return object.get("download_url").toString();
        }
        m.m(exception2, new StringBuilder("[QUARK-DL] api exception="));
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Map k(String object) {
        try {
            StringBuilder stringBuilder = new StringBuilder("file/info?");
            stringBuilder.append(this.b);
            stringBuilder.append("&fid=");
            stringBuilder.append((String)object);
            stringBuilder.append("&_fetch_full_path=0&need_profile_tags=1");
            object = (Map)C.L(this.a(stringBuilder.toString(), Collections.emptyMap(), Collections.emptyMap(), 0, "GET"), Map.class);
            if (object.get("data") == null) return null;
            return (Map)object.get("data");
        }
        catch (Exception exception) {
            return null;
        }
    }

    public final String m(String charSequence, String string, String string2, String string3) {
        String string4 = m.q("transcode_", string2);
        Object object = (String[])this.g.get(string4);
        boolean bl = true;
        if (object != null && System.currentTimeMillis() - Long.parseLong(object[1]) < 600000L) {
            charSequence = m.i("[QUARK-DL] cache hit fileId=", string2, ", host=");
            ((StringBuilder)charSequence).append(z.D(object[0]));
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            return object[0];
        }
        HashMap hashMap = this.d;
        String string5 = (String)hashMap.get(string2);
        object = string5;
        if (string5 == null) {
            object = com.github.catvod.spider.merge.xc.L.a.c().a(string2);
        }
        if (object == null) {
            object = this.E((String)charSequence, string, string2, string3);
            if (TextUtils.isEmpty((CharSequence)object)) {
                return "";
            }
            hashMap.put(string2, object);
            com.github.catvod.spider.merge.xc.L.a.c().e(string2, (String)object);
        } else {
            bl = false;
        }
        object = this.C((String)object, string4);
        if (!TextUtils.isEmpty((CharSequence)object)) {
            return object;
        }
        if (!bl) {
            hashMap.remove(string2);
            com.github.catvod.spider.merge.xc.L.a.c().f(string2);
            charSequence = this.E((String)charSequence, string, string2, string3);
            if (!TextUtils.isEmpty((CharSequence)charSequence)) {
                hashMap.put(string2, charSequence);
                com.github.catvod.spider.merge.xc.L.a.c().e(string2, (String)charSequence);
                charSequence = this.C((String)charSequence, string4);
                if (!TextUtils.isEmpty((CharSequence)charSequence)) {
                    return charSequence;
                }
            }
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String q(String object, String object2, String string, String string2) {
        Exception exception2;
        block6: {
            String string3 = m.q("direct_", string);
            Object object3 = (String[])this.g.get(string3);
            if (object3 != null && System.currentTimeMillis() - Long.parseLong(object3[1]) < 600000L) {
                return object3[0];
            }
            try {
                object3 = new HashMap();
                ArrayList<String> arrayList = new ArrayList<String>();
                arrayList.add(string);
                ((HashMap)object3).put("fids", arrayList);
                arrayList = new ArrayList<String>();
                arrayList.add(string2);
                ((HashMap)object3).put("fids_token", arrayList);
                ((HashMap)object3).put("pwd_id", object);
                ((HashMap)object3).put("stoken", object2);
                ((HashMap)object3).put("speedup_session", "");
                object = z.n();
                ((HashMap)object).put("Content-Type", "application/json");
                object2 = A.k("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", C.Z(object3), (Map)object);
                z.I((X)object2);
                object = new StringBuilder("[QUARK-DIRECT] api code=");
                ((StringBuilder)object).append(((X)object2).a);
                ((StringBuilder)object).append(", body=");
                ((StringBuilder)object).append(z.b(((X)object2).b()));
                SpiderDebug.log((String)((StringBuilder)object).toString());
                object2 = (Map)C.L(((X)object2).b(), Map.class);
                if (object2 == null) return "";
            }
            catch (Exception exception2) {
                break block6;
            }
            object = object2.get("message") != null ? object2.get("message").toString() : "";
            if (((String)object).contains("file not found")) {
                return "";
            }
            if (object2.get("data") == null || (object = (List)object2.get("data")) == null || object.isEmpty() || ((Map)object.get(0)).get("download_url") == null) return "";
            object2 = (object = (Map)object.get(0)).get("format_type");
            boolean bl = object2 != null && object2.toString().toLowerCase().contains("iso");
            this.k = bl;
            if (((String)(object = object.get("download_url").toString())).isEmpty()) return "";
            this.g.put(string3, new String[]{object, String.valueOf(System.currentTimeMillis())});
            object2 = new StringBuilder("[QUARK-DIRECT] download ok fileId=");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(", host=");
            ((StringBuilder)object2).append(z.D((String)object));
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            return object;
        }
        m.m(exception2, new StringBuilder("[QUARK-DIRECT] api exception="));
        return "";
    }

    public final void r(q object) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(((q)object).a)) {
            CharSequence charSequence = new StringBuilder("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/token?__t=");
            charSequence.append(System.currentTimeMillis());
            String string = charSequence.toString();
            HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
            String string2 = ((q)object).a;
            hashMap2.put("pwd_id", string2);
            charSequence = ((q)object).c;
            object = charSequence;
            if (charSequence == null) {
                object = "";
            }
            hashMap2.put("passcode", object);
            object = (Map)C.L(A.k(string, C.Z(hashMap2), z.o()).b(), Map.class);
            if (object != null && object.containsKey("data") && ((Map)object.get("data")).containsKey("stoken")) {
                hashMap.put(string2, (Map)object.get("data"));
            }
        }
    }

    public final k t(q object) {
        this.r((q)object);
        if (!this.a.containsKey(((q)object).a)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Object object2 = new ArrayList();
        this.f((q)object, ((q)object).b, arrayList, (ArrayList)object2);
        Collections.emptyList();
        y.a.getClass();
        object2 = Collections.singletonList("\u667a");
        ArrayList<String> arrayList2 = new ArrayList<String>();
        object = B.j;
        if (((HashSet)object).contains("quark_original")) {
            arrayList2.add("\u5938\u514b\u539f\u753b");
        }
        if (((HashSet)object).contains("quark_unlimited")) {
            arrayList2.add("\u5938\u514b\u76f4\u94fe");
        }
        if (((HashSet)object).contains("quark_smart")) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                arrayList2.add("\u5938\u514b\u667a\u80fd");
            }
        }
        ArrayList<String> arrayList3 = new ArrayList<String>();
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int i2 = 0; i2 < ((b)arrayList.get((int)(arrayList.size() - 1))).g; ++i2) {
            for (int i4 = 0; i4 < arrayList2.size(); ++i4) {
                ArrayList<String> arrayList4 = new ArrayList<String>();
                for (b b2 : arrayList) {
                    if (b2.g != i2 + 1) continue;
                    object = b2.e.isEmpty() ? "" : b2.e;
                    object = J.b((String)object) ? "++".concat(H.c(((String)object).getBytes())) : "";
                    StringBuilder stringBuilder = new StringBuilder();
                    object2 = b2.e.isEmpty() ? "" : b2.e;
                    StringBuilder stringBuilder2 = new StringBuilder("[");
                    stringBuilder2.append(H.i(b2.f));
                    stringBuilder2.append("] ");
                    stringBuilder2.append((String)object2);
                    stringBuilder.append(stringBuilder2.toString());
                    stringBuilder.append("$");
                    object2 = b2.a.isEmpty() ? "" : b2.a;
                    stringBuilder.append((String)object2);
                    stringBuilder.append("++");
                    stringBuilder.append(b2.d);
                    stringBuilder.append("++");
                    stringBuilder.append(b2.b);
                    stringBuilder.append("++");
                    stringBuilder.append(b2.c);
                    stringBuilder.append((String)object);
                    arrayList4.add(stringBuilder.toString());
                }
                arrayList3.add(TextUtils.join((CharSequence)"#", arrayList4));
            }
        }
        object = new k();
        ((k)object).l("");
        ((k)object).j("");
        ((k)object).n("");
        ((k)object).m("");
        ((k)object).p(TextUtils.join((CharSequence)"$$$", arrayList3));
        ((k)object).o(TextUtils.join((CharSequence)"$$$", arrayList2));
        ((k)object).g("\u5938\u514b\u4e91\u76d8");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void v(String object) {
        H.a((String)object);
        z.F((String)object);
        boolean bl = false;
        try {
            boolean bl2;
            boolean bl3;
            block6: {
                block8: {
                    block7: {
                        object = (Map)C.L(this.a("member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", null, null, 0, "GET"), Map.class);
                        if (object == null) return;
                        if (object.get("data") == null) {
                            return;
                        }
                        object = (object = (Map)object.get("data")).get("member_type") != null ? object.get("member_type").toString() : "";
                        bl3 = object != null && !((String)object).isEmpty() && !"none".equals(object) && !"UNPAID".equals(object) && !"normal".equalsIgnoreCase((String)object);
                        bl2 = bl;
                        if (object == null) break block6;
                        if (!((String)object).isEmpty()) break block7;
                        bl2 = bl;
                        break block6;
                    }
                    if (((String)(object = ((String)object).toUpperCase())).contains("SVIP")) break block8;
                    bl2 = bl;
                    if (!((String)object).contains("SUPER")) break block6;
                }
                bl2 = true;
            }
            com.github.catvod.spider.merge.xc.L.a.c().h(bl3, bl2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void w() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [4, 3 : 69->91)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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
}

