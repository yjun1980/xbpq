/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.UY;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.UY.n;
import com.github.catvod.spider.merge.UY.o;
import com.github.catvod.spider.merge.UY.p;
import com.github.catvod.spider.merge.UY.q;
import com.github.catvod.spider.merge.xc.B0.d;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class r {
    public static final Pattern b = Pattern.compile("https?://(?:www\\.)?(?:115\\.com|anxia\\.com|115cdn\\.com)/s/([A-Za-z0-9]+)(?:\\?[^\\s\"']*)?", 2);
    public static final byte[] c = new byte[]{120, 6, -83, 76, 51, -122, 93, 24, 76, 1, 63, 70};
    public static final byte[] d = new byte[]{-115, -91, -91, -115};
    public static final byte[] e = new byte[16];
    public static final byte[] f = new byte[]{-16, -27, 105, -82, -65, -36, -65, -118, 26, 69, -24, -66, 125, -90, 115, -72, -34, -113, -25, -60, 69, -38, -122, -60, -101, 100, -117, 20, 106, -76, -15, -86, 56, 1, 53, -98, 38, 105, 44, -122, 0, 107, 79, -91, 54, 52, 98, -90, 42, -106, 104, 24, -14, 74, -3, -67, 107, -105, -113, 77, -113, -119, 19, -73, 108, -114, -109, -19, 14, 13, 72, 62, -41, 47, -120, -40, -2, -2, 126, -122, 80, -107, 79, -47, -21, -125, 38, 52, -37, 102, 123, -100, 126, -99, 122, -127, 50, -22, -74, 51, -34, 58, -87, 89, 52, 102, 59, -86, -70, -127, 96, 72, -71, -43, -127, -100, -8, 108, -124, 119, -1, 84, 120, 38, 95, -66, -24, 30, 54, -97, 52, -128, 92, 69, 44, -101, 118, -43, 27, -113, -52, -61, -72, -11};
    public static final BigInteger g = new BigInteger("8686980c0f5a24c4b9d43020cd2c22703ff3f450756529058b1cf88f09b8602136477198a6e2683149659bd122c33592fdb5ad47944ad1ea4d36c6b172aad6338c3bb6ac6227502d010993ac967d1aef00f0c8e038de2e4d3bc2ec368af2e9f10a6f1eda4f7262f136420c07c331b871bf139f74f3010e3c4fe57df3afb71683", 16);
    public static final BigInteger h = BigInteger.valueOf(65537L);
    public static final r i = new r();
    public volatile boolean a = false;

    public static HashMap a() {
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Accept", "application/json, text/plain, */*");
        hashMap.put("Referer", "https://115.com/");
        String string = C.y("pan115_cookie");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            hashMap.put("Cookie", string);
        }
        return hashMap;
    }

    public static HashMap b() {
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.k("User-Agent", "Mozilla/5.0 (Linux; Android 13; M2004J7AC Build/UKQ1.231108.001) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1", "Accept", "application/json, text/plain, */*");
        hashMap.put("Origin", "https://115.com");
        hashMap.put("Referer", "https://115.com/");
        String string = C.y("pan115_cookie");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            hashMap.put("Cookie", string);
        }
        return hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JsonArray c(JsonObject jsonObject) {
        try {
            jsonObject = jsonObject.get("list");
            if (jsonObject == null) return new JsonArray();
        }
        catch (Throwable throwable) {
            return new JsonArray();
        }
        if (!jsonObject.isJsonArray()) return new JsonArray();
        return jsonObject.getAsJsonArray();
    }

    public static void d(q object, String string, String string2, ArrayList arrayList, int n2) {
        if (n2 > 8) {
            return;
        }
        int n3 = 0;
        String string3 = string;
        while (true) {
            int n4;
            string = r.e((q)object, string2, n3);
            JsonObject jsonObject = r.j((JsonObject)string, "data");
            if (!r.q((JsonObject)string)) {
                string = r.g((JsonObject)string, "error", "msg", "message");
                object = new StringBuilder("[Pan115] snap failed cid=");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(", offset=");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(", msg=");
                ((StringBuilder)object).append(string);
                SpiderDebug.log((String)((StringBuilder)object).toString());
                object = string;
                if (TextUtils.isEmpty((CharSequence)string)) {
                    object = "115\u5206\u4eab\u89e3\u6790\u5931\u8d25";
                }
                throw new Exception((String)object);
            }
            string = string3;
            if (TextUtils.isEmpty((CharSequence)string3)) {
                string = r.p(r.j(jsonObject, "userinfo"), "user_id");
            }
            string3 = r.c(jsonObject);
            Object object2 = new StringBuilder("[Pan115] snap cid=");
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(", offset=");
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append(", count=");
            try {
                n4 = jsonObject.get("count").getAsInt();
            }
            catch (Throwable throwable) {
                n4 = 0;
            }
            ((StringBuilder)object2).append(n4);
            ((StringBuilder)object2).append(", list=");
            ((StringBuilder)object2).append(string3.size());
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            if (string3.size() == 0) break;
            object2 = string3.iterator();
            while (object2.hasNext()) {
                long l2;
                JsonObject jsonObject2 = ((JsonElement)object2.next()).getAsJsonObject();
                try {
                    n4 = jsonObject2.get("fc").getAsInt();
                }
                catch (Throwable throwable) {
                    n4 = 0;
                }
                String string4 = r.p(jsonObject2, "n");
                if (n4 == 0) {
                    string4 = r.p(jsonObject2, "cid");
                    if (TextUtils.isEmpty((CharSequence)string4)) continue;
                    r.d((q)object, string, string4, arrayList, n2 + 1);
                    continue;
                }
                String string5 = H.h(string4).toLowerCase();
                if (!H.b.contains(string5)) continue;
                string5 = r.p(jsonObject2, "fid");
                try {
                    l2 = jsonObject2.get("s").getAsLong();
                }
                catch (Throwable throwable) {
                    l2 = 0L;
                }
                arrayList.add(new p(string4, ((q)object).a, ((q)object).b, string5, string, l2));
                SpiderDebug.log((String)"[Pan115] media ".concat(string4));
            }
            n4 = n3 + string3.size();
            try {
                n3 = jsonObject.get("count").getAsInt();
            }
            catch (Throwable throwable) {
                n3 = 0;
            }
            if (string3.size() < 100 || n3 > 0 && n4 >= n3) break;
            string3 = string;
            n3 = n4;
        }
    }

    public static JsonObject e(q object, String charSequence, int n2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("share_code", ((q)object).a);
        hashMap.put("receive_code", ((q)object).b);
        hashMap.put("offset", String.valueOf(n2));
        hashMap.put("limit", String.valueOf(100));
        object = "0";
        hashMap.put("asc", "0");
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            object = charSequence;
        }
        hashMap.put("cid", object);
        hashMap.put("format", "json");
        object = C.R(A.o("https://webapi.115.com/share/snap", hashMap, r.a()));
        charSequence = com.github.catvod.spider.merge.Bk.m.i("[Pan115] fetchSnap cid=", (String)charSequence, ", state=");
        ((StringBuilder)charSequence).append(r.q((JsonObject)object));
        ((StringBuilder)charSequence).append(", error=");
        ((StringBuilder)charSequence).append(r.g((JsonObject)object, "error", "msg", "message"));
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        return object;
    }

    public static String f(JsonElement object) {
        block8: {
            Object object2;
            block9: {
                block11: {
                    String string;
                    block10: {
                        object2 = "";
                        if (object == null || object.isJsonNull()) break block8;
                        if (!object.isJsonPrimitive()) break block9;
                        string = object.getAsString();
                        if (string.startsWith("http://")) break block10;
                        object = object2;
                        if (!string.startsWith("https://")) break block11;
                    }
                    object = string;
                }
                return object;
            }
            if (object.isJsonObject()) {
                Object object3 = object.getAsJsonObject();
                for (int i2 = 0; i2 < 4; ++i2) {
                    object2 = r.f(object3.get((new String[]{"file_url_302", "file_url", "download_url", "url"})[i2]));
                    if (TextUtils.isEmpty((CharSequence)object2)) continue;
                    return object2;
                }
                object3 = object3.entrySet().iterator();
                while (object3.hasNext()) {
                    object2 = r.f((JsonElement)((Map.Entry)object3.next()).getValue());
                    if (TextUtils.isEmpty((CharSequence)object2)) continue;
                    return object2;
                }
            }
            if (object.isJsonArray()) {
                object2 = object.getAsJsonArray().iterator();
                while (object2.hasNext()) {
                    object = r.f((JsonElement)object2.next());
                    if (TextUtils.isEmpty((CharSequence)object)) continue;
                    return object;
                }
            }
        }
        return "";
    }

    public static String g(JsonObject jsonObject, String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = r.p(jsonObject, stringArray[i2]);
            if (TextUtils.isEmpty((CharSequence)string)) continue;
            return string;
        }
        return "";
    }

    public static q h(String string) {
        Object object;
        try {
            object = URLDecoder.decode(string, "UTF-8");
        }
        catch (Throwable throwable) {
            object = string == null ? "" : string;
        }
        Object object2 = b.matcher((CharSequence)object);
        if (!((Matcher)object2).find()) {
            object = new StringBuilder("[Pan115] share parse failed: ");
            ((StringBuilder)object).append(string);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return new q("", "", string);
        }
        String string2 = ((Matcher)object2).group(1);
        Object object3 = object2 = r.m((String)object, "password");
        if (TextUtils.isEmpty((CharSequence)object2)) {
            object3 = r.m((String)object, "pwd");
        }
        object2 = object3;
        if (TextUtils.isEmpty((CharSequence)object3)) {
            object2 = r.m((String)object, "receive_code");
        }
        object3 = object2;
        if (TextUtils.isEmpty((CharSequence)object2)) {
            object = Pattern.compile("(?:\u63d0\u53d6\u7801|\u8bbf\u95ee\u7801|\u5bc6\u7801)[:\uff1a\\s]*([A-Za-z0-9]+)").matcher((CharSequence)object);
            object3 = object2;
            if (((Matcher)object).find()) {
                object3 = ((Matcher)object).group(1);
            }
        }
        object = com.github.catvod.spider.merge.Bk.m.i("[Pan115] share code=", string2, ", pwd=");
        ((StringBuilder)object).append(true ^ TextUtils.isEmpty((CharSequence)object3));
        SpiderDebug.log((String)((StringBuilder)object).toString());
        return new q(string2, (String)object3, string);
    }

    /*
     * Unable to fully structure code
     */
    public static k i(q var0) {
        var1_1 = new StringBuilder("[Pan115] getVod start code=");
        var2_2 = var0.a;
        var1_1.append((String)var2_2);
        SpiderDebug.log((String)var1_1.toString());
        var1_1 = r.e((q)var0, "0", 0);
        var3_3 = r.j((JsonObject)var1_1, "data");
        if (r.q((JsonObject)var1_1) && r.c((JsonObject)var3_3).size() != 0) ** GOTO lbl-1000
        var1_1 = r.g((JsonObject)var1_1, new String[]{"error", "msg", "message"});
        var4_4 = new StringBuilder("[Pan115] root snap failed: ");
        var4_4.append((String)var1_1);
        SpiderDebug.log((String)var4_4.toString());
        var4_4 = r.e((q)var0, (String)var2_2, 0);
        var1_1 = r.j((JsonObject)var4_4, "data");
        if (r.q((JsonObject)var4_4) && r.c((JsonObject)var1_1).size() > 0) {
            SpiderDebug.log((String)"[Pan115] root snap fallback cid=share_code");
            var3_3 = var1_1;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = "0";
        }
        var4_4 = r.p(r.j((JsonObject)var3_3, "shareinfo"), "share_title");
        var1_1 = var4_4;
        if (TextUtils.isEmpty((CharSequence)var4_4)) {
            var1_1 = "115\u7f51\u76d8";
        }
        var4_4 = r.p(r.j((JsonObject)var3_3, "userinfo"), "user_id");
        var3_3 = new ArrayList<E>();
        r.d((q)var0, (String)var4_4, (String)var2_2, (ArrayList)var3_3, 0);
        com.github.catvod.spider.merge.xc.B0.d.p((ArrayList)var3_3, com.github.catvod.spider.merge.xc.B0.d.m(new n(), new o(0)));
        var2_2 = new StringBuilder("[Pan115] videos=");
        var2_2.append(var3_3.size());
        var2_2.append(", title=");
        var2_2.append((String)var1_1);
        SpiderDebug.log((String)var2_2.toString());
        var2_2 = new k();
        var2_2.l(var0.c);
        var2_2.m((String)var1_1);
        if (var3_3.isEmpty()) {
            var0 = "\u672a\u627e\u5230\u89c6\u9891";
        } else {
            var0 = new StringBuilder();
            var0.append(var3_3.size());
            var0.append("\u4e2a\u89c6\u9891");
            var0 = var0.toString();
        }
        var2_2.q((String)var0);
        var2_2.j("115\u7f51\u76d8\u5206\u4eab\u8d44\u6e90");
        var2_2.o("115\u7f51\u76d8\u539f\u753b");
        var0 = new ArrayList<E>();
        var3_3 = var3_3.iterator();
        while (var3_3.hasNext()) {
            var1_1 = (p)var3_3.next();
            var4_4 = new StringBuilder();
            var4_4.append(var1_1.a.replace("$", " "));
            var4_4.append("$");
            var5_5 = Locale.US;
            var5_5 = new StringBuilder();
            var5_5.append(var1_1.b);
            var5_5.append("++");
            var5_5.append(var1_1.c);
            var5_5.append("++");
            var5_5.append(var1_1.d);
            var5_5.append("++");
            var5_5.append(var1_1.e);
            var5_5.append("++");
            var5_5.append(var1_1.f);
            var4_4.append(var5_5.toString());
            var0.add(var4_4.toString());
        }
        var2_2.p(TextUtils.join((CharSequence)"#", (Iterable)var0));
        return var2_2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JsonObject j(JsonObject jsonObject, String string) {
        try {
            jsonObject = jsonObject.get(string);
            if (jsonObject == null) return new JsonObject();
        }
        catch (Throwable throwable) {
            return new JsonObject();
        }
        if (!jsonObject.isJsonObject()) return new JsonObject();
        return jsonObject.getAsJsonObject();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String k(String object, String object2) {
        void var0_26;
        String string;
        Object object3;
        Object object4;
        block26: {
            boolean bl;
            block25: {
                void var0_21;
                block22: {
                    void var0_10;
                    void var0_8;
                    HashMap hashMap;
                    String string2;
                    block24: {
                        block23: {
                            object4 = ((String)object).split("\\+\\+", -1);
                            StringBuilder stringBuilder = com.github.catvod.spider.merge.Bk.m.i("[Pan115] player flag=", (String)object3, ", parts=");
                            stringBuilder.append(((String[])object4).length);
                            stringBuilder.append(", cookie=");
                            stringBuilder.append(TextUtils.isEmpty((CharSequence)C.y("pan115_cookie")) ^ true);
                            SpiderDebug.log((String)stringBuilder.toString());
                            if (((String[])object4).length < 4) {
                                return com.github.catvod.spider.merge.MP.g.c("115\u64ad\u653e\u53c2\u6570\u9519\u8bef");
                            }
                            if (!(TextUtils.isEmpty((CharSequence)C.y("pan115_cookie")) ^ true)) {
                                return com.github.catvod.spider.merge.MP.g.c("\u8bf7\u5728\u914d\u7f6e\u4e2d\u5fc3\u586b\u5199115\u7f51\u76d8Cookie");
                            }
                            string = object4[0];
                            String string3 = object4[1];
                            object3 = object4[2];
                            string2 = object4[3];
                            hashMap = com.github.catvod.spider.merge.Bk.m.k("dl", "1", "share_code", string);
                            hashMap.put("file_id", object3);
                            if (!TextUtils.isEmpty((CharSequence)string3)) {
                                hashMap.put("receive_code", string3);
                            }
                            StringBuilder stringBuilder2 = com.github.catvod.spider.merge.Bk.m.i("[Pan115] downurl fileId=", (String)object3, ", cookie=");
                            stringBuilder2.append(TextUtils.isEmpty((CharSequence)C.y("pan115_cookie")) ^ true);
                            SpiderDebug.log((String)stringBuilder2.toString());
                            JsonObject jsonObject = r.l(hashMap);
                            bl = r.q(jsonObject);
                            string = "";
                            if (bl) break block23;
                            object4 = r.g(jsonObject, "error", "msg", "message");
                            object3 = new StringBuilder("[Pan115] app encrypted downurl failed: ");
                            ((StringBuilder)object3).append((String)object4);
                            SpiderDebug.log((String)((StringBuilder)object3).toString());
                            object3 = object4;
                            if (!TextUtils.isEmpty((CharSequence)string2)) {
                                JsonObject jsonObject2;
                                HashMap<String, String> hashMap2 = new HashMap<String, String>(hashMap);
                                hashMap2.put("user_id", string2);
                                JsonObject jsonObject3 = jsonObject2 = r.l(hashMap2);
                                object3 = object4;
                                if (r.q(jsonObject2)) {
                                    SpiderDebug.log((String)"[Pan115] app encrypted downurl ok with user_id");
                                    JsonObject jsonObject4 = jsonObject2;
                                    object3 = object4;
                                }
                            }
                            break block24;
                        }
                        object3 = "";
                    }
                    if (!r.q((JsonObject)var0_8)) {
                        JsonObject jsonObject = C.R(A.o("https://webapi.115.com/share/downurl", hashMap, r.a()));
                    } else {
                        SpiderDebug.log((String)"[Pan115] app encrypted downurl ok");
                    }
                    object4 = var0_10;
                    if (!r.q((JsonObject)var0_10)) {
                        object4 = var0_10;
                        if (!TextUtils.isEmpty((CharSequence)string2)) {
                            HashMap<String, String> hashMap3 = new HashMap<String, String>(hashMap);
                            hashMap3.put("user_id", string2);
                            object4 = C.R(A.o("https://webapi.115.com/share/downurl", hashMap3, r.a()));
                        }
                    }
                    if (!r.q((JsonObject)object4)) {
                        void var0_16;
                        object4 = r.g((JsonObject)object4, "error", "msg", "message");
                        StringBuilder stringBuilder = new StringBuilder("[Pan115] web downurl failed: ");
                        stringBuilder.append((String)object4);
                        SpiderDebug.log((String)stringBuilder.toString());
                        JsonObject jsonObject = object4;
                        if (!TextUtils.isEmpty((CharSequence)object3)) {
                            String string4 = com.github.catvod.spider.merge.Bk.m.g((String)object3, " / ", (String)object4);
                        }
                        object3 = var0_16;
                        if (!TextUtils.isEmpty((CharSequence)var0_16)) throw new Exception((String)object3);
                        object3 = "115\u83b7\u53d6\u4e0b\u8f7d\u5730\u5740\u5931\u8d25";
                        throw new Exception((String)object3);
                    }
                    object3 = r.f((JsonElement)object4);
                    object4 = new StringBuilder("[Pan115] downurl result host=");
                    try {
                        if (TextUtils.isEmpty((CharSequence)object3)) break block22;
                        String string5 = URI.create((String)object3).getHost();
                    }
                    catch (Throwable throwable) {}
                }
                String string6 = "";
                ((StringBuilder)object4).append((String)var0_21);
                SpiderDebug.log((String)((StringBuilder)object4).toString());
                if (TextUtils.isEmpty((CharSequence)object3)) {
                    Exception exception = new Exception("115\u672a\u8fd4\u56de\u4e0b\u8f7d\u5730\u5740");
                    throw exception;
                }
                if (((String)object3).contains("file_url_302") || ((String)object3).contains("/down/")) break block25;
                CharSequence charSequence = object3;
                if (!((String)object3).contains("115.com")) break block26;
            }
            try {
                object4 = A.f((String)object3, r.a());
                bl = TextUtils.isEmpty((CharSequence)object4);
                CharSequence charSequence = object3;
                if (!bl) {
                    Object object5 = object4;
                }
            }
            catch (Throwable throwable) {
                CharSequence charSequence = object3;
            }
        }
        object4 = new StringBuilder("[Pan115] download host=");
        try {
            object3 = TextUtils.isEmpty((CharSequence)var0_26) ? string : URI.create((String)var0_26).getHost();
        }
        catch (Throwable throwable) {
            object3 = string;
        }
        ((StringBuilder)object4).append((String)object3);
        SpiderDebug.log((String)((StringBuilder)object4).toString());
        object3 = r.a();
        ((HashMap)object3).put("Accept", "*/*");
        ((HashMap)object3).put("Connection", "keep-alive");
        return B.y((String)var0_26, (Map)object3, B.p("pan115"), "pan115");
    }

    public static JsonObject l(HashMap hashMap) {
        Object object = new JsonObject();
        for (int i2 = 0; i2 < 2; ++i2) {
            JsonObject jsonObject;
            String string;
            block7: {
                string = (new String[]{"https://proapi.115.com", "http://pro.api.115.com"})[i2];
                jsonObject = new HashMap();
                jsonObject.put("data", r.o(C.Z(hashMap).getBytes(m.m())));
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("/app/share/downurl");
                jsonObject = C.R(A.l(((StringBuilder)object).toString(), jsonObject, r.b()).b());
                object = jsonObject;
                if (!r.q(jsonObject)) break block7;
                String string2 = r.p(jsonObject, "data");
                object = jsonObject;
                try {
                    if (!TextUtils.isEmpty((CharSequence)string2)) {
                        jsonObject.add("data", C.K(r.n(string2)));
                        object = jsonObject;
                    }
                }
                catch (Throwable throwable) {
                    object = new JsonObject();
                    object.addProperty("state", Boolean.FALSE);
                    object.addProperty("message", throwable.getMessage());
                }
            }
            if (r.q((JsonObject)object)) {
                return object;
            }
            jsonObject = com.github.catvod.spider.merge.Bk.m.i("[Pan115] app downurl endpoint failed host=", string, ", msg=");
            jsonObject.append(r.g((JsonObject)object, "error", "msg", "message"));
            SpiderDebug.log((String)jsonObject.toString());
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String m(String object, String string) {
        int n2;
        String[] stringArray;
        int n3;
        block7: {
            n3 = ((String)object).indexOf(63);
            if (n3 >= 0) break block7;
            return "";
        }
        try {
            stringArray = ((String)object).substring(n3 + 1).split("&");
            n2 = stringArray.length;
            n3 = 0;
        }
        catch (Throwable throwable) {
            return "";
        }
        while (n3 < n2) {
            block8: {
                void var1_4;
                String string2 = stringArray[n3];
                int n4 = string2.indexOf(61);
                if (n4 <= 0) break block8;
                if (!var1_4.equalsIgnoreCase(string2.substring(0, n4))) break block8;
                return URLDecoder.decode(string2.substring(n4 + 1), "UTF-8");
            }
            ++n3;
        }
        return "";
    }

    public static String n(String object) {
        int n2;
        Object object2;
        int n3;
        byte[] byArray = Base64.decode((String)object, (int)2);
        Object object3 = new ByteArrayOutputStream();
        int n4 = 0;
        for (n3 = 0; n3 < byArray.length; n3 += 128) {
            object = new BigInteger(1, Arrays.copyOfRange(byArray, n3, Math.min(128, byArray.length - n3) + n3));
            object2 = g;
            object2 = ((BigInteger)object).modPow(h, (BigInteger)object2).toByteArray();
            object = object2;
            if (((byte[])object2).length > 1) {
                object = object2;
                if (object2[0] == 0) {
                    object = Arrays.copyOfRange(object2, 1, ((byte[])object2).length);
                }
            }
            for (n2 = 0; n2 < ((Object)object).length && object[n2] != false; ++n2) {
            }
            if (n2 >= ((Object)object).length) continue;
            ((ByteArrayOutputStream)object3).write((byte[])object, n2 + 1, ((Object)object).length - n2 - 1);
        }
        if (((Object)(object3 = (Object)((ByteArrayOutputStream)object3).toByteArray())).length <= 16) {
            return "";
        }
        object2 = Arrays.copyOfRange((byte[])object3, 0, 16);
        byArray = new byte[12];
        int n5 = 132;
        n2 = 0;
        for (n3 = 0; n3 < 12; ++n3) {
            byte by = object2[n3];
            object = f;
            byArray[n3] = (byte)((by & 0xFF) + (object[n2] & 0xFF) & 0xFF ^ object[n5] & 0xFF);
            n5 -= 12;
            n2 += 12;
        }
        object2 = r.s(Arrays.copyOfRange((byte[])object3, 16, ((Object)object3).length), byArray);
        object = new byte[((byte[])object2).length];
        for (n3 = n4; n3 < ((byte[])object2).length; ++n3) {
            object[n3] = object2[((byte[])object2).length - 1 - n3];
        }
        return new String(r.s((byte[])object, d), m.m());
    }

    public static String o(byte[] object) {
        int n2;
        Object object2 = r.s(object, d);
        object = new byte[((byte[])object2).length];
        for (n2 = 0; n2 < ((byte[])object2).length; ++n2) {
            object[n2] = object2[((byte[])object2).length - 1 - n2];
        }
        object = r.s(object, c);
        object2 = new ByteArrayOutputStream();
        object2.write(e);
        object2.write((byte[])object);
        byte[] byArray = object2.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (n2 = 0; n2 < byArray.length; n2 += 117) {
            int n3 = Math.min(117, byArray.length - n2);
            object = new byte[128];
            object[0] = 0;
            int n4 = 127 - n3;
            Arrays.fill(object, 1, n4, (byte)2);
            object[n4] = 0;
            System.arraycopy(byArray, n2, object, 128 - n3, n3);
            object2 = new BigInteger(1, (byte[])object);
            object = g;
            object2 = object2.modPow(h, (BigInteger)object).toByteArray();
            object = object2;
            if (((byte[])object2).length > 1) {
                object = object2;
                if (object2[0] == 0) {
                    object = Arrays.copyOfRange(object2, 1, ((byte[])object2).length);
                }
            }
            if (((byte[])object).length != 128) {
                object2 = new byte[128];
                System.arraycopy(object, 0, object2, 128 - ((byte[])object).length, ((byte[])object).length);
                object = object2;
            }
            byteArrayOutputStream.write((byte[])object);
        }
        return Base64.encodeToString((byte[])byteArrayOutputStream.toByteArray(), (int)2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String p(JsonObject object, String string) {
        void var0_4;
        String string2;
        block7: {
            JsonElement jsonElement;
            string2 = "";
            try {
                jsonElement = object.get((String)jsonElement);
                String string3 = string2;
                if (jsonElement == null) break block7;
            }
            catch (Throwable throwable) {}
            if (jsonElement.isJsonNull()) {
            }
            String string4 = jsonElement.getAsString();
        }
        return var0_4;
        finally {
            String string5 = string2;
            return var0_4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean q(JsonObject jsonObject) {
        boolean bl;
        block5: {
            bl = false;
            try {
                jsonObject = jsonObject.get("state");
                if (jsonObject != null) break block5;
                return false;
            }
            catch (Throwable throwable) {
                return bl;
            }
        }
        if (jsonObject.getAsJsonPrimitive().isBoolean()) {
            return jsonObject.getAsBoolean();
        }
        int n2 = jsonObject.getAsInt();
        if (n2 != 1) return bl;
        return true;
    }

    public static byte[] s(byte[] byArray, byte[] byArray2) {
        int n2;
        int n3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n4 = byArray.length & 3;
        if (n4 > 0) {
            n3 = 0;
            while (true) {
                n2 = n4;
                if (n3 < n4) {
                    byteArrayOutputStream.write((byArray[n3] ^ byArray2[n3]) & 0xFF);
                    ++n3;
                    continue;
                }
                break;
            }
        } else {
            n2 = 0;
        }
        while (n2 < byArray.length) {
            n4 = Math.min(byArray2.length, byArray.length - n2);
            for (n3 = 0; n3 < n4; ++n3) {
                byteArrayOutputStream.write((byArray[n2 + n3] ^ byArray2[n3]) & 0xFF);
            }
            n2 += n4;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final String r(JsonObject object) {
        String string = r.p(object, "uid");
        Object object2 = r.p(object, "time");
        object = r.p(object, "sign");
        long l2 = System.currentTimeMillis();
        while (!this.a && System.currentTimeMillis() < l2 + 120000L) {
            int n2;
            Object object32 = com.github.catvod.spider.merge.Bk.m.k("uid", string, "time", (String)object2);
            ((HashMap)object32).put("sign", object);
            object32 = r.j(C.R(A.o("https://qrcodeapi.115.com/get/status/", (Map)object32, r.a())), "data");
            try {
                n2 = object32.get("status").getAsInt();
            }
            catch (Throwable throwable) {
                n2 = 0;
            }
            if (n2 == 1) {
                A.m("115\u5df2\u626b\u7801\uff0c\u8bf7\u5728\u624b\u673a\u786e\u8ba4\u767b\u5f55");
            }
            if (n2 == 2) {
                object2 = C.R(A.l("https://passportapi.115.com/app/1.0/android/1.0/login/qrcode/", com.github.catvod.spider.merge.Bk.m.k("app", "android", "account", string), r.a()).b());
                object = r.j(r.j((JsonObject)object2, "data"), "cookie");
                if (object.entrySet().isEmpty()) {
                    object2 = r.g((JsonObject)object2, "error", "msg", "message");
                    object = object2;
                    if (TextUtils.isEmpty((CharSequence)object2)) {
                        object = "115\u626b\u7801\u767b\u5f55\u672a\u8fd4\u56deCookie";
                    }
                    throw new Exception((String)object);
                }
                object2 = new ArrayList();
                for (Object object32 : object.entrySet()) {
                    object = object32.getValue() != null && !((JsonElement)object32.getValue()).isJsonNull() ? ((JsonElement)object32.getValue()).getAsString() : "";
                    if (TextUtils.isEmpty((CharSequence)object)) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object32.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String)object);
                    ((ArrayList)object2).add(stringBuilder.toString());
                }
                return TextUtils.join((CharSequence)"; ", (Iterable)object2);
            }
            if (n2 != -1) {
                if (n2 != -2) {
                    SystemClock.sleep((long)2500L);
                    continue;
                }
                throw new Exception("115\u626b\u7801\u5df2\u53d6\u6d88");
            }
            throw new Exception("115\u4e8c\u7ef4\u7801\u5df2\u8fc7\u671f");
        }
        if (this.a) {
            throw new Exception("115\u626b\u7801\u5df2\u53d6\u6d88");
        }
        object = new Exception("115\u626b\u7801\u767b\u5f55\u8d85\u65f6");
        throw object;
    }
}

