/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.FormBody
 *  okhttp3.FormBody$Builder
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Qiwei$MovieMeta;
import com.github.catvod.spider.Qiwei$PanItem;
import com.github.catvod.spider.merge.G1.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.f1.F;
import com.github.catvod.spider.merge.g1.g;
import com.github.catvod.spider.merge.l0.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

public class Qiwei
extends NetPan {
    public String m = "https://www.qwfun.com";
    public String n = "PHPSESSID=mhru8eqqsqll0odfgtgbua4uug; path=/";
    private final ConcurrentHashMap<String, List<Qiwei$PanItem>> o = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, String> p = new ConcurrentHashMap();

    private boolean A(String string) {
        boolean bl = !TextUtils.isEmpty((CharSequence)string) && string.toLowerCase(Locale.ROOT).startsWith("magnet:");
        return bl;
    }

    private boolean B(String string) {
        boolean bl;
        block6: {
            block8: {
                boolean bl2;
                block7: {
                    bl = TextUtils.isEmpty((CharSequence)string);
                    bl2 = false;
                    if (bl) {
                        return false;
                    }
                    if (string.startsWith("movie###")) {
                        return true;
                    }
                    if (string.startsWith("type###")) {
                        return false;
                    }
                    bl = bl2;
                    if (string.contains("/channel/")) break block6;
                    bl = bl2;
                    if (string.contains("/show/")) break block6;
                    if (!string.contains("/type/")) break block7;
                    bl = bl2;
                    break block6;
                }
                if (string.contains("/v/") || string.contains("/detail/")) break block8;
                bl = bl2;
                if (!string.contains("/voddetail/")) break block6;
            }
            bl = true;
        }
        return bl;
    }

    private boolean C(String string) {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        bl = bl2;
        if (!string.contains("\u9996\u9875")) {
            bl = bl2;
            if (!string.contains("\u7559\u8a00")) {
                bl = bl2;
                if (!string.contains("\u5730\u56fe")) {
                    bl = string.contains("\u6392\u884c\u699c") ? bl2 : false;
                }
            }
        }
        return bl;
    }

    private boolean D(String string) {
        boolean bl = false;
        if (string == null) {
            return false;
        }
        if (com.github.catvod.spider.merge.l0.b.a(string = string.toLowerCase(Locale.ROOT)) || NetPan.isNetPan(string)) {
            bl = true;
        }
        return bl;
    }

    private String E(String string, String string2) {
        com.github.catvod.spider.merge.K.h h2 = new com.github.catvod.spider.merge.K.h();
        h2.l(string2);
        h2.m(string);
        h2.n(this.q("magnet"));
        h2.o("\u78c1\u529b");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("$");
        stringBuilder.append(string2);
        h2.p(stringBuilder.toString());
        return com.github.catvod.spider.merge.K.f.n(h2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Qiwei$MovieMeta F(String string) {
        Qiwei$MovieMeta qiwei$MovieMeta = new Qiwei$MovieMeta();
        String string2 = "";
        if ((string = string == null ? "" : string.trim()).startsWith("movie###")) {
            String[] stringArray = string.substring(8).split(Pattern.quote("###"), 2);
            qiwei$MovieMeta.a = stringArray[0];
            string = string2;
            if (stringArray.length > 1) {
                string = stringArray[1];
            }
        } else {
            if (!string.startsWith("type###")) {
                qiwei$MovieMeta.a = string;
                return qiwei$MovieMeta;
            }
            String[] stringArray = string.split(Pattern.quote("###"), -1);
            string = stringArray.length > 2 ? stringArray[2] : "";
            qiwei$MovieMeta.a = string;
            string = string2;
            if (stringArray.length > 3) {
                string = stringArray[3];
            }
        }
        qiwei$MovieMeta.b = string;
        return qiwei$MovieMeta;
    }

    private String o(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return this.m;
        }
        String string2 = string;
        if (!string.startsWith("http://")) {
            if (string.startsWith("https://")) {
                string2 = string;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.m);
                string2 = "/";
                if (string.startsWith("/")) {
                    string2 = "";
                }
                string2 = r.c(stringBuilder, string2, string);
            }
        }
        return string2;
    }

    private String p(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        return string.replace("\n", " ").replace("\r", " ").replaceAll("\\s+", " ").replace("#", " ").replace("$", " ").trim();
    }

    private String q(String string) {
        String string2 = com.github.catvod.spider.merge.l0.b.g(string);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            return string2;
        }
        if ("magnet".equals(string)) {
            return "https://s1.aigei.com/prevfiles/780e341864ef4bad9ca3b9c94becfff1.png?e=2051020800&token=P7S2Xpzfz11vAkASLTkfHN7Fw-oOZBecqeJaxypL:Bx1EK3evOq8HRK8qfOK8JJzG9cw=";
        }
        return "";
    }

    private List<Qiwei$PanItem> r(String object) {
        String string;
        String[] stringArray;
        int n2;
        int n3;
        Object object2;
        Object object32;
        Object object4 = this.F((String)object);
        object = ((Qiwei$MovieMeta)object4).a;
        if (TextUtils.isEmpty((CharSequence)object)) {
            object = "";
        } else {
            object = object32 = ((String)object).trim();
            if (((String)object32).startsWith(this.m)) {
                object = ((String)object32).substring(this.m.length());
            }
        }
        object32 = this.p.get(object);
        if (!TextUtils.isEmpty((CharSequence)object32)) {
            object = F.d((String)object32, this.o((String)object));
        } else {
            object32 = this.o((String)object);
            object2 = this.t((String)object32);
            if (!TextUtils.isEmpty((CharSequence)object2) && ((String)object2).length() > 200) {
                if (this.p.size() > 50) {
                    this.p.clear();
                }
                this.p.put((String)object, (String)object2);
            }
            object = F.d((String)object2, (String)object32);
        }
        if (TextUtils.isEmpty((CharSequence)((Qiwei$MovieMeta)object4).b)) {
            object32 = ((m)object).n0(".content h1, .content h2, h1, .title, strong");
            object32 = object32 != null && !TextUtils.isEmpty((CharSequence)((m)object32).s0()) ? ((m)object32).s0() : ((h)object).H0();
            ((Qiwei$MovieMeta)object4).b = this.p((String)object32);
        }
        object4 = ((Qiwei$MovieMeta)object4).b;
        ArrayList<Qiwei$PanItem> arrayList = new ArrayList<Qiwei$PanItem>();
        object2 = new HashSet();
        Iterator iterator = ((AbstractCollection)((m)object).m0("a[href]")).iterator();
        while (true) {
            boolean bl = iterator.hasNext();
            n3 = 3;
            n2 = 0;
            if (!bl) break;
            object32 = (m)iterator.next();
            stringArray = ((s)object32).c("href").trim();
            if (TextUtils.isEmpty((CharSequence)stringArray)) continue;
            if (this.A((String)stringArray)) {
                if (!((HashSet)object2).add(stringArray)) continue;
                object32 = new Qiwei$PanItem((String)stringArray, this.p(this.v(new String[]{((s)object32).c("title"), ((m)object32).s0(), object4})), "magnet", this.u((m)object32));
            } else {
                if (!this.D((String)stringArray) && !com.github.catvod.spider.merge.l0.b.a((String)stringArray) || TextUtils.isEmpty((CharSequence)(stringArray = com.github.catvod.spider.merge.l0.b.b((String)stringArray))) || !((HashSet)object2).add(stringArray)) continue;
                string = com.github.catvod.spider.merge.l0.b.j((String)stringArray);
                object32 = new Qiwei$PanItem((String)stringArray, this.p(this.v(new String[]{((s)object32).c("title"), ((m)object32).s0(), object4})), string, this.u((m)object32));
            }
            arrayList.add((Qiwei$PanItem)object32);
        }
        for (Object object32 : ((m)object).m0("[data-url], [data-clipboard-text], [data-link], [data-copy]")) {
            for (int i2 = 0; i2 < 4; ++i2) {
                string = ((s)object32).c((new String[]{"data-url", "data-clipboard-text", "data-link", "data-copy"})[i2]).trim();
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    String string2;
                    if (this.A(string)) {
                        if (((HashSet)object2).add(string)) {
                            stringArray = new String[n3];
                            stringArray[n2] = ((s)object32).c("title");
                            stringArray[1] = ((m)object32).s0();
                            stringArray[2] = object4;
                            arrayList.add(new Qiwei$PanItem(string, this.p(this.v(stringArray)), "magnet", ""));
                        }
                    } else if ((this.D(string) || com.github.catvod.spider.merge.l0.b.a(string)) && !TextUtils.isEmpty((CharSequence)(string2 = com.github.catvod.spider.merge.l0.b.b(string))) && ((HashSet)object2).add(string2)) {
                        string = com.github.catvod.spider.merge.l0.b.j(string2);
                        stringArray = new String[n3];
                        stringArray[0] = ((s)object32).c("title");
                        stringArray[1] = ((m)object32).s0();
                        stringArray[2] = object4;
                        arrayList.add(new Qiwei$PanItem(string2, this.p(this.v(stringArray)), string, ""));
                    }
                }
                n3 = 3;
                n2 = 0;
            }
        }
        object = ((m)object).b0();
        iterator = NetPan.findMatches((String)object, "(https?://(?:www\\.(?:123684|123865|123912|123pan|123592)\\.com|www\\.123pan\\.cn|[\\w-]+\\.(?:share|mshare)\\.(?:123684|123865|123912|123pan|123592)\\.com|[\\w-]+\\.(?:share|mshare)\\.123pan\\.cn)/(?:s|123pan)/[\\w-]+(?:\\?(?:pwd=[\\w]+|\u63d0\u53d6\u7801:[^#\\s]*))?)|https?://(?:(?:www\\.(?:alipan|aliyundrive)\\.com|pan\\.quark\\.cn|drive\\.uc\\.cn)/s/\\w+(?:\\?public=1)?|(?:115|anxia|115cdn)\\.com/s/\\w+\\?password=\\w+#?|caiyun\\.139\\.com/m/i\\?\\w+|caiyun\\.139\\.com/w/i/\\w+|yun\\.139\\.com/shareweb/#/w/i/\\w+|cloud\\.189\\.cn/t/\\w{12}\uff08\u8bbf\u95ee\u7801\uff1a\\w+\uff09|pan\\.baidu\\.com/s/[\\w-]+(?:[?&]pwd=\\w{4})?|cloud\\.189\\.cn/t/\\w{12}|pan\\.xunlei\\.com/s/[^?]+\\?.*?pwd=[^&#]+|www\\.guangyapan\\.com/s/[\\w-]+(?:\\?code=[\\w]+)?(?:#/share/[\\w-]+)?)").iterator();
        while (iterator.hasNext()) {
            object32 = com.github.catvod.spider.merge.l0.b.b((String)iterator.next());
            if (TextUtils.isEmpty((CharSequence)object32) || !((HashSet)object2).add(object32)) continue;
            arrayList.add(new Qiwei$PanItem((String)object32, (String)object4, com.github.catvod.spider.merge.l0.b.j((String)object32), ""));
        }
        object = Pattern.compile("magnet:\\?[^\\s\"'<>]+", 2).matcher((CharSequence)object);
        while (((Matcher)object).find()) {
            object32 = ((Matcher)object).group();
            if (!((HashSet)object2).add(object32)) continue;
            arrayList.add(new Qiwei$PanItem((String)object32, (String)object4, "magnet", ""));
        }
        return arrayList;
    }

    private void s() {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(this.m);
        ((StringBuilder)charSequence).append("/index.php/verify/index.html?");
        charSequence = ((StringBuilder)charSequence).toString();
        Object object = new Request.Builder();
        Request request = object.url((String)charSequence).addHeader("Cookie", this.n).build();
        OkHttpClient okHttpClient = new OkHttpClient();
        object = Qiwei.x(Qiwei.w(okHttpClient, request), okHttpClient);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("ocr Response ocr data: ");
        ((StringBuilder)charSequence).append((String)object);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        charSequence = object;
        if (!com.github.catvod.spider.merge.J0.f.a((String)object)) {
            charSequence = Qiwei.x(Qiwei.w(okHttpClient, request), okHttpClient);
        }
        object = charSequence;
        try {
            if (!com.github.catvod.spider.merge.J0.f.a((String)charSequence)) {
                object = Qiwei.x(Qiwei.w(okHttpClient, request), okHttpClient);
            }
            if (com.github.catvod.spider.merge.J0.f.a((String)object)) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("ocr Response ocr data: ");
                ((StringBuilder)charSequence).append((String)object);
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.m);
                ((StringBuilder)charSequence).append("/index.php/ajax/verify_check?type=search&verify=");
                ((StringBuilder)charSequence).append((String)object);
                charSequence = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)charSequence).toString(), this.getHeader(), null);
                object = new StringBuilder();
                ((StringBuilder)object).append("ocr Response data: ");
                ((StringBuilder)object).append((String)charSequence);
                SpiderDebug.log((String)((StringBuilder)object).toString());
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("ocr error: "));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String searchContent(String object, String object2) {
        int n2;
        if (!TextUtils.isEmpty((CharSequence)object2)) {
            try {
                n2 = Integer.parseInt(((String)object2).trim());
            }
            catch (Throwable throwable) {}
        }
        n2 = 1;
        new ArrayList();
        object2 = object;
        if (object == null) {
            object2 = "";
        }
        try {
            object2 = URLEncoder.encode((String)object2, "UTF-8");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.m);
            stringBuilder.append("/vs/-------------");
            if (n2 > 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("-");
                ((StringBuilder)object).append(n2);
                object = ((StringBuilder)object).toString();
            } else {
                object = "";
            }
            stringBuilder.append((String)object);
            stringBuilder.append(".html?wd=");
            stringBuilder.append((String)object2);
            object = stringBuilder.toString();
            object = this.y(F.d(this.t((String)object), (String)object).m0("dl, .pic-list li, .search-list li, .searchList li"));
            int n3 = ((ArrayList)object).isEmpty() ? n2 : n2 + 1;
            object2 = new f();
            ((f)object2).y((List<com.github.catvod.spider.merge.K.h>)object);
            ((f)object2).k(n2, n3, 30, Integer.MAX_VALUE);
            return ((f)object2).toString();
        }
        catch (Throwable throwable) {
            object = com.github.catvod.spider.merge.C.a.c("[Qiwei] search failed: ");
            ((StringBuilder)object).append(throwable.getMessage());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return "";
        }
    }

    private String t(String charSequence) {
        CharSequence charSequence2;
        String string;
        block5: {
            String string2;
            HashMap<String, List<String>> hashMap;
            string = "";
            try {
                hashMap = new HashMap<String, List<String>>();
                string2 = com.github.catvod.spider.merge.f0.d.l(charSequence, this.getHeader(), hashMap);
                charSequence2 = string2;
            }
            catch (Throwable throwable) {
                charSequence2 = com.github.catvod.spider.merge.C.a.c("[Qiwei] fetchHtml error: ");
                charSequence2.append(throwable.getMessage());
                SpiderDebug.log((String)charSequence2.toString());
                return "";
            }
            if (TextUtils.isEmpty((CharSequence)string2)) break block5;
            charSequence2 = string2;
            if (!string2.contains("\u7cfb\u7edf\u5b89\u5168\u9a8c\u8bc1")) break block5;
            if (hashMap.get("set-cookie") != null && !hashMap.get("set-cookie").isEmpty()) {
                this.n = hashMap.get("set-cookie").get(0);
            }
            this.s();
            charSequence2 = com.github.catvod.spider.merge.f0.d.l(charSequence, this.getHeader(), hashMap);
        }
        charSequence = charSequence2 == null ? string : charSequence2;
        return charSequence;
    }

    private String u(m object) {
        block7: {
            block6: {
                block5: {
                    for (int n2 = 0; !(n2 >= 4 || object == null || "li".equals(((m)object).r0()) || "tr".equals(((m)object).r0()) || "p".equals(((m)object).r0())); object = ((m)object).i0(), ++n2) {
                    }
                    if (object == null) {
                        return "";
                    }
                    m m2 = ((m)object).n0("code.size, .size, .filesize, .badge");
                    if (m2 == null || TextUtils.isEmpty((CharSequence)m2.s0())) break block5;
                    object = m2.s0();
                    break block6;
                }
                if ((object = ((m)object).n0(".create-time, .time, .date")) == null || TextUtils.isEmpty((CharSequence)((m)object).s0())) break block7;
                object = ((m)object).s0();
            }
            return ((String)object).trim();
        }
        return "";
    }

    private String v(String ... stringArray) {
        for (String string : stringArray) {
            if (string == null || string.trim().isEmpty()) continue;
            return string.trim();
        }
        return "";
    }

    private static String w(OkHttpClient object, Request object2) {
        if ((object = object.newCall((Request)object2).execute()).isSuccessful()) {
            int n2;
            object2 = object.body().byteStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object = new byte[4096];
            while ((n2 = ((InputStream)object2).read((byte[])object)) != -1) {
                byteArrayOutputStream.write((byte[])object, 0, n2);
            }
            return Base64.encodeToString((byte[])byteArrayOutputStream.toByteArray(), (int)0);
        }
        object2 = com.github.catvod.spider.merge.C.a.c("Failed to fetch image: ");
        ((StringBuilder)object2).append(object.code());
        throw new IOException(((StringBuilder)object2).toString());
    }

    private static String x(String string, OkHttpClient okHttpClient) {
        FormBody formBody = new FormBody.Builder().add("image", string).add("probability", "false").add("png_fix", "false").build();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ocr Response encodedString data: ");
        stringBuilder.append(string);
        SpiderDebug.log((String)stringBuilder.toString());
        return new JSONObject(okHttpClient.newCall(new Request.Builder().url("https://jianghu2000-ocr.hf.space/ocr").post((RequestBody)formBody).build()).execute().body().string()).getString("data");
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Unable to fully structure code
     */
    private List y(g var1_1) {
        var6_2 = new ArrayList<com.github.catvod.spider.merge.K.h>();
        var7_3 = new HashSet<String>();
        var8_4 = var1_1.iterator();
        while (var8_4.hasNext()) {
            block14: {
                block13: {
                    block12: {
                        block11: {
                            block10: {
                                var11_11 = (m)var8_4.next();
                                var4_7 = var11_11.n0("a");
                                if (var4_7 == null || TextUtils.isEmpty((CharSequence)(var10_10 = var4_7.c("href")))) continue;
                                var3_6 = TextUtils.isEmpty((CharSequence)var10_10);
                                var5_8 = "/";
                                var2_5 = var3_6 || (var1_1 = var10_10.toLowerCase(Locale.ROOT)).equals("/") || var1_1.equals("#") || var1_1.contains("javascript:") || var1_1.contains("user") || var1_1.contains("login") || var1_1.contains("label");
                                if (var2_5) continue;
                                if (!com.github.catvod.spider.merge.R0.e.d(var4_7.c("title"))) break block10;
                                var1_1 = var4_7.c("title");
                                break block11;
                            }
                            var1_1 = "strong";
                            if (var11_11.n0("strong") != null) ** GOTO lbl-1000
                            var1_1 = "h1, h2, h3, h4, .title";
                            if (var11_11.n0("h1, h2, h3, h4, .title") != null) lbl-1000:
                            // 2 sources

                            {
                                var1_1 = var11_11.n0((String)var1_1).s0();
                            } else {
                                var1_1 = var4_7.s0();
                            }
                        }
                        if (TextUtils.isEmpty((CharSequence)(var9_9 = this.p((String)var1_1))) || this.C(var9_9) || !var7_3.add(var10_10 = var10_10.trim())) continue;
                        var1_1 = var11_11.n0(".s1, .remarks, .pic-text, .list-remarks, em");
                        if (var1_1 == null || TextUtils.isEmpty((CharSequence)var1_1.s0())) break block12;
                        var1_1 = var1_1.s0();
                        ** GOTO lbl32
                    }
                    if (!TextUtils.isEmpty((CharSequence)var4_7.s0()) && !var4_7.s0().equals(var9_9)) {
                        var1_1 = var4_7.s0();
lbl32:
                        // 2 sources

                        var4_7 = var1_1.trim();
                    } else {
                        var4_7 = "";
                    }
                    var1_1 = var11_11.n0("img");
                    var1_1 = var1_1 != null ? this.v(new String[]{var1_1.c("data-original"), var1_1.c("data-src"), var1_1.c("src")}) : "";
                    if (TextUtils.isEmpty((CharSequence)var1_1)) break block13;
                    if (!var1_1.startsWith("http")) {
                        var11_11 = new StringBuilder();
                        var11_11.append(this.m);
                        if (var1_1.startsWith("/")) {
                            var5_8 = "";
                        }
                        var1_1 = r.c((StringBuilder)var11_11, var5_8, (String)var1_1);
                    }
                    if (!var1_1.contains("favicon")) break block14;
                }
                var1_1 = "";
            }
            var6_2.add(new com.github.catvod.spider.merge.K.h(com.github.catvod.spider.merge.G1.a.a("movie###", var10_10, "###", var9_9), var9_9, (String)var1_1, (String)var4_7, true));
        }
        return var6_2;
    }

    private Map<String, List<Qiwei$PanItem>> z(List<Qiwei$PanItem> object) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator object22 = ((ArrayList)com.github.catvod.spider.merge.l0.b.c()).iterator();
        while (object22.hasNext()) {
            linkedHashMap.put((String)object22.next(), new ArrayList());
        }
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Qiwei$PanItem qiwei$PanItem = (Qiwei$PanItem)iterator.next();
            object = TextUtils.isEmpty((CharSequence)qiwei$PanItem.c) ? "other" : qiwei$PanItem.c;
            if (!linkedHashMap.containsKey(object)) {
                linkedHashMap.put((String)object, new ArrayList());
            }
            ((List)linkedHashMap.get(object)).add(qiwei$PanItem);
        }
        object = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List)entry.getValue()).isEmpty()) continue;
            object.put((String)entry.getKey(), (List)entry.getValue());
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String var1_1, String var2_8, boolean var3_10, HashMap<String, String> var4_11) {
        block38: {
            var3_10 = TextUtils.isEmpty((CharSequence)var2_8);
            var7_12 = 1;
            if (var3_10) break block38;
            try {
                var5_13 = Integer.parseInt(var2_8.trim());
                ** GOTO lbl10
            }
            catch (Throwable var2_9) {
                ** continue;
            }
        }
lbl8:
        // 2 sources

        while (true) {
            block39: {
                block36: {
                    block40: {
                        block35: {
                            block37: {
                                block34: {
                                    var5_13 = 1;
lbl10:
                                    // 2 sources

                                    var3_10 = TextUtils.isEmpty((CharSequence)var1_1);
                                    var2_8 = "";
                                    if (var3_10 || !var1_1.startsWith("type###")) break block39;
                                    var13_14 = new ArrayList<com.github.catvod.spider.merge.K.h>();
                                    try {
                                        var4_11 = var1_1.split(Pattern.quote("###"), -1);
                                        var6_16 = ((String[])var4_11).length;
                                        if (var6_16 <= 1) break block34;
                                    }
                                    catch (Throwable var1_6) {
                                        var6_16 = 0;
                                        break block35;
                                    }
                                    var11_18 = var4_11[1];
                                    ** GOTO lbl-1000
                                }
                                var11_18 = "";
lbl-1000:
                                // 2 sources

                                {
                                    var6_16 = ((Object)var4_11).length;
                                    var12_20 = var6_16 > 2 ? var4_11[2] : "";
                                }
                                {
                                    var6_16 = ((Object)var4_11).length;
                                    if (var6_16 <= 3) ** GOTO lbl-1000
                                }
                                var2_8 = var4_11[3];
lbl-1000:
                                // 2 sources

                                {
                                    if ((var4_11 = this.o.get(var1_1)) != null && !(var3_10 = var4_11.isEmpty())) ** GOTO lbl46
                                }
                                {
                                    var4_11 = new StringBuilder();
                                    var4_11.append("movie###");
                                    var4_11.append((String)var12_20);
                                    var4_11.append("###");
                                    var4_11.append((String)var2_8);
                                    var4_11 = this.z(this.r(var4_11.toString()));
                                    var3_10 = var4_11.containsKey(var11_18);
                                    var4_11 = var3_10 != false ? (List)((LinkedHashMap)var4_11).get(var11_18) : new ArrayList<E>();
                                }
                                {
                                    this.o.put((String)var1_1, (List<Qiwei$PanItem>)var4_11);
lbl46:
                                    // 2 sources

                                    var7_12 = var4_11.size();
                                }
                                try {
                                    var6_16 = Math.max(1, (var7_12 + 30 - 1) / 30);
                                    var8_22 = var5_13;
                                    if (var5_13 < 1) {
                                        var8_22 = 1;
                                    }
                                    var5_13 = var8_22;
                                    if (var8_22 > var6_16) {
                                        var5_13 = var6_16;
                                    }
                                    var9_23 = (var5_13 - 1) * 30;
                                    var8_22 = var5_13;
                                }
                                catch (Throwable var1_5) {
                                    var6_16 = var7_12;
                                    break block35;
                                }
                                try {
                                    var10_24 = Math.min(var7_12, var9_23 + 30);
                                    var8_22 = var5_13;
                                    var14_25 = com.github.catvod.spider.merge.l0.b.o((String)var11_18);
                                    var8_22 = var5_13;
                                    var15_27 = this.q((String)var11_18);
                                    while (var9_23 < var10_24) {
                                        var8_22 = var5_13;
                                        var16_29 = (Qiwei$PanItem)var4_11.get(var9_23);
                                        var8_22 = var5_13;
                                        if (TextUtils.isEmpty((CharSequence)var16_29.b)) ** GOTO lbl-1000
                                        var8_22 = var5_13;
                                        var1_1 = var16_29.b;
                                        var8_22 = var5_13;
                                        if (TextUtils.isEmpty((CharSequence)var1_1)) ** GOTO lbl-1000
                                        var8_22 = var5_13;
                                        var1_1 = var1_1.trim();
                                        var8_22 = var5_13;
                                        if (var1_1.equals("\u7acb\u5373\u64ad\u653e")) ** GOTO lbl-1000
                                        var8_22 = var5_13;
                                        if (var1_1.equals("\u64ad\u653e")) ** GOTO lbl-1000
                                        var8_22 = var5_13;
                                        if (var1_1.equals("\u4e0b\u8f7d")) ** GOTO lbl-1000
                                        var8_22 = var5_13;
                                        if (var1_1.equals("\u70b9\u51fb\u4e0b\u8f7d")) ** GOTO lbl-1000
                                        var8_22 = var5_13;
                                        if (var1_1.equals("\u78c1\u529b\u4e0b\u8f7d")) ** GOTO lbl-1000
                                        var8_22 = var5_13;
                                        if (!var1_1.startsWith("http")) {
                                            var8_22 = 0;
                                        } else lbl-1000:
                                        // 7 sources

                                        {
                                            var8_22 = 1;
                                        }
                                        if (var8_22 == 0) {
                                            var8_22 = var5_13;
                                            var1_1 = var16_29.b;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var8_22 = var5_13;
                                            var8_22 = var5_13;
                                            var1_1 = new StringBuilder();
                                            var8_22 = var5_13;
                                            var1_1.append((String)var2_8);
                                            var8_22 = var5_13;
                                            var1_1.append(" #");
                                            var8_22 = var5_13;
                                            var1_1.append(var9_23 + 1);
                                            var8_22 = var5_13;
                                            var1_1 = var1_1.toString();
                                        }
                                        var8_22 = var5_13;
                                        var8_22 = var5_13;
                                        var12_20 = new StringBuilder();
                                        var8_22 = var5_13;
                                        var12_20.append(var16_29.a);
                                        var8_22 = var5_13;
                                        var12_20.append("#");
                                        var8_22 = var5_13;
                                        var11_18 = TextUtils.isEmpty((CharSequence)var2_8) == false ? var2_8 : var1_1;
                                        var8_22 = var5_13;
                                        var12_20.append((String)var11_18);
                                        var8_22 = var5_13;
                                        var17_30 = var12_20.toString();
                                        var8_22 = var5_13;
                                        var8_22 = var5_13;
                                        var11_18 = new StringBuilder();
                                        var8_22 = var5_13;
                                        var11_18.append("[");
                                        var8_22 = var5_13;
                                        var11_18.append(var14_25);
                                    }
                                    break block36;
                                }
                                catch (Throwable var1_4) {
                                    var5_13 = var8_22;
                                }
                                {
                                    try {
                                        var11_18.append("] #");
                                    }
                                    catch (Throwable var1_3) {
                                        break block37;
                                    }
                                    {
                                        var11_18.append(++var9_23);
                                        var11_18 = var12_20 = var11_18.toString();
                                        if (!TextUtils.isEmpty((CharSequence)var16_29.d)) {
                                            var11_18 = new StringBuilder();
                                            var11_18.append((String)var12_20);
                                            var11_18.append(" ");
                                            var11_18.append(var16_29.d);
                                            var11_18 = var11_18.toString();
                                        }
                                        var12_20 = new com.github.catvod.spider.merge.K.h(var17_30, (String)var1_1, var15_27, (String)var11_18);
                                        var13_14.add((com.github.catvod.spider.merge.K.h)var12_20);
                                        continue;
                                        break;
                                    }
                                }
                            }
                            var8_22 = var7_12;
                            var7_12 = var6_16;
                            var6_16 = var8_22;
                            break block40;
                        }
                        var7_12 = 1;
                    }
                    var2_8 = com.github.catvod.spider.merge.C.a.c("[Qiwei] typeShareList failed: ");
                    var2_8.append(var1_1.getMessage());
                    SpiderDebug.log((String)var2_8.toString());
                    var8_22 = var7_12;
                    var7_12 = var6_16;
                    var6_16 = var8_22;
                }
                var1_1 = new f();
                var1_1.y(var13_14);
                var1_1.k(var5_13, var6_16, 30, var7_12);
                return var1_1.toString();
            }
            if (!TextUtils.isEmpty((CharSequence)var1_1) && (var1_1.startsWith("movie###") || this.B((String)var1_1))) {
                var2_8 = new ArrayList<E>();
                try {
                    var4_11 = this.F((String)var1_1);
                    for (Object var11_19 : ((LinkedHashMap)this.z(this.r((String)var1_1))).entrySet()) {
                        var12_21 = (String)var11_19.getKey();
                        var13_15 = (List)var11_19.getValue();
                        if (var13_15.isEmpty()) continue;
                        var11_19 = new StringBuilder();
                        var11_19.append("type###");
                        var11_19.append(var12_21);
                        var11_19.append("###");
                        var11_19.append(var4_11.a);
                        var11_19.append("###");
                        var11_19.append(var4_11.b);
                        var11_19 = var11_19.toString();
                        this.o.put((String)var11_19, (List<Qiwei$PanItem>)var13_15);
                        var14_26 = com.github.catvod.spider.merge.l0.b.o(var12_21);
                        var12_21 = this.q(var12_21);
                        var15_28 = new StringBuilder();
                        var15_28.append("[");
                        var15_28.append(var14_26);
                        var15_28.append("] ");
                        var15_28.append(var13_15.size());
                        var15_28.append("\u4e2a\u94fe\u63a5");
                        var14_26 = var15_28.toString();
                        var13_15 = new com.github.catvod.spider.merge.K.h((String)var11_19, var4_11.b, var12_21, var14_26, true);
                        var2_8.add(var13_15);
                    }
                }
                catch (Throwable var1_7) {
                    var4_11 = com.github.catvod.spider.merge.C.a.c("[Qiwei] movieTypeList failed: ");
                    var4_11.append(var1_7.getMessage());
                    SpiderDebug.log((String)var4_11.toString());
                }
                var1_1 = new f();
                var1_1.y((List<com.github.catvod.spider.merge.K.h>)var2_8);
                var1_1.k(1, 1, 0, 1);
                return var1_1.toString();
            }
            var4_11 = var1_1.split("\\.html")[0].replaceAll("-\\d+$", "");
            var1_1 = new StringBuilder();
            var1_1.append(this.m);
            var1_1.append((String)var4_11);
            if (!var4_11.equals("/")) {
                var2_8 = new StringBuilder();
                var2_8.append("-");
                var2_8.append(var5_13);
                var2_8.append(".html");
                var2_8 = var2_8.toString();
            }
            var1_1.append((String)var2_8);
            var1_1 = var1_1.toString();
            var4_11 = F.d(this.t((String)var1_1), (String)var1_1);
            var1_1 = var2_8 = var4_11.m0(".pic-list li");
            if (var2_8.isEmpty()) {
                var1_1 = var4_11.m0(".li-img");
            }
            var6_17 = ((ArrayList)(var2_8 = this.y((g)var1_1))).isEmpty() != false ? var5_13 : var5_13 + 1;
            var1_1 = new f();
            var1_1.y((List<com.github.catvod.spider.merge.K.h>)var2_8);
            var1_1.k(var5_13, var6_17, 30, 0x7FFFFFFF);
            return var1_1.toString();
        }
    }

    public String detailContent(List<String> object) {
        Object object2 = object != null && !object.isEmpty() ? object.get(0).trim() : "";
        if (TextUtils.isEmpty((CharSequence)object2)) {
            return "";
        }
        object = ((String)object2).split("#", 2);
        String string = object[0].trim();
        object = ((String[])object).length > 1 ? object[1].trim() : "";
        if (this.A(string)) {
            object2 = object;
            if (TextUtils.isEmpty((CharSequence)object)) {
                object2 = "\u78c1\u529b\u8d44\u6e90";
            }
            return this.E((String)object2, string);
        }
        if (this.D(string)) {
            object2 = object;
            if (TextUtils.isEmpty((CharSequence)object)) {
                object2 = "\u8d44\u6e90";
            }
            return super.detailContent("", (String)object2, Collections.singletonList(string));
        }
        if ((((String)object2).startsWith("movie###") || this.B((String)object2)) && !((ArrayList)(object2 = (ArrayList)this.r((String)object2))).isEmpty()) {
            object2 = (Qiwei$PanItem)((ArrayList)object2).get(0);
            if (TextUtils.isEmpty((CharSequence)object)) {
                object = ((Qiwei$PanItem)object2).b;
            }
            boolean bl = this.A(((Qiwei$PanItem)object2).a);
            object2 = ((Qiwei$PanItem)object2).a;
            if (bl) {
                return this.E((String)object, (String)object2);
            }
            return super.detailContent("", (String)object, Collections.singletonList(object2));
        }
        return com.github.catvod.spider.merge.K.f.n(new com.github.catvod.spider.merge.K.h("1", "\u65e0\u6548\u8d44\u6e90", ""));
    }

    public HashMap<String, String> getHeader() {
        HashMap hashMap = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.m);
        stringBuilder.append("/");
        hashMap.put("Referer", stringBuilder.toString());
        if (!TextUtils.isEmpty((CharSequence)this.n)) {
            hashMap.put("Cookie", this.n);
        }
        return hashMap;
    }

    public String homeContent(boolean bl) {
        Object object;
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList;
        block38: {
            Object object2;
            Object object3;
            Object object4;
            block37: {
                arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
                object4 = object = new ArrayList<com.github.catvod.spider.merge.K.h>();
                object3 = F.d(this.t(this.m), this.m);
                object4 = object;
                object2 = ((m)object3).m0(".menu_bottom li");
                int n2 = 0;
                while (true) {
                    block36: {
                        object4 = object;
                        if (n2 >= ((AbstractCollection)object2).size()) break;
                        object4 = object;
                        Object object5 = ((m)((AbstractList)object2).get(n2)).n0("a");
                        if (object5 == null) break block36;
                        object4 = object;
                        String string = ((s)object5).c("href");
                        object4 = object;
                        if (!string.startsWith("/")) break block36;
                        object4 = object;
                        String string2 = ((m)object5).s0().trim();
                        object4 = object;
                        if (TextUtils.isEmpty((CharSequence)string2)) break block36;
                        object4 = object;
                        if (this.C(string2)) break block36;
                        object4 = object;
                        object4 = object;
                        object5 = new com.github.catvod.spider.merge.K.a(string, string2, "0");
                        object4 = object;
                        arrayList.add((com.github.catvod.spider.merge.K.a)object5);
                    }
                    ++n2;
                }
                object4 = object;
                if (!arrayList.isEmpty()) break block37;
                object4 = object;
                object4 = object;
                object2 = new com.github.catvod.spider.merge.K.a("/channel/1.html", "\u7535\u5f71");
                object4 = object;
                arrayList.add((com.github.catvod.spider.merge.K.a)object2);
                object4 = object;
                object4 = object;
                object2 = new com.github.catvod.spider.merge.K.a("/channel/2.html", "\u7535\u89c6\u5267");
                object4 = object;
                arrayList.add((com.github.catvod.spider.merge.K.a)object2);
                object4 = object;
                object4 = object;
                object2 = new com.github.catvod.spider.merge.K.a("/channel/3.html", "\u7efc\u827a");
                object4 = object;
                arrayList.add((com.github.catvod.spider.merge.K.a)object2);
                object4 = object;
                object4 = object;
                object2 = new com.github.catvod.spider.merge.K.a("/channel/4.html", "\u52a8\u6f2b");
                object4 = object;
                arrayList.add((com.github.catvod.spider.merge.K.a)object2);
            }
            object4 = object;
            object4 = object3 = this.y(((m)object3).m0(".pic-list li, .li-img, .indexShowBox li"));
            object = object3;
            if (!((ArrayList)object3).isEmpty()) break block38;
            object4 = object3;
            object = object3;
            if (arrayList.isEmpty()) break block38;
            object4 = object3;
            object2 = arrayList.get(0).a();
            object4 = object3;
            object4 = object3;
            object = new StringBuilder();
            object4 = object3;
            ((StringBuilder)object).append(this.m);
            object4 = object3;
            ((StringBuilder)object).append((String)object2);
            object4 = object3;
            try {
                object = this.y(F.d(this.t(((StringBuilder)object).toString()), this.m).m0(".pic-list li, .li-img"));
            }
            catch (Throwable throwable) {
                object3 = com.github.catvod.spider.merge.C.a.c("[Qiwei] homeContent error: ");
                ((StringBuilder)object3).append(throwable.getMessage());
                SpiderDebug.log((String)((StringBuilder)object3).toString());
                object = object4;
            }
        }
        return com.github.catvod.spider.merge.K.f.r(arrayList, object);
    }

    @Override
    public void init(Context object, String string) {
        block7: {
            super.init((Context)object, string);
            this.o.clear();
            this.p.clear();
            if (com.github.catvod.spider.merge.R0.e.d(string)) {
                object = com.github.catvod.spider.merge.J.j.e(string);
                if (object.has("siteUrl") && !object.get("siteUrl").isJsonNull()) {
                    this.m = object.get("siteUrl").getAsString();
                }
                if (object.has("cookie") && !object.get("cookie").isJsonNull()) {
                    this.n = object.get("cookie").getAsString();
                }
            }
            if ((object = this.m) == null) break block7;
            try {
                if (((String)object).endsWith("/")) {
                    object = this.m;
                    this.m = ((String)object).substring(0, ((String)object).length() - 1);
                }
            }
            catch (Throwable throwable) {
                object = com.github.catvod.spider.merge.C.a.c("[Qiwei] init error: ");
                ((StringBuilder)object).append(throwable.getMessage());
                SpiderDebug.log((String)((StringBuilder)object).toString());
            }
        }
    }

    public String playerContent(String object, String string, List<String> list) {
        if (!(this.A(string) || object != null && ((String)object).contains("\u78c1\u529b"))) {
            return super.playerContent((String)object, string, list);
        }
        object = new f();
        ((f)object).w(string);
        return ((f)object).toString();
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, "1");
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.searchContent(string, string2);
    }
}

