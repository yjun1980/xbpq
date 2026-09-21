/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  okhttp3.Headers
 *  okhttp3.HttpUrl
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.A;
import com.github.catvod.spider.merge.I.B;
import com.github.catvod.spider.merge.I.C;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.I.z;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.K.i;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public final class D {
    private final OkHttpClient a = new OkHttpClient.Builder().build();

    D() {
        new Gson();
    }

    public static int a(D object, JsonObject object2, JsonObject object3) {
        Objects.requireNonNull(object);
        boolean bl = object2.has("server_filename");
        String string = "";
        object2 = bl ? object2.get("server_filename").getAsString() : "";
        String string2 = m.x((String)object2);
        object2 = string;
        if (object3.has("server_filename")) {
            object2 = object3.get("server_filename").getAsString();
        }
        object2 = m.x((String)object2);
        object3 = ((D)object).d(string2);
        object = ((D)object).d((String)object2);
        int n2 = object3 != null && object != null && !((Integer)object3).equals(object) ? ((Integer)object3).compareTo((Integer)object) : string2.compareToIgnoreCase((String)object2);
        return n2;
    }

    public static String b(String object, List<String> object2) {
        Object object3;
        block12: {
            block10: {
                block11: {
                    object3 = object2.get(0).trim();
                    if (!((String)object3).contains("_")) break block10;
                    object2 = ((String)object3).split("_", 2)[1];
                    if (!((String)object2).contains("*#")) break block11;
                    object2 = ((String)object2).split(Pattern.quote("*#"))[0];
                    break block12;
                }
                if (!((String)object2).equals("root")) break block12;
            }
            object2 = "/";
        }
        ArrayList<String> arrayList = C.a;
        Objects.requireNonNull(arrayList);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("selfbaidu");
        try {
            Object object4 = new ArrayList();
            ((D)((Object)arrayList)).h((String)object2, 1, null, (List<JsonObject>)object4);
            object2 = new B((D)((Object)arrayList));
            Collections.sort(object4, object2);
            arrayList = new ArrayList<String>();
            Iterator<JsonObject> iterator = ((ArrayList)object4).iterator();
            while (iterator.hasNext()) {
                JsonObject jsonObject = iterator.next();
                object4 = jsonObject.get("server_filename").getAsString();
                object2 = jsonObject.get("path").getAsString();
                jsonObject.get("fs_id").getAsString();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(m.x((String)object4));
                stringBuilder.append("[");
                stringBuilder.append(m.o(jsonObject.get("size").getAsDouble()));
                stringBuilder.append("]");
                stringBuilder.append(m.A((String)object4));
                stringBuilder.append("$");
                stringBuilder.append("selfbaidu");
                stringBuilder.append('+');
                stringBuilder.append((String)object2);
                stringBuilder.append('+');
                stringBuilder.append(m.A((String)object));
                stringBuilder.append('+');
                stringBuilder.append(m.x((String)object4));
                arrayList.add(stringBuilder.toString());
            }
            object2 = new h();
            ((h)object2).l((String)object3);
            ((h)object2).j((String)object3);
            ((h)object2).n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/df/92/ee/df92ee21-b113-91fd-d6a9-c63827f1ae28/AppIcon-0-0-1x_U007ephone-0-11-0-0-sRGB-85-220.png/350x350.png");
            ((h)object2).m((String)object);
            object = new StringBuilder();
            object3 = arrayList.iterator();
            if (object3.hasNext()) {
                while (true) {
                    ((StringBuilder)object).append((CharSequence)object3.next());
                    if (!object3.hasNext()) break;
                    ((StringBuilder)object).append((CharSequence)"#");
                }
            }
            ((h)object2).p(((StringBuilder)object).toString());
            object3 = new StringBuilder();
            object = arrayList2.iterator();
            if (object.hasNext()) {
                while (true) {
                    ((StringBuilder)object3).append((CharSequence)object.next());
                    if (!object.hasNext()) break;
                    ((StringBuilder)object3).append((CharSequence)"$$$");
                }
            }
            ((h)object2).o(((StringBuilder)object3).toString());
            ((h)object2).g("\u767e\u5ea6\u96f2\u76e4");
            object = object2;
        }
        catch (Exception exception) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("BaiduSelfApi getVod error:");
            ((StringBuilder)object2).append(exception);
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            object = BaseApi.fakeVod(arrayList2, "\u767e\u5ea6\u96f2\u76e4");
        }
        return f.n((h)object);
    }

    public static D c() {
        return C.a;
    }

    private Integer d(String string) {
        int n2;
        try {
            n2 = Integer.parseInt(m.z(m.x(string)).replaceAll("\\D+", ""));
        }
        catch (Exception exception) {
            return null;
        }
        return n2;
    }

    private Map<String, String> f() {
        HashMap hashMap = c.b("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;", "Accept", "application/json, text/plain, */*");
        hashMap.put("Origin", "https://pan.baidu.com");
        hashMap.put("Referer", "https://pan.baidu.com/disk/main");
        String string = z.a.b.b();
        if (e.d(string)) {
            hashMap.put("Cookie", string);
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void h(String string, int n2, List<JsonObject> list, List<JsonObject> list2) {
        CharSequence charSequence;
        block10: {
            block11: {
                int n3;
                JsonObject jsonObject;
                block9: {
                    block8: {
                        charSequence = com.github.catvod.spider.merge.C.a.c("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&order=time&desc=1&dir=");
                        charSequence.append(URLEncoder.encode(string, "UTF-8"));
                        charSequence.append("&num=100&page=");
                        charSequence.append(n2);
                        charSequence = charSequence.toString();
                        charSequence = new Request.Builder().url((String)charSequence).headers(Headers.of(this.f())).build();
                        charSequence = this.a.newCall((Request)charSequence).execute();
                        boolean bl = charSequence.isSuccessful();
                        if (bl) break block8;
                        charSequence.close();
                        return;
                    }
                    jsonObject = JsonParser.parseString((String)charSequence.body().string()).getAsJsonObject();
                    n3 = jsonObject.get("errno").getAsInt();
                    if (n3 == 0) break block9;
                    charSequence.close();
                    return;
                }
                try {
                    JsonArray jsonArray = jsonObject.getAsJsonArray("list");
                    if (jsonArray == null || jsonArray.size() == 0) break block10;
                    Iterator iterator = jsonArray.iterator();
                    while (iterator.hasNext()) {
                        jsonObject = ((JsonElement)iterator.next()).getAsJsonObject();
                        n3 = jsonObject.get("isdir").getAsInt();
                        String string2 = jsonObject.get("server_filename").getAsString();
                        if (n3 == 1) {
                            if (list == null) continue;
                            list.add(jsonObject);
                            continue;
                        }
                        if (!e.d(m.n(string2.toLowerCase()))) continue;
                        list2.add(jsonObject);
                    }
                    if (jsonArray.size() != 100) break block11;
                    this.h(string, n2 + 1, list, list2);
                }
                catch (Throwable throwable) {
                    if (charSequence == null) throw throwable;
                    try {
                        charSequence.close();
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
            }
            charSequence.close();
            return;
        }
        charSequence.close();
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String e(String string) {
        block19: {
            JsonObject jsonObject;
            JsonElement jsonElement;
            block21: {
                block20: {
                    JsonObject jsonObject2;
                    block18: {
                        block17: {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("[\"");
                            stringBuilder.append(string);
                            stringBuilder.append("\"]");
                            string = stringBuilder.toString();
                            string = HttpUrl.parse((String)"https://pan.baidu.com/api/filemetas").newBuilder().addQueryParameter("dlink", "1").addQueryParameter("web", "5").addQueryParameter("origin", "dlna").addEncodedQueryParameter("target", URLEncoder.encode(string, "UTF-8")).build();
                            Request.Builder builder = new Request.Builder();
                            string = builder.url((HttpUrl)string).headers(Headers.of(this.f())).build();
                            string = this.a.newCall((Request)string).execute();
                            boolean bl = string.isSuccessful();
                            if (bl) break block17;
                            string.close();
                            return "";
                        }
                        jsonObject2 = JsonParser.parseString((String)string.body().string()).getAsJsonObject();
                        int n2 = jsonObject2.get("errno").getAsInt();
                        if (n2 == 0) break block18;
                        string.close();
                        return "";
                    }
                    if (!jsonObject2.has("info")) break block19;
                    jsonElement = jsonObject2.get("info");
                    if (!jsonElement.isJsonArray()) break block20;
                    JsonArray jsonArray = jsonElement.getAsJsonArray();
                    if (jsonArray.size() <= 0) break block19;
                    String string2 = jsonArray.get(0).getAsJsonObject().get("dlink").getAsString();
                    string.close();
                    return string2;
                }
                if (!jsonElement.isJsonObject()) break block21;
                String string3 = jsonElement.getAsJsonObject().get("dlink").getAsString();
                string.close();
                return string3;
            }
            if (!jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString() || !(jsonObject = JsonParser.parseString((String)jsonElement.getAsString()).getAsJsonObject()).has("dlink")) break block19;
            String string4 = jsonObject.get("dlink").getAsString();
            string.close();
            return string4;
        }
        string.close();
        return "";
        catch (Throwable throwable) {
            if (string == null) throw throwable;
            try {
                string.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (Exception exception) {
                    s.b("BaiduSelfApi getDownloadUrl error:", exception);
                }
            }
        }
        return "";
    }

    public final List<h> g(i object) {
        StringBuilder stringBuilder;
        if (!NetPan.isBaidu("")) {
            return null;
        }
        object = e.b(((i)object).b()) ? "/" : ((i)object).b();
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("BaiduSelfApi getVodFolder path=");
        ((StringBuilder)serializable).append((String)object);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        Object object2 = new ArrayList<JsonObject>();
        Object object3 = new ArrayList<JsonObject>();
        try {
            if (e.c(z.a.b.b())) {
                m.y("\u8bf7\u5148\u767b\u5f55\u767e\u5ea6\u7f51\u76d8");
                return new ArrayList<h>();
            }
            this.h((String)object, 1, (List<JsonObject>)object3, (List<JsonObject>)object2);
        }
        catch (Exception exception) {
            s.b("BaiduSelfApi getVodFolder error:", exception);
        }
        serializable = new ArrayList();
        JsonObject jsonObject = ((ArrayList)object3).iterator();
        while (jsonObject.hasNext()) {
            JsonObject jsonObject2 = jsonObject.next();
            object3 = new h();
            stringBuilder = com.github.catvod.spider.merge.C.a.c("selfbaidu*#");
            stringBuilder.append(jsonObject2.get("path").getAsString());
            ((h)object3).l(stringBuilder.toString());
            ((h)object3).m(jsonObject2.get("server_filename").getAsString());
            ((h)object3).r("folder");
            ((ArrayList)serializable).add(object3);
        }
        object2 = ((ArrayList)object2).iterator();
        while (object2.hasNext()) {
            jsonObject = (JsonObject)object2.next();
            object3 = new h();
            stringBuilder = new StringBuilder();
            stringBuilder.append("selfbaidu_");
            stringBuilder.append((String)object);
            stringBuilder.append("*#");
            stringBuilder.append(jsonObject.get("server_filename").getAsString());
            ((h)object3).l(stringBuilder.toString());
            ((h)object3).m(jsonObject.get("server_filename").getAsString());
            ((h)object3).r("file");
            ((ArrayList)serializable).add(object3);
        }
        return serializable;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String i(String object) {
        block7: {
            String string = "";
            try {
                if (!BaseApi.isOk("selfbaidu")) break block7;
                return "";
            }
            catch (Exception exception) {
                return string;
            }
        }
        String[] stringArray = ((String)object).split("\\+");
        Object object2 = C.a.e(stringArray[1]);
        object = z.a;
        Objects.requireNonNull(object);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
        hashMap.put("Url", (String)object2);
        hashMap.put("Cookie", ((A)object).b.b());
        object = BaseApi.get().h;
        String string = m.b((String)object2);
        Gson gson = new Gson();
        ((ConcurrentHashMap)object).put((String)string, (String)gson.toJson(hashMap));
        object = object2;
        if (z.a.b.c != 0) {
            object = Server.y((String)object2, z.a.b.a(), com.github.catvod.spider.merge.N.c.b());
        }
        if (BaseApi.get().d.booleanValue()) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(stringArray[2]);
            ((StringBuilder)object2).append(stringArray[3]);
            object2 = ((StringBuilder)object2).toString();
            BaseApi.get().downloadFileWithDownloadManager((String)object, (String)object2, hashMap);
            object = new StringBuilder();
            ((StringBuilder)object).append("\u6b63\u5728\u4e0b\u8f7d ");
            ((StringBuilder)object).append((String)object2);
            m.y(((StringBuilder)object).toString());
            object = Server.B();
        } else {
            object = NetPan.getIsoDownloadUrl((String)object);
        }
        object2 = new f();
        ((f)object2).w((String)object);
        ((f)object2).j();
        ((f)object2).b(t.a.r(stringArray));
        ((f)object2).g(hashMap);
        return ((f)object2).toString();
    }
}

