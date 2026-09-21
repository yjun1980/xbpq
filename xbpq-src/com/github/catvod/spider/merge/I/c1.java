/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.a0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.a0.a;
import com.github.catvod.spider.merge.a0.b;
import com.github.catvod.spider.merge.a0.e;
import com.github.catvod.spider.merge.a0.f;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.y.z;
import com.github.catvod.utils.server.Server;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class c1 {
    public String a;

    c1() {
    }

    public static c1 a() {
        return a0.a;
    }

    private List<b> b(JSONObject object) {
        Object object2;
        ArrayList<b> arrayList = new ArrayList<b>();
        String string = object.getString("shareId");
        Object object3 = object.getString("fileId");
        String string2 = object.getString("accessCode");
        if (!object.getBoolean("isFolder")) {
            object2 = new b();
            ((b)object2).a = object3;
            ((b)object2).b = object.getString("fileName");
            ((b)object2).e = object.getLong("fileSize");
            arrayList.add((b)object2);
        }
        object = com.github.catvod.spider.merge.R0.e.b(string2) ? "3" : "1";
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("listShareDir.action?pageNum=1&pageSize=9999&fileId=");
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append("&isFolder=true&shareId=");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("&shareMode=");
        object = (e)d.a(this.c(z.b((StringBuilder)object2, (String)object, "&iconOption=5&orderBy=lastOpTime&descending=true&accessCode=", string2)), e.class);
        object3 = new StringBuilder();
        ((StringBuilder)object3).append("shareMediaEntity:");
        ((StringBuilder)object3).append(object);
        SpiderDebug.log((String)((StringBuilder)object3).toString());
        object3 = object.b.c;
        if (object3 != null) {
            Collections.sort(object3, new f());
            arrayList.addAll(object.b.c);
        }
        object3 = new StringBuilder();
        ((StringBuilder)object3).append("shareMediaEntity:");
        ((StringBuilder)object3).append(object);
        SpiderDebug.log((String)((StringBuilder)object3).toString());
        this.e(string, string2, arrayList, (e)object);
        return arrayList;
    }

    private String c(String string) {
        if (!string.startsWith("https")) {
            string = com.github.catvod.spider.merge.B.e.c("https://cloud.189.cn/api/open/share/", string);
        }
        string = com.github.catvod.spider.merge.f0.d.l(string, c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "accept", "application/json;charset=UTF-8"), null);
        com.github.catvod.spider.merge.B.e.d("getString:", string);
        return string;
    }

    private void e(String string, String string2, List<b> list, e list2) {
        list2 = ((e)((Object)list2)).b.b;
        if (list2 != null) {
            for (a a2 : list2) {
                list2 = com.github.catvod.spider.merge.R0.e.b(string2) ? "3" : "1";
                StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("listShareDir.action?pageNum=1&pageSize=9999&fileId=");
                O0.a(stringBuilder, a2.a, "&isFolder=true&shareId=", string, "&shareMode=");
                e object = (e)d.a(this.c(z.b(stringBuilder, (String)((Object)list2), "&iconOption=5&orderBy=lastOpTime&descending=true&accessCode=", string2)), e.class);
                list2 = object.b.c;
                if (list2 != null) {
                    Collections.sort(list2, new f());
                    list.addAll(object.b.c);
                }
                this.e(string, string2, list, object);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h d(String charSequence, String object) {
        Object object2;
        Object object32;
        Iterator iterator;
        ArrayList<String> arrayList;
        h h2;
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("\u5929\u610f\u539f\u756b");
        if (NetPan.containPuHua()) {
            arrayList2.add("\u5929\u610f\u666e\u756b");
        }
        try {
            h2 = new h();
            arrayList = new ArrayList<String>();
            ((StringBuilder)((Object)arrayList)).append("getShareInfoByCodeV2.action?shareCode=");
            ((StringBuilder)((Object)arrayList)).append((String)object);
            arrayList = this.c(((StringBuilder)((Object)arrayList)).toString());
            object = new JSONObject((String)((Object)arrayList));
            arrayList = this.b((JSONObject)object);
            SpiderDebug.log((String)"getCoLsts(shareId)");
            iterator = new ArrayList();
            for (Object object32 : (ArrayList)arrayList) {
                if (!com.github.catvod.spider.merge.R0.e.d(m.n(((b)object32).a()))) continue;
                ((ArrayList)((Object)iterator)).add(object32);
            }
            SpiderDebug.log((String)"Comparator.comparing");
            object32 = new Object();
            arrayList = new ArrayList<String>();
            int n2 = 0;
            int n3 = 0;
            while (true) {
                int n4 = ((ArrayList)((Object)iterator)).size();
                if (n3 < n4) {
                    object2 = (b)((ArrayList)((Object)iterator)).get(n3);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(((b)object2).b());
                    stringBuilder.append("$");
                    stringBuilder.append(object.getString("shareId"));
                    stringBuilder.append("+");
                    stringBuilder.append(((b)object2).a);
                    stringBuilder.append("+");
                    stringBuilder.append(m.A(object.getString("fileName")));
                    stringBuilder.append("+");
                    stringBuilder.append(((b)object2).a());
                    stringBuilder.append("+");
                    stringBuilder.append(((b)object2).i);
                    ((ArrayList)object32).add(stringBuilder.toString());
                    ++n3;
                    continue;
                }
                break;
            }
        }
        catch (Exception exception) {
            return BaseApi.fakeVod(arrayList2, "\u5929\u610f\u96f2\u76e4");
        }
        {
            for (int i2 = n2; i2 < arrayList2.size(); ++i2) {
                object2 = new StringBuilder();
                iterator = ((ArrayList)object32).iterator();
                if (iterator.hasNext()) {
                    while (true) {
                        ((StringBuilder)object2).append((CharSequence)iterator.next());
                        if (!iterator.hasNext()) break;
                        ((StringBuilder)object2).append((CharSequence)"#");
                    }
                }
                arrayList.add(((StringBuilder)object2).toString());
            }
        }
        {
            h2.l((String)charSequence);
            h2.j((String)charSequence);
            h2.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a8/fa/f0/a8faf032-0fa4-d9c5-ac70-920d9c84dff1/AppIcon-0-0-1x_U007emarketing-0-7-0-0-sRGB-85-220.png/350x350.png");
            h2.m(m.A(object.getString("fileName")));
            charSequence = new StringBuilder();
            object = arrayList.iterator();
            boolean bl = object.hasNext();
            if (bl) {
                while (true) {
                    ((StringBuilder)charSequence).append((CharSequence)object.next());
                    if (!object.hasNext()) break;
                    ((StringBuilder)charSequence).append((CharSequence)"$$$");
                }
            }
            h2.p(((StringBuilder)charSequence).toString());
            charSequence = new StringBuilder();
            object = arrayList2.iterator();
            if (object.hasNext()) {
                while (true) {
                    ((StringBuilder)charSequence).append((CharSequence)object.next());
                    if (!object.hasNext()) break;
                    ((StringBuilder)charSequence).append((CharSequence)"$$$");
                }
            }
            h2.o(((StringBuilder)charSequence).toString());
            h2.g("\u5929\u610f");
            return h2;
        }
    }

    public final String f(String[] stringArray) {
        Object object = stringArray[0];
        String string = stringArray[1];
        Object object2 = URLEncoder.encode(a0.a.a.split("\\|")[0]);
        Object object3 = URLEncoder.encode(a0.a.a.split("\\|")[1]);
        int n2 = Server.l;
        object3 = com.github.catvod.spider.merge.f0.d.k(String.format(r.c(new StringBuilder(), t.a.c, "/api/yun189GetFileInfo?do=189&type=video&cate=%s&shareId=%s&fileId=%s&userName=%s&pwd=%s"), "open", object, string, object2, object3));
        if (BaseApi.get().d.booleanValue()) {
            object = new StringBuilder();
            ((StringBuilder)object).append(stringArray[2]);
            ((StringBuilder)object).append(stringArray[3]);
            object = ((StringBuilder)object).toString();
            BaseApi.get().downloadFileWithDownloadManager((String)object3, (String)object, c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "accept", "application/json;charset=UTF-8"));
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("\u6b63\u5728\u4e0b\u8f7d ");
            ((StringBuilder)object3).append((String)object);
            m.y(((StringBuilder)object3).toString());
            object = Server.B();
        } else {
            object = NetPan.getIsoDownloadUrl((String)object3);
        }
        object3 = new com.github.catvod.spider.merge.K.f();
        ((com.github.catvod.spider.merge.K.f)object3).w((String)object);
        ((com.github.catvod.spider.merge.K.f)object3).j();
        ((com.github.catvod.spider.merge.K.f)object3).b(t.a.r(stringArray));
        object = new ArrayList();
        int n3 = stringArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            object2 = stringArray[n2];
            if (!((String)object2).contains("@@@")) continue;
            Object object4 = ((String)object2).split("@@@");
            object2 = object4[0];
            string = object4[1];
            CharSequence charSequence = new StringBuilder();
            charSequence.append(Proxy.getUrl());
            charSequence.append("?do=ali&type=sub&shareId=");
            charSequence.append(stringArray[0]);
            charSequence.append("&fileId=");
            charSequence.append(object4[2]);
            charSequence = charSequence.toString();
            object4 = new g();
            ((g)object4).b((String)object2);
            object2 = ((g)object4).a(string);
            ((g)object2).c((String)charSequence);
            ((ArrayList)object).add(object2);
        }
        ((com.github.catvod.spider.merge.K.f)object3).v((List<g>)object);
        return ((com.github.catvod.spider.merge.K.f)object3).toString();
    }
}

