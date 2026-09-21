/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.e1;
import com.github.catvod.spider.merge.I.q0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.K.i;
import com.github.catvod.spider.merge.b0.a;
import com.github.catvod.spider.merge.b0.c;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class f1 {
    private static Map<String, String> e;
    private static Map<String, String> f;
    private final Map<String, String> a;
    private final Map<String, String> b;
    public c c;
    private String d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    f1() {
        HashMap<String, String> hashMap;
        try {
            hashMap = com.github.catvod.spider.merge.c1.d.m(com.github.catvod.spider.merge.c.b.e("115_user"));
            Gson gson = new Gson();
            c c2 = (c)gson.fromJson((String)((Object)hashMap), c.class);
            hashMap = c2;
            if (c2 == null) {
                hashMap = new HashMap<String, String>();
            }
            this.c = hashMap;
        }
        catch (Exception exception) {
            m.y("115\u6388\u6743\u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u5220\u9664\u6839\u76ee\u5f55TV\u6587\u4ef6\u5939\u4e0b\u6388\u6743\u6587\u4ef6\u540e\u91cd\u8bd5");
        }
        hashMap = com.github.catvod.spider.merge.C.a.c("uc QuarkPanApi constructor user:");
        ((StringBuilder)((Object)hashMap)).append(this.c);
        SpiderDebug.log((String)((StringBuilder)((Object)hashMap)).toString());
        hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("4K", "4k");
        hashMap.put("2k", "2k");
        hashMap.put("\u8d85\u6e05", "super");
        hashMap.put("\u9ad8\u6e05", "high");
        hashMap.put("\u6a19\u6e05", "low");
        hashMap.put("\u6d41\u66a2", "normal");
        this.d = "4kz|4k|2k|super|high|low";
        hashMap = new HashMap<String, String>();
        this.b = hashMap;
        hashMap.put("4kz", "115\u539f\u756b");
        hashMap.put("4k", "4K");
        hashMap.put("2k", "2K");
        hashMap.put("super", "\u9ad8\u6e05");
        hashMap.put("high", "\u6a19\u6e05");
        hashMap.put("low", "\u6d41\u66a2");
        hashMap.put("normal", "\u666e\u901a");
        hashMap.put("auto", "115\u79d2\u4f20\u963f\u91cc");
        e = new HashMap<String, String>(512);
        f = new HashMap<String, String>(4096);
    }

    private String b(String object, List<a> object2) {
        Object object3 = new ArrayList<Object>();
        String string = m.z((String)object).toLowerCase();
        Iterator<a> iterator = object2.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            String string2 = m.z(((a)object).k()).toLowerCase();
            if (!string.contains(string2) && !string2.contains(string)) continue;
            ((ArrayList)object3).add(object);
        }
        if (((ArrayList)object3).isEmpty()) {
            ((ArrayList)object3).addAll(object2);
        }
        object = new StringBuilder();
        object2 = ((ArrayList)object3).iterator();
        while (object2.hasNext()) {
            object3 = (a)object2.next();
            ((HashMap)f).put(((a)object3).i(), ((a)object3).m());
            ((StringBuilder)object).append("+");
            ((StringBuilder)object).append(m.z(((a)object3).k()));
            ((StringBuilder)object).append("@@@");
            ((StringBuilder)object).append(((a)object3).h());
            ((StringBuilder)object).append("@@@");
            ((StringBuilder)object).append(((a)object3).b());
        }
        return ((StringBuilder)object).toString();
    }

    public static f1 c() {
        return e1.a;
    }

    private String d(String string) {
        String string2 = string.startsWith("https") ? string : com.github.catvod.spider.merge.B.e.c("https://115cdn.com/webapi/", string);
        Serializable serializable = new HashMap<String, List<String>>();
        HashMap<String, String> hashMap = this.e();
        string = null;
        for (int i2 = 2; i2 > 0; --i2) {
            string = com.github.catvod.spider.merge.f0.d.l(string2, hashMap, serializable);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("quark get result:");
            stringBuilder.append(string);
            SpiderDebug.log((String)stringBuilder.toString());
            if (string.length() > 10) break;
            Thread.sleep(500L);
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("115 get url:");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(" headers:");
        ((StringBuilder)serializable).append(hashMap);
        ((StringBuilder)serializable).append(" newcookie: result:");
        ((StringBuilder)serializable).append(string);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void i(JSONObject object) {
        try {
            long l2 = object.getJSONObject("shareinfo").getLong("expire_time");
            if (l2 == -1L) return;
            object = new Date();
            if (((Date)object).getTime() / 1000L <= l2) return;
            m.y("115\u5206\u4eab\u94fe\u63a5\u5df2\u7ecf\u8fc7\u671f \u53ef\u80fd\u83b7\u53d6\u4e0d\u5230\u64ad\u653e\u5730\u5740");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(HashMap<String, String> var1_1, boolean var2_5, a var3_6, List<a> var4_7, List<a> var5_8, List<a> var6_9, String var7_10, String var8_11) {
        block14: {
            if (var2_5) {
                try {
                    var6_9 = new ArrayList<Object>();
                }
                catch (Exception var1_2) {
                    break block14;
                }
            }
            var9_12 = new StringBuilder();
            var9_12.append("listFiles >> ");
            var9_12.append(var1_1);
            SpiderDebug.log((String)var9_12.toString());
            var9_12 = new StringBuilder();
            var9_12.append("share/snap?share_code=");
            var9_12.append(var7_10);
            var9_12.append("&offset=0&receive_code=");
            var9_12.append(var8_11);
            var9_12.append("&cid=");
            var9_12.append(var3_6.l());
            var9_12.append("&limit=9999&asc=1&o=file_name");
            var9_12 = var9_12.toString();
            var9_12 = this.d((String)var9_12);
            var10_13 = new StringBuilder();
            var10_13.append("listFiles >> ");
            var10_13.append((String)var9_12);
            SpiderDebug.log((String)var10_13.toString());
            var10_13 = new JSONObject((String)var9_12);
            var10_13 = var10_13.getJSONObject("data").toString();
            var9_12 = new Gson();
            var9_12 = (a)var9_12.fromJson((String)var10_13, a.class);
            {
                catch (Exception var1_3) {
                    // empty catch block
                    break block14;
                }
                try {
                    if (!var9_12.j().isEmpty()) {
                        var11_14 = var9_12.j();
                        var10_13 = new com.github.catvod.spider.merge.b0.b();
                        Collections.sort(var11_14, var10_13);
                    }
                    ** GOTO lbl58
                }
                catch (Exception var11_15) {}
                {
                    var10_13 = new StringBuilder();
                    var10_13.append("listFiles error");
                    var10_13.append(var11_15.getMessage());
                    m.y(var10_13.toString());
lbl58:
                    // 6 sources

                    for (Object var9_12 : var9_12.j()) {
                        if ("folder".equals(var9_12.r())) {
                            var6_9.add(var9_12);
                            continue;
                        }
                        if (var9_12.o() != null && (BaseApi.get().d.booleanValue() || com.github.catvod.spider.merge.R0.e.d(m.n(var9_12.k())))) {
                            var9_12.s(var3_6.k());
                            var4_7.add((a)var9_12);
                            continue;
                        }
                        if (!m.t(var9_12.h())) continue;
                        var5_8.add((a)var9_12);
                    }
                    if (!var2_5) return;
                    var3_6 = var6_9.iterator();
                    while (var3_6.hasNext()) {
                        this.j(var1_1, var2_5, (a)var3_6.next(), var4_7, var5_8, null, var7_10, var8_11);
                    }
                    return;
                }
            }
        }
        var1_4.printStackTrace();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(String string) {
        if (com.github.catvod.spider.merge.R0.e.b(this.c.b)) {
            return;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(t.a.c);
            stringBuilder.append("/api/clean115/?pwd=");
            stringBuilder.append(URLEncoder.encode(this.c.b));
            stringBuilder.append("&cookie=");
            stringBuilder.append(URLEncoder.encode(this.c.b()));
            stringBuilder.append("&fileName=");
            stringBuilder.append(URLEncoder.encode(string));
            com.github.catvod.spider.merge.f0.d.k(stringBuilder.toString());
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final HashMap<String, String> e() {
        HashMap hashMap = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://115.com/");
        hashMap.put("Cookie", this.c.b());
        return hashMap;
    }

    public final List<g> f(String[] stringArray) {
        ArrayList<g> arrayList = new ArrayList<g>();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = stringArray[i2];
            if (!((String)object).contains("@@@")) continue;
            Object object2 = ((String)object).split("@@@");
            String string = object2[0];
            object = object2[1];
            Object object3 = new StringBuilder();
            ((StringBuilder)object3).append(Proxy.getUrl());
            ((StringBuilder)object3).append("?do=quark&type=sub&share_id=");
            ((StringBuilder)object3).append(stringArray[0]);
            ((StringBuilder)object3).append("&file_id=");
            ((StringBuilder)object3).append(object2[2]);
            object2 = ((StringBuilder)object3).toString();
            object3 = new g();
            ((g)object3).b(string);
            object = ((g)object3).a((String)object);
            ((g)object).c((String)object2);
            arrayList.add((g)object);
        }
        return arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h g(String charSequence, String object, String iterator, String string, String iterator2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object2 = this.d.split("\\|");
        boolean bl = false;
        int n2 = 0;
        for (int i2 = 0; i2 < ((String[])object2).length; ++i2) {
            int n3;
            boolean bl2;
            if (!object2[i2].equals("4k") && !object2[i2].equals("4kz")) {
                bl2 = bl;
                n3 = n2;
                if (!bl) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)((HashMap)this.b).get("auto"));
                    stringBuilder.append("");
                    arrayList.add(stringBuilder.toString());
                    bl2 = true;
                    n3 = n2;
                }
            } else {
                bl2 = bl;
                n3 = n2;
                if (n2 == 0) {
                    arrayList.add("115\u539f\u756b");
                    n3 = 1;
                    bl2 = bl;
                }
            }
            bl = bl2;
            n2 = n3;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("share/snap?share_code=");
            stringBuilder.append((String)object);
            stringBuilder.append("&offset=0&receive_code=");
            stringBuilder.append((String)((Object)iterator2));
            stringBuilder.append("&cid=");
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("&asc=1&o=file_name");
            object2 = this.d(stringBuilder.toString());
            JSONObject jSONObject2 = new JSONObject((String)object2);
            jSONObject2 = jSONObject2.getJSONObject("data");
            if (com.github.catvod.spider.merge.R0.e.b(string)) {
                string = m.A(jSONObject2.getJSONObject("shareinfo").getString("share_title"));
                f1.i(jSONObject2);
            }
            Object object3 = new ArrayList();
            ArrayList<a> arrayList2 = new ArrayList<a>();
            object2 = new a((String)((Object)iterator));
            this.j(null, true, (a)object2, (List<a>)object3, (List<a>)arrayList2, null, (String)object, (String)((Object)iterator2));
            object2 = new ArrayList();
            iterator = new Iterator();
            Iterator<a> iterator3 = ((ArrayList)object3).iterator();
            while (iterator3.hasNext()) {
                object3 = iterator3.next();
                ((HashMap)f).put(((a)object3).i(), ((a)object3).m());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(((a)object3).e());
                stringBuilder2.append("$");
                stringBuilder2.append((String)object);
                stringBuilder2.append("_");
                stringBuilder2.append((String)((Object)iterator2));
                stringBuilder2.append('+');
                stringBuilder2.append(((a)object3).i());
                stringBuilder2.append('+');
                stringBuilder2.append(m.A(string));
                stringBuilder2.append('+');
                stringBuilder2.append(((a)object3).k());
                stringBuilder2.append('+');
                stringBuilder2.append(((a)object3).n());
                stringBuilder2.append('+');
                stringBuilder2.append(((a)object3).m());
                stringBuilder2.append(this.b(((a)object3).k(), arrayList2));
                ((ArrayList)object2).add(stringBuilder2.toString());
            }
            for (n2 = 0; n2 < arrayList.size(); ++n2) {
                object = new StringBuilder();
                iterator2 = ((ArrayList)object2).iterator();
                if (iterator2.hasNext()) {
                    while (true) {
                        ((StringBuilder)object).append((CharSequence)iterator2.next());
                        if (!iterator2.hasNext()) break;
                        ((StringBuilder)object).append((CharSequence)"#");
                    }
                }
                ((ArrayList)((Object)iterator)).add(((StringBuilder)object).toString());
            }
        }
        catch (Exception exception) {
            return BaseApi.fakeVod(arrayList, "115\u96f2\u76e4");
        }
        {
            object = new h();
            ((h)object).l((String)charSequence);
            ((h)object).j((String)charSequence);
            ((h)object).n("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            ((h)object).m(string);
            charSequence = new StringBuilder();
            iterator = ((ArrayList)((Object)iterator)).iterator();
            boolean bl3 = iterator.hasNext();
            if (bl3) {
                while (true) {
                    ((StringBuilder)charSequence).append((CharSequence)iterator.next());
                    if (!iterator.hasNext()) break;
                    ((StringBuilder)charSequence).append((CharSequence)"$$$");
                }
            }
            ((h)object).p(((StringBuilder)charSequence).toString());
            charSequence = new StringBuilder();
            iterator = arrayList.iterator();
            if (iterator.hasNext()) {
                while (true) {
                    ((StringBuilder)charSequence).append((CharSequence)iterator.next());
                    if (!iterator.hasNext()) break;
                    ((StringBuilder)charSequence).append((CharSequence)"$$$");
                }
            }
            ((h)object).o(((StringBuilder)charSequence).toString());
            ((h)object).g("115\u96f2\u76e4");
            return object;
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<h> h(i object) {
        void var4_10;
        Object object2;
        ArrayList<a> arrayList;
        Serializable serializable;
        String string;
        Object object3;
        String string2;
        Object object4;
        Object object5;
        block14: {
            block13: {
                ArrayList<a> arrayList2;
                String string3;
                block15: {
                    object5 = ((i)object).d();
                    object4 = ((i)object).c();
                    string3 = ((i)object).f();
                    string2 = ((i)object).e();
                    boolean bl = com.github.catvod.spider.merge.R0.e.b(((i)object).b());
                    object3 = "0";
                    string = bl ? "0" : ((i)object).b();
                    serializable = ((i)object).a();
                    arrayList = new ArrayList();
                    object2 = new ArrayList();
                    object = object3;
                    if (!com.github.catvod.spider.merge.R0.e.c(string)) {
                        object = string;
                    }
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("share/snap?share_code=");
                    ((StringBuilder)object3).append((String)object4);
                    ((StringBuilder)object3).append("&offset=0&receive_code=");
                    ((StringBuilder)object3).append((String)object5);
                    ((StringBuilder)object3).append("&cid=");
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append("&asc=1&o=file_name");
                    object3 = ((StringBuilder)object3).toString();
                    object = string3;
                    try {}
                    catch (Exception exception) {
                        object3 = arrayList;
                        break block13;
                    }
                    break block15;
                    catch (Exception exception) {
                        object3 = arrayList;
                        object = string3;
                    }
                    break block13;
                }
                String string4 = this.d((String)object3);
                object = string3;
                object = string3;
                object3 = new JSONObject(string4);
                object = string3;
                string4 = object3.getJSONObject("data");
                object3 = string3;
                object = string3;
                if (com.github.catvod.spider.merge.R0.e.b(string3)) {
                    object = string3;
                    object = object3 = string4.getJSONObject("shareinfo").getString("share_title");
                    f1.i((JSONObject)string4);
                }
                object = object3;
                try {
                    arrayList2 = new ArrayList<a>();
                }
                catch (Exception exception) {
                    object3 = arrayList;
                    break block13;
                }
                try {
                    arrayList = new ArrayList<a>();
                    object3 = new a(string);
                    this.j((HashMap<String, String>)serializable, false, (a)object3, arrayList2, arrayList, (List<a>)object2, (String)object4, (String)object5);
                    break block14;
                }
                catch (Exception exception) {
                    object3 = arrayList2;
                }
            }
            ArrayList<h> arrayList3 = object3;
        }
        object3 = new ArrayList<h>();
        object2 = ((ArrayList)object2).iterator();
        while (object2.hasNext()) {
            object5 = (a)object2.next();
            arrayList = new h();
            serializable = r.d((String)object4, "*#");
            ((StringBuilder)serializable).append(((a)object5).l());
            ((StringBuilder)serializable).append("*#");
            ((StringBuilder)serializable).append(((a)object5).k());
            ((h)((Object)arrayList)).l(((StringBuilder)serializable).toString());
            ((h)((Object)arrayList)).m(((a)object5).k());
            ((h)((Object)arrayList)).r(((a)object5).r());
            ((ArrayList)object3).add(arrayList);
        }
        arrayList = var4_10.iterator();
        while (arrayList.hasNext()) {
            a a2 = (a)arrayList.next();
            object4 = new h();
            ((h)object4).l(r.b(string2, "_", string, "*#", (String)object));
            ((h)object4).m(a2.e());
            ((h)object4).r(a2.r());
            ((h)object4).n(a2.q());
            ((ArrayList)object3).add(object4);
        }
        return object3;
    }

    /*
     * Unable to fully structure code
     */
    public final String k(String[] var1_1, String var2_2) {
        block13: {
            block15: {
                block14: {
                    try {
                        var3_4 = Server.l;
                    }
                    catch (Exception var2_3) {
                        var1_1 = com.github.catvod.spider.merge.C.a.c("yun115 api error");
                        var1_1.append(var2_3.getMessage());
                        SpiderDebug.log((String)var1_1.toString());
                        var1_1 = new f();
                        var1_1.w("4234234");
                        return var1_1.toString();
                    }
                    try {
                        var4_5 = com.github.catvod.spider.merge.R0.e.d(com.github.catvod.spider.merge.f0.d.p("http://127.0.0.1:9975/proxy", 1L));
                    }
                    catch (Exception var5_6) {
                        var4_5 = false;
                    }
                    if (var4_5) ** GOTO lbl20
                    Thread.sleep(2000L);
lbl20:
                    // 2 sources

                    if (!(var4_5 = NetPan.isYunSelf115((String)var1_1[0]))) ** GOTO lbl35
                    var5_7 = new StringBuilder();
                    var5_7.append(t.a.c);
                    var5_7.append("/api/downloadByFileId/?fileId=");
                    var5_7.append(URLEncoder.encode((String)var1_1[1]));
                    var5_7.append("&cookie=");
                    var5_7.append(URLEncoder.encode(this.c.b()));
                    var5_7 = var5_7.toString();
                    break block14;
lbl35:
                    // 1 sources

                    var5_7 = new StringBuilder();
                    var5_7.append(t.a.c);
                    var5_7.append("/api/downloadByShareCode/?shareId=");
                    var5_7.append(URLEncoder.encode(var1_1[0].split("_")[0]));
                    var5_7.append("&pwd=");
                    var5_7.append(URLEncoder.encode(var1_1[0].split("_")[1]));
                    var5_7.append("&fileId=");
                    var5_7.append(URLEncoder.encode((String)var1_1[1]));
                    var5_7.append("&cookie=");
                    var5_7.append(URLEncoder.encode(this.c.b()));
                    var5_7 = var5_7.toString();
                }
                if (!com.github.catvod.spider.merge.R0.e.b((CharSequence)f1.e.get(var5_7))) ** GOTO lbl69
                var6_8 = com.github.catvod.spider.merge.f0.d.k((String)var5_7);
                var8_9 = var6_8.split("\\*#")[0];
                var7_10 = var6_8.split("\\*#")[1];
                if (!var7_10.startsWith("https")) ** GOTO lbl69
                var6_8 = var7_10;
                if (NetPan.isYunSelf115((String)var1_1[0])) {
                    var6_8 = Server.F((String)var7_10);
                }
                f1.e.put((String)((CharSequence)var5_7), (String)var6_8);
                var6_8 = new q0(this, var1_1, var8_9, 1);
                Init.execute((Runnable)var6_8);
lbl69:
                // 3 sources

                var6_8 = (String)f1.e.get(var5_7);
                var5_7 = new StringBuilder();
                var5_7.append((String)var1_1[2]);
                var5_7.append((String)var1_1[3]);
                var5_7 = var5_7.toString();
                if (!var2_2.contains("\u963f\u91cc")) break block13;
                var7_10 = f1.e;
                var8_9 = new StringBuilder();
                var8_9.append("\u963f\u91cc");
                var8_9.append((String)var1_1[1]);
                if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)var7_10.get(var8_9.toString()))) break block15;
                var6_8 = f1.e;
                var5_7 = new StringBuilder();
                var5_7.append("\u963f\u91cc");
                var5_7.append((String)var1_1[1]);
                var5_7 = (String)var6_8.get(var5_7.toString());
                ** GOTO lbl119
            }
            var5_7 = var6_8 = t.a.m((String)var5_7, (String)var6_8, (long)Double.parseDouble((String)var1_1[4]), (String)var1_1[5]);
            if (com.github.catvod.spider.merge.R0.e.d((CharSequence)var6_8)) {
                var5_7 = f1.e;
                var7_10 = new StringBuilder();
                var7_10.append("\u963f\u91cc");
                var7_10.append((String)var1_1[1]);
                var5_7.put((String)var7_10.toString(), (Object)var6_8);
                var5_7 = var6_8;
            }
            ** GOTO lbl119
        }
        if (BaseApi.get().d.booleanValue()) {
            BaseApi.get().downloadFileWithDownloadManager((String)var6_8, (String)var5_7, this.e());
            var6_8 = new StringBuilder();
            var6_8.append("\u6b63\u5728\u4e0b\u8f7d ");
            var6_8.append((String)var5_7);
            m.y(var6_8.toString());
            var5_7 = Server.B();
        } else {
            var5_7 = NetPan.getIsoDownloadUrl((String)var6_8);
        }
lbl119:
        // 4 sources

        var6_8 = new f();
        var6_8.w((String)var5_7);
        var6_8.b(t.a.r((String[])var1_1));
        var6_8.j();
        var6_8.v(this.f((String[])var1_1));
        var1_1 = var2_2.contains("\u963f\u91cc") != false ? t.a.v() : this.e();
        var6_8.g((Map<String, String>)var1_1);
        var1_1 = var6_8.toString();
        return var1_1;
    }

    public final void l(String string, boolean bl) {
        if (com.github.catvod.spider.merge.R0.e.c(this.c.b()) || bl) {
            com.github.catvod.spider.merge.B.e.d("set new Cookie:", string);
            String string2 = string;
            if (string != null) {
                string2 = string;
                if (string.startsWith("http")) {
                    string2 = com.github.catvod.spider.merge.f0.d.k(string).trim();
                }
            }
            if (com.github.catvod.spider.merge.R0.e.d(string2)) {
                c c2 = this.c;
                string = string2;
                if (string2.endsWith(";")) {
                    string = string2.substring(0, string2.length() - 1);
                }
                c2.d(string);
                this.c.c();
                e = new HashMap<String, String>(512);
                f = new HashMap<String, String>(4096);
            }
        }
    }
}

