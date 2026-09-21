/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.L.k;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.\u7f51\u76d8\u96c6\u5408;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class P
implements Callable {
    public final \u7f51\u76d8\u96c6\u5408 a;
    public final k b;
    public final String c;
    public final List d;

    public /* synthetic */ P(\u7f51\u76d8\u96c6\u5408 \u7f51\u76d8\u96c6\u54082, k k2, String string, List list) {
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
        JSONArray jSONArray = X.n().E(k2.g(), k2.j(), string);
        if (jSONArray != null) {
            for (n2 = 0; n2 < jSONArray.length(); ++n2) {
                JSONObject jSONObject = jSONArray.getJSONObject(n2);
                if (jSONObject.optInt("resType") != 2) continue;
                h h2 = new h();
                String string2 = jSONObject.getString("fileId");
                object = com.github.catvod.spider.merge.C.a.c("https://www.guangyapan.com/s/");
                ((StringBuilder)object).append(k2.g());
                CharSequence charSequence = ((StringBuilder)object).toString();
                object = charSequence;
                if (e.d(k2.j())) {
                    object = r.d((String)charSequence, "?code=");
                    ((StringBuilder)object).append(k2.j());
                    object = ((StringBuilder)object).toString();
                }
                object = s.a((String)object, "#/share/", string2);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("*#");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("*#");
                ((StringBuilder)charSequence).append(k2.j());
                h2.l(((StringBuilder)charSequence).toString());
                h2.n("https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256");
                h2.m(jSONObject.getString("fileName"));
                h2.q(k2.i());
                object = new StringBuilder();
                ((StringBuilder)object).append("getList VodId");
                ((StringBuilder)object).append(h2.c());
                SpiderDebug.log((String)((StringBuilder)object).toString());
                list.add(h2);
            }
        }
        return null;
    }
}

