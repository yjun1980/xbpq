/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import com.github.catvod.spider.Douban;
import com.github.catvod.spider.merge.R0.e;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

class Douban$5
implements Callable<Void> {
    final JSONObject a;
    final Douban b;

    Douban$5(Douban douban, JSONObject jSONObject) {
        this.b = douban;
        this.a = jSONObject;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Void call() {
        Douban douban = this.b;
        JSONObject jSONObject = Douban.d(douban, Douban.a(douban, this.a));
        if (jSONObject == null) return null;
        Douban douban2 = this.b;
        JSONObject jSONObject2 = this.a;
        Objects.requireNonNull(douban2);
        try {
            void var1_7;
            String string;
            JSONArray jSONArray = jSONObject.optJSONArray("pubdates");
            String string2 = string = "";
            if (jSONArray != null) {
                String string3 = string;
                if (jSONArray.length() > 0) {
                    Object object = jSONArray.opt(0);
                    String string4 = string;
                    if (object != null) {
                        String string5 = String.valueOf(object);
                    }
                }
            }
            if (e.d(string = jSONObject.optString("pubdate"))) {
                jSONObject2.put("pubdate", (Object)string);
            } else if (e.d((CharSequence)var1_7)) {
                jSONObject2.put("pubdate", (Object)var1_7);
            }
            if (e.d(jSONObject.optString("release_date"))) {
                jSONObject2.put("release_date", (Object)jSONObject.optString("release_date"));
            }
            if (!jSONObject2.has("year") && e.d(jSONObject.optString("year"))) {
                jSONObject2.put("year", (Object)jSONObject.optString("year"));
            }
            if (e.d(jSONObject.optString("episodes_info"))) {
                jSONObject2.put("episodes_info", (Object)jSONObject.optString("episodes_info"));
            }
            if (e.d(jSONObject.optString("episodes_count"))) {
                jSONObject2.put("episodes_count", (Object)jSONObject.optString("episodes_count"));
            }
            if (!e.d(jSONObject.optString("current_episode"))) return null;
            jSONObject2.put("current_episode", (Object)jSONObject.optString("current_episode"));
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

