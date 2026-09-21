/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  okhttp3.Headers
 *  okhttp3.HttpUrl
 *  okhttp3.HttpUrl$Builder
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.J;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.J.a;
import com.github.catvod.spider.merge.J.b;
import com.github.catvod.spider.merge.J.c;
import com.github.catvod.spider.merge.J.d;
import com.github.catvod.spider.merge.J.e;
import com.github.catvod.spider.merge.J.f;
import com.github.catvod.spider.merge.J.g;
import com.github.catvod.spider.merge.J.h;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

public final class i {
    private static final com.github.catvod.spider.merge.M1.b d = com.github.catvod.spider.merge.M1.c.d();
    private static final Gson e = new Gson();
    private static final ScheduledExecutorService f = Executors.newSingleThreadScheduledExecutor(com.github.catvod.spider.merge.J.a.a);
    private static final OkHttpClient g;
    private static final MediaType h;
    public static final int i = 0;
    private final Map<String, String> a;
    public Map<String, String> b;
    public String c = "";

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        g = builder.connectTimeout(15L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(15L, timeUnit).build();
        h = MediaType.parse((String)"application/x-www-form-urlencoded; charset=utf-8");
    }

    public i() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        this.a = hashMap;
        hashMap.put("User-Agent", "Mozilla/5.0 (Linux; Android 12; SM-X800) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.40 Safari/537.36");
        hashMap.put("Accept", "application/json, text/plain, */*");
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Origin", "https://pan.baidu.com");
        hashMap.put("Referer", "https://pan.baidu.com/");
    }

    public static /* synthetic */ void a(i i2, String string) {
        Objects.requireNonNull(i2);
        try {
            com.github.catvod.spider.merge.M1.b b2 = d;
            b2.b("Executing delete operation for: {}", string);
            i2.c(string);
            b2.b("Delete operation finished for: {}", string);
        }
        catch (Exception exception) {
            d.f("Error in delete task for path: {}", string, exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c(String string) {
        Request request;
        block13: {
            Object object;
            if (!string.startsWith("/")) {
                string = com.github.catvod.spider.merge.B.e.c("/", string);
            }
            request = new Request.Builder().url("https://pan.baidu.com/api/loginStatus?clienttype=1&web=1&channel=web&version=0").addHeader("Cookie", j.a(this.b)).build();
            Object object2 = g;
            request = object2.newCall(request).execute();
            try {
                object = request.body().string();
            }
            catch (Throwable throwable) {
                if (request == null) throw throwable;
                try {
                    request.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            request.close();
            request = HttpUrl.parse((String)"https://pan.baidu.com/api/filemanager").newBuilder().addQueryParameter("opera", "delete").addQueryParameter("bdstoken", new JSONObject((String)object).getJSONObject("login_info").getString("bdstoken")).addQueryParameter("clienttype", "1").build();
            object = com.github.catvod.spider.merge.C.a.c("[\"");
            ((StringBuilder)object).append(string.replace("\"", "\\\""));
            ((StringBuilder)object).append("\"]");
            Object object3 = com.github.catvod.spider.merge.B.e.c("filelist=", ((StringBuilder)object).toString());
            object = h;
            object3 = RequestBody.create((MediaType)object, (String)object3);
            request = object2.newCall(new Request.Builder().url((HttpUrl)request).header("User-Agent", "Android").header("Connection", "Keep-Alive").header("Content-Type", object.toString()).header("Accept-Language", "zh-CN,zh;q=0.8").header("Cookie", j.a(this.b)).post((RequestBody)object3).build()).execute();
            try {
                object2 = request.body() != null ? request.body().string() : "";
                object = d;
                object.b("Delete File Response Code: {}", request.code());
                object.b("Delete File Response Body: {}", object2);
                if (!request.isSuccessful()) {
                    object.f("Failed to delete file: {}. Code: {}", string, request.code());
                    break block13;
                }
                try {
                    object3 = new e();
                    object3 = object3.getType();
                    object3 = ((Map)e.fromJson((String)object2, (Type)object3)).get("errno");
                    if (object3 instanceof Number && ((Number)object3).intValue() == 0) {
                        object.b("Successfully confirmed deletion of: {}", string);
                        break block13;
                    }
                    object.a("Deletion might have failed, errno not 0 or not found. Response: {}", object2);
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    d.a("Could not parse delete confirmation response: {}", object2);
                }
            }
            catch (Throwable throwable) {
                if (request == null) throw throwable;
                try {
                    request.close();
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    throwable.addSuppressed(throwable3);
                }
                throw throwable;
            }
        }
        request.close();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private f e(com.github.catvod.spider.merge.N.f object) {
        HashMap<String, Object> hashMap = "Failed to list root folder content: ";
        Object object2 = com.github.catvod.spider.merge.C.a.c("getAllVideos tokenInfo: ");
        ((StringBuilder)object2).append(object.toString());
        SpiderDebug.log((String)((StringBuilder)object2).toString());
        if (((com.github.catvod.spider.merge.N.f)object).a() != null) {
            return new f(((com.github.catvod.spider.merge.N.f)object).a());
        }
        if (((com.github.catvod.spider.merge.N.f)object).c() == null) {
            return new f("Missing randsk in token info");
        }
        f f2 = new f();
        LinkedList<Object> linkedList = new LinkedList<Object>();
        object2 = new HashSet();
        Object object3 = new com.github.catvod.spider.merge.N.a();
        ((com.github.catvod.spider.merge.N.a)object3).m(((com.github.catvod.spider.merge.N.f)object).d());
        ((com.github.catvod.spider.merge.N.a)object3).j(((com.github.catvod.spider.merge.N.f)object).c());
        Object object4 = null;
        ((com.github.catvod.spider.merge.N.a)object3).n(null);
        ((com.github.catvod.spider.merge.N.a)object3).l(null);
        ((com.github.catvod.spider.merge.N.a)object3).i(1);
        ((com.github.catvod.spider.merge.N.a)object3).k(true);
        linkedList.add(object3);
        ((HashSet)object2).add("/");
        object3 = null;
        while (true) {
            void object72;
            Object object5;
            Object object6;
            block19: {
                block25: {
                    block33: {
                        Object object10;
                        block20: {
                            Object object8;
                            Object object7;
                            com.github.catvod.spider.merge.N.a a2;
                            block22: {
                                block26: {
                                    int n2;
                                    block32: {
                                        block27: {
                                            block23: {
                                                block24: {
                                                    if (linkedList.isEmpty()) {
                                                        return f2;
                                                    }
                                                    a2 = (com.github.catvod.spider.merge.N.a)linkedList.poll();
                                                    object10 = object4 != null ? object4 : a2.f();
                                                    a2.n((String)object10);
                                                    object10 = object3 != null ? object3 : a2.d();
                                                    a2.l((String)object10);
                                                    try {
                                                        object7 = this.h(a2);
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        object8 = hashMap;
                                                        object7 = object2;
                                                        d.g("IllegalArgumentException for folder '{}' page {}: {}", a2.a(), a2.b(), illegalArgumentException.getMessage());
                                                        f f4 = f2;
                                                        object6 = object4;
                                                        object5 = object3;
                                                        hashMap = object7;
                                                        object2 = object8;
                                                        if (!a2.g()) break block19;
                                                        f f5 = f2;
                                                        object6 = object4;
                                                        object5 = object3;
                                                        hashMap = object7;
                                                        object2 = object8;
                                                        if (a2.b() != 1) break block19;
                                                        object = new StringBuilder();
                                                        object2 = "Failed root folder listing due to invalid arguments: ";
                                                        break block20;
                                                    }
                                                    catch (IOException iOException) {
                                                        object10 = hashMap;
                                                        object8 = object2;
                                                        f f6 = f2;
                                                        object6 = object4;
                                                        object5 = object3;
                                                        hashMap = object8;
                                                        object2 = object10;
                                                        if (!a2.g()) break block19;
                                                        f f7 = f2;
                                                        object6 = object4;
                                                        object5 = object3;
                                                        hashMap = object8;
                                                        object2 = object10;
                                                        if (a2.b() != 1) break block19;
                                                        hashMap = new StringBuilder();
                                                        object = iOException;
                                                        object2 = object10;
                                                        object10 = object;
                                                        object = hashMap;
                                                        break block20;
                                                    }
                                                    if (((com.github.catvod.spider.merge.N.e)object7).b() != null || ((com.github.catvod.spider.merge.N.e)object7).a() == null) break block22;
                                                    object10 = object4;
                                                    object8 = object3;
                                                    if (!a2.g()) break block23;
                                                    object10 = object4;
                                                    object8 = object3;
                                                    if (a2.b() != 1) break block23;
                                                    if (((com.github.catvod.spider.merge.N.e)object7).a().d() != null && ((com.github.catvod.spider.merge.N.e)object7).a().b() != null) break block24;
                                                    d.a("Failed to get uk/shareid from root folder response. Aborting. Data: {}", e.toJson((Object)((com.github.catvod.spider.merge.N.e)object7).a()));
                                                    object = "Failed to get uk/shareid from root folder response";
                                                    break block25;
                                                }
                                                object10 = ((com.github.catvod.spider.merge.N.e)object7).a().d();
                                                object8 = ((com.github.catvod.spider.merge.N.e)object7).a().b();
                                                ((com.github.catvod.spider.merge.N.f)object).k((String)object10);
                                                ((com.github.catvod.spider.merge.N.f)object).i((String)object8);
                                                d.k(object10, object8, ((com.github.catvod.spider.merge.N.f)object).d());
                                            }
                                            if (object10 == null || object8 == null) break block26;
                                            if (((com.github.catvod.spider.merge.N.e)object7).a().a() == null) break block27;
                                            n2 = ((com.github.catvod.spider.merge.N.e)object7).a().a().size();
                                            object6 = new ArrayList();
                                            for (com.github.catvod.spider.merge.N.b b2 : ((com.github.catvod.spider.merge.N.e)object7).a().a()) {
                                                block21: {
                                                    block28: {
                                                        block31: {
                                                            block30: {
                                                                block29: {
                                                                    if (b2.b() != 1) break block28;
                                                                    object7 = b2.c();
                                                                    if (object7 == null || ((HashSet)object2).contains(object7)) break block29;
                                                                    ((HashSet)object2).add(object7);
                                                                    object4 = new com.github.catvod.spider.merge.N.a();
                                                                    ((com.github.catvod.spider.merge.N.a)object4).m(((com.github.catvod.spider.merge.N.f)object).d());
                                                                    ((com.github.catvod.spider.merge.N.a)object4).j(((com.github.catvod.spider.merge.N.f)object).c());
                                                                    ((com.github.catvod.spider.merge.N.a)object4).n((String)object10);
                                                                    ((com.github.catvod.spider.merge.N.a)object4).l((String)object8);
                                                                    ((com.github.catvod.spider.merge.N.a)object4).h((String)object7);
                                                                    ((com.github.catvod.spider.merge.N.a)object4).i(1);
                                                                    ((com.github.catvod.spider.merge.N.a)object4).k(false);
                                                                    linkedList.add(object4);
                                                                    object5 = d;
                                                                    object4 = "Added subfolder to queue: {}";
                                                                    break block30;
                                                                }
                                                                object5 = d;
                                                                if (object7 == null) break block31;
                                                                object4 = "Skipping already seen folder: {}";
                                                            }
                                                            object5.i((String)object4, object7);
                                                            continue;
                                                        }
                                                        object5.c("Folder item has null path: {}", e.toJson((Object)b2));
                                                        continue;
                                                    }
                                                    object4 = b2.d();
                                                    boolean bl = object4 == null ? false : com.github.catvod.spider.merge.R0.e.d(m.n(((String)object4).toLowerCase()));
                                                    if (!bl) continue;
                                                    try {
                                                        object7 = this.d(b2.e());
                                                        object5 = b2.d();
                                                    }
                                                    catch (Exception exception) {
                                                        // empty catch block
                                                        break block21;
                                                    }
                                                    try {
                                                        object4 = new Object();
                                                        ((HashMap)object4).put("uk", object10);
                                                        ((HashMap)object4).put("sizeStr", object7);
                                                        ((HashMap)object4).put("shareid", object8);
                                                        ((HashMap)object4).put("fid", b2.a());
                                                        ((HashMap)object4).put("qtype", "original");
                                                        ((HashMap)object4).put("randsk", ((com.github.catvod.spider.merge.N.f)object).c());
                                                        ((HashMap)object4).put("pname", object5);
                                                        ((HashMap)object4).put("shareName", this.c);
                                                        ((ArrayList)object6).add(object4);
                                                        if (((com.github.catvod.spider.merge.N.f)object).b() != null && !((com.github.catvod.spider.merge.N.f)object).b().isEmpty()) {
                                                            object4 = new Object();
                                                            ((HashMap)object4).put("uk", object10);
                                                            ((HashMap)object4).put("fid", b2.a());
                                                            ((HashMap)object4).put("shareid", object8);
                                                            ((HashMap)object4).put("jsToken", ((com.github.catvod.spider.merge.N.f)object).b());
                                                            ((HashMap)object4).put("surl", ((com.github.catvod.spider.merge.N.f)object).e());
                                                            ((HashMap)object4).put("pname", "baidu");
                                                            ((HashMap)object4).put("qtype", "preview");
                                                            Base64.encodeToString((byte[])e.toJson(object4).getBytes(), (int)0);
                                                        }
                                                    }
                                                    catch (Exception exception) {}
                                                }
                                                d.l((Throwable)object4);
                                                d.i("Added video: {}", b2.d());
                                            }
                                            Collections.sort(object6, new com.github.catvod.spider.merge.N.h());
                                            object4 = ((ArrayList)object6).iterator();
                                            while (object4.hasNext()) {
                                                object3 = (Map)object4.next();
                                                object5 = Base64.encodeToString((byte[])e.toJson(object3).getBytes(StandardCharsets.UTF_8), (int)2);
                                                ((ArrayList)f2.a).add(String.format("%s [%s]%s$%s", m.x((String)object3.get("pname")), object3.get("sizeStr"), m.A((String)object3.get("pname")), object5));
                                            }
                                            object4 = object2;
                                            object3 = hashMap;
                                            break block32;
                                        }
                                        n2 = 0;
                                        object3 = hashMap;
                                        object4 = object2;
                                    }
                                    f f8 = f2;
                                    object6 = object10;
                                    object5 = object8;
                                    hashMap = object4;
                                    object2 = object3;
                                    if (n2 >= 100) {
                                        object2 = new com.github.catvod.spider.merge.N.a();
                                        ((com.github.catvod.spider.merge.N.a)object2).m(a2.e());
                                        ((com.github.catvod.spider.merge.N.a)object2).j(a2.c());
                                        ((com.github.catvod.spider.merge.N.a)object2).n((String)object10);
                                        ((com.github.catvod.spider.merge.N.a)object2).l((String)object8);
                                        ((com.github.catvod.spider.merge.N.a)object2).h(a2.a());
                                        ((com.github.catvod.spider.merge.N.a)object2).i(a2.b() + 1);
                                        ((com.github.catvod.spider.merge.N.a)object2).k(a2.g());
                                        linkedList.add(object2);
                                        f f9 = f2;
                                        object6 = object10;
                                        object5 = object8;
                                        hashMap = object4;
                                        object2 = object3;
                                    }
                                    break block19;
                                }
                                d.a("Cannot process items in folder {} because uk/shareid are missing (should have been determined from root).", a2.a());
                                object = "uk/shareid missing after root folder processed";
                                break block25;
                            }
                            object10 = hashMap;
                            object8 = object2;
                            f f10 = f2;
                            object6 = object4;
                            object5 = object3;
                            hashMap = object8;
                            object2 = object10;
                            if (!a2.g()) break block19;
                            f f11 = f2;
                            object6 = object4;
                            object5 = object3;
                            hashMap = object8;
                            object2 = object10;
                            if (a2.b() != 1) break block19;
                            object = com.github.catvod.spider.merge.C.a.c((String)object10);
                            object2 = ((com.github.catvod.spider.merge.N.e)object7).b() != null ? ((com.github.catvod.spider.merge.N.e)object7).b() : "Null data";
                            break block33;
                        }
                        ((StringBuilder)object).append((String)object2);
                        object2 = ((Throwable)object10).getMessage();
                    }
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                }
                f2.b = object;
                return f2;
            }
            object3 = hashMap;
            hashMap = object2;
            f2 = object72;
            object2 = object3;
            object4 = object6;
            object3 = object5;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String g(String var1_1, String var2_4, String var3_27, String var4_31, Map<String, String> var5_32) {
        block85: {
            block82: {
                block81: {
                    block80: {
                        var9_33 = "info";
                        var1_1 = String.format("from=%s&shareid=%s&ondup=newcopy&path=/&fsidlist=[%s]", new Object[]{j.g((String)var1_1), j.g((String)var2_4 /* !! */ ), j.g((String)var3_27 /* !! */ )});
                        var3_27 /* !! */  = com.github.catvod.spider.merge.J.i.h;
                        var1_1 = RequestBody.create((MediaType)var3_27 /* !! */ , (String)var1_1);
                        var2_4 /* !! */  = new HashMap<String, String>(this.b);
                        var2_4 /* !! */ .put("BDCLND", var4_31);
                        var3_27 /* !! */  = new Request.Builder().url("https://pan.baidu.com/share/transfer").header("User-Agent", "Android").header("Connection", "Keep-Alive").header("Content-Type", var3_27 /* !! */ .toString());
                        var10_34 = "Accept-Language";
                        var3_27 /* !! */  = var3_27 /* !! */ .header("Accept-Language", "zh-CN,zh;q=0.8").header("Referer", "https://pan.baidu.com");
                        var2_4 /* !! */  = j.a((Map)var2_4 /* !! */ );
                        var11_35 = "Cookie";
                        var12_36 = var3_27 /* !! */ .header("Cookie", (String)var2_4 /* !! */ ).post((RequestBody)var1_1);
                        com.github.catvod.spider.merge.J.i.d.j("Attempting file transfer...");
                        var6_37 = 0;
                        var1_1 = null;
                        while (true) {
                            block79: {
                                block76: {
                                    block83: {
                                        block78: {
                                            block69: {
                                                block72: {
                                                    block84: {
                                                        block77: {
                                                            block73: {
                                                                block75: {
                                                                    block74: {
                                                                        block71: {
                                                                            block70: {
                                                                                block67: {
                                                                                    block68: {
                                                                                        block66: {
                                                                                            block65: {
                                                                                                var3_27 /* !! */  = "";
                                                                                                if (var6_37 >= 30) break;
                                                                                                var14_42 = com.github.catvod.spider.merge.J.i.d;
                                                                                                var7_38 = var6_37 + 1;
                                                                                                var14_42.h(var7_38, 30);
                                                                                                var2_4 /* !! */  = var12_36.build();
                                                                                                var13_40 = com.github.catvod.spider.merge.J.i.g.newCall(var2_4 /* !! */ ).execute();
                                                                                                var2_4 /* !! */  = var13_40.body();
                                                                                                if (var2_4 /* !! */  == null) break block65;
                                                                                                try {
                                                                                                    var2_4 /* !! */  = var13_40.body().string();
                                                                                                    break block66;
                                                                                                }
                                                                                                catch (Throwable var2_5) {
                                                                                                    break block67;
                                                                                                }
                                                                                            }
                                                                                            var2_4 /* !! */  = "";
                                                                                        }
                                                                                        var6_37 = var13_40.code();
                                                                                        var14_42.b("Transfer Response Code: {}", var6_37);
                                                                                        var8_39 = var13_40.isSuccessful();
                                                                                        if (var8_39) break block68;
                                                                                        try {
                                                                                            var14_42.f("Transfer request failed on attempt {}. Code: {}", var7_38, var13_40.code());
                                                                                            Thread.sleep(1000L);
                                                                                            break block69;
                                                                                        }
                                                                                        catch (Throwable var2_6) {
                                                                                            break block67;
                                                                                        }
                                                                                    }
                                                                                    var15_43 /* !! */  = new d();
                                                                                    var15_43 /* !! */  = var15_43 /* !! */ .getType();
                                                                                    var16_44 = (Map)com.github.catvod.spider.merge.J.i.e.fromJson((String)var2_4 /* !! */ , (Type)var15_43 /* !! */ );
                                                                                    var15_43 /* !! */  = var16_44.get("errno");
                                                                                    var8_39 = var15_43 /* !! */  instanceof Number;
                                                                                    if (!var8_39) break block70;
                                                                                    try {
                                                                                        var6_37 = ((Number)var15_43 /* !! */ ).intValue();
                                                                                        break block71;
                                                                                    }
                                                                                    catch (Throwable var2_7) {
                                                                                        // empty catch block
                                                                                    }
                                                                                }
                                                                                var3_27 /* !! */  = var2_4 /* !! */ ;
                                                                                break block83;
                                                                                catch (JsonSyntaxException var2_8) {
                                                                                    break block72;
                                                                                }
                                                                            }
                                                                            var6_37 = -1;
                                                                        }
                                                                        if (var6_37 != 0) break block84;
                                                                        if (!var16_44.containsKey("extra")) break block73;
                                                                        var2_4 /* !! */  = var16_44.get("extra");
                                                                        if (!(var2_4 /* !! */  instanceof Map) || !((var2_4 /* !! */  = ((Map)var2_4 /* !! */ ).get("list")) instanceof List) || ((List)var2_4 /* !! */ ).isEmpty()) break block69;
                                                                        var2_4 /* !! */  = (List)var2_4 /* !! */ ;
                                                                        var2_4 /* !! */  = var2_4 /* !! */ .get(0);
                                                                        if (!(var2_4 /* !! */  instanceof Map) || !((var2_4 /* !! */  = ((Map)var2_4 /* !! */ ).get("to")) instanceof String)) break block69;
                                                                        if (!((String)var2_4 /* !! */ ).startsWith("/")) break block74;
                                                                        var2_4 /* !! */  = (String)var2_4 /* !! */ ;
                                                                        var1_1 = var2_4 /* !! */  = var2_4 /* !! */ .substring(1);
                                                                        break block75;
                                                                    }
                                                                    var1_1 = var2_4 /* !! */  = (String)var2_4 /* !! */ ;
                                                                }
                                                                var14_42.b("Transfer successful. File saved to: {}", var1_1);
                                                                try {
                                                                    var13_40.close();
                                                                    break;
                                                                }
                                                                catch (IOException var3_28) {
                                                                    break block76;
                                                                }
                                                                catch (Throwable var2_9) {
                                                                    break block77;
                                                                }
                                                                catch (JsonSyntaxException var2_10) {
                                                                    break block72;
                                                                }
                                                                catch (Throwable var2_11) {
                                                                    break block77;
                                                                }
                                                                catch (JsonSyntaxException var2_12) {
                                                                    break block72;
                                                                }
                                                            }
                                                            try {
                                                                if (var16_44.containsKey("taskid")) {
                                                                    var14_42.j("Transfer initiated asynchronously (taskid found). Polling not implemented.");
                                                                    Thread.sleep(2000L);
                                                                    break block69;
                                                                }
                                                                var14_42.a("Transfer success (errno 0) but couldn't parse 'to' path. Response: {}", var2_4 /* !! */ );
                                                                ** GOTO lbl126
                                                            }
                                                            catch (Throwable var2_13) {
                                                                break block77;
                                                            }
                                                            catch (JsonSyntaxException var2_14) {
                                                                break block72;
                                                            }
                                                            catch (Throwable var2_15) {
                                                                // empty catch block
                                                            }
                                                        }
                                                        var3_27 /* !! */  = var2_4 /* !! */ ;
                                                        break block83;
                                                        catch (JsonSyntaxException var2_16) {}
                                                        break block72;
                                                    }
                                                    try {
                                                        var14_42.f("Transfer failed with errno {}. Response: {}", var6_37, var2_4 /* !! */ );
lbl126:
                                                        // 2 sources

                                                        Thread.sleep(1000L);
                                                        break block69;
                                                    }
                                                    catch (Throwable var2_17) {
                                                        break block78;
                                                    }
                                                    catch (JsonSyntaxException var2_18) {
                                                        break block72;
                                                    }
                                                    catch (Throwable var2_19) {
                                                        break block78;
                                                    }
                                                    catch (JsonSyntaxException var2_20) {
                                                        break block72;
                                                    }
                                                    catch (JsonSyntaxException var2_21) {}
                                                }
                                                com.github.catvod.spider.merge.J.i.d.f("JSON parsing error during transfer attempt {}: {}", var7_38, var2_4 /* !! */ .getMessage());
                                                Thread.sleep(1000L);
                                            }
                                            var2_4 /* !! */  = var1_1;
                                            var13_40.close();
                                            break block79;
                                            {
                                                catch (IOException var3_29) {
                                                    var1_1 = var2_4 /* !! */ ;
                                                    break block76;
                                                }
                                            }
                                            catch (Throwable var2_22) {}
                                            break block78;
                                            catch (Throwable var2_23) {}
                                            break block78;
                                            catch (Throwable var2_24) {
                                                break block78;
                                            }
                                            catch (Throwable var2_25) {}
                                        }
                                        var3_27 /* !! */  = var2_4 /* !! */ ;
                                    }
                                    if (var13_40 != null) {
                                        try {
                                            var13_40.close();
                                        }
                                        catch (Throwable var13_41) {
                                            var2_4 /* !! */  = var1_1;
                                            var3_27 /* !! */ .addSuppressed(var13_41);
                                        }
                                    }
                                    var2_4 /* !! */  = var1_1;
                                    throw var3_27 /* !! */ ;
                                    catch (IOException var3_30) {
                                        // empty catch block
                                    }
                                }
                                com.github.catvod.spider.merge.J.i.d.f("IOException during transfer attempt {}: {}", var7_38, var3_27 /* !! */ .getMessage());
                                Thread.sleep(1000L);
                            }
                            var6_37 = var7_38;
                        }
                        if (var1_1 == null) {
                            com.github.catvod.spider.merge.J.i.d.a("Transfer failed after {} attempts.", 30);
                        }
                        if (var1_1 == null || var1_1.isEmpty()) break block85;
                        var5_32.put((String)"to", (String)var1_1);
                        var2_4 /* !! */  = new HashMap(this.b);
                        var2_4 /* !! */ .put((String)"BDCLND", (String)var4_31);
                        var4_31 = HttpUrl.parse((String)"https://pan.baidu.com/api/mediainfo").newBuilder().addQueryParameter("type", "M3U8_FLV_264_480");
                        var5_32 = new StringBuilder();
                        var5_32.append("/");
                        var5_32.append((String)var1_1);
                        var1_1 = var4_31.addQueryParameter("path", var5_32.toString()).addQueryParameter("clienttype", "80").addQueryParameter("origin", "dlna").build();
                        var2_4 /* !! */  = new Request.Builder().url((HttpUrl)var1_1).header("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;").header("Connection", "Keep-Alive").header(var10_34, "zh-CN,zh;q=0.8").header(var11_35, j.a((Map)var2_4 /* !! */ )).get().build();
                        var4_31 = com.github.catvod.spider.merge.J.i.d;
                        var4_31.b("Requesting Media Info from: {}", var1_1);
                        var2_4 /* !! */  = com.github.catvod.spider.merge.J.i.g.newCall((Request)var2_4 /* !! */ ).execute();
                        var1_1 = var3_27 /* !! */ ;
                        if (var2_4 /* !! */ .body() != null) {
                            var1_1 = var2_4 /* !! */ .body().string();
                        }
                        var4_31.b("Media Info Response Code: {}", var2_4 /* !! */ .code());
                        if (var2_4 /* !! */ .isSuccessful()) break block80;
                        var4_31.a("Failed to get media info. Code: {}", var2_4 /* !! */ .code());
lbl204:
                        // 3 sources

                        while (true) {
                            var2_4 /* !! */ .close();
lbl206:
                            // 2 sources

                            return null;
                        }
                    }
                    var3_27 /* !! */  = new c();
                    var3_27 /* !! */  = var3_27 /* !! */ .getType();
                    var3_27 /* !! */  = (Map)com.github.catvod.spider.merge.J.i.e.fromJson((String)var1_1, (Type)var3_27 /* !! */ );
                    var8_39 = var3_27 /* !! */ .containsKey(var9_33);
                    if (!var8_39) break block81;
                    var3_27 /* !! */  = var3_27 /* !! */ .get(var9_33);
                    if (!(var3_27 /* !! */  instanceof Map) || !((var3_27 /* !! */  = ((Map)var3_27 /* !! */ ).get("dlink")) instanceof String)) break block82;
                    var1_1 = (String)var3_27 /* !! */ ;
                    var4_31.b("Successfully obtained download link (dlink): {}", var1_1);
                    var2_4 /* !! */ .close();
                    return var1_1;
                }
                if (!var3_27 /* !! */ .containsKey("dlink") || !((var3_27 /* !! */  = var3_27 /* !! */ .get("dlink")) instanceof String)) break block82;
                var1_1 = (String)var3_27 /* !! */ ;
                var4_31.b("Successfully obtained download link (top-level dlink): {}", var1_1);
                var2_4 /* !! */ .close();
                return var1_1;
            }
            try {
                var4_31.a("Could not parse 'dlink' from media info response: {}", var1_1);
            }
            catch (JsonSyntaxException var1_2) {
                try {
                    com.github.catvod.spider.merge.J.i.d.a("JSON parsing error for media info: {}", var1_2.getMessage());
                    ** continue;
                }
                catch (Throwable var1_3) {
                    if (var2_4 /* !! */  != null) {
                        try {
                            var2_4 /* !! */ .close();
                        }
                        catch (Throwable var2_26) {
                            var1_3.addSuppressed(var2_26);
                        }
                    }
                    throw var1_3;
                }
            }
lbl245:
            // 1 sources

            ** GOTO lbl204
        }
        com.github.catvod.spider.merge.J.i.d.e("File transfer failed.");
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private com.github.catvod.spider.merge.N.e h(com.github.catvod.spider.merge.N.a var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 6 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    private List<String> i(String string, String string2, String string3, long l2, String string4, String string5) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < 3; ++i2) {
            String string6 = (new String[]{"1080P", "720P", "480P"})[i2];
            HttpUrl.Builder builder = HttpUrl.parse((String)"https://pan.baidu.com/share/streaming").newBuilder().addQueryParameter("uk", string).addQueryParameter("fid", string2).addQueryParameter("sign", string3).addQueryParameter("timestamp", String.valueOf(l2)).addQueryParameter("shareid", string4);
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("M3U8_AUTO_");
            stringBuilder.append(string6.replace("P", ""));
            stringBuilder = builder.addQueryParameter("type", stringBuilder.toString()).addQueryParameter("jsToken", string5).build();
            arrayList.add(string6);
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    private com.github.catvod.spider.merge.N.f j(com.github.catvod.spider.merge.N.g var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
     * Could not resolve type clashes
     */
    private g k(String var1_1) {
        block16: {
            block17: {
                block15: {
                    var1_1 = HttpUrl.parse((String)"https://pan.baidu.com/share/tplconfig").newBuilder().addQueryParameter("surl", var1_1).addQueryParameter("fields", "cfrom_id,Espace_info,card_info,sign,timestamp").build();
                    var1_1 = new Request.Builder().url((HttpUrl)var1_1).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36").header("Connection", "Keep-Alive").header("Accept-Language", "zh-CN,zh;q=0.8").header("Cookie", j.a(this.b)).get().build();
                    var1_1 = com.github.catvod.spider.merge.J.i.g.newCall((Request)var1_1).execute();
                    if (var1_1.isSuccessful()) break block15;
                    com.github.catvod.spider.merge.J.i.d.a("Failed to get sign/timestamp. Code: {}", var1_1.code());
                    var1_1.close();
                    return null;
                }
                var5_3 = var1_1.body().string();
                var6_6 /* !! */  = new b();
                var6_6 /* !! */  = var6_6 /* !! */ .getType();
                var6_6 /* !! */  = (Map)com.github.catvod.spider.merge.J.i.e.fromJson((String)var5_3, (Type)var6_6 /* !! */ );
                if (!var6_6 /* !! */ .containsKey("data") || !((var6_6 /* !! */  = var6_6 /* !! */ .get("data")) instanceof Map) || !((var6_6 /* !! */  = ((Map)var6_6 /* !! */ ).get("data")) instanceof Map)) ** GOTO lbl37
                var7_7 /* !! */  = (Map)var6_6 /* !! */ ;
                var6_6 /* !! */  = (String)var7_7 /* !! */ .get("sign");
                if (!((var7_7 /* !! */  = var7_7 /* !! */ .get("timestamp")) instanceof Number)) break block17;
                var3_9 = ((Number)var7_7 /* !! */ ).longValue();
                ** GOTO lbl31
            }
            var2_10 = var7_7 /* !! */  instanceof String;
            if (!var2_10) break block16;
            try {
                var3_9 = Long.parseLong((String)var7_7 /* !! */ );
                ** GOTO lbl31
            }
            catch (NumberFormatException var7_8) {
                ** continue;
            }
        }
lbl29:
        // 2 sources

        while (true) {
            var3_9 = -1L;
lbl31:
            // 3 sources

            if (var6_6 /* !! */  != null && var3_9 != -1L) {
                var5_3 = new g((String)var6_6 /* !! */ , var3_9);
                var1_1.close();
                return var5_3;
            }
lbl37:
            // 4 sources

            com.github.catvod.spider.merge.J.i.d.a("Could not parse sign/timestamp from response: {}", var5_3);
            var1_1.close();
            return null;
            {
                catch (JsonSyntaxException var5_4) {
                    try {
                        com.github.catvod.spider.merge.J.i.d.a("JSON parsing error for sign/timestamp: {}", var5_4.getMessage());
                    }
                    catch (Throwable var5_5) {
                        if (var1_1 != null) {
                            try {
                                var1_1.close();
                            }
                            catch (Throwable var1_2) {
                                var5_5.addSuppressed(var1_2);
                            }
                        }
                        throw var5_5;
                    }
                    var1_1.close();
                    return null;
                }
            }
            break;
        }
    }

    private com.github.catvod.spider.merge.N.g l(HttpUrl object) {
        String string = object.queryParameter("surl");
        Object object2 = string;
        if (string == null) {
            List list = object.pathSegments();
            if (list.contains("s") && list.indexOf("s") + 1 < list.size()) {
                object2 = (String)list.get(list.indexOf("s") + 1);
            } else {
                object2 = string;
                if (list.contains("init")) {
                    object2 = string;
                    if (object.queryParameter("surl") != null) {
                        object2 = object.queryParameter("surl");
                    }
                }
            }
        }
        string = object.queryParameter("pwd");
        if (object2 != null) {
            object = object2;
            if (((String)object2).startsWith("1")) {
                object = object2;
                if (((String)object2).length() > 1) {
                    object = ((String)object2).substring(1);
                }
            }
            if (string == null) {
                d.c("Password 'pwd' not found in URL parameters for surl {}. Verification might fail.", object);
            }
            object2 = new com.github.catvod.spider.merge.N.g(com.github.catvod.spider.merge.B.e.c("https://pan.baidu.com/s/1", (String)object), (String)object, string);
            object = com.github.catvod.spider.merge.C.a.c("parseFinalUrl: ");
            ((StringBuilder)object).append(((com.github.catvod.spider.merge.N.g)object2).b());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return object2;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Could not extract 'surl' from URL: ");
        ((StringBuilder)object2).append(object);
        throw new IllegalArgumentException(((StringBuilder)object2).toString());
    }

    /*
     * Unable to fully structure code
     */
    private com.github.catvod.spider.merge.N.g m(String var1_1) {
        block11: {
            block12: {
                block10: {
                    var2_3 = var1_1.contains("\u63d0\u53d6\u7801") != false ? var1_1.replace("\u63d0\u53d6\u7801:", "?pwd=") : var1_1;
                    var3_5 = HttpUrl.parse((String)var2_3);
                    if (var3_5 == null) break block11;
                    if (var2_3.contains("/wap/")) break block12;
                    var3_5 = new Request.Builder().url((HttpUrl)var3_5).headers(Headers.of(this.a)).get().build();
                    var5_6 = com.github.catvod.spider.merge.J.i.g.newBuilder().followRedirects(false).followSslRedirects(false).build().newCall((Request)var3_5).execute();
                    try {
                        var4_7 = var5_6.header("Location");
                        if (!var5_6.isRedirect() || var4_7 == null) ** GOTO lbl51
                    }
                    catch (Throwable var1_2) {
                        if (var5_6 != null) {
                            try {
                                var5_6.close();
                            }
                            catch (Throwable var2_4) {
                                var1_2.addSuppressed(var2_4);
                            }
                        }
                        throw var1_2;
                    }
                    var3_5 = new StringBuilder();
                    var3_5.append("Redirected from ");
                    var3_5.append((String)var1_1);
                    var3_5.append(" to ");
                    var3_5.append(var4_7);
                    SpiderDebug.log((String)var3_5.toString());
                    var3_5 = var4_7;
                    if (var4_7.startsWith("/")) {
                        var3_5 = new StringBuilder();
                        var3_5.append("https://pan.baidu.com");
                        var3_5.append(var4_7);
                        var3_5 = var3_5.toString();
                    }
                    if (var3_5.equals(var2_3)) break block10;
                    var1_1 = this.m((String)var3_5);
                    var5_6.close();
                    return var1_1;
                }
                var2_3 = new StringBuilder();
                var2_3.append("Redirect loop detected for URL: ");
                var2_3.append((String)var1_1);
                var3_5 = new IOException(var2_3.toString());
                throw var3_5;
lbl51:
                // 1 sources

                if (!var5_6.isSuccessful() && !var5_6.isRedirect()) {
                    var3_5 = new StringBuilder();
                    var3_5.append("Failed to resolve URL ");
                    var3_5.append((String)var1_1);
                    var3_5.append(", status: ");
                    var3_5.append(var5_6.code());
                    var2_3 = new IOException(var3_5.toString());
                    throw var2_3;
                }
                var1_1 = this.l(var5_6.request().url());
                var5_6.close();
                return var1_1;
            }
            return this.l((HttpUrl)var3_5);
        }
        throw new IllegalArgumentException(com.github.catvod.spider.merge.B.e.c("Invalid URL format: ", (String)var1_1));
    }

    private f o(String charSequence) {
        Object object;
        block6: {
            String string;
            try {
                object = new StringBuilder();
                ((StringBuilder)object).append("processSingleLink: ");
                ((StringBuilder)object).append((String)charSequence);
                SpiderDebug.log((String)((StringBuilder)object).toString());
                object = this.j(this.m((String)charSequence));
                if (((com.github.catvod.spider.merge.N.f)object).a() != null) {
                    d.f("Failed to get share token for {}: {}", charSequence, ((com.github.catvod.spider.merge.N.f)object).a());
                    return new f(((com.github.catvod.spider.merge.N.f)object).a());
                }
                if (((com.github.catvod.spider.merge.N.f)object).c() == null) {
                    d.a("Failed to get randsk for {}", charSequence);
                    return new f("Failed to obtain randsk (password likely incorrect or cookie issue)");
                }
                if (((com.github.catvod.spider.merge.N.f)object).b() == null) {
                    d.c("JSToken not found for {}. Previews might not work.", charSequence);
                }
                object = this.e((com.github.catvod.spider.merge.N.f)object);
                string = ((f)object).b;
                boolean bl = string == null;
                if (bl) break block6;
            }
            catch (Exception exception) {
                d.f("Unexpected error processing link: {}", charSequence, exception);
                charSequence = com.github.catvod.spider.merge.C.a.c("Unexpected error: ");
                ((StringBuilder)charSequence).append(exception.getMessage());
                return new f(((StringBuilder)charSequence).toString());
            }
            d.f("Failed to list videos for {}: {}", charSequence, string);
        }
        return object;
    }

    protected final Map<String, Object> b(String string) {
        return r.e("error", string);
    }

    protected final String d(long l2) {
        if (l2 < 0L) {
            return "N/A";
        }
        if (l2 < 1024L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l2);
            stringBuilder.append(" B");
            return stringBuilder.toString();
        }
        double d2 = l2;
        int n2 = (int)(Math.log(d2) / Math.log(1024.0));
        char c2 = "KMGTPE".charAt(Math.min(n2 - 1, 5));
        return String.format("%.1f %sB", d2 / Math.pow(1024.0, n2), Character.valueOf(c2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map<String, Object> f(JsonObject object) {
        Object object2 = new HashMap<String, String>();
        ((HashMap)object2).put("qtype", object.get("qtype").getAsString());
        ((HashMap)object2).put("uk", object.get("uk").getAsString());
        ((HashMap)object2).put("fid", object.get("fid").getAsString());
        ((HashMap)object2).put("shareid", object.get("shareid").getAsString());
        ((HashMap)object2).put("randsk", object.get("randsk").getAsString());
        if (((HashMap)object2).containsKey("qtype") && ((HashMap)object2).containsKey("uk") && ((HashMap)object2).containsKey("fid") && ((HashMap)object2).containsKey("shareid") && (!((String)((HashMap)object2).get("qtype")).equals("original") || ((HashMap)object2).containsKey("randsk"))) {
            String string = String.valueOf(((HashMap)object2).get("qtype"));
            String string2 = String.valueOf(((HashMap)object2).get("surl"));
            Object object3 = String.valueOf(((HashMap)object2).get("uk"));
            String string3 = String.valueOf(((HashMap)object2).get("fid"));
            String string4 = String.valueOf(((HashMap)object2).get("shareid"));
            String string5 = String.valueOf(((HashMap)object2).get("jsToken"));
            object = ((HashMap)object2).containsKey("randsk") ? String.valueOf(((HashMap)object2).get("randsk")) : null;
            try {
                new ArrayList();
                Object object4 = new HashMap();
                boolean bl = "original".equalsIgnoreCase(string);
                if (bl) {
                    if (object == null) {
                        d.e("'randsk' is required for 'original' quality.");
                        return this.b("'randsk' is required for 'original' quality.");
                    }
                    if ((object3 = this.g((String)object3, string4, string3, (String)object, (Map<String, String>)object2)) != null && !((String)object3).isEmpty()) {
                        ((HashMap)object4).put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
                        object = new HashMap();
                        ((HashMap)object).put("parse", 0);
                        ((HashMap)object).put("url", object3);
                        ((HashMap)object).put("header", object4);
                        object2 = (String)((HashMap)object2).get("to");
                        if (object2 != null && !((String)object2).isEmpty()) {
                            if (((String)object2).isEmpty()) {
                                return object;
                            }
                            d.b("Scheduling deletion for path: {}", object2);
                            object3 = f;
                            object4 = new com.github.catvod.spider.merge.I.e(this, object2, 5);
                            object3.schedule((Runnable)object4, 2L, TimeUnit.SECONDS);
                            return object;
                        }
                        d.d();
                        return object;
                    }
                    d.e("Failed to get download URL for original quality.");
                    object = "Failed to get original download URL.";
                    return this.b((String)object);
                } else {
                    object = this.k(string2);
                    if (object != null) {
                        object2 = this.i((String)object3, string3, ((g)object).a, ((g)object).b, string4, string5);
                        ((HashMap)object4).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                        ((HashMap)object4).put("Cookie", j.a(this.b));
                        object = new HashMap();
                        ((HashMap)object).put("parse", 0);
                        ((HashMap)object).put("url", object2);
                        ((HashMap)object).put("header", object4);
                        return object;
                    }
                    d.e("Failed to get sign and timestamp.");
                    object = "Failed to get sign/timestamp.";
                }
                return this.b((String)object);
            }
            catch (Exception exception) {
                d.f("Error getting video URL: {}", exception.getMessage(), exception);
                object = new StringBuilder();
                ((StringBuilder)object).append("Exception during get_video_url: ");
                ((StringBuilder)object).append(exception.getMessage());
                return this.b(((StringBuilder)object).toString());
            }
        }
        d.e("Missing required fields in videoData map.");
        return this.b("Missing required fields in videoData.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h n(List<String> iterator) {
        if (iterator == null) return new h(Collections.emptyList(), Collections.emptyList());
        if (iterator.isEmpty()) {
            return new h(Collections.emptyList(), Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            try {
                Iterator iterator2 = this.o(string);
                CharSequence charSequence = ((f)((Object)iterator2)).b;
                boolean bl = charSequence == null;
                if (bl) {
                    iterator2 = ((f)((Object)iterator2)).a;
                    charSequence = new StringBuilder();
                    if ((iterator2 = ((ArrayList)((Object)iterator2)).iterator()).hasNext()) {
                        while (true) {
                            ((StringBuilder)charSequence).append((CharSequence)iterator2.next());
                            if (!iterator2.hasNext()) break;
                            ((StringBuilder)charSequence).append((CharSequence)"#");
                        }
                    }
                    arrayList2.add(((StringBuilder)charSequence).toString());
                    continue;
                }
                d.f("Failed to process link {}: {}", string, charSequence);
            }
            catch (Exception exception) {
                d.f("Exception processing link {}", string, exception);
            }
        }
        return new h(arrayList, arrayList2);
    }
}

