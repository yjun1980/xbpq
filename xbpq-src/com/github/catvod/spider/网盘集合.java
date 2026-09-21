/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonParser
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.I.D;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.V0;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.a0;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.I.u0;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.K.i;
import com.github.catvod.spider.merge.L.k;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.g0.N;
import com.github.catvod.spider.merge.g0.O;
import com.github.catvod.spider.merge.g0.P;
import com.github.catvod.spider.merge.g0.Q;
import com.github.catvod.spider.merge.g0.S;
import com.github.catvod.spider.merge.g0.T;
import com.google.gson.JsonParser;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

public class \u7f51\u76d8\u96c6\u5408
extends NetPan {
    public static final int n = 0;
    public List<k> m = new ArrayList<k>();

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> object3) {
        block9: {
            block10: {
                void var8_20;
                i i2;
                String string;
                block18: {
                    block12: {
                        block17: {
                            block16: {
                                String string2;
                                block15: {
                                    block14: {
                                        block13: {
                                            block11: {
                                                void var6_11;
                                                block8: {
                                                    if (Build.VERSION.SDK_INT >= 24 && this.m.stream().anyMatch(new S(object, 0))) break block10;
                                                    String[] stringArray = ((String)object).split("\\*#");
                                                    string = stringArray[0];
                                                    int n2 = stringArray.length;
                                                    string2 = "";
                                                    object2 = n2 >= 2 ? stringArray[1] : "";
                                                    if (stringArray.length >= 3) {
                                                        String string3 = stringArray[2];
                                                    } else {
                                                        String string4 = "";
                                                    }
                                                    for (k k2 : this.m) {
                                                        if (!k2.g().equals(string)) continue;
                                                        string2 = k2.j();
                                                        String string5 = k2.l();
                                                        break block8;
                                                    }
                                                    String string6 = "";
                                                }
                                                i2 = new i();
                                                i2.i(string);
                                                i2.j(string2);
                                                i2.h((String)object2);
                                                i2.g((HashMap<String, String>)object3);
                                                i2.l((String)var6_11);
                                                object2 = new StringBuilder();
                                                ((StringBuilder)object2).append("categoryContent tid>>");
                                                ((StringBuilder)object2).append((String)object);
                                                SpiderDebug.log((String)((StringBuilder)object2).toString());
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append("categoryContent vodFolderParm>>");
                                                ((StringBuilder)object).append(i2);
                                                SpiderDebug.log((String)((StringBuilder)object).toString());
                                                if (!this.isSelfQuark((String)var8_20, string)) break block11;
                                                i2.k(string);
                                                object = new f();
                                                object2 = u0.e();
                                                break block12;
                                            }
                                            if (!this.isQuarkForSharedId(string)) break block13;
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append("https://pan.quark.cn/s/");
                                            ((StringBuilder)object).append(string);
                                            ((StringBuilder)object).append("#/list/share/");
                                            i2.k(((StringBuilder)object).toString());
                                            object = new f();
                                            object2 = s0.o().C(i2);
                                            break block9;
                                        }
                                        if (!this.isGuangyaForSharedId((String)var8_20, string)) break block14;
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append("https://www.guangyapan.com/s/");
                                        ((StringBuilder)object).append(string);
                                        ((StringBuilder)object).append("#/share/");
                                        i2.k(((StringBuilder)object).toString());
                                        object = new f();
                                        object2 = X.n().w(i2);
                                        break block9;
                                    }
                                    if (!this.isSelfGuangya((String)var8_20, string)) break block15;
                                    i2.k(string);
                                    object = new f();
                                    object2 = a0.c().e(i2);
                                    break block9;
                                }
                                if (!this.is115ForSharedId((String)var8_20, string)) break block16;
                                i2.k(r.b("https://115.com/s/", string, "?password=", string2, "#"));
                                object = new f();
                                object2 = f1.c().h(i2);
                                break block9;
                            }
                            if (!this.isSelf115((String)var8_20, string)) break block17;
                            object = new StringBuilder();
                            ((StringBuilder)object).append("self115");
                            ((StringBuilder)object).append(string);
                            i2.k(((StringBuilder)object).toString());
                            object = new f();
                            object2 = V0.c().e(i2);
                            break block9;
                        }
                        if (!this.isSelfUc((String)var8_20, string)) break block18;
                        i2.k(string);
                        object = new f();
                        object2 = u0.g();
                    }
                    object2 = ((u0)object2).k(i2);
                    break block9;
                }
                if (this.isSelfBaidu((String)var8_20, string)) {
                    i2.k(string);
                    object = new f();
                    object2 = D.c().g(i2);
                    break block9;
                } else if (this.isUcForSharedId(string)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("https://drive.uc.cn/s/");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("#/list/share/");
                    i2.k(((StringBuilder)object).toString());
                    object = new f();
                    object2 = L0.s().F(i2);
                    break block9;
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("https://www.aliyundrive.com/s/");
                    ((StringBuilder)object).append(string);
                    i2.k(((StringBuilder)object).toString());
                    object = new f();
                    object2 = u.p().L(i2);
                }
                break block9;
            }
            object2 = new ArrayList();
            for (k k3 : this.m) {
                if (!k3.h().equals(object)) continue;
                h h2 = new h();
                h2.l(k3.g());
                h2.m(k3.i());
                h2.r("folder");
                ((ArrayList)object2).add(h2);
            }
            object = new f();
        }
        ((f)object).y((List<h>)object2);
        ((f)object).k(1, 1, 100, Integer.MAX_VALUE);
        return ((f)object).toString();
    }

    public String detailContent(List<String> object) {
        String[] stringArray = new StringBuilder();
        stringArray.append("\u7f51\u76d8\u96c6\u5408 detailContent ids 1:");
        stringArray.append(object);
        SpiderDebug.log((String)stringArray.toString());
        stringArray = object.get(0).split("\\*#");
        object = com.github.catvod.spider.merge.C.a.c("\u7f51\u76d8\u96c6\u5408 detailContent parts:");
        ((StringBuilder)object).append(stringArray);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object = stringArray.length > 2 ? stringArray[2] : "";
        object = new JSONObject(super.detailContent((String)object, stringArray[1], Arrays.asList(stringArray[0])));
        JSONArray jSONArray = object.getJSONArray("list");
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            jSONArray.getJSONObject(i2).put("vod_name", (Object)stringArray[1]);
        }
        object.put("list", (Object)jSONArray);
        return object.toString().replaceAll("\\\\", "");
    }

    public void get115List(k k2, String string, List<h> list, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://115cdn.com/webapi/share/search?search_value=");
        stringBuilder.append(string);
        stringBuilder.append("&share_code=");
        stringBuilder.append(k2.g());
        stringBuilder.append("&receive_code=");
        stringBuilder.append(k2.j());
        stringBuilder.append("&limit=9999");
        for (com.github.catvod.spider.merge.b0.a a2 : ((com.github.catvod.spider.merge.b0.a)com.github.catvod.spider.merge.G1.d.a(new JSONObject(com.github.catvod.spider.merge.f0.d.l(stringBuilder.toString(), f1.c().e(), null)).getJSONObject("data").toString(), com.github.catvod.spider.merge.b0.a.class)).j()) {
            if (!"folder".equals(a2.r())) continue;
            h h2 = new h();
            StringBuilder stringBuilder2 = com.github.catvod.spider.merge.C.a.c("https://115.com/s/");
            stringBuilder2.append(k2.g());
            stringBuilder2.append("?password=");
            stringBuilder2.append(k2.j());
            stringBuilder2.append("#_");
            stringBuilder2.append(a2.l());
            stringBuilder2.append("*#");
            stringBuilder2.append(string);
            h2.l(stringBuilder2.toString());
            h2.n(string2);
            h2.m(a2.k());
            h2.q(h2.c());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("getList VodId");
            stringBuilder2.append(h2.c());
            SpiderDebug.log((String)stringBuilder2.toString());
            list.add(h2);
        }
    }

    public String homeContent(boolean bl) {
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        LinkedHashMap<String, List<c>> linkedHashMap = new LinkedHashMap<String, List<c>>();
        for (k k2 : this.m) {
            if (Build.VERSION.SDK_INT >= 24 && arrayList.stream().anyMatch(new T(k2))) continue;
            Object object = com.github.catvod.spider.merge.R0.e.d(k2.h()) ? k2.h() : k2.g();
            String string = com.github.catvod.spider.merge.R0.e.d(k2.h()) ? k2.h() : k2.i();
            arrayList.add(new com.github.catvod.spider.merge.K.a((String)object, string, "1"));
            string = k2.g();
            object = new ArrayList();
            ((ArrayList)object).add(new c("type", "\u6392\u5e8f\u985e\u578b", Arrays.asList(new b("\u540d\u7a31", "name"), new b("\u4fee\u6539\u6642\u9593", "updated_at"))));
            ((ArrayList)object).add(new c("order", "\u6392\u5e8f\u65b9\u5f0f", Arrays.asList(new b("\u2b06", "ASC"), new b("\u2b07", "DESC"))));
            ((AbstractMap)linkedHashMap).put(string, (List<c>)object);
        }
        return com.github.catvod.spider.merge.K.f.q(arrayList, linkedHashMap);
    }

    @Override
    public void init(Context object, String charSequence) {
        super.init((Context)object, (String)charSequence);
        charSequence = JsonParser.parseString((String)charSequence).getAsJsonObject().get("share").getAsString();
        object = charSequence;
        if (charSequence != null) {
            object = charSequence;
            if (((String)charSequence).startsWith("http")) {
                object = com.github.catvod.spider.merge.f0.d.k((String)charSequence).trim();
            }
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("shares extend:");
        ((StringBuilder)charSequence).append((String)object);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        this.m = com.github.catvod.spider.merge.L.k.b((String)object);
    }

    public boolean is115ForSharedId(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("shareType>>");
        stringBuilder.append(string);
        SpiderDebug.log((String)stringBuilder.toString());
        boolean bl = string.contains("115") && !string2.contains("self");
        return bl;
    }

    public boolean isAliForSharedId(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("shareType>>");
        stringBuilder.append(string);
        SpiderDebug.log((String)stringBuilder.toString());
        boolean bl = string.contains("ali") && !string2.contains("self");
        return bl;
    }

    public boolean isGuangyaForSharedId(String string, String string2) {
        boolean bl = string.contains("guangya") && !string2.contains("self");
        return bl;
    }

    public boolean isQuarkForSharedId(String string) {
        boolean bl = string.length() == 12;
        return bl;
    }

    public boolean isSelf115(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("shareType>>");
        stringBuilder.append(string);
        SpiderDebug.log((String)stringBuilder.toString());
        boolean bl = string.contains("115") && string2.contains("self");
        return bl;
    }

    public boolean isSelfBaidu(String string, String string2) {
        boolean bl = string.contains("baidu") && string2.contains("self");
        return bl;
    }

    public boolean isSelfGuangya(String string, String string2) {
        boolean bl = string.contains("guangya") && string2.contains("self");
        return bl;
    }

    public boolean isSelfQuark(String string, String string2) {
        boolean bl = string.contains("quark") && string2.contains("self");
        return bl;
    }

    public boolean isSelfUc(String string, String string2) {
        boolean bl = string.contains("uc") && string2.contains("self");
        return bl;
    }

    public boolean isUcForSharedId(String string) {
        boolean bl = string.length() == 13;
        return bl;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String searchContent(String var1_1, boolean var2_4) {
        var7_5 = new CopyOnWriteArrayList<h>();
        try {
            var6_6 = new Iterator<k>();
            for (Iterator<k> var4_11 : this.m) {
                var3_9 = new StringBuilder();
                var3_9.append("\u963f\u91cc\u4e91\u641c\u7d22\u96c6\u5408 \u5f00\u59cb");
                var3_9.append(var4_11.j());
                var3_9.append(var4_11.f());
                SpiderDebug.log((String)var3_9.toString());
                if (!var4_11.f()) continue;
                if (this.isQuarkForSharedId(var4_11.g()) || this.isUcForSharedId(var4_11.g())) {
                    if (!var4_11.i().contains((CharSequence)var1_1)) continue;
                    var8_12 = new h();
                    var8_12.l(var4_11.g());
                    var3_9 = this.isQuarkForSharedId(var4_11.g()) != false ? "https://pan.quark.cn/s/" : "https://drive.uc.cn/s/";
                    var8_12.n((String)var3_9);
                    var8_12.m(var4_11.i());
                    var8_12.q(var4_11.i());
                    var8_12.r("folder");
                    var3_9 = new StringBuilder();
                    var3_9.append("getList VodId");
                    var3_9.append(var8_12.c());
                    SpiderDebug.log((String)var3_9.toString());
                    var7_5.add((h)var8_12);
                }
                if (this.isAliForSharedId(var4_11.l(), var4_11.g())) {
                    var3_9 = new Q(this, (k)var4_11, (String)var1_1, var7_5);
                    var6_6.add((k)var3_9);
                }
                if (this.is115ForSharedId(var4_11.l(), var4_11.g())) {
                    var3_9 = new N(this, (k)var4_11, (String)var1_1, var7_5);
                    var6_6.add((k)var3_9);
                }
                if (this.isGuangyaForSharedId(var4_11.l(), var4_11.g())) {
                    var3_9 = new P(this, (k)var4_11, (String)var1_1, var7_5);
                    var6_6.add((k)var3_9);
                }
                if (!this.isSelfGuangya(var4_11.l(), var4_11.g())) continue;
                var3_9 = new O(this, (k)var4_11, (String)var1_1, var7_5);
                var6_6.add((k)var3_9);
            }
            var4_11 = null;
            var5_7 = null;
            var3_9 = null;
        }
        catch (Exception var1_3) {
            s.b("\u7f51\u76d8\u96c6\u5408 error", var1_3);
            return com.github.catvod.spider.merge.K.f.o(var7_5);
        }
        try {
            try {
                var1_1 = Executors.newFixedThreadPool(5);
                var3_9 = var1_1;
                var4_11 = var1_1;
                var5_7 = var1_1;
                var8_12 = var1_1.invokeAll(var6_6).iterator();
                while (true) {
                    var3_9 = var1_1;
                    var4_11 = var1_1;
                    var5_7 = var1_1;
                    var6_6 = var1_1;
                    if (var8_12.hasNext()) {
                        var3_9 = var1_1;
                        var4_11 = var1_1;
                        var5_7 = var1_1;
                        ((Future)var8_12.next()).get();
                        continue;
                    }
                    ** GOTO lbl-1000
                    break;
                }
            }
            catch (ExecutionException var5_8) {
                var1_1 = var4_11;
            }
            catch (InterruptedException var3_10) {
                var1_1 = var5_7;
                var5_7 = var3_10;
            }
        }
        catch (Throwable var1_2) {
            ** GOTO lbl91
        }
        var3_9 = var1_1;
        var5_7.printStackTrace();
        var6_6 = var1_1;
lbl-1000:
        // 2 sources

        {
            var6_6.shutdown();
            SpiderDebug.log((String)"\u7f51\u76d8\u96c6\u5408 \u7ed3\u675f");
            return com.github.catvod.spider.merge.K.f.o(var7_5);
lbl91:
            // 1 sources

            var3_9.shutdown();
            throw var1_2;
        }
    }
}

