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
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.U0;
import com.github.catvod.spider.merge.I.p0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.K.i;
import com.github.catvod.spider.merge.Y.a;
import com.github.catvod.spider.merge.Y.b;
import com.github.catvod.spider.merge.Y.c;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public final class V0 {
    private static Map<String, a> e;
    private static Map<String, String> f;
    private final Map<String, String> a;
    private final Map<String, String> b;
    public c c;
    private String d;

    V0() {
        new ReentrantLock(true);
        new ReentrantLock(true);
        new ArrayList();
        c c2 = (c)com.github.catvod.spider.merge.G1.d.a(com.github.catvod.spider.merge.c1.d.m(com.github.catvod.spider.merge.c.b.e("115_user")), c.class);
        HashMap<String, String> hashMap = c2;
        if (c2 == null) {
            hashMap = new c();
        }
        this.c = hashMap;
        hashMap = com.github.catvod.spider.merge.C.a.c("uc QuarkPanApi constructor user:");
        ((StringBuilder)((Object)hashMap)).append(this.c);
        SpiderDebug.log((String)((StringBuilder)((Object)hashMap)).toString());
        hashMap = new HashMap<String, String>();
        this.a = hashMap;
        hashMap.put("4K", "4k");
        hashMap.put("2k", "2k");
        hashMap.put("\u8d85\u6e05", "super");
        hashMap.put("\u9ad8\u6e05", "high");
        hashMap.put("\u6a19\u6e05", "low");
        hashMap.put("\u6d41\u66a2", "normal");
        this.d = "4kz|4k|2k|super|high|low";
        hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put("4kz", "115\u539f\u756b");
        hashMap.put("4k", "4K");
        hashMap.put("2k", "2K");
        hashMap.put("super", "\u9ad8\u6e05");
        hashMap.put("high", "\u6a19\u6e05");
        hashMap.put("low", "\u6d41\u66a2");
        hashMap.put("normal", "\u666e\u901a");
        hashMap.put("auto", "115\u79d2\u4f20\u963f\u91cc");
        new HashMap(128);
        new HashMap(512);
        f = new HashMap<String, String>(4096);
        e = new HashMap<String, a>(4096);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(String object, List<String> object2) {
        Serializable serializable;
        object2 = ((String)object2.get(0)).trim().split("_");
        Object object3 = object2[0];
        com.github.catvod.spider.merge.B.e.d("115 detailContent url:", (String)object3);
        Iterator iterator = U0.a;
        object2 = ((Object)object2).length > 1 ? object2[1] : "0";
        Objects.requireNonNull(iterator);
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object4 = ((V0)((Object)iterator)).d.split("\\|");
        boolean bl = false;
        int n2 = 0;
        for (int i2 = 0; i2 < ((String[])object4).length; ++i2) {
            int n3;
            boolean bl2;
            if (!object4[i2].equals("4k") && !object4[i2].equals("4kz")) {
                bl2 = bl;
                n3 = n2;
                if (!bl) {
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append((String)((HashMap)((V0)((Object)iterator)).b).get("auto"));
                    ((StringBuilder)serializable).append("");
                    arrayList.add(((StringBuilder)serializable).toString());
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
            Object object5 = new ArrayList();
            serializable = new ArrayList();
            object4 = new a((String)object2);
            ((V0)((Object)iterator)).f(null, true, (a)object4, (List<a>)object5, (List<a>)((Object)serializable), null);
            object2 = new ArrayList();
            object4 = new ArrayList();
            object5 = ((ArrayList)object5).iterator();
            while (object5.hasNext()) {
                a a2 = (a)object5.next();
                ((HashMap)f).put(a2.i(), a2.m());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a2.e());
                stringBuilder.append("$");
                stringBuilder.append("self115");
                stringBuilder.append("_");
                stringBuilder.append((String)null);
                stringBuilder.append('+');
                stringBuilder.append(a2.i());
                stringBuilder.append('+');
                stringBuilder.append(m.A(object));
                stringBuilder.append('+');
                stringBuilder.append(a2.k());
                stringBuilder.append('+');
                stringBuilder.append(a2.n());
                stringBuilder.append('+');
                stringBuilder.append(a2.m());
                stringBuilder.append(super.b(a2.k(), (List<a>)((Object)serializable)));
                ((ArrayList)object2).add(stringBuilder.toString());
            }
            for (n2 = 0; n2 < arrayList.size(); ++n2) {
                serializable = new StringBuilder();
                iterator = ((ArrayList)object2).iterator();
                if (iterator.hasNext()) {
                    while (true) {
                        ((StringBuilder)serializable).append((CharSequence)iterator.next());
                        if (!iterator.hasNext()) break;
                        ((StringBuilder)serializable).append((CharSequence)"#");
                    }
                }
                ((ArrayList)object4).add(((StringBuilder)serializable).toString());
            }
        }
        catch (Exception exception) {
            object = BaseApi.fakeVod(arrayList, "115\u96f2\u76e4");
            return com.github.catvod.spider.merge.K.f.n((h)object);
        }
        {
            object2 = new h();
            ((h)object2).l((String)object3);
            ((h)object2).j((String)object3);
            ((h)object2).n("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            ((h)object2).m((String)object);
            object = new StringBuilder();
            object3 = ((ArrayList)object4).iterator();
            boolean bl3 = object3.hasNext();
            if (bl3) {
                while (true) {
                    ((StringBuilder)object).append((CharSequence)object3.next());
                    if (!object3.hasNext()) break;
                    ((StringBuilder)object).append((CharSequence)"$$$");
                }
            }
            ((h)object2).p(((StringBuilder)object).toString());
            object3 = new StringBuilder();
            object = arrayList.iterator();
            if (object.hasNext()) {
                while (true) {
                    ((StringBuilder)object3).append((CharSequence)object.next());
                    if (!object.hasNext()) break;
                    ((StringBuilder)object3).append((CharSequence)"$$$");
                }
            }
            ((h)object2).o(((StringBuilder)object3).toString());
            ((h)object2).g("115\u96f2\u76e4");
            object = object2;
            return com.github.catvod.spider.merge.K.f.n((h)object);
        }
    }

    private String b(String object, List<a> object2) {
        Object object3 = new ArrayList<a>();
        String string = m.z((String)object).toLowerCase();
        object = object2.iterator();
        while (object.hasNext()) {
            a a2 = (a)object.next();
            String string2 = m.z(a2.k()).toLowerCase();
            if (!string.contains(string2) && !string2.contains(string)) continue;
            ((ArrayList)object3).add(a2);
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

    public static V0 c() {
        return U0.a;
    }

    private String d(String string) {
        String string2 = string.startsWith("https") ? string : com.github.catvod.spider.merge.B.e.c("https://webapi.115.com/", string);
        Serializable serializable = new HashMap<String, List<String>>();
        HashMap hashMap = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.2.0 Chrome/100.0.4896.160 Electron/18.3.5.17-1a44cfa97d Safari/537.36 Channel/pckk_other_ch", "Referer", "https://115.com/");
        hashMap.put("Cookie", this.c.a());
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f(HashMap<String, String> var1_1, boolean var2_3, a var3_4, List<a> var4_5, List<a> var5_6, List<a> var6_7) {
        if (!var2_3) ** GOTO lbl4
        var6_7 = new ArrayList<a>();
lbl4:
        // 2 sources

        var7_8 = new StringBuilder();
        var7_8.append("listFiles >> ");
        var7_8.append(var1_1);
        SpiderDebug.log((String)var7_8.toString());
        var8_17 = new StringBuilder();
        var8_17.append("files?files?aid=1&cid=");
        var8_17.append(var3_4.l());
        var8_17.append("&o=user_ptime&asc=0&offset=0&show_dir=");
        if (var2_3) {
            var7_9 = "0";
        } else {
            var7_10 = "1";
        }
        var8_17.append((String)var7_11);
        var8_17.append("&limit=40000&code=&scid=&snap=0&natsort=0&record_open_time=1&count_folders=1&type=&source=&format=json");
        var7_12 = this.d(var8_17.toString());
        var8_17 = new StringBuilder();
        var8_17.append("listFiles >> ");
        var8_17.append(var7_12);
        SpiderDebug.log((String)var8_17.toString());
        var8_17 = new JSONObject(var7_12);
        var8_17 = var8_17.toString();
        var7_13 = new Gson();
        var7_14 = (a)var7_13.fromJson((String)var8_17, a.class);
        {
            catch (Exception var1_2) {
                var1_2.printStackTrace();
                return;
            }
            try {
                if (!var7_14.j().isEmpty()) {
                    var9_19 = var7_14.j();
                    var8_17 = new b();
                    Collections.sort(var9_19, var8_17);
                }
                ** GOTO lbl53
            }
            catch (Exception var8_18) {}
            {
                var9_19 = new StringBuilder();
                var9_19.append("listFiles error");
                var9_19.append(var8_18.getMessage());
                m.y(var9_19.toString());
lbl53:
                // 6 sources

                for (a var7_16 : var7_14.j()) {
                    if ("folder".equals(var7_16.r())) {
                        var6_7.add(var7_16);
                        continue;
                    }
                    if (var7_16.o() != null && (BaseApi.get().d.booleanValue() || com.github.catvod.spider.merge.R0.e.d(m.n(var7_16.k())))) {
                        var7_16.s(var3_4.i());
                        V0.e.put(var7_16.i(), var7_16);
                        var4_5.add(var7_16);
                        continue;
                    }
                    if (!m.t(var7_16.h())) continue;
                    var5_6.add(var7_16);
                }
                if (!var2_3) return;
                var3_4 = var6_7.iterator();
                while (var3_4.hasNext()) {
                    this.f(var1_1, var2_3, (a)var3_4.next(), var4_5, var5_6, null);
                }
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<h> e(i object) {
        CharSequence charSequence = ((i)object).c();
        String string = ((i)object).e();
        boolean bl = com.github.catvod.spider.merge.R0.e.b(((i)object).b());
        Object object2 = "0";
        Object object3 = bl ? "0" : ((i)object).b();
        Object object4 = ((i)object).a();
        Object object5 = new ArrayList<a>();
        Object object6 = new ArrayList<a>();
        object = object2;
        if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)object3)) {
            object = object3;
        }
        object3 = new Object();
        try {
            object5 = new ArrayList();
            object2 = new a((String)object);
            this.f((HashMap<String, String>)object4, false, (a)object2, (List<a>)object3, (List<a>)object5, (List<a>)object6);
        }
        catch (Exception exception) {
            block8: {
                object = object3;
                break block8;
                catch (Exception exception2) {
                    object = object5;
                }
            }
            object3 = object;
        }
        object = new ArrayList();
        object4 = ((ArrayList)object6).iterator();
        while (object4.hasNext()) {
            object2 = (a)object4.next();
            object6 = new h();
            object5 = r.d((String)charSequence, "*#");
            ((StringBuilder)object5).append(((a)object2).l());
            ((StringBuilder)object5).append("*#");
            ((StringBuilder)object5).append(((a)object2).k());
            ((h)object6).l(((StringBuilder)object5).toString());
            ((h)object6).m(((a)object2).k());
            ((h)object6).r(((a)object2).r());
            ((h)object6).p("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            ((ArrayList)object).add(object6);
        }
        object3 = object3.iterator();
        while (object3.hasNext()) {
            object5 = (a)object3.next();
            object2 = new h();
            charSequence = r.d(string, "_");
            ((StringBuilder)charSequence).append(((a)object5).l());
            ((StringBuilder)charSequence).append("*#");
            ((StringBuilder)charSequence).append(((a)object5).k());
            ((h)object2).l(((StringBuilder)charSequence).toString());
            ((h)object2).m(((a)object5).e());
            ((h)object2).r(((a)object5).r());
            ((h)object2).n(((a)object5).q());
            ((h)object2).p("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            ((ArrayList)object).add(object2);
        }
        return object;
    }

    public final void g(String object) {
        if (com.github.catvod.spider.merge.R0.e.c(this.c.a())) {
            com.github.catvod.spider.merge.B.e.d("set new Cookie:", (String)object);
            String string = object;
            if (object != null) {
                string = object;
                if (((String)object).startsWith("http")) {
                    string = com.github.catvod.spider.merge.f0.d.k((String)object).trim();
                }
            }
            if (com.github.catvod.spider.merge.R0.e.d(string)) {
                c c2 = this.c;
                object = string;
                if (string.endsWith(";")) {
                    object = string.substring(0, string.length() - 1);
                }
                c2.b((String)object);
                object = this.c;
                Objects.requireNonNull(object);
                Init.execute(new p0(object, 1));
                new HashMap(512);
                f = new HashMap<String, String>(4096);
            }
        }
    }
}

