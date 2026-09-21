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
package com.github.catvod.spider.merge.f0;

import android.text.TextUtils;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.i0.m;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

final class h {
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
    private h(String object4, String string, String map3, Map<String, String> object2, Map<String, String> object3, Map<String, List<String>> map2) {
        Object object;
        Map<String, String> map;
        void var6_25;
        String string2;
        StringBuilder stringBuilder;
        void var3_14;
        Request.Builder builder;
        this.g = builder;
        this.e = var3_14;
        this.d = object4;
        this.c = stringBuilder;
        this.b = string2;
        this.a = var6_25;
        builder = new Request.Builder();
        if (((String)object4).equals("GET") && stringBuilder != null) {
            this.g = r.c(new StringBuilder(), this.g, "?");
            for (String string3 : stringBuilder.keySet()) {
                string2 = this.g;
                stringBuilder = r.d(string3, "=");
                stringBuilder.append(this.c.get(string3));
                stringBuilder.append("&");
                this.g = string2.concat(stringBuilder.toString());
            }
            this.g = m.D(this.g);
        }
        if (this.d.equals("POST")) {
            void var1_7;
            if (!TextUtils.isEmpty((CharSequence)this.e)) {
                RequestBody requestBody = RequestBody.create((MediaType)MediaType.parse((String)"application/json; charset=utf-8"), (String)this.e);
            } else {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map4 = this.c;
                if (map4 != null) {
                    for (String string4 : map4.keySet()) {
                        builder2.add(string4, this.c.get(string4));
                    }
                }
                FormBody formBody = builder2.build();
            }
            builder.post((RequestBody)var1_7);
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
    h(String string, String string2, Map map) {
        this("POST", string, string2, null, map, null);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    h(String string, String string2, Map map, Map map2) {
        this("POST", string, string2, null, map, map2);
    }

    h(String string, String string2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(string, string2, null, map, map2, map3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final i a(OkHttpClient object) {
        try {
            Response response = object.newCall(this.f).execute();
            Object object2 = this.a;
            if (object2 != null) {
                object2.clear();
            }
            if ((object2 = this.a) != null) {
                object2.putAll(response.headers().toMultimap());
            }
            int n2 = response.code();
            object2 = response.body().string();
            response.headers().toMultimap();
            return new i(n2, (String)object2);
        }
        catch (IOException iOException) {
            return new i();
        }
    }

    public final h b() {
        this.h = null;
        return this;
    }
}

