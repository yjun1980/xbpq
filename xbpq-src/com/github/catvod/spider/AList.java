/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.AList$Job;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.M.b;
import com.github.catvod.spider.merge.M.d;
import com.github.catvod.spider.merge.M.g;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class AList
extends Spider {
    private List<b> a;
    private String b;

    static String a(AList aList, b b2, String string, String string2) {
        return aList.e(b2, string, string2, true);
    }

    private d b(String object) {
        StringBuilder stringBuilder;
        Object object2;
        try {
            object2 = ((String)object).contains("/") ? ((String)object).substring(0, ((String)object).indexOf("/")) : object;
        }
        catch (Exception exception) {
            return new d();
        }
        object = ((String)object).contains("/") ? ((String)object).substring(((String)object).indexOf("/")) : "";
        object2 = this.c((String)object2);
        if (!((String)object).startsWith(((b)object2).h())) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(((b)object2).h());
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
        }
        stringBuilder = new JSONObject();
        stringBuilder.put("path", object);
        stringBuilder.put("password", ((b)object2).c((String)object));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(((b)object2).e());
        object = ((b)object2).j() ? "/api/fs/get" : "/api/public/path";
        stringBuilder2.append((String)object);
        object = this.e((b)object2, stringBuilder2.toString(), stringBuilder.toString(), true);
        if (((b)object2).j()) {
            object2 = new JSONObject((String)object);
            object = object2.getJSONObject("data");
        } else {
            object2 = new JSONObject((String)object);
            object = object2.getJSONObject("data").getJSONArray("files").getJSONObject(0);
        }
        object2 = object.toString();
        object = new Gson();
        object = (d)object.fromJson((String)object2, d.class);
        return object;
    }

    private b c(String object) {
        List<b> list = this.a;
        object = list.get(list.indexOf(new b((String)object)));
        ((b)object).b();
        return object;
    }

    private List<d> d(String object, boolean bl) {
        Object object2;
        block12: {
            b b2;
            block11: {
                block10: {
                    object2 = ((String)object).contains("/") ? ((String)object).substring(0, ((String)object).indexOf("/")) : object;
                    object = ((String)object).contains("/") ? ((String)object).substring(((String)object).indexOf("/")) : "";
                    b2 = this.c((String)object2);
                    if (!((String)object).startsWith(b2.h())) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(b2.h());
                        ((StringBuilder)object2).append((String)object);
                        object = ((StringBuilder)object2).toString();
                    }
                    object2 = new JSONObject();
                    object2.put("path", object);
                    object2.put("password", (Object)b2.c((String)object));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.e());
                    object = b2.j() ? "/api/fs/list" : "/api/public/path";
                    stringBuilder.append((String)object);
                    object = this.e(b2, stringBuilder.toString(), object2.toString(), true);
                    if (!b2.j()) break block10;
                    object2 = new JSONObject((String)object);
                    object2 = object2.getJSONObject("data");
                    object = "content";
                    break block11;
                }
                object2 = new JSONObject((String)object);
                object2 = object2.getJSONObject("data");
                object = "files";
            }
            object2 = d.a(object2.getJSONArray((String)object).toString());
            object = object2.iterator();
            if (!bl) break block12;
            try {
                while (object.hasNext()) {
                    if (!((d)object.next()).j(b2.j())) continue;
                    object.remove();
                }
            }
            catch (Exception exception) {
                return Collections.emptyList();
            }
        }
        return object2;
    }

    private String e(b b2, String string, String string2, boolean bl) {
        String string3 = com.github.catvod.spider.merge.f0.d.f(string, string2, b2.d()).a();
        SpiderDebug.log((String)string3);
        if (bl && string3.contains("Guest user is disabled")) {
            boolean bl2;
            try {
                Object object = new JSONObject();
                object.put("username", (Object)b2.f().b());
                object.put("password", (Object)b2.f().a());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b2.e());
                stringBuilder.append("/api/auth/login");
                object = com.github.catvod.spider.merge.f0.d.f(stringBuilder.toString(), object.toString(), null).a();
                stringBuilder = new JSONObject((String)object);
                b2.m(stringBuilder.getJSONObject("data").getString("token"));
                bl2 = true;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                bl2 = false;
            }
            if (bl2) {
                return this.e(b2, string, string2, false);
            }
        }
        return string3;
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> cloneable) {
        bl = ((HashMap)cloneable).containsKey("type");
        String string = "";
        object2 = bl ? ((HashMap)cloneable).get("type") : "";
        if (((HashMap)cloneable).containsKey("order")) {
            string = ((HashMap)cloneable).get("order");
        }
        ArrayList<d> arrayList = new ArrayList<d>();
        ArrayList<d> arrayList2 = new ArrayList<d>();
        cloneable = new ArrayList();
        for (d d2 : this.d((String)object, true)) {
            if (d2.k()) {
                arrayList.add(d2);
                continue;
            }
            arrayList2.add(d2);
        }
        if (!TextUtils.isEmpty((CharSequence)object2) && !TextUtils.isEmpty((CharSequence)string)) {
            Collections.sort(arrayList, new g((String)object2, string));
            Collections.sort(arrayList2, new g((String)object2, string));
        }
        object2 = arrayList.iterator();
        while (object2.hasNext()) {
            ((ArrayList)cloneable).add(((d)object2.next()).h((String)object));
        }
        object2 = arrayList2.iterator();
        while (object2.hasNext()) {
            ((ArrayList)cloneable).add(((d)object2.next()).h((String)object));
        }
        object = new f();
        ((f)object).y((List<h>)((Object)cloneable));
        ((f)object).k(1, 1, 0, 1);
        return ((f)object).toString();
    }

    public String detailContent(List<String> object) {
        String object22 = (String)object.get(0);
        object = object22.contains("/") ? object22.substring(0, object22.indexOf("/")) : object22;
        String string = object22.substring(0, object22.lastIndexOf("/"));
        CharSequence charSequence = string.substring(string.lastIndexOf("/") + 1);
        b b2 = this.c((String)object);
        h h2 = new h();
        h2.o((String)object);
        h2.l(object22);
        h2.m((String)charSequence);
        ArrayList<String> arrayList = new ArrayList<String>();
        List<d> list = this.d(string, false);
        for (d d2 : list) {
            if (!d2.l(b2.j())) continue;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(d2.c());
            ((StringBuilder)charSequence).append("$");
            object = new StringBuilder();
            ((StringBuilder)object).append(d2.i(string));
            StringBuilder stringBuilder = new StringBuilder();
            for (d d3 : list) {
                String string2 = m.k(d3.c());
                if (!m.t(string2)) continue;
                stringBuilder.append("~~~");
                stringBuilder.append(d3.c());
                stringBuilder.append("@@@");
                stringBuilder.append(string2);
                stringBuilder.append("@@@");
                stringBuilder.append(d3.i(string));
            }
            ((StringBuilder)object).append(stringBuilder.toString());
            String string3 = ((StringBuilder)object).toString();
            object = string3;
            if (string3.contains("#")) {
                object = string3.replace("#", "***");
            }
            ((StringBuilder)charSequence).append((String)object);
            arrayList.add(((StringBuilder)charSequence).toString());
        }
        h2.p(TextUtils.join((CharSequence)"#", arrayList));
        return f.n(h2);
    }

    public String homeContent(boolean bl) {
        ArrayList<a> arrayList = new ArrayList<a>();
        LinkedHashMap<String, List<c>> linkedHashMap = new LinkedHashMap<String, List<c>>();
        for (b object2 : this.a) {
            if (object2.i().booleanValue()) continue;
            arrayList.add(new a(object2.g(), object2.g(), "1"));
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string = ((a)iterator.next()).a();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new c("type", "\u6392\u5e8f\u985e\u578b", Arrays.asList(new com.github.catvod.spider.merge.K.b("\u9810\u8a2d", ""), new com.github.catvod.spider.merge.K.b("\u540d\u7a31", "name"), new com.github.catvod.spider.merge.K.b("\u5927\u5c0f", "size"), new com.github.catvod.spider.merge.K.b("\u4fee\u6539\u6642\u9593", "date"))));
            arrayList2.add(new c("order", "\u6392\u5e8f\u65b9\u5f0f", Arrays.asList(new com.github.catvod.spider.merge.K.b("\u9810\u8a2d", ""), new com.github.catvod.spider.merge.K.b("\u2b06", "asc"), new com.github.catvod.spider.merge.K.b("\u2b07", "desc"))));
            ((AbstractMap)linkedHashMap).put(string, (List<c>)arrayList2);
        }
        return f.q(arrayList, linkedHashMap);
    }

    public void init(Context object, String string) {
        this.b = string;
        object = this.a;
        if (object == null || object.isEmpty()) {
            if (this.b.startsWith("http")) {
                this.b = com.github.catvod.spider.merge.f0.d.k(this.b);
            }
            this.a = com.github.catvod.spider.merge.M.b.a(this.b);
        }
    }

    public String playerContent(String object, String object22, List<String> object3) {
        HashMap<String, String> hashMap;
        Object object2;
        f f2;
        String[] stringArray;
        block7: {
            object = object22;
            if (((String)object22).contains("***")) {
                object = ((String)object22).replace("***", "#");
            }
            stringArray = ((String)((Object)object)).split("~~~");
            object = this.b(stringArray[0]).f();
            f2 = new f();
            f2.w((String)((Object)object));
            object2 = Uri.parse((String)((Object)object));
            hashMap = new HashMap<String, String>();
            boolean bl = object2.getHost().contains("115");
            if (!bl) break block7;
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        }
        object = hashMap;
        try {
            if (object2.getHost().contains("baidupcs.com")) {
                hashMap.put("User-Agent", "pan.baidu.com");
                object = hashMap;
            }
        }
        catch (Exception exception) {
            object = new HashMap<String, String>();
        }
        f2.g((Map<String, String>)((Object)object));
        object = new ArrayList();
        for (String string : stringArray) {
            if (!string.contains("@@@")) continue;
            Object object4 = string.split("@@@");
            object2 = object4[0];
            String string2 = object4[1];
            object4 = this.b(object4[2]).f();
            com.github.catvod.spider.merge.K.g g2 = new com.github.catvod.spider.merge.K.g();
            g2.b((String)object2);
            com.github.catvod.spider.merge.K.g g3 = g2.a(string2);
            g3.c((String)object4);
            ((ArrayList)object).add(g3);
        }
        f2.v((List<com.github.catvod.spider.merge.K.g>)((Object)object));
        return f2.toString();
    }

    public String searchContent(String object, boolean bl) {
        ArrayList<h> arrayList = new ArrayList<h>();
        ArrayList<AList$Job> arrayList2 = new ArrayList<AList$Job>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (b b2 : this.a) {
            if (!b2.l().booleanValue()) continue;
            b2.b();
            arrayList2.add(new AList$Job(this, b2, (String)object));
        }
        object = executorService.invokeAll(arrayList2, 15L, TimeUnit.SECONDS).iterator();
        while (object.hasNext()) {
            arrayList.addAll((Collection)((Future)object.next()).get());
        }
        return f.o(arrayList);
    }
}

