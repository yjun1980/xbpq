/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  okhttp3.FormBody$Builder
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.github.catvod.spider.merge.ZP;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

class H {
    private Object N;
    private final String OL;
    private final Map<String, String> S;
    private final Map<String, String> T4;
    private final String b;
    private Request l;
    private final Map<String, List<String>> l8;
    private String tT;

    private H(String string, String string2, String string3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this.tT = string2;
        this.OL = string3;
        this.b = string;
        this.T4 = map;
        this.S = map2;
        this.l8 = map3;
        this.S();
    }

    H(String string, String string2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(string, string2, null, map, map2, map3);
    }

    private void S() {
        Object object;
        Map<String, String> object2;
        Request.Builder builder = new Request.Builder();
        if (this.b.equals("GET") && this.T4 != null) {
            this.b();
        }
        if (this.b.equals("POST")) {
            builder.post(this.T4());
        }
        if ((object2 = this.S) != null) {
            for (String string : object2.keySet()) {
                builder.addHeader(string, this.S.get(string));
            }
        }
        if ((object = this.N) != null) {
            builder.tag(object);
        }
        this.l = builder.url(this.tT).build();
    }

    private RequestBody T4() {
        if (!TextUtils.isEmpty((CharSequence)this.OL)) {
            return RequestBody.create((MediaType)MediaType.parse((String)"application/json; charset=utf-8"), (String)this.OL);
        }
        FormBody.Builder builder = new FormBody.Builder(ZP.b);
        Map<String, String> map2 = this.T4;
        if (map2 != null) {
            for (String string : map2.keySet()) {
                builder.add(string, this.T4.get(string));
            }
        }
        return builder.build();
    }

    private void b() {
        Object object = new StringBuilder();
        ((StringBuilder)object).append(this.tT);
        ((StringBuilder)object).append("?");
        this.tT = ((StringBuilder)object).toString();
        for (String string : this.T4.keySet()) {
            String string2 = this.tT;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("=");
            stringBuilder.append(this.T4.get(string));
            stringBuilder.append("&");
            this.tT = string2.concat(stringBuilder.toString());
        }
        object = this.tT;
        this.tT = ((String)object).substring(0, ((String)object).length() - 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String l8(OkHttpClient object) {
        try {
            Response response = object.newCall(this.l).execute();
            Map<String, List<String>> map = this.l8;
            if (map != null) {
                map.clear();
            }
            if ((map = this.l8) == null) return response.body().string();
            map.putAll(response.headers().toMultimap());
            return response.body().string();
        }
        catch (IOException iOException) {
            return "";
        }
    }
}

