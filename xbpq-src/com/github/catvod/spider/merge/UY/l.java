/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.UY;

import android.os.SystemClock;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.j;
import com.github.catvod.spider.merge.UY.k;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l {
    public static final String[] b = new String[]{".mp4", ".mkv", ".webm", ".avi", ".wmv", ".flv", ".mov", ".mpeg", ".mpg", ".m4v", ".ts", ".m2ts", ".3gp", ".rm", ".rmvb", ".iso"};
    public static final l c = new l();
    public volatile boolean a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long A(JsonObject jsonObject) {
        String string = "fileSize";
        long l2 = 0L;
        try {
            if (!jsonObject.has("fileSize")) {
                string = "size";
            }
            jsonObject = jsonObject.get(string);
            long l3 = l2;
            if (jsonObject == null) return l3;
            if (jsonObject.isJsonNull()) return l2;
            return jsonObject.getAsLong();
        }
        catch (Throwable throwable) {
            return l2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String B(JsonObject object, String string) {
        JsonElement jsonElement;
        try {
            void var1_4;
            jsonElement = object.get((String)var1_4);
            if (jsonElement == null) return "";
        }
        catch (Throwable throwable) {
            return "";
        }
        if (!jsonElement.isJsonNull()) return jsonElement.getAsString();
        return "";
    }

    public static boolean C(JsonObject object) {
        int n2 = l.s((JsonObject)object, "code");
        int n3 = l.s((JsonObject)object, "_http_status");
        object = l.j((JsonObject)object, "").toLowerCase(Locale.ROOT);
        boolean bl = n3 == 401 || n3 == 403 || n2 == 117 || n2 == 401 || n2 == 403 || ((String)object).contains("token expired") || ((String)object).contains("unauthorized") || ((String)object).contains("\u65e0\u6548token");
        return bl;
    }

    public static String D(String string) {
        string = string == null ? "" : string.trim();
        return string;
    }

    public static void F(String object) {
        long l2 = System.currentTimeMillis();
        Exception exception = null;
        while (System.currentTimeMillis() < l2 + 120000L) {
            block6: {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("taskId", (String)object);
                jsonObject = l.f(jsonObject, "/userres/v1/get_task_status");
                JsonObject jsonObject2 = l.x(jsonObject, "data");
                int n2 = l.s(jsonObject2, "status");
                if (n2 == 2) {
                    return;
                }
                if (n2 != 3) break block6;
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("restore task failed: ");
                    stringBuilder.append(l.j(l.x(jsonObject2, "detail"), l.j(jsonObject, "")));
                    exception = new Exception(stringBuilder.toString());
                    throw exception;
                }
                catch (Exception exception2) {
                    // empty catch block
                }
            }
            SystemClock.sleep((long)1000L);
        }
        if (exception != null) {
            throw exception;
        }
        object = new Exception("restore task timeout");
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(String object) {
        object = l.D((String)object);
        Matcher matcher = Pattern.compile("(?i)S\\d{1,2}E(\\d{1,4})").matcher((CharSequence)object);
        boolean bl = matcher.find();
        int n2 = 0x3FFFFFFF;
        if (bl) {
            object = matcher.group(1);
            return Integer.parseInt((String)object);
        }
        matcher = Pattern.compile("(?i)(?:^|[^a-z0-9])E(?:P)?\\.?\\s*(\\d{1,4})(?=$|[^a-z0-9])").matcher((CharSequence)object);
        if (matcher.find()) {
            object = matcher.group(1);
            return Integer.parseInt((String)object);
        }
        object = Pattern.compile("(?:^|\\D)(\\d{1,4})(?:\\D*)$").matcher((CharSequence)object);
        int n3 = n2;
        if (!((Matcher)object).find()) return n3;
        object = ((Matcher)object).group(1);
        try {
            return Integer.parseInt((String)object);
        }
        catch (Throwable throwable) {
            return n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JsonArray b(JsonObject jsonObject) {
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

    public static HashMap c(String string) {
        HashMap hashMap = m.k("Accept", "application/json, text/plain, */*", "Content-Type", "application/json");
        hashMap.put("X-Client-Id", "aMe-8VSlkrbQXpUR");
        hashMap.put("X-Client-Version", "0.0.1");
        hashMap.put("X-Device-Id", string);
        hashMap.put("X-Device-Model", "chrome%2F147.0.0.0");
        hashMap.put("X-Device-Name", "PC-Chrome");
        StringBuilder stringBuilder = new StringBuilder("wdi10.");
        stringBuilder.append(string);
        stringBuilder.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        hashMap.put("X-Device-Sign", stringBuilder.toString());
        hashMap.put("X-Net-Work-Type", "NONE");
        hashMap.put("X-OS-Version", "Win32");
        hashMap.put("X-Platform-Version", "1");
        hashMap.put("X-Protocol-Version", "301");
        hashMap.put("X-Provider-Name", "NONE");
        hashMap.put("X-SDK-Version", "9.0.2");
        return hashMap;
    }

    public static HashMap d(String string) {
        HashMap hashMap = m.k("Accept", "application/json, text/plain, */*", "Content-Type", "application/json");
        hashMap.put("Did", l.o());
        hashMap.put("Dt", "4");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            StringBuilder stringBuilder = new StringBuilder("Bearer ");
            stringBuilder.append(string);
            hashMap.put("Authorization", stringBuilder.toString());
        }
        return hashMap;
    }

    public static JsonObject e(JsonObject jsonObject, String string, String object) {
        object = A.k("https://api.guangyapan.com".concat(string), jsonObject.toString(), l.d((String)object));
        jsonObject = C.R(((X)object).b());
        int n2 = ((X)object).a;
        jsonObject.addProperty("_http_status", (Number)n2);
        object = new StringBuilder("[GuangYa] ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" http=");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", code=");
        ((StringBuilder)object).append(l.s(jsonObject, "code"));
        ((StringBuilder)object).append(", msg=");
        ((StringBuilder)object).append(l.j(jsonObject, ""));
        SpiderDebug.log((String)((StringBuilder)object).toString());
        return jsonObject;
    }

    public static JsonObject f(JsonObject jsonObject, String string) {
        JsonObject jsonObject2 = l.e(jsonObject, string, l.m(false));
        if (!l.C(jsonObject2)) {
            return jsonObject2;
        }
        return l.e(jsonObject, string, l.m(true));
    }

    public static JsonObject g(JsonObject jsonObject, String string, String object) {
        object = A.k("https://api.guangyapan.com".concat(string), jsonObject.toString(), l.d((String)object));
        jsonObject = C.R(((X)object).b());
        int n2 = ((X)object).a;
        jsonObject.addProperty("_http_status", (Number)n2);
        object = new StringBuilder("[GuangYa] share ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" http=");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", code=");
        ((StringBuilder)object).append(l.s(jsonObject, "code"));
        ((StringBuilder)object).append(", msg=");
        ((StringBuilder)object).append(l.j(jsonObject, ""));
        SpiderDebug.log((String)((StringBuilder)object).toString());
        return jsonObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(String charSequence, String charSequence2, ArrayList arrayList, int n2) {
        if (n2 > 6) {
            return;
        }
        Object object = new ArrayList();
        Comparable<Integer> comparable = 0;
        int n3 = Integer.MAX_VALUE;
        Object object2 = "";
        int n4 = 0;
        while (n4 < n3) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("accessToken", (String)charSequence);
            jsonObject.addProperty("pageSize", (Number)200);
            jsonObject.addProperty("orderBy", (Number)((Object)comparable));
            jsonObject.addProperty("sortType", (Number)((Object)comparable));
            jsonObject.addProperty("parentId", l.D((String)charSequence2));
            if (!TextUtils.isEmpty((CharSequence)object2)) {
                jsonObject.addProperty("cursor", (String)object2);
            }
            if ((n3 = l.s((JsonObject)(object2 = l.g(jsonObject, "/userres/v1/get_share_page_files_list", "")), "_http_status")) >= 200 && n3 < 300 && l.s((JsonObject)object2, "code") == 0) {
                int n5;
                object2 = l.x((JsonObject)object2, "data");
                jsonObject = l.b((JsonObject)object2);
                n3 = n5 = l.s((JsonObject)object2, "total");
                if (n5 <= 0) {
                    n3 = jsonObject.size() + n4;
                }
                for (Object object3 : jsonObject) {
                    if (object3 == null || !object3.isJsonObject()) continue;
                    JsonObject jsonObject2 = object3.getAsJsonObject();
                    String string = l.l(jsonObject2, "fileName", "name");
                    object3 = l.l(jsonObject2, "fileId", "id");
                    if (TextUtils.isEmpty((CharSequence)object3)) continue;
                    if (l.s(jsonObject2, "resType") == 2) {
                        ((ArrayList)object).add(new k(l.A(jsonObject2), (String)object3, string, true));
                        continue;
                    }
                    if (!l.u(jsonObject2)) continue;
                    ((ArrayList)object).add(new k(l.A(jsonObject2), (String)object3, string, false));
                }
                object2 = l.l((JsonObject)object2, "cursor", "nextCursor");
                if (jsonObject.size() != 0 && !TextUtils.isEmpty((CharSequence)object2) && (n4 += jsonObject.size()) < n3) continue;
                break;
            }
            if (((ArrayList)object).isEmpty() && n4 <= 0) {
                charSequence2 = new StringBuilder("share file list failed: ");
                charSequence = new StringBuilder("status=");
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence2).append(l.j((JsonObject)object2, ((StringBuilder)charSequence).toString()));
                throw new Exception(((StringBuilder)charSequence2).toString());
            }
            charSequence2 = new StringBuilder("[GuangYa] partial share file list: ");
            comparable = new StringBuilder("status=");
            ((StringBuilder)comparable).append(n3);
            ((StringBuilder)charSequence2).append(l.j((JsonObject)object2, ((StringBuilder)comparable).toString()));
            SpiderDebug.log((String)((StringBuilder)charSequence2).toString());
            break;
        }
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            object2 = (k)object.next();
            if (((k)object2).c) {
                block15: {
                    try {
                        charSequence2 = ((k)object2).a;
                    }
                    catch (Exception exception) {
                        // empty catch block
                        break block15;
                    }
                    try {
                        l.h((String)charSequence, (String)charSequence2, arrayList, n2 + 1);
                        continue;
                    }
                    catch (Exception exception) {}
                }
                comparable = new StringBuilder("[GuangYa] skip share folder ");
                ((StringBuilder)comparable).append(((k)object2).b);
                ((StringBuilder)comparable).append(": ");
                ((StringBuilder)comparable).append(((Throwable)((Object)charSequence2)).getMessage());
                SpiderDebug.log((String)((StringBuilder)comparable).toString());
                continue;
            }
            arrayList.add(object2);
        }
        return;
    }

    public static String i(String object) {
        object = l.w(l.w((String)object));
        object = Pattern.compile("guangyapan\\.com/s/([^/?#&]+)").matcher((CharSequence)object);
        object = ((Matcher)object).find() ? ((Matcher)object).group(1) : "";
        if (TextUtils.isEmpty((CharSequence)object)) {
            return "";
        }
        Object object2 = new JsonObject();
        object2.addProperty("shareId", (String)object);
        object2 = l.g(object2, "/userres/v1/get_share_summary", "");
        int n2 = l.s(object2, "code");
        if (n2 != 201 && n2 != 200) {
            if (n2 != 202) {
                if ((object2 = l.x(object2, "data")).has("needCode") && object2.get("needCode").getAsBoolean()) {
                    throw new Exception("share code required");
                }
                object2 = l.p((String)object);
                if (!TextUtils.isEmpty((CharSequence)object2)) {
                    ArrayList arrayList = new ArrayList();
                    l.h((String)object2, "", arrayList, 0);
                    Collections.sort(arrayList, new j());
                    ArrayList<String> arrayList2 = new ArrayList<String>();
                    for (n2 = 0; n2 < arrayList.size(); ++n2) {
                        k k2 = (k)arrayList.get(n2);
                        boolean bl = TextUtils.isEmpty((CharSequence)k2.b);
                        String string = k2.b;
                        object2 = bl ? String.format(Locale.getDefault(), "%02d", n2 + 1) : string;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)object2);
                        stringBuilder.append("$share*");
                        stringBuilder.append((String)object);
                        stringBuilder.append("*");
                        stringBuilder.append(k2.a);
                        stringBuilder.append("*");
                        try {
                            object2 = URLEncoder.encode(l.D(string), "UTF-8");
                        }
                        catch (Throwable throwable) {
                            object2 = "";
                        }
                        stringBuilder.append((String)object2);
                        arrayList2.add(stringBuilder.toString());
                    }
                    object = m.i("[GuangYa] share ", (String)object, " videos=");
                    ((StringBuilder)object).append(arrayList2.size());
                    SpiderDebug.log((String)((StringBuilder)object).toString());
                    return TextUtils.join((CharSequence)"#", arrayList2);
                }
                throw new Exception("empty share access token");
            }
            throw new Exception("expired share");
        }
        object = new Exception("invalid share");
        throw object;
    }

    public static String j(JsonObject object, String string) {
        block0: {
            if (!TextUtils.isEmpty((CharSequence)(object = l.l(object, new String[]{"msg", "message", "error_description", "error"})))) break block0;
            object = string;
        }
        return object;
    }

    public static String k(String string, String object) {
        String string2 = l.D((String)object);
        for (int i2 = 0; i2 < 6; ++i2) {
            for (k k2 : l.v(string)) {
                if (k2.c || !string2.equals(k2.b) && !TextUtils.isEmpty((CharSequence)string2)) continue;
                return k2.a;
            }
            SystemClock.sleep((long)1000L);
        }
        return "";
    }

    public static String l(JsonObject jsonObject, String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = l.B(jsonObject, stringArray[i2]);
            if (TextUtils.isEmpty((CharSequence)string)) continue;
            return string;
        }
        return "";
    }

    public static String m(boolean bl) {
        String string = bl ? "" : C.y("guangya_access_token");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        string = C.y("guangya_refresh_token");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            Object object = new JsonObject();
            object.addProperty("client_id", "aMe-8VSlkrbQXpUR");
            object.addProperty("grant_type", "refresh_token");
            object.addProperty("refresh_token", string);
            string = C.R(A.k("https://account.guangyapan.com/v1/auth/token", object.toString(), l.c(l.o())).b());
            String string2 = l.l((JsonObject)string, "access_token", "accessToken");
            object = l.l((JsonObject)string, "refresh_token", "refreshToken");
            if (TextUtils.isEmpty((CharSequence)string2)) {
                object = l.B((JsonObject)string, "error").toLowerCase(Locale.ROOT);
                if (!"expired_token".equals(object) && !"invalid_grant".equals(object)) {
                    object = new StringBuilder("\u5237\u65b0\u5149\u9e2d\u767b\u5f55\u5931\u8d25\uff1a");
                    ((StringBuilder)object).append(l.j((JsonObject)string, "\u8bf7\u7a0d\u540e\u91cd\u8bd5"));
                    throw new Exception(((StringBuilder)object).toString());
                }
                C.N("", "guangya_access_token");
                C.N("", "guangya_refresh_token");
                throw new Exception("\u5149\u9e2d\u767b\u5f55\u5df2\u8fc7\u671f\uff0c\u8bf7\u5728\u8bbe\u7f6e\u4e2d\u5fc3\u91cd\u65b0\u626b\u7801\u6216\u586b\u5199\u6388\u6743");
            }
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                C.N(string2, "guangya_access_token");
            }
            if (!TextUtils.isEmpty((CharSequence)object)) {
                C.N(object, "guangya_refresh_token");
            }
            return string2;
        }
        throw new Exception("\u8bf7\u5148\u5728\u8bbe\u7f6e\u4e2d\u5fc3\u767b\u5f55\u5149\u9e2d\u7f51\u76d8");
    }

    public static String n(String string) {
        Object object = new JsonObject();
        object.addProperty("fileId", l.D(string));
        string = l.f((JsonObject)object, "/nd.bizuserres.s/v1/get_res_download_url");
        int n2 = l.s((JsonObject)string, "_http_status");
        object = l.l(l.x((JsonObject)string, "data"), "signedURL", "downloadUrl", "url");
        if (TextUtils.isEmpty((CharSequence)object) && (n2 < 200 || n2 >= 300)) {
            StringBuilder stringBuilder = new StringBuilder("\u83b7\u53d6\u5149\u9e2d\u4e0b\u8f7d\u5730\u5740\u5931\u8d25\uff1a");
            object = new StringBuilder("status=");
            ((StringBuilder)object).append(n2);
            stringBuilder.append(l.j((JsonObject)string, ((StringBuilder)object).toString()));
            throw new Exception(stringBuilder.toString());
        }
        return object;
    }

    public static String o() {
        Object object;
        Object object2 = object = l.D(C.y("guangya_device_id")).toLowerCase(Locale.ROOT);
        if (((String)object).startsWith("wdi10.")) {
            object2 = ((String)object).substring(6);
        }
        object = "";
        CharSequence charSequence = ((String)object2).replaceAll("x+$", "").replaceAll("[^0-9a-f]", "");
        object2 = object;
        if (((String)charSequence).length() == 32) {
            object2 = charSequence;
        }
        if (!TextUtils.isEmpty((CharSequence)object2)) {
            return object2;
        }
        object2 = new byte[16];
        object = new SecureRandom();
        ((SecureRandom)object).nextBytes((byte[])object2);
        charSequence = new StringBuilder(32);
        for (int i2 = 0; i2 < 16; ++i2) {
            object = Integer.toHexString(object2[i2] & 0xFF);
            if (((String)object).length() == 1) {
                ((StringBuilder)charSequence).append('0');
            }
            ((StringBuilder)charSequence).append((String)object);
            continue;
        }
        try {
            object2 = ((StringBuilder)charSequence).toString();
        }
        catch (Throwable throwable) {
            object2 = "0123456789abcdef0123456789abcdef";
        }
        C.N(object2, "guangya_device_id");
        return object2;
    }

    public static String p(String string) {
        Object object = new JsonObject();
        object.addProperty("shareId", string);
        object.addProperty("code", "");
        string = l.g((JsonObject)object, "/userres/v1/get_share_access_token", "");
        int n2 = l.s((JsonObject)string, "_http_status");
        object = l.l(l.x((JsonObject)string, "data"), "accessToken", "access_token");
        if (TextUtils.isEmpty((CharSequence)object) && (n2 < 200 || n2 >= 300 || l.s((JsonObject)string, "code") != 0)) {
            StringBuilder stringBuilder = new StringBuilder("share access token failed: ");
            object = new StringBuilder("status=");
            ((StringBuilder)object).append(n2);
            stringBuilder.append(l.j((JsonObject)string, ((StringBuilder)object).toString()));
            throw new Exception(stringBuilder.toString());
        }
        return object;
    }

    public static com.github.catvod.spider.merge.MP.k q(String string) {
        String string2;
        com.github.catvod.spider.merge.MP.k k2 = new com.github.catvod.spider.merge.MP.k();
        try {
            string2 = l.i(string);
        }
        catch (Throwable throwable) {
            m.p(throwable, new StringBuilder("[GuangYa] share vod failed: "));
            string2 = "";
        }
        k2.l(string);
        k2.m("\u5149\u9e2d\u5206\u4eab\u8d44\u6e90");
        k2.n("https://d.kstore.dev/download/6741/jar/png/GY.png");
        k2.q("\u5149\u9e2d\u7f51\u76d8");
        k2.j(string);
        k2.o("\u5149\u9e2d\u7f51\u76d8");
        k2.p("\u7acb\u5373\u64ad\u653e$".concat(string));
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            k2.p(string2);
        } else {
            k2.p("\u7acb\u5373\u64ad\u653e$".concat(l.w(string)));
        }
        return k2;
    }

    public static boolean r() {
        boolean bl = !TextUtils.isEmpty((CharSequence)C.y("guangya_refresh_token")) || !TextUtils.isEmpty((CharSequence)C.y("guangya_access_token"));
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int s(JsonObject jsonObject, String string) {
        int n2;
        int n3 = 0;
        try {
            jsonObject = jsonObject.get(string);
            n2 = n3;
            if (jsonObject == null) return n2;
        }
        catch (Throwable throwable) {}
        if (jsonObject.isJsonNull()) {
        }
        n2 = jsonObject.getAsInt();
        return n2;
        finally {
            return n3;
        }
    }

    public static boolean t(String string) {
        boolean bl = (string = l.D(string).toLowerCase(Locale.ROOT)).contains("guangyapan.com/s/") || string.contains("guangya.qsxy.top") && string.contains("golink=");
        return bl;
    }

    public static boolean u(JsonObject stringArray) {
        Object object;
        if (l.s((JsonObject)stringArray, "resType") != 1) {
            return false;
        }
        if (l.s((JsonObject)stringArray, "fileType") == 2) {
            return true;
        }
        String string = l.l((JsonObject)stringArray, "mineType", "mimeType");
        if (string.toLowerCase((Locale)(object = Locale.ROOT)).startsWith("video/")) {
            return true;
        }
        string = l.B((JsonObject)stringArray, "ext").toLowerCase((Locale)object);
        String string2 = l.l((JsonObject)stringArray, "fileName", "name").toLowerCase((Locale)object);
        stringArray = b;
        for (int i2 = 0; i2 < 16; ++i2) {
            object = stringArray[i2];
            if (!((String)object).equals(string) && !string2.endsWith((String)object)) {
                continue;
            }
            return true;
        }
        return false;
    }

    public static ArrayList v(String object) {
        Object object2 = new JsonObject();
        object2.addProperty("parentId", l.D((String)object));
        object2.addProperty("pageSize", (Number)200);
        object2.addProperty("orderBy", (Number)3);
        object2.addProperty("sortType", (Number)1);
        object2.add("fileTypes", (JsonElement)new JsonArray());
        object2 = l.f((JsonObject)object2, "/nd.bizuserres.s/v1/file/get_file_list");
        int n2 = l.s((JsonObject)object2, "_http_status");
        if (n2 >= 200 && n2 < 300) {
            object2 = l.b(l.x((JsonObject)object2, "data"));
            object = new ArrayList();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object object3 = (JsonElement)object2.next();
                if (object3 == null || !object3.isJsonObject()) continue;
                JsonObject jsonObject = object3.getAsJsonObject();
                object3 = l.l(jsonObject, "fileName", "name");
                String string = l.l(jsonObject, "fileId", "id");
                if (TextUtils.isEmpty((CharSequence)string)) continue;
                if (l.s(jsonObject, "resType") == 2) {
                    ((ArrayList)object).add(new k(l.A(jsonObject), string, (String)object3, true));
                    continue;
                }
                if (!l.u(jsonObject)) continue;
                ((ArrayList)object).add(new k(l.A(jsonObject), string, (String)object3, false));
            }
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder("\u83b7\u53d6\u5149\u9e2d\u76ee\u5f55\u5931\u8d25\uff1a");
        object = new StringBuilder("status=");
        ((StringBuilder)object).append(n2);
        stringBuilder.append(l.j((JsonObject)object2, ((StringBuilder)object).toString()));
        object = new Exception(stringBuilder.toString());
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String w(String string) {
        Matcher matcher;
        String string2;
        string = string2 = string.trim();
        if (!string2.contains("guangya.qsxy.top")) return string;
        string = string2;
        if (!string2.contains("golink=")) return string;
        try {
            matcher = Pattern.compile("[?&]golink=([^&]+)").matcher(string2);
            string = string2;
        }
        catch (Throwable throwable) {
            return string2;
        }
        if (!matcher.find()) return string;
        return H.b(URLDecoder.decode(matcher.group(1), "UTF-8"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JsonObject x(JsonObject jsonObject, String string) {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String y(String var0) {
        block32: {
            block30: {
                block31: {
                    block35: {
                        block29: {
                            block34: {
                                block33: {
                                    var4_3 = var0;
                                    var3_4 = var4_3.startsWith("share*");
                                    var5_5 = "*/*";
                                    if (!var3_4) break block33;
                                    if (((String[])(var4_3 = var4_3.split("\\*", -1))).length < 3) {
                                        return g.c("\u5149\u9e2d\u5206\u4eab\u64ad\u653e\u53c2\u6570\u9519\u8bef");
                                    }
                                    if (!l.r()) {
                                        return g.c("\u8bf7\u5728\u8bbe\u7f6e\u4e2d\u5fc3\u5b8c\u6210\u5149\u9e2d\u7f51\u76d8\u6388\u6743");
                                    }
                                    if (((String[])var4_3).length < 4) break block34;
                                    var0 = var4_3[3];
                                    try {
                                        var0 = URLDecoder.decode(l.D((String)var0), "UTF-8");
                                        break block29;
                                    }
                                    catch (Throwable var0_1) {}
                                }
                                var0 = var4_3;
                                if (var4_3.startsWith("own*")) {
                                    var0 = var4_3.substring(4);
                                }
                                var4_3 = var0;
                                if (var0.contains("@@@")) {
                                    var0 = var0.split("@@@", -1);
                                    var4_3 = var0 = var0[((Object)var0).length - 1];
                                    if (var0.startsWith("own*")) {
                                        var4_3 = var0.substring(4);
                                    }
                                }
                                if (TextUtils.isEmpty((CharSequence)var4_3)) {
                                    return g.c("\u5149\u9e2d\u64ad\u653e\u53c2\u6570\u9519\u8bef");
                                }
                                if (!l.r()) {
                                    return g.c("\u8bf7\u5728\u8bbe\u7f6e\u4e2d\u5fc3\u5b8c\u6210\u5149\u9e2d\u7f51\u76d8\u6388\u6743");
                                }
                                var0 = l.n((String)var4_3);
                                if (TextUtils.isEmpty((CharSequence)var0)) {
                                    return g.c("\u5149\u9e2d\u672a\u8fd4\u56de\u4e0b\u8f7d\u5730\u5740");
                                }
                                var1_11 = B.p("guangya");
                                return B.y((String)var0, m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Accept", "*/*"), var1_11, "guangya");
                            }
                            var0 = "";
                        }
                        var6_6 = var4_3[1];
                        var9_7 = var4_3[2];
                        var10_8 = l.p(var6_6);
                        var4_3 = new JsonObject();
                        var4_3.addProperty("fileId", l.D(var9_7));
                        var4_3.addProperty("accessToken", var10_8);
                        var6_6 = l.g((JsonObject)var4_3, "/userres/v1/get_share_download_url", l.m(false));
                        if (l.C((JsonObject)var6_6)) {
                            var6_6 = l.g((JsonObject)var4_3, "/userres/v1/get_share_download_url", l.m(true));
                        }
                        var1_10 = var2_9 = l.s((JsonObject)var6_6, "_http_status");
                        var8_12 = l.l(l.x((JsonObject)var6_6, "data"), new String[]{"downloadUrl", "signedURL", "url"});
                        if (!TextUtils.isEmpty((CharSequence)var8_12) || l.s((JsonObject)var6_6, "code") != 207) break block35;
                        var4_3 = var0;
                        if (!TextUtils.isEmpty((CharSequence)var0)) break block30;
                        try {
                            var0 = new ArrayList();
                            l.h(var10_8, "", (ArrayList)var0, 0);
                            var4_3 = var0.iterator();
                            while (var4_3.hasNext()) {
                                var0 = (k)var4_3.next();
                                if (!var9_7.equals(var0.a)) continue;
                                var4_3 = var0.b;
                                break block30;
                            }
                            break block31;
                        }
                        catch (Throwable var0_2) {}
                    }
                    var4_3 = "*/*";
                    var1_10 = var2_9;
                    ** GOTO lbl-1000
                }
                var4_3 = "";
            }
            var7_13 = l.v("").iterator();
            var0 = var5_5;
            var5_5 = var7_13;
            while (var3_4 = var5_5.hasNext()) {
                var7_13 = (k)var5_5.next();
                if (!var7_13.c || !"tudou".equals(var7_13.b)) continue;
                var5_5 = var7_13.a;
                break block32;
            }
            var5_5 = new JsonObject();
            var5_5.addProperty("parentId", "");
            var5_5.addProperty("dirName", "tudou");
            var7_13 = l.f((JsonObject)var5_5, "/userres/v1/file/create_dir");
            var5_5 = l.l(l.x((JsonObject)var7_13, "data"), new String[]{"fileId", "id"});
            if (TextUtils.isEmpty((CharSequence)var5_5)) {
                var5_5 = l.v("").iterator();
                do {
                    if (!var5_5.hasNext()) {
                        var0 = new StringBuilder("create restore folder failed: ");
                        var0.append(l.j((JsonObject)var7_13, ""));
                        throw new Exception(var0.toString());
                    }
                    var11_15 /* !! */  = (k)var5_5.next();
                } while (!var11_15 /* !! */ .c || !"tudou".equals(var11_15 /* !! */ .b));
                var5_5 = var11_15 /* !! */ .a;
            }
        }
        var11_15 /* !! */  = new JsonObject();
        var7_13 = new JsonArray();
        var7_13.add(var9_7);
        var11_15 /* !! */ .addProperty("accessToken", var10_8);
        var11_15 /* !! */ .add("fileIds", (JsonElement)var7_13);
        var11_15 /* !! */ .addProperty("parentId", var5_5);
        var7_13 = l.g(var11_15 /* !! */ , "/userres/v1/restore_share", l.m(false));
        if (l.C((JsonObject)var7_13)) {
            var7_13 = l.g(var11_15 /* !! */ , "/userres/v1/restore_share", l.m(true));
        }
        var9_7 = l.l(l.x((JsonObject)var7_13, "data"), new String[]{"taskId", "task_id"});
        if (TextUtils.isEmpty((CharSequence)var9_7)) {
            var0 = new StringBuilder("restore share failed: ");
            var0.append(l.j((JsonObject)var7_13, ""));
            throw new Exception(var0.toString());
        }
        var7_13 = l.k((String)var5_5, (String)var4_3);
        if (!TextUtils.isEmpty((CharSequence)var7_13)) {
            var5_5 = var7_13;
        } else {
            try {
                l.F(var9_7);
            }
            catch (Exception var7_14) {
                m.m(var7_14, new StringBuilder("[GuangYa] restore task status ignored: "));
            }
            var5_5 = l.k((String)var5_5, (String)var4_3);
            if (TextUtils.isEmpty((CharSequence)var5_5)) {
                throw new Exception("restore completed but file not found");
            }
        }
        var4_3 = var0;
        if (!TextUtils.isEmpty((CharSequence)var5_5)) {
            var4_3 = l.n((String)var5_5);
        } else lbl-1000:
        // 2 sources

        {
            if (TextUtils.isEmpty((CharSequence)var8_12)) {
                var0 = new StringBuilder("share download failed: ");
                var4_3 = new StringBuilder("status=");
                var4_3.append(var1_10);
                var0.append(l.j((JsonObject)var6_6, var4_3.toString()));
                throw new Exception(var0.toString());
            }
            var0 = var4_3;
            var4_3 = var8_12;
        }
        if (TextUtils.isEmpty((CharSequence)var4_3)) {
            return g.c("\u5149\u9e2d\u5206\u4eab\u672a\u8fd4\u56de\u4e0b\u8f7d\u5730\u5740");
        }
        var1_10 = B.p("guangya");
        return B.y((String)var4_3, m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Accept", (String)var0), var1_10, "guangya");
    }

    public static JsonObject z(String string) {
        Object object = new JsonObject();
        object.addProperty("scope", "user");
        object.addProperty("client_id", "aMe-8VSlkrbQXpUR");
        string = A.k("https://account.guangyapan.com/v1/auth/device/code", object.toString(), l.c(string)).b();
        JsonObject jsonObject = C.R(string);
        object = new StringBuilder("[GuangYa] device code resp=");
        ((StringBuilder)object).append(string);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        if (!TextUtils.isEmpty((CharSequence)l.B(jsonObject, "device_code"))) {
            return jsonObject;
        }
        throw new Exception(l.j(jsonObject, "\u5149\u9e2d\u4e8c\u7ef4\u7801\u83b7\u53d6\u5931\u8d25"));
    }

    public final void E(String object, String string) {
        long l2 = System.currentTimeMillis();
        while (!this.a && System.currentTimeMillis() < l2 + 180000L) {
            Object object2 = new JsonObject();
            object2.addProperty("grant_type", "urn:ietf:params:oauth:grant-type:device_code");
            object2.addProperty("device_code", string);
            object2.addProperty("client_id", "aMe-8VSlkrbQXpUR");
            JsonObject jsonObject = C.R(A.k("https://account.guangyapan.com/v1/auth/token", object2.toString(), l.c((String)object)).b());
            object2 = l.l(jsonObject, "access_token", "accessToken");
            String string2 = l.l(jsonObject, "refresh_token", "refreshToken");
            if (TextUtils.isEmpty((CharSequence)object2) && TextUtils.isEmpty((CharSequence)string2)) {
                object2 = l.B(jsonObject, "error").toLowerCase(Locale.ROOT);
                if (!"access_denied".equals(object2)) {
                    if (!"expired_token".equals(object2) && !"invalid_grant".equals(object2)) {
                        long l3 = "slow_down".equals(object2) ? 5000L : 2500L;
                        SystemClock.sleep((long)l3);
                        continue;
                    }
                    throw new Exception("\u5149\u9e2d\u4e8c\u7ef4\u7801\u5df2\u8fc7\u671f");
                }
                throw new Exception("\u5149\u9e2d\u626b\u7801\u5df2\u53d6\u6d88");
            }
            if (!TextUtils.isEmpty((CharSequence)object2)) {
                C.N(object2, "guangya_access_token");
            }
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                C.N(string2, "guangya_refresh_token");
            }
            return;
        }
        if (this.a) {
            throw new Exception("\u5149\u9e2d\u626b\u7801\u5df2\u53d6\u6d88");
        }
        object = new Exception("\u5149\u9e2d\u626b\u7801\u767b\u5f55\u8d85\u65f6");
        throw object;
    }
}

