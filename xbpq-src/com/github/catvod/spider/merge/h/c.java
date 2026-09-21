/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  okhttp3.FormBody
 *  okhttp3.FormBody$Builder
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h.d;
import com.github.catvod.spider.merge.j.o;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

final class c {
    private final Map<String, List<String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final String d;
    private final String e;
    private Request f;
    private String g;
    private Object h;

    /*
     * WARNING - void declaration
     */
    private c(String object4, String map3, String string, Map<String, String> object2, Map<String, String> object3, Map<String, List<String>> map2) {
        Object object;
        Map<String, String> map;
        void var6_22;
        String string2;
        StringBuilder stringBuilder;
        Request.Builder builder;
        Map<String, String> map42;
        this.g = map42;
        this.e = builder;
        this.d = object4;
        this.c = stringBuilder;
        this.b = string2;
        this.a = var6_22;
        builder = new Request.Builder();
        if (((String)object4).equals(cYh.d("201515")) && stringBuilder != null) {
            void var1_7;
            this.g = n.b(new StringBuilder(), this.g, cYh.d("58"));
            for (String string3 : stringBuilder.keySet()) {
                string2 = this.g;
                stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(cYh.d("5A"));
                stringBuilder.append(this.c.get(string3));
                stringBuilder.append(cYh.d("41"));
                this.g = string2.concat(stringBuilder.toString());
            }
            map42 = this.g;
            int n2 = o.a;
            Map<String, String> map5 = map42;
            if (map42 != null) {
                Map<String, String> map6 = map42;
                if (((String)((Object)map42)).length() > 1) {
                    String string4 = ((String)((Object)map42)).substring(0, ((String)((Object)map42)).length() - 1);
                }
            }
            this.g = var1_7;
        }
        if (this.d.equals(cYh.d("371F1205"))) {
            void var1_12;
            if (!TextUtils.isEmpty((CharSequence)this.e)) {
                RequestBody requestBody = RequestBody.create((MediaType)MediaType.parse((String)cYh.d("0620313D3E390624283E39750D232E3F6C7A04382023243F136D342531775F")), (String)this.e);
            } else {
                FormBody.Builder builder2 = new FormBody.Builder();
                map42 = this.c;
                if (map42 != null) {
                    for (Map<String, String> map42 : map42.keySet()) {
                        builder2.add((String)((Object)map42), this.c.get(map42));
                    }
                }
                FormBody formBody = builder2.build();
            }
            builder.post((RequestBody)var1_12);
        }
        if ((map = this.b) != null) {
            for (String string5 : map.keySet()) {
                builder.addHeader(string5, this.b.get(string5));
            }
        }
        if ((object = this.h) != null) {
            builder.tag(object);
        }
        this.f = builder.url(this.g).build();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    c(String string, String string2, Map map) {
        this(cYh.d("371F1205"), string, string2, null, map, null);
    }

    c(String string, String string2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(string, string2, null, map, map2, map3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d a(OkHttpClient object) {
        try {
            Response response = object.newCall(this.f).execute();
            Map<String, List<String>> map = this.a;
            if (map != null) {
                map.clear();
            }
            if ((map = this.a) == null) return new d(response.code(), response.body().string());
            map.putAll(response.headers().toMultimap());
            return new d(response.code(), response.body().string());
        }
        catch (IOException iOException) {
            return new d();
        }
    }

    public final c b() {
        this.h = null;
        return this;
    }
}

