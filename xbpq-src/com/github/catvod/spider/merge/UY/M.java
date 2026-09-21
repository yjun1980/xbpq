/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.UY;

import android.os.SystemClock;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.B;
import com.github.catvod.spider.merge.UY.J;
import com.github.catvod.spider.merge.UY.L;
import com.github.catvod.spider.merge.UY.S;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.b;
import com.github.catvod.spider.merge.UY.s;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.O.a;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class M {
    public static final List r = Arrays.asList(".srt", ".ass", ".scc", ".stl", ".ttml");
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public volatile boolean e = false;
    public volatile boolean f = false;
    public final Object g = new Object();
    public volatile boolean h = false;
    public volatile boolean i = false;
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public final HashMap l = new HashMap();
    public volatile boolean m = false;
    public volatile boolean n = false;
    public volatile long o = 0L;
    public ScheduledExecutorService p;
    public final S q = new S();

    static {
        Pattern.compile("__puus=([^;]+)");
    }

    public M() {
        try {
            Object object = com.github.catvod.spider.merge.xc.O.a.g();
            if (com.github.catvod.spider.merge.xc.A0.c.c(new CharSequence[]{object}) && ((String)object).length() > 10) {
                H.a((String)object);
                object = new J(this, 1);
                InitOrigin.execute((Runnable)object);
            }
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.Bk.m.m(exception, new StringBuilder("[UC] \u521d\u59cb\u5316\u5f02\u5e38: "));
        }
    }

    public static void a(M m2, HashMap hashMap) {
        Object object = m2.p;
        if (object != null) {
            object.shutdownNow();
        }
        hashMap.put("client_id", "381");
        hashMap.put("v", "1.2");
        hashMap.put("request_id", m2.d);
        object = new StringBuilder("[UC\u767b\u5f55] \u5f00\u59cb\u8f6e\u8be2, qrRequestId=");
        ((StringBuilder)object).append(m2.d);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("Accept", "application/json, text/plain, */*");
        hashMap2.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
        hashMap2.put("Referer", "https://broccoli.uc.cn/");
        m2.p = object = Executors.newScheduledThreadPool(1);
        object.scheduleWithFixedDelay(new b(m2, (Object)hashMap, hashMap2, 2), 1L, 3L, TimeUnit.SECONDS);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String j() {
        Object object;
        String string = com.github.catvod.spider.merge.xc.O.a.g();
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        try {
            object = new HashMap();
            ((HashMap)object).put("Referer", "https://drive.uc.cn");
            ((HashMap)object).put("Cookie", string);
            ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
            string = A.i("https://pc-api.uc.cn/1/clouddrive/file", object);
            object = string.body() != null ? string.body().string() : "";
        }
        catch (Exception exception) {
            return "";
        }
        string.close();
        if (TextUtils.isEmpty((CharSequence)object)) return "";
        if (((String)object).startsWith("{")) return "";
        if (((String)object).startsWith("<")) return "";
        return ((String)object).trim();
    }

    public static B m(String object) {
        object = Pattern.compile("https://drive\\.uc\\.cn/s/([^?]+)").matcher((CharSequence)object);
        if (((Matcher)object).find()) {
            return new B(3, ((Matcher)object).group(1), "0");
        }
        return null;
    }

    public static boolean p() {
        String string = com.github.catvod.spider.merge.xc.O.a.g();
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

    public static boolean r(Map map) {
        boolean bl = false;
        if (map == null) {
            return false;
        }
        if ((map = map.get("status")) instanceof Number) {
            if (((Number)((Object)map)).intValue() == 200) {
                bl = true;
            }
            return bl;
        }
        return "200".equals(String.valueOf(map));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean s(String object) {
        boolean bl;
        boolean bl2;
        block7: {
            block6: {
                bl2 = true;
                try {
                    HashMap<String, String> hashMap = new HashMap<String, String>();
                    hashMap.put("Referer", "https://drive.uc.cn");
                    hashMap.put("Cookie", com.github.catvod.spider.merge.xc.O.a.g());
                    hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
                    hashMap.put("Range", "bytes=0-1");
                    object = A.i((String)object, hashMap);
                    if (object.body() != null) {
                        object.body().close();
                    }
                    int n2 = object.code();
                    bl = bl2;
                    if (n2 < 200) return bl;
                    if (n2 < 300) break block6;
                    return bl2;
                }
                catch (Exception exception) {
                    return bl2;
                }
            }
            object = object.header("Content-Range");
            if (object != null) break block7;
            return true;
        }
        object = Pattern.compile(".*/(\\d+)").matcher((CharSequence)object);
        bl = bl2;
        if (!((Matcher)object).find()) return bl;
        long l2 = Long.parseLong(((Matcher)object).group(1));
        if (l2 != 15340287L) return false;
        return bl2;
    }

    public static boolean t(String string) {
        boolean bl = string != null && (string.contains("UC\u76f4\u94fe") || string.contains("\u4f18\u89c6\u539f") || string.contains("\u539f"));
        return bl;
    }

    public static boolean u(String string) {
        boolean bl;
        block2: {
            block4: {
                boolean bl2;
                block3: {
                    bl = bl2 = false;
                    if (string == null) break block2;
                    if (!string.isEmpty()) break block3;
                    bl = bl2;
                    break block2;
                }
                if ((string = string.toLowerCase()).contains("svip")) break block4;
                bl = bl2;
                if (!string.contains("super")) break block2;
            }
            bl = true;
        }
        return bl;
    }

    public static boolean v(Object object) {
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

    public static boolean w(String string) {
        boolean bl = string != null && !string.isEmpty() && !"none".equals(string) && !"UNPAID".equals(string) && !"normal".equalsIgnoreCase(string);
        return bl;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String y(String charSequence, String charSequence2) {
        void var0_2;
        String string;
        CharSequence charSequence3;
        block10: {
            string = ((String)charSequence3).split(";")[0];
            if (string.contains("=")) break block10;
            return charSequence;
        }
        charSequence3 = string.split("=")[0].trim();
        String string2 = string.substring(((String)charSequence3).length() + 1);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (String string3 : ((String)charSequence).split(";")) {
            int n2 = string3.indexOf("=");
            if (n2 == -1) continue;
            linkedHashMap.put(string3.substring(0, n2).trim(), string3.substring(n2 + 1).trim());
        }
        try {
            linkedHashMap.put((String)charSequence3, string2);
            charSequence3 = new StringBuilder();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((StringBuilder)charSequence3).length() > 0) {
                    ((StringBuilder)charSequence3).append(";");
                }
                ((StringBuilder)charSequence3).append((String)entry.getKey());
                ((StringBuilder)charSequence3).append("=");
                ((StringBuilder)charSequence3).append((String)entry.getValue());
            }
            CharSequence charSequence4 = charSequence3 = ((StringBuilder)charSequence3).toString();
            return var0_2;
        }
        catch (Exception exception) {
            return var0_2;
        }
    }

    public static String z(String object, Map object22) {
        if (object22 != null && object22.get("data") != null) {
            if ((object22 = (Map)object22.get("data")).get("video_list") == null) {
                return "";
            }
            object = ((String)object).contains("-") ? ((String)object).substring(((String)object).lastIndexOf("-") + 1) : "";
            List list = (List)object22.get("video_list");
            for (Map map : list) {
                if (!M.c(map.get("accessable")) || !((String)(object22 = map.get("resolution") != null ? map.get("resolution").toString() : "")).equals(object) || (object22 = (Map)map.get("video_info")) == null || object22.get("url") == null) continue;
                return object22.get("url").toString();
            }
            for (Object object22 : list) {
                if (!M.c(object22.get("accessable")) || (object22 = (Map)object22.get("video_info")) == null || object22.get("url") == null) continue;
                return object22.get("url").toString();
            }
        }
        return "";
    }

    public final String A(String charSequence, String[] object) {
        block27: {
            String string;
            Object object2;
            block21: {
                CharSequence charSequence2;
                String string2;
                String string3;
                String string4;
                String string5;
                block28: {
                    block26: {
                        object2 = com.github.catvod.spider.merge.xc.O.a.g();
                        if (!com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object2) && ((String)object2).length() > 10) break block26;
                        this.q();
                        object2 = com.github.catvod.spider.merge.xc.O.a.g();
                        if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object2) || ((String)object2).length() <= 10) break block27;
                    }
                    string = object[0];
                    string5 = object[1];
                    string4 = object[2];
                    string3 = object[3];
                    this.m = false;
                    boolean bl = M.t((String)charSequence);
                    string2 = "";
                    object2 = ")";
                    charSequence2 = "/";
                    if (!bl) break block28;
                    int n2 = 0;
                    while (true) {
                        block22: {
                            object = string2;
                            if (n2 > 2) break block21;
                            bl = n2 == 0;
                            try {
                                object = this.k(string4, string3, string, string5, bl);
                                if (com.github.catvod.spider.merge.xc.A0.c.d((CharSequence)object)) break block21;
                                if (n2 >= 2) break block22;
                            }
                            catch (Exception exception) {}
                            object = new StringBuilder();
                            ((StringBuilder)object).append("[UC] \u539f\u753b\u83b7\u53d6\u5931\u8d25\uff0c\u5237\u65b0\u51ed\u8bc1\u91cd\u8bd5(");
                            ((StringBuilder)object).append(n2 + 1);
                            ((StringBuilder)object).append((String)charSequence2);
                            ((StringBuilder)object).append(2);
                            try {
                                ((StringBuilder)object).append((String)object2);
                                SpiderDebug.log((String)((StringBuilder)object).toString());
                                this.a = "";
                                com.github.catvod.spider.merge.xc.O.a.f().b();
                                this.k.remove(string);
                                object = com.github.catvod.spider.merge.xc.O.a.f();
                            }
                            catch (Exception exception) {}
                            try {
                                ((a)object).h(string, null);
                            }
                            catch (Exception exception) {
                            }
                            com.github.catvod.spider.merge.Bk.m.m((Exception)object, new StringBuilder("[UC] \u539f\u753b\u83b7\u53d6\u5f02\u5e38: "));
                        }
                        ++n2;
                    }
                }
                object2 = ")";
                int n3 = 0;
                while (true) {
                    block24: {
                        object = string2;
                        if (n3 > 2) break;
                        try {
                            object = this.l(string4, string3, string, string5, (String)charSequence);
                            if (com.github.catvod.spider.merge.xc.A0.c.d((CharSequence)object)) break;
                            if (n3 >= 2) break block24;
                        }
                        catch (Exception exception) {}
                        object = new StringBuilder();
                        ((StringBuilder)object).append("[UC] \u667a\u753b\u83b7\u53d6\u5931\u8d25\uff0c\u6e05\u9664\u7f13\u5b58\u91cd\u8bd5(");
                        ((StringBuilder)object).append(n3 + 1);
                        ((StringBuilder)object).append("/");
                        ((StringBuilder)object).append(2);
                        try {
                            ((StringBuilder)object).append((String)object2);
                            SpiderDebug.log((String)((StringBuilder)object).toString());
                            this.k.remove(string);
                            object = com.github.catvod.spider.merge.xc.O.a.f();
                        }
                        catch (Exception exception) {}
                        try {
                            ((a)object).h(string, null);
                            object = this.l;
                            charSequence2 = new StringBuilder();
                            ((StringBuilder)charSequence2).append("transcode_");
                            ((StringBuilder)charSequence2).append(string);
                            ((HashMap)object).remove(((StringBuilder)charSequence2).toString());
                        }
                        catch (Exception exception) {
                        }
                        com.github.catvod.spider.merge.Bk.m.m((Exception)object, new StringBuilder("[UC] \u667a\u753b\u83b7\u53d6\u5f02\u5e38: "));
                    }
                    ++n3;
                }
            }
            if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object)) {
                charSequence = new StringBuilder("[UC] \u83b7\u53d6\u64ad\u653e\u5730\u5740\u5931\u8d25: fileId=");
                ((StringBuilder)charSequence).append(string);
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                return com.github.catvod.spider.merge.MP.g.c("\u83b7\u53d6\u64ad\u653e\u5730\u5740\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5");
            }
            object2 = com.github.catvod.spider.merge.Bk.m.j("Referer", "https://drive.uc.cn");
            ((HashMap)object2).put("Cookie", com.github.catvod.spider.merge.xc.O.a.g());
            ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
            if (M.t((String)charSequence)) {
                charSequence = M.u(this.c) ? "uc_vip" : "uc";
                charSequence = com.github.catvod.spider.merge.KT.B.y((String)object, (Map)object2, com.github.catvod.spider.merge.KT.B.p((String)charSequence), (String)charSequence);
            } else {
                charSequence = object;
            }
            if (((String)object).contains(".m3u8")) {
                object = new g();
                ((g)object).w((String)charSequence);
                ((g)object).h();
                charSequence = ((g)object).toString();
            } else {
                object = new g();
                ((g)object).w((String)charSequence);
                charSequence = this.m ? "video/x-iso" : "application/octet-stream";
                ((g)object).f((String)charSequence);
                charSequence = ((g)object).toString();
            }
            return charSequence;
        }
        return com.github.catvod.spider.merge.MP.g.c("UC\u6388\u6743\u5931\u8d25\uff0c\u8bf7\u626b\u7801\u767b\u5f55");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void B() {
        try {
            Object object = com.github.catvod.spider.merge.xc.O.a.g();
            if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object)) {
                return;
            }
            Object object2 = new HashMap();
            ((HashMap)object2).put("Cookie", object);
            ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
            ((HashMap)object2).put("Referer", "https://drive.uc.cn");
            object = new HashMap();
            object2 = (Map)C.L(A.e("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", object, object2).b(), Map.class);
            if (!M.r(object2)) {
                return;
            }
            object = (Map)object2.get("data");
            if (object == null) {
                return;
            }
            object2 = "";
            if ((object = object.get("member_type")) != null) {
                object2 = object.toString();
            }
            this.c = object2;
            boolean bl = M.w((String)object2);
            boolean bl2 = M.u((String)object2);
            com.github.catvod.spider.merge.xc.O.a.f().i(bl, bl2);
            object = new StringBuilder("[UC] \u4f1a\u5458\u72b6\u6001\u5df2\u5237\u65b0: type=");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(", vip=");
            ((StringBuilder)object).append(bl);
            ((StringBuilder)object).append(", svip=");
            ((StringBuilder)object).append(bl2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.Bk.m.m(exception, new StringBuilder("[UC] \u5237\u65b0\u4f1a\u5458\u72b6\u6001\u5931\u8d25: "));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String C(String object, String object2, String string, String string2, boolean bl) {
        try {
            this.h(bl);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.f();
        String string3 = !this.b.isEmpty() ? this.b : "0";
        if (object2 == null) {
            this.n(new B(3, (String)object, null));
            object2 = this.j;
            if (!((HashMap)object2).containsKey(object)) {
                com.github.catvod.spider.merge.Bk.m.o("[UC] \u5206\u4eab\u8d44\u6e90\u5931\u6548: shareId=", (String)object);
                return "";
            }
            object2 = (String)((Map)((HashMap)object2).get(object)).get("stoken");
        }
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.k("pdir_fid", "0", "pwd_id", (String)object);
        hashMap.put("scene", "link");
        hashMap.put("stoken", object2);
        hashMap.put("to_pdir_fid", string3);
        hashMap.put("fid_list", Collections.singletonList(string));
        object = string2 != null ? string2 : "";
        hashMap.put("fid_token_list", Collections.singletonList(object));
        object = (Map)C.L(this.b("share/sharepage/save?pr=UCBrowser&fr=pc&sys=win32&ve=1.5.2", null, hashMap, 0, "POST"), Map.class);
        if (object == null) {
            return null;
        }
        int n2 = object.get("status") != null ? ((Number)object.get("status")).intValue() : 0;
        if (n2 > 200) {
            object = object.get("message") != null ? object.get("message").toString() : "\u672a\u77e5\u9519\u8bef";
            com.github.catvod.spider.merge.Bk.m.o("[UC] \u8f6c\u5b58\u5931\u8d25: ", (String)object);
            return "";
        }
        if (object.get("data") == null) return "";
        if (((Map)object.get("data")).get("task_id") == null) return "";
        object = String.valueOf(((Map)object.get("data")).get("task_id"));
        n2 = 1;
        while (n2 < 6) {
            object2 = new StringBuilder("task?pr=UCBrowser&fr=pc&uc_param_str=&task_id=");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("&retry_index=");
            ((StringBuilder)object2).append(n2);
            ((StringBuilder)object2).append("&__t=");
            ((StringBuilder)object2).append(System.currentTimeMillis());
            object2 = (Map)C.L(this.b(((StringBuilder)object2).toString(), Collections.emptyMap(), Collections.emptyMap(), 0, "GET"), Map.class);
            if (object2 != null) {
                int n3 = object2.get("status") != null ? ((Number)object2.get("status")).intValue() : 0;
                if (n3 > 200) {
                    object = object2.get("message") != null ? object2.get("message").toString() : "";
                    if (((String)object).contains("capacity limit")) {
                        SpiderDebug.log((String)"[UC] \u8f6c\u5b58\u4efb\u52a1\u5931\u8d25: \u4e91\u76d8\u5bb9\u91cf\u4e0d\u8db3");
                        InitOrigin.run((Runnable)new s(8));
                        return "";
                    }
                    SpiderDebug.log((String)"[UC] \u8f6c\u5b58\u4efb\u52a1\u5931\u8d25: ".concat((String)object));
                    return "";
                }
                try {
                    object2 = (Map)object2.get("data");
                    if (object2 != null && (object2 = (Map)object2.get("save_as")) != null && (object2 = (List)object2.get("save_as_top_fids")) != null && !object2.isEmpty()) {
                        return (String)object2.get(0);
                    }
                }
                catch (Exception exception) {}
                TimeUnit.SECONDS.sleep(1L);
            }
            ++n2;
        }
        return "";
    }

    public final String b(String string, Map map, Map map2, Integer object, String string2) {
        Object object2;
        Object object3;
        int n2 = (Integer)object;
        if (com.github.catvod.spider.merge.xc.A0.c.b(com.github.catvod.spider.merge.xc.O.a.g())) {
            this.q();
            if (n2 > 0) {
                return this.b(string, map, map2, n2 - 1, string2);
            }
        }
        object = com.github.catvod.spider.merge.Bk.m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch", "Referer", "https://drive.uc.cn");
        ((HashMap)object).put("Content-Type", "application/json");
        ((HashMap)object).put("Cookie", com.github.catvod.spider.merge.xc.O.a.g());
        if ("GET".equals(string2)) {
            object3 = new StringBuilder("https://pc-api.uc.cn/1/clouddrive/");
            ((StringBuilder)object3).append(string);
            object3 = A.e(((StringBuilder)object3).toString(), map, (Map)object);
        } else {
            object3 = A.k(com.github.catvod.spider.merge.Bk.m.q("https://pc-api.uc.cn/1/clouddrive/", string), C.Z(map2), (Map)object);
        }
        Object object4 = (Map)((X)object3).c;
        object = object2 = (List)object4.get("Set-Cookie");
        if (object2 == null) {
            object = (List)object4.get("set-cookie");
        }
        if (object != null && !object.isEmpty()) {
            object2 = com.github.catvod.spider.merge.xc.O.a.g();
            object4 = object.iterator();
            object = object2;
            while (object4.hasNext()) {
                String string3 = ((String)object4.next()).split(";")[0];
                if (!string3.contains("=")) continue;
                object2 = string3.split("=")[0];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object2);
                stringBuilder.append("=");
                if (((String)object).contains(stringBuilder.toString())) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object2);
                    stringBuilder.append("=[^;]*");
                    object = ((String)object).replaceAll(stringBuilder.toString(), string3);
                    continue;
                }
                object = com.github.catvod.spider.merge.Bk.m.g((String)object, ";", string3);
            }
            object4 = com.github.catvod.spider.merge.xc.O.a.f();
            object2 = ((a)object4).d();
            ((com.github.catvod.spider.merge.xc.O.c)object2).c((String)object);
            ((a)object4).j((com.github.catvod.spider.merge.xc.O.c)object2);
        }
        if (((X)object3).a != 200 && n2 > 0) {
            Thread.sleep(1000L);
            return this.b(string, map, map2, n2 - 1, string2);
        }
        return ((X)object3).b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d() {
        if (System.currentTimeMillis() - this.o < 300000L) {
            return this.n;
        }
        try {
            Object object = com.github.catvod.spider.merge.xc.O.a.g();
            if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object)) {
                return false;
            }
            Object object2 = new HashMap();
            ((HashMap)object2).put("Cookie", object);
            ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
            ((HashMap)object2).put("Referer", "https://drive.uc.cn");
            object = new HashMap();
            object2 = (Map)C.L(A.e("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", object, object2).b(), Map.class);
            if (!M.r(object2)) {
                return false;
            }
            object = (Map)object2.get("data");
            if (object == null) {
                return false;
            }
            object2 = "";
            if ((object = object.get("member_type")) != null) {
                object2 = object.toString();
            }
            this.c = object2;
            boolean bl = M.w((String)object2);
            boolean bl2 = M.u((String)object2);
            com.github.catvod.spider.merge.xc.O.a.f().i(bl, bl2);
            object = new StringBuilder("[UC] \u5b9e\u65f6SVIP\u68c0\u6d4b: type=");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(", svip=");
            ((StringBuilder)object).append(bl2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            this.n = bl2;
            this.o = System.currentTimeMillis();
            return bl2;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.Bk.m.m(exception, new StringBuilder("[UC] \u5b9e\u65f6SVIP\u68c0\u6d4b\u5931\u8d25: "));
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        SpiderDebug.log((String)"[UC] \u5f00\u59cb\u6e05\u9664\u8d26\u53f7\u6570\u636e...");
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = false;
        this.f = false;
        this.j.clear();
        this.k.clear();
        this.l.clear();
        Object object = com.github.catvod.spider.merge.xc.O.a.f();
        ((a)object).a();
        ((a)object).j(new com.github.catvod.spider.merge.xc.O.c());
        ((a)object).b();
        C.b0("uc", ((a)object).toString());
        Object object2 = com.github.catvod.spider.merge.xc.O.a.e;
        synchronized (object2) {
            com.github.catvod.spider.merge.xc.O.a.d = null;
        }
        object = this.q;
        ((S)object).b = "";
        ((S)object).c = "";
        ((S)object).j();
        C.b0("uc_smart", "");
        SpiderDebug.log((String)"[UCTV] \u667a\u753b\u51ed\u8bc1\u5df2\u6e05\u9664");
        SpiderDebug.log((String)"[UC] \u8d26\u53f7\u6570\u636e\u5df2\u6e05\u9664");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        try {
            int n2;
            Object object2;
            if (TextUtils.isEmpty((CharSequence)this.b)) {
                return;
            }
            int n3 = 1;
            int n4 = 0;
            while (true) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("file/sort?pr=UCBrowser&fr=pc&pdir_fid=");
                ((StringBuilder)object2).append(this.b);
                ((StringBuilder)object2).append("&_page=");
                ((StringBuilder)object2).append(n3);
                ((StringBuilder)object2).append("&_size=200&_sort=file_type:asc,updated_at:desc");
                object2 = (Map)C.L(this.b(((StringBuilder)object2).toString(), Collections.emptyMap(), Collections.emptyMap(), 0, "GET"), Map.class);
                n2 = n4;
                if (object2 == null) break;
                if (object2.get("data") == null) {
                    n2 = n4;
                    break;
                }
                List list = (List)((Map)object2.get("data")).get("list");
                n2 = n4;
                if (list == null) break;
                if (list.isEmpty()) {
                    n2 = n4;
                    break;
                }
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (Object object2 : list) {
                    object2 = object2.get("fid") != null ? object2.get("fid").toString() : "";
                    if (TextUtils.isEmpty((CharSequence)object2)) continue;
                    arrayList.add(object2);
                }
                n2 = n4;
                if (!arrayList.isEmpty()) {
                    object2 = new HashMap();
                    ((HashMap)object2).put("action_type", 2);
                    ((HashMap)object2).put("filelist", arrayList);
                    ((HashMap)object2).put("exclude_fids", Collections.emptyList());
                    this.b("file/delete?pr=UCBrowser&fr=pc", Collections.emptyMap(), (Map)object2, 0, "POST");
                    n2 = n4 + arrayList.size();
                }
                if (list.size() < 200) break;
                ++n3;
                n4 = n2;
            }
            if (n2 <= 0) return;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("[UC] \u6e05\u7406tudou\u76ee\u5f55: \u5220\u9664");
            ((StringBuilder)object2).append(n2);
            ((StringBuilder)object2).append("\u4e2a\u6587\u4ef6");
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            this.k.clear();
            com.github.catvod.spider.merge.xc.O.a.f().a();
            this.l.clear();
            this.g();
            return;
        }
        catch (Exception exception) {}
        com.github.catvod.spider.merge.Bk.m.m(exception, new StringBuilder("[UC] cleanupAllSavedFiles\u5f02\u5e38: "));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        Exception exception2;
        int n2 = 1;
        while (true) {
            HashMap<String, Serializable> hashMap;
            ArrayList<String> arrayList;
            Object object;
            try {
                object = new StringBuilder();
                ((StringBuilder)object).append("file/recycle/list?pr=UCBrowser&fr=pc&_page=");
                ((StringBuilder)object).append(n2);
                ((StringBuilder)object).append("&_size=200&_sort=move_recycle_at:desc");
                object = (Map)C.L(this.b(((StringBuilder)object).toString(), Collections.emptyMap(), Collections.emptyMap(), 0, "GET"), Map.class);
                if (object == null) return;
                if (object.get("data") == null) {
                    return;
                }
                if ((object = (List)((Map)object.get("data")).get("list")) == null) return;
                if (object.isEmpty()) {
                    return;
                }
                arrayList = new ArrayList<String>();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    hashMap = (HashMap<String, Serializable>)iterator.next();
                    if (hashMap.get("record_id") == null) continue;
                    arrayList.add(hashMap.get("record_id").toString());
                }
            }
            catch (Exception exception2) {
                break;
            }
            if (!arrayList.isEmpty()) {
                hashMap = new HashMap<String, Serializable>();
                hashMap.put("select_mode", Integer.valueOf(2));
                hashMap.put("record_list", arrayList);
                this.b("file/recycle/remove?pr=UCBrowser&fr=pc", Collections.emptyMap(), hashMap, 0, "POST");
            }
            if (object.size() < 200) {
                return;
            }
            ++n2;
            Thread.sleep(500L);
        }
        com.github.catvod.spider.merge.Bk.m.m(exception2, new StringBuilder("[UC] clearRecycleBin\u5f02\u5e38: "));
    }

    public final void h(boolean bl) {
        Object object;
        if (!this.b.isEmpty()) {
            if (bl) {
                this.f();
            }
            return;
        }
        Object object2 = new StringBuilder("file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=200&_sort=file_type:asc,updated_at:desc&__t=");
        ((StringBuilder)object2).append(System.currentTimeMillis());
        object2 = (Map)C.L(this.b(((StringBuilder)object2).toString(), Collections.emptyMap(), Collections.emptyMap(), 3, "GET"), Map.class);
        if (object2 != null && object2.get("data") != null && (object2 = (List)((Map)object2.get("data")).get("list")) != null) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = (Map)object2.next();
                if (!"tudou".equals(object.get("file_name"))) continue;
                this.b = object.get("fid").toString();
                if (!bl) break;
                this.f();
                break;
            }
        }
        if (this.b.isEmpty()) {
            object2 = new StringBuilder("file?pr=UCBrowser&fr=pc&uc_param_str=&__t=");
            ((StringBuilder)object2).append(System.currentTimeMillis());
            object = ((StringBuilder)object2).toString();
            object2 = com.github.catvod.spider.merge.Bk.m.k("pdir_fid", "0", "file_name", "tudou");
            ((HashMap)object2).put("dir_path", "");
            ((HashMap)object2).put("dir_init_lock", Boolean.FALSE);
            object2 = (Map)C.L(this.b((String)object, Collections.emptyMap(), (Map)object2, 3, "POST"), Map.class);
            if (object2 != null && object2.get("data") != null && ((Map)object2.get("data")).get("fid") != null) {
                this.b = ((Map)object2.get("data")).get("fid").toString();
            } else if (((String)(object2 = object2 != null ? String.valueOf(object2.get("message")) : "")).contains("already exist")) {
                this.b = "";
                this.h(false);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i() {
        if (this.q.e()) {
            return;
        }
        if (!com.github.catvod.spider.merge.KT.B.r("uc")) {
            return;
        }
        if (!com.github.catvod.spider.merge.KT.B.j.contains("uc_smart")) {
            return;
        }
        var2_2 = var3_1 = com.github.catvod.spider.merge.xc.O.a.f().d().b();
        if (!var3_1) {
            var2_2 = var3_1;
            if (M.p()) {
                var2_2 = this.d();
            }
        }
        if (var2_2) {
            return;
        }
        while (this.h) {
            SystemClock.sleep((long)250L);
            if (this.q.e() != false) return;
            if (!this.i) continue;
            return;
        }
        var5_3 = this.g;
        synchronized (var5_3) {
            if (this.q.e() || this.h) ** GOTO lbl-1000
            this.h = true;
            this.i = false;
        }
        try {
            block17: {
                var4_4 = new s(24);
                InitOrigin.run((Runnable)var4_4);
                break block17;
lbl-1000:
                // 1 sources

                {
                    try {
                        return;
                    }
                    catch (Throwable var4_6) {}
                    throw var4_6;
                }
            }
            for (var1_7 = 0; var1_7 < 360; ++var1_7) {
                SystemClock.sleep((long)250L);
                if (this.q.e()) {
                    SpiderDebug.log((String)"[UC] UCTV token\u6388\u6743\u6210\u529f");
                    this.h = false;
                    return;
                }
                if (!this.i) continue;
                SpiderDebug.log((String)"[UC] UCTV token\u6388\u6743\u5df2\u53d6\u6d88");
                this.h = false;
                return;
            }
            SpiderDebug.log((String)"[UC] UCTV token\u6388\u6743\u8d85\u65f6");
            this.h = false;
            return;
        }
        catch (Throwable var4_5) {}
        this.h = false;
        throw var4_5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String k(String object, String object2, String string, String object3, boolean bl) {
        Exception exception2;
        block20: {
            Object object4;
            String string2 = com.github.catvod.spider.merge.Bk.m.q("download_", string);
            Object object5 = (String[])this.l.get(string2);
            if (object5 != null && System.currentTimeMillis() - Long.parseLong(object5[1]) < 600000L) {
                return object5[0];
            }
            object5 = object4 = (String)this.k.get(string);
            if (object4 == null) {
                object5 = com.github.catvod.spider.merge.xc.O.a.f().c(string);
            }
            object4 = object5;
            if (object5 == null) {
                object4 = this.C((String)object, (String)object2, string, (String)object3, bl);
                if (TextUtils.isEmpty((CharSequence)object4)) {
                    com.github.catvod.spider.merge.Bk.m.o("[UC] \u8f6c\u5b58\u5931\u8d25: fileId=", string);
                    return "";
                }
                this.k.put(string, object4);
                com.github.catvod.spider.merge.xc.O.a.f().h(string, (String)object4);
            }
            if (!TextUtils.isEmpty((CharSequence)this.a)) {
                object = this.a;
            } else {
                object = com.github.catvod.spider.merge.xc.O.a.f().e();
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    this.a = object;
                } else {
                    object = M.j();
                    if (!TextUtils.isEmpty((CharSequence)object)) {
                        this.a = object;
                        com.github.catvod.spider.merge.xc.O.a.f().k((String)object);
                        object = this.a;
                    } else {
                        object = "";
                    }
                }
            }
            object2 = object;
            if (TextUtils.isEmpty((CharSequence)object)) {
                object2 = object = M.j();
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    this.a = object;
                    com.github.catvod.spider.merge.xc.O.a.f().k((String)object);
                    object2 = object;
                }
            }
            if (TextUtils.isEmpty((CharSequence)object2)) {
                SpiderDebug.log((String)"[UC] \u83b7\u53d6\u673a\u5668\u7801\u5931\u8d25");
                return "";
            }
            object = com.github.catvod.spider.merge.Bk.m.q("https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.6&ut=", (String)object2);
            object2 = new HashMap();
            ((HashMap)object2).put("fids", Collections.singletonList(object4));
            object3 = new HashMap();
            ((HashMap)object3).put("Referer", "https://drive.uc.cn");
            ((HashMap)object3).put("Cookie", com.github.catvod.spider.merge.xc.O.a.g());
            ((HashMap)object3).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
            ((HashMap)object3).put("Content-Type", "application/json");
            object2 = (Map)C.L(A.k((String)object, C.Z(object2), (Map)object3).b(), Map.class);
            if (object2 == null) {
                SpiderDebug.log((String)"[UC] \u4e0b\u8f7d\u54cd\u5e94\u89e3\u6790\u5931\u8d25");
                return "";
            }
            int n2 = object2.get("status") != null ? ((Number)object2.get("status")).intValue() : 0;
            object = object2.get("message") != null ? object2.get("message").toString() : "";
            if (((String)object).contains("file not found")) {
                com.github.catvod.spider.merge.Bk.m.o("[UC] \u6587\u4ef6\u4e0d\u5b58\u5728\uff0c\u6e05\u9664\u7f13\u5b58: ", string);
                this.k.remove(string);
                com.github.catvod.spider.merge.xc.O.a.f().h(string, null);
                return "";
            }
            if (n2 != 200) {
                object2 = new StringBuilder("[UC] \u4e0b\u8f7dAPI\u8fd4\u56de\u9519\u8bef: status=");
                ((StringBuilder)object2).append(n2);
                ((StringBuilder)object2).append(", msg=");
                ((StringBuilder)object2).append((String)object);
                SpiderDebug.log((String)((StringBuilder)object2).toString());
                return "";
            }
            if (object2.get("data") == null) return "";
            try {
                object = (List)object2.get("data");
                if (object == null || object.isEmpty() || (object2 = (Map)object.get(0)).get("download_url") == null) return "";
                object = object2.get("format_type");
                bl = object != null && object.toString().toLowerCase().contains("iso");
            }
            catch (Exception exception2) {
                break block20;
            }
            this.m = bl;
            object = object2.get("download_url").toString();
            if (M.s((String)object)) {
                SpiderDebug.log((String)"[UC] \u673a\u5668\u7801\u65e0\u6548\uff0c\u6e05\u9664\u540e\u91cd\u8bd5");
                this.a = "";
                com.github.catvod.spider.merge.xc.O.a.f().b();
                return "";
            }
            this.l.put(string2, new String[]{object, String.valueOf(System.currentTimeMillis())});
            return object;
        }
        com.github.catvod.spider.merge.Bk.m.m(exception2, new StringBuilder("[UC] \u89e3\u6790\u4e0b\u8f7d\u6570\u636e\u5f02\u5e38: "));
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String l(String object, String string, String string2, String string3, String string4) {
        String string5;
        HashMap hashMap;
        block18: {
            block19: {
                Exception exception3;
                block15: {
                    boolean bl;
                    Object object2;
                    block14: {
                        block16: {
                            block17: {
                                Exception exception22;
                                block13: {
                                    block12: {
                                        boolean bl2;
                                        hashMap = this.l;
                                        string5 = com.github.catvod.spider.merge.Bk.m.q("transcode_", string2);
                                        Object object3 = (String[])hashMap.get(string5);
                                        if (object3 != null && System.currentTimeMillis() - Long.parseLong(object3[1]) < 600000L) {
                                            return object3[0];
                                        }
                                        HashMap hashMap2 = this.k;
                                        object3 = object2 = (String)hashMap2.get(string2);
                                        if (object2 == null) {
                                            object3 = com.github.catvod.spider.merge.xc.O.a.f().c(string2);
                                        }
                                        object2 = object3;
                                        if (object3 == null) {
                                            object2 = this.C((String)object, string, string2, string3, false);
                                            if (TextUtils.isEmpty((CharSequence)object2)) {
                                                com.github.catvod.spider.merge.Bk.m.o("[UC] \u667a\u753b\u8f6c\u5b58\u5931\u8d25: fileId=", string2);
                                                return "";
                                            }
                                            hashMap2.put(string2, object2);
                                            com.github.catvod.spider.merge.xc.O.a.f().h(string2, (String)object2);
                                        }
                                        bl = bl2 = com.github.catvod.spider.merge.xc.O.a.f().d().b();
                                        if (!bl2) {
                                            bl = bl2;
                                            if (M.p()) {
                                                bl = this.d();
                                            }
                                        }
                                        if (!bl) break block16;
                                        try {
                                            object = new HashMap();
                                            ((HashMap)object).put("fid", object2);
                                            ((HashMap)object).put("resolutions", "low,normal,high,super,2k,4k");
                                            ((HashMap)object).put("supports", "fmp4_av,m3u8,dolby_vision");
                                            object = (Map)C.L(this.b("file/v2/play/project?pr=UCBrowser&fr=pc&uc_param_str=", Collections.emptyMap(), (Map)object, 0, "POST"), Map.class);
                                            if (object == null || object.get("message") == null || !object.get("message").toString().contains("file not found")) break block12;
                                            hashMap2.remove(string2);
                                        }
                                        catch (Exception exception22) {
                                            break block13;
                                        }
                                    }
                                    string = M.z(string4, (Map)object);
                                    break block17;
                                }
                                com.github.catvod.spider.merge.Bk.m.m(exception22, new StringBuilder("[UC] PC\u8f6c\u7801\u5f02\u5e38: "));
                                string = "";
                            }
                            object = string;
                            if (TextUtils.isEmpty((CharSequence)string)) {
                                SpiderDebug.log((String)"[UC] SVIP PC\u8f6c\u7801\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u6216cookie");
                                object = string;
                            }
                            break block18;
                        }
                        object = this.q;
                        try {
                            if (((S)object).e()) break block14;
                            this.i();
                            if (((S)object).e()) break block14;
                            SpiderDebug.log((String)"[UC] UCTV\u6388\u6743\u672a\u5b8c\u6210\uff0c\u65e0\u6cd5\u83b7\u53d6\u667a\u753b");
                        }
                        catch (Exception exception3) {
                            break block15;
                        }
                    }
                    if (!(bl = TextUtils.isEmpty((CharSequence)(object = ((S)object).i(null, (String)object2, false))))) break block18;
                    break block19;
                }
                com.github.catvod.spider.merge.Bk.m.m(exception3, new StringBuilder("[UC] UCTV\u5f02\u5e38: "));
            }
            object = "";
        }
        if (!TextUtils.isEmpty((CharSequence)object)) {
            hashMap.put(string5, new String[]{object, String.valueOf(System.currentTimeMillis())});
            return object;
        }
        return "";
    }

    public final void n(B object) {
        HashMap hashMap = this.j;
        if (!hashMap.containsKey(((B)object).b)) {
            object = ((B)object).b;
            hashMap.remove(object);
            Object object2 = new StringBuilder("https://pc-api.uc.cn/1/clouddrive/share/sharepage/token?pr=UCBrowser&fr=pc&uc_param_str=&__dt=&__t=");
            ((StringBuilder)object2).append(System.currentTimeMillis());
            String string = ((StringBuilder)object2).toString();
            HashMap hashMap2 = com.github.catvod.spider.merge.Bk.m.k("pwd_id", (String)object, "passcode", "");
            HashMap hashMap3 = com.github.catvod.spider.merge.Bk.m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch", "Referer", "https://drive.uc.cn/");
            hashMap3.put("Content-Type", "application/json");
            object2 = com.github.catvod.spider.merge.xc.O.a.g();
            if (!TextUtils.isEmpty((CharSequence)object2)) {
                hashMap3.put("Cookie", object2);
            }
            if ((object2 = (Map)C.L(A.k(string, C.Z(hashMap2), hashMap3).b(), Map.class)) != null && object2.containsKey("data") && ((Map)object2.get("data")).containsKey("stoken")) {
                hashMap.put(object, (Map)object2.get("data"));
            }
        }
    }

    public final k o(B object) {
        this.n((B)object);
        if (!this.j.containsKey(((B)object).b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.x((B)object, arrayList, new ArrayList(), ((B)object).b, ((B)object).c, 1);
        L.a.getClass();
        object = Collections.singletonList("\u667a");
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList<String> arrayList3 = com.github.catvod.spider.merge.KT.B.j;
        if (((HashSet)((Object)arrayList3)).contains("uc_original")) {
            arrayList2.add("UC\u76f4\u94fe");
        }
        if (((HashSet)((Object)arrayList3)).contains("uc_smart")) {
            arrayList3 = object.iterator();
            while (arrayList3.hasNext()) {
                object = (String)arrayList3.next();
                arrayList2.add("UC\u667a\u80fd");
            }
        }
        arrayList3 = new ArrayList<String>();
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int i2 = 0; i2 < ((com.github.catvod.spider.merge.xc.O.b)arrayList.get((int)(arrayList.size() - 1))).g; ++i2) {
            for (int i4 = 0; i4 < arrayList2.size(); ++i4) {
                ArrayList<String> arrayList4 = new ArrayList<String>();
                for (com.github.catvod.spider.merge.xc.O.b b2 : arrayList) {
                    if (b2.g != i2 + 1) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    object = b2.e.isEmpty() ? "" : b2.e;
                    StringBuilder stringBuilder2 = new StringBuilder("[");
                    stringBuilder2.append(H.i(b2.f));
                    stringBuilder2.append("] ");
                    stringBuilder2.append((String)object);
                    stringBuilder.append(stringBuilder2.toString());
                    stringBuilder.append("$");
                    object = b2.a.isEmpty() ? "" : b2.a;
                    stringBuilder.append((String)object);
                    stringBuilder.append("++");
                    stringBuilder.append(b2.d);
                    stringBuilder.append("++");
                    stringBuilder.append(b2.b);
                    stringBuilder.append("++");
                    stringBuilder.append(b2.c);
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
        ((k)object).g("\u4f18\u89c6\u4e91\u76d8");
        return object;
    }

    /*
     * Exception decompiling
     */
    public final void q() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [4, 3 : 92->137)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void x(B b2, ArrayList arrayList, ArrayList arrayList2, String string, String iterator, Integer arrayList3) {
        int n2;
        Object object;
        int n3 = (Integer)((Object)arrayList3);
        Object object2 = com.github.catvod.spider.merge.Bk.m.i("share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=", string, "&stoken=");
        HashMap hashMap = this.j;
        arrayList3 = (String)((Map)hashMap.get(string)).get("stoken");
        try {
            object = URLEncoder.encode((String)((Object)arrayList3), "UTF-8");
            arrayList3 = object;
        }
        catch (Exception exception) {}
        ((StringBuilder)object2).append((String)((Object)arrayList3));
        ((StringBuilder)object2).append("&pdir_fid=");
        ((StringBuilder)object2).append((String)((Object)iterator));
        ((StringBuilder)object2).append("&force=0&_page=");
        ((StringBuilder)object2).append((Object)n3);
        ((StringBuilder)object2).append("&_size=200&_sort=file_type:asc,file_name:asc");
        arrayList3 = ((StringBuilder)object2).toString();
        Collections.emptyMap();
        object = com.github.catvod.spider.merge.Bk.m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch", "Referer", "https://drive.uc.cn");
        object = (Map)C.L(A.e(com.github.catvod.spider.merge.Bk.m.q("https://pc-api.uc.cn/1/clouddrive/", (String)((Object)arrayList3)), Collections.emptyMap(), (Map)object).b(), Map.class);
        if (object != null && object.get("data") != null) {
            object2 = (List)((Map)object.get("data")).get("list");
            if (object2 == null) {
                Collections.emptyList();
                return;
            }
            arrayList3 = new ArrayList<Map>();
            object2 = object2.iterator();
        } else {
            Collections.emptyList();
            return;
        }
        while (object2.hasNext()) {
            String string2;
            Map map = (Map)object2.next();
            if (M.v(map.get("dir"))) {
                arrayList3.add(map);
                continue;
            }
            if (!M.v(map.get("file")) || (string2 = (String)map.get("file_name")) == null || !string2.contains(".")) continue;
            CharSequence charSequence = com.github.catvod.spider.merge.Bk.m.q(".", string2 = H.h(string2).toLowerCase());
            if (r.contains(charSequence)) {
                arrayList2.add(com.github.catvod.spider.merge.xc.O.b.a(b2.b, map));
                continue;
            }
            charSequence = new StringBuilder(",");
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(",");
            if (!",mp4,mkv,avi,mov,wmv,flv,rmvb,rm,3gp,ts,m2ts,webm,iso,".contains(((StringBuilder)charSequence).toString())) continue;
            map.put("stoken", ((Map)hashMap.get(b2.b)).get("stoken"));
            arrayList.add(com.github.catvod.spider.merge.xc.O.b.a(b2.b, map));
        }
        if ((object = (Map)object.get("metadata")) != null && object.get("_total") != null && (n2 = ((Number)object.get("_total")).intValue()) > 0 && n3 * 200 < n2) {
            this.x(b2, arrayList, arrayList2, string, (String)((Object)iterator), n3 + 1);
        }
        iterator = arrayList3.iterator();
        while (iterator.hasNext()) {
            this.x(b2, arrayList, arrayList2, string, ((Map)iterator.next()).get("fid").toString(), 1);
        }
        return;
    }
}

