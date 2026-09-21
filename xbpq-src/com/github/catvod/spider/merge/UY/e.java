/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.UrlQuerySanitizer
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 *  com.github.catvod.spider.ProxyOrigin
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.UY;

import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.h;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.a;
import com.github.catvod.spider.merge.xc.G.c;
import com.github.catvod.spider.merge.xc.G.f;
import com.github.catvod.spider.merge.xc.G.g;
import com.github.catvod.spider.merge.xc.G.i;
import com.github.catvod.spider.merge.xc.G.j;
import com.github.catvod.spider.merge.xc.G.k;
import com.github.catvod.spider.merge.xc.G.l;
import com.github.catvod.spider.merge.xc.G.n;
import com.github.catvod.spider.merge.xc.G.o;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

public final class e {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;
    public final ReentrantLock d;
    public ScheduledExecutorService e;
    public String f;
    public n g;

    public e() {
        InitOrigin.checkPermission();
        this.d = new ReentrantLock();
        this.c = new ArrayList();
        this.b = new HashMap();
        this.a = new HashMap();
    }

    public static HashMap g() {
        return m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) aDrive/6.1.0 Chrome/112.0.5615.165 Electron/24.1.3.7 Safari/537.36", "Referer", "https://www.aliyundrive.com/");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean j(String object) {
        try {
            Object object2 = new JsonObject();
            object2.addProperty("code", (String)object);
            object2.addProperty("grant_type", "authorization_code");
            object = com.github.catvod.spider.merge.UY.e.g();
            ((HashMap)object).put("Content-Type", "application/json; charset=utf-8");
            object = A.k("https://auth.xiaoya.pro/api/ali_open/refresh", object2.toString(), (Map)object);
            object2 = new StringBuilder("OAuth token response: ");
            ((StringBuilder)object2).append(((X)object).b());
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            object2 = ((X)object).b();
            object = new Gson();
            object = object2 = (com.github.catvod.spider.merge.xc.G.h)object.fromJson((String)object2, com.github.catvod.spider.merge.xc.G.h.class);
            if (object2 == null) {
                object = new com.github.catvod.spider.merge.xc.G.h();
            }
            if (((com.github.catvod.spider.merge.xc.G.h)object).b().isEmpty()) return false;
            com.github.catvod.spider.merge.xc.G.c.d().f((com.github.catvod.spider.merge.xc.G.h)object);
            return true;
        }
        catch (Exception exception) {}
        m.m(exception, new StringBuilder("OAuth token failed: "));
        return false;
    }

    public static ArrayList k(i object) {
        object = ((i)object).b();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = object.size() - 1; i2 >= 0; --i2) {
            if (TextUtils.isEmpty((CharSequence)((j)object.get(i2)).c())) continue;
            arrayList.add(((j)object.get(i2)).b());
            arrayList.add(((j)object.get(i2)).c());
            break;
        }
        return arrayList;
    }

    public static ArrayList l(String[] stringArray) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = stringArray[i2];
            if (!string.contains("@@@")) continue;
            Object object = string.split("@@@");
            string = object[0];
            String string2 = object[1];
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append(ProxyOrigin.getUrl());
            ((StringBuilder)object2).append("?do=ali&type=sub&shareId=");
            ((StringBuilder)object2).append(stringArray[0]);
            ((StringBuilder)object2).append("&fileId=");
            ((StringBuilder)object2).append(object[2]);
            object = ((StringBuilder)object2).toString();
            object2 = new h();
            ((h)object2).c(string);
            ((h)object2).a(string2);
            ((h)object2).d((String)object);
            arrayList.add(object2);
        }
        return arrayList;
    }

    public static boolean n(String string) {
        string = new UrlQuerySanitizer(string).getValue("x-oss-expires");
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (Long.parseLong(string) - System.currentTimeMillis() / 1000L <= 60L) {
            bl2 = true;
        }
        return bl2;
    }

    public static String s(JsonObject object, String string) {
        if (!string.startsWith("https")) {
            string = "https://api.aliyundrive.com/".concat(string);
        }
        Object object2 = com.github.catvod.spider.merge.UY.e.g();
        ((HashMap)object2).put("Content-Type", "application/json; charset=utf-8");
        object2 = A.k(string, object.toString(), (Map)object2);
        object = new StringBuilder();
        ((StringBuilder)object).append(((X)object2).a);
        ((StringBuilder)object).append(",");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(",");
        ((StringBuilder)object).append(((X)object2).b());
        SpiderDebug.log((String)((StringBuilder)object).toString());
        return ((X)object2).b();
    }

    public final String a(String string, String string2, boolean bl) {
        Serializable serializable;
        if (!string.startsWith("https")) {
            string = "https://api.aliyundrive.com/".concat(string);
        }
        if (string.contains("file/list")) {
            serializable = com.github.catvod.spider.merge.UY.e.g();
            ((HashMap)serializable).put("x-share-token", this.g.e());
            ((HashMap)serializable).put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
            ((HashMap)serializable).put("Content-Type", "application/json; charset=utf-8");
        } else {
            serializable = this.h();
        }
        X x2 = A.k(string, string2, (Map)((Object)serializable));
        serializable = new StringBuilder();
        int n2 = x2.a;
        ((StringBuilder)serializable).append(n2);
        ((StringBuilder)serializable).append(",");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(",");
        ((StringBuilder)serializable).append(x2.b());
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        if (bl && n2 == 401 && this.t()) {
            return this.a(string, string2, false);
        }
        if (bl && n2 == 429) {
            return this.a(string, string2, false);
        }
        return x2.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        this.f = "";
        Object object = com.github.catvod.spider.merge.xc.G.c.d();
        ((c)object).c().a();
        ((c)object).b().a();
        C.b0("aliyun", ((c)object).toString());
        object = com.github.catvod.spider.merge.xc.G.c.e;
        synchronized (object) {
            com.github.catvod.spider.merge.xc.G.c.d = null;
        }
        this.c.clear();
        this.b.clear();
        this.a.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final l c(String charSequence, String object) {
        block11: {
            Object object2;
            block8: {
                block9: {
                    block10: {
                        Object object3;
                        object2 = this.g;
                        if (object2 == null || ((n)object2).e().isEmpty()) break block10;
                        object2 = object3 = com.github.catvod.spider.merge.xc.G.c.d().a().a();
                        if (((String)object3).isEmpty()) {
                            if (!com.github.catvod.spider.merge.xc.G.c.d().c().f() && !this.t()) {
                                A.m("\u963f\u91cc\u767b\u5f55\u5df2\u8fc7\u671f\uff0c\u8bf7\u91cd\u65b0\u626b\u7801");
                            } else {
                                object2 = this.a("https://user.aliyundrive.com/v2/user/get", "{}", true);
                                c c2 = com.github.catvod.spider.merge.xc.G.c.d();
                                object2 = object3 = (f)new Gson().fromJson((String)object2, f.class);
                                if (object3 == null) {
                                    object2 = new f();
                                }
                                c2.e((f)object2);
                            }
                            object2 = com.github.catvod.spider.merge.xc.G.c.d().a().a();
                        }
                        if (((String)object2).isEmpty()) {
                            A.m("\u963f\u91ccDriveId\u83b7\u53d6\u5931\u8d25");
                            return new l();
                        }
                        object3 = new StringBuilder("{\"requests\":[{\"body\":{\"file_id\":\"");
                        ((StringBuilder)object3).append((String)object);
                        ((StringBuilder)object3).append("\",\"share_id\":\"");
                        ((StringBuilder)object3).append((String)charSequence);
                        ((StringBuilder)object3).append("\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"");
                        charSequence = this.a("adrive/v2/batch", m.h((StringBuilder)object3, (String)object2, "\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}"), true);
                        object = ((com.github.catvod.spider.merge.xc.G.m)new Gson().fromJson((String)charSequence, com.github.catvod.spider.merge.xc.G.m.class)).b().a();
                        if (!((l)object).c().isEmpty()) break block11;
                        object2 = new StringBuilder("\u963f\u91cc: ");
                        try {
                            charSequence = C.K((String)charSequence).getAsJsonObject();
                            if (charSequence.has("message")) {
                                charSequence = charSequence.get("message").getAsString();
                                break block8;
                            }
                            if (!charSequence.has("code")) break block9;
                            charSequence = charSequence.get("code").getAsString();
                            break block8;
                        }
                        catch (Exception exception) {}
                    }
                    A.m("\u963f\u91cc\u5206\u4eabToken\u65e0\u6548");
                    return new l();
                }
                charSequence = "\u8bf7\u6c42\u5931\u8d25";
            }
            ((StringBuilder)object2).append((String)charSequence);
            A.m(((StringBuilder)object2).toString());
        }
        charSequence = new StringBuilder("[AliYun] copy result: domainId=");
        ((StringBuilder)charSequence).append(((l)object).a());
        ((StringBuilder)charSequence).append(", driveId=");
        ((StringBuilder)charSequence).append(((l)object).b());
        ((StringBuilder)charSequence).append(", fileId=");
        ((StringBuilder)charSequence).append(((l)object).c());
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        return object;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        for (String string : new ArrayList(arrayList)) {
            String string2 = com.github.catvod.spider.merge.xc.G.c.d().a().a();
            CharSequence charSequence = new StringBuilder("{\"requests\":[{\"body\":{\"drive_id\":\"");
            charSequence.append(string2);
            charSequence.append("\",\"file_id\":\"");
            charSequence.append(string);
            charSequence.append("\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"");
            if (((com.github.catvod.spider.merge.xc.G.m)new Gson().fromJson((String)(charSequence = this.a("adrive/v2/batch", m.h(charSequence, string, "\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}"), true)), com.github.catvod.spider.merge.xc.G.m.class)).b().c() != 404) continue;
            arrayList.remove(string);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String e(String object, String object2) {
        Throwable throwable2;
        block14: {
            block12: {
                block13: {
                    block11: {
                        HashMap hashMap = this.b;
                        if (hashMap.containsKey(object2) && hashMap.get(object2) != null && !com.github.catvod.spider.merge.UY.e.n((String)hashMap.get(object2))) {
                            object = (String)hashMap.get(object2);
                            object2 = new a(this, 0);
                            break block11;
                        }
                        this.u((String)object);
                        CharSequence charSequence = new StringBuilder("[AliYun] getDownloadUrl(PDS)...");
                        ((StringBuilder)charSequence).append((String)object2);
                        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                        l l2 = this.c((String)object, (String)object2);
                        boolean bl = l2.c().isEmpty();
                        if (bl) {
                            object = new a(this, 0);
                            break block12;
                        }
                        this.c.add(0, l2.c());
                        charSequence = l2.a();
                        String string = l2.b();
                        object = charSequence;
                        if (((String)charSequence).isEmpty()) {
                            object = com.github.catvod.spider.merge.xc.G.c.d().c().d();
                        }
                        charSequence = string;
                        if (string.isEmpty()) {
                            charSequence = com.github.catvod.spider.merge.xc.G.c.d().a().a();
                        }
                        if ((object = this.f((String)object, (String)charSequence, l2.c(), true)) == null || ((String)object).isEmpty()) break block13;
                        hashMap.put(object2, object);
                        object2 = new a(this, 0);
                    }
                    InitOrigin.execute((Runnable)object2);
                    return object;
                }
                try {
                    A.m("\u963f\u91cc\u539f\u753b: \u83b7\u53d6\u4e0b\u8f7d\u94fe\u63a5\u5931\u8d25");
                    object = new a(this, 0);
                    break block12;
                }
                catch (Throwable throwable2) {
                    break block14;
                }
                catch (Exception exception) {}
                {
                    object = new StringBuilder("\u963f\u91cc\u539f\u753b: ");
                    ((StringBuilder)object).append(exception.getMessage());
                    A.m(((StringBuilder)object).toString());
                    object = new a(this, 0);
                }
            }
            InitOrigin.execute((Runnable)object);
            return "";
        }
        InitOrigin.execute((Runnable)new a(this, 0));
        throw throwable2;
    }

    public final String f(String string, String string2, String string3, boolean bl) {
        Object object = m.r("https://", string, ".api.aliyunpds.com/v2/file/get_download_url");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("file_id", string3);
        jsonObject.addProperty("drive_id", string2);
        jsonObject.addProperty("expire_sec", (Number)900);
        Serializable serializable = com.github.catvod.spider.merge.UY.e.g();
        ((HashMap)serializable).put("authorization", com.github.catvod.spider.merge.xc.G.c.d().c().c());
        ((HashMap)serializable).put("Content-Type", "application/json; charset=utf-8");
        object = A.k((String)object, jsonObject.toString(), (Map)((Object)serializable));
        serializable = new StringBuilder("[AliYun] PDS download: ");
        int n2 = ((X)object).a;
        ((StringBuilder)serializable).append(n2);
        ((StringBuilder)serializable).append(",");
        ((StringBuilder)serializable).append(((X)object).b());
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        if (bl && n2 == 401 && this.t()) {
            return this.f(string, string2, string3, false);
        }
        string = ((X)object).b();
        return ((com.github.catvod.spider.merge.xc.G.e)new Gson().fromJson(string, com.github.catvod.spider.merge.xc.G.e.class)).a();
    }

    public final HashMap h() {
        HashMap hashMap = com.github.catvod.spider.merge.UY.e.g();
        Object object = this.g;
        if (object != null && ((n)object).e() != null) {
            hashMap.put("x-share-token", this.g.e());
        }
        hashMap.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        object = com.github.catvod.spider.merge.xc.G.c.d();
        if (object != null && ((c)object).c() != null && ((c)object).c().f()) {
            hashMap.put("authorization", ((c)object).c().c());
        }
        return hashMap;
    }

    public final String i(String string, String string2, String string3) {
        int n2;
        Object object = com.github.catvod.spider.merge.UY.e.k(this.m(string, string2));
        Object object2 = new HashMap<String, String>();
        for (n2 = 0; n2 < ((ArrayList)object).size(); n2 += 2) {
            ((HashMap)object2).put((String)((ArrayList)object).get(n2), (String)((ArrayList)object).get(n2 + 1));
        }
        object2 = (String)((HashMap)object2).get(string3);
        String[] stringArray = A.o((String)object2, null, com.github.catvod.spider.merge.UY.e.g()).split("\n");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        object = new StringBuilder();
        ((StringBuilder)object).append(((String)object2).substring(0, ((String)object2).lastIndexOf("/")));
        ((StringBuilder)object).append("/");
        String string4 = ((StringBuilder)object).toString();
        int n3 = stringArray.length;
        n2 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            object = stringArray[i2];
            int n4 = n2;
            object2 = object;
            if (((String)object).contains("x-oss-expires")) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string4);
                ((StringBuilder)object2).append((String)object);
                hashMap.put(String.valueOf(n2), ((StringBuilder)object2).toString());
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(ProxyOrigin.getUrl());
                ((StringBuilder)object2).append("?do=ali&type=video&cate=%s&shareId=%s&fileId=%s&templateId=%s&mediaId=%s");
                object2 = String.format(((StringBuilder)object2).toString(), "m3u8", string, string2, string3, String.valueOf(n2));
                n4 = n2 + 1;
            }
            arrayList.add(object2);
            n2 = n4;
        }
        this.a.put(string2, hashMap);
        return TextUtils.join((CharSequence)"\n", arrayList);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final i m(String var1_1, String var2_3) {
        block7: {
            try {
                this.u((String)var1_1);
                var3_5 = new StringBuilder("getVideoPreviewPlayInfo...");
                var3_5.append((String)var2_3);
                SpiderDebug.log((String)var3_5.toString());
                var1_1 = this.c((String)var1_1, (String)var2_3);
                if (var1_1.c().isEmpty()) {
                    var1_1 = new i();
                    var2_3 = new a(this, 1);
                }
                ** GOTO lbl-1000
            }
            catch (Throwable var1_2) {
                break block7;
            }
            catch (Exception var2_4) {
                ** GOTO lbl-1000
            }
lbl17:
            // 3 sources

            while (true) {
                InitOrigin.execute((Runnable)var2_3);
                return var1_1;
            }
lbl-1000:
            // 1 sources

            {
                this.c.add(0, var1_1.c());
                var2_3 = new JsonObject();
                var2_3.addProperty("file_id", var1_1.c());
                var1_1 = var1_1.b().isEmpty() != false ? com.github.catvod.spider.merge.xc.G.c.d().a().a() : var1_1.b();
                var2_3.addProperty("drive_id", (String)var1_1);
                var2_3.addProperty("category", "live_transcoding");
                var2_3 = this.q(var2_3.toString(), true);
                var1_1 = new Gson();
                var1_1 = ((k)var1_1.fromJson((String)var2_3, k.class)).a();
                var2_3 = new a(this, 1);
                ** GOTO lbl17
            }
lbl-1000:
            // 1 sources

            {
                var1_1 = new StringBuilder("getVideoPreviewPlayInfo error: ");
                var1_1.append(var2_4.getMessage());
                SpiderDebug.log((String)var1_1.toString());
                var1_1 = new i();
                var2_3 = new a(this, 1);
                ** continue;
            }
        }
        InitOrigin.execute((Runnable)new a(this, 1));
        throw var1_2;
    }

    public final void o(String string, g g2, ArrayList arrayList, ArrayList arrayList2) {
        this.p(string, g2, arrayList, arrayList2, "");
    }

    public final void p(String string, g object, ArrayList arrayList, ArrayList arrayList2, String object2) {
        ArrayList<g> arrayList3 = new ArrayList<g>();
        Object object3 = new JsonObject();
        object3.addProperty("limit", (Number)200);
        object3.addProperty("share_id", string);
        object3.addProperty("parent_file_id", ((g)object).d());
        object3.addProperty("order_by", "name");
        object3.addProperty("order_direction", "ASC");
        if (((String)object2).length() > 0) {
            object3.addProperty("marker", (String)object2);
        }
        object2 = this.a("adrive/v3/file/list", object3.toString(), true);
        g g2 = (g)new Gson().fromJson((String)object2, g.class);
        for (g g3 : g2.e()) {
            if (g3.i().equals("folder")) {
                arrayList3.add(g3);
                continue;
            }
            if (!g3.a().equals("video") && !g3.a().equals("audio")) {
                object3 = g3.c();
                if (!H.c.contains(object3)) continue;
                arrayList2.add(g3);
                continue;
            }
            g3.j(((g)object).f());
            arrayList.add(g3);
        }
        if (g2.g().length() > 0) {
            this.p(string, (g)object, arrayList, arrayList2, g2.g());
        }
        object = arrayList3.iterator();
        while (object.hasNext()) {
            this.o(string, (g)object.next(), arrayList, arrayList2);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String q(String string, boolean bl) {
        int n2;
        X x2;
        block13: {
            boolean bl2;
            block12: {
                block10: {
                    Exception exception222;
                    block11: {
                        block14: {
                            Object object;
                            block15: {
                                Object object2;
                                Serializable serializable;
                                block16: {
                                    object = com.github.catvod.spider.merge.UY.e.g();
                                    ((HashMap)object).put("authorization", com.github.catvod.spider.merge.xc.G.c.d().b().c());
                                    ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
                                    ((HashMap)object).put("Content-Type", "application/json; charset=utf-8");
                                    x2 = A.k("https://open.aliyundrive.com/adrive/v1.0/openFile/getVideoPreviewPlayInfo", string, (Map)object);
                                    object = new StringBuilder();
                                    n2 = x2.a;
                                    ((StringBuilder)object).append(n2);
                                    ((StringBuilder)object).append(",https://open.aliyundrive.com/adrive/v1.0/openFile/getVideoPreviewPlayInfo,");
                                    ((StringBuilder)object).append(x2.b());
                                    SpiderDebug.log((String)((StringBuilder)object).toString());
                                    if (!bl || n2 != 400 && n2 != 401) break block13;
                                    if (!com.github.catvod.spider.merge.xc.G.c.d().c().f()) {
                                        SpiderDebug.log((String)"No access_token, try refresh first");
                                        if (!this.t()) break block10;
                                        com.github.catvod.spider.merge.xc.G.c.d();
                                    }
                                    object = new JsonObject();
                                    object.addProperty("authorize", (Number)1);
                                    object.addProperty("scope", "user:base,file:all:read,file:all:write");
                                    serializable = com.github.catvod.spider.merge.UY.e.g();
                                    ((HashMap)serializable).put("authorization", com.github.catvod.spider.merge.xc.G.c.d().c().c());
                                    ((HashMap)serializable).put("x-canary", "client=Android,app=adrive,version=v4.3.1");
                                    ((HashMap)serializable).put("Content-Type", "application/json; charset=utf-8");
                                    SpiderDebug.log((String)"OAuth authorize request: https://open.aliyundrive.com/oauth/users/authorize?client_id=10e184c407cb4d8087f9d3b8f1fd2c23&redirect_uri=https://opentoken.xiaoya.pro/callback&scope=user:base,file:all:read,file:all:write&state=");
                                    object = A.k("https://open.aliyundrive.com/oauth/users/authorize?client_id=10e184c407cb4d8087f9d3b8f1fd2c23&redirect_uri=https://opentoken.xiaoya.pro/callback&scope=user:base,file:all:read,file:all:write&state=", object.toString(), (Map)((Object)serializable));
                                    serializable = new StringBuilder("OAuth authorize response: ");
                                    ((StringBuilder)serializable).append(((X)object).b());
                                    SpiderDebug.log((String)((StringBuilder)serializable).toString());
                                    object = C.K(((X)object).b()).getAsJsonObject();
                                    if (!object.has("redirectUri")) break block14;
                                    object2 = object.get("redirectUri").getAsString();
                                    serializable = null;
                                    object = serializable;
                                    if (object2 == null) break block15;
                                    {
                                        catch (Exception exception222) {
                                            break block11;
                                        }
                                    }
                                    if (((String)object2).contains("code=")) break block16;
                                    object = serializable;
                                    break block15;
                                }
                                object2 = ((String)object2).split("code=");
                                object = serializable;
                                if (((String[])object2).length <= 1) break block15;
                                object = object2 = object2[1];
                                try {
                                    if (!((String)object2).contains("&")) break block15;
                                    object = ((String)object2).substring(0, ((String)object2).indexOf("&"));
                                }
                                catch (Exception exception3) {
                                    object2 = new StringBuilder("extractCodeFromUri error: ");
                                    m.m(exception3, (StringBuilder)object2);
                                    object = serializable;
                                }
                            }
                            if (object != null && !((String)object).isEmpty()) {
                                SpiderDebug.log((String)"Got authorize code: ".concat((String)object));
                                bl2 = com.github.catvod.spider.merge.UY.e.j((String)object);
                                break block12;
                            }
                        }
                        SpiderDebug.log((String)"OAuth authorize failed, no code in response");
                        break block10;
                    }
                    m.m(exception222, new StringBuilder("getOAuthByAuthorize failed: "));
                }
                bl2 = false;
            }
            if (bl2) {
                return this.q(string, false);
            }
        }
        if (bl && n2 == 429) {
            return this.q(string, false);
        }
        return x2.b();
    }

    public final String r(String object, String[] object2) {
        if (((String)(object = ((String)object).split("#")[0])).equals("\u963f\u91cc\u667a")) {
            Object object32 = this.m(object2[0], object2[1]);
            object = com.github.catvod.spider.merge.UY.e.k((i)object32);
            object2 = com.github.catvod.spider.merge.UY.e.l((String[])object2);
            Object object4 = new ArrayList();
            for (Object object32 : ((i)object32).a()) {
                object32.getClass();
                h h2 = new h();
                h2.d(((j)object32).c());
                h2.c(((j)object32).a());
                h2.b(((j)object32).a());
                h2.a("vtt");
                ((ArrayList)object4).add(h2);
            }
            ((ArrayList)object2).addAll(object4);
            object4 = new com.github.catvod.spider.merge.MP.g();
            ((com.github.catvod.spider.merge.MP.g)object4).x((ArrayList)object);
            ((com.github.catvod.spider.merge.MP.g)object4).h();
            ((com.github.catvod.spider.merge.MP.g)object4).v((ArrayList)object2);
            ((com.github.catvod.spider.merge.MP.g)object4).g(com.github.catvod.spider.merge.UY.e.g());
            return ((com.github.catvod.spider.merge.MP.g)object4).toString();
        }
        if (((String)object).equals("\u963f\u91cc\u539f")) {
            object = this.e(object2[0], object2[1]);
            if (((String)object).isEmpty()) {
                return "";
            }
            int n2 = B.p("ali");
            object = B.y((String)object, com.github.catvod.spider.merge.UY.e.g(), n2, "ali");
            com.github.catvod.spider.merge.MP.g g2 = new com.github.catvod.spider.merge.MP.g();
            g2.w((String)object);
            g2.j();
            g2.v(com.github.catvod.spider.merge.UY.e.l((String[])object2));
            g2.g(com.github.catvod.spider.merge.UY.e.g());
            return g2.toString();
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean t() {
        ScheduledExecutorService scheduledExecutorService;
        Exception exception2;
        block9: {
            Object object;
            Object object2;
            Object object3;
            block8: {
                try {
                    SpiderDebug.log((String)"refreshAccessToken...");
                    object3 = new JsonObject();
                    object = object2 = com.github.catvod.spider.merge.xc.G.c.d().c().e();
                    if (!((String)object2).isEmpty()) break block8;
                    object = this.f;
                }
                catch (Exception exception2) {
                    break block9;
                }
            }
            object2 = object;
            if (object != null) {
                object2 = object;
                if (((String)object).startsWith("http")) {
                    object2 = A.o((String)object, null, null).trim();
                }
            }
            if (object2 != null && !((String)object2).isEmpty()) {
                object3.addProperty("refresh_token", (String)object2);
                object3.addProperty("grant_type", "refresh_token");
                object3 = com.github.catvod.spider.merge.UY.e.s(object3, "https://auth.aliyundrive.com/v2/account/token");
                object = new Gson();
                object = object2 = (o)object.fromJson((String)object3, o.class);
                if (object2 == null) {
                    object = new o();
                }
                if (!((o)object).b().isEmpty()) {
                    com.github.catvod.spider.merge.xc.G.c.d().g((o)object);
                    object2 = new StringBuilder("refreshAccessToken success, accessToken length: ");
                    ((StringBuilder)object2).append(((o)object).b().length());
                    SpiderDebug.log((String)((StringBuilder)object2).toString());
                    return true;
                }
                object = new StringBuilder("refreshAccessToken failed: ");
                ((StringBuilder)object).append((String)object3);
                SpiderDebug.log((String)((StringBuilder)object).toString());
                object = new Exception((String)object3);
                throw object;
            }
            SpiderDebug.log((String)"refreshAccessToken: no refresh_token available");
            return false;
        }
        m.m(exception2, new StringBuilder("refreshAccessToken error: "));
        if (exception2 instanceof TimeoutException && (scheduledExecutorService = this.e) != null) {
            scheduledExecutorService.shutdownNow();
        }
        return false;
    }

    public final void u(String string) {
        Object object = this.g;
        if (object != null && ((n)object).a(string)) {
            return;
        }
        SpiderDebug.log((String)"refreshShareToken...");
        object = new JsonObject();
        object.addProperty("share_id", string);
        object.addProperty("share_pwd", "");
        object = com.github.catvod.spider.merge.UY.e.s((JsonObject)object, "v2/share_link/get_share_token");
        object = (n)new Gson().fromJson((String)object, n.class);
        ((n)object).f(string);
        ((n)object).q = System.currentTimeMillis() + 3600000L;
        this.g = object;
    }
}

