/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.L.k;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.\u7f51\u76d8\u96c6\u5408;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import org.json.JSONObject;

public final class Q
implements Callable {
    public final \u7f51\u76d8\u96c6\u5408 a;
    public final k b;
    public final String c;
    public final List d;

    public /* synthetic */ Q(\u7f51\u76d8\u96c6\u5408 \u7f51\u76d8\u96c6\u54082, k k2, String string, List list) {
        this.a = \u7f51\u76d8\u96c6\u54082;
        this.b = k2;
        this.c = string;
        this.d = list;
    }

    public final Object call() {
        Object object = this.a;
        k k2 = this.b;
        String string = this.c;
        List list = this.d;
        int n2 = \u7f51\u76d8\u96c6\u5408.n;
        Objects.requireNonNull(object);
        object = new StringBuilder();
        ((StringBuilder)object).append("https://www.aliyundrive.com/s/");
        ((StringBuilder)object).append(k2.g());
        object = ((StringBuilder)object).toString();
        Serializable serializable = com.github.catvod.spider.merge.C.a.c("getList parm");
        ((StringBuilder)serializable).append(k2.i());
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append((String)object);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        Object object2 = new HashMap<String, String>();
        Object object3 = NetPan.a.matcher((CharSequence)object);
        if (((Matcher)object3).find()) {
            ((HashMap)object2).put("share_id", ((Matcher)object3).group(2));
        }
        ((HashMap)object2).put("keyword", string);
        serializable = com.github.catvod.spider.merge.f0.d.b();
        if (!k2.a(((Matcher)object3).group(2))) {
            object3 = k.n(u.p().G(((Matcher)object3).group(2), k2.j()));
            k2.q();
            k2.p(((k)object3).k());
        }
        if (!k2.k().isEmpty()) {
            ((HashMap)serializable).put("x-share-token", k2.k());
            object2 = com.github.catvod.spider.merge.f0.d.i("https://api.aliyundrive.com/recommend/v1/shareLink/search", new JSONObject(object2).toString(), (Map<String, String>)((Object)serializable)).a();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("getList res");
            ((StringBuilder)serializable).append((String)object2);
            SpiderDebug.log((String)((StringBuilder)serializable).toString());
            if (((String)object2).contains("file_id")) {
                serializable = new JSONObject((String)object2).getJSONArray("items");
                for (n2 = 0; n2 < serializable.length(); ++n2) {
                    object3 = serializable.getJSONObject(n2);
                    if (object3.getString("type").equals("file")) continue;
                    object2 = new h();
                    String string2 = object3.getString("file_id");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object);
                    stringBuilder.append("/folder/");
                    stringBuilder.append(string2);
                    stringBuilder.append("*#");
                    stringBuilder.append(string);
                    stringBuilder.append("*#");
                    stringBuilder.append(k2.j());
                    ((h)object2).l(stringBuilder.toString());
                    ((h)object2).n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png");
                    ((h)object2).m(object3.getString("name"));
                    ((h)object2).q(k2.i());
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("getList VodId");
                    ((StringBuilder)object3).append(((h)object2).c());
                    SpiderDebug.log((String)((StringBuilder)object3).toString());
                    list.add(object2);
                }
            }
        }
        return null;
    }
}

