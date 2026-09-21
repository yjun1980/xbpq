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
package com.github.catvod.spider.merge.lq;

import android.text.TextUtils;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.lq.d;
import com.github.catvod.spider.merge.nz.o;
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
        void var6_31;
        StringBuilder stringBuilder;
        String string2;
        Request.Builder builder;
        void var2_18;
        this.g = var2_18;
        this.e = builder;
        this.d = object4;
        this.c = string2;
        this.b = stringBuilder;
        this.a = var6_31;
        builder = new Request.Builder();
        if (((String)object4).equals("GET") && string2 != null) {
            void var1_7;
            this.g = n.b(new StringBuilder(), this.g, "?");
            for (String string3 : string2.keySet()) {
                string2 = this.g;
                stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append("=");
                stringBuilder.append(this.c.get(string3));
                stringBuilder.append("&");
                this.g = string2.concat(stringBuilder.toString());
            }
            String string4 = this.g;
            int n2 = o.a;
            String string5 = string4;
            if (string4 != null) {
                String string6 = string4;
                if (string4.length() > 1) {
                    String string7 = string4.substring(0, string4.length() - 1);
                }
            }
            this.g = var1_7;
        }
        if (this.d.equals("POST")) {
            void var1_12;
            if (!TextUtils.isEmpty((CharSequence)this.e)) {
                RequestBody requestBody = RequestBody.create((MediaType)MediaType.parse((String)"application/json; charset=utf-8"), (String)this.e);
            } else {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map4 = this.c;
                if (map4 != null) {
                    for (String string8 : map4.keySet()) {
                        builder2.add(string8, this.c.get(string8));
                    }
                }
                FormBody formBody = builder2.build();
            }
            builder.post((RequestBody)var1_12);
        }
        if ((map = this.b) != null) {
            for (String string9 : map.keySet()) {
                builder.addHeader(string9, this.b.get(string9));
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
        this("POST", string, string2, null, map, null);
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

