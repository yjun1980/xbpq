/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.thegrizzlylabs.sardineandroid.DavResource
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.V.b;
import com.github.catvod.spider.merge.V.c;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import com.thegrizzlylabs.sardineandroid.DavResource;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WebDAV
extends Spider {
    private static List<b> c;
    private List<String> a;
    private String b;

    private static b a(String string) {
        List<b> list = c;
        return list.get(list.indexOf(new b(string)));
    }

    private List<DavResource> b(b object, String string, List<String> list) {
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append(((b)object).b());
        if (!string.startsWith(((b)object).d())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((b)object).d());
            stringBuilder.append(string);
            string = stringBuilder.toString();
        }
        ((StringBuilder)object2).append(string);
        string = ((StringBuilder)object2).toString();
        object = ((b)object).e().list(string);
        object.remove(0);
        object2 = object.iterator();
        while (object2.hasNext()) {
            string = (DavResource)object2.next();
            if (!string.isDirectory() && !string.getName().contains(".")) {
                object2.remove();
            }
            if (string.isDirectory() || list.contains(m.k(string.getName()))) continue;
            object2.remove();
        }
        return object;
    }

    public static Object[] vod(Map<String, String> map) {
        String string = map.get("url");
        String string2 = string.contains("/") ? string.substring(0, string.indexOf("/")) : string;
        string = string.substring(string2.length());
        b object2 = WebDAV.a(string2);
        string2 = object2.e();
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append(object2.b());
        ((StringBuilder)serializable).append(string);
        string = ((StringBuilder)serializable).toString();
        serializable = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<String> list = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String string3 : map.keySet()) {
            if (!list.contains(string3)) continue;
            ((TreeMap)serializable).put(string3, map.get(string3));
        }
        return new Object[]{200, "application/octet-stream", string2.get(string, (Map)((Object)serializable))};
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> cloneable) {
        object2 = ((String)object).contains("/") ? ((String)object).substring(0, ((String)object).indexOf("/")) : object;
        bl = ((String)object).contains("/");
        String string = "";
        object = bl ? ((String)object).substring(((String)object).indexOf("/")) : "";
        String string2 = ((HashMap)cloneable).containsKey("order") ? ((HashMap)cloneable).get("order") : "";
        if (((HashMap)cloneable).containsKey("type")) {
            string = ((HashMap)cloneable).get("type");
        }
        ArrayList<DavResource> arrayList = new ArrayList<DavResource>();
        ArrayList<DavResource> arrayList2 = new ArrayList<DavResource>();
        cloneable = new ArrayList();
        object2 = WebDAV.a((String)object2);
        for (DavResource davResource : this.b((b)object2, (String)object, m.a)) {
            if (davResource.isDirectory()) {
                arrayList.add(davResource);
                continue;
            }
            arrayList2.add(davResource);
        }
        if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string2)) {
            com.github.catvod.spider.merge.V.c.a(string, string2, arrayList);
            com.github.catvod.spider.merge.V.c.a(string, string2, arrayList2);
        }
        object = arrayList.iterator();
        while (object.hasNext()) {
            ((ArrayList)cloneable).add(((b)object2).f((DavResource)object.next(), "https://s1.ax1x.com/2023/05/04/p9tgI81.png"));
        }
        object = arrayList2.iterator();
        while (object.hasNext()) {
            ((ArrayList)cloneable).add(((b)object2).f((DavResource)object.next(), "https://s1.ax1x.com/2023/05/04/p9tgogx.png"));
        }
        object = new f();
        ((f)object).y((List<h>)((Object)cloneable));
        ((f)object).k(1, 1, 0, 1);
        return ((f)object).toString();
    }

    public String detailContent(List<String> object) {
        Object object2;
        Object object3 = (String)object.get(0);
        object = ((String)object3).contains("/") ? ((String)object3).substring(0, ((String)object3).indexOf("/")) : object3;
        String string = ((String)object3).substring(0, ((String)object3).lastIndexOf("/"));
        if (string.contains("/")) {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(string.substring(string.indexOf("/")));
            ((StringBuilder)object3).append("/");
            object3 = ((StringBuilder)object3).toString();
        } else {
            object3 = "";
        }
        string = string.substring(string.lastIndexOf("/") + 1);
        b b2 = WebDAV.a((String)object);
        object3 = this.b(b2, (String)object3, this.a);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator iterator = object3.iterator();
        while (iterator.hasNext()) {
            object2 = (DavResource)iterator.next();
            if (!m.t(object2.getName())) continue;
            arrayList.add(object2);
        }
        com.github.catvod.spider.merge.V.c.a("name", "asc", (List<DavResource>)object3);
        object2 = new ArrayList();
        iterator = object3.iterator();
        while (iterator.hasNext()) {
            object3 = (DavResource)iterator.next();
            CharSequence charSequence = object3.getName();
            if (!m.a.contains(m.k((String)charSequence))) continue;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(object3.getName());
            ((StringBuilder)charSequence).append("$");
            ((StringBuilder)charSequence).append(b2.c());
            ((StringBuilder)charSequence).append(object3.getPath());
            StringBuilder stringBuilder = new StringBuilder();
            for (Object object4 : arrayList) {
                if (!m.z(object4.getName()).equals(m.z(object3.getName()))) continue;
                stringBuilder.append("~~~");
                stringBuilder.append(object4.getName());
                stringBuilder.append("@@@");
                stringBuilder.append(m.k(object4.getName()));
                stringBuilder.append("@@@");
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(b2.c());
                stringBuilder2.append(object4.getPath());
                stringBuilder.append(stringBuilder2.toString());
            }
            if (stringBuilder.length() > 0) {
                object3 = stringBuilder.toString();
            } else {
                Object object4;
                object4 = new StringBuilder();
                for (DavResource davResource : arrayList) {
                    ((StringBuilder)object4).append("~~~");
                    ((StringBuilder)object4).append(davResource.getName());
                    ((StringBuilder)object4).append("@@@");
                    ((StringBuilder)object4).append(m.k(davResource.getName()));
                    ((StringBuilder)object4).append("@@@");
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(b2.c());
                    stringBuilder3.append(davResource.getPath());
                    ((StringBuilder)object4).append(stringBuilder3.toString());
                }
                object3 = ((StringBuilder)object4).toString();
            }
            ((StringBuilder)charSequence).append((String)object3);
            ((ArrayList)object2).add(((StringBuilder)charSequence).toString());
        }
        object3 = new h();
        ((h)object3).l(string);
        ((h)object3).m(string);
        ((h)object3).o((String)object);
        ((h)object3).n("https://s1.ax1x.com/2023/05/04/p9tgogx.png");
        ((h)object3).p(TextUtils.join((CharSequence)"#", (Iterable)object2));
        return f.n((h)object3);
    }

    public String homeContent(boolean bl) {
        ArrayList<a> arrayList = new ArrayList<a>();
        LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>> linkedHashMap = new LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>>();
        for (b object : c) {
            arrayList.add(new a(object.c(), object.c(), "1"));
        }
        Iterator<b> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string = ((a)((Object)iterator.next())).a();
            ArrayList<com.github.catvod.spider.merge.K.c> arrayList2 = new ArrayList<com.github.catvod.spider.merge.K.c>();
            arrayList2.add(new com.github.catvod.spider.merge.K.c("type", "\u6392\u5e8f\u985e\u578b", Arrays.asList(new com.github.catvod.spider.merge.K.b("\u9810\u8a2d", ""), new com.github.catvod.spider.merge.K.b("\u540d\u7a31", "name"), new com.github.catvod.spider.merge.K.b("\u5927\u5c0f", "size"), new com.github.catvod.spider.merge.K.b("\u4fee\u6539\u6642\u9593", "date"))));
            arrayList2.add(new com.github.catvod.spider.merge.K.c("order", "\u6392\u5e8f\u65b9\u5f0f", Arrays.asList(new com.github.catvod.spider.merge.K.b("\u9810\u8a2d", ""), new com.github.catvod.spider.merge.K.b("\u2b06", "asc"), new com.github.catvod.spider.merge.K.b("\u2b07", "desc"))));
            ((AbstractMap)linkedHashMap).put(string, arrayList2);
        }
        return f.q(arrayList, linkedHashMap);
    }

    public void init(Context object, String string) {
        this.a = object = new ArrayList<String>(Arrays.asList("ass", "ssa", "srt"));
        ((ArrayList)object).addAll(m.a);
        this.b = string;
        object = c;
        if (object == null || object.isEmpty()) {
            if (this.b.startsWith("http")) {
                this.b = d.k(this.b);
            }
            c = com.github.catvod.spider.merge.V.b.a(this.b);
        }
    }

    public String playerContent(String stringArray, String object, List<String> arrayList) {
        stringArray = ((String)object).split("~~~");
        object = new f();
        arrayList = stringArray[0];
        StringBuilder object22 = new StringBuilder();
        object22.append("proxy://do=webdav&url=");
        object22.append((String)((Object)arrayList));
        ((f)object).w(object22.toString());
        arrayList = new ArrayList<g>();
        for (String string : stringArray) {
            if (!string.contains("@@@")) continue;
            Object object2 = string.split("@@@");
            String string2 = object2[0];
            String string3 = object2[1];
            object2 = e.c("proxy://do=webdav&url=", object2[2]);
            g g2 = new g();
            g2.b(string2);
            g g3 = g2.a(string3);
            g3.c((String)object2);
            arrayList.add(g3);
        }
        ((f)object).v(arrayList);
        return ((f)object).toString();
    }
}

