/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.I;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.I.z;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.N.i;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class A {
    public final Map<String, String> a;
    public i b;
    public com.github.catvod.spider.merge.J.i c = new com.github.catvod.spider.merge.J.i();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public A() {
        this.a = new ConcurrentHashMap<String, String>();
        com.github.catvod.spider.merge.f0.d.a();
        try {
            Object object = d.m(com.github.catvod.spider.merge.c.b.e("baidu_user"));
            Gson gson = new Gson();
            i i2 = (i)gson.fromJson((String)object, i.class);
            object = i2;
            if (i2 == null) {
                object = new i();
            }
            this.b = object;
            return;
        }
        catch (Exception exception) {
            m.y("\u6446\u6e21\u6388\u6743\u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u5220\u9664\u6839\u76ee\u5f55TV\u6587\u4ef6\u5939\u4e0b\u6388\u6743\u6587\u4ef6\u540e\u91cd\u8bd5");
        }
    }

    public static A a() {
        return z.a;
    }

    public static HashMap<String, String> b(String string) {
        return com.github.catvod.spider.merge.A.c.b("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;", "Url", string);
    }

    public final String c(String[] stringArray) {
        boolean bl = BaseApi.isOk("dp");
        Object object = "";
        if (bl) {
            return "";
        }
        Object object2 = j.e(new String(Base64.decode((String)stringArray[0], (int)2)));
        Object object3 = this.c.f((JsonObject)object2);
        try {
            if (!((ConcurrentHashMap)this.a).containsKey(stringArray[0])) {
                ((ConcurrentHashMap)this.a).put(stringArray[0], (String)object3.get("url"));
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
        object3 = new String[4];
        object3[2] = object2.get("shareName").getAsString();
        object3[3] = object2.get("pname").getAsString();
        object2 = stringArray[0];
        try {
            object = object2 = (String)((ConcurrentHashMap)z.a.a).get(object2);
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
        BaseApi.get().h.put(m.b((String)object), new Gson().toJson(A.b((String)object)));
        object2 = object;
        if (this.b.c != 0) {
            object2 = Server.y((String)object, this.b.a(), com.github.catvod.spider.merge.N.c.b());
        }
        if (BaseApi.get().d.booleanValue()) {
            object = new StringBuilder();
            ((StringBuilder)object).append(stringArray[2]);
            ((StringBuilder)object).append(stringArray[3]);
            object = ((StringBuilder)object).toString();
            BaseApi.get().downloadFileWithDownloadManager((String)object2, (String)object, A.b((String)object2));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("\u6b63\u5728\u4e0b\u8f7d ");
            ((StringBuilder)object2).append((String)object);
            m.y(((StringBuilder)object2).toString());
            object = Server.B();
        } else {
            object = NetPan.getIsoDownloadUrl((String)object2);
        }
        object2 = new f();
        ((f)object2).w((String)object);
        ((f)object2).j();
        ((f)object2).b(t.a.r((String[])object3));
        ((f)object2).g(A.b((String)object));
        object = new ArrayList();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object3 = stringArray[i2];
            if (!((String)object3).contains("@@@")) continue;
            Object object4 = ((String)object3).split("@@@");
            String string = object4[0];
            object3 = object4[1];
            Object object5 = new StringBuilder();
            ((StringBuilder)object5).append(Proxy.getUrl());
            ((StringBuilder)object5).append("?do=ali&type=sub&shareId=");
            ((StringBuilder)object5).append(stringArray[0]);
            ((StringBuilder)object5).append("&fileId=");
            ((StringBuilder)object5).append(object4[2]);
            object4 = ((StringBuilder)object5).toString();
            object5 = new g();
            ((g)object5).b(string);
            object3 = ((g)object5).a((String)object3);
            ((g)object3).c((String)object4);
            ((ArrayList)object).add(object3);
        }
        ((f)object2).v((List<g>)object);
        return ((f)object2).toString();
    }
}

