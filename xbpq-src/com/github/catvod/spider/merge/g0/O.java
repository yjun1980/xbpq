/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.a0;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.L.k;
import com.github.catvod.spider.\u7f51\u76d8\u96c6\u5408;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class O
implements Callable {
    public final \u7f51\u76d8\u96c6\u5408 a;
    public final k b;
    public final String c;
    public final List d;

    public /* synthetic */ O(\u7f51\u76d8\u96c6\u5408 \u7f51\u76d8\u96c6\u54082, k k2, String string, List list) {
        this.a = \u7f51\u76d8\u96c6\u54082;
        this.b = k2;
        this.c = string;
        this.d = list;
    }

    public final Object call() {
        \u7f51\u76d8\u96c6\u5408 \u7f51\u76d8\u96c6\u54082 = this.a;
        k k2 = this.b;
        String string = this.c;
        List list = this.d;
        int n2 = \u7f51\u76d8\u96c6\u5408.n;
        Objects.requireNonNull(\u7f51\u76d8\u96c6\u54082);
        \u7f51\u76d8\u96c6\u54082 = a0.c().j(string);
        if (\u7f51\u76d8\u96c6\u54082 != null) {
            for (n2 = 0; n2 < \u7f51\u76d8\u96c6\u54082.length(); ++n2) {
                JSONObject jSONObject = \u7f51\u76d8\u96c6\u54082.getJSONObject(n2);
                if (jSONObject.optInt("resType") != 2) continue;
                h h2 = new h();
                CharSequence charSequence = jSONObject.getString("fileId");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(k2.g());
                stringBuilder.append("_");
                stringBuilder.append((String)charSequence);
                stringBuilder.append("*#");
                stringBuilder.append(string);
                stringBuilder.append("*#");
                stringBuilder.append(k2.j());
                h2.l(stringBuilder.toString());
                h2.n("https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256");
                h2.m(jSONObject.getString("fileName"));
                h2.q(k2.i());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("getList VodId");
                ((StringBuilder)charSequence).append(h2.c());
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                list.add(h2);
            }
        }
        return null;
    }
}

